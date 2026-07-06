package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.q;

/* JADX INFO: loaded from: classes.dex */
public class RIPEMD256$Digest extends BCMessageDigest implements Cloneable {
    public RIPEMD256$Digest() {
        super(new q());
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        RIPEMD256$Digest rIPEMD256$Digest = (RIPEMD256$Digest) super.clone();
        rIPEMD256$Digest.a = new q((q) this.a);
        return rIPEMD256$Digest;
    }
}
