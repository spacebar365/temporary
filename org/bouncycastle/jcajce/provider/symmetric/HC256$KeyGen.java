package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class HC256$KeyGen extends BaseKeyGenerator {
    public HC256$KeyGen() {
        super("HC256", 256, new h());
    }
}
