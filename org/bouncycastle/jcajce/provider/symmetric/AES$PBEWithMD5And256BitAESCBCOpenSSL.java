package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class AES$PBEWithMD5And256BitAESCBCOpenSSL extends PBESecretKeyFactory {
    public AES$PBEWithMD5And256BitAESCBCOpenSSL() {
        super("PBEWithMD5And256BitAES-CBC-OpenSSL", null, true, 3, 0, 256, 128);
    }
}
