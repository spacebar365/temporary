package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.aa;

/* JADX INFO: loaded from: classes.dex */
public class SM3$Digest extends BCMessageDigest implements Cloneable {
    public SM3$Digest() {
        super(new aa());
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        SM3$Digest sM3$Digest = (SM3$Digest) super.clone();
        sM3$Digest.a = new aa((aa) this.a);
        return sM3$Digest;
    }
}
