package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class IDEA$KeyGen extends BaseKeyGenerator {
    public IDEA$KeyGen() {
        super("IDEA", 128, new h());
    }
}
