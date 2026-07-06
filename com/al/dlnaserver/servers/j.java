package com.al.dlnaserver.servers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build$VERSION;
import android.util.Log;
import com.al.dlnaserver.App;
import com.al.dlnaserver.b.bk;
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
import java.util.Map$Entry;

/* JADX INFO: compiled from: HttpFileServer.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"DefaultLocale"})
public final class j extends org.b.a.a.d {
    private Context i;
    private List<InetAddress> j;
    private int k;

    public j(Context context, int i) {
        super(i);
        this.i = context;
        this.k = i;
    }

    public final void a(String str) {
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
        this.j = arrayList;
    }

    @Override // org.b.a.a.d
    public final org.b.a.a.c.c a(org.b.a.a.c cVar) {
        boolean z;
        org.b.a.a.c.c cVarA;
        org.b.a.a.c.c cVarA2;
        Map<String, String> mapB = cVar.b();
        String strD = cVar.d();
        org.b.a.a.b.a aVarC = cVar.c();
        String strA = a(mapB, "user-agent");
        String strE = cVar.e();
        String strA2 = a(mapB, "range");
        Log.i("HttpFileServer", String.valueOf(strE) + " " + aVarC + " '" + strD + "' " + (strA2 == null ? "" : "range=".concat(String.valueOf(strA2))) + " user-agent=" + strA);
        if (org.cybergarage.e.a.a) {
            Log.d("HttpFileServer", "header=".concat(String.valueOf(mapB)));
        }
        String strA3 = a(mapB, "connection");
        if (strA3 == null || !strA3.toLowerCase().equals("keep-alive")) {
            z = false;
        } else {
            z = true;
        }
        if (this.j != null && !this.j.isEmpty() && !this.j.contains(cVar.f())) {
            return a(org.b.a.a.c.e.o, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
        }
        if (strD.equals("/")) {
            return a(org.b.a.a.c.e.b, "text/html", e(), z);
        }
        if (strD.equals("/playlist.m3u")) {
            org.b.a.a.c.c cVarA3 = org.b.a.a.c.c.a(org.b.a.a.c.e.b, "audio/mpegurl", new ByteArrayInputStream(f().getBytes(Charset.forName("UTF-8"))), r3.length);
            a(cVarA3, z, (String) null, "audio/mpegurl");
            return cVarA3;
        }
        File file = App.f.get(strD.replaceFirst("/", ""));
        String strA4 = com.al.dlnaserver.b.c.a(strD, strA);
        String str = (strA4 == null || !strA4.contains("srt")) ? strA4 : "smi/caption";
        if (org.b.a.a.b.a.e.equals(aVarC)) {
            Uri uri = App.g.get(strD.replaceFirst("/", ""));
            a.g.ae aeVar = App.h.get(strD.replaceFirst("/", ""));
            com.al.dlnaserver.customs.a aVar = App.i.get(strD.replaceFirst("/", ""));
            String str2 = App.j.get(strD.replaceFirst("/", ""));
            if (file == null) {
                if (uri == null) {
                    if (aeVar != null) {
                        return b(strD, str, z);
                    }
                    if (aVar == null) {
                        if (str2 != null) {
                            return a(strD, strA, z);
                        }
                        return a(org.b.a.a.c.e.o, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
                    }
                    com.al.dlnaserver.customs.a aVar2 = App.i.get(strD.replaceFirst("/", ""));
                    if (aVar2 == null) {
                        return a(org.b.a.a.c.e.p, "text/plain", "404. NOT FOUND: File not found.", z);
                    }
                    String hexString = Integer.toHexString((String.valueOf(aVar2.b().getPath()) + aVar2.c() + aVar2.d()).hashCode());
                    org.b.a.a.c.c cVarA4 = org.b.a.a.c.c.a(org.b.a.a.c.e.b, str, "");
                    cVarA4.a("Content-Length", new StringBuilder().append(aVar2.d()).toString());
                    cVarA4.a("ETag", hexString);
                    a(cVarA4, z, aVar2.b().getPath(), str);
                    return cVarA4;
                }
                Uri uri2 = App.g.get(strD.replaceFirst("/", ""));
                if (uri2 == null) {
                    return a(org.b.a.a.c.e.p, "text/plain", "404. NOT FOUND: File not found.", z);
                }
                if (Build$VERSION.SDK_INT < 19) {
                    return a(org.b.a.a.c.e.o, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
                }
                Cursor cursorQuery = this.i.getContentResolver().query(uri2, null, null, null, null, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                    long j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_size"));
                    String hexString2 = Integer.toHexString((String.valueOf(string) + cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("last_modified")) + j).hashCode());
                    cVarA = org.b.a.a.c.c.a(org.b.a.a.c.e.b, str, "");
                    cVarA.a("Content-Length", String.valueOf(j));
                    cVarA.a("ETag", hexString2);
                    a(cVarA, z, string, str);
                } else {
                    Log.e("HttpFileServer", "createResponse()::context.getContentResolver().query=null");
                    cVarA = a(org.b.a.a.c.e.o, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
                }
                cursorQuery.close();
                return cVarA;
            }
            if (file == null) {
                a(org.b.a.a.c.e.o, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
            }
            if (!file.exists()) {
                cVarA2 = org.b.a.a.c.c.a(org.b.a.a.c.e.p, "text/plain", "404. NOT FOUND: File not found.");
            } else {
                String hexString3 = Integer.toHexString((String.valueOf(file.getAbsolutePath()) + file.lastModified() + file.length()).hashCode());
                cVarA2 = org.b.a.a.c.c.a(org.b.a.a.c.e.b, str, "");
                cVarA2.a("Content-Length", new StringBuilder().append(file.length()).toString());
                cVarA2.a("ETag", hexString3);
            }
            a(cVarA2, z, file.getAbsolutePath(), str);
            return cVarA2;
        }
        return a(strD, mapB, file, str, strA, z);
    }

    private org.b.a.a.c.c a(String str, Map<String, String> map, File file, String str2, String str3, boolean z) {
        long j;
        int iIndexOf;
        try {
            if (file == null) {
                Uri uri = App.g.get(str.replaceFirst("/", ""));
                a.g.ae aeVar = App.h.get(str.replaceFirst("/", ""));
                com.al.dlnaserver.customs.a aVar = App.i.get(str.replaceFirst("/", ""));
                String str4 = App.j.get(str.replaceFirst("/", ""));
                if (uri != null) {
                    return a(map, uri, str2, z);
                }
                if (aeVar != null) {
                    return a(map, aeVar, str2, z);
                }
                if (aVar != null) {
                    return a(map, aVar, str2, z);
                }
                if (str4 != null) {
                    return a(org.b.a.a.c.e.b, map, str, z, str3);
                }
                return a(org.b.a.a.c.e.o, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
            }
            if (!file.exists()) {
                return a(org.b.a.a.c.e.p, "text/plain", "404. NOT FOUND: File not found.", z);
            }
            String hexString = Integer.toHexString((String.valueOf(file.getAbsolutePath()) + file.lastModified() + file.length()).hashCode());
            long j2 = 0;
            long j3 = -1;
            String strA = a(map, "range");
            if (strA == null || !strA.startsWith("bytes=") || (iIndexOf = (strA = strA.substring(6)).indexOf(45)) <= 0) {
                j = j2;
            } else {
                try {
                    j2 = Long.parseLong(strA.substring(0, iIndexOf));
                    j3 = Long.parseLong(strA.substring(iIndexOf + 1));
                    j = j2;
                } catch (NumberFormatException e) {
                    j = j2;
                }
            }
            long length = file.length();
            if (strA == null || j < 0) {
                if (hexString.equals(a(map, "if-none-match"))) {
                    return a(org.b.a.a.c.e.k, str2, "", z);
                }
                org.b.a.a.c.c cVarA = a(org.b.a.a.c.e.b, str2, new FileInputStream(file), length, z, file.getAbsolutePath());
                cVarA.a("Content-Length", String.valueOf(length));
                cVarA.a("ETag", hexString);
                return cVarA;
            }
            if (j > length) {
                org.b.a.a.c.c cVarA2 = a(org.b.a.a.c.e.z, "text/plain", "", z);
                cVarA2.a("Content-Range", "bytes 0-0/".concat(String.valueOf(length)));
                cVarA2.a("ETag", hexString);
                return cVarA2;
            }
            long j4 = j3 < 0 ? length - 1 : j3;
            long j5 = (j4 - j) + 1;
            if (j5 < 0) {
                j5 = 0;
            }
            k kVar = new k(this, file, j5);
            kVar.skip(j);
            org.b.a.a.c.c cVarA3 = a(org.b.a.a.c.e.f, str2, kVar, j5, z, file.getAbsolutePath());
            cVarA3.a("Content-Length", String.valueOf(j5));
            cVarA3.a("Content-Range", "bytes " + j + "-" + j4 + "/" + length);
            cVarA3.a("ETag", hexString);
            return cVarA3;
        } catch (IOException e2) {
            return a(org.b.a.a.c.e.o, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0176 A[Catch: IOException -> 0x0161, all -> 0x01c7, TRY_ENTER, TryCatch #6 {IOException -> 0x0161, all -> 0x01c7, blocks: (B:9:0x0029, B:11:0x002f, B:13:0x006e, B:14:0x0078, B:16:0x0086, B:18:0x008e, B:21:0x009c, B:28:0x00bb, B:39:0x00fd, B:46:0x0176, B:48:0x0184, B:49:0x0190, B:55:0x01ce), top: B:69:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0184 A[Catch: IOException -> 0x0161, all -> 0x01c7, TryCatch #6 {IOException -> 0x0161, all -> 0x01c7, blocks: (B:9:0x0029, B:11:0x002f, B:13:0x006e, B:14:0x0078, B:16:0x0086, B:18:0x008e, B:21:0x009c, B:28:0x00bb, B:39:0x00fd, B:46:0x0176, B:48:0x0184, B:49:0x0190, B:55:0x01ce), top: B:69:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0190 A[Catch: IOException -> 0x0161, all -> 0x01c7, TRY_LEAVE, TryCatch #6 {IOException -> 0x0161, all -> 0x01c7, blocks: (B:9:0x0029, B:11:0x002f, B:13:0x006e, B:14:0x0078, B:16:0x0086, B:18:0x008e, B:21:0x009c, B:28:0x00bb, B:39:0x00fd, B:46:0x0176, B:48:0x0184, B:49:0x0190, B:55:0x01ce), top: B:69:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ce A[Catch: IOException -> 0x0161, all -> 0x01c7, TRY_ENTER, TRY_LEAVE, TryCatch #6 {IOException -> 0x0161, all -> 0x01c7, blocks: (B:9:0x0029, B:11:0x002f, B:13:0x006e, B:14:0x0078, B:16:0x0086, B:18:0x008e, B:21:0x009c, B:28:0x00bb, B:39:0x00fd, B:46:0x0176, B:48:0x0184, B:49:0x0190, B:55:0x01ce), top: B:69:0x0029 }] */
    @android.annotation.SuppressLint({"InlinedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.b.a.a.c.c a(java.util.Map<java.lang.String, java.lang.String> r19, android.net.Uri r20, java.lang.String r21, boolean r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.al.dlnaserver.servers.j.a(java.util.Map, android.net.Uri, java.lang.String, boolean):org.b.a.a.c.c");
    }

    private static org.b.a.a.c.c a(Map<String, String> map, a.g.ae aeVar, String str, boolean z) throws Throwable {
        long j;
        int iIndexOf;
        try {
            if (!aeVar.f()) {
                return a(org.b.a.a.c.e.p, "text/plain", "404. NOT FOUND: File not found.", z);
            }
            String hexString = Integer.toHexString((String.valueOf(aeVar.i()) + aeVar.m() + aeVar.p()).hashCode());
            long j2 = 0;
            long j3 = -1;
            String strA = a(map, "range");
            if (strA == null || !strA.startsWith("bytes=") || (iIndexOf = (strA = strA.substring(6)).indexOf(45)) <= 0) {
                j = j2;
            } else {
                try {
                    j2 = Long.parseLong(strA.substring(0, iIndexOf));
                    j3 = Long.parseLong(strA.substring(iIndexOf + 1));
                    j = j2;
                } catch (NumberFormatException e) {
                    j = j2;
                }
            }
            long jP = aeVar.p();
            if (strA == null || j < 0) {
                if (hexString.equals(a(map, "if-none-match"))) {
                    return a(org.b.a.a.c.e.k, str, "", z);
                }
                org.b.a.a.c.c cVarA = a(org.b.a.a.c.e.b, str, aeVar.getInputStream(), jP, z, aeVar.i());
                cVarA.a("Content-Length", String.valueOf(jP));
                cVarA.a("ETag", hexString);
                return cVarA;
            }
            if (j > jP) {
                org.b.a.a.c.c cVarA2 = a(org.b.a.a.c.e.z, "text/plain", "", z);
                cVarA2.a("Content-Range", "bytes 0-0/".concat(String.valueOf(jP)));
                cVarA2.a("ETag", hexString);
                return cVarA2;
            }
            long j4 = j3 < 0 ? jP - 1 : j3;
            long j5 = (j4 - j) + 1;
            if (j5 < 0) {
                j5 = 0;
            }
            InputStream inputStream = aeVar.getInputStream();
            inputStream.skip(j);
            org.b.a.a.c.c cVarA3 = a(org.b.a.a.c.e.f, str, inputStream, j5, z, aeVar.i());
            cVarA3.a("Content-Length", String.valueOf(j5));
            cVarA3.a("Content-Range", "bytes " + j + "-" + j4 + "/" + jP);
            cVarA3.a("ETag", hexString);
            return cVarA3;
        } catch (IOException e2) {
            return a(org.b.a.a.c.e.o, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
        }
    }

    private static org.b.a.a.c.c a(Map<String, String> map, com.al.dlnaserver.customs.a aVar, String str, boolean z) {
        long j;
        int iIndexOf;
        try {
            String hexString = Integer.toHexString((String.valueOf(aVar.b().getPath()) + aVar.c() + aVar.d()).hashCode());
            long j2 = 0;
            long j3 = -1;
            String strA = a(map, "range");
            if (strA == null || !strA.startsWith("bytes=") || (iIndexOf = (strA = strA.substring(6)).indexOf(45)) <= 0) {
                j = j2;
            } else {
                try {
                    j2 = Long.parseLong(strA.substring(0, iIndexOf));
                    j3 = Long.parseLong(strA.substring(iIndexOf + 1));
                    j = j2;
                } catch (NumberFormatException e) {
                    j = j2;
                }
            }
            long jD = aVar.d();
            if (strA == null || j < 0) {
                if (hexString.equals(a(map, "if-none-match"))) {
                    return a(org.b.a.a.c.e.k, str, "", z);
                }
                new com.al.dlnaserver.b.a();
                org.b.a.a.c.c cVarA = a(org.b.a.a.c.e.b, str, com.al.dlnaserver.b.a.a(aVar.b().toURI()).c(aVar.a().c()), jD, z, aVar.b().getPath());
                cVarA.a("Content-Length", String.valueOf(jD));
                cVarA.a("ETag", hexString);
                return cVarA;
            }
            if (j > jD) {
                org.b.a.a.c.c cVarA2 = a(org.b.a.a.c.e.z, "text/plain", "", z);
                cVarA2.a("Content-Range", "bytes 0-0/".concat(String.valueOf(jD)));
                cVarA2.a("ETag", hexString);
                return cVarA2;
            }
            long j4 = j3 < 0 ? jD - 1 : j3;
            long j5 = (j4 - j) + 1;
            if (j5 < 0) {
                j5 = 0;
            }
            new com.al.dlnaserver.b.a();
            InputStream inputStreamC = com.al.dlnaserver.b.a.a(aVar.b().toURI()).c(aVar.a().c());
            inputStreamC.skip(j);
            org.b.a.a.c.c cVarA3 = a(org.b.a.a.c.e.f, str, inputStreamC, j5, z, aVar.b().getPath());
            cVarA3.a("Content-Length", String.valueOf(j5));
            cVarA3.a("Content-Range", "bytes " + j + "-" + j4 + "/" + jD);
            cVarA3.a("ETag", hexString);
            return cVarA3;
        } catch (IOException | URISyntaxException e2) {
            return a(org.b.a.a.c.e.o, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
        }
    }

    private static void a(org.b.a.a.c.c cVar) {
        Log.i("HttpFileServer", "Response='" + cVar.a().a() + "'");
    }

    private static org.b.a.a.c.c a(String str, String str2, boolean z) {
        String str3 = App.j.get(str.replaceFirst("/", ""));
        if (str3 == null) {
            return a(org.b.a.a.c.e.p, "text/plain", "404. NOT FOUND: File not found.", z);
        }
        String hexString = Integer.toHexString(str3.hashCode());
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str3).openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(10000);
            uRLConnectionOpenConnection.setReadTimeout(10000);
            String contentType = uRLConnectionOpenConnection.getContentType();
            String str4 = contentType == null ? "application/octet-stream" : contentType;
            org.b.a.a.c.c cVarA = org.b.a.a.c.c.a(org.b.a.a.c.e.b, str4, "");
            a(cVarA, z, (String) null, str4);
            if (str2 == null || (str2 != null && str2.contains("SEC_HHP_"))) {
                cVarA.a("Content-Length", "1073741824");
            }
            cVarA.a("ETag", hexString);
            return cVarA;
        } catch (IOException e) {
            Log.e("HttpFileServer", "createResponse()::URL.openConnection(). URL=".concat(String.valueOf(str3)), e);
            return a(org.b.a.a.c.e.o, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
        }
    }

    private static org.b.a.a.c.c b(String str, String str2, boolean z) {
        org.b.a.a.c.c cVarA;
        a.g.ae aeVar = App.h.get(str.replaceFirst("/", ""));
        if (aeVar == null) {
            return a(org.b.a.a.c.e.p, "text/plain", "404. NOT FOUND: File not found.", z);
        }
        if (Build$VERSION.SDK_INT < 19) {
            return a(org.b.a.a.c.e.o, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
        }
        try {
            if (!aeVar.f()) {
                cVarA = a(org.b.a.a.c.e.p, "text/plain", "404. NOT FOUND: File not found.", z);
            } else {
                String hexString = Integer.toHexString((String.valueOf(aeVar.i()) + aeVar.m() + aeVar.p()).hashCode());
                org.b.a.a.c.c cVarA2 = org.b.a.a.c.c.a(org.b.a.a.c.e.b, str2, "");
                cVarA2.a("Content-Length", new StringBuilder().append(aeVar.p()).toString());
                cVarA2.a("ETag", hexString);
                a(cVarA2, z, aeVar.i(), str2);
                cVarA = cVarA2;
            }
            return cVarA;
        } catch (IOException e) {
            Log.e("HttpFileServer", "createResponse()::context.createHeadResponseSMB()", e);
            return a(org.b.a.a.c.e.o, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
        }
    }

    private static org.b.a.a.c.c a(org.b.a.a.c.e eVar, String str, InputStream inputStream, long j, boolean z, String str2) {
        org.b.a.a.c.c cVarA = org.b.a.a.c.c.a(eVar, str, inputStream, j);
        a(cVarA, z, str2, str);
        return cVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [org.b.a.a.c.c] */
    private static org.b.a.a.c.c a(org.b.a.a.c.e eVar, Map<String, String> map, String str, boolean z, String str2) {
        org.b.a.a.c.c cVarA;
        String str3 = App.j.get(str.replaceFirst("/", ""));
        if (str3 == 0) {
            return a(org.b.a.a.c.e.p, "text/plain", "404. NOT FOUND: File not found.", z);
        }
        str3.endsWith("m3u8");
        String hexString = Integer.toHexString(str3.hashCode());
        String strA = a(map, "icy-metadata");
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str3).openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(10000);
            uRLConnectionOpenConnection.setReadTimeout(10000);
            if (strA != null && strA.equals("1")) {
                uRLConnectionOpenConnection.setRequestProperty("Icy-MetaData", "1");
            }
            uRLConnectionOpenConnection.connect();
            String contentType = uRLConnectionOpenConnection.getContentType();
            InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
            String str4 = contentType == null ? "application/octet-stream" : contentType;
            if (str2 == null || (str2 != null && str2.contains("SEC_HHP_"))) {
                cVarA = org.b.a.a.c.c.a(eVar, str4, inputStream, 1073741824L);
            } else {
                cVarA = org.b.a.a.c.c.a(eVar, str4, inputStream);
            }
            String headerField = uRLConnectionOpenConnection.getHeaderField("icy-genre");
            if (headerField != null) {
                cVarA.a("icy-genre", headerField);
            }
            String headerField2 = uRLConnectionOpenConnection.getHeaderField("icy-name");
            if (headerField2 != null) {
                cVarA.a("icy-name", headerField2);
            }
            String headerField3 = uRLConnectionOpenConnection.getHeaderField("icy-metaint");
            if (headerField3 != null) {
                cVarA.a("icy-metaint", headerField3);
            }
            String headerField4 = uRLConnectionOpenConnection.getHeaderField("icy-url");
            if (headerField4 != null) {
                cVarA.a("icy-url", headerField4);
            }
            String headerField5 = uRLConnectionOpenConnection.getHeaderField("icy-pub");
            if (headerField5 != null) {
                cVarA.a("icy-pub", headerField5);
            }
            String headerField6 = uRLConnectionOpenConnection.getHeaderField("icy-br");
            if (headerField6 != null) {
                cVarA.a("icy-br", headerField6);
            }
            a(cVarA, z, (String) null, str4);
            cVarA.a("ETag", hexString);
            str3 = cVarA;
            return str3;
        } catch (IOException e) {
            Log.e("HttpFileServer", "createResponse()::URL.openConnection(). URL=".concat(String.valueOf(str3)), e);
            return a(org.b.a.a.c.e.o, "text/plain", "403. FORBIDDEN: Reading file failed.", z);
        }
    }

    private static org.b.a.a.c.c a(org.b.a.a.c.e eVar, String str, String str2, boolean z) {
        org.b.a.a.c.c cVarA = org.b.a.a.c.c.a(eVar, str, str2);
        a(cVarA, z, (String) null, str);
        return cVarA;
    }

    private static void a(org.b.a.a.c.c cVar, boolean z, String str, String str2) {
        cVar.b(z);
        cVar.a(!z);
        if (str != null) {
            cVar.a("Accept-Ranges", "bytes");
        } else {
            cVar.a("Accept-Ranges", "none");
            cVar.a("Cache-Control", "no-cache");
            cVar.a("Pragma", "no-cache");
        }
        cVar.a("EXT", "");
        cVar.a("realTimeInfo.dlna.org", "DLNA.ORG_TLAG=*");
        cVar.a("contentFeatures.dlna.org", "DLNA.ORG_OP=01;DLNA.ORG_CI=0;DLNA.ORG_FLAGS=01700000000000000000000000000000");
        String strC = c(str);
        if (strC != null) {
            cVar.a("CaptionInfo.sec", strC);
        }
        if (str2 != null && (str2.contains("image") || str2.contains("smi") || str2.contains("text"))) {
            cVar.a("transferMode.dlna.org", "Interactive");
        } else {
            cVar.a("transferMode.dlna.org", "Streaming");
        }
        cVar.a("Server", "DLNADOC/1.50 UPnP/1.0, Cybergarage/2.1.2, NanoHTTPD/2.3.1, DLNAServer/1, Android/" + Build$VERSION.RELEASE);
        a(cVar);
    }

    private String e() {
        Map<String, File> mapA;
        String strSubstring;
        StringBuilder sb = new StringBuilder("<html><head><title>DLNAServer Files</title><style>\nspan.dirname { font-weight: bold; }\nspan.filename { font-size: 80%; }\nspan.filesize { font-size: 70%; font-weight: bold; }\na {text-decoration: none; }\n</style></head><body>\n");
        sb.append(d("qr.html").replace("@adr", "http://" + org.cybergarage.b.a.a() + ":" + this.k));
        sb.append("<script type=\"application/javascript\">");
        sb.append(d("qrcodegen.min.js"));
        sb.append("</script>");
        sb.append("<script type=\"application/javascript\">");
        sb.append(d("qr.min.js"));
        sb.append("</script>");
        if (App.f.size() > 0 || App.g.size() > 0) {
            try {
                mapA = com.al.dlnaserver.b.i.a(App.f);
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                mapA = App.f;
            }
            ArrayList arrayList = new ArrayList();
            for (Map$Entry<String, File> map$Entry : mapA.entrySet()) {
                String strA = com.al.dlnaserver.b.c.a(map$Entry.getValue());
                String key = map$Entry.getKey();
                File value = map$Entry.getValue();
                if (!a(key, strA) && value != null) {
                    arrayList.add(value.getAbsolutePath());
                }
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            if (strArr == null || strArr.length == 0) {
                strSubstring = "";
            } else {
                int iA = bk.a(strArr);
                if (iA == -1) {
                    if (strArr[0] == null) {
                        strSubstring = "";
                    } else {
                        strSubstring = strArr[0];
                    }
                } else if (iA == 0) {
                    strSubstring = "";
                } else {
                    strSubstring = strArr[0].substring(0, iA);
                }
            }
            String str = !strSubstring.endsWith("/") ? null : strSubstring;
            sb.append("<ul>");
            sb.append("<section class=\"files\">");
            if (!arrayList.isEmpty()) {
                sb.append("<h1>Local Files</h1>\n");
                sb.append("<li><a href=\"");
                sb.append("http://" + org.cybergarage.b.a.a() + ":" + this.k + "/playlist.m3u");
                sb.append("\"><span class=\"filename\"><b>");
                sb.append("All media m3u playlist");
                sb.append("</b></span></a>");
                sb.append("</li>");
            }
            for (Map$Entry<String, File> map$Entry2 : mapA.entrySet()) {
                String strA2 = com.al.dlnaserver.b.c.a(map$Entry2.getValue());
                String key2 = map$Entry2.getKey();
                if (!a(key2, strA2)) {
                    sb.append("<li><a href=\"");
                    sb.append("http://" + org.cybergarage.b.a.a() + ":" + this.k + "/" + key2);
                    sb.append("\"><span class=\"filename\">");
                    if (str == null) {
                        sb.append(map$Entry2.getValue().getAbsolutePath());
                    } else {
                        sb.append(map$Entry2.getValue().getAbsolutePath().replace(str, "…/"));
                    }
                    sb.append("</span></a>");
                    long length = map$Entry2.getValue().length();
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
            for (Map$Entry<String, Uri> map$Entry3 : App.g.entrySet()) {
                String key3 = map$Entry3.getKey();
                sb.append("<li><a href=\"");
                sb.append("http://" + org.cybergarage.b.a.a() + ":" + this.k + "/" + key3);
                sb.append("\"><span class=\"filename\">");
                sb.append(map$Entry3.getValue());
                sb.append("</span></a>");
                sb.append("&nbsp;<span class=\"filesize\">");
                sb.append("</span></li>");
            }
            if (!App.h.isEmpty()) {
                sb.append("<h1>Network (SMB)</h1>\n");
                for (Map$Entry<String, a.g.ae> map$Entry4 : App.h.entrySet()) {
                    String strB = com.al.dlnaserver.b.c.b(map$Entry4.getValue().h());
                    String key4 = map$Entry4.getKey();
                    if (!a("", strB)) {
                        sb.append("<li><a href=\"");
                        sb.append("http://" + org.cybergarage.b.a.a() + ":" + this.k + "/" + key4);
                        sb.append("\"><span class=\"filename\">");
                        sb.append(String.valueOf(map$Entry4.getValue().j()) + "/.../" + map$Entry4.getValue().h());
                        sb.append("</span></a>");
                        sb.append("&nbsp;<span class=\"filesize\">");
                        sb.append("</span></li>");
                    }
                }
            }
            if (!App.i.isEmpty()) {
                sb.append("<h1>Network (FTP)</h1>\n");
                for (Map$Entry<String, com.al.dlnaserver.customs.a> map$Entry5 : App.i.entrySet()) {
                    String strB2 = com.al.dlnaserver.b.c.b(map$Entry5.getValue().a().c());
                    String key5 = map$Entry5.getKey();
                    if (!a("", strB2)) {
                        sb.append("<li><a href=\"");
                        sb.append("http://" + org.cybergarage.b.a.a() + ":" + this.k + "/" + key5);
                        sb.append("\"><span class=\"filename\">");
                        sb.append(String.valueOf(map$Entry5.getValue().b().getHost()) + "/.../" + map$Entry5.getValue().a().c());
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

    private String f() {
        StringBuilder sb = new StringBuilder("#EXTM3U\r\n");
        for (Map$Entry<String, File> map$Entry : App.f.entrySet()) {
            if (!a(map$Entry.getKey(), com.al.dlnaserver.b.c.a(map$Entry.getValue()))) {
                sb.append("#EXTINF:-1,");
                sb.append(map$Entry.getValue().getName());
                sb.append("\r\n");
                try {
                    sb.append("http://" + org.cybergarage.b.a.a() + ":" + this.k + "/" + URLEncoder.encode(map$Entry.getKey(), "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    Log.e("HttpFileServer", "Encoding not supported", e);
                }
                sb.append("\r\n");
            }
        }
        return sb.toString();
    }

    private static boolean a(String str, String str2) {
        if (!str.contains("thumb/thumb_") && !str.contains("icons/deviceIcon") && !str2.contains("srt") && !str2.contains("ssa") && !str2.contains("ass") && !str2.contains("sub") && !str2.contains("smi") && !str2.contains("txt") && !str2.contains("idx") && !str2.contains("mpl") && !str2.contains("vtt") && !str2.contains("psb") && !str2.contains("sami") && !str2.contains("pjs") && !str2.contains("sup")) {
            return false;
        }
        return true;
    }

    private static String c(String str) {
        if (str == null) {
            return null;
        }
        return App.k.get(str);
    }

    private static String a(Map<String, String> map, String str) {
        for (Map$Entry<String, String> map$Entry : map.entrySet()) {
            if (map$Entry.getKey().equalsIgnoreCase(str)) {
                return map$Entry.getValue();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String d(java.lang.String r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L92
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L92
            android.content.Context r4 = r6.i     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L92
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
        throw new UnsupportedOperationException("Method not decompiled: com.al.dlnaserver.servers.j.d(java.lang.String):java.lang.String");
    }
}
