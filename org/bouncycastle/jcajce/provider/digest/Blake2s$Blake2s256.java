package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.b;

/* JADX INFO: loaded from: classes.dex */
public class Blake2s$Blake2s256 extends BCMessageDigest implements Cloneable {
    public Blake2s$Blake2s256() {
        super(new b(256));
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        Blake2s$Blake2s256 blake2s$Blake2s256 = (Blake2s$Blake2s256) super.clone();
        blake2s$Blake2s256.a = new b((b) this.a);
        return blake2s$Blake2s256;
    }
}
