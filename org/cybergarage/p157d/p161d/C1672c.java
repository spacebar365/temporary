package org.cybergarage.p157d.p161d;

import org.cybergarage.p173e.C1744a;

/* JADX INFO: renamed from: org.cybergarage.d.d.c */
/* JADX INFO: compiled from: SSDP.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1672c {

    /* JADX INFO: renamed from: a */
    private static String f6396a = "FF02::C";

    /* JADX INFO: renamed from: a */
    public static final void m4810a(String str) {
        f6396a = str;
    }

    /* JADX INFO: renamed from: a */
    public static final String m4809a() {
        return f6396a;
    }

    /* JADX INFO: renamed from: b */
    public static final int m4811b(String str) {
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
            C1744a.m5117a(e);
            return 0;
        }
    }
}
