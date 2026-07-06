package org.bouncycastle.e.b.c;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static String a(int i) {
        switch (i) {
            case 0:
                return "qTESLA-I";
            case 1:
                return "qTESLA-III-size";
            case 2:
                return "qTESLA-III-speed";
            case 3:
                return "qTESLA-p-I";
            case 4:
                return "qTESLA-p-III";
            default:
                throw new IllegalArgumentException("unknown security category: ".concat(String.valueOf(i)));
        }
    }
}
