package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.b;

/* JADX INFO: loaded from: classes.dex */
public class Blake2s$Blake2s160 extends BCMessageDigest implements Cloneable {
    public Blake2s$Blake2s160() {
        super(new b(160));
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        Blake2s$Blake2s160 blake2s$Blake2s160 = (Blake2s$Blake2s160) super.clone();
        blake2s$Blake2s160.a = new b((b) this.a);
        return blake2s$Blake2s160;
    }
}
