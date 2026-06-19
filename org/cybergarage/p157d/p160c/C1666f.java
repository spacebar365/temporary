package org.cybergarage.p157d.p160c;

/* JADX INFO: renamed from: org.cybergarage.d.c.f */
/* JADX INFO: compiled from: Subscription.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1666f {
    /* JADX INFO: renamed from: a */
    public static final String m4771a(long j) {
        return j == -1 ? "infinite" : "Second-" + Long.toString(j);
    }

    /* JADX INFO: renamed from: a */
    public static final long m4770a(String str) {
        try {
            return Long.parseLong(str.substring(str.indexOf(45) + 1, str.length()));
        } catch (Exception e) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m4772b(String str) {
        return "uuid:".concat(String.valueOf(str));
    }

    /* JADX INFO: renamed from: c */
    public static final String m4773c(String str) {
        if (str == null) {
            return "";
        }
        return str.startsWith("uuid:") ? str.substring(5, str.length()) : str;
    }
}
