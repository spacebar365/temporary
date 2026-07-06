package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class GOST28147$KeyGen extends BaseKeyGenerator {
    public GOST28147$KeyGen() {
        this((byte) 0);
    }

    private GOST28147$KeyGen(byte b) {
        super("GOST28147", 256, new h());
    }
}
