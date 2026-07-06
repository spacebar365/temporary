package org.bouncycastle.jcajce;

import org.bouncycastle.b.ad;

/* JADX INFO: loaded from: classes.dex */
public class PKCS12Key implements PBKDFKey {
    private final char[] a;
    private final boolean b;

    public PKCS12Key(char[] cArr, boolean z) {
        cArr = cArr == null ? new char[0] : cArr;
        this.a = new char[cArr.length];
        this.b = z;
        System.arraycopy(cArr, 0, this.a, 0, cArr.length);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PKCS12";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return (this.b && this.a.length == 0) ? new byte[2] : ad.c(this.a);
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS12";
    }

    public char[] getPassword() {
        return this.a;
    }
}
