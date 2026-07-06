package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class AES$PBEWithSHA256And192BitAESBC extends PBESecretKeyFactory {
    public AES$PBEWithSHA256And192BitAESBC() {
        super("PBEWithSHA256And192BitAES-CBC-BC", null, true, 2, 4, 192, 128);
    }
}
