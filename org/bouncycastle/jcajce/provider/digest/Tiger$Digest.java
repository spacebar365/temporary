package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.ad;

/* JADX INFO: loaded from: classes.dex */
public class Tiger$Digest extends BCMessageDigest implements Cloneable {
    public Tiger$Digest() {
        super(new ad());
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        Tiger$Digest tiger$Digest = (Tiger$Digest) super.clone();
        tiger$Digest.a = new ad((ad) this.a);
        return tiger$Digest;
    }
}
