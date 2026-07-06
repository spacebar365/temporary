package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Serpent$TKeyGen extends BaseKeyGenerator {
    public Serpent$TKeyGen() {
        super("Tnepres", 192, new h());
    }
}
