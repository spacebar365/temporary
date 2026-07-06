package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.ab;

/* JADX INFO: loaded from: classes.dex */
public class Skein$DigestSkein256 extends BCMessageDigest implements Cloneable {
    public Skein$DigestSkein256(int i) {
        super(new ab(256, i));
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
        bCMessageDigest.a = new ab((ab) this.a);
        return bCMessageDigest;
    }
}
