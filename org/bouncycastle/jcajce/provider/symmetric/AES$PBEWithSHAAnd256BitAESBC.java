package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class AES$PBEWithSHAAnd256BitAESBC extends PBESecretKeyFactory {
    public AES$PBEWithSHAAnd256BitAESBC() {
        super("PBEWithSHA1And256BitAES-CBC-BC", null, true, 2, 1, 256, 128);
    }
}
