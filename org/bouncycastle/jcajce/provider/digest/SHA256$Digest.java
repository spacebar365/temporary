package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.u;

/* JADX INFO: loaded from: classes.dex */
public class SHA256$Digest extends BCMessageDigest implements Cloneable {
    public SHA256$Digest() {
        super(new u());
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        SHA256$Digest sHA256$Digest = (SHA256$Digest) super.clone();
        sHA256$Digest.a = new u((u) this.a);
        return sHA256$Digest;
    }
}
