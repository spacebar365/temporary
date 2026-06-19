package org.bouncycastle.jcajce;

import org.bouncycastle.p083b.InterfaceC0980g;

/* JADX INFO: loaded from: classes.dex */
public class PBKDF1Key implements PBKDFKey {

    /* JADX INFO: renamed from: a */
    private final char[] f5550a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0980g f5551b;

    public PBKDF1Key(char[] cArr, InterfaceC0980g interfaceC0980g) {
        this.f5550a = new char[cArr.length];
        this.f5551b = interfaceC0980g;
        System.arraycopy(cArr, 0, this.f5550a, 0, cArr.length);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PBKDF1";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.f5551b.mo1902a(this.f5550a);
    }

    @Override // java.security.Key
    public String getFormat() {
        return this.f5551b.mo1901a();
    }

    public char[] getPassword() {
        return this.f5550a;
    }
}
