package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class SHA224$KeyGenerator extends BaseKeyGenerator {
    public SHA224$KeyGenerator() {
        super("HMACSHA224", 224, new h());
    }
}
