package org.cybergarage.d.b;

/* JADX INFO: compiled from: USN.java */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final String a(String str) {
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
