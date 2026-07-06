package org.bouncycastle.jcajce;

import org.bouncycastle.b.g;

/* JADX INFO: loaded from: classes.dex */
public class PBKDF1Key implements PBKDFKey {
    private final char[] a;
    private final g b;

    public PBKDF1Key(char[] cArr, g gVar) {
        this.a = new char[cArr.length];
        this.b = gVar;
        System.arraycopy(cArr, 0, this.a, 0, cArr.length);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PBKDF1";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.b.a(this.a);
    }

    @Override // java.security.Key
    public String getFormat() {
        return this.b.a();
    }

    public char[] getPassword() {
        return this.a;
    }
}
