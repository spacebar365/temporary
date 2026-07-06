package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.i;

/* JADX INFO: loaded from: classes.dex */
public class Keccak$DigestKeccak extends BCMessageDigest implements Cloneable {
    public Keccak$DigestKeccak(int i) {
        super(new i(i));
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
        bCMessageDigest.a = new i((i) this.a);
        return bCMessageDigest;
    }
}
