package org.bouncycastle.jcajce.provider.digest;

import java.security.MessageDigest;
import org.bouncycastle.p083b.InterfaceC1175r;

/* JADX INFO: loaded from: classes.dex */
public class BCMessageDigest extends MessageDigest {

    /* JADX INFO: renamed from: a */
    protected InterfaceC1175r f5965a;

    protected BCMessageDigest(InterfaceC1175r interfaceC1175r) {
        super(interfaceC1175r.mo1927a());
        this.f5965a = interfaceC1175r;
    }

    @Override // java.security.MessageDigestSpi
    public byte[] engineDigest() {
        byte[] bArr = new byte[this.f5965a.mo1930b()];
        this.f5965a.mo1926a(bArr, 0);
        return bArr;
    }

    @Override // java.security.MessageDigestSpi
    public void engineReset() {
        this.f5965a.mo1931c();
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte b) {
        this.f5965a.mo1928a(b);
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.f5965a.mo1929a(bArr, i, i2);
    }
}
