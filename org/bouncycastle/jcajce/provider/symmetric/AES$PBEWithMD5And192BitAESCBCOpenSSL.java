package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class AES$PBEWithMD5And192BitAESCBCOpenSSL extends PBESecretKeyFactory {
    public AES$PBEWithMD5And192BitAESCBCOpenSSL() {
        super("PBEWithMD5And192BitAES-CBC-OpenSSL", null, true, 3, 0, 192, 128);
    }
}
