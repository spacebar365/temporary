package org.cybergarage.p157d.p159b;

/* JADX INFO: renamed from: org.cybergarage.d.b.h */
/* JADX INFO: compiled from: USN.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1659h {
    /* JADX INFO: renamed from: a */
    public static final String m4745a(String str) {
        if (str == null) {
            return "";
        }
        int iIndexOf = str.indexOf("::");
        if (iIndexOf < 0) {
            return str.trim();
        }
        return new String(str.getBytes(), 0, iIndexOf).trim();
    }
}
