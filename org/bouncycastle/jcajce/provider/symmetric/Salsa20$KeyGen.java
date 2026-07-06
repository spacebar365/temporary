package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Salsa20$KeyGen extends BaseKeyGenerator {
    public Salsa20$KeyGen() {
        super("Salsa20", 128, new h());
    }
}
