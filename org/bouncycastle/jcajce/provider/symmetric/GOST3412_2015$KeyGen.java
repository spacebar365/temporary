package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class GOST3412_2015$KeyGen extends BaseKeyGenerator {
    public GOST3412_2015$KeyGen() {
        this((byte) 0);
    }

    private GOST3412_2015$KeyGen(byte b) {
        super("GOST3412-2015", 256, new h());
    }
}
