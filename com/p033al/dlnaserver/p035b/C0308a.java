package com.p033al.dlnaserver.p035b;

import android.util.Log;
import java.io.IOException;
import java.net.URI;
import org.p037a.p038a.p039a.p040a.C0452c;
import org.p037a.p038a.p039a.p040a.C0465p;
import org.p037a.p038a.p039a.p040a.EnumC0454e;

/* JADX INFO: renamed from: com.al.dlnaserver.b.a */
/* JADX INFO: compiled from: FTPUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0308a {
    /* JADX INFO: renamed from: a */
    public static C0452c m1008a(URI uri) throws Exception {
        try {
            C0452c c0452c = new C0452c();
            c0452c.m1228r();
            c0452c.m1280g();
            c0452c.m1273a(uri.getHost(), uri.getPort() == -1 ? 21 : uri.getPort());
            int iJ = c0452c.m1210j();
            if (!C0465p.m1263b(iJ)) {
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
            if (!c0452c.m1224c(userInfo, strSubstring)) {
                Log.e("FTPUtils", "Could not login to the server");
                m1009a(c0452c);
                throw new IOException("Could not login to the server");
            }
            c0452c.m1201a(EnumC0454e.CWD, uri.getPath());
            c0452c.m1225o();
            c0452c.m1226p();
            return c0452c;
        } catch (Exception e) {
            Log.e("FTPUtils", "Create FTP client error: ".concat(String.valueOf(e)));
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1009a(C0452c c0452c) {
        if (c0452c == null || !c0452c.m1276c()) {
            return;
        }
        try {
            c0452c.m1201a(EnumC0454e.QUIT, (String) null);
            c0452c.mo1207b();
        } catch (Exception e) {
            Log.e("FTPUtils", "FTP.disconnect", e);
        }
    }
}
