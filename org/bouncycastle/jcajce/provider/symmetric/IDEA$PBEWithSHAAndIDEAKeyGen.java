package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class IDEA$PBEWithSHAAndIDEAKeyGen extends PBESecretKeyFactory {
    public IDEA$PBEWithSHAAndIDEAKeyGen() {
        super("PBEwithSHAandIDEA-CBC", null, true, 2, 1, 128, 64);
    }
}
