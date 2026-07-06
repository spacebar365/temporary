package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class Tiger$PBEWithMacKeyFactory extends PBESecretKeyFactory {
    public Tiger$PBEWithMacKeyFactory() {
        super("PBEwithHmacTiger", null, false, 2, 3, 192, 0);
    }
}
