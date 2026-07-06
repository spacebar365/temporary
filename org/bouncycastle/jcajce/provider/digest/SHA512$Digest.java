package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.x;

/* JADX INFO: loaded from: classes.dex */
public class SHA512$Digest extends BCMessageDigest implements Cloneable {
    public SHA512$Digest() {
        super(new x());
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        SHA512$Digest sHA512$Digest = (SHA512$Digest) super.clone();
        sHA512$Digest.a = new x((x) this.a);
        return sHA512$Digest;
    }
}
