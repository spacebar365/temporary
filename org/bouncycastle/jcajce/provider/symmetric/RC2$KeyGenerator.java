package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class RC2$KeyGenerator extends BaseKeyGenerator {
    public RC2$KeyGenerator() {
        super("RC2", 128, new h());
    }
}
