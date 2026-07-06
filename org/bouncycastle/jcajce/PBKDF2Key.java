package org.bouncycastle.jcajce;

import org.bouncycastle.b.g;

/* JADX INFO: loaded from: classes.dex */
public class PBKDF2Key implements PBKDFKey {
    private final char[] a;
    private final g b;

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PBKDF2";
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

    public PBKDF2Key(char[] cArr, g gVar) {
        char[] cArr2;
        if (cArr == null) {
            cArr2 = null;
        } else {
            cArr2 = new char[cArr.length];
            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
        }
        this.a = cArr2;
        this.b = gVar;
    }
}
