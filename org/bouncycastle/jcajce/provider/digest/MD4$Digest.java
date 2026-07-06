package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.l;

/* JADX INFO: loaded from: classes.dex */
public class MD4$Digest extends BCMessageDigest implements Cloneable {
    public MD4$Digest() {
        super(new l());
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        MD4$Digest mD4$Digest = (MD4$Digest) super.clone();
        mD4$Digest.a = new l((l) this.a);
        return mD4$Digest;
    }
}
