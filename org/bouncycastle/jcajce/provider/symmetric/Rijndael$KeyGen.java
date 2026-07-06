package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Rijndael$KeyGen extends BaseKeyGenerator {
    public Rijndael$KeyGen() {
        super("Rijndael", 192, new h());
    }
}
