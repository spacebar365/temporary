package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class RIPEMD160$PBEWithHmacKeyFactory extends PBESecretKeyFactory {
    public RIPEMD160$PBEWithHmacKeyFactory() {
        super("PBEwithHmacRIPEMD160", null, false, 2, 2, 160, 0);
    }
}
