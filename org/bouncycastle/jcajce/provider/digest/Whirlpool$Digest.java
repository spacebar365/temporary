package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.ae;

/* JADX INFO: loaded from: classes.dex */
public class Whirlpool$Digest extends BCMessageDigest implements Cloneable {
    public Whirlpool$Digest() {
        super(new ae());
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        Whirlpool$Digest whirlpool$Digest = (Whirlpool$Digest) super.clone();
        whirlpool$Digest.a = new ae((ae) this.a);
        return whirlpool$Digest;
    }
}
