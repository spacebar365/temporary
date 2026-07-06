package org.cybergarage.d.d;

/* JADX INFO: compiled from: SSDP.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static String a = "FF02::C";

    public static final void a(String str) {
        a = str;
    }

    public static final String a() {
        return a;
    }

    public static final int b(String str) {
        int iIndexOf = str.indexOf("max-age");
        if (iIndexOf < 0) {
            return 0;
        }
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        if (iIndexOf2 < 0) {
            iIndexOf2 = str.length();
        }
        try {
            return Integer.parseInt(str.substring(str.indexOf("=", iIndexOf) + 1, iIndexOf2).trim());
        } catch (Exception e) {
            org.cybergarage.e.a.a(e);
            return 0;
        }
    }
}
