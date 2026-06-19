package com.p033al.dlnaserver.servers;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.Icon;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Log;
import com.p033al.dlnaserver.App;
import com.p033al.dlnaserver.C0303R;
import com.p033al.dlnaserver.MainActivity;
import com.p033al.dlnaserver.customs.C0378a;
import com.p033al.dlnaserver.customs.C0379b;
import com.p033al.dlnaserver.customs.C0388k;
import com.p033al.dlnaserver.customs.FileObserverC0386i;
import com.p033al.dlnaserver.p034a.C0305a;
import com.p033al.dlnaserver.p034a.C0306b;
import com.p033al.dlnaserver.p035b.C0348bm;
import com.p033al.dlnaserver.p035b.C0349c;
import com.p033al.dlnaserver.p035b.C0358l;
import com.p033al.dlnaserver.p035b.C0360n;
import com.p033al.dlnaserver.p036c.C0374a;
import com.p033al.dlnaserver.p036c.C0376c;
import com.p033al.dlnaserver.p036c.C0377d;
import com.p033al.dlnaserver.receivers.NotificationReceiver;
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
import java.util.Timer;
import org.cybergarage.p155b.C1637a;
import org.cybergarage.p157d.C1736h;
import org.cybergarage.p157d.p162e.p163a.p164a.C1724d;
import org.cybergarage.p157d.p162e.p163a.p164a.C1727g;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.AbstractC1689a;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.C1702c;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.p167a.C1690a;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.p167a.C1691b;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.p168b.C1694b;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.p168b.C1696d;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.p168b.C1699g;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.p168b.C1700h;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.p168b.C1701i;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.p169c.C1703a;
import org.cybergarage.p173e.C1744a;
import org.cybergarage.xml.C1750a;
import org.cybergarage.xml.C1751b;
import p000a.p029g.C0215ae;

/* JADX INFO: loaded from: classes.dex */
public class DlnaMediaServer extends Service {

    /* JADX INFO: renamed from: A */
    private PowerManager.WakeLock f1484A;

    /* JADX INFO: renamed from: B */
    private WifiManager.WifiLock f1485B;

    /* JADX INFO: renamed from: C */
    private WifiManager.MulticastLock f1486C;

    /* JADX INFO: renamed from: D */
    private C0398a f1487D;

    /* JADX INFO: renamed from: E */
    private MulticastSocket f1488E;

    /* JADX INFO: renamed from: a */
    private String f1489a;

    /* JADX INFO: renamed from: b */
    private String f1490b;

    /* JADX INFO: renamed from: c */
    private String f1491c;

    /* JADX INFO: renamed from: d */
    private String f1492d;

    /* JADX INFO: renamed from: e */
    private String f1493e;

    /* JADX INFO: renamed from: f */
    private String f1494f;

    /* JADX INFO: renamed from: g */
    private String f1495g;

    /* JADX INFO: renamed from: h */
    private String f1496h;

    /* JADX INFO: renamed from: i */
    private String f1497i;

    /* JADX INFO: renamed from: j */
    private String f1498j;

    /* JADX INFO: renamed from: k */
    private String f1499k;

    /* JADX INFO: renamed from: l */
    private String f1500l;

    /* JADX INFO: renamed from: m */
    private String f1501m;

    /* JADX INFO: renamed from: n */
    private String f1502n;

    /* JADX INFO: renamed from: q */
    private volatile C0415j f1505q;

    /* JADX INFO: renamed from: r */
    private volatile Notification.Builder f1506r;

    /* JADX INFO: renamed from: s */
    private volatile C0388k f1507s;

    /* JADX INFO: renamed from: t */
    private volatile Handler f1508t;

    /* JADX INFO: renamed from: u */
    private BroadcastReceiver f1509u;

    /* JADX INFO: renamed from: v */
    private ArrayList<String> f1510v;

    /* JADX INFO: renamed from: w */
    private String f1511w;

    /* JADX INFO: renamed from: x */
    private int f1512x;

    /* JADX INFO: renamed from: z */
    private volatile Thread f1514z;

    /* JADX INFO: renamed from: o */
    private volatile Map<String, File> f1503o = new HashMap();

    /* JADX INFO: renamed from: p */
    private volatile C1727g f1504p = null;

    /* JADX INFO: renamed from: y */
    private List<FileObserverC0386i> f1513y = Collections.synchronizedList(new ArrayList());

