package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class SHA1$PBEWithMacKeyFactory extends PBESecretKeyFactory {
    public SHA1$PBEWithMacKeyFactory() {
        super("PBEwithHmacSHA", null, false, 2, 1, 160, 0);
    }
}
