package org.bouncycastle.jcajce.provider.digest;

import java.security.MessageDigest;
import org.bouncycastle.b.r;

/* JADX INFO: loaded from: classes.dex */
public class BCMessageDigest extends MessageDigest {
    protected r a;

    protected BCMessageDigest(r rVar) {
        super(rVar.a());
        this.a = rVar;
    }

    @Override // java.security.MessageDigestSpi
    public byte[] engineDigest() {
        byte[] bArr = new byte[this.a.b()];
        this.a.a(bArr, 0);
        return bArr;
    }

    @Override // java.security.MessageDigestSpi
    public void engineReset() {
        this.a.c();
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte b) {
        this.a.a(b);
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.a.a(bArr, i, i2);
    }
}
