package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.b.v;

/* JADX INFO: loaded from: classes.dex */
public class SHA384$Digest extends BCMessageDigest implements Cloneable {
    public SHA384$Digest() {
        super(new v());
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        SHA384$Digest sHA384$Digest = (SHA384$Digest) super.clone();
        sHA384$Digest.a = new v((v) this.a);
        return sHA384$Digest;
    }
}
