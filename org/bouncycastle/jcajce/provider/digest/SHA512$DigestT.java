package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.y;

/* JADX INFO: loaded from: classes.dex */
public class SHA512$DigestT extends BCMessageDigest implements Cloneable {
    public SHA512$DigestT(int i) {
        super(new y(i));
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        SHA512$DigestT sHA512$DigestT = (SHA512$DigestT) super.clone();
        sHA512$DigestT.a = new y((y) this.a);
        return sHA512$DigestT;
    }
}
