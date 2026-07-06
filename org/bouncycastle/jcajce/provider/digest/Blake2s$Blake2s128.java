package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.b;

/* JADX INFO: loaded from: classes.dex */
public class Blake2s$Blake2s128 extends BCMessageDigest implements Cloneable {
    public Blake2s$Blake2s128() {
        super(new b(128));
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        Blake2s$Blake2s128 blake2s$Blake2s128 = (Blake2s$Blake2s128) super.clone();
        blake2s$Blake2s128.a = new b((b) this.a);
        return blake2s$Blake2s128;
    }
}
