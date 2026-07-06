package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Tiger$KeyGenerator extends BaseKeyGenerator {
    public Tiger$KeyGenerator() {
        super("HMACTIGER", 192, new h());
    }
}
