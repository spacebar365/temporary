package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.t;

/* JADX INFO: loaded from: classes.dex */
public class SHA224$Digest extends BCMessageDigest implements Cloneable {
    public SHA224$Digest() {
        super(new t());
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        SHA224$Digest sHA224$Digest = (SHA224$Digest) super.clone();
        sHA224$Digest.a = new t((t) this.a);
        return sHA224$Digest;
    }
}
