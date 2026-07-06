package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class AES$PBEWithSHA256And256BitAESBC extends PBESecretKeyFactory {
    public AES$PBEWithSHA256And256BitAESBC() {
        super("PBEWithSHA256And256BitAES-CBC-BC", null, true, 2, 4, 256, 128);
    }
}
