package org.bouncycastle.b;

/* JADX INFO: loaded from: classes.dex */
enum ah extends ae {
    ah(String str) {
        super(str, 2, (byte) 0);
    }

    @Override // org.bouncycastle.b.g
    public final String a() {
        return "PKCS12";
    }

    @Override // org.bouncycastle.b.g
    public final byte[] a(char[] cArr) {
        return ad.c(cArr);
    }
}
