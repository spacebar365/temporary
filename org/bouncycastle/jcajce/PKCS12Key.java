package org.bouncycastle.jcajce;

import org.bouncycastle.p083b.AbstractC0804ad;

/* JADX INFO: loaded from: classes.dex */
public class PKCS12Key implements PBKDFKey {

    /* JADX INFO: renamed from: a */
    private final char[] f5558a;

    /* JADX INFO: renamed from: b */
    private final boolean f5559b;

    public PKCS12Key(char[] cArr, boolean z) {
        cArr = cArr == null ? new char[0] : cArr;
        this.f5558a = new char[cArr.length];
        this.f5559b = z;
        System.arraycopy(cArr, 0, this.f5558a, 0, cArr.length);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PKCS12";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return (this.f5559b && this.f5558a.length == 0) ? new byte[2] : AbstractC0804ad.m1896c(this.f5558a);
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS12";
    }

    public char[] getPassword() {
        return this.f5558a;
    }
}
