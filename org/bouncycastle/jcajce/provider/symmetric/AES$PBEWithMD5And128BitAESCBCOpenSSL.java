package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class AES$PBEWithMD5And128BitAESCBCOpenSSL extends PBESecretKeyFactory {
    public AES$PBEWithMD5And128BitAESCBCOpenSSL() {
        super("PBEWithMD5And128BitAES-CBC-OpenSSL", null, true, 3, 0, 128, 128);
    }
}
