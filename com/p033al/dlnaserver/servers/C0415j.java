package com.p033al.dlnaserver.servers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.p033al.dlnaserver.App;
import com.p033al.dlnaserver.customs.C0378a;
import com.p033al.dlnaserver.p035b.C0308a;
import com.p033al.dlnaserver.p035b.C0346bk;
import com.p033al.dlnaserver.p035b.C0349c;
import com.p033al.dlnaserver.p035b.C0355i;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.cybergarage.p155b.C1637a;
import org.cybergarage.p173e.C1744a;
import org.p044b.p045a.p046a.AbstractC0486d;
import org.p044b.p045a.p046a.InterfaceC0480c;
import org.p044b.p045a.p046a.p048b.EnumC0479a;
import org.p044b.p045a.p046a.p049c.C0483c;
import org.p044b.p045a.p046a.p049c.EnumC0485e;
import p000a.p029g.C0215ae;

/* JADX INFO: renamed from: com.al.dlnaserver.servers.j */
/* JADX INFO: compiled from: HttpFileServer.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"DefaultLocale"})
public final class C0415j extends AbstractC0486d {

    /* JADX INFO: renamed from: i */
    private Context f1534i;

    /* JADX INFO: renamed from: j */
    private List<InetAddress> f1535j;

    /* JADX INFO: renamed from: k */
    private int f1536k;

    public C0415j(Context context, int i) {
        super(i);
        this.f1534i = context;
        this.f1536k = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m1177a(String str) {
        String[] strArrSplit = str.split(";");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            try {
                if (!str2.isEmpty()) {
                    arrayList.add(InetAddress.getByName(str2));
                }
            } catch (UnknownHostException e) {
                Log.e("HttpFileServer", "setWhiteList(" + str + ")", e);
            }
        }
        this.f1535j = arrayList;
    }

    @Override // org.p044b.p045a.p046a.AbstractC0486d
    /* JADX INFO: renamed from: a */
    public final C0483c mo1176a(InterfaceC0480c interfaceC0480c) {
        boolean z;
        C0483c c0483cM1166a;
        C0483c c0483cM1304a;
        Map<String, String> mapMo1292b = interfaceC0480c.mo1292b();
        String strMo1294d = interfaceC0480c.mo1294d();
        EnumC0479a enumC0479aMo1293c = interfaceC0480c.mo1293c();
        String strM1159a = m1159a(mapMo1292b, "user-agent");
        String strMo1295e = interfaceC0480c.mo1295e();
        String strM1159a2 = m1159a(mapMo1292b, "range");
        Log.i("HttpFileServer", String.valueOf(strMo1295e) + " " + enumC0479aMo1293c + " '" + strMo1294d + "' " + (strM1159a2 == null ? "" : "range=".concat(String.valueOf(strM1159a2))) + " user-agent=" + strM1159a);
        if (C1744a.f6521a) {
            Log.d("HttpFileServer", "header=".concat(String.valueOf(mapMo1292b)));
        }
        String strM1159a3 = m1159a(mapMo1292b, "connection");
        if (strM1159a3 == null || !strM1159a3.toLowerCase().equals("keep-alive")) {
            z = false;
        } else {
            z = true;
        }
        if (this.f1535j != null && !this.f1535j.isEmpty() && !this.f1535j.contains(interfaceC0480c.mo1296f())) {
            return m1166a(EnumC0485e.FORBIDDEN, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
        }
        if (strMo1294d.equals("/")) {
            return m1166a(EnumC0485e.OK, "text/html", m1174e(), z);
        }
        if (strMo1294d.equals("/playlist.m3u")) {
            C0483c c0483cM1303a = C0483c.m1303a(EnumC0485e.OK, "audio/mpegurl", new ByteArrayInputStream(m1175f().getBytes(Charset.forName("UTF-8"))), r3.length);
            m1169a(c0483cM1303a, z, (String) null, "audio/mpegurl");
            return c0483cM1303a;
        }
        File file = App.f1274f.get(strMo1294d.replaceFirst("/", ""));
        String strM1019a = C0349c.m1019a(strMo1294d, strM1159a);
        String str = (strM1019a == null || !strM1019a.contains("srt")) ? strM1019a : "smi/caption";
        if (EnumC0479a.HEAD.equals(enumC0479aMo1293c)) {
            Uri uri = App.f1275g.get(strMo1294d.replaceFirst("/", ""));
            C0215ae c0215ae = App.f1276h.get(strMo1294d.replaceFirst("/", ""));
            C0378a c0378a = App.f1277i.get(strMo1294d.replaceFirst("/", ""));
            String str2 = App.f1278j.get(strMo1294d.replaceFirst("/", ""));
            if (file == null) {
                if (uri == null) {
                    if (c0215ae != null) {
                        return m1171b(strMo1294d, str, z);
                    }
                    if (c0378a == null) {
                        if (str2 != null) {
                            return m1160a(strMo1294d, strM1159a, z);
                        }
                        return m1166a(EnumC0485e.FORBIDDEN, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
                    }
                    C0378a c0378a2 = App.f1277i.get(strMo1294d.replaceFirst("/", ""));
                    if (c0378a2 == null) {
                        return m1166a(EnumC0485e.NOT_FOUND, "text/plain", "404. NOT FOUND: File not found.", z);
                    }
                    String hexString = Integer.toHexString((String.valueOf(c0378a2.m1075b().getPath()) + c0378a2.m1076c() + c0378a2.m1077d()).hashCode());
                    C0483c c0483cM1304a2 = C0483c.m1304a(EnumC0485e.OK, str, "");
                    c0483cM1304a2.m1312a("Content-Length", new StringBuilder().append(c0378a2.m1077d()).toString());
                    c0483cM1304a2.m1312a("ETag", hexString);
                    m1169a(c0483cM1304a2, z, c0378a2.m1075b().getPath(), str);
                    return c0483cM1304a2;
                }
                Uri uri2 = App.f1275g.get(strMo1294d.replaceFirst("/", ""));
                if (uri2 == null) {
                    return m1166a(EnumC0485e.NOT_FOUND, "text/plain", "404. NOT FOUND: File not found.", z);
                }
                if (Build.VERSION.SDK_INT < 19) {
                    return m1166a(EnumC0485e.FORBIDDEN, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
                }
                Cursor cursorQuery = this.f1534i.getContentResolver().query(uri2, null, null, null, null, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                    long j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_size"));
                    String hexString2 = Integer.toHexString((String.valueOf(string) + cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("last_modified")) + j).hashCode());
                    c0483cM1166a = C0483c.m1304a(EnumC0485e.OK, str, "");
                    c0483cM1166a.m1312a("Content-Length", String.valueOf(j));
                    c0483cM1166a.m1312a("ETag", hexString2);
                    m1169a(c0483cM1166a, z, string, str);
                } else {
                    Log.e("HttpFileServer", "createResponse()::context.getContentResolver().query=null");
                    c0483cM1166a = m1166a(EnumC0485e.FORBIDDEN, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
                }
                cursorQuery.close();
                return c0483cM1166a;
            }
            if (file == null) {
                m1166a(EnumC0485e.FORBIDDEN, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
            }
            if (!file.exists()) {
                c0483cM1304a = C0483c.m1304a(EnumC0485e.NOT_FOUND, "text/plain", "404. NOT FOUND: File not found.");
            } else {
                String hexString3 = Integer.toHexString((String.valueOf(file.getAbsolutePath()) + file.lastModified() + file.length()).hashCode());
                c0483cM1304a = C0483c.m1304a(EnumC0485e.OK, str, "");
                c0483cM1304a.m1312a("Content-Length", new StringBuilder().append(file.length()).toString());
                c0483cM1304a.m1312a("ETag", hexString3);
            }
            m1169a(c0483cM1304a, z, file.getAbsolutePath(), str);
            return c0483cM1304a;
        }
        return m1161a(strMo1294d, mapMo1292b, file, str, strM1159a, z);
    }

    /* JADX INFO: renamed from: a */
    private C0483c m1161a(String str, Map<String, String> map, File file, String str2, String str3, boolean z) {
        long j;
        int iIndexOf;
        try {
            if (file == null) {
                Uri uri = App.f1275g.get(str.replaceFirst("/", ""));
                C0215ae c0215ae = App.f1276h.get(str.replaceFirst("/", ""));
                C0378a c0378a = App.f1277i.get(str.replaceFirst("/", ""));
                String str4 = App.f1278j.get(str.replaceFirst("/", ""));
                if (uri != null) {
                    return m1163a(map, uri, str2, z);
                }
                if (c0215ae != null) {
                    return m1162a(map, c0215ae, str2, z);
                }
                if (c0378a != null) {
                    return m1164a(map, c0378a, str2, z);
                }
                if (str4 != null) {
                    return m1167a(EnumC0485e.OK, map, str, z, str3);
                }
                return m1166a(EnumC0485e.FORBIDDEN, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
            }
            if (!file.exists()) {
                return m1166a(EnumC0485e.NOT_FOUND, "text/plain", "404. NOT FOUND: File not found.", z);
            }
            String hexString = Integer.toHexString((String.valueOf(file.getAbsolutePath()) + file.lastModified() + file.length()).hashCode());
            long j2 = 0;
            long j3 = -1;
            String strM1159a = m1159a(map, "range");
            if (strM1159a == null || !strM1159a.startsWith("bytes=") || (iIndexOf = (strM1159a = strM1159a.substring(6)).indexOf(45)) <= 0) {
                j = j2;
            } else {
                try {
                    j2 = Long.parseLong(strM1159a.substring(0, iIndexOf));
                    j3 = Long.parseLong(strM1159a.substring(iIndexOf + 1));
                    j = j2;
                } catch (NumberFormatException e) {
                    j = j2;
                }
            }
            long length = file.length();
            if (strM1159a == null || j < 0) {
                if (hexString.equals(m1159a(map, "if-none-match"))) {
                    return m1166a(EnumC0485e.NOT_MODIFIED, str2, "", z);
                }
                C0483c c0483cM1165a = m1165a(EnumC0485e.OK, str2, new FileInputStream(file), length, z, file.getAbsolutePath());
                c0483cM1165a.m1312a("Content-Length", String.valueOf(length));
                c0483cM1165a.m1312a("ETag", hexString);
                return c0483cM1165a;
            }
            if (j > length) {
                C0483c c0483cM1166a = m1166a(EnumC0485e.RANGE_NOT_SATISFIABLE, "text/plain", "", z);
                c0483cM1166a.m1312a("Content-Range", "bytes 0-0/".concat(String.valueOf(length)));
                c0483cM1166a.m1312a("ETag", hexString);
                return c0483cM1166a;
            }
            long j4 = j3 < 0 ? length - 1 : j3;
            long j5 = (j4 - j) + 1;
            if (j5 < 0) {
                j5 = 0;
            }
            C0416k c0416k = new C0416k(this, file, j5);
            c0416k.skip(j);
            C0483c c0483cM1165a2 = m1165a(EnumC0485e.PARTIAL_CONTENT, str2, c0416k, j5, z, file.getAbsolutePath());
            c0483cM1165a2.m1312a("Content-Length", String.valueOf(j5));
            c0483cM1165a2.m1312a("Content-Range", "bytes " + j + "-" + j4 + "/" + length);
            c0483cM1165a2.m1312a("ETag", hexString);
            return c0483cM1165a2;
        } catch (IOException e2) {
            return m1166a(EnumC0485e.FORBIDDEN, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0176 A[Catch: IOException -> 0x0161, all -> 0x01c7, TRY_ENTER, TryCatch #6 {IOException -> 0x0161, all -> 0x01c7, blocks: (B:9:0x0029, B:11:0x002f, B:13:0x006e, B:14:0x0078, B:16:0x0086, B:18:0x008e, B:21:0x009c, B:28:0x00bb, B:39:0x00fd, B:46:0x0176, B:48:0x0184, B:49:0x0190, B:55:0x01ce), top: B:69:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0184 A[Catch: IOException -> 0x0161, all -> 0x01c7, TryCatch #6 {IOException -> 0x0161, all -> 0x01c7, blocks: (B:9:0x0029, B:11:0x002f, B:13:0x006e, B:14:0x0078, B:16:0x0086, B:18:0x008e, B:21:0x009c, B:28:0x00bb, B:39:0x00fd, B:46:0x0176, B:48:0x0184, B:49:0x0190, B:55:0x01ce), top: B:69:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0190 A[Catch: IOException -> 0x0161, all -> 0x01c7, TRY_LEAVE, TryCatch #6 {IOException -> 0x0161, all -> 0x01c7, blocks: (B:9:0x0029, B:11:0x002f, B:13:0x006e, B:14:0x0078, B:16:0x0086, B:18:0x008e, B:21:0x009c, B:28:0x00bb, B:39:0x00fd, B:46:0x0176, B:48:0x0184, B:49:0x0190, B:55:0x01ce), top: B:69:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ce A[Catch: IOException -> 0x0161, all -> 0x01c7, TRY_ENTER, TRY_LEAVE, TryCatch #6 {IOException -> 0x0161, all -> 0x01c7, blocks: (B:9:0x0029, B:11:0x002f, B:13:0x006e, B:14:0x0078, B:16:0x0086, B:18:0x008e, B:21:0x009c, B:28:0x00bb, B:39:0x00fd, B:46:0x0176, B:48:0x0184, B:49:0x0190, B:55:0x01ce), top: B:69:0x0029 }] */
    @android.annotation.SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.p044b.p045a.p046a.p049c.C0483c m1163a(java.util.Map<java.lang.String, java.lang.String> r19, android.net.Uri r20, java.lang.String r21, boolean r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p033al.dlnaserver.servers.C0415j.m1163a(java.util.Map, android.net.Uri, java.lang.String, boolean):org.b.a.a.c.c");
    }

    /* JADX INFO: renamed from: a */
    private static C0483c m1162a(Map<String, String> map, C0215ae c0215ae, String str, boolean z) {
        long j;
        int iIndexOf;
        try {
            if (!c0215ae.m629f()) {
                return m1166a(EnumC0485e.NOT_FOUND, "text/plain", "404. NOT FOUND: File not found.", z);
            }
            String hexString = Integer.toHexString((String.valueOf(c0215ae.m632i()) + c0215ae.m636m() + c0215ae.m639p()).hashCode());
            long j2 = 0;
            long j3 = -1;
            String strM1159a = m1159a(map, "range");
            if (strM1159a == null || !strM1159a.startsWith("bytes=") || (iIndexOf = (strM1159a = strM1159a.substring(6)).indexOf(45)) <= 0) {
                j = j2;
            } else {
                try {
                    j2 = Long.parseLong(strM1159a.substring(0, iIndexOf));
                    j3 = Long.parseLong(strM1159a.substring(iIndexOf + 1));
                    j = j2;
                } catch (NumberFormatException e) {
                    j = j2;
                }
            }
            long jM639p = c0215ae.m639p();
            if (strM1159a == null || j < 0) {
                if (hexString.equals(m1159a(map, "if-none-match"))) {
                    return m1166a(EnumC0485e.NOT_MODIFIED, str, "", z);
                }
                C0483c c0483cM1165a = m1165a(EnumC0485e.OK, str, c0215ae.getInputStream(), jM639p, z, c0215ae.m632i());
                c0483cM1165a.m1312a("Content-Length", String.valueOf(jM639p));
                c0483cM1165a.m1312a("ETag", hexString);
                return c0483cM1165a;
            }
            if (j > jM639p) {
                C0483c c0483cM1166a = m1166a(EnumC0485e.RANGE_NOT_SATISFIABLE, "text/plain", "", z);
                c0483cM1166a.m1312a("Content-Range", "bytes 0-0/".concat(String.valueOf(jM639p)));
                c0483cM1166a.m1312a("ETag", hexString);
                return c0483cM1166a;
            }
            long j4 = j3 < 0 ? jM639p - 1 : j3;
            long j5 = (j4 - j) + 1;
            if (j5 < 0) {
                j5 = 0;
            }
            InputStream inputStream = c0215ae.getInputStream();
            inputStream.skip(j);
            C0483c c0483cM1165a2 = m1165a(EnumC0485e.PARTIAL_CONTENT, str, inputStream, j5, z, c0215ae.m632i());
            c0483cM1165a2.m1312a("Content-Length", String.valueOf(j5));
            c0483cM1165a2.m1312a("Content-Range", "bytes " + j + "-" + j4 + "/" + jM639p);
            c0483cM1165a2.m1312a("ETag", hexString);
            return c0483cM1165a2;
        } catch (IOException e2) {
            return m1166a(EnumC0485e.FORBIDDEN, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
        }
    }

    /* JADX INFO: renamed from: a */
    private static C0483c m1164a(Map<String, String> map, C0378a c0378a, String str, boolean z) {
        long j;
        int iIndexOf;
        try {
            String hexString = Integer.toHexString((String.valueOf(c0378a.m1075b().getPath()) + c0378a.m1076c() + c0378a.m1077d()).hashCode());
            long j2 = 0;
            long j3 = -1;
            String strM1159a = m1159a(map, "range");
            if (strM1159a == null || !strM1159a.startsWith("bytes=") || (iIndexOf = (strM1159a = strM1159a.substring(6)).indexOf(45)) <= 0) {
                j = j2;
            } else {
                try {
                    j2 = Long.parseLong(strM1159a.substring(0, iIndexOf));
                    j3 = Long.parseLong(strM1159a.substring(iIndexOf + 1));
                    j = j2;
                } catch (NumberFormatException e) {
                    j = j2;
                }
            }
            long jM1077d = c0378a.m1077d();
            if (strM1159a == null || j < 0) {
                if (hexString.equals(m1159a(map, "if-none-match"))) {
                    return m1166a(EnumC0485e.NOT_MODIFIED, str, "", z);
                }
                new C0308a();
                C0483c c0483cM1165a = m1165a(EnumC0485e.OK, str, C0308a.m1008a(c0378a.m1075b().toURI()).m1223c(c0378a.m1074a().m1252c()), jM1077d, z, c0378a.m1075b().getPath());
                c0483cM1165a.m1312a("Content-Length", String.valueOf(jM1077d));
                c0483cM1165a.m1312a("ETag", hexString);
                return c0483cM1165a;
            }
            if (j > jM1077d) {
                C0483c c0483cM1166a = m1166a(EnumC0485e.RANGE_NOT_SATISFIABLE, "text/plain", "", z);
                c0483cM1166a.m1312a("Content-Range", "bytes 0-0/".concat(String.valueOf(jM1077d)));
                c0483cM1166a.m1312a("ETag", hexString);
                return c0483cM1166a;
            }
            long j4 = j3 < 0 ? jM1077d - 1 : j3;
            long j5 = (j4 - j) + 1;
            if (j5 < 0) {
                j5 = 0;
            }
            new C0308a();
            InputStream inputStreamM1223c = C0308a.m1008a(c0378a.m1075b().toURI()).m1223c(c0378a.m1074a().m1252c());
            inputStreamM1223c.skip(j);
            C0483c c0483cM1165a2 = m1165a(EnumC0485e.PARTIAL_CONTENT, str, inputStreamM1223c, j5, z, c0378a.m1075b().getPath());
            c0483cM1165a2.m1312a("Content-Length", String.valueOf(j5));
            c0483cM1165a2.m1312a("Content-Range", "bytes " + j + "-" + j4 + "/" + jM1077d);
            c0483cM1165a2.m1312a("ETag", hexString);
            return c0483cM1165a2;
        } catch (IOException | URISyntaxException e2) {
            return m1166a(EnumC0485e.FORBIDDEN, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1168a(C0483c c0483c) {
        Log.i("HttpFileServer", "Response='" + c0483c.m1309a().mo1299a() + "'");
    }

    /* JADX INFO: renamed from: a */
    private static C0483c m1160a(String str, String str2, boolean z) {
        String str3 = App.f1278j.get(str.replaceFirst("/", ""));
        if (str3 == null) {
            return m1166a(EnumC0485e.NOT_FOUND, "text/plain", "404. NOT FOUND: File not found.", z);
        }
        String hexString = Integer.toHexString(str3.hashCode());
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str3).openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(10000);
            uRLConnectionOpenConnection.setReadTimeout(10000);
            String contentType = uRLConnectionOpenConnection.getContentType();
            String str4 = contentType == null ? "application/octet-stream" : contentType;
            C0483c c0483cM1304a = C0483c.m1304a(EnumC0485e.OK, str4, "");
            m1169a(c0483cM1304a, z, (String) null, str4);
            if (str2 == null || (str2 != null && str2.contains("SEC_HHP_"))) {
                c0483cM1304a.m1312a("Content-Length", "1073741824");
            }
            c0483cM1304a.m1312a("ETag", hexString);
            return c0483cM1304a;
        } catch (IOException e) {
            Log.e("HttpFileServer", "createResponse()::URL.openConnection(). URL=".concat(String.valueOf(str3)), e);
            return m1166a(EnumC0485e.FORBIDDEN, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
        }
    }

    /* JADX INFO: renamed from: b */
    private static C0483c m1171b(String str, String str2, boolean z) {
        C0483c c0483cM1166a;
        C0215ae c0215ae = App.f1276h.get(str.replaceFirst("/", ""));
        if (c0215ae == null) {
            return m1166a(EnumC0485e.NOT_FOUND, "text/plain", "404. NOT FOUND: File not found.", z);
        }
        if (Build.VERSION.SDK_INT < 19) {
            return m1166a(EnumC0485e.FORBIDDEN, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
        }
        try {
            if (!c0215ae.m629f()) {
                c0483cM1166a = m1166a(EnumC0485e.NOT_FOUND, "text/plain", "404. NOT FOUND: File not found.", z);
            } else {
                String hexString = Integer.toHexString((String.valueOf(c0215ae.m632i()) + c0215ae.m636m() + c0215ae.m639p()).hashCode());
                C0483c c0483cM1304a = C0483c.m1304a(EnumC0485e.OK, str2, "");
                c0483cM1304a.m1312a("Content-Length", new StringBuilder().append(c0215ae.m639p()).toString());
                c0483cM1304a.m1312a("ETag", hexString);
                m1169a(c0483cM1304a, z, c0215ae.m632i(), str2);
                c0483cM1166a = c0483cM1304a;
            }
            return c0483cM1166a;
        } catch (IOException e) {
            Log.e("HttpFileServer", "createResponse()::context.createHeadResponseSMB()", e);
            return m1166a(EnumC0485e.FORBIDDEN, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
        }
    }

    /* JADX INFO: renamed from: a */
    private static C0483c m1165a(EnumC0485e enumC0485e, String str, InputStream inputStream, long j, boolean z, String str2) {
        C0483c c0483cM1303a = C0483c.m1303a(enumC0485e, str, inputStream, j);
        m1169a(c0483cM1303a, z, str2, str);
        return c0483cM1303a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [org.b.a.a.c.c] */
    /* JADX INFO: renamed from: a */
    private static C0483c m1167a(EnumC0485e enumC0485e, Map<String, String> map, String str, boolean z, String str2) {
        C0483c c0483cM1303a;
        String str3 = App.f1278j.get(str.replaceFirst("/", ""));
        if (str3 == 0) {
            return m1166a(EnumC0485e.NOT_FOUND, "text/plain", "404. NOT FOUND: File not found.", z);
        }
        str3.endsWith("m3u8");
        String hexString = Integer.toHexString(str3.hashCode());
        String strM1159a = m1159a(map, "icy-metadata");
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str3).openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(10000);
            uRLConnectionOpenConnection.setReadTimeout(10000);
            if (strM1159a != null && strM1159a.equals("1")) {
                uRLConnectionOpenConnection.setRequestProperty("Icy-MetaData", "1");
            }
            uRLConnectionOpenConnection.connect();
            String contentType = uRLConnectionOpenConnection.getContentType();
            InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
            String str4 = contentType == null ? "application/octet-stream" : contentType;
            if (str2 == null || (str2 != null && str2.contains("SEC_HHP_"))) {
                c0483cM1303a = C0483c.m1303a(enumC0485e, str4, inputStream, 1073741824L);
            } else {
                c0483cM1303a = C0483c.m1302a(enumC0485e, str4, inputStream);
            }
            String headerField = uRLConnectionOpenConnection.getHeaderField("icy-genre");
            if (headerField != null) {
                c0483cM1303a.m1312a("icy-genre", headerField);
            }
            String headerField2 = uRLConnectionOpenConnection.getHeaderField("icy-name");
            if (headerField2 != null) {
                c0483cM1303a.m1312a("icy-name", headerField2);
            }
            String headerField3 = uRLConnectionOpenConnection.getHeaderField("icy-metaint");
            if (headerField3 != null) {
                c0483cM1303a.m1312a("icy-metaint", headerField3);
            }
            String headerField4 = uRLConnectionOpenConnection.getHeaderField("icy-url");
            if (headerField4 != null) {
                c0483cM1303a.m1312a("icy-url", headerField4);
            }
            String headerField5 = uRLConnectionOpenConnection.getHeaderField("icy-pub");
            if (headerField5 != null) {
                c0483cM1303a.m1312a("icy-pub", headerField5);
            }
            String headerField6 = uRLConnectionOpenConnection.getHeaderField("icy-br");
            if (headerField6 != null) {
                c0483cM1303a.m1312a("icy-br", headerField6);
            }
            m1169a(c0483cM1303a, z, (String) null, str4);
            c0483cM1303a.m1312a("ETag", hexString);
            str3 = c0483cM1303a;
            return str3;
        } catch (IOException e) {
            Log.e("HttpFileServer", "createResponse()::URL.openConnection(). URL=".concat(String.valueOf(str3)), e);
            return m1166a(EnumC0485e.FORBIDDEN, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
        }
    }

    /* JADX INFO: renamed from: a */
    private static C0483c m1166a(EnumC0485e enumC0485e, String str, String str2, boolean z) {
        C0483c c0483cM1304a = C0483c.m1304a(enumC0485e, str, str2);
        m1169a(c0483cM1304a, z, (String) null, str);
        return c0483cM1304a;
    }

    /* JADX INFO: renamed from: a */
    private static void m1169a(C0483c c0483c, boolean z, String str, String str2) {
        c0483c.m1317b(z);
        c0483c.m1314a(!z);
        if (str != null) {
            c0483c.m1312a("Accept-Ranges", "bytes");
        } else {
            c0483c.m1312a("Accept-Ranges", "none");
            c0483c.m1312a("Cache-Control", "no-cache");
            c0483c.m1312a("Pragma", "no-cache");
        }
        c0483c.m1312a("EXT", "");
        c0483c.m1312a("realTimeInfo.dlna.org", "DLNA.ORG_TLAG=*");
        c0483c.m1312a("contentFeatures.dlna.org", "DLNA.ORG_OP=01;DLNA.ORG_CI=0;DLNA.ORG_FLAGS=01700000000000000000000000000000");
        String strM1172c = m1172c(str);
        if (strM1172c != null) {
            c0483c.m1312a("CaptionInfo.sec", strM1172c);
        }
        if (str2 != null && (str2.contains("image") || str2.contains("smi") || str2.contains("text"))) {
            c0483c.m1312a("transferMode.dlna.org", "Interactive");
        } else {
            c0483c.m1312a("transferMode.dlna.org", "Streaming");
        }
        c0483c.m1312a("Server", "DLNADOC/1.50 UPnP/1.0, Cybergarage/2.1.2, NanoHTTPD/2.3.1, DLNAServer/1, Android/" + Build.VERSION.RELEASE);
        m1168a(c0483c);
    }

    /* JADX INFO: renamed from: e */
    private String m1174e() {
        Map<String, File> mapM1034a;
        String strSubstring;
        StringBuilder sb = new StringBuilder("<html><head><title>DLNAServer Files</title><style>\nspan.dirname { font-weight: bold; }\nspan.filename { font-size: 80%; }\nspan.filesize { font-size: 70%; font-weight: bold; }\na {text-decoration: none; }\n</style></head><body>\n");
        sb.append(m1173d("qr.html").replace("@adr", "http://" + C1637a.m4702a() + ":" + this.f1536k));
        sb.append("<script type=\"application/javascript\">");
        sb.append(m1173d("qrcodegen.min.js"));
        sb.append("</script>");
        sb.append("<script type=\"application/javascript\">");
        sb.append(m1173d("qr.min.js"));
        sb.append("</script>");
        if (App.f1274f.size() > 0 || App.f1275g.size() > 0) {
            try {
                mapM1034a = C0355i.m1034a(App.f1274f);
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                mapM1034a = App.f1274f;
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, File> entry : mapM1034a.entrySet()) {
                String strM1017a = C0349c.m1017a(entry.getValue());
                String key = entry.getKey();
                File value = entry.getValue();
                if (!m1170a(key, strM1017a) && value != null) {
                    arrayList.add(value.getAbsolutePath());
                }
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            if (strArr == null || strArr.length == 0) {
                strSubstring = "";
            } else {
                int iM1014a = C0346bk.m1014a(strArr);
                if (iM1014a == -1) {
                    if (strArr[0] == null) {
                        strSubstring = "";
                    } else {
                        strSubstring = strArr[0];
                    }
                } else if (iM1014a == 0) {
                    strSubstring = "";
                } else {
                    strSubstring = strArr[0].substring(0, iM1014a);
                }
            }
            String str = !strSubstring.endsWith("/") ? null : strSubstring;
            sb.append("<ul>");
            sb.append("<section class=\"files\">");
            if (!arrayList.isEmpty()) {
                sb.append("<h1>Local Files</h1>\n");
                sb.append("<li><a href=\"");
                sb.append("http://" + C1637a.m4702a() + ":" + this.f1536k + "/playlist.m3u");
                sb.append("\"><span class=\"filename\"><b>");
                sb.append("All media m3u playlist");
                sb.append("</b></span></a>");
                sb.append("</li>");
            }
            for (Map.Entry<String, File> entry2 : mapM1034a.entrySet()) {
                String strM1017a2 = C0349c.m1017a(entry2.getValue());
                String key2 = entry2.getKey();
                if (!m1170a(key2, strM1017a2)) {
                    sb.append("<li><a href=\"");
                    sb.append("http://" + C1637a.m4702a() + ":" + this.f1536k + "/" + key2);
                    sb.append("\"><span class=\"filename\">");
                    if (str == null) {
                        sb.append(entry2.getValue().getAbsolutePath());
                    } else {
                        sb.append(entry2.getValue().getAbsolutePath().replace(str, "…/"));
                    }
                    sb.append("</span></a>");
                    long length = entry2.getValue().length();
                    sb.append("&nbsp;<span class=\"filesize\">(");
                    if (length < 1024) {
                        sb.append(length).append(" B");
                    } else if (length < 1048576) {
                        sb.append(length / 1024).append(".").append(((length % 1024) / 10) % 100).append(" KB");
                    } else {
                        sb.append(length / 1048576).append(".").append(((length % 1048576) / 10000) % 100).append(" MB");
                    }
                    sb.append(")</span></li>");
                }
            }
            for (Map.Entry<String, Uri> entry3 : App.f1275g.entrySet()) {
                String key3 = entry3.getKey();
                sb.append("<li><a href=\"");
                sb.append("http://" + C1637a.m4702a() + ":" + this.f1536k + "/" + key3);
                sb.append("\"><span class=\"filename\">");
                sb.append(entry3.getValue());
                sb.append("</span></a>");
                sb.append("&nbsp;<span class=\"filesize\">");
                sb.append("</span></li>");
            }
            if (!App.f1276h.isEmpty()) {
                sb.append("<h1>Network (SMB)</h1>\n");
                for (Map.Entry<String, C0215ae> entry4 : App.f1276h.entrySet()) {
                    String strM1020b = C0349c.m1020b(entry4.getValue().m631h());
                    String key4 = entry4.getKey();
                    if (!m1170a("", strM1020b)) {
                        sb.append("<li><a href=\"");
                        sb.append("http://" + C1637a.m4702a() + ":" + this.f1536k + "/" + key4);
                        sb.append("\"><span class=\"filename\">");
                        sb.append(String.valueOf(entry4.getValue().m633j()) + "/.../" + entry4.getValue().m631h());
                        sb.append("</span></a>");
                        sb.append("&nbsp;<span class=\"filesize\">");
                        sb.append("</span></li>");
                    }
                }
            }
            if (!App.f1277i.isEmpty()) {
                sb.append("<h1>Network (FTP)</h1>\n");
                for (Map.Entry<String, C0378a> entry5 : App.f1277i.entrySet()) {
                    String strM1020b2 = C0349c.m1020b(entry5.getValue().m1074a().m1252c());
                    String key5 = entry5.getKey();
                    if (!m1170a("", strM1020b2)) {
                        sb.append("<li><a href=\"");
                        sb.append("http://" + C1637a.m4702a() + ":" + this.f1536k + "/" + key5);
                        sb.append("\"><span class=\"filename\">");
                        sb.append(String.valueOf(entry5.getValue().m1075b().getHost()) + "/.../" + entry5.getValue().m1074a().m1252c());
                        sb.append("</span></a>");
                        sb.append("&nbsp;<span class=\"filesize\">");
                        sb.append("</span></li>");
                    }
                }
            }
            sb.append("</section>");
            sb.append("</ul>");
        }
        sb.append("</body></html>");
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    private String m1175f() {
        StringBuilder sb = new StringBuilder("#EXTM3U\r\n");
        for (Map.Entry<String, File> entry : App.f1274f.entrySet()) {
            if (!m1170a(entry.getKey(), C0349c.m1017a(entry.getValue()))) {
                sb.append("#EXTINF:-1,");
                sb.append(entry.getValue().getName());
                sb.append("\r\n");
                try {
                    sb.append("http://" + C1637a.m4702a() + ":" + this.f1536k + "/" + URLEncoder.encode(entry.getKey(), "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    Log.e("HttpFileServer", "Encoding not supported", e);
                }
                sb.append("\r\n");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1170a(String str, String str2) {
        if (!str.contains("thumb/thumb_") && !str.contains("icons/deviceIcon") && !str2.contains("srt") && !str2.contains("ssa") && !str2.contains("ass") && !str2.contains("sub") && !str2.contains("smi") && !str2.contains("txt") && !str2.contains("idx") && !str2.contains("mpl") && !str2.contains("vtt") && !str2.contains("psb") && !str2.contains("sami") && !str2.contains("pjs") && !str2.contains("sup")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private static String m1172c(String str) {
        if (str == null) {
            return null;
        }
        return App.f1279k.get(str);
    }

    /* JADX INFO: renamed from: a */
    private static String m1159a(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(str)) {
                return entry.getValue();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m1173d(java.lang.String r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L92
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L92
            android.content.Context r4 = r6.f1534i     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L92
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L92
            java.io.InputStream r4 = r4.open(r7)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L92
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L92
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L92
        L1a:
            java.lang.String r0 = r1.readLine()     // Catch: java.io.IOException -> L3f java.lang.Throwable -> L90
            if (r0 != 0) goto L28
            r1.close()     // Catch: java.io.IOException -> L7f
        L23:
            java.lang.String r0 = r3.toString()
            return r0
        L28:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L3f java.lang.Throwable -> L90
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.io.IOException -> L3f java.lang.Throwable -> L90
            r2.<init>(r0)     // Catch: java.io.IOException -> L3f java.lang.Throwable -> L90
            r0 = 10
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch: java.io.IOException -> L3f java.lang.Throwable -> L90
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L3f java.lang.Throwable -> L90
            r3.append(r0)     // Catch: java.io.IOException -> L3f java.lang.Throwable -> L90
            goto L1a
        L3f:
            r0 = move-exception
        L40:
            java.lang.String r2 = "HttpFileServer"
            java.lang.String r4 = "getFileContent(), fileName="
            java.lang.String r5 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = r4.concat(r5)     // Catch: java.lang.Throwable -> L90
            android.util.Log.e(r2, r4, r0)     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L23
            r1.close()     // Catch: java.io.IOException -> L55
            goto L23
        L55:
            r0 = move-exception
            java.lang.String r1 = "HttpFileServer"
            java.lang.String r2 = "getFileContent(), fileName="
            java.lang.String r4 = java.lang.String.valueOf(r7)
            java.lang.String r2 = r2.concat(r4)
            android.util.Log.e(r1, r2, r0)
            goto L23
        L66:
            r0 = move-exception
            r1 = r2
        L68:
            if (r1 == 0) goto L6d
            r1.close()     // Catch: java.io.IOException -> L6e
        L6d:
            throw r0
        L6e:
            r1 = move-exception
            java.lang.String r2 = "HttpFileServer"
            java.lang.String r3 = "getFileContent(), fileName="
            java.lang.String r4 = java.lang.String.valueOf(r7)
            java.lang.String r3 = r3.concat(r4)
            android.util.Log.e(r2, r3, r1)
            goto L6d
        L7f:
            r0 = move-exception
            java.lang.String r1 = "HttpFileServer"
            java.lang.String r2 = "getFileContent(), fileName="
            java.lang.String r4 = java.lang.String.valueOf(r7)
            java.lang.String r2 = r2.concat(r4)
            android.util.Log.e(r1, r2, r0)
            goto L23
        L90:
            r0 = move-exception
            goto L68
        L92:
            r0 = move-exception
            r1 = r2
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p033al.dlnaserver.servers.C0415j.m1173d(java.lang.String):java.lang.String");
    }
}
