package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class Twofish$PBEWithSHAKeyFactory extends PBESecretKeyFactory {
    public Twofish$PBEWithSHAKeyFactory() {
        super("PBEwithSHAandTwofish-CBC", null, true, 2, 1, 256, 128);
    }
}
