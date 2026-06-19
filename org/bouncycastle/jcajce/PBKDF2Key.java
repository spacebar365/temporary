package org.bouncycastle.jcajce;

import org.bouncycastle.p083b.InterfaceC0980g;

/* JADX INFO: loaded from: classes.dex */
public class PBKDF2Key implements PBKDFKey {

    /* JADX INFO: renamed from: a */
    private final char[] f5554a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0980g f5555b;

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PBKDF2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.f5555b.mo1902a(this.f5554a);
    }

    @Override // java.security.Key
    public String getFormat() {
        return this.f5555b.mo1901a();
    }

    public char[] getPassword() {
        return this.f5554a;
    }

    public PBKDF2Key(char[] cArr, InterfaceC0980g interfaceC0980g) {
        char[] cArr2;
        if (cArr == null) {
            cArr2 = null;
        } else {
            cArr2 = new char[cArr.length];
            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
        }
        this.f5554a = cArr2;
        this.f5555b = interfaceC0980g;
    }
}
