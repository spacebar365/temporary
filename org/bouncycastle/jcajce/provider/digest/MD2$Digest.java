package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.k;

/* JADX INFO: loaded from: classes.dex */
public class MD2$Digest extends BCMessageDigest implements Cloneable {
    public MD2$Digest() {
        super(new k());
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        MD2$Digest mD2$Digest = (MD2$Digest) super.clone();
        mD2$Digest.a = new k((k) this.a);
        return mD2$Digest;
    }
}
