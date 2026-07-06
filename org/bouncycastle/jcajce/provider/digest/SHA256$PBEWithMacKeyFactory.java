package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class SHA256$PBEWithMacKeyFactory extends PBESecretKeyFactory {
    public SHA256$PBEWithMacKeyFactory() {
        super("PBEwithHmacSHA256", null, false, 2, 4, 256, 0);
    }
}
