package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.a;

/* JADX INFO: loaded from: classes.dex */
public class Blake2b$Blake2b384 extends BCMessageDigest implements Cloneable {
    public Blake2b$Blake2b384() {
        super(new a(384));
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        Blake2b$Blake2b384 blake2b$Blake2b384 = (Blake2b$Blake2b384) super.clone();
        blake2b$Blake2b384.a = new a((a) this.a);
        return blake2b$Blake2b384;
    }
}
