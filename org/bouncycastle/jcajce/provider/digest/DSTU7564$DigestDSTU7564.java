package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.c;

/* JADX INFO: loaded from: classes.dex */
public class DSTU7564$DigestDSTU7564 extends BCMessageDigest implements Cloneable {
    public DSTU7564$DigestDSTU7564(int i) {
        super(new c(i));
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
        bCMessageDigest.a = new c((c) this.a);
        return bCMessageDigest;
    }
}
