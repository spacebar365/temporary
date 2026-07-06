package com.al.dlnaserver.b;

import android.util.Log;
import java.io.IOException;
import java.net.URI;

/* JADX INFO: compiled from: FTPUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static org.a.a.a.a.c a(URI uri) throws Exception {
        try {
            org.a.a.a.a.c cVar = new org.a.a.a.a.c();
            cVar.r();
            cVar.g();
            cVar.a(uri.getHost(), uri.getPort() == -1 ? 21 : uri.getPort());
            int iJ = cVar.j();
            if (!org.a.a.a.a.p.b(iJ)) {
                Log.e("FTPUtils", "Operation failed. Server reply code: ".concat(String.valueOf(iJ)));
                throw new IOException("Operation failed. Server reply code: ".concat(String.valueOf(iJ)));
            }
            String userInfo = uri.getUserInfo();
            String strSubstring = null;
            if (userInfo == null) {
                userInfo = "anonymous";
            } else if (userInfo.contains(":") && userInfo.indexOf(":") < userInfo.length()) {
                strSubstring = userInfo.substring(userInfo.indexOf(":") + 1, userInfo.length());
                userInfo = userInfo.replace(":".concat(String.valueOf(strSubstring)), "");
            }
            if (!cVar.c(userInfo, strSubstring)) {
                Log.e("FTPUtils", "Could not login to the server");
                a(cVar);
                throw new IOException("Could not login to the server");
            }
            cVar.a(org.a.a.a.a.e.f, uri.getPath());
            cVar.o();
            cVar.p();
            return cVar;
        } catch (Exception e) {
            Log.e("FTPUtils", "Create FTP client error: ".concat(String.valueOf(e)));
            throw e;
        }
    }

    public static void a(org.a.a.a.a.c cVar) {
        if (cVar == null || !cVar.c()) {
            return;
        }
        try {
            cVar.a(org.a.a.a.a.e.y, (String) null);
            cVar.b();
        } catch (Exception e) {
            Log.e("FTPUtils", "FTP.disconnect", e);
        }
    }
}
