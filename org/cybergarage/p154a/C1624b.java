package org.cybergarage.p154a;

import java.net.URL;

/* JADX INFO: renamed from: org.cybergarage.a.b */
/* JADX INFO: compiled from: HTTP.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1624b {

    /* JADX INFO: renamed from: a */
    private static int f6326a = 524288;

    /* JADX INFO: renamed from: a */
    public static final boolean m4581a(String str) {
        try {
            new URL(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m4582b(String str) {
        try {
            return new URL(str).getHost();
        } catch (Exception e) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static final int m4583c(String str) {
        try {
            int port = new URL(str).getPort();
            if (port <= 0) {
                return 80;
            }
            return port;
        } catch (Exception e) {
            return 80;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m4578a(String str, int i) {
        return "http://" + str + ":" + i;
    }

    /* JADX INFO: renamed from: a */
    public static final String m4580a(String str, boolean z) {
        if (!m4581a(str)) {
            if (str.length() > 0 && str.charAt(0) != '/') {
                return "/".concat(String.valueOf(str));
            }
            return str;
        }
        try {
            URL url = new URL(str);
            String path = url.getPath();
            if (z) {
                String query = url.getQuery();
                if (!query.equals("")) {
                    path = String.valueOf(path) + "?" + query;
                }
            }
            if (path.endsWith("/")) {
                return path.substring(0, path.length() - 1);
            }
            return path;
        } catch (Exception e) {
            return str;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final String m4584d(String str) {
        return m4580a(str, true);
    }

    /* JADX INFO: renamed from: a */
    public static final String m4579a(String str, String str2) {
        try {
            URL url = new URL(str);
            return String.valueOf(url.getProtocol()) + "://" + url.getHost() + ":" + url.getPort() + m4580a(str2, true);
        } catch (Exception e) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static final int m4577a() {
        return f6326a;
    }
}
