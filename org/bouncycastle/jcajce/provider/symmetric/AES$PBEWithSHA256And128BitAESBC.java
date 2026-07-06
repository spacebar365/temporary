package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class AES$PBEWithSHA256And128BitAESBC extends PBESecretKeyFactory {
    public AES$PBEWithSHA256And128BitAESBC() {
        super("PBEWithSHA256And128BitAES-CBC-BC", null, true, 2, 4, 128, 128);
    }
}
