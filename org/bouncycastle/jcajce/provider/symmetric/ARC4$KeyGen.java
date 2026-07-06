package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class ARC4$KeyGen extends BaseKeyGenerator {
    public ARC4$KeyGen() {
        super("RC4", 128, new h());
    }
}
