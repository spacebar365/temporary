package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.o;

/* JADX INFO: loaded from: classes.dex */
public class RIPEMD128$Digest extends BCMessageDigest implements Cloneable {
    public RIPEMD128$Digest() {
        super(new o());
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        RIPEMD128$Digest rIPEMD128$Digest = (RIPEMD128$Digest) super.clone();
        rIPEMD128$Digest.a = new o((o) this.a);
        return rIPEMD128$Digest;
    }
}
