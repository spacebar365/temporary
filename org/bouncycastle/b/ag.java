package org.bouncycastle.b;

/* JADX INFO: loaded from: classes.dex */
enum ag extends ae {
    ag(String str) {
        super(str, 1, (byte) 0);
    }

    @Override // org.bouncycastle.b.g
    public final String a() {
        return "UTF8";
    }

    @Override // org.bouncycastle.b.g
    public final byte[] a(char[] cArr) {
        return ad.b(cArr);
    }
}
