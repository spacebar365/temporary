package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.p;

/* JADX INFO: loaded from: classes.dex */
public class RIPEMD160$Digest extends BCMessageDigest implements Cloneable {
    public RIPEMD160$Digest() {
        super(new p());
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        RIPEMD160$Digest rIPEMD160$Digest = (RIPEMD160$Digest) super.clone();
        rIPEMD160$Digest.a = new p((p) this.a);
        return rIPEMD160$Digest;
    }
}
