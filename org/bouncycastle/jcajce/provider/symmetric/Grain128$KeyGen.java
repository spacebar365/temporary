package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Grain128$KeyGen extends BaseKeyGenerator {
    public Grain128$KeyGen() {
        super("Grain128", 128, new h());
    }
}
