package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.a;

/* JADX INFO: loaded from: classes.dex */
public class Blake2b$Blake2b256 extends BCMessageDigest implements Cloneable {
    public Blake2b$Blake2b256() {
        super(new a(256));
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        Blake2b$Blake2b256 blake2b$Blake2b256 = (Blake2b$Blake2b256) super.clone();
        blake2b$Blake2b256.a = new a((a) this.a);
        return blake2b$Blake2b256;
    }
}
