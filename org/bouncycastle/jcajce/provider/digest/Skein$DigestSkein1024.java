package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.ab;

/* JADX INFO: loaded from: classes.dex */
public class Skein$DigestSkein1024 extends BCMessageDigest implements Cloneable {
    public Skein$DigestSkein1024(int i) {
        super(new ab(1024, i));
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
        bCMessageDigest.a = new ab((ab) this.a);
        return bCMessageDigest;
    }
}
