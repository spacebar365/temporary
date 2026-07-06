package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Twofish$KeyGen extends BaseKeyGenerator {
    public Twofish$KeyGen() {
        super("Twofish", 256, new h());
    }
}
