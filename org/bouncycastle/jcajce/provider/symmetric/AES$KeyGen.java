package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class AES$KeyGen extends BaseKeyGenerator {
    public AES$KeyGen() {
        this(192);
    }

    public AES$KeyGen(int i) {
        super("AES", i, new h());
    }
}
