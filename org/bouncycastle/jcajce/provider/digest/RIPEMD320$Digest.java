package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.r;

/* JADX INFO: loaded from: classes.dex */
public class RIPEMD320$Digest extends BCMessageDigest implements Cloneable {
    public RIPEMD320$Digest() {
        super(new r());
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        RIPEMD320$Digest rIPEMD320$Digest = (RIPEMD320$Digest) super.clone();
        rIPEMD320$Digest.a = new r((r) this.a);
        return rIPEMD320$Digest;
    }
}
