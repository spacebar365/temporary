package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class AES$PBEWithSHAAnd192BitAESBC extends PBESecretKeyFactory {
    public AES$PBEWithSHAAnd192BitAESBC() {
        super("PBEWithSHA1And192BitAES-CBC-BC", null, true, 2, 1, 192, 128);
    }
}
