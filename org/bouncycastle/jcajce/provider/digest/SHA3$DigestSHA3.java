package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.w;

/* JADX INFO: loaded from: classes.dex */
public class SHA3$DigestSHA3 extends BCMessageDigest implements Cloneable {
    public SHA3$DigestSHA3(int i) {
        super(new w(i));
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
        bCMessageDigest.a = new w((w) this.a);
        return bCMessageDigest;
    }
}
