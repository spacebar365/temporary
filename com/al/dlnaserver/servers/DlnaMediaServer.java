package com.al.dlnaserver.servers;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.Notification$Action$Builder;
import android.app.Notification$Builder;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap$CompressFormat;
import android.graphics.Bitmap$Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import android.graphics.Point;
import android.graphics.drawable.Icon;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager$MulticastLock;
import android.net.wifi.WifiManager$WifiLock;
import android.os.Build;
import android.os.Build$VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.PowerManager$WakeLock;
import android.provider.DocumentsContract;
import android.provider.MediaStore$Audio$Media;
import android.provider.MediaStore$Images$Media;
import android.provider.MediaStore$Video$Media;
import android.util.Log;
import com.al.dlnaserver.App;
import com.al.dlnaserver.MainActivity;
import com.al.dlnaserver.R$drawable;
import com.al.dlnaserver.R$string;
import com.al.dlnaserver.a.a$a;
import com.al.dlnaserver.a.b$a;
import com.al.dlnaserver.b.bm;
import com.al.dlnaserver.receivers.NotificationReceiver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class DlnaMediaServer extends Service {
    private PowerManager$WakeLock A;
    private WifiManager$WifiLock B;
    private WifiManager$MulticastLock C;
    private DlnaMediaServer$a D;
    private MulticastSocket E;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private volatile j q;
    private volatile Notification$Builder r;
    private volatile com.al.dlnaserver.customs.k s;
    private volatile Handler t;
    private BroadcastReceiver u;
    private ArrayList<String> v;
    private String w;
    private int x;
    private volatile Thread z;
    private volatile Map<String, File> o = new HashMap();
    private volatile org.cybergarage.d.e.a.a.g p = null;
    private List<com.al.dlnaserver.customs.i> y = Collections.synchronizedList(new ArrayList());

    static /* synthetic */ org.cybergarage.d.e.a.a.g g(DlnaMediaServer dlnaMediaServer) {
        return dlnaMediaServer.p;
    }

    static /* synthetic */ void h(DlnaMediaServer dlnaMediaServer) {
        dlnaMediaServer.p = null;
    }

    static /* synthetic */ PowerManager$WakeLock a(DlnaMediaServer dlnaMediaServer) {
        return dlnaMediaServer.A;
    }

    @Override // android.app.Service
    @SuppressLint({"InlinedApi"})
    public void onCreate() {
        Notification notification;
        super.onCreate();
        if (Build$VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("com.al.dlnaserver.N1", "DLNAServer start", 2);
            notificationChannel.setShowBadge(true);
            notificationChannel.enableVibration(false);
            notificationChannel.enableLights(false);
            notificationChannel.setSound(null, null);
            notificationChannel.setLockscreenVisibility(1);
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(notificationChannel);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(String.valueOf(getPackageName()) + ".mediaUpdated");
        this.u = new a(this);
        if (com.al.dlnaserver.b.l.b(this)) {
            b(true);
        }
        c(true);
        a(true);
        registerReceiver(this.u, intentFilter);
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.setFlags(603979776);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 0);
        Intent intent2 = new Intent(this, (Class<?>) NotificationReceiver.class);
        intent2.setAction("com.al.dlnaserver.stop");
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 123, intent2, 0);
        if (Build$VERSION.SDK_INT >= 26) {
            this.r = new Notification$Builder(this, "com.al.dlnaserver.N1");
            this.r.setChannelId("com.al.dlnaserver.N1");
        } else {
            this.r = new Notification$Builder(this);
        }
        if (Build$VERSION.SDK_INT >= 23) {
            this.r.addAction(new Notification$Action$Builder(Icon.createWithResource(this, R$drawable.ic_close), getString(R$string.action_stop), broadcast).build());
        } else if (Build$VERSION.SDK_INT >= 16) {
            this.r.addAction(R$drawable.ic_close, getString(R$string.action_stop), broadcast);
        }
        this.r.setSmallIcon(R$drawable.ic_notify).setContentTitle(getString(R$string.app_name)).setContentText(getString(R$string.notify_msg_starting)).setContentIntent(activity).setAutoCancel(false).setOngoing(true);
        if (Build$VERSION.SDK_INT >= 16) {
            notification = this.r.build();
        } else {
            notification = this.r.getNotification();
        }
        startForeground(2, notification);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (App.a || App.b) {
            Log.i("DlnaMediaServer", "Detected another instance, stoping this");
            stopSelf();
        }
        App.b = true;
        this.n = getString(R$string.dlna_title_artist);
        this.a = getString(R$string.dlna_title_audios);
        this.b = getString(R$string.dlna_title_videos);
        this.c = getString(R$string.dlna_title_images);
        this.d = getString(R$string.dlna_title_files);
        this.e = getString(R$string.dlna_title_smb);
        this.f = getString(R$string.dlna_title_ftp);
        this.g = getString(R$string.dlna_title_playlists);
        this.h = getString(R$string.dlna_title_all_audios);
        this.i = getString(R$string.dlna_title_all_videos);
        this.j = getString(R$string.dlna_title_all_images);
        this.k = getString(R$string.dlna_title_all_files);
        this.l = getString(R$string.dlna_title_recently_added);
        this.m = getString(R$string.dlna_title_folders);
        if (intent != null) {
            this.v = intent.getStringArrayListExtra("pathsList");
            Log.i("DlnaMediaServer", "Service is starting...");
        } else {
            this.v = com.al.dlnaserver.b.n.c(this, "pathsList");
            Log.i("DlnaMediaServer", "Service was restarted by system...");
        }
        this.w = com.al.dlnaserver.b.n.b(this, "ip_white_list");
        String strB = com.al.dlnaserver.b.n.b(this, "custom_fileserver_port");
        if (!strB.isEmpty()) {
            try {
                int i3 = Integer.parseInt(strB);
                App.l = i3;
                if (i3 <= 0 || App.l > 65535) {
                    App.l = 18192;
                    com.al.dlnaserver.b.n.a(this, "custom_fileserver_port", "");
                    Log.e("DlnaMediaServer", "Custom fileserver port out of range 1..65535");
                }
            } catch (Exception e) {
                App.l = 18192;
                com.al.dlnaserver.b.n.a(this, "custom_fileserver_port", "");
                Log.e("DlnaMediaServer", "Setting custom fileserver port", e);
            }
        } else {
            App.l = 18192;
        }
        String strB2 = com.al.dlnaserver.b.n.b(this, "thumbs_quality");
        if ("XLarge".equals(strB2)) {
            this.x = 1024;
        } else if ("Large".equals(strB2)) {
            this.x = 512;
        } else if ("Normal".equals(strB2)) {
            this.x = 256;
        } else {
            this.x = 128;
        }
        this.t = new Handler();
        bm.a(this, true);
        new b(this, "DlnaMediaServer.DLNA-Init-Start").start();
        new c(this, "DlnaMediaServer.HTTPD-Start").start();
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        Log.i("DlnaMediaServer", "Service stoped");
        bm.a(this, false);
        b();
        if (this.q != null) {
            this.q.d();
        }
        this.q = null;
        stopForeground(true);
        if (this.u != null) {
            unregisterReceiver(this.u);
        }
        c(false);
        b(false);
        a(false);
        super.onDestroy();
    }

    static /* synthetic */ void d(DlnaMediaServer dlnaMediaServer) {
        dlnaMediaServer.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized void a() {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.al.dlnaserver.servers.DlnaMediaServer.a():void");
    }

    private synchronized void b() {
        App.a = false;
        App.b = false;
        d();
        new d(this, "DlnaMediaServer.DLNA-Stop").start();
        if (this.s != null) {
            ContentResolver contentResolver = getContentResolver();
            if (contentResolver != null) {
                contentResolver.unregisterContentObserver(this.s);
            }
            this.s = null;
        }
        if (this.y != null) {
            synchronized (this.y) {
                for (com.al.dlnaserver.customs.i iVar : this.y) {
                    if (iVar.b()) {
                        iVar.stopWatching();
                        iVar.a(false);
                    }
                }
                this.y.clear();
            }
        }
    }

    static /* synthetic */ void c(DlnaMediaServer dlnaMediaServer) {
        dlnaMediaServer.c();
    }

    private void c() {
        d();
        App.a = true;
        this.z = new e(this, "DlnaMediaServer.ScanMedia");
        try {
            this.z.start();
        } catch (IllegalThreadStateException e) {
            Log.e("DlnaMediaServer", "scanMedia()::scanningThread.start() Thread already running", e);
        }
    }

    private void d() {
        if (this.z != null) {
            if (this.z.isAlive() || App.d) {
                App.a = false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (App.d && this.z != null) {
                try {
                    Thread.sleep(200L);
                } catch (Exception e) {
                }
                if (System.currentTimeMillis() - jCurrentTimeMillis > 7000) {
                    break;
                }
            }
            this.z = null;
            App.d = false;
        }
    }

    private void e() throws Throwable {
        String str;
        int i;
        String str2;
        if (this.v != null && !this.v.isEmpty()) {
            str = "";
            int i2 = 0;
            for (String str3 : this.v) {
                if (str3.startsWith("*") || str3.startsWith("content://")) {
                    str = String.valueOf(str) + (str.isEmpty() ? "" : " or ") + "_data = ''";
                } else {
                    str = String.valueOf(str) + (str.isEmpty() ? "" : " or ") + "_data like '%" + str3.replace("'", "''") + "%'";
                    i2++;
                }
            }
            i = i2;
        } else {
            str = "";
            i = 0;
        }
        String str4 = String.valueOf(str.isEmpty() ? "" : "(" + str + ") and ") + "mime_type like '%audio%'";
        if (com.al.dlnaserver.b.n.a(this, "sort_title")) {
            str2 = "title ASC";
        } else {
            str2 = "_data ASC";
        }
        Cursor cursorQuery = getContentResolver().query(MediaStore$Audio$Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "album_id", "title", "_display_name", "_data", "_size", "artist", "album", "track", "duration", "mime_type", "date_modified"}, str4, null, str2);
        if (cursorQuery != null && cursorQuery.moveToFirst()) {
            org.cybergarage.d.e.a.a.b.a.a aVarA = a("a", this.a);
            org.cybergarage.d.e.a.a.b.a.a aVarA2 = a(aVarA, "a", this.m, "rf");
            org.cybergarage.d.e.a.a.b.a.a aVarA3 = null;
            boolean zA = com.al.dlnaserver.b.n.a(this, "show_thumbs_audio");
            boolean z = !com.al.dlnaserver.b.n.a(this, "no_all_media");
            boolean zA2 = com.al.dlnaserver.b.n.a(this, "flat_style");
            boolean zA3 = com.al.dlnaserver.b.n.a(this, "display_file_name");
            boolean zA4 = com.al.dlnaserver.b.n.a(this, "add_artist_album");
            String string = getString(R$string.dlna_title_unknown);
            if (zA4) {
                aVarA3 = a(aVarA, "a", this.n, "af");
            }
            ArrayList arrayList = new ArrayList();
            do {
                String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (new File(string2).exists()) {
                    String string3 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("title"));
                    String string4 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                    String string5 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("artist"));
                    String string6 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("album"));
                    String string7 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("track"));
                    String string8 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("mime_type"));
                    long j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_size"));
                    long j2 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("duration"));
                    long j3 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("date_modified"));
                    String str5 = string4 == null ? string3 : string4;
                    String str6 = string5 == null ? string : string5;
                    if (string6 == null) {
                        string6 = string;
                    }
                    String strF = f(String.valueOf(String.valueOf(App.m)) + "_" + str5);
                    App.f.put(strF, new File(string2));
                    String strEncode = URLEncoder.encode(strF, "UTF-8");
                    if (string8 == null || string8.isEmpty()) {
                        string8 = "audio/*";
                    }
                    String strI = com.al.dlnaserver.b.c.i(string8);
                    long j4 = 0;
                    if (j2 > 0 && j2 / 1000 > 0) {
                        j4 = j / (j2 / 1000);
                    }
                    org.cybergarage.d.e.a.a.b.c.a aVar = new org.cybergarage.d.e.a.a.b.c.a();
                    aVar.c("id", strEncode);
                    aVar.c(zA3 ? str5.replace("&", "&amp;") : string3.replace("&", "&amp;"));
                    aVar.b("dc:creator", str6);
                    aVar.b("upnp:album", string6);
                    aVar.b("upnp:artist", str6);
                    aVar.b("upnp:originalTrackNumber", string7);
                    aVar.a("restricted", 1);
                    aVar.c("parentID", "a");
                    aVar.d("object.item.audioItem.musicTrack");
                    aVar.b("dc:date", b(1000 * j3));
                    aVar.c("rawDate", String.valueOf(j3));
                    String str7 = "http://" + org.cybergarage.b.a.a() + ":" + App.l + "/" + strEncode;
                    String strA = a("object.item.audioItem.musicTrack", strI, com.al.dlnaserver.b.c.a(str5));
                    org.cybergarage.xml.b bVar = new org.cybergarage.xml.b();
                    bVar.add(new org.cybergarage.xml.a("size", Long.toString(j)));
                    bVar.add(new org.cybergarage.xml.a("duration", a(j2)));
                    if (j4 > 0) {
                        bVar.add(new org.cybergarage.xml.a("bitrate", Long.toString(j4)));
                    }
                    aVar.b(str7, strA, bVar);
                    if (zA) {
                        String[] strArrC = c(string2);
                        a(aVar, strArrC[0], strArrC[1]);
                    }
                    if (z) {
                        a(aVarA, aVar, "a");
                    }
                    if (zA2) {
                        b(aVarA2, aVar, string2, "a");
                    } else {
                        a(aVarA2, aVar, string2, "a");
                    }
                    if (zA4 && aVarA3 != null) {
                        c(aVarA3, aVar, str6, string6);
                    }
                    arrayList.add(aVar);
                    if (org.cybergarage.e.a.a) {
                        Log.i("DlnaMediaServer", "addAudio()::item=" + aVar.toString());
                    }
                    App.m++;
                }
                if (!cursorQuery.moveToNext()) {
                    break;
                }
            } while (App.a);
            a(aVarA, arrayList, "a");
            Log.i("DlnaMediaServer", "addAudio()::list size = ".concat(String.valueOf(i)));
        } else {
            Log.i("DlnaMediaServer", "addAudio()::cursor is empty");
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
    }

    private void f() throws Throwable {
        String str;
        int i;
        String str2;
        if (this.v != null && !this.v.isEmpty()) {
            str = "";
            int i2 = 0;
            for (String str3 : this.v) {
                if (str3.startsWith("*") || str3.startsWith("content://")) {
                    str = String.valueOf(str) + (str.isEmpty() ? "" : " or ") + "_data = ''";
                } else {
                    str = String.valueOf(str) + (str.isEmpty() ? "" : " or ") + "_data like '%" + str3.replace("'", "''") + "%'";
                    i2++;
                }
            }
            i = i2;
        } else {
            str = "";
            i = 0;
        }
        String str4 = String.valueOf(str.isEmpty() ? "" : "(" + str + ") and ") + "mime_type like '%video%'";
        if (com.al.dlnaserver.b.n.a(this, "sort_title")) {
            str2 = "title ASC";
        } else {
            str2 = "_data ASC";
        }
        Cursor cursorQuery = getContentResolver().query(MediaStore$Video$Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "title", "_display_name", "_data", "artist", "album", "_size", "duration", "resolution", "mime_type", "date_modified"}, str4, null, str2);
        if (cursorQuery != null && cursorQuery.moveToFirst()) {
            org.cybergarage.d.e.a.a.b.a.a aVarA = a("v", this.b);
            org.cybergarage.d.e.a.a.b.a.a aVarA2 = a(aVarA, "v", this.m, "rf");
            org.cybergarage.d.e.a.a.b.a.a aVarA3 = null;
            boolean zA = com.al.dlnaserver.b.n.a(this, "show_thumbs");
            boolean z = !com.al.dlnaserver.b.n.a(this, "no_all_media");
            boolean zA2 = com.al.dlnaserver.b.n.a(this, "flat_style");
            boolean zA3 = com.al.dlnaserver.b.n.a(this, "display_file_name");
            boolean zA4 = com.al.dlnaserver.b.n.a(this, "add_artist_album");
            String string = getString(R$string.dlna_title_unknown);
            if (zA4) {
                aVarA3 = a(aVarA, "v", this.n, "af");
            }
            ArrayList arrayList = new ArrayList();
            do {
                String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (new File(string2).exists()) {
                    String string3 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("title"));
                    String string4 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                    String string5 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("artist"));
                    String string6 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("album"));
                    String string7 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("mime_type"));
                    long j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_size"));
                    long j2 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("duration"));
                    long j3 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("date_modified"));
                    String string8 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("resolution"));
                    if (string4 == null) {
                        string4 = string3;
                    }
                    String str5 = string5 == null ? string : string5;
                    if (string6 == null) {
                        string6 = string;
                    }
                    String strF = f(String.valueOf(String.valueOf(App.m)) + "_" + string4);
                    App.f.put(strF, new File(string2));
                    String strEncode = URLEncoder.encode(strF, "UTF-8");
                    if (string7 == null || string7.isEmpty()) {
                        string7 = "video/*";
                    }
                    String strI = com.al.dlnaserver.b.c.i(string7);
                    long j4 = 0;
                    if (j2 > 0 && j2 / 1000 > 0) {
                        j4 = j / (j2 / 1000);
                    }
                    org.cybergarage.d.e.a.a.b.c.a aVar = new org.cybergarage.d.e.a.a.b.c.a();
                    aVar.c("id", strEncode);
                    aVar.c(zA3 ? string4.replace("&", "&amp;") : string3.replace("&", "&amp;"));
                    aVar.b("dc:creator", str5);
                    aVar.b("upnp:album", string6);
                    aVar.b("upnp:artist", str5);
                    aVar.a("restricted", 1);
                    aVar.c("parentID", "v");
                    aVar.d("object.item.videoItem");
                    aVar.b("dc:date", b(1000 * j3));
                    aVar.c("rawDate", String.valueOf(j3));
                    String str6 = "http://" + org.cybergarage.b.a.a() + ":" + App.l + "/" + strEncode;
                    String strA = a("object.item.videoItem", strI, "");
                    org.cybergarage.xml.b bVar = new org.cybergarage.xml.b();
                    bVar.add(new org.cybergarage.xml.a("size", Long.toString(j)));
                    bVar.add(new org.cybergarage.xml.a("duration", a(j2)));
                    bVar.add(new org.cybergarage.xml.a("resolution", string8));
                    if (j4 > 0) {
                        bVar.add(new org.cybergarage.xml.a("bitrate", Long.toString(j4)));
                    }
                    aVar.b(str6, strA, bVar);
                    if (zA) {
                        String[] strArrB = b(string2);
                        a(aVar, strArrB[0], strArrB[1]);
                    }
                    a(App.m, string3, string2, aVar);
                    if (z) {
                        a(aVarA, aVar, "v");
                    }
                    if (zA2) {
                        b(aVarA2, aVar, string2, "v");
                    } else {
                        a(aVarA2, aVar, string2, "v");
                    }
                    if (zA4 && aVarA3 != null) {
                        c(aVarA3, aVar, str5, string6);
                    }
                    arrayList.add(aVar);
                    if (org.cybergarage.e.a.a) {
                        Log.i("DlnaMediaServer", "addVideo()::item=" + aVar.toString());
                    }
                    App.m++;
                }
                if (!cursorQuery.moveToNext()) {
                    break;
                }
            } while (App.a);
            a(aVarA, arrayList, "v");
            Log.i("DlnaMediaServer", "addVideo()::list size = ".concat(String.valueOf(i)));
        } else {
            Log.i("DlnaMediaServer", "addVideo()::cursor is empty");
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
    }

    @SuppressLint({"InlinedApi"})
    private void g() throws UnsupportedEncodingException {
        String str;
        int i;
        String str2;
        Cursor cursorQuery;
        String str3;
        if (this.v != null && !this.v.isEmpty()) {
            str = "";
            int i2 = 0;
            for (String str4 : this.v) {
                if (str4.startsWith("*") || str4.startsWith("content://")) {
                    str = String.valueOf(str) + (str.isEmpty() ? "" : " or ") + "_data = ''";
                } else {
                    str = String.valueOf(str) + (str.isEmpty() ? "" : " or ") + "_data like '%" + str4.replace("'", "''") + "%'";
                    i2++;
                }
            }
            i = i2;
        } else {
            str = "";
            i = 0;
        }
        String str5 = String.valueOf(str.isEmpty() ? "" : "(" + str + ") and ") + "mime_type like '%image%'";
        if (com.al.dlnaserver.b.n.a(this, "sort_title")) {
            str2 = "title ASC";
        } else {
            str2 = "_data ASC";
        }
        if (Build$VERSION.SDK_INT >= 16) {
            cursorQuery = getContentResolver().query(MediaStore$Images$Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "title", "_display_name", "_data", "_size", "mime_type", "date_modified", "width", "height"}, str5, null, str2);
        } else {
            cursorQuery = getContentResolver().query(MediaStore$Images$Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "title", "_display_name", "_data", "_size", "mime_type", "date_modified"}, str5, null, str2);
        }
        if (cursorQuery != null && cursorQuery.moveToFirst()) {
            org.cybergarage.d.e.a.a.b.a.a aVarA = a("i", this.c);
            org.cybergarage.d.e.a.a.b.a.a aVarA2 = a(aVarA, "i", this.m, "rf");
            boolean zA = com.al.dlnaserver.b.n.a(this, "show_thumbs_image");
            boolean z = !com.al.dlnaserver.b.n.a(this, "no_all_media");
            boolean zA2 = com.al.dlnaserver.b.n.a(this, "flat_style");
            boolean zA3 = com.al.dlnaserver.b.n.a(this, "display_file_name");
            ArrayList arrayList = new ArrayList();
            do {
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (new File(string).exists()) {
                    String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("title"));
                    String string3 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                    String string4 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("mime_type"));
                    long j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_size"));
                    long j2 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("date_modified"));
                    if (Build$VERSION.SDK_INT >= 16) {
                        str3 = String.valueOf(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("width"))) + "x" + cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("height"));
                    } else {
                        str3 = "";
                    }
                    if (string3 == null) {
                        string3 = string2;
                    }
                    String strF = f(String.valueOf(String.valueOf(App.m)) + "_" + string3);
                    App.f.put(strF, new File(string));
                    String strEncode = URLEncoder.encode(strF, "UTF-8");
                    if (string4 == null || string4.isEmpty()) {
                        string4 = "image/*";
                    }
                    String strI = com.al.dlnaserver.b.c.i(string4);
                    org.cybergarage.d.e.a.a.b.c.a aVar = new org.cybergarage.d.e.a.a.b.c.a();
                    aVar.c("id", strEncode);
                    aVar.c(zA3 ? string3.replace("&", "&amp;") : string2.replace("&", "&amp;"));
                    aVar.a("restricted", 1);
                    aVar.c("parentID", "i");
                    aVar.d("object.item.imageItem.photo");
                    aVar.b("dc:date", b(1000 * j2));
                    aVar.c("rawDate", String.valueOf(j2));
                    String str6 = "http://" + org.cybergarage.b.a.a() + ":" + App.l + "/" + strEncode;
                    String strA = a("object.item.imageItem.photo", strI, "");
                    org.cybergarage.xml.b bVar = new org.cybergarage.xml.b();
                    bVar.add(new org.cybergarage.xml.a("size", Long.toString(j)));
                    bVar.add(new org.cybergarage.xml.a("resolution", str3));
                    aVar.b(str6, strA, bVar);
                    if (zA) {
                        String[] strArrD = d(string);
                        a(aVar, strArrD[0], strArrD[1]);
                    }
                    if (z) {
                        a(aVarA, aVar, "i");
                    }
                    if (zA2) {
                        b(aVarA2, aVar, string, "i");
                    } else {
                        a(aVarA2, aVar, string, "i");
                    }
                    arrayList.add(aVar);
                    if (org.cybergarage.e.a.a) {
                        Log.i("DlnaMediaServer", "addImage()::item=" + aVar.toString());
                    }
                    App.m++;
                }
                if (!cursorQuery.moveToNext()) {
                    break;
                }
            } while (App.a);
            a(aVarA, arrayList, "i");
            Log.i("DlnaMediaServer", "addImage()::list size = ".concat(String.valueOf(i)));
        } else {
            Log.i("DlnaMediaServer", "addImage()::cursor is empty");
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
    }

    private void h() throws Throwable {
        String str;
        if (this.v != null) {
            ArrayList<File> arrayList = new ArrayList();
            for (String str2 : this.v) {
                if (str2.startsWith("*")) {
                    if (!App.a) {
                        break;
                    }
                    a(str2.replace("*", ""));
                    new com.al.dlnaserver.c.c(arrayList).a(new File(str2.replace("*", "")));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                File file = (File) arrayList.get(size);
                if (file.getName().toLowerCase(Locale.US).endsWith("m3u") || file.getName().toLowerCase(Locale.US).endsWith("m3u8") || file.getName().toLowerCase(Locale.US).endsWith("pls")) {
                    arrayList2.add(file.getAbsolutePath());
                    arrayList.remove(size);
                }
            }
            if (!arrayList2.isEmpty()) {
                a(arrayList2);
                Log.i("DlnaMediaServer", "addPlayLists()::list size = " + arrayList2.size());
            }
            if (!arrayList.isEmpty()) {
                org.cybergarage.d.e.a.a.b.a.a aVarA = a("f", this.d);
                Collections.sort(arrayList);
                boolean zA = com.al.dlnaserver.b.n.a(this, "show_thumbs");
                boolean zA2 = com.al.dlnaserver.b.n.a(this, "show_thumbs_image");
                boolean zA3 = com.al.dlnaserver.b.n.a(this, "show_thumbs_audio");
                boolean z = !com.al.dlnaserver.b.n.a(this, "no_all_media");
                boolean zA4 = com.al.dlnaserver.b.n.a(this, "flat_style");
                ArrayList arrayList3 = new ArrayList();
                for (File file2 : arrayList) {
                    if (!App.a) {
                        break;
                    }
                    String strC = com.al.dlnaserver.b.c.c(file2.getName());
                    if (file2.isFile()) {
                        String strA = com.al.dlnaserver.b.c.a(file2.getName(), null);
                        if (strA == null) {
                            strA = "application/octet-stream";
                        }
                        long length = file2.length();
                        long jLastModified = file2.lastModified();
                        String strF = f(String.valueOf(String.valueOf(App.m)) + "_" + strC + "." + com.al.dlnaserver.b.c.a(file2.getName()));
                        App.f.put(strF, file2);
                        String strEncode = URLEncoder.encode(strF, "UTF-8");
                        String strA2 = "";
                        String[] strArrB = null;
                        boolean z2 = false;
                        if (com.al.dlnaserver.b.c.f(file2.getName())) {
                            str = "object.item.audioItem.musicTrack";
                            strA2 = com.al.dlnaserver.b.c.a(file2.getName());
                            if (zA3) {
                                strArrB = c(file2.getAbsolutePath());
                            }
                        } else if (com.al.dlnaserver.b.c.g(file2.getName())) {
                            str = "object.item.imageItem.photo";
                            if (zA2) {
                                strArrB = d(file2.getAbsolutePath());
                            }
                        } else if (com.al.dlnaserver.b.c.h(file2.getName())) {
                            str = "object.item.textItem";
                        } else {
                            z2 = true;
                            str = "object.item.videoItem";
                            if (zA) {
                                strArrB = b(file2.getAbsolutePath());
                            }
                        }
                        String strA3 = a(str, strA, strA2);
                        org.cybergarage.d.e.a.a.b.c.a aVar = new org.cybergarage.d.e.a.a.b.c.a();
                        aVar.c("id", strEncode);
                        aVar.c(strC.replace("&", "&amp;"));
                        aVar.a("restricted", 1);
                        aVar.c("parentID", aVarA.j("parentID"));
                        aVar.d(str);
                        aVar.b("dc:date", b(jLastModified));
                        aVar.c("rawDate", String.valueOf(jLastModified));
                        String str3 = "http://" + org.cybergarage.b.a.a() + ":" + App.l + "/" + strEncode;
                        org.cybergarage.xml.b bVar = new org.cybergarage.xml.b();
                        bVar.add(new org.cybergarage.xml.a("size", Long.toString(length)));
                        aVar.b(str3, strA3, bVar);
                        if (strArrB != null) {
                            a(aVar, strArrB[0], strArrB[1]);
                        }
                        if (z2) {
                            a(App.m, strC, file2, aVar);
                        }
                        if (z) {
                            a(aVarA, aVar, "f");
                        }
                        if (zA4) {
                            b(aVarA, aVar, file2.getAbsolutePath(), "f");
                        } else {
                            a(aVarA, aVar, file2.getAbsolutePath(), "f");
                        }
                        arrayList3.add(aVar);
                        if (org.cybergarage.e.a.a) {
                            Log.i("DlnaMediaServer", "addFiles()::item=" + aVar.toString());
                        }
                        App.m++;
                    }
                }
                a(aVarA, arrayList3, "f");
                Log.i("DlnaMediaServer", "addFiles()::list size = " + arrayList.size());
                return;
            }
            Log.i("DlnaMediaServer", "addFiles()::paths list is empty");
        }
    }

    @SuppressLint({"InlinedApi"})
    private void i() throws UnsupportedEncodingException {
        Cursor cursorQuery;
        String str;
        if (Build$VERSION.SDK_INT >= 19 && this.v != null) {
            ArrayList<String> arrayList = new ArrayList();
            for (String str2 : this.v) {
                if (str2.startsWith("content://")) {
                    arrayList.add(str2);
                }
            }
            if (!arrayList.isEmpty()) {
                org.cybergarage.d.e.a.a.b.a.a aVarA = a("f", this.d);
                Collections.sort(arrayList);
                boolean zA = com.al.dlnaserver.b.n.a(this, "show_thumbs");
                boolean zA2 = com.al.dlnaserver.b.n.a(this, "show_thumbs_image");
                boolean zA3 = com.al.dlnaserver.b.n.a(this, "show_thumbs_audio");
                boolean z = !com.al.dlnaserver.b.n.a(this, "no_all_media");
                boolean zA4 = com.al.dlnaserver.b.n.a(this, "flat_style");
                Cursor cursor = null;
                ArrayList arrayList2 = new ArrayList();
                for (String str3 : arrayList) {
                    if (!App.a) {
                        break;
                    }
                    try {
                        cursorQuery = getContentResolver().query(Uri.parse(str3), null, null, null, null, null);
                    } catch (Exception e) {
                        String str4 = String.valueOf(getString(R$string.dead_uri_toast)) + str3;
                        g(str4);
                        Log.e("DlnaMediaServer", str4);
                        cursorQuery = cursor;
                    }
                    if (cursorQuery != null && cursorQuery.moveToFirst()) {
                        int columnIndex = cursorQuery.getColumnIndex("_display_name");
                        String string = columnIndex == -1 ? str3 : cursorQuery.getString(columnIndex);
                        int columnIndex2 = cursorQuery.getColumnIndex("mime_type");
                        String string2 = columnIndex2 == -1 ? null : cursorQuery.getString(columnIndex2);
                        if (string2 == null) {
                            string2 = com.al.dlnaserver.b.c.a(string, null);
                        }
                        String str5 = string2 == null ? "application/octet-stream" : string2;
                        int columnIndex3 = cursorQuery.getColumnIndex("_size");
                        long j = columnIndex3 == -1 ? 1073741824L : cursorQuery.getLong(columnIndex3);
                        int columnIndex4 = cursorQuery.getColumnIndex("last_modified");
                        long time = columnIndex4 == -1 ? new Date().getTime() : cursorQuery.getLong(columnIndex4);
                        String strF = f(String.valueOf(String.valueOf(App.m)) + "_" + string);
                        App.f.put(strF, null);
                        App.g.put(strF, Uri.parse(str3));
                        String strEncode = URLEncoder.encode(strF, "UTF-8");
                        String strA = "";
                        String[] strArrA = null;
                        if (com.al.dlnaserver.b.c.f(string)) {
                            str = "object.item.audioItem.musicTrack";
                            strA = com.al.dlnaserver.b.c.a(string);
                            if (zA3) {
                                strArrA = a(str3, time, j);
                            }
                        } else if (com.al.dlnaserver.b.c.g(string)) {
                            str = "object.item.imageItem.photo";
                            if (zA2) {
                                strArrA = a(str3, time, j);
                            }
                        } else if (com.al.dlnaserver.b.c.h(string)) {
                            str = "object.item.textItem";
                        } else {
                            str = "object.item.videoItem";
                            if (zA) {
                                strArrA = a(str3, time, j);
                            }
                        }
                        String strA2 = a(str, str5, strA);
                        org.cybergarage.d.e.a.a.b.c.a aVar = new org.cybergarage.d.e.a.a.b.c.a();
                        aVar.c("id", strEncode);
                        aVar.c(string.replace("&", "&amp;"));
                        aVar.a("restricted", 1);
                        aVar.c("parentID", aVarA.j("parentID"));
                        aVar.d(str);
                        aVar.b("dc:date", b(time));
                        aVar.c("rawDate", String.valueOf(time));
                        String str6 = "http://" + org.cybergarage.b.a.a() + ":" + App.l + "/" + strEncode;
                        org.cybergarage.xml.b bVar = new org.cybergarage.xml.b();
                        bVar.add(new org.cybergarage.xml.a("size", Long.toString(j)));
                        aVar.b(str6, strA2, bVar);
                        if (strArrA != null) {
                            a(aVar, strArrA[0], strArrA[1]);
                        }
                        if (z) {
                            a(aVarA, aVar, "f");
                        }
                        if (zA4) {
                            b(aVarA, aVar, str3.replace("content://", ""), "f");
                        } else {
                            a(aVarA, aVar, str3.replace("content://", ""), "f");
                        }
                        arrayList2.add(aVar);
                        if (org.cybergarage.e.a.a) {
                            Log.i("DlnaMediaServer", "addSAFContent()::item=" + aVar.toString());
                        }
                        App.m++;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    cursor = cursorQuery;
                }
                a(aVarA, arrayList2, "f");
                Log.i("DlnaMediaServer", "addSAFContent()::list size = " + arrayList.size());
                return;
            }
            Log.i("DlnaMediaServer", "addSAFContent()::paths list is empty");
        }
    }

    private void j() throws Throwable {
        boolean z;
        String str;
        String strA;
        a.g.ae aeVar;
        if (this.v != null) {
            ArrayList<a.g.ae> arrayList = new ArrayList();
            Map<a.g.ae, a.g.ae> map = new HashMap<>();
            for (String str2 : this.v) {
                if (str2.startsWith("smb://")) {
                    if (!App.a) {
                        break;
                    }
                    try {
                        new com.al.dlnaserver.c.d().a(arrayList, map, String.valueOf(str2) + "/");
                    } catch (Exception e) {
                        App.c = true;
                        Log.e("DlnaMediaServer", "setMediaContent()::addSMBContent()", e);
                        g("SMB: " + str2 + "\n" + e.getMessage());
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                org.cybergarage.d.e.a.a.b.a.a aVarA = a("smb", this.e);
                boolean zA = com.al.dlnaserver.b.n.a(this, "show_thumbs_image");
                boolean z2 = !com.al.dlnaserver.b.n.a(this, "no_all_media");
                boolean zA2 = com.al.dlnaserver.b.n.a(this, "flat_style");
                ArrayList arrayList2 = new ArrayList();
                for (a.g.ae aeVar2 : arrayList) {
                    if (!App.a) {
                        break;
                    }
                    String strH = aeVar2.h();
                    String strA2 = com.al.dlnaserver.b.c.a(aeVar2.h(), null);
                    String str3 = strA2 == null ? "application/octet-stream" : strA2;
                    long jP = aeVar2.p();
                    long jM = aeVar2.m();
                    String strF = f(String.valueOf(String.valueOf(App.m)) + "_" + strH);
                    App.h.put(strF, aeVar2);
                    String strEncode = URLEncoder.encode(strF, "UTF-8");
                    String[] strArrA = null;
                    if (com.al.dlnaserver.b.c.f(aeVar2.h())) {
                        str = "object.item.audioItem.musicTrack";
                        strA = com.al.dlnaserver.b.c.a(aeVar2.h());
                        z = false;
                    } else if (com.al.dlnaserver.b.c.g(aeVar2.h())) {
                        if (!zA) {
                            z = false;
                            strA = "";
                            str = "object.item.imageItem.photo";
                        } else {
                            strArrA = a(aeVar2.getInputStream(), aeVar2.i(), aeVar2.getDate(), aeVar2.p());
                            z = false;
                            strA = "";
                            str = "object.item.imageItem.photo";
                        }
                    } else if (com.al.dlnaserver.b.c.h(aeVar2.h())) {
                        str = "object.item.textItem";
                        z = false;
                        strA = "";
                    } else {
                        z = true;
                        str = "object.item.videoItem";
                        strA = "";
                    }
                    String strA3 = a(str, str3, strA);
                    org.cybergarage.d.e.a.a.b.c.a aVar = new org.cybergarage.d.e.a.a.b.c.a();
                    aVar.c("id", strEncode);
                    aVar.c(strH.replace("&", "&amp;"));
                    aVar.a("restricted", 1);
                    aVar.c("parentID", aVarA.j("parentID"));
                    aVar.d(str);
                    aVar.b("dc:date", b(jM));
                    aVar.c("rawDate", String.valueOf(jM));
                    String str4 = "http://" + org.cybergarage.b.a.a() + ":" + App.l + "/" + strEncode;
                    org.cybergarage.xml.b bVar = new org.cybergarage.xml.b();
                    bVar.add(new org.cybergarage.xml.a("size", Long.toString(jP)));
                    aVar.b(str4, strA3, bVar);
                    if (strArrA != null) {
                        a(aVar, strArrA[0], strArrA[1]);
                    }
                    if (z && (aeVar = map.get(aeVar2)) != null) {
                        String strB = com.al.dlnaserver.b.c.b(aeVar.h());
                        String strB2 = b(strEncode, strB);
                        App.h.put(String.valueOf(strEncode) + "." + strB, aeVar);
                        App.k.put(aeVar2.i(), strB2);
                        a(aVar, strB2, strB, aeVar.p());
                    }
                    if (z2) {
                        a(aVarA, aVar, "smb");
                    }
                    if (zA2) {
                        b(a(aVarA, "smb", aeVar2.getURL().getHost(), f(aeVar2.getURL().getHost())), aVar, "/" + aeVar2.getURL().getHost() + aeVar2.getURL().getPath(), "smb");
                    } else {
                        a(aVarA, aVar, "/" + aeVar2.getURL().getHost() + aeVar2.getURL().getPath(), "smb");
                    }
                    arrayList2.add(aVar);
                    if (org.cybergarage.e.a.a) {
                        Log.i("DlnaMediaServer", "addSMBContent()::item=" + aVar.toString());
                    }
                    App.m++;
                }
                a(aVarA, arrayList2, "smb");
                Log.i("DlnaMediaServer", "addSMBContent()::list size = " + arrayList.size());
                return;
            }
            Log.i("DlnaMediaServer", "addSMBContent()::paths list is empty");
        }
    }

    private void k() throws Throwable {
        String str;
        com.al.dlnaserver.customs.a aVar;
        if (this.v != null) {
            ArrayList<com.al.dlnaserver.customs.a> arrayList = new ArrayList();
            HashMap map = new HashMap();
            for (String str2 : this.v) {
                if (str2.startsWith("ftp://")) {
                    if (!App.a) {
                        break;
                    }
                    try {
                        new com.al.dlnaserver.c.a().a(arrayList, map, str2);
                    } catch (Exception e) {
                        App.c = true;
                        Log.e("DlnaMediaServer", "setMediaContent()::addFTPContent()", e);
                        g("FTP: " + str2 + "\n" + e.getMessage());
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                org.cybergarage.d.e.a.a.b.a.a aVarA = a("ftp", this.f);
                boolean zA = com.al.dlnaserver.b.n.a(this, "show_thumbs_image");
                boolean z = !com.al.dlnaserver.b.n.a(this, "no_all_media");
                boolean zA2 = com.al.dlnaserver.b.n.a(this, "flat_style");
                ArrayList arrayList2 = new ArrayList();
                for (com.al.dlnaserver.customs.a aVar2 : arrayList) {
                    if (!App.a) {
                        break;
                    }
                    String strC = aVar2.a().c();
                    String strA = com.al.dlnaserver.b.c.a(aVar2.a().c(), null);
                    if (strA == null) {
                        strA = "application/octet-stream";
                    }
                    long jD = aVar2.a().d();
                    long timeInMillis = aVar2.a().e().getTimeInMillis();
                    String strF = f(String.valueOf(String.valueOf(App.m)) + "_" + strC);
                    App.i.put(strF, aVar2);
                    String strEncode = URLEncoder.encode(strF, "UTF-8");
                    String strA2 = "";
                    String[] strArrA = null;
                    boolean z2 = false;
                    if (com.al.dlnaserver.b.c.f(aVar2.a().c())) {
                        str = "object.item.audioItem.musicTrack";
                        strA2 = com.al.dlnaserver.b.c.a(aVar2.a().c());
                    } else if (com.al.dlnaserver.b.c.g(aVar2.a().c())) {
                        str = "object.item.imageItem.photo";
                        if (zA) {
                            strArrA = a(aVar2);
                        }
                    } else if (com.al.dlnaserver.b.c.h(aVar2.a().c())) {
                        str = "object.item.textItem";
                    } else {
                        z2 = true;
                        str = "object.item.videoItem";
                    }
                    String strA3 = a(str, strA, strA2);
                    org.cybergarage.d.e.a.a.b.c.a aVar3 = new org.cybergarage.d.e.a.a.b.c.a();
                    aVar3.c("id", strEncode);
                    aVar3.c(strC.replace("&", "&amp;"));
                    aVar3.a("restricted", 1);
                    aVar3.c("parentID", aVarA.j("parentID"));
                    aVar3.d(str);
                    aVar3.b("dc:date", b(timeInMillis));
                    aVar3.c("rawDate", String.valueOf(timeInMillis));
                    String str3 = "http://" + org.cybergarage.b.a.a() + ":" + App.l + "/" + strEncode;
                    org.cybergarage.xml.b bVar = new org.cybergarage.xml.b();
                    bVar.add(new org.cybergarage.xml.a("size", Long.toString(jD)));
                    aVar3.b(str3, strA3, bVar);
                    if (strArrA != null) {
                        a(aVar3, strArrA[0], strArrA[1]);
                    }
                    if (z2 && (aVar = (com.al.dlnaserver.customs.a) map.get(aVar2)) != null) {
                        String strB = com.al.dlnaserver.b.c.b(aVar.a().c());
                        String strB2 = b(strEncode, strB);
                        App.i.put(String.valueOf(strEncode) + "." + strB, aVar);
                        App.k.put(aVar2.b().getPath(), strB2);
                        a(aVar3, strB2, strB, aVar.d());
                    }
                    if (z) {
                        a(aVarA, aVar3, "ftp");
                    }
                    if (zA2) {
                        b(a(aVarA, "ftp", aVar2.b().getHost(), f(aVar2.b().getHost())), aVar3, "/" + aVar2.b().getHost() + aVar2.b().getPath() + "/" + aVar2.a().c(), "ftp");
                    } else {
                        a(aVarA, aVar3, "/" + aVar2.b().getHost() + aVar2.b().getPath(), "ftp");
                    }
                    arrayList2.add(aVar3);
                    if (org.cybergarage.e.a.a) {
                        Log.i("DlnaMediaServer", "addFTPContent()::item=" + aVar3.toString());
                    }
                    App.m++;
                }
                a(aVarA, arrayList2, "ftp");
                Log.i("DlnaMediaServer", "addFTPContent()::list size = " + arrayList.size());
                return;
            }
            Log.i("DlnaMediaServer", "addFTPContent()::paths list is empty");
        }
    }

    @SuppressLint({"DefaultLocale"})
    private void l() throws Throwable {
        ArrayList arrayList = new ArrayList();
        if (this.v != null && !this.v.isEmpty()) {
            for (String str : this.v) {
                if (!App.a) {
                    break;
                }
                if (str.toLowerCase().endsWith("m3u") || str.toLowerCase().endsWith("m3u8") || str.toLowerCase().endsWith("pls")) {
                    arrayList.add(str);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            a(arrayList);
            Log.i("DlnaMediaServer", "addPlayLists()::list size = " + arrayList.size());
        } else {
            Log.i("DlnaMediaServer", "addPlayLists()::there are no playlists");
        }
    }

    @SuppressLint({"DefaultLocale"})
    private void a(List<String> list) throws Throwable {
        InputStream fileInputStream;
        org.cybergarage.d.e.a.a.b.a.a aVarA = a("p", this.g);
        boolean zA = com.al.dlnaserver.b.n.a(this, "proxy_stream");
        boolean zA2 = com.al.dlnaserver.b.n.a(this, "show_thumbs");
        boolean zA3 = com.al.dlnaserver.b.n.a(this, "show_thumbs_image");
        boolean zA4 = com.al.dlnaserver.b.n.a(this, "show_thumbs_audio");
        for (String str : list) {
            if (App.a) {
                if (!str.startsWith("#")) {
                    org.cybergarage.d.e.a.a.b.a.a aVar = new org.cybergarage.d.e.a.a.b.a.a();
                    aVar.c(com.al.dlnaserver.b.c.c(str));
                    aVar.c("id", "p$" + App.n);
                    aVar.c("parentID", "p");
                    aVar.a("restricted", 0);
                    aVar.a("searchable", 1);
                    aVar.d("object.container.storageFolder");
                    aVarA.a("childCount", aVarA.k("childCount") + 1);
                    aVarA.a((org.cybergarage.d.e.a.a.b.a) aVar);
                    if (str.startsWith("http")) {
                        fileInputStream = com.al.dlnaserver.b.l.a(str);
                    } else {
                        fileInputStream = new FileInputStream(str);
                    }
                    if (fileInputStream == null) {
                        Log.e("DlnaMediaServer", "addPlayLists() Can not get playlist ".concat(String.valueOf(str)));
                    } else {
                        String strA = com.al.dlnaserver.b.c.a(str);
                        if (strA.equals("m3u") || strA.equals("m3u8")) {
                            a$a a_aA = com.al.dlnaserver.a.a.a(fileInputStream);
                            for (int i = 0; i < a_aA.a() && App.a; i++) {
                                a(aVar, a_aA.b(i), a_aA.a(i), zA, zA2, zA3, zA4, App.n, i);
                            }
                        } else if (strA.equals("pls")) {
                            b$a b_aA = com.al.dlnaserver.a.b.a(fileInputStream);
                            for (int i2 = 0; i2 < b_aA.a() && App.a; i2++) {
                                a(aVar, b_aA.a(i2).b(), b_aA.a(i2).a(), zA, zA2, zA3, zA4, App.n, i2);
                            }
                        }
                        try {
                            fileInputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        App.n++;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x02aa A[PHI: r10 r12
  0x02aa: PHI (r10v1 boolean) = (r10v0 boolean), (r10v0 boolean), (r10v2 boolean), (r10v2 boolean) binds: [B:74:0x0282, B:75:0x0284, B:68:0x0269, B:69:0x026b] A[DONT_GENERATE, DONT_INLINE]
  0x02aa: PHI (r12v15 java.lang.String) = (r12v14 java.lang.String), (r12v14 java.lang.String), (r12v16 java.lang.String), (r12v16 java.lang.String) binds: [B:74:0x0282, B:75:0x0284, B:68:0x0269, B:69:0x026b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(org.cybergarage.d.e.a.a.b.a.a r17, java.lang.String r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.al.dlnaserver.servers.DlnaMediaServer.a(org.cybergarage.d.e.a.a.b.a.a, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, int, int):void");
    }

    private static void a(int i, String str, String str2, org.cybergarage.d.e.a.a.b.c.a aVar) {
        a(i, str, new File(str2), aVar);
    }

    private static void a(int i, String str, File file, org.cybergarage.d.e.a.a.b.c.a aVar) {
        String str2;
        String strF = f(String.valueOf(String.valueOf(i)) + "_" + str);
        String parent = file.getParent();
        if (parent == null) {
            str2 = "/";
        } else {
            str2 = String.valueOf(parent) + "/";
        }
        String absolutePath = file.getAbsolutePath();
        File file2 = new File(String.valueOf(str2) + com.al.dlnaserver.b.c.c(absolutePath) + ".srt");
        if (file2.exists()) {
            App.f.put(String.valueOf(strF) + ".srt", file2);
            String strB = b(strF, "srt");
            org.cybergarage.xml.b bVar = new org.cybergarage.xml.b();
            bVar.add(new org.cybergarage.xml.a("size", Long.toString(file2.length())));
            aVar.a("sec:CaptionInfoEx", "sec:type", "srt", strB);
            aVar.a(strB, "http-get:*:text/srt:*", bVar);
            org.cybergarage.d.e.a.a.b.c cVarA = aVar.a("res");
            cVarA.a("pv:subtitleFileType", "SRT");
            cVarA.a("pv:subtitleFileUri", strB);
            App.k.put(absolutePath, strB);
        }
        File file3 = new File(String.valueOf(str2) + com.al.dlnaserver.b.c.c(absolutePath) + ".smi");
        if (file3.exists()) {
            App.f.put(String.valueOf(strF) + ".smi", file3);
            String strB2 = b(strF, "smi");
            org.cybergarage.xml.b bVar2 = new org.cybergarage.xml.b();
            bVar2.add(new org.cybergarage.xml.a("size", Long.toString(file3.length())));
            aVar.a("sec:CaptionInfoEx", "sec:type", "smi", strB2);
            aVar.a(strB2, "http-get:*:smi/caption:*", bVar2);
            org.cybergarage.d.e.a.a.b.c cVarA2 = aVar.a("res");
            cVarA2.a("pv:subtitleFileType", "SMI");
            cVarA2.a("pv:subtitleFileUri", strB2);
            App.k.put(absolutePath, strB2);
        }
        File file4 = new File(String.valueOf(str2) + com.al.dlnaserver.b.c.c(absolutePath) + ".ssa");
        if (file4.exists()) {
            App.f.put(String.valueOf(strF) + ".ssa", file4);
            App.k.put(absolutePath, b(strF, "ssa"));
        }
        File file5 = new File(String.valueOf(str2) + com.al.dlnaserver.b.c.c(absolutePath) + ".ass");
        if (file5.exists()) {
            App.f.put(String.valueOf(strF) + ".ass", file5);
            App.k.put(absolutePath, b(strF, "ass"));
        }
        File file6 = new File(String.valueOf(str2) + com.al.dlnaserver.b.c.c(absolutePath) + ".sub");
        if (file6.exists()) {
            App.f.put(String.valueOf(strF) + ".sub", file6);
            App.k.put(absolutePath, b(strF, "sub"));
        }
        File file7 = new File(String.valueOf(str2) + com.al.dlnaserver.b.c.c(absolutePath) + ".txt");
        if (file7.exists()) {
            App.f.put(String.valueOf(strF) + ".txt", file7);
            String strB3 = b(strF, "txt");
            org.cybergarage.xml.b bVar3 = new org.cybergarage.xml.b();
            bVar3.add(new org.cybergarage.xml.a("size", Long.toString(file2.length())));
            aVar.a("sec:CaptionInfoEx", "sec:type", "txt", strB3);
            aVar.a(strB3, "http-get:*:text/txt:*", bVar3);
            org.cybergarage.d.e.a.a.b.c cVarA3 = aVar.a("res");
            cVarA3.a("pv:subtitleFileType", "TXT");
            cVarA3.a("pv:subtitleFileUri", strB3);
            App.k.put(absolutePath, strB3);
        }
        File file8 = new File(String.valueOf(str2) + com.al.dlnaserver.b.c.c(absolutePath) + ".idx");
        if (file8.exists()) {
            App.f.put(String.valueOf(strF) + ".idx", file8);
            App.k.put(absolutePath, b(strF, "idx"));
        }
        File file9 = new File(String.valueOf(str2) + com.al.dlnaserver.b.c.c(absolutePath) + ".mpl");
        if (file9.exists()) {
            App.f.put(String.valueOf(strF) + ".mpl", file9);
            App.k.put(absolutePath, b(strF, "mpl"));
        }
        File file10 = new File(String.valueOf(str2) + com.al.dlnaserver.b.c.c(absolutePath) + ".vtt");
        if (file10.exists()) {
            App.f.put(String.valueOf(strF) + ".vtt", file10);
            String strB4 = b(strF, "vtt");
            org.cybergarage.xml.b bVar4 = new org.cybergarage.xml.b();
            bVar4.add(new org.cybergarage.xml.a("size", Long.toString(file2.length())));
            aVar.a("sec:CaptionInfoEx", "sec:type", "vtt", strB4);
            aVar.a(strB4, "http-get:*:text/vtt:*", bVar4);
            org.cybergarage.d.e.a.a.b.c cVarA4 = aVar.a("res");
            cVarA4.a("pv:subtitleFileType", "VTT");
            cVarA4.a("pv:subtitleFileUri", strB4);
            App.k.put(absolutePath, strB4);
        }
        File file11 = new File(String.valueOf(str2) + com.al.dlnaserver.b.c.c(absolutePath) + ".psb");
        if (file11.exists()) {
            App.f.put(String.valueOf(strF) + ".psb", file11);
            App.k.put(absolutePath, b(strF, "psb"));
        }
        File file12 = new File(String.valueOf(str2) + com.al.dlnaserver.b.c.c(absolutePath) + ".sami");
        if (file12.exists()) {
            App.f.put(String.valueOf(strF) + ".sami", file12);
            App.k.put(absolutePath, b(strF, "sami"));
        }
        File file13 = new File(String.valueOf(str2) + com.al.dlnaserver.b.c.c(absolutePath) + ".pjs");
        if (file13.exists()) {
            App.f.put(String.valueOf(strF) + ".pjs", file13);
            App.k.put(absolutePath, b(strF, "pjs"));
        }
        File file14 = new File(String.valueOf(str2) + com.al.dlnaserver.b.c.c(absolutePath) + ".sup");
        if (file14.exists()) {
            App.f.put(String.valueOf(strF) + ".sup", file14);
            App.k.put(absolutePath, b(strF, "sup"));
        }
    }

    private static void a(org.cybergarage.d.e.a.a.b.c.a aVar, String str, String str2, long j) {
        if ("srt".equalsIgnoreCase(str2)) {
            org.cybergarage.xml.b bVar = new org.cybergarage.xml.b();
            bVar.add(new org.cybergarage.xml.a("size", Long.toString(j)));
            aVar.a("sec:CaptionInfoEx", "sec:type", "srt", str);
            aVar.a(str, "http-get:*:text/srt:*", bVar);
            org.cybergarage.d.e.a.a.b.c cVarA = aVar.a("res");
            cVarA.a("pv:subtitleFileType", "SRT");
            cVarA.a("pv:subtitleFileUri", str);
        }
        if ("smi".equalsIgnoreCase(str2)) {
            org.cybergarage.xml.b bVar2 = new org.cybergarage.xml.b();
            bVar2.add(new org.cybergarage.xml.a("size", Long.toString(j)));
            aVar.a("sec:CaptionInfoEx", "sec:type", "smi", str);
            aVar.a(str, "http-get:*:smi/caption:*", bVar2);
            org.cybergarage.d.e.a.a.b.c cVarA2 = aVar.a("res");
            cVarA2.a("pv:subtitleFileType", "SMI");
            cVarA2.a("pv:subtitleFileUri", str);
        }
        if ("txt".equalsIgnoreCase(str2)) {
            org.cybergarage.xml.b bVar3 = new org.cybergarage.xml.b();
            bVar3.add(new org.cybergarage.xml.a("size", Long.toString(j)));
            aVar.a("sec:CaptionInfoEx", "sec:type", "txt", str);
            aVar.a(str, "http-get:*:text/txt:*", bVar3);
            org.cybergarage.d.e.a.a.b.c cVarA3 = aVar.a("res");
            cVarA3.a("pv:subtitleFileType", "TXT");
            cVarA3.a("pv:subtitleFileUri", str);
        }
        if ("vtt".equalsIgnoreCase(str2)) {
            org.cybergarage.xml.b bVar4 = new org.cybergarage.xml.b();
            bVar4.add(new org.cybergarage.xml.a("size", Long.toString(j)));
            aVar.a("sec:CaptionInfoEx", "sec:type", "vtt", str);
            aVar.a(str, "http-get:*:text/vtt:*", bVar4);
            org.cybergarage.d.e.a.a.b.c cVarA4 = aVar.a("res");
            cVarA4.a("pv:subtitleFileType", "VTT");
            cVarA4.a("pv:subtitleFileUri", str);
        }
    }

    private org.cybergarage.d.e.a.a.b.a.a a(String str, String str2) {
        org.cybergarage.d.e.a.a.b.a.b bVarB = this.p.s().b();
        org.cybergarage.d.e.a.a.b.a.a aVar = (org.cybergarage.d.e.a.a.b.a.a) bVarB.e(str);
        if (aVar == null) {
            org.cybergarage.d.e.a.a.b.a.a aVar2 = new org.cybergarage.d.e.a.a.b.a.a();
            aVar2.c(str2);
            aVar2.c("id", str);
            aVar2.a("parentID", 0);
            aVar2.a("restricted", 1);
            aVar2.a("searchable", 1);
            aVar2.d("object.container");
            aVar2.a(this.p.s());
            bVarB.c(aVar2);
            bVarB.a("childCount", bVarB.k("childCount") + 1);
            return aVar2;
        }
        return aVar;
    }

    private static org.cybergarage.d.e.a.a.b.a.a a(org.cybergarage.d.e.a.a.b.a.a aVar, String str, String str2, String str3) {
        org.cybergarage.d.e.a.a.b.a.a aVar2 = (org.cybergarage.d.e.a.a.b.a.a) aVar.e(String.valueOf(str) + "$" + str3);
        if (aVar2 == null) {
            org.cybergarage.d.e.a.a.b.a.a aVar3 = new org.cybergarage.d.e.a.a.b.a.a();
            aVar3.c(str2);
            aVar3.c("id", String.valueOf(str) + "$" + str3);
            aVar3.c("parentID", aVar.j("id"));
            aVar3.a("restricted", 0);
            aVar3.a("searchable", 1);
            aVar3.d("object.container.storageFolder");
            aVar.a("childCount", aVar.k("childCount") + 1);
            aVar.a((org.cybergarage.d.e.a.a.b.a) aVar3);
            return aVar3;
        }
        return aVar2;
    }

    private void a(org.cybergarage.d.e.a.a.b.a.a aVar, org.cybergarage.d.e.a.a.b.c.a aVar2, String str) {
        org.cybergarage.d.e.a.a.b.a.a aVar3 = (org.cybergarage.d.e.a.a.b.a.a) aVar.e(String.valueOf(str) + "$am");
        if (aVar3 == null) {
            aVar3 = new org.cybergarage.d.e.a.a.b.a.a();
            if (str.equals("a")) {
                aVar3.c(this.h);
            } else if (str.equals("v")) {
                aVar3.c(this.i);
            } else if (str.equals("i")) {
                aVar3.c(this.j);
            } else if (str.equals("f") || str.equals("smb") || str.equals("ftp")) {
                aVar3.c(this.k);
            } else {
                aVar3.c("?");
            }
            aVar3.c("id", String.valueOf(str) + "$am");
            aVar3.c("parentID", aVar.j("id"));
            aVar3.a("restricted", 0);
            aVar3.a("searchable", 1);
            aVar3.d("object.container");
            aVar.a((org.cybergarage.d.e.a.a.b.a) aVar3);
        }
        aVar3.c(aVar2);
        aVar3.a("childCount", aVar3.k("childCount") + 1);
    }

    private void a(org.cybergarage.d.e.a.a.b.a.a aVar, List<org.cybergarage.d.e.a.a.b.c.a> list, String str) {
        org.cybergarage.d.e.a.a.b.a.a aVar2;
        if (!list.isEmpty()) {
            org.cybergarage.d.e.a.a.b.a.a aVar3 = (org.cybergarage.d.e.a.a.b.a.a) aVar.e(String.valueOf(str) + "$rm");
            if (aVar3 == null) {
                org.cybergarage.d.e.a.a.b.a.a aVar4 = new org.cybergarage.d.e.a.a.b.a.a();
                aVar4.c(this.l);
                aVar4.c("id", String.valueOf(str) + "$rm");
                aVar4.c("parentID", str);
                aVar4.a("restricted", 0);
                aVar4.d("object.container.storageFolder");
                aVar.a((org.cybergarage.d.e.a.a.b.a) aVar4);
                aVar2 = aVar4;
            } else {
                aVar2 = aVar3;
            }
            Collections.sort(list, new com.al.dlnaserver.customs.b());
            int iMin = Math.min(list.size(), 15);
            for (int i = 0; i < iMin; i++) {
                aVar2.c(list.get(i));
                aVar2.a("childCount", aVar2.k("childCount") + 1);
            }
        }
    }

    private static void a(org.cybergarage.d.e.a.a.b.a.a aVar, org.cybergarage.d.e.a.a.b.c.a aVar2, String str, String str2) {
        org.cybergarage.d.e.a.a.b.a.a aVar3;
        org.cybergarage.d.e.a.a.b.a.a aVar4 = null;
        String[] strArrSplit = str.split("/");
        int i = 1;
        while (i < strArrSplit.length) {
            String str3 = strArrSplit[i];
            String str4 = String.valueOf(str2) + "$" + URLEncoder.encode(f(str3), "UTF-8");
            if (i == strArrSplit.length - 1) {
                if (aVar4 != null) {
                    aVar = aVar4;
                }
                aVar.c(aVar2);
                aVar.a("childCount", aVar.k("childCount") + 1);
                return;
            }
            org.cybergarage.d.e.a.a.b.a.a aVar5 = (org.cybergarage.d.e.a.a.b.a.a) aVar.e(str2);
            org.cybergarage.d.e.a.a.b.a.a aVar6 = aVar5 == null ? aVar : aVar5;
            if (aVar6.j("id").equals(str4)) {
                aVar3 = aVar4;
            } else {
                aVar3 = (org.cybergarage.d.e.a.a.b.a.a) aVar.e(str4);
                if (aVar3 == null) {
                    aVar3 = new org.cybergarage.d.e.a.a.b.a.a();
                }
                if (!aVar3.j("id").equals(str4)) {
                    aVar3.c(str3);
                    aVar3.c("id", str4);
                    aVar3.c("parentID", aVar6.j("id"));
                    aVar3.a("restricted", 0);
                    aVar3.a("searchable", 1);
                    aVar3.d("object.container.storageFolder");
                    aVar6.a("childCount", aVar6.k("childCount") + 1);
                    aVar6.a((org.cybergarage.d.e.a.a.b.a) aVar3);
                }
            }
            i++;
            aVar4 = aVar3;
            str2 = str4;
        }
    }

    private static void b(org.cybergarage.d.e.a.a.b.a.a aVar, org.cybergarage.d.e.a.a.b.c.a aVar2, String str, String str2) {
        File parentFile = new File(str).getParentFile();
        String path = parentFile.getPath();
        String name = parentFile.getName();
        String str3 = String.valueOf(str2) + "$" + URLEncoder.encode(f(path).replaceFirst("/", "").replace("/", "$"), "UTF-8");
        org.cybergarage.d.e.a.a.b.a.a aVar3 = (org.cybergarage.d.e.a.a.b.a.a) aVar.e(str3);
        if (aVar3 == null) {
            aVar3 = new org.cybergarage.d.e.a.a.b.a.a();
            aVar3.c("parentID", aVar.j("id"));
            aVar3.c(name);
            aVar3.c("id", str3);
            aVar3.a("restricted", 0);
            aVar3.a("searchable", 1);
            aVar3.d("object.container.storageFolder");
            aVar.a((org.cybergarage.d.e.a.a.b.a) aVar3);
        }
        aVar3.c(aVar2);
        aVar3.a("childCount", aVar3.k("childCount") + 1);
    }

    private static void c(org.cybergarage.d.e.a.a.b.a.a aVar, org.cybergarage.d.e.a.a.b.c.a aVar2, String str, String str2) {
        org.cybergarage.d.e.a.a.b.a.a aVar3;
        String str3 = String.valueOf(aVar.j("id")) + "$" + URLEncoder.encode(f(str).replaceFirst("/", "").replace("/", "$"), "UTF-8");
        String str4 = String.valueOf(str3) + "$" + URLEncoder.encode(f(str2).replaceFirst("/", "").replace("/", "$"), "UTF-8");
        org.cybergarage.d.e.a.a.b.a.a aVar4 = (org.cybergarage.d.e.a.a.b.a.a) aVar.e(str3);
        if (aVar4 == null) {
            org.cybergarage.d.e.a.a.b.a.a aVar5 = new org.cybergarage.d.e.a.a.b.a.a();
            aVar5.c("parentID", aVar.j("id"));
            aVar5.c(str);
            aVar5.c("id", str3);
            aVar5.a("restricted", 0);
            aVar5.a("searchable", 1);
            aVar5.d("object.container.storageFolder");
            aVar.a((org.cybergarage.d.e.a.a.b.a) aVar5);
            aVar3 = aVar5;
        } else {
            aVar3 = aVar4;
        }
        org.cybergarage.d.e.a.a.b.a.a aVar6 = (org.cybergarage.d.e.a.a.b.a.a) aVar3.e(str4);
        if (aVar6 == null) {
            aVar6 = new org.cybergarage.d.e.a.a.b.a.a();
            aVar6.c("parentID", aVar3.j("id"));
            aVar6.c(str2);
            aVar6.c("id", str4);
            aVar6.a("restricted", 0);
            aVar6.a("searchable", 1);
            aVar6.d("object.container.storageFolder");
            aVar3.a((org.cybergarage.d.e.a.a.b.a) aVar6);
        }
        aVar6.c(aVar2);
        aVar6.a("childCount", aVar6.k("childCount") + 1);
    }

    private static void a(org.cybergarage.d.e.a.a.b.c.a aVar, String str, String str2) {
        aVar.b("upnp:icon", str);
        org.cybergarage.xml.b bVar = new org.cybergarage.xml.b();
        bVar.add(new org.cybergarage.xml.a("size", str2));
        bVar.add(new org.cybergarage.xml.a("dlna:profileID", "JPEG_SM"));
        org.cybergarage.xml.a aVar2 = new org.cybergarage.xml.a("xmlns:dlna", "urn:schemas-dlna-org:metadata-1-0/");
        bVar.add(aVar2);
        org.cybergarage.xml.b bVar2 = new org.cybergarage.xml.b();
        bVar2.add(new org.cybergarage.xml.a("size", str2));
        bVar2.add(new org.cybergarage.xml.a("dlna:profileID", "JPEG_TN"));
        bVar2.add(aVar2);
        aVar.a(str, bVar);
        aVar.a(str, bVar2);
        aVar.a(str, "http-get:*:image/jpeg:DLNA.ORG_PN=JPEG_SM;DLNA.ORG_OP=01;DLNA.ORG_CI=1;DLNA.ORG_FLAGS=00D00000000000000000000000000000", bVar);
        aVar.a(str, "http-get:*:image/jpeg:DLNA.ORG_PN=JPEG_TN;DLNA.ORG_OP=01;DLNA.ORG_CI=1;DLNA.ORG_FLAGS=00D00000000000000000000000000000", bVar2);
    }

    private static String a(String str, String str2, String str3) {
        if (str.equals("object.item.audioItem.musicTrack")) {
            return "http-get:*:" + str2 + ":" + ((str3.equals("mp3") || str2.contains("audio/mpeg")) ? "DLNA.ORG_PN=MP3;" : "") + "DLNA.ORG_OP=01;DLNA.ORG_CI=0;DLNA.ORG_FLAGS=01700000000000000000000000000000";
        }
        if (str.equals("object.item.videoItem")) {
            return "http-get:*:" + str2 + ":DLNA.ORG_OP=01;DLNA.ORG_CI=0;DLNA.ORG_FLAGS=01700000000000000000000000000000";
        }
        if (str.equals("object.item.imageItem.photo") && str3.contains("jp")) {
            return "http-get:*:" + str2 + ":DLNA.ORG_PN=JPEG_LRG;DLNA.ORG_OP=01;DLNA.ORG_FLAGS=00D00000000000000000000000000000";
        }
        if (str.equals("object.item.imageItem.photo") && str3.contains("png")) {
            return "http-get:*:" + str2 + ":DLNA.ORG_PN=PNG_LRG;DLNA.ORG_OP=01;DLNA.ORG_CI=0;DLNA.ORG_FLAGS=00D00000000000000000000000000000";
        }
        return "http-get:*:" + str2 + ":*";
    }

    private static String b(String str, String str2) {
        try {
            return "http://" + org.cybergarage.b.a.a() + ":" + App.l + "/" + URLEncoder.encode(String.valueOf(str) + "." + str2, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String a(long j) {
        long j2 = j / 1000;
        return String.valueOf(String.valueOf((j2 / 3600) % 24)) + ":" + String.format("%02d", Long.valueOf((j2 / 60) % 60)) + ":" + String.format("%02d", Long.valueOf(j2 % 60));
    }

    private static String b(long j) {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date(j));
    }

    private void a(String str) {
        if (this.y != null) {
            synchronized (this.y) {
                Iterator<com.al.dlnaserver.customs.i> it = this.y.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (str.equals(it.next().a())) {
                            break;
                        }
                    } else {
                        this.y.add(new com.al.dlnaserver.customs.i(str, getApplicationContext()));
                        break;
                    }
                }
            }
        }
    }

    private void m() {
        if (this.y != null) {
            synchronized (this.y) {
                for (com.al.dlnaserver.customs.i iVar : this.y) {
                    if (!iVar.b()) {
                        iVar.startWatching();
                        iVar.a(true);
                    }
                }
            }
        }
    }

    private void a(int i, String str, String str2) throws IOException {
        File file = new File(getCacheDir(), "device_icon_" + i + "." + str);
        if (!file.exists()) {
            InputStream inputStreamOpen = getAssets().open("device_icon_" + i + "." + str);
            FileOutputStream fileOutputStream = new FileOutputStream(file.getAbsolutePath());
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = inputStreamOpen.read(bArr);
                if (i2 <= 0) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, i2);
                }
            }
            inputStreamOpen.close();
            fileOutputStream.close();
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file.getAbsolutePath(), "r");
        byte[] bArr2 = new byte[(int) randomAccessFile.length()];
        randomAccessFile.readFully(bArr2);
        randomAccessFile.close();
        this.o.put("icons/deviceIcon" + i + "." + str, file);
        org.cybergarage.d.h hVar = new org.cybergarage.d.h();
        hVar.a(str2);
        hVar.a(i);
        hVar.b(i);
        hVar.b();
        hVar.b("/icons/deviceIcon" + i + "." + str);
        hVar.a(bArr2);
        this.p.a(hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v19, types: [android.media.MediaMetadataRetriever] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.media.MediaMetadataRetriever] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v10, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v1, types: [long] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.media.MediaMetadataRetriever] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.media.MediaMetadataRetriever] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    private String[] b(String str) throws Throwable {
        ?? mediaMetadataRetriever;
        RuntimeException e;
        IOException e2;
        Bitmap bitmapExtractThumbnail;
        String[] strArr = {"", ""};
        File file = new File(str);
        ?? Append = new StringBuilder(String.valueOf(file.getAbsolutePath())).append(file.lastModified());
        ?? length = file.length();
        String hexString = Integer.toHexString(Append.append(length).toString().hashCode());
        File cacheDir = getCacheDir();
        ?? ValueOf = String.valueOf(hexString);
        File file2 = new File(cacheDir, "thumb_".concat(ValueOf));
        try {
            if (file2.exists()) {
                App.f.put("thumb/thumb_".concat(String.valueOf(hexString)), file2);
                strArr[0] = "http://" + org.cybergarage.b.a.a() + ":" + App.l + "/thumb/thumb_" + hexString;
                strArr[1] = Long.toString(file2.length());
            } else {
                try {
                    file2.createNewFile();
                    mediaMetadataRetriever = new MediaMetadataRetriever();
                    try {
                        mediaMetadataRetriever.setDataSource(str);
                        if (Build$VERSION.SDK_INT >= 27) {
                            bitmapExtractThumbnail = mediaMetadataRetriever.getScaledFrameAtTime(-1L, 2, this.x, this.x);
                        } else {
                            ValueOf = mediaMetadataRetriever.getFrameAtTime(-1L, 2);
                            try {
                                bitmapExtractThumbnail = ThumbnailUtils.extractThumbnail(ValueOf, this.x, this.x);
                            } catch (IOException e3) {
                                e2 = e3;
                                length = mediaMetadataRetriever;
                                ValueOf = ValueOf;
                                Log.e("DlnaMediaServer", "getVideoThumbnail(String). filePath=".concat(String.valueOf(str)));
                                Log.e("DlnaMediaServer", "getVideoThumbnail(String)", e2);
                                if (length != 0) {
                                    if (Build$VERSION.SDK_INT >= 29) {
                                        length.close();
                                    }
                                    length.release();
                                }
                                if (ValueOf != 0) {
                                    ValueOf.recycle();
                                }
                            } catch (RuntimeException e4) {
                                e = e4;
                                length = mediaMetadataRetriever;
                                ValueOf = ValueOf;
                                Log.e("DlnaMediaServer", "getVideoThumbnail(String). filePath=".concat(String.valueOf(str)));
                                Log.e("DlnaMediaServer", "getVideoThumbnail(String)", e);
                                if (length != 0) {
                                    if (Build$VERSION.SDK_INT >= 29) {
                                        length.close();
                                    }
                                    length.release();
                                }
                                if (ValueOf != 0) {
                                    ValueOf.recycle();
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (mediaMetadataRetriever != 0) {
                                    if (Build$VERSION.SDK_INT >= 29) {
                                        mediaMetadataRetriever.close();
                                    }
                                    mediaMetadataRetriever.release();
                                }
                                if (ValueOf != 0) {
                                    ValueOf.recycle();
                                }
                                throw th;
                            }
                        }
                        if (bitmapExtractThumbnail != null) {
                            bitmapExtractThumbnail.compress(Bitmap$CompressFormat.JPEG, 80, new FileOutputStream(file2.getAbsolutePath()));
                        } else {
                            Log.e("DlnaMediaServer", "getVideoThumbnail(String). Cannot retrive thumbnail from " + str + " getFrameAtTime() == null");
                        }
                        if (Build$VERSION.SDK_INT >= 29) {
                            mediaMetadataRetriever.close();
                        }
                        mediaMetadataRetriever.release();
                        if (bitmapExtractThumbnail != null) {
                            bitmapExtractThumbnail.recycle();
                        }
                        App.f.put("thumb/thumb_".concat(String.valueOf(hexString)), file2);
                        strArr[0] = "http://" + org.cybergarage.b.a.a() + ":" + App.l + "/thumb/thumb_" + hexString;
                        strArr[1] = Long.toString(file2.length());
                    } catch (IOException e5) {
                        e2 = e5;
                        ValueOf = 0;
                        length = mediaMetadataRetriever;
                    } catch (RuntimeException e6) {
                        e = e6;
                        ValueOf = 0;
                        length = mediaMetadataRetriever;
                    } catch (Throwable th2) {
                        th = th2;
                        ValueOf = 0;
                    }
                } catch (IOException e7) {
                    e2 = e7;
                    ValueOf = 0;
                    length = 0;
                } catch (RuntimeException e8) {
                    e = e8;
                    ValueOf = 0;
                    length = 0;
                } catch (Throwable th3) {
                    th = th3;
                    ValueOf = 0;
                    mediaMetadataRetriever = 0;
                }
            }
            return strArr;
        } catch (Throwable th4) {
            th = th4;
            mediaMetadataRetriever = length;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x051d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String[] c(java.lang.String r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.al.dlnaserver.servers.DlnaMediaServer.c(java.lang.String):java.lang.String[]");
    }

    private String[] d(String str) {
        String[] strArr = {"", ""};
        File file = new File(str);
        String hexString = Integer.toHexString((String.valueOf(file.getAbsolutePath()) + file.lastModified() + file.length()).hashCode());
        File file2 = new File(getCacheDir(), "thumb_".concat(String.valueOf(hexString)));
        if (!file2.exists()) {
            Bitmap bitmap = null;
            try {
                try {
                    file2.createNewFile();
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, e(str));
                    if (bitmapDecodeFile != null) {
                        bitmapDecodeFile.compress(Bitmap$CompressFormat.JPEG, 80, new FileOutputStream(file2.getAbsolutePath()));
                    } else {
                        Log.e("DlnaMediaServer", "getImageThumbnail(String). Cannot retrive thumbnail from " + str + " BitmapFactory.decodeFile() == null");
                    }
                    if (bitmapDecodeFile != null) {
                        bitmapDecodeFile.recycle();
                    }
                    App.f.put("thumb/thumb_".concat(String.valueOf(hexString)), file2);
                    strArr[0] = "http://" + org.cybergarage.b.a.a() + ":" + App.l + "/thumb/thumb_" + hexString;
                    strArr[1] = Long.toString(file2.length());
                } catch (IOException e) {
                    Log.e("DlnaMediaServer", "getImageThumbnail(String)", e);
                    if (0 != 0) {
                        bitmap.recycle();
                    }
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    bitmap.recycle();
                }
                throw th;
            }
        } else {
            App.f.put("thumb/thumb_".concat(String.valueOf(hexString)), file2);
            strArr[0] = "http://" + org.cybergarage.b.a.a() + ":" + App.l + "/thumb/thumb_" + hexString;
            strArr[1] = Long.toString(file2.length());
        }
        return strArr;
    }

    @SuppressLint({"NewApi"})
    private String[] a(String str, long j, long j2) {
        Bitmap bitmap = null;
        String[] strArr = {"", ""};
        String hexString = Integer.toHexString((String.valueOf(str) + j + j2).hashCode());
        File file = new File(getCacheDir(), "thumb_".concat(String.valueOf(hexString)));
        try {
            if (!file.exists()) {
                try {
                    file.createNewFile();
                    Bitmap documentThumbnail = DocumentsContract.getDocumentThumbnail(getContentResolver(), Uri.parse(str), new Point(this.x, this.x), null);
                    if (documentThumbnail != null) {
                        documentThumbnail.compress(Bitmap$CompressFormat.JPEG, 80, new FileOutputStream(file.getAbsolutePath()));
                    } else {
                        Log.e("DlnaMediaServer", "getSAFThumbnail(). Cannot retrive thumbnail from " + str + " DocumentsContract.getDocumentThumbnail() == null");
                    }
                    if (documentThumbnail != null) {
                        documentThumbnail.recycle();
                    }
                    App.f.put("thumb/thumb_".concat(String.valueOf(hexString)), file);
                    strArr[0] = "http://" + org.cybergarage.b.a.a() + ":" + App.l + "/thumb/thumb_" + hexString;
                    strArr[1] = Long.toString(file.length());
                } catch (IOException e) {
                    Log.e("DlnaMediaServer", "getSAFThumbnail()", e);
                    if (0 != 0) {
                        bitmap.recycle();
                    }
                }
            } else {
                App.f.put("thumb/thumb_".concat(String.valueOf(hexString)), file);
                strArr[0] = "http://" + org.cybergarage.b.a.a() + ":" + App.l + "/thumb/thumb_" + hexString;
                strArr[1] = Long.toString(file.length());
            }
            return strArr;
        } catch (Throwable th) {
            if (0 != 0) {
                bitmap.recycle();
            }
            throw th;
        }
    }

    private String[] a(InputStream inputStream, String str, long j, long j2) {
        Bitmap bitmap = null;
        String[] strArr = {"", ""};
        String hexString = Integer.toHexString((String.valueOf(str) + j + j2).hashCode());
        File file = new File(getCacheDir(), "thumb_".concat(String.valueOf(hexString)));
        if (!file.exists()) {
            try {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, a(inputStream));
                    if (bitmapDecodeStream != null) {
                        bitmapDecodeStream.compress(Bitmap$CompressFormat.JPEG, 80, new FileOutputStream(file.getAbsolutePath()));
                    } else {
                        Log.e("DlnaMediaServer", "getSMBThumbnail(). Cannot retrive thumbnail from " + str + " BitmapFactory.decodeStream() == null");
                    }
                    if (bitmapDecodeStream != null) {
                        bitmapDecodeStream.recycle();
                    }
                    App.f.put("thumb/thumb_".concat(String.valueOf(hexString)), file);
                    strArr[0] = "http://" + org.cybergarage.b.a.a() + ":" + App.l + "/thumb/thumb_" + hexString;
                    strArr[1] = Long.toString(file.length());
                } catch (IOException e) {
                    Log.e("DlnaMediaServer", "getSMBThumbnail()", e);
                    if (0 != 0) {
                        bitmap.recycle();
                    }
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    bitmap.recycle();
                }
                throw th;
            }
        } else {
            App.f.put("thumb/thumb_".concat(String.valueOf(hexString)), file);
            strArr[0] = "http://" + org.cybergarage.b.a.a() + ":" + App.l + "/thumb/thumb_" + hexString;
            strArr[1] = Long.toString(file.length());
        }
        return strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String[] a(com.al.dlnaserver.customs.a r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.al.dlnaserver.servers.DlnaMediaServer.a(com.al.dlnaserver.customs.a):java.lang.String[]");
    }

    private BitmapFactory$Options e(String str) {
        BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
        bitmapFactory$Options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, bitmapFactory$Options);
        return a(bitmapFactory$Options);
    }

    private BitmapFactory$Options a(InputStream inputStream) {
        BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
        bitmapFactory$Options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, bitmapFactory$Options);
        return a(bitmapFactory$Options);
    }

    private BitmapFactory$Options a(BitmapFactory$Options bitmapFactory$Options) {
        int i = bitmapFactory$Options.outWidth;
        int i2 = bitmapFactory$Options.outHeight;
        int i3 = 1;
        while (i >= this.x && i2 >= this.x) {
            i /= 2;
            i2 /= 2;
            i3 *= 2;
        }
        bitmapFactory$Options.inJustDecodeBounds = false;
        bitmapFactory$Options.inPreferredConfig = Bitmap$Config.RGB_565;
        bitmapFactory$Options.inSampleSize = i3;
        if (Build$VERSION.SDK_INT < 24) {
            bitmapFactory$Options.inDither = true;
        }
        return bitmapFactory$Options;
    }

    private static String f(String str) {
        return str.replace("?", ";003").replace("&", ";026");
    }

    static /* synthetic */ void j(DlnaMediaServer dlnaMediaServer) {
        dlnaMediaServer.n();
    }

    private void n() {
        Intent intent = new Intent();
        intent.putExtra("serviceStarted", true);
        intent.setAction(String.valueOf(getPackageName()) + ".UIupdate");
        sendBroadcast(intent);
    }

    private void a(boolean z) {
        String str = String.valueOf(getPackageName()) + ".ServiceBroadcast";
        if (z) {
            ((AlarmManager) getSystemService("alarm")).setRepeating(0, System.currentTimeMillis(), 180000L, PendingIntent.getBroadcast(this, 0, new Intent(str), 0));
            this.D = new DlnaMediaServer$a(this, (byte) 0);
            registerReceiver(this.D, new IntentFilter(str));
            return;
        }
        ((AlarmManager) getSystemService("alarm")).cancel(PendingIntent.getBroadcast(this, 0, new Intent(str), 0));
        if (this.D != null) {
            unregisterReceiver(this.D);
        }
    }

    private void b(boolean z) {
        if (z) {
            WifiManager wifiManager = (WifiManager) getSystemService("wifi");
            if (this.B == null) {
                this.B = wifiManager.createWifiLock(3, "DlnaMediaServer");
            }
            if (this.C == null) {
                this.C = wifiManager.createMulticastLock("multicastLock");
            }
            this.B.setReferenceCounted(false);
            this.C.setReferenceCounted(true);
            if (!this.B.isHeld()) {
                try {
                    this.B.acquire();
                } catch (SecurityException e) {
                    Log.e("DlnaMediaServer", "mWifiLock()::acquire()", e);
                }
            }
            if (!this.C.isHeld()) {
                try {
                    this.C.acquire();
                } catch (SecurityException e2) {
                    Log.e("DlnaMediaServer", "mWifiMulticastLock()::acquire()", e2);
                }
            }
            if (this.E == null || this.E.isClosed()) {
                try {
                    this.E = new MulticastSocket();
                    NetworkInterface networkInterfaceA = com.al.dlnaserver.b.l.a();
                    if (networkInterfaceA != null) {
                        this.E.setNetworkInterface(networkInterfaceA);
                        Log.i("DlnaMediaServer", "MulticastInterface=" + networkInterfaceA.getName());
                        return;
                    }
                    return;
                } catch (IOException e3) {
                    Log.e("DlnaMediaServer", "makeWifiLock()::MulticastSocket()", e3);
                    return;
                }
            }
            return;
        }
        if (this.B != null && this.B.isHeld()) {
            this.B.release();
        }
        if (this.C != null && this.C.isHeld()) {
            this.C.release();
        }
        if (this.E != null && !this.E.isClosed()) {
            this.E.close();
        }
    }

    static /* synthetic */ void b(DlnaMediaServer dlnaMediaServer) {
        dlnaMediaServer.c(true);
    }

    @SuppressLint({"Wakelock"})
    private void c(boolean z) {
        if (z) {
            this.A = ((PowerManager) getSystemService("power")).newWakeLock(1, o() ? "LocationManagerService" : "dlnaserver wakelock");
            if (!this.A.isHeld()) {
                try {
                    this.A.acquire();
                    return;
                } catch (SecurityException e) {
                    Log.e("DlnaMediaServer", "makeWakeLock()::acquire()", e);
                    return;
                }
            }
            return;
        }
        if (this.A != null && this.A.isHeld()) {
            this.A.release();
        }
    }

    private static boolean o() {
        return Build.MANUFACTURER.toLowerCase(Locale.US).contains("huawei") || Build.MANUFACTURER.toLowerCase(Locale.US).contains("xiaomi") || Build.MANUFACTURER.toLowerCase(Locale.US).contains("meizu") || Build.MANUFACTURER.toLowerCase(Locale.US).contains("oneplus") || Build.MANUFACTURER.toLowerCase(Locale.US).contains("oppo") || Build.MANUFACTURER.toLowerCase(Locale.US).contains("vivo");
    }

    static /* synthetic */ void a(DlnaMediaServer dlnaMediaServer, String str) {
        dlnaMediaServer.g(str);
    }

    private void g(String str) {
        if (App.e) {
            new Handler(Looper.getMainLooper()).post(new h(this, str));
        }
    }

    static /* synthetic */ void e(DlnaMediaServer dlnaMediaServer) {
        App.b = false;
        dlnaMediaServer.r.setContentText(String.valueOf(dlnaMediaServer.getString(R$string.notify_msg)) + " " + org.cybergarage.b.a.a() + ":" + App.l + " [" + org.cybergarage.b.a.b() + "]");
        NotificationManager notificationManager = (NotificationManager) dlnaMediaServer.getSystemService("notification");
        if (Build$VERSION.SDK_INT >= 16) {
            notificationManager.notify(2, dlnaMediaServer.r.build());
        } else {
            notificationManager.notify(2, dlnaMediaServer.r.getNotification());
        }
        if (App.a) {
            try {
                dlnaMediaServer.p.p();
            } catch (Exception e) {
                App.c = true;
                dlnaMediaServer.g(dlnaMediaServer.getString(R$string.some_errors_server));
                Log.e("DlnaMediaServer", "startServer()", e);
            }
            dlnaMediaServer.s = new com.al.dlnaserver.customs.k(dlnaMediaServer.t, dlnaMediaServer.getApplicationContext());
            ContentResolver contentResolver = dlnaMediaServer.getContentResolver();
            if (contentResolver != null) {
                contentResolver.registerContentObserver(MediaStore$Video$Media.EXTERNAL_CONTENT_URI, true, dlnaMediaServer.s);
                contentResolver.registerContentObserver(MediaStore$Images$Media.EXTERNAL_CONTENT_URI, true, dlnaMediaServer.s);
                contentResolver.registerContentObserver(MediaStore$Audio$Media.EXTERNAL_CONTENT_URI, true, dlnaMediaServer.s);
            }
            dlnaMediaServer.m();
            dlnaMediaServer.n();
            return;
        }
        dlnaMediaServer.n();
        dlnaMediaServer.stopSelf();
    }

    static /* synthetic */ void f(DlnaMediaServer dlnaMediaServer) {
        if (dlnaMediaServer.q == null) {
            try {
                dlnaMediaServer.q = new j(dlnaMediaServer.getApplicationContext(), App.l);
                dlnaMediaServer.q.a(dlnaMediaServer.w);
                dlnaMediaServer.q.c();
            } catch (IOException e) {
                App.c = true;
                dlnaMediaServer.g(dlnaMediaServer.getString(R$string.some_errors_server));
                Log.e("DlnaMediaServer", "startHTTPServer()", e);
            }
        }
    }

    static /* synthetic */ void i(DlnaMediaServer dlnaMediaServer) throws Throwable {
        App.m = 0;
        App.n = 0;
        App.d = true;
        App.f.clear();
        App.g.clear();
        App.h.clear();
        App.i.clear();
        App.k.clear();
        App.j.clear();
        App.f.putAll(dlnaMediaServer.o);
        new g(dlnaMediaServer, "DlnaMediaServer.UIUpdater").start();
        dlnaMediaServer.t.postDelayed(new f(dlnaMediaServer), 10000L);
        org.cybergarage.d.e.a.a.d dVarS = null;
        try {
            dVarS = dlnaMediaServer.p.s();
            n nVar = new n();
            org.cybergarage.d.e.a.a.b.b.i iVar = new org.cybergarage.d.e.a.a.b.b.i();
            org.cybergarage.d.e.a.a.b.b.g gVar = new org.cybergarage.d.e.a.a.b.b.g();
            org.cybergarage.d.e.a.a.b.b.b bVar = new org.cybergarage.d.e.a.a.b.b.b();
            org.cybergarage.d.e.a.a.b.b.h hVar = new org.cybergarage.d.e.a.a.b.b.h();
            org.cybergarage.d.e.a.a.b.b.d dVar = new org.cybergarage.d.e.a.a.b.b.d();
            o oVar = new o(nVar);
            z zVar = new z(nVar);
            aa aaVar = new aa(nVar);
            ab abVar = new ab(nVar);
            ac acVar = new ac(nVar);
            ad adVar = new ad(nVar);
            ae aeVar = new ae(nVar);
            af afVar = new af(nVar);
            ag agVar = new ag(nVar);
            p pVar = new p(nVar);
            q qVar = new q(nVar);
            r rVar = new r(nVar);
            s sVar = new s(nVar);
            t tVar = new t(nVar);
            u uVar = new u(nVar);
            v vVar = new v(nVar);
            w wVar = new w(nVar);
            x xVar = new x(nVar);
            y yVar = new y(nVar);
            dVarS.a(acVar);
            dVarS.a(yVar);
            dVarS.a(xVar);
            dVarS.a(wVar);
            dVarS.a(vVar);
            dVarS.a(uVar);
            dVarS.a(tVar);
            dVarS.a(sVar);
            dVarS.a(rVar);
            dVarS.a(qVar);
            dVarS.a(pVar);
            dVarS.a(agVar);
            dVarS.a(afVar);
            dVarS.a(aeVar);
            dVarS.a(adVar);
            dVarS.a(abVar);
            dVarS.a(aaVar);
            dVarS.a(zVar);
            dVarS.a(oVar);
            dVarS.a(dVar);
            dVarS.a(hVar);
            dVarS.a(bVar);
            dVarS.a(gVar);
            dVarS.a(iVar);
            dVarS.b().l();
        } catch (Exception e) {
            App.c = true;
            Log.e("DlnaMediaServer", "setMediaContent()::mediaServer.getContentDirectory().getRootNode().removeAllContentNodes()", e);
        }
        if (dlnaMediaServer.v != null) {
            if (org.cybergarage.e.a.a) {
                Log.d("DlnaMediaServer", "pathsList=" + dlnaMediaServer.v);
            }
        } else {
            Log.w("DlnaMediaServer", "pathsList=null");
        }
        if (App.a) {
            try {
                dlnaMediaServer.e();
            } catch (Exception e2) {
                App.c = true;
                Log.e("DlnaMediaServer", "setMediaContent()::addAudio()", e2);
            }
        }
        if (App.a) {
            try {
                dlnaMediaServer.g();
            } catch (Exception e3) {
                App.c = true;
                Log.e("DlnaMediaServer", "setMediaContent()::addImage()", e3);
            }
        }
        if (App.a) {
            try {
                dlnaMediaServer.f();
            } catch (Exception e4) {
                App.c = true;
                Log.e("DlnaMediaServer", "setMediaContent()::addVideo()", e4);
            }
        }
        if (App.a) {
            try {
                dlnaMediaServer.h();
            } catch (Exception e5) {
                App.c = true;
                Log.e("DlnaMediaServer", "setMediaContent()::addFiles()", e5);
            }
        }
        if (App.a) {
            try {
                dlnaMediaServer.i();
            } catch (Exception e6) {
                App.c = true;
                Log.e("DlnaMediaServer", "setMediaContent()::addSAFContent()", e6);
            }
        }
        if (App.a) {
            try {
                dlnaMediaServer.j();
            } catch (Exception e7) {
                App.c = true;
                Log.e("DlnaMediaServer", "setMediaContent()::addSMBContent()", e7);
            }
        }
        if (App.a) {
            try {
                dlnaMediaServer.k();
            } catch (Exception e8) {
                App.c = true;
                Log.e("DlnaMediaServer", "setMediaContent()::addFTPContent()", e8);
            }
        }
        if (App.a) {
            try {
                dlnaMediaServer.l();
            } catch (Exception e9) {
                App.c = true;
                Log.e("DlnaMediaServer", "setMediaContent()::addPlayLists()", e9);
            }
        }
        if (App.c) {
            dlnaMediaServer.g(dlnaMediaServer.getString(R$string.some_errors_content));
        }
        if (dVarS != null) {
            dVarS.a();
        }
        App.d = false;
        dlnaMediaServer.z = null;
        dlnaMediaServer.n();
    }
}
