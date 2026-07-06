package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class RC6$KeyGen extends BaseKeyGenerator {
    public RC6$KeyGen() {
        super("RC6", 256, new h());
    }
}
