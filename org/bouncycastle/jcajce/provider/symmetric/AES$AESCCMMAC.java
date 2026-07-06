package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;

/* JADX INFO: loaded from: classes.dex */
public class AES$AESCCMMAC extends BaseMac {
    public AES$AESCCMMAC() {
        super(new AES$AESCCMMAC$CCMMac((byte) 0));
    }
}
