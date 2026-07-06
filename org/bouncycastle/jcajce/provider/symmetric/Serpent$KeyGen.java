package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Serpent$KeyGen extends BaseKeyGenerator {
    public Serpent$KeyGen() {
        super("Serpent", 192, new h());
    }
}
