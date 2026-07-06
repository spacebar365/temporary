package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class GOST3411$PBEWithMacKeyFactory extends PBESecretKeyFactory {
    public GOST3411$PBEWithMacKeyFactory() {
        super("PBEwithHmacGOST3411", null, false, 2, 6, 256, 0);
    }
}