    @Override // android.app.Service
    @SuppressLint({"InlinedApi"})
    public void onCreate() {
        Notification notification;
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
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
        this.f1509u = new C0399a(this);
        if (C0358l.m1043b(this)) {
            m1125b(true);
        }
        m1130c(true);
        m1116a(true);
        registerReceiver(this.f1509u, intentFilter);
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.setFlags(603979776);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 0);
        Intent intent2 = new Intent(this, (Class<?>) NotificationReceiver.class);
        intent2.setAction("com.al.dlnaserver.stop");
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 123, intent2, 0);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1506r = new Notification.Builder(this, "com.al.dlnaserver.N1");
            this.f1506r.setChannelId("com.al.dlnaserver.N1");
        } else {
            this.f1506r = new Notification.Builder(this);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1506r.addAction(new Notification.Action.Builder(Icon.createWithResource(this, C0303R.drawable.ic_close), getString(C0303R.string.action_stop), broadcast).build());
        } else if (Build.VERSION.SDK_INT >= 16) {
            this.f1506r.addAction(C0303R.drawable.ic_close, getString(C0303R.string.action_stop), broadcast);
        }
        this.f1506r.setSmallIcon(C0303R.drawable.ic_notify).setContentTitle(getString(C0303R.string.app_name)).setContentText(getString(C0303R.string.notify_msg_starting)).setContentIntent(activity).setAutoCancel(false).setOngoing(true);
        if (Build.VERSION.SDK_INT >= 16) {
            notification = this.f1506r.build();
        } else {
            notification = this.f1506r.getNotification();
        }
        startForeground(2, notification);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (App.f1269a || App.f1270b) {
            Log.i("DlnaMediaServer", "Detected another instance, stoping this");
            stopSelf();
        }
        App.f1270b = true;
        this.f1502n = getString(C0303R.string.dlna_title_artist);
        this.f1489a = getString(C0303R.string.dlna_title_audios);
        this.f1490b = getString(C0303R.string.dlna_title_videos);
        this.f1491c = getString(C0303R.string.dlna_title_images);
        this.f1492d = getString(C0303R.string.dlna_title_files);
        this.f1493e = getString(C0303R.string.dlna_title_smb);
        this.f1494f = getString(C0303R.string.dlna_title_ftp);
        this.f1495g = getString(C0303R.string.dlna_title_playlists);
        this.f1496h = getString(C0303R.string.dlna_title_all_audios);
        this.f1497i = getString(C0303R.string.dlna_title_all_videos);
        this.f1498j = getString(C0303R.string.dlna_title_all_images);
        this.f1499k = getString(C0303R.string.dlna_title_all_files);
        this.f1500l = getString(C0303R.string.dlna_title_recently_added);
        this.f1501m = getString(C0303R.string.dlna_title_folders);
        if (intent != null) {
            this.f1510v = intent.getStringArrayListExtra("pathsList");
            Log.i("DlnaMediaServer", "Service is starting...");
        } else {
            this.f1510v = C0360n.m1052c(this, "pathsList");
            Log.i("DlnaMediaServer", "Service was restarted by system...");
        }
        this.f1511w = C0360n.m1051b(this, "ip_white_list");
        String strM1051b = C0360n.m1051b(this, "custom_fileserver_port");
        if (!strM1051b.isEmpty()) {
            try {
                int i3 = Integer.parseInt(strM1051b);
                App.f1280l = i3;
                if (i3 <= 0 || App.f1280l > 65535) {
                    App.f1280l = 18192;
                    C0360n.m1047a(this, "custom_fileserver_port", "");
                    Log.e("DlnaMediaServer", "Custom fileserver port out of range 1..65535");
                }
            } catch (Exception e) {
                App.f1280l = 18192;
                C0360n.m1047a(this, "custom_fileserver_port", "");
                Log.e("DlnaMediaServer", "Setting custom fileserver port", e);
            }
        } else {
            App.f1280l = 18192;
        }
        String strM1051b2 = C0360n.m1051b(this, "thumbs_quality");
        if ("XLarge".equals(strM1051b2)) {
            this.f1512x = 1024;
        } else if ("Large".equals(strM1051b2)) {
            this.f1512x = 512;
        } else if ("Normal".equals(strM1051b2)) {
            this.f1512x = 256;
        } else {
            this.f1512x = 128;
        }
        this.f1508t = new Handler();
        C0348bm.m1016a(this, true);
        new C0407b(this, "DlnaMediaServer.DLNA-Init-Start").start();
        new C0408c(this, "DlnaMediaServer.HTTPD-Start").start();
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        Log.i("DlnaMediaServer", "Service stoped");
        C0348bm.m1016a(this, false);
        m1122b();
        if (this.f1505q != null) {
            this.f1505q.m1324d();
        }
        this.f1505q = null;
        stopForeground(true);
        if (this.f1509u != null) {
            unregisterReceiver(this.f1509u);
        }
        m1130c(false);
        m1125b(false);
        m1116a(false);
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0153  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void m1103a() {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p033al.dlnaserver.servers.DlnaMediaServer.m1103a():void");
    }

    /* JADX INFO: renamed from: b */
    private synchronized void m1122b() {
        App.f1269a = false;
        App.f1270b = false;
        m1132d();
        new C0409d(this, "DlnaMediaServer.DLNA-Stop").start();
        if (this.f1507s != null) {
            ContentResolver contentResolver = getContentResolver();
            if (contentResolver != null) {
                contentResolver.unregisterContentObserver(this.f1507s);
            }
            this.f1507s = null;
        }
        if (this.f1513y != null) {
            synchronized (this.f1513y) {
                for (FileObserverC0386i fileObserverC0386i : this.f1513y) {
                    if (fileObserverC0386i.m1091b()) {
                        fileObserverC0386i.stopWatching();
                        fileObserverC0386i.m1090a(false);
                    }
                }
                this.f1513y.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m1127c() {
        m1132d();
        App.f1269a = true;
        this.f1514z = new C0410e(this, "DlnaMediaServer.ScanMedia");
        try {
            this.f1514z.start();
        } catch (IllegalThreadStateException e) {
            Log.e("DlnaMediaServer", "scanMedia()::scanningThread.start() Thread already running", e);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m1132d() {
        if (this.f1514z != null) {
            if (this.f1514z.isAlive() || App.f1272d) {
                App.f1269a = false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (App.f1272d && this.f1514z != null) {
                try {
                    Thread.sleep(200L);
                } catch (Exception e) {
                }
                if (System.currentTimeMillis() - jCurrentTimeMillis > 7000) {
                    break;
                }
            }
            this.f1514z = null;
            App.f1272d = false;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m1136e() throws Throwable {
        String str;
        int i;
        String str2;
        if (this.f1510v != null && !this.f1510v.isEmpty()) {
            str = "";
            int i2 = 0;
            for (String str3 : this.f1510v) {
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
        if (C0360n.m1050a(this, "sort_title")) {
            str2 = "title ASC";
        } else {
            str2 = "_data ASC";
        }
        Cursor cursorQuery = getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "album_id", "title", "_display_name", "_data", "_size", "artist", "album", "track", "duration", "mime_type", "date_modified"}, str4, null, str2);
        if (cursorQuery != null && cursorQuery.moveToFirst()) {
            C1690a c1690aM1101a = m1101a("a", this.f1489a);
            C1690a c1690aM1102a = m1102a(c1690aM1101a, "a", this.f1501m, "rf");
            C1690a c1690aM1102a2 = null;
            boolean zM1050a = C0360n.m1050a(this, "show_thumbs_audio");
            boolean z = !C0360n.m1050a(this, "no_all_media");
            boolean zM1050a2 = C0360n.m1050a(this, "flat_style");
            boolean zM1050a3 = C0360n.m1050a(this, "display_file_name");
            boolean zM1050a4 = C0360n.m1050a(this, "add_artist_album");
            String string = getString(C0303R.string.dlna_title_unknown);
            if (zM1050a4) {
                c1690aM1102a2 = m1102a(c1690aM1101a, "a", this.f1502n, "af");
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
                    String strM1138f = m1138f(String.valueOf(String.valueOf(App.f1281m)) + "_" + str5);
                    App.f1274f.put(strM1138f, new File(string2));
                    String strEncode = URLEncoder.encode(strM1138f, "UTF-8");
                    if (string8 == null || string8.isEmpty()) {
                        string8 = "audio/*";
                    }
                    String strM1029i = C0349c.m1029i(string8);
                    long j4 = 0;
                    if (j2 > 0 && j2 / 1000 > 0) {
                        j4 = j / (j2 / 1000);
                    }
                    C1703a c1703a = new C1703a();
                    c1703a.m5145c("id", strEncode);
                    c1703a.m4872c(zM1050a3 ? str5.replace("&", "&amp;") : string3.replace("&", "&amp;"));
                    c1703a.m4871b("dc:creator", str6);
                    c1703a.m4871b("upnp:album", string6);
                    c1703a.m4871b("upnp:artist", str6);
                    c1703a.m4871b("upnp:originalTrackNumber", string7);
                    c1703a.m5141a("restricted", 1);
                    c1703a.m5145c("parentID", "a");
                    c1703a.m4875d("object.item.audioItem.musicTrack");
                    c1703a.m4871b("dc:date", m1120b(1000 * j3));
                    c1703a.m5145c("rawDate", String.valueOf(j3));
                    String str7 = "http://" + C1637a.m4702a() + ":" + App.f1280l + "/" + strEncode;
                    String strM1100a = m1100a("object.item.audioItem.musicTrack", strM1029i, C0349c.m1018a(str5));
                    C1751b c1751b = new C1751b();
                    c1751b.add(new C1750a("size", Long.toString(j)));
                    c1751b.add(new C1750a("duration", m1099a(j2)));
                    if (j4 > 0) {
                        c1751b.add(new C1750a("bitrate", Long.toString(j4)));
                    }
                    c1703a.m4896b(str7, strM1100a, c1751b);
                    if (zM1050a) {
                        String[] strArrM1131c = m1131c(string2);
                        m1114a(c1703a, strArrM1131c[0], strArrM1131c[1]);
                    }
                    if (z) {
                        m1112a(c1690aM1101a, c1703a, "a");
                    }
                    if (zM1050a2) {
                        m1124b(c1690aM1102a, c1703a, string2, "a");
                    } else {
                        m1113a(c1690aM1102a, c1703a, string2, "a");
                    }
                    if (zM1050a4 && c1690aM1102a2 != null) {
                        m1129c(c1690aM1102a2, c1703a, str6, string6);
                    }
                    arrayList.add(c1703a);
                    if (C1744a.f6521a) {
                        Log.i("DlnaMediaServer", "addAudio()::item=" + c1703a.toString());
                    }
                    App.f1281m++;
                }
                if (!cursorQuery.moveToNext()) {
                    break;
                }
            } while (App.f1269a);
            m1111a(c1690aM1101a, arrayList, "a");
            Log.i("DlnaMediaServer", "addAudio()::list size = ".concat(String.valueOf(i)));
        } else {
            Log.i("DlnaMediaServer", "addAudio()::cursor is empty");
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
    }

    /* JADX INFO: renamed from: f */
    private void m1139f() throws Throwable {
        String str;
        int i;
        String str2;
        if (this.f1510v != null && !this.f1510v.isEmpty()) {
            str = "";
            int i2 = 0;
            for (String str3 : this.f1510v) {
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
        if (C0360n.m1050a(this, "sort_title")) {
            str2 = "title ASC";
        } else {
            str2 = "_data ASC";
        }
        Cursor cursorQuery = getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "title", "_display_name", "_data", "artist", "album", "_size", "duration", "resolution", "mime_type", "date_modified"}, str4, null, str2);
        if (cursorQuery != null && cursorQuery.moveToFirst()) {
            C1690a c1690aM1101a = m1101a("v", this.f1490b);
            C1690a c1690aM1102a = m1102a(c1690aM1101a, "v", this.f1501m, "rf");
            C1690a c1690aM1102a2 = null;
            boolean zM1050a = C0360n.m1050a(this, "show_thumbs");
            boolean z = !C0360n.m1050a(this, "no_all_media");
            boolean zM1050a2 = C0360n.m1050a(this, "flat_style");
            boolean zM1050a3 = C0360n.m1050a(this, "display_file_name");
            boolean zM1050a4 = C0360n.m1050a(this, "add_artist_album");
            String string = getString(C0303R.string.dlna_title_unknown);
            if (zM1050a4) {
                c1690aM1102a2 = m1102a(c1690aM1101a, "v", this.f1502n, "af");
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
                    String strM1138f = m1138f(String.valueOf(String.valueOf(App.f1281m)) + "_" + string4);
                    App.f1274f.put(strM1138f, new File(string2));
                    String strEncode = URLEncoder.encode(strM1138f, "UTF-8");
                    if (string7 == null || string7.isEmpty()) {
                        string7 = "video/*";
                    }
                    String strM1029i = C0349c.m1029i(string7);
                    long j4 = 0;
                    if (j2 > 0 && j2 / 1000 > 0) {
                        j4 = j / (j2 / 1000);
                    }
                    C1703a c1703a = new C1703a();
                    c1703a.m5145c("id", strEncode);
                    c1703a.m4872c(zM1050a3 ? string4.replace("&", "&amp;") : string3.replace("&", "&amp;"));
                    c1703a.m4871b("dc:creator", str5);
                    c1703a.m4871b("upnp:album", string6);
                    c1703a.m4871b("upnp:artist", str5);
                    c1703a.m5141a("restricted", 1);
                    c1703a.m5145c("parentID", "v");
                    c1703a.m4875d("object.item.videoItem");
                    c1703a.m4871b("dc:date", m1120b(1000 * j3));
                    c1703a.m5145c("rawDate", String.valueOf(j3));
                    String str6 = "http://" + C1637a.m4702a() + ":" + App.f1280l + "/" + strEncode;
                    String strM1100a = m1100a("object.item.videoItem", strM1029i, "");
                    C1751b c1751b = new C1751b();
                    c1751b.add(new C1750a("size", Long.toString(j)));
                    c1751b.add(new C1750a("duration", m1099a(j2)));
                    c1751b.add(new C1750a("resolution", string8));
                    if (j4 > 0) {
                        c1751b.add(new C1750a("bitrate", Long.toString(j4)));
                    }
                    c1703a.m4896b(str6, strM1100a, c1751b);
                    if (zM1050a) {
                        String[] strArrM1126b = m1126b(string2);
                        m1114a(c1703a, strArrM1126b[0], strArrM1126b[1]);
                    }
                    m1106a(App.f1281m, string3, string2, c1703a);
                    if (z) {
                        m1112a(c1690aM1101a, c1703a, "v");
                    }
                    if (zM1050a2) {
                        m1124b(c1690aM1102a, c1703a, string2, "v");
                    } else {
                        m1113a(c1690aM1102a, c1703a, string2, "v");
                    }
                    if (zM1050a4 && c1690aM1102a2 != null) {
                        m1129c(c1690aM1102a2, c1703a, str5, string6);
                    }
                    arrayList.add(c1703a);
                    if (C1744a.f6521a) {
                        Log.i("DlnaMediaServer", "addVideo()::item=" + c1703a.toString());
                    }
                    App.f1281m++;
                }
                if (!cursorQuery.moveToNext()) {
                    break;
                }
            } while (App.f1269a);
            m1111a(c1690aM1101a, arrayList, "v");
            Log.i("DlnaMediaServer", "addVideo()::list size = ".concat(String.valueOf(i)));
        } else {
            Log.i("DlnaMediaServer", "addVideo()::cursor is empty");
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: g */
    private void m1142g() throws UnsupportedEncodingException {
        String str;
        int i;
        String str2;
        Cursor cursorQuery;
        String str3;
        if (this.f1510v != null && !this.f1510v.isEmpty()) {
            str = "";
            int i2 = 0;
            for (String str4 : this.f1510v) {
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
        if (C0360n.m1050a(this, "sort_title")) {
            str2 = "title ASC";
        } else {
            str2 = "_data ASC";
        }
        if (Build.VERSION.SDK_INT >= 16) {
            cursorQuery = getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "title", "_display_name", "_data", "_size", "mime_type", "date_modified", "width", "height"}, str5, null, str2);
        } else {
            cursorQuery = getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "title", "_display_name", "_data", "_size", "mime_type", "date_modified"}, str5, null, str2);
        }
        if (cursorQuery != null && cursorQuery.moveToFirst()) {
            C1690a c1690aM1101a = m1101a("i", this.f1491c);
            C1690a c1690aM1102a = m1102a(c1690aM1101a, "i", this.f1501m, "rf");
            boolean zM1050a = C0360n.m1050a(this, "show_thumbs_image");
            boolean z = !C0360n.m1050a(this, "no_all_media");
            boolean zM1050a2 = C0360n.m1050a(this, "flat_style");
            boolean zM1050a3 = C0360n.m1050a(this, "display_file_name");
            ArrayList arrayList = new ArrayList();
            do {
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (new File(string).exists()) {
                    String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("title"));
                    String string3 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                    String string4 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("mime_type"));
                    long j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_size"));
                    long j2 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("date_modified"));
                    if (Build.VERSION.SDK_INT >= 16) {
                        str3 = String.valueOf(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("width"))) + "x" + cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("height"));
                    } else {
                        str3 = "";
                    }
                    if (string3 == null) {
                        string3 = string2;
                    }
                    String strM1138f = m1138f(String.valueOf(String.valueOf(App.f1281m)) + "_" + string3);
                    App.f1274f.put(strM1138f, new File(string));
                    String strEncode = URLEncoder.encode(strM1138f, "UTF-8");
                    if (string4 == null || string4.isEmpty()) {
                        string4 = "image/*";
                    }
                    String strM1029i = C0349c.m1029i(string4);
                    C1703a c1703a = new C1703a();
                    c1703a.m5145c("id", strEncode);
                    c1703a.m4872c(zM1050a3 ? string3.replace("&", "&amp;") : string2.replace("&", "&amp;"));
                    c1703a.m5141a("restricted", 1);
                    c1703a.m5145c("parentID", "i");
                    c1703a.m4875d("object.item.imageItem.photo");
                    c1703a.m4871b("dc:date", m1120b(1000 * j2));
                    c1703a.m5145c("rawDate", String.valueOf(j2));
                    String str6 = "http://" + C1637a.m4702a() + ":" + App.f1280l + "/" + strEncode;
                    String strM1100a = m1100a("object.item.imageItem.photo", strM1029i, "");
                    C1751b c1751b = new C1751b();
                    c1751b.add(new C1750a("size", Long.toString(j)));
                    c1751b.add(new C1750a("resolution", str3));
                    c1703a.m4896b(str6, strM1100a, c1751b);
                    if (zM1050a) {
                        String[] strArrM1134d = m1134d(string);
                        m1114a(c1703a, strArrM1134d[0], strArrM1134d[1]);
                    }
                    if (z) {
                        m1112a(c1690aM1101a, c1703a, "i");
                    }
                    if (zM1050a2) {
                        m1124b(c1690aM1102a, c1703a, string, "i");
                    } else {
                        m1113a(c1690aM1102a, c1703a, string, "i");
                    }
                    arrayList.add(c1703a);
                    if (C1744a.f6521a) {
                        Log.i("DlnaMediaServer", "addImage()::item=" + c1703a.toString());
                    }
                    App.f1281m++;
                }
                if (!cursorQuery.moveToNext()) {
                    break;
                }
            } while (App.f1269a);
            m1111a(c1690aM1101a, arrayList, "i");
            Log.i("DlnaMediaServer", "addImage()::list size = ".concat(String.valueOf(i)));
        } else {
            Log.i("DlnaMediaServer", "addImage()::cursor is empty");
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
    }

    /* JADX INFO: renamed from: h */
    private void m1144h() throws Throwable {
        String str;
        if (this.f1510v != null) {
            ArrayList<File> arrayList = new ArrayList();
            for (String str2 : this.f1510v) {
                if (str2.startsWith("*")) {
                    if (!App.f1269a) {
                        break;
                    }
                    m1108a(str2.replace("*", ""));
                    new C0376c(arrayList).m1071a(new File(str2.replace("*", "")));
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
                m1109a(arrayList2);
                Log.i("DlnaMediaServer", "addPlayLists()::list size = " + arrayList2.size());
            }
            if (!arrayList.isEmpty()) {
                C1690a c1690aM1101a = m1101a("f", this.f1492d);
                Collections.sort(arrayList);
                boolean zM1050a = C0360n.m1050a(this, "show_thumbs");
                boolean zM1050a2 = C0360n.m1050a(this, "show_thumbs_image");
                boolean zM1050a3 = C0360n.m1050a(this, "show_thumbs_audio");
                boolean z = !C0360n.m1050a(this, "no_all_media");
                boolean zM1050a4 = C0360n.m1050a(this, "flat_style");
                ArrayList arrayList3 = new ArrayList();
                for (File file2 : arrayList) {
                    if (!App.f1269a) {
                        break;
                    }
                    String strM1022c = C0349c.m1022c(file2.getName());
                    if (file2.isFile()) {
                        String strM1019a = C0349c.m1019a(file2.getName(), null);
                        if (strM1019a == null) {
                            strM1019a = "application/octet-stream";
                        }
                        long length = file2.length();
                        long jLastModified = file2.lastModified();
                        String strM1138f = m1138f(String.valueOf(String.valueOf(App.f1281m)) + "_" + strM1022c + "." + C0349c.m1018a(file2.getName()));
                        App.f1274f.put(strM1138f, file2);
                        String strEncode = URLEncoder.encode(strM1138f, "UTF-8");
                        String strM1018a = "";
                        String[] strArrM1126b = null;
                        boolean z2 = false;
                        if (C0349c.m1026f(file2.getName())) {
                            str = "object.item.audioItem.musicTrack";
                            strM1018a = C0349c.m1018a(file2.getName());
                            if (zM1050a3) {
                                strArrM1126b = m1131c(file2.getAbsolutePath());
                            }
                        } else if (C0349c.m1027g(file2.getName())) {
                            str = "object.item.imageItem.photo";
                            if (zM1050a2) {
                                strArrM1126b = m1134d(file2.getAbsolutePath());
                            }
                        } else if (C0349c.m1028h(file2.getName())) {
                            str = "object.item.textItem";
                        } else {
                            z2 = true;
                            str = "object.item.videoItem";
                            if (zM1050a) {
                                strArrM1126b = m1126b(file2.getAbsolutePath());
                            }
                        }
                        String strM1100a = m1100a(str, strM1019a, strM1018a);
                        C1703a c1703a = new C1703a();
                        c1703a.m5145c("id", strEncode);
                        c1703a.m4872c(strM1022c.replace("&", "&amp;"));
                        c1703a.m5141a("restricted", 1);
                        c1703a.m5145c("parentID", c1690aM1101a.m5158j("parentID"));
                        c1703a.m4875d(str);
                        c1703a.m4871b("dc:date", m1120b(jLastModified));
                        c1703a.m5145c("rawDate", String.valueOf(jLastModified));
                        String str3 = "http://" + C1637a.m4702a() + ":" + App.f1280l + "/" + strEncode;
                        C1751b c1751b = new C1751b();
                        c1751b.add(new C1750a("size", Long.toString(length)));
                        c1703a.m4896b(str3, strM1100a, c1751b);
                        if (strArrM1126b != null) {
                            m1114a(c1703a, strArrM1126b[0], strArrM1126b[1]);
                        }
                        if (z2) {
                            m1104a(App.f1281m, strM1022c, file2, c1703a);
                        }
                        if (z) {
                            m1112a(c1690aM1101a, c1703a, "f");
                        }
                        if (zM1050a4) {
                            m1124b(c1690aM1101a, c1703a, file2.getAbsolutePath(), "f");
                        } else {
                            m1113a(c1690aM1101a, c1703a, file2.getAbsolutePath(), "f");
                        }
                        arrayList3.add(c1703a);
                        if (C1744a.f6521a) {
                            Log.i("DlnaMediaServer", "addFiles()::item=" + c1703a.toString());
                        }
                        App.f1281m++;
                    }
                }
                m1111a(c1690aM1101a, arrayList3, "f");
                Log.i("DlnaMediaServer", "addFiles()::list size = " + arrayList.size());
                return;
            }
            Log.i("DlnaMediaServer", "addFiles()::paths list is empty");
        }
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: i */
    private void m1146i() throws UnsupportedEncodingException {
        Cursor cursorQuery;
        String str;
        if (Build.VERSION.SDK_INT >= 19 && this.f1510v != null) {
            ArrayList<String> arrayList = new ArrayList();
            for (String str2 : this.f1510v) {
                if (str2.startsWith("content://")) {
                    arrayList.add(str2);
                }
            }
            if (!arrayList.isEmpty()) {
                C1690a c1690aM1101a = m1101a("f", this.f1492d);
                Collections.sort(arrayList);
                boolean zM1050a = C0360n.m1050a(this, "show_thumbs");
                boolean zM1050a2 = C0360n.m1050a(this, "show_thumbs_image");
                boolean zM1050a3 = C0360n.m1050a(this, "show_thumbs_audio");
                boolean z = !C0360n.m1050a(this, "no_all_media");
                boolean zM1050a4 = C0360n.m1050a(this, "flat_style");
                Cursor cursor = null;
                ArrayList arrayList2 = new ArrayList();
                for (String str3 : arrayList) {
                    if (!App.f1269a) {
                        break;
                    }
                    try {
                        cursorQuery = getContentResolver().query(Uri.parse(str3), null, null, null, null, null);
                    } catch (Exception e) {
                        String str4 = String.valueOf(getString(C0303R.string.dead_uri_toast)) + str3;
                        m1143g(str4);
                        Log.e("DlnaMediaServer", str4);
                        cursorQuery = cursor;
                    }
                    if (cursorQuery != null && cursorQuery.moveToFirst()) {
                        int columnIndex = cursorQuery.getColumnIndex("_display_name");
                        String string = columnIndex == -1 ? str3 : cursorQuery.getString(columnIndex);
                        int columnIndex2 = cursorQuery.getColumnIndex("mime_type");
                        String string2 = columnIndex2 == -1 ? null : cursorQuery.getString(columnIndex2);
                        if (string2 == null) {
                            string2 = C0349c.m1019a(string, null);
                        }
                        String str5 = string2 == null ? "application/octet-stream" : string2;
                        int columnIndex3 = cursorQuery.getColumnIndex("_size");
                        long j = columnIndex3 == -1 ? 1073741824L : cursorQuery.getLong(columnIndex3);
                        int columnIndex4 = cursorQuery.getColumnIndex("last_modified");
                        long time = columnIndex4 == -1 ? new Date().getTime() : cursorQuery.getLong(columnIndex4);
                        String strM1138f = m1138f(String.valueOf(String.valueOf(App.f1281m)) + "_" + string);
                        App.f1274f.put(strM1138f, null);
                        App.f1275g.put(strM1138f, Uri.parse(str3));
                        String strEncode = URLEncoder.encode(strM1138f, "UTF-8");
                        String strM1018a = "";
                        String[] strArrM1119a = null;
                        if (C0349c.m1026f(string)) {
                            str = "object.item.audioItem.musicTrack";
                            strM1018a = C0349c.m1018a(string);
                            if (zM1050a3) {
                                strArrM1119a = m1119a(str3, time, j);
                            }
                        } else if (C0349c.m1027g(string)) {
                            str = "object.item.imageItem.photo";
                            if (zM1050a2) {
                                strArrM1119a = m1119a(str3, time, j);
                            }
                        } else if (C0349c.m1028h(string)) {
                            str = "object.item.textItem";
                        } else {
                            str = "object.item.videoItem";
                            if (zM1050a) {
                                strArrM1119a = m1119a(str3, time, j);
                            }
                        }
                        String strM1100a = m1100a(str, str5, strM1018a);
                        C1703a c1703a = new C1703a();
                        c1703a.m5145c("id", strEncode);
                        c1703a.m4872c(string.replace("&", "&amp;"));
                        c1703a.m5141a("restricted", 1);
                        c1703a.m5145c("parentID", c1690aM1101a.m5158j("parentID"));
                        c1703a.m4875d(str);
                        c1703a.m4871b("dc:date", m1120b(time));
                        c1703a.m5145c("rawDate", String.valueOf(time));
                        String str6 = "http://" + C1637a.m4702a() + ":" + App.f1280l + "/" + strEncode;
                        C1751b c1751b = new C1751b();
                        c1751b.add(new C1750a("size", Long.toString(j)));
                        c1703a.m4896b(str6, strM1100a, c1751b);
                        if (strArrM1119a != null) {
                            m1114a(c1703a, strArrM1119a[0], strArrM1119a[1]);
                        }
                        if (z) {
                            m1112a(c1690aM1101a, c1703a, "f");
                        }
                        if (zM1050a4) {
                            m1124b(c1690aM1101a, c1703a, str3.replace("content://", ""), "f");
                        } else {
                            m1113a(c1690aM1101a, c1703a, str3.replace("content://", ""), "f");
                        }
                        arrayList2.add(c1703a);
                        if (C1744a.f6521a) {
                            Log.i("DlnaMediaServer", "addSAFContent()::item=" + c1703a.toString());
                        }
                        App.f1281m++;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    cursor = cursorQuery;
                }
                m1111a(c1690aM1101a, arrayList2, "f");
                Log.i("DlnaMediaServer", "addSAFContent()::list size = " + arrayList.size());
                return;
            }
            Log.i("DlnaMediaServer", "addSAFContent()::paths list is empty");
        }
    }

    /* JADX INFO: renamed from: j */
    private void m1148j() throws UnsupportedEncodingException {
        boolean z;
        String str;
        String strM1018a;
        C0215ae c0215ae;
        if (this.f1510v != null) {
            ArrayList<C0215ae> arrayList = new ArrayList();
            Map<C0215ae, C0215ae> map = new HashMap<>();
            for (String str2 : this.f1510v) {
                if (str2.startsWith("smb://")) {
                    if (!App.f1269a) {
                        break;
                    }
                    try {
                        new C0377d().m1073a(arrayList, map, String.valueOf(str2) + "/");
                    } catch (Exception e) {
                        App.f1271c = true;
                        Log.e("DlnaMediaServer", "setMediaContent()::addSMBContent()", e);
                        m1143g("SMB: " + str2 + "\n" + e.getMessage());
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                C1690a c1690aM1101a = m1101a("smb", this.f1493e);
                boolean zM1050a = C0360n.m1050a(this, "show_thumbs_image");
                boolean z2 = !C0360n.m1050a(this, "no_all_media");
                boolean zM1050a2 = C0360n.m1050a(this, "flat_style");
                ArrayList arrayList2 = new ArrayList();
                for (C0215ae c0215ae2 : arrayList) {
                    if (!App.f1269a) {
                        break;
                    }
                    String strM631h = c0215ae2.m631h();
                    String strM1019a = C0349c.m1019a(c0215ae2.m631h(), null);
                    String str3 = strM1019a == null ? "application/octet-stream" : strM1019a;
                    long jM639p = c0215ae2.m639p();
                    long jM636m = c0215ae2.m636m();
                    String strM1138f = m1138f(String.valueOf(String.valueOf(App.f1281m)) + "_" + strM631h);
                    App.f1276h.put(strM1138f, c0215ae2);
                    String strEncode = URLEncoder.encode(strM1138f, "UTF-8");
                    String[] strArrM1118a = null;
                    if (C0349c.m1026f(c0215ae2.m631h())) {
                        str = "object.item.audioItem.musicTrack";
                        strM1018a = C0349c.m1018a(c0215ae2.m631h());
                        z = false;
                    } else if (C0349c.m1027g(c0215ae2.m631h())) {
                        if (!zM1050a) {
                            z = false;
                            strM1018a = "";
                            str = "object.item.imageItem.photo";
                        } else {
                            strArrM1118a = m1118a(c0215ae2.getInputStream(), c0215ae2.m632i(), c0215ae2.getDate(), c0215ae2.m639p());
                            z = false;
                            strM1018a = "";
                            str = "object.item.imageItem.photo";
                        }
                    } else if (C0349c.m1028h(c0215ae2.m631h())) {
                        str = "object.item.textItem";
                        z = false;
                        strM1018a = "";
                    } else {
                        z = true;
                        str = "object.item.videoItem";
                        strM1018a = "";
                    }
                    String strM1100a = m1100a(str, str3, strM1018a);
                    C1703a c1703a = new C1703a();
                    c1703a.m5145c("id", strEncode);
                    c1703a.m4872c(strM631h.replace("&", "&amp;"));
                    c1703a.m5141a("restricted", 1);
                    c1703a.m5145c("parentID", c1690aM1101a.m5158j("parentID"));
                    c1703a.m4875d(str);
                    c1703a.m4871b("dc:date", m1120b(jM636m));
                    c1703a.m5145c("rawDate", String.valueOf(jM636m));
                    String str4 = "http://" + C1637a.m4702a() + ":" + App.f1280l + "/" + strEncode;
                    C1751b c1751b = new C1751b();
                    c1751b.add(new C1750a("size", Long.toString(jM639p)));
                    c1703a.m4896b(str4, strM1100a, c1751b);
                    if (strArrM1118a != null) {
                        m1114a(c1703a, strArrM1118a[0], strArrM1118a[1]);
                    }
                    if (z && (c0215ae = map.get(c0215ae2)) != null) {
                        String strM1020b = C0349c.m1020b(c0215ae.m631h());
                        String strM1121b = m1121b(strEncode, strM1020b);
                        App.f1276h.put(String.valueOf(strEncode) + "." + strM1020b, c0215ae);
                        App.f1279k.put(c0215ae2.m632i(), strM1121b);
                        m1115a(c1703a, strM1121b, strM1020b, c0215ae.m639p());
                    }
                    if (z2) {
                        m1112a(c1690aM1101a, c1703a, "smb");
                    }
                    if (zM1050a2) {
                        m1124b(m1102a(c1690aM1101a, "smb", c0215ae2.getURL().getHost(), m1138f(c0215ae2.getURL().getHost())), c1703a, "/" + c0215ae2.getURL().getHost() + c0215ae2.getURL().getPath(), "smb");
                    } else {
                        m1113a(c1690aM1101a, c1703a, "/" + c0215ae2.getURL().getHost() + c0215ae2.getURL().getPath(), "smb");
                    }
                    arrayList2.add(c1703a);
                    if (C1744a.f6521a) {
                        Log.i("DlnaMediaServer", "addSMBContent()::item=" + c1703a.toString());
                    }
                    App.f1281m++;
                }
                m1111a(c1690aM1101a, arrayList2, "smb");
                Log.i("DlnaMediaServer", "addSMBContent()::list size = " + arrayList.size());
                return;
            }
            Log.i("DlnaMediaServer", "addSMBContent()::paths list is empty");
        }
    }

    /* JADX INFO: renamed from: k */
    private void m1150k() throws Throwable {
        String str;
        C0378a c0378a;
        if (this.f1510v != null) {
            ArrayList<C0378a> arrayList = new ArrayList();
            HashMap map = new HashMap();
            for (String str2 : this.f1510v) {
                if (str2.startsWith("ftp://")) {
                    if (!App.f1269a) {
                        break;
                    }
                    try {
                        new C0374a().m1070a(arrayList, map, str2);
                    } catch (Exception e) {
                        App.f1271c = true;
                        Log.e("DlnaMediaServer", "setMediaContent()::addFTPContent()", e);
                        m1143g("FTP: " + str2 + "\n" + e.getMessage());
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                C1690a c1690aM1101a = m1101a("ftp", this.f1494f);
                boolean zM1050a = C0360n.m1050a(this, "show_thumbs_image");
                boolean z = !C0360n.m1050a(this, "no_all_media");
                boolean zM1050a2 = C0360n.m1050a(this, "flat_style");
                ArrayList arrayList2 = new ArrayList();
                for (C0378a c0378a2 : arrayList) {
                    if (!App.f1269a) {
                        break;
                    }
                    String strM1252c = c0378a2.m1074a().m1252c();
                    String strM1019a = C0349c.m1019a(c0378a2.m1074a().m1252c(), null);
                    if (strM1019a == null) {
                        strM1019a = "application/octet-stream";
                    }
                    long jM1254d = c0378a2.m1074a().m1254d();
                    long timeInMillis = c0378a2.m1074a().m1256e().getTimeInMillis();
                    String strM1138f = m1138f(String.valueOf(String.valueOf(App.f1281m)) + "_" + strM1252c);
                    App.f1277i.put(strM1138f, c0378a2);
                    String strEncode = URLEncoder.encode(strM1138f, "UTF-8");
                    String strM1018a = "";
                    String[] strArrM1117a = null;
                    boolean z2 = false;
                    if (C0349c.m1026f(c0378a2.m1074a().m1252c())) {
                        str = "object.item.audioItem.musicTrack";
                        strM1018a = C0349c.m1018a(c0378a2.m1074a().m1252c());
                    } else if (C0349c.m1027g(c0378a2.m1074a().m1252c())) {
                        str = "object.item.imageItem.photo";
                        if (zM1050a) {
                            strArrM1117a = m1117a(c0378a2);
                        }
                    } else if (C0349c.m1028h(c0378a2.m1074a().m1252c())) {
                        str = "object.item.textItem";
                    } else {
                        z2 = true;
                        str = "object.item.videoItem";
                    }
                    String strM1100a = m1100a(str, strM1019a, strM1018a);
                    C1703a c1703a = new C1703a();
                    c1703a.m5145c("id", strEncode);
                    c1703a.m4872c(strM1252c.replace("&", "&amp;"));
                    c1703a.m5141a("restricted", 1);
                    c1703a.m5145c("parentID", c1690aM1101a.m5158j("parentID"));
                    c1703a.m4875d(str);
                    c1703a.m4871b("dc:date", m1120b(timeInMillis));
                    c1703a.m5145c("rawDate", String.valueOf(timeInMillis));
                    String str3 = "http://" + C1637a.m4702a() + ":" + App.f1280l + "/" + strEncode;
                    C1751b c1751b = new C1751b();
                    c1751b.add(new C1750a("size", Long.toString(jM1254d)));
                    c1703a.m4896b(str3, strM1100a, c1751b);
                    if (strArrM1117a != null) {
                        m1114a(c1703a, strArrM1117a[0], strArrM1117a[1]);
                    }
                    if (z2 && (c0378a = (C0378a) map.get(c0378a2)) != null) {
                        String strM1020b = C0349c.m1020b(c0378a.m1074a().m1252c());
                        String strM1121b = m1121b(strEncode, strM1020b);
                        App.f1277i.put(String.valueOf(strEncode) + "." + strM1020b, c0378a);
                        App.f1279k.put(c0378a2.m1075b().getPath(), strM1121b);
                        m1115a(c1703a, strM1121b, strM1020b, c0378a.m1077d());
                    }
                    if (z) {
                        m1112a(c1690aM1101a, c1703a, "ftp");
                    }
                    if (zM1050a2) {
                        m1124b(m1102a(c1690aM1101a, "ftp", c0378a2.m1075b().getHost(), m1138f(c0378a2.m1075b().getHost())), c1703a, "/" + c0378a2.m1075b().getHost() + c0378a2.m1075b().getPath() + "/" + c0378a2.m1074a().m1252c(), "ftp");
                    } else {
                        m1113a(c1690aM1101a, c1703a, "/" + c0378a2.m1075b().getHost() + c0378a2.m1075b().getPath(), "ftp");
                    }
                    arrayList2.add(c1703a);
                    if (C1744a.f6521a) {
                        Log.i("DlnaMediaServer", "addFTPContent()::item=" + c1703a.toString());
                    }
                    App.f1281m++;
                }
                m1111a(c1690aM1101a, arrayList2, "ftp");
                Log.i("DlnaMediaServer", "addFTPContent()::list size = " + arrayList.size());
                return;
            }
            Log.i("DlnaMediaServer", "addFTPContent()::paths list is empty");
        }
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: l */
    private void m1151l() throws Throwable {
        ArrayList arrayList = new ArrayList();
        if (this.f1510v != null && !this.f1510v.isEmpty()) {
            for (String str : this.f1510v) {
                if (!App.f1269a) {
                    break;
                }
                if (str.toLowerCase().endsWith("m3u") || str.toLowerCase().endsWith("m3u8") || str.toLowerCase().endsWith("pls")) {
                    arrayList.add(str);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            m1109a(arrayList);
            Log.i("DlnaMediaServer", "addPlayLists()::list size = " + arrayList.size());
        } else {
            Log.i("DlnaMediaServer", "addPlayLists()::there are no playlists");
        }
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: a */
    private void m1109a(List<String> list) throws Throwable {
        InputStream fileInputStream;
        C1690a c1690aM1101a = m1101a("p", this.f1495g);
        boolean zM1050a = C0360n.m1050a(this, "proxy_stream");
        boolean zM1050a2 = C0360n.m1050a(this, "show_thumbs");
        boolean zM1050a3 = C0360n.m1050a(this, "show_thumbs_image");
        boolean zM1050a4 = C0360n.m1050a(this, "show_thumbs_audio");
        for (String str : list) {
            if (App.f1269a) {
                if (!str.startsWith("#")) {
                    C1690a c1690a = new C1690a();
                    c1690a.m4872c(C0349c.m1022c(str));
                    c1690a.m5145c("id", "p$" + App.f1282n);
                    c1690a.m5145c("parentID", "p");
                    c1690a.m5141a("restricted", 0);
                    c1690a.m5141a("searchable", 1);
                    c1690a.m4875d("object.container.storageFolder");
                    c1690aM1101a.m5141a("childCount", c1690aM1101a.m5160k("childCount") + 1);
                    c1690aM1101a.m4879a((AbstractC1689a) c1690a);
                    if (str.startsWith("http")) {
                        fileInputStream = C0358l.m1038a(str);
                    } else {
                        fileInputStream = new FileInputStream(str);
                    }
                    if (fileInputStream == null) {
                        Log.e("DlnaMediaServer", "addPlayLists() Can not get playlist ".concat(String.valueOf(str)));
                    } else {
                        String strM1018a = C0349c.m1018a(str);
                        if (strM1018a.equals("m3u") || strM1018a.equals("m3u8")) {
                            C0305a.a aVarM997a = C0305a.m997a(fileInputStream);
                            for (int i = 0; i < aVarM997a.m999a() && App.f1269a; i++) {
                                m1110a(c1690a, aVarM997a.m1001b(i), aVarM997a.m1000a(i), zM1050a, zM1050a2, zM1050a3, zM1050a4, App.f1282n, i);
                            }
                        } else if (strM1018a.equals("pls")) {
                            C0306b.a aVarM1003a = C0306b.m1003a(fileInputStream);
                            for (int i2 = 0; i2 < aVarM1003a.m1004a() && App.f1269a; i2++) {
                                m1110a(c1690a, aVarM1003a.m1005a(i2).m1007b(), aVarM1003a.m1005a(i2).m1006a(), zM1050a, zM1050a2, zM1050a3, zM1050a4, App.f1282n, i2);
                            }
                        }
                        try {
                            fileInputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        App.f1282n++;
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
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1110a(org.cybergarage.p157d.p162e.p163a.p164a.p166b.p167a.C1690a r17, java.lang.String r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p033al.dlnaserver.servers.DlnaMediaServer.m1110a(org.cybergarage.d.e.a.a.b.a.a, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, int, int):void");
    }

    /* JADX INFO: renamed from: a */
    private static void m1106a(int i, String str, String str2, C1703a c1703a) {
        m1104a(i, str, new File(str2), c1703a);
    }

    /* JADX INFO: renamed from: a */
    private static void m1104a(int i, String str, File file, C1703a c1703a) {
        String str2;
        String strM1138f = m1138f(String.valueOf(String.valueOf(i)) + "_" + str);
        String parent = file.getParent();
        if (parent == null) {
            str2 = "/";
        } else {
            str2 = String.valueOf(parent) + "/";
        }
        String absolutePath = file.getAbsolutePath();
        File file2 = new File(String.valueOf(str2) + C0349c.m1022c(absolutePath) + ".srt");
        if (file2.exists()) {
            App.f1274f.put(String.valueOf(strM1138f) + ".srt", file2);
            String strM1121b = m1121b(strM1138f, "srt");
            C1751b c1751b = new C1751b();
            c1751b.add(new C1750a("size", Long.toString(file2.length())));
            c1703a.m4893a("sec:CaptionInfoEx", "sec:type", "srt", strM1121b);
            c1703a.m4894a(strM1121b, "http-get:*:text/srt:*", c1751b);
            C1702c c1702cA = c1703a.m4864a("res");
            c1702cA.m4887a("pv:subtitleFileType", "SRT");
            c1702cA.m4887a("pv:subtitleFileUri", strM1121b);
            App.f1279k.put(absolutePath, strM1121b);
        }
        File file3 = new File(String.valueOf(str2) + C0349c.m1022c(absolutePath) + ".smi");
        if (file3.exists()) {
            App.f1274f.put(String.valueOf(strM1138f) + ".smi", file3);
            String strM1121b2 = m1121b(strM1138f, "smi");
            C1751b c1751b2 = new C1751b();
            c1751b2.add(new C1750a("size", Long.toString(file3.length())));
            c1703a.m4893a("sec:CaptionInfoEx", "sec:type", "smi", strM1121b2);
            c1703a.m4894a(strM1121b2, "http-get:*:smi/caption:*", c1751b2);
            C1702c c1702cA2 = c1703a.m4864a("res");
            c1702cA2.m4887a("pv:subtitleFileType", "SMI");
            c1702cA2.m4887a("pv:subtitleFileUri", strM1121b2);
            App.f1279k.put(absolutePath, strM1121b2);
        }
        File file4 = new File(String.valueOf(str2) + C0349c.m1022c(absolutePath) + ".ssa");
        if (file4.exists()) {
            App.f1274f.put(String.valueOf(strM1138f) + ".ssa", file4);
            App.f1279k.put(absolutePath, m1121b(strM1138f, "ssa"));
        }
        File file5 = new File(String.valueOf(str2) + C0349c.m1022c(absolutePath) + ".ass");
        if (file5.exists()) {
            App.f1274f.put(String.valueOf(strM1138f) + ".ass", file5);
            App.f1279k.put(absolutePath, m1121b(strM1138f, "ass"));
        }
        File file6 = new File(String.valueOf(str2) + C0349c.m1022c(absolutePath) + ".sub");
        if (file6.exists()) {
            App.f1274f.put(String.valueOf(strM1138f) + ".sub", file6);
            App.f1279k.put(absolutePath, m1121b(strM1138f, "sub"));
        }
        File file7 = new File(String.valueOf(str2) + C0349c.m1022c(absolutePath) + ".txt");
        if (file7.exists()) {
            App.f1274f.put(String.valueOf(strM1138f) + ".txt", file7);
            String strM1121b3 = m1121b(strM1138f, "txt");
            C1751b c1751b3 = new C1751b();
            c1751b3.add(new C1750a("size", Long.toString(file2.length())));
            c1703a.m4893a("sec:CaptionInfoEx", "sec:type", "txt", strM1121b3);
            c1703a.m4894a(strM1121b3, "http-get:*:text/txt:*", c1751b3);
            C1702c c1702cA3 = c1703a.m4864a("res");
            c1702cA3.m4887a("pv:subtitleFileType", "TXT");
            c1702cA3.m4887a("pv:subtitleFileUri", strM1121b3);
            App.f1279k.put(absolutePath, strM1121b3);
        }
        File file8 = new File(String.valueOf(str2) + C0349c.m1022c(absolutePath) + ".idx");
        if (file8.exists()) {
            App.f1274f.put(String.valueOf(strM1138f) + ".idx", file8);
            App.f1279k.put(absolutePath, m1121b(strM1138f, "idx"));
        }
        File file9 = new File(String.valueOf(str2) + C0349c.m1022c(absolutePath) + ".mpl");
        if (file9.exists()) {
            App.f1274f.put(String.valueOf(strM1138f) + ".mpl", file9);
            App.f1279k.put(absolutePath, m1121b(strM1138f, "mpl"));
        }
        File file10 = new File(String.valueOf(str2) + C0349c.m1022c(absolutePath) + ".vtt");
        if (file10.exists()) {
            App.f1274f.put(String.valueOf(strM1138f) + ".vtt", file10);
            String strM1121b4 = m1121b(strM1138f, "vtt");
            C1751b c1751b4 = new C1751b();
            c1751b4.add(new C1750a("size", Long.toString(file2.length())));
            c1703a.m4893a("sec:CaptionInfoEx", "sec:type", "vtt", strM1121b4);
            c1703a.m4894a(strM1121b4, "http-get:*:text/vtt:*", c1751b4);
            C1702c c1702cA4 = c1703a.m4864a("res");
            c1702cA4.m4887a("pv:subtitleFileType", "VTT");
            c1702cA4.m4887a("pv:subtitleFileUri", strM1121b4);
            App.f1279k.put(absolutePath, strM1121b4);
        }
        File file11 = new File(String.valueOf(str2) + C0349c.m1022c(absolutePath) + ".psb");
        if (file11.exists()) {
            App.f1274f.put(String.valueOf(strM1138f) + ".psb", file11);
            App.f1279k.put(absolutePath, m1121b(strM1138f, "psb"));
        }
        File file12 = new File(String.valueOf(str2) + C0349c.m1022c(absolutePath) + ".sami");
        if (file12.exists()) {
            App.f1274f.put(String.valueOf(strM1138f) + ".sami", file12);
            App.f1279k.put(absolutePath, m1121b(strM1138f, "sami"));
        }
        File file13 = new File(String.valueOf(str2) + C0349c.m1022c(absolutePath) + ".pjs");
        if (file13.exists()) {
            App.f1274f.put(String.valueOf(strM1138f) + ".pjs", file13);
            App.f1279k.put(absolutePath, m1121b(strM1138f, "pjs"));
        }
        File file14 = new File(String.valueOf(str2) + C0349c.m1022c(absolutePath) + ".sup");
        if (file14.exists()) {
            App.f1274f.put(String.valueOf(strM1138f) + ".sup", file14);
            App.f1279k.put(absolutePath, m1121b(strM1138f, "sup"));
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1115a(C1703a c1703a, String str, String str2, long j) {
        if ("srt".equalsIgnoreCase(str2)) {
            C1751b c1751b = new C1751b();
            c1751b.add(new C1750a("size", Long.toString(j)));
            c1703a.m4893a("sec:CaptionInfoEx", "sec:type", "srt", str);
            c1703a.m4894a(str, "http-get:*:text/srt:*", c1751b);
            C1702c c1702cA = c1703a.m4864a("res");
            c1702cA.m4887a("pv:subtitleFileType", "SRT");
            c1702cA.m4887a("pv:subtitleFileUri", str);
        }
        if ("smi".equalsIgnoreCase(str2)) {
            C1751b c1751b2 = new C1751b();
            c1751b2.add(new C1750a("size", Long.toString(j)));
            c1703a.m4893a("sec:CaptionInfoEx", "sec:type", "smi", str);
            c1703a.m4894a(str, "http-get:*:smi/caption:*", c1751b2);
            C1702c c1702cA2 = c1703a.m4864a("res");
            c1702cA2.m4887a("pv:subtitleFileType", "SMI");
            c1702cA2.m4887a("pv:subtitleFileUri", str);
        }
        if ("txt".equalsIgnoreCase(str2)) {
            C1751b c1751b3 = new C1751b();
            c1751b3.add(new C1750a("size", Long.toString(j)));
            c1703a.m4893a("sec:CaptionInfoEx", "sec:type", "txt", str);
            c1703a.m4894a(str, "http-get:*:text/txt:*", c1751b3);
            C1702c c1702cA3 = c1703a.m4864a("res");
            c1702cA3.m4887a("pv:subtitleFileType", "TXT");
            c1702cA3.m4887a("pv:subtitleFileUri", str);
        }
        if ("vtt".equalsIgnoreCase(str2)) {
            C1751b c1751b4 = new C1751b();
            c1751b4.add(new C1750a("size", Long.toString(j)));
            c1703a.m4893a("sec:CaptionInfoEx", "sec:type", "vtt", str);
            c1703a.m4894a(str, "http-get:*:text/vtt:*", c1751b4);
            C1702c c1702cA4 = c1703a.m4864a("res");
            c1702cA4.m4887a("pv:subtitleFileType", "VTT");
            c1702cA4.m4887a("pv:subtitleFileUri", str);
        }
    }

    /* JADX INFO: renamed from: a */
    private C1690a m1101a(String str, String str2) {
        C1691b c1691bM4942b = this.f1504p.m4949s().m4942b();
        C1690a c1690a = (C1690a) c1691bM4942b.m4881e(str);
        if (c1690a == null) {
            C1690a c1690a2 = new C1690a();
            c1690a2.m4872c(str2);
            c1690a2.m5145c("id", str);
            c1690a2.m5141a("parentID", 0);
            c1690a2.m5141a("restricted", 1);
            c1690a2.m5141a("searchable", 1);
            c1690a2.m4875d("object.container");
            c1690a2.m4868a(this.f1504p.m4949s());
            c1691bM4942b.m5146c(c1690a2);
            c1691bM4942b.m5141a("childCount", c1691bM4942b.m5160k("childCount") + 1);
            return c1690a2;
        }
        return c1690a;
    }

    /* JADX INFO: renamed from: a */
    private static C1690a m1102a(C1690a c1690a, String str, String str2, String str3) {
        C1690a c1690a2 = (C1690a) c1690a.m4881e(String.valueOf(str) + "$" + str3);
        if (c1690a2 == null) {
            C1690a c1690a3 = new C1690a();
            c1690a3.m4872c(str2);
            c1690a3.m5145c("id", String.valueOf(str) + "$" + str3);
            c1690a3.m5145c("parentID", c1690a.m5158j("id"));
            c1690a3.m5141a("restricted", 0);
            c1690a3.m5141a("searchable", 1);
            c1690a3.m4875d("object.container.storageFolder");
            c1690a.m5141a("childCount", c1690a.m5160k("childCount") + 1);
            c1690a.m4879a((AbstractC1689a) c1690a3);
            return c1690a3;
        }
        return c1690a2;
    }

    /* JADX INFO: renamed from: a */
    private void m1112a(C1690a c1690a, C1703a c1703a, String str) {
        C1690a c1690a2 = (C1690a) c1690a.m4881e(String.valueOf(str) + "$am");
        if (c1690a2 == null) {
            c1690a2 = new C1690a();
            if (str.equals("a")) {
                c1690a2.m4872c(this.f1496h);
            } else if (str.equals("v")) {
                c1690a2.m4872c(this.f1497i);
            } else if (str.equals("i")) {
                c1690a2.m4872c(this.f1498j);
            } else if (str.equals("f") || str.equals("smb") || str.equals("ftp")) {
                c1690a2.m4872c(this.f1499k);
            } else {
                c1690a2.m4872c("?");
            }
            c1690a2.m5145c("id", String.valueOf(str) + "$am");
            c1690a2.m5145c("parentID", c1690a.m5158j("id"));
            c1690a2.m5141a("restricted", 0);
            c1690a2.m5141a("searchable", 1);
            c1690a2.m4875d("object.container");
            c1690a.m4879a((AbstractC1689a) c1690a2);
        }
        c1690a2.m5146c(c1703a);
        c1690a2.m5141a("childCount", c1690a2.m5160k("childCount") + 1);
    }

    /* JADX INFO: renamed from: a */
    private void m1111a(C1690a c1690a, List<C1703a> list, String str) {
        C1690a c1690a2;
        if (!list.isEmpty()) {
            C1690a c1690a3 = (C1690a) c1690a.m4881e(String.valueOf(str) + "$rm");
            if (c1690a3 == null) {
                C1690a c1690a4 = new C1690a();
                c1690a4.m4872c(this.f1500l);
                c1690a4.m5145c("id", String.valueOf(str) + "$rm");
                c1690a4.m5145c("parentID", str);
                c1690a4.m5141a("restricted", 0);
                c1690a4.m4875d("object.container.storageFolder");
                c1690a.m4879a((AbstractC1689a) c1690a4);
                c1690a2 = c1690a4;
            } else {
                c1690a2 = c1690a3;
            }
            Collections.sort(list, new C0379b());
            int iMin = Math.min(list.size(), 15);
            for (int i = 0; i < iMin; i++) {
                c1690a2.m5146c(list.get(i));
                c1690a2.m5141a("childCount", c1690a2.m5160k("childCount") + 1);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1113a(C1690a c1690a, C1703a c1703a, String str, String str2) {
        C1690a c1690a2;
        C1690a c1690a3 = null;
        String[] strArrSplit = str.split("/");
        int i = 1;
        while (i < strArrSplit.length) {
            String str3 = strArrSplit[i];
            String str4 = String.valueOf(str2) + "$" + URLEncoder.encode(m1138f(str3), "UTF-8");
            if (i == strArrSplit.length - 1) {
                if (c1690a3 != null) {
                    c1690a = c1690a3;
                }
                c1690a.m5146c(c1703a);
                c1690a.m5141a("childCount", c1690a.m5160k("childCount") + 1);
                return;
            }
            C1690a c1690a4 = (C1690a) c1690a.m4881e(str2);
            C1690a c1690a5 = c1690a4 == null ? c1690a : c1690a4;
            if (c1690a5.m5158j("id").equals(str4)) {
                c1690a2 = c1690a3;
            } else {
                c1690a2 = (C1690a) c1690a.m4881e(str4);
                if (c1690a2 == null) {
                    c1690a2 = new C1690a();
                }
                if (!c1690a2.m5158j("id").equals(str4)) {
                    c1690a2.m4872c(str3);
                    c1690a2.m5145c("id", str4);
                    c1690a2.m5145c("parentID", c1690a5.m5158j("id"));
                    c1690a2.m5141a("restricted", 0);
                    c1690a2.m5141a("searchable", 1);
                    c1690a2.m4875d("object.container.storageFolder");
                    c1690a5.m5141a("childCount", c1690a5.m5160k("childCount") + 1);
                    c1690a5.m4879a((AbstractC1689a) c1690a2);
                }
            }
            i++;
            c1690a3 = c1690a2;
            str2 = str4;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m1124b(C1690a c1690a, C1703a c1703a, String str, String str2) {
        File parentFile = new File(str).getParentFile();
        String path = parentFile.getPath();
        String name = parentFile.getName();
        String str3 = String.valueOf(str2) + "$" + URLEncoder.encode(m1138f(path).replaceFirst("/", "").replace("/", "$"), "UTF-8");
        C1690a c1690a2 = (C1690a) c1690a.m4881e(str3);
        if (c1690a2 == null) {
            c1690a2 = new C1690a();
            c1690a2.m5145c("parentID", c1690a.m5158j("id"));
            c1690a2.m4872c(name);
            c1690a2.m5145c("id", str3);
            c1690a2.m5141a("restricted", 0);
            c1690a2.m5141a("searchable", 1);
            c1690a2.m4875d("object.container.storageFolder");
            c1690a.m4879a((AbstractC1689a) c1690a2);
        }
        c1690a2.m5146c(c1703a);
        c1690a2.m5141a("childCount", c1690a2.m5160k("childCount") + 1);
    }

    /* JADX INFO: renamed from: c */
    private static void m1129c(C1690a c1690a, C1703a c1703a, String str, String str2) {
        C1690a c1690a2;
        String str3 = String.valueOf(c1690a.m5158j("id")) + "$" + URLEncoder.encode(m1138f(str).replaceFirst("/", "").replace("/", "$"), "UTF-8");
        String str4 = String.valueOf(str3) + "$" + URLEncoder.encode(m1138f(str2).replaceFirst("/", "").replace("/", "$"), "UTF-8");
        C1690a c1690a3 = (C1690a) c1690a.m4881e(str3);
        if (c1690a3 == null) {
            C1690a c1690a4 = new C1690a();
            c1690a4.m5145c("parentID", c1690a.m5158j("id"));
            c1690a4.m4872c(str);
            c1690a4.m5145c("id", str3);
            c1690a4.m5141a("restricted", 0);
            c1690a4.m5141a("searchable", 1);
            c1690a4.m4875d("object.container.storageFolder");
            c1690a.m4879a((AbstractC1689a) c1690a4);
            c1690a2 = c1690a4;
        } else {
            c1690a2 = c1690a3;
        }
        C1690a c1690a5 = (C1690a) c1690a2.m4881e(str4);
        if (c1690a5 == null) {
            c1690a5 = new C1690a();
            c1690a5.m5145c("parentID", c1690a2.m5158j("id"));
            c1690a5.m4872c(str2);
            c1690a5.m5145c("id", str4);
            c1690a5.m5141a("restricted", 0);
            c1690a5.m5141a("searchable", 1);
            c1690a5.m4875d("object.container.storageFolder");
            c1690a2.m4879a((AbstractC1689a) c1690a5);
        }
        c1690a5.m5146c(c1703a);
        c1690a5.m5141a("childCount", c1690a5.m5160k("childCount") + 1);
    }

    /* JADX INFO: renamed from: a */
    private static void m1114a(C1703a c1703a, String str, String str2) {
        c1703a.m4871b("upnp:icon", str);
        C1751b c1751b = new C1751b();
        c1751b.add(new C1750a("size", str2));
        c1751b.add(new C1750a("dlna:profileID", "JPEG_SM"));
        C1750a c1750a = new C1750a("xmlns:dlna", "urn:schemas-dlna-org:metadata-1-0/");
        c1751b.add(c1750a);
        C1751b c1751b2 = new C1751b();
        c1751b2.add(new C1750a("size", str2));
        c1751b2.add(new C1750a("dlna:profileID", "JPEG_TN"));
        c1751b2.add(c1750a);
        c1703a.m4895a(str, c1751b);
        c1703a.m4895a(str, c1751b2);
        c1703a.m4894a(str, "http-get:*:image/jpeg:DLNA.ORG_PN=JPEG_SM;DLNA.ORG_OP=01;DLNA.ORG_CI=1;DLNA.ORG_FLAGS=00D00000000000000000000000000000", c1751b);
        c1703a.m4894a(str, "http-get:*:image/jpeg:DLNA.ORG_PN=JPEG_TN;DLNA.ORG_OP=01;DLNA.ORG_CI=1;DLNA.ORG_FLAGS=00D00000000000000000000000000000", c1751b2);
    }

    /* JADX INFO: renamed from: a */
    private static String m1100a(String str, String str2, String str3) {
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

    /* JADX INFO: renamed from: b */
    private static String m1121b(String str, String str2) {
        try {
            return "http://" + C1637a.m4702a() + ":" + App.f1280l + "/" + URLEncoder.encode(String.valueOf(str) + "." + str2, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m1099a(long j) {
        long j2 = j / 1000;
        return String.valueOf(String.valueOf((j2 / 3600) % 24)) + ":" + String.format("%02d", Long.valueOf((j2 / 60) % 60)) + ":" + String.format("%02d", Long.valueOf(j2 % 60));
    }

    /* JADX INFO: renamed from: b */
    private static String m1120b(long j) {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date(j));
    }

    /* JADX INFO: renamed from: a */
    private void m1108a(String str) {
        if (this.f1513y != null) {
            synchronized (this.f1513y) {
                Iterator<FileObserverC0386i> it = this.f1513y.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (str.equals(it.next().m1089a())) {
                            break;
                        }
                    } else {
                        this.f1513y.add(new FileObserverC0386i(str, getApplicationContext()));
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private void m1152m() {
        if (this.f1513y != null) {
            synchronized (this.f1513y) {
                for (FileObserverC0386i fileObserverC0386i : this.f1513y) {
                    if (!fileObserverC0386i.m1091b()) {
                        fileObserverC0386i.startWatching();
                        fileObserverC0386i.m1090a(true);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1105a(int i, String str, String str2) throws IOException {
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
        this.f1503o.put("icons/deviceIcon" + i + "." + str, file);
        C1736h c1736h = new C1736h();
        c1736h.m5042a(str2);
        c1736h.m5041a(i);
        c1736h.m5045b(i);
        c1736h.m5044b();
        c1736h.m5046b("/icons/deviceIcon" + i + "." + str);
        c1736h.m5043a(bArr2);
        this.f1504p.m4983a(c1736h);
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
    /* JADX INFO: renamed from: b */
    private String[] m1126b(String str) throws Throwable {
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
                App.f1274f.put("thumb/thumb_".concat(String.valueOf(hexString)), file2);
                strArr[0] = "http://" + C1637a.m4702a() + ":" + App.f1280l + "/thumb/thumb_" + hexString;
                strArr[1] = Long.toString(file2.length());
            } else {
                try {
                    file2.createNewFile();
                    mediaMetadataRetriever = new MediaMetadataRetriever();
                    try {
                        mediaMetadataRetriever.setDataSource(str);
                        if (Build.VERSION.SDK_INT >= 27) {
                            bitmapExtractThumbnail = mediaMetadataRetriever.getScaledFrameAtTime(-1L, 2, this.f1512x, this.f1512x);
                        } else {
                            ValueOf = mediaMetadataRetriever.getFrameAtTime(-1L, 2);
                            try {
                                bitmapExtractThumbnail = ThumbnailUtils.extractThumbnail(ValueOf, this.f1512x, this.f1512x);
                            } catch (IOException e3) {
                                e2 = e3;
                                length = mediaMetadataRetriever;
                                ValueOf = ValueOf;
                                Log.e("DlnaMediaServer", "getVideoThumbnail(String). filePath=".concat(String.valueOf(str)));
                                Log.e("DlnaMediaServer", "getVideoThumbnail(String)", e2);
                                if (length != 0) {
                                    if (Build.VERSION.SDK_INT >= 29) {
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
                                    if (Build.VERSION.SDK_INT >= 29) {
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
                                    if (Build.VERSION.SDK_INT >= 29) {
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
                            bitmapExtractThumbnail.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file2.getAbsolutePath()));
                        } else {
                            Log.e("DlnaMediaServer", "getVideoThumbnail(String). Cannot retrive thumbnail from " + str + " getFrameAtTime() == null");
                        }
                        if (Build.VERSION.SDK_INT >= 29) {
                            mediaMetadataRetriever.close();
                        }
                        mediaMetadataRetriever.release();
                        if (bitmapExtractThumbnail != null) {
                            bitmapExtractThumbnail.recycle();
                        }
                        App.f1274f.put("thumb/thumb_".concat(String.valueOf(hexString)), file2);
                        strArr[0] = "http://" + C1637a.m4702a() + ":" + App.f1280l + "/thumb/thumb_" + hexString;
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
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String[] m1131c(java.lang.String r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p033al.dlnaserver.servers.DlnaMediaServer.m1131c(java.lang.String):java.lang.String[]");
    }

    /* JADX INFO: renamed from: d */
    private String[] m1134d(String str) {
        String[] strArr = {"", ""};
        File file = new File(str);
        String hexString = Integer.toHexString((String.valueOf(file.getAbsolutePath()) + file.lastModified() + file.length()).hashCode());
        File file2 = new File(getCacheDir(), "thumb_".concat(String.valueOf(hexString)));
        if (!file2.exists()) {
            Bitmap bitmap = null;
            try {
                try {
                    file2.createNewFile();
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, m1135e(str));
                    if (bitmapDecodeFile != null) {
                        bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file2.getAbsolutePath()));
                    } else {
                        Log.e("DlnaMediaServer", "getImageThumbnail(String). Cannot retrive thumbnail from " + str + " BitmapFactory.decodeFile() == null");
                    }
                    if (bitmapDecodeFile != null) {
                        bitmapDecodeFile.recycle();
                    }
                    App.f1274f.put("thumb/thumb_".concat(String.valueOf(hexString)), file2);
                    strArr[0] = "http://" + C1637a.m4702a() + ":" + App.f1280l + "/thumb/thumb_" + hexString;
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
            App.f1274f.put("thumb/thumb_".concat(String.valueOf(hexString)), file2);
            strArr[0] = "http://" + C1637a.m4702a() + ":" + App.f1280l + "/thumb/thumb_" + hexString;
            strArr[1] = Long.toString(file2.length());
        }
        return strArr;
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    private String[] m1119a(String str, long j, long j2) {
        Bitmap bitmap = null;
        String[] strArr = {"", ""};
        String hexString = Integer.toHexString((String.valueOf(str) + j + j2).hashCode());
        File file = new File(getCacheDir(), "thumb_".concat(String.valueOf(hexString)));
        try {
            if (!file.exists()) {
                try {
                    file.createNewFile();
                    Bitmap documentThumbnail = DocumentsContract.getDocumentThumbnail(getContentResolver(), Uri.parse(str), new Point(this.f1512x, this.f1512x), null);
                    if (documentThumbnail != null) {
                        documentThumbnail.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file.getAbsolutePath()));
                    } else {
                        Log.e("DlnaMediaServer", "getSAFThumbnail(). Cannot retrive thumbnail from " + str + " DocumentsContract.getDocumentThumbnail() == null");
                    }
                    if (documentThumbnail != null) {
                        documentThumbnail.recycle();
                    }
                    App.f1274f.put("thumb/thumb_".concat(String.valueOf(hexString)), file);
                    strArr[0] = "http://" + C1637a.m4702a() + ":" + App.f1280l + "/thumb/thumb_" + hexString;
                    strArr[1] = Long.toString(file.length());
                } catch (IOException e) {
                    Log.e("DlnaMediaServer", "getSAFThumbnail()", e);
                    if (0 != 0) {
                        bitmap.recycle();
                    }
                }
            } else {
                App.f1274f.put("thumb/thumb_".concat(String.valueOf(hexString)), file);
                strArr[0] = "http://" + C1637a.m4702a() + ":" + App.f1280l + "/thumb/thumb_" + hexString;
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

    /* JADX INFO: renamed from: a */
    private String[] m1118a(InputStream inputStream, String str, long j, long j2) {
        Bitmap bitmap = null;
        String[] strArr = {"", ""};
        String hexString = Integer.toHexString((String.valueOf(str) + j + j2).hashCode());
        File file = new File(getCacheDir(), "thumb_".concat(String.valueOf(hexString)));
        if (!file.exists()) {
            try {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, m1097a(inputStream));
                    if (bitmapDecodeStream != null) {
                        bitmapDecodeStream.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file.getAbsolutePath()));
                    } else {
                        Log.e("DlnaMediaServer", "getSMBThumbnail(). Cannot retrive thumbnail from " + str + " BitmapFactory.decodeStream() == null");
                    }
                    if (bitmapDecodeStream != null) {
                        bitmapDecodeStream.recycle();
                    }
                    App.f1274f.put("thumb/thumb_".concat(String.valueOf(hexString)), file);
                    strArr[0] = "http://" + C1637a.m4702a() + ":" + App.f1280l + "/thumb/thumb_" + hexString;
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
            App.f1274f.put("thumb/thumb_".concat(String.valueOf(hexString)), file);
            strArr[0] = "http://" + C1637a.m4702a() + ":" + App.f1280l + "/thumb/thumb_" + hexString;
            strArr[1] = Long.toString(file.length());
        }
        return strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0121  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String[] m1117a(com.p033al.dlnaserver.customs.C0378a r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p033al.dlnaserver.servers.DlnaMediaServer.m1117a(com.al.dlnaserver.customs.a):java.lang.String[]");
    }

    /* JADX INFO: renamed from: e */
    private BitmapFactory.Options m1135e(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return m1096a(options);
    }

    /* JADX INFO: renamed from: a */
    private BitmapFactory.Options m1097a(InputStream inputStream) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        return m1096a(options);
    }

    /* JADX INFO: renamed from: a */
    private BitmapFactory.Options m1096a(BitmapFactory.Options options) {
        int i = options.outWidth;
        int i2 = options.outHeight;
        int i3 = 1;
        while (i >= this.f1512x && i2 >= this.f1512x) {
            i /= 2;
            i2 /= 2;
            i3 *= 2;
        }
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inSampleSize = i3;
        if (Build.VERSION.SDK_INT < 24) {
            options.inDither = true;
        }
        return options;
    }

    /* JADX INFO: renamed from: f */
    private static String m1138f(String str) {
        return str.replace("?", ";003").replace("&", ";026");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m1153n() {
        Intent intent = new Intent();
        intent.putExtra("serviceStarted", true);
        intent.setAction(String.valueOf(getPackageName()) + ".UIupdate");
        sendBroadcast(intent);
    }

    /* JADX INFO: renamed from: a */
    private void m1116a(boolean z) {
        byte b = 0;
        String str = String.valueOf(getPackageName()) + ".ServiceBroadcast";
        if (z) {
            ((AlarmManager) getSystemService("alarm")).setRepeating(0, System.currentTimeMillis(), 180000L, PendingIntent.getBroadcast(this, 0, new Intent(str), 0));
            this.f1487D = new C0398a(this, b);
            registerReceiver(this.f1487D, new IntentFilter(str));
            return;
        }
        ((AlarmManager) getSystemService("alarm")).cancel(PendingIntent.getBroadcast(this, 0, new Intent(str), 0));
        if (this.f1487D != null) {
            unregisterReceiver(this.f1487D);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m1125b(boolean z) {
        if (z) {
            WifiManager wifiManager = (WifiManager) getSystemService("wifi");
            if (this.f1485B == null) {
                this.f1485B = wifiManager.createWifiLock(3, "DlnaMediaServer");
            }
            if (this.f1486C == null) {
                this.f1486C = wifiManager.createMulticastLock("multicastLock");
            }
            this.f1485B.setReferenceCounted(false);
            this.f1486C.setReferenceCounted(true);
            if (!this.f1485B.isHeld()) {
                try {
                    this.f1485B.acquire();
                } catch (SecurityException e) {
                    Log.e("DlnaMediaServer", "mWifiLock()::acquire()", e);
                }
            }
            if (!this.f1486C.isHeld()) {
                try {
                    this.f1486C.acquire();
                } catch (SecurityException e2) {
                    Log.e("DlnaMediaServer", "mWifiMulticastLock()::acquire()", e2);
                }
            }
            if (this.f1488E == null || this.f1488E.isClosed()) {
                try {
                    this.f1488E = new MulticastSocket();
                    NetworkInterface networkInterfaceM1039a = C0358l.m1039a();
                    if (networkInterfaceM1039a != null) {
                        this.f1488E.setNetworkInterface(networkInterfaceM1039a);
                        Log.i("DlnaMediaServer", "MulticastInterface=" + networkInterfaceM1039a.getName());
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
        if (this.f1485B != null && this.f1485B.isHeld()) {
            this.f1485B.release();
        }
        if (this.f1486C != null && this.f1486C.isHeld()) {
            this.f1486C.release();
        }
        if (this.f1488E != null && !this.f1488E.isClosed()) {
            this.f1488E.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Wakelock"})
    /* JADX INFO: renamed from: c */
    public void m1130c(boolean z) {
        if (z) {
            this.f1484A = ((PowerManager) getSystemService("power")).newWakeLock(1, m1154o() ? "LocationManagerService" : "dlnaserver wakelock");
            if (!this.f1484A.isHeld()) {
                try {
                    this.f1484A.acquire();
                    return;
                } catch (SecurityException e) {
                    Log.e("DlnaMediaServer", "makeWakeLock()::acquire()", e);
                    return;
                }
            }
            return;
        }
        if (this.f1484A != null && this.f1484A.isHeld()) {
            this.f1484A.release();
        }
    }

    /* JADX INFO: renamed from: o */
    private static boolean m1154o() {
        return Build.MANUFACTURER.toLowerCase(Locale.US).contains("huawei") || Build.MANUFACTURER.toLowerCase(Locale.US).contains("xiaomi") || Build.MANUFACTURER.toLowerCase(Locale.US).contains("meizu") || Build.MANUFACTURER.toLowerCase(Locale.US).contains("oneplus") || Build.MANUFACTURER.toLowerCase(Locale.US).contains("oppo") || Build.MANUFACTURER.toLowerCase(Locale.US).contains("vivo");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m1143g(String str) {
        if (App.f1273e) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0413h(this, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.al.dlnaserver.servers.DlnaMediaServer$a */
    class C0398a extends BroadcastReceiver {
        private C0398a() {
        }

        /* synthetic */ C0398a(DlnaMediaServer dlnaMediaServer, byte b) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"Wakelock"})
        public final void onReceive(Context context, Intent intent) {
            if (DlnaMediaServer.this.f1484A != null) {
                if (DlnaMediaServer.this.f1484A == null || DlnaMediaServer.this.f1484A.isHeld()) {
                    if (DlnaMediaServer.this.f1484A != null && DlnaMediaServer.this.f1484A.isHeld()) {
                        DlnaMediaServer.this.f1484A.release();
                        new Timer().schedule(new C0414i(this), 1500L);
                        return;
                    }
                    return;
                }
                DlnaMediaServer.this.f1484A.acquire();
                return;
            }
            Log.e("DlnaMediaServer", "ServiceChecker: dlnaserver wakelock was release");
            if (App.f1269a) {
                DlnaMediaServer.this.m1130c(true);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ void m1137e(DlnaMediaServer dlnaMediaServer) {
        App.f1270b = false;
        dlnaMediaServer.f1506r.setContentText(String.valueOf(dlnaMediaServer.getString(C0303R.string.notify_msg)) + " " + C1637a.m4702a() + ":" + App.f1280l + " [" + C1637a.m4707b() + "]");
        NotificationManager notificationManager = (NotificationManager) dlnaMediaServer.getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 16) {
            notificationManager.notify(2, dlnaMediaServer.f1506r.build());
        } else {
            notificationManager.notify(2, dlnaMediaServer.f1506r.getNotification());
        }
        if (App.f1269a) {
            try {
                dlnaMediaServer.f1504p.mo4946p();
            } catch (Exception e) {
                App.f1271c = true;
                dlnaMediaServer.m1143g(dlnaMediaServer.getString(C0303R.string.some_errors_server));
                Log.e("DlnaMediaServer", "startServer()", e);
            }
            dlnaMediaServer.f1507s = new C0388k(dlnaMediaServer.f1508t, dlnaMediaServer.getApplicationContext());
            ContentResolver contentResolver = dlnaMediaServer.getContentResolver();
            if (contentResolver != null) {
                contentResolver.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, dlnaMediaServer.f1507s);
                contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, dlnaMediaServer.f1507s);
                contentResolver.registerContentObserver(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, true, dlnaMediaServer.f1507s);
            }
            dlnaMediaServer.m1152m();
            dlnaMediaServer.m1153n();
            return;
        }
        dlnaMediaServer.m1153n();
        dlnaMediaServer.stopSelf();
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ void m1140f(DlnaMediaServer dlnaMediaServer) {
        if (dlnaMediaServer.f1505q == null) {
            try {
                dlnaMediaServer.f1505q = new C0415j(dlnaMediaServer.getApplicationContext(), App.f1280l);
                dlnaMediaServer.f1505q.m1177a(dlnaMediaServer.f1511w);
                dlnaMediaServer.f1505q.m1323c();
            } catch (IOException e) {
                App.f1271c = true;
                dlnaMediaServer.m1143g(dlnaMediaServer.getString(C0303R.string.some_errors_server));
                Log.e("DlnaMediaServer", "startHTTPServer()", e);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    static /* synthetic */ void m1147i(DlnaMediaServer dlnaMediaServer) throws Throwable {
        App.f1281m = 0;
        App.f1282n = 0;
        App.f1272d = true;
        App.f1274f.clear();
        App.f1275g.clear();
        App.f1276h.clear();
        App.f1277i.clear();
        App.f1279k.clear();
        App.f1278j.clear();
        App.f1274f.putAll(dlnaMediaServer.f1503o);
        new C0412g(dlnaMediaServer, "DlnaMediaServer.UIUpdater").start();
        dlnaMediaServer.f1508t.postDelayed(new RunnableC0411f(dlnaMediaServer), 10000L);
        C1724d c1724dM4949s = null;
        try {
            c1724dM4949s = dlnaMediaServer.f1504p.m4949s();
            C0419n c0419n = new C0419n();
            C1701i c1701i = new C1701i();
            C1699g c1699g = new C1699g();
            C1694b c1694b = new C1694b();
            C1700h c1700h = new C1700h();
            C1696d c1696d = new C1696d();
            C0420o c0420o = new C0420o(c0419n);
            C0431z c0431z = new C0431z(c0419n);
            C0400aa c0400aa = new C0400aa(c0419n);
            C0401ab c0401ab = new C0401ab(c0419n);
            C0402ac c0402ac = new C0402ac(c0419n);
            C0403ad c0403ad = new C0403ad(c0419n);
            C0404ae c0404ae = new C0404ae(c0419n);
            C0405af c0405af = new C0405af(c0419n);
            C0406ag c0406ag = new C0406ag(c0419n);
            C0421p c0421p = new C0421p(c0419n);
            C0422q c0422q = new C0422q(c0419n);
            C0423r c0423r = new C0423r(c0419n);
            C0424s c0424s = new C0424s(c0419n);
            C0425t c0425t = new C0425t(c0419n);
            C0426u c0426u = new C0426u(c0419n);
            C0427v c0427v = new C0427v(c0419n);
            C0428w c0428w = new C0428w(c0419n);
            C0429x c0429x = new C0429x(c0419n);
            C0430y c0430y = new C0430y(c0419n);
            c1724dM4949s.m4941a(c0402ac);
            c1724dM4949s.m4941a(c0430y);
            c1724dM4949s.m4941a(c0429x);
            c1724dM4949s.m4941a(c0428w);
            c1724dM4949s.m4941a(c0427v);
            c1724dM4949s.m4941a(c0426u);
            c1724dM4949s.m4941a(c0425t);
            c1724dM4949s.m4941a(c0424s);
            c1724dM4949s.m4941a(c0423r);
            c1724dM4949s.m4941a(c0422q);
            c1724dM4949s.m4941a(c0421p);
            c1724dM4949s.m4941a(c0406ag);
            c1724dM4949s.m4941a(c0405af);
            c1724dM4949s.m4941a(c0404ae);
            c1724dM4949s.m4941a(c0403ad);
            c1724dM4949s.m4941a(c0401ab);
            c1724dM4949s.m4941a(c0400aa);
            c1724dM4949s.m4941a(c0431z);
            c1724dM4949s.m4941a(c0420o);
            c1724dM4949s.m4941a(c1696d);
            c1724dM4949s.m4941a(c1700h);
            c1724dM4949s.m4941a(c1694b);
            c1724dM4949s.m4941a(c1699g);
            c1724dM4949s.m4941a(c1701i);
            c1724dM4949s.m4942b().m5162l();
        } catch (Exception e) {
            App.f1271c = true;
            Log.e("DlnaMediaServer", "setMediaContent()::mediaServer.getContentDirectory().getRootNode().removeAllContentNodes()", e);
        }
        if (dlnaMediaServer.f1510v != null) {
            if (C1744a.f6521a) {
                Log.d("DlnaMediaServer", "pathsList=" + dlnaMediaServer.f1510v);
            }
        } else {
            Log.w("DlnaMediaServer", "pathsList=null");
        }
        if (App.f1269a) {
            try {
                dlnaMediaServer.m1136e();
            } catch (Exception e2) {
                App.f1271c = true;
                Log.e("DlnaMediaServer", "setMediaContent()::addAudio()", e2);
            }
        }
        if (App.f1269a) {
            try {
                dlnaMediaServer.m1142g();
            } catch (Exception e3) {
                App.f1271c = true;
                Log.e("DlnaMediaServer", "setMediaContent()::addImage()", e3);
            }
        }
        if (App.f1269a) {
            try {
                dlnaMediaServer.m1139f();
            } catch (Exception e4) {
                App.f1271c = true;
                Log.e("DlnaMediaServer", "setMediaContent()::addVideo()", e4);
            }
        }
        if (App.f1269a) {
            try {
                dlnaMediaServer.m1144h();
            } catch (Exception e5) {
                App.f1271c = true;
                Log.e("DlnaMediaServer", "setMediaContent()::addFiles()", e5);
            }
        }
        if (App.f1269a) {
            try {
                dlnaMediaServer.m1146i();
            } catch (Exception e6) {
                App.f1271c = true;
                Log.e("DlnaMediaServer", "setMediaContent()::addSAFContent()", e6);
            }
        }
        if (App.f1269a) {
            try {
                dlnaMediaServer.m1148j();
            } catch (Exception e7) {
                App.f1271c = true;
                Log.e("DlnaMediaServer", "setMediaContent()::addSMBContent()", e7);
            }
        }
        if (App.f1269a) {
            try {
                dlnaMediaServer.m1150k();
            } catch (Exception e8) {
                App.f1271c = true;
                Log.e("DlnaMediaServer", "setMediaContent()::addFTPContent()", e8);
            }
        }
        if (App.f1269a) {
            try {
                dlnaMediaServer.m1151l();
            } catch (Exception e9) {
                App.f1271c = true;
                Log.e("DlnaMediaServer", "setMediaContent()::addPlayLists()", e9);
            }
        }
        if (App.f1271c) {
            dlnaMediaServer.m1143g(dlnaMediaServer.getString(C0303R.string.some_errors_content));
        }
        if (c1724dM4949s != null) {
            c1724dM4949s.m4939a();
        }
        App.f1272d = false;
        dlnaMediaServer.f1514z = null;
        dlnaMediaServer.m1153n();
    }
}
