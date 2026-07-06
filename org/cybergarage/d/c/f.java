package org.cybergarage.d.c;

/* JADX INFO: compiled from: Subscription.java */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final String a(long j) {
        return j == -1 ? "infinite" : "Second-" + Long.toString(j);
    }

    public static final long a(String str) {
        try {
            return Long.parseLong(str.substring(str.indexOf(45) + 1, str.length()));
        } catch (Exception e) {
            return -1L;
        }
    }

    public static final String b(String str) {
        return "uuid:".concat(String.valueOf(str));
    }

    public static final String c(String str) {
        if (str == null) {
            return "";
        }
        return str.startsWith("uuid:") ? str.substring(5, str.length()) : str;
    }
}
