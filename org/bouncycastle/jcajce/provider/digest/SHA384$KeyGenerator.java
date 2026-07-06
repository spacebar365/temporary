package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class SHA384$KeyGenerator extends BaseKeyGenerator {
    public SHA384$KeyGenerator() {
        super("HMACSHA384", 384, new h());
    }
}
