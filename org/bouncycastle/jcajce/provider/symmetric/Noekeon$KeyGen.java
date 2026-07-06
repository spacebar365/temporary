package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Noekeon$KeyGen extends BaseKeyGenerator {
    public Noekeon$KeyGen() {
        super("Noekeon", 128, new h());
    }
}
