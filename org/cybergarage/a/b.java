package org.cybergarage.a;

import java.net.URL;

/* JADX INFO: compiled from: HTTP.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static int a = 524288;

    public static final boolean a(String str) {
        try {
            new URL(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static final String b(String str) {
        try {
            return new URL(str).getHost();
        } catch (Exception e) {
            return "";
        }
    }

    public static final int c(String str) {
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

    public static final String a(String str, int i) {
        return "http://" + str + ":" + i;
    }

    public static final String a(String str, boolean z) {
        if (!a(str)) {
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

    public static final String d(String str) {
        return a(str, true);
    }

    public static final String a(String str, String str2) {
        try {
            URL url = new URL(str);
            return String.valueOf(url.getProtocol()) + "://" + url.getHost() + ":" + url.getPort() + a(str2, true);
        } catch (Exception e) {
            return "";
        }
    }

    public static final int a() {
        return a;
    }
}
