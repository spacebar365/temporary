package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Camellia$KeyGen extends BaseKeyGenerator {
    public Camellia$KeyGen() {
        this(256);
    }

    public Camellia$KeyGen(int i) {
        super("Camellia", i, new h());
    }
}
