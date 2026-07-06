package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class AES$PBEWithSHAAnd128BitAESBC extends PBESecretKeyFactory {
    public AES$PBEWithSHAAnd128BitAESBC() {
        super("PBEWithSHA1And128BitAES-CBC-BC", null, true, 2, 1, 128, 128);
    }
}
