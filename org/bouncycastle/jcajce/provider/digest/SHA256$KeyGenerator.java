package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class SHA256$KeyGenerator extends BaseKeyGenerator {
    public SHA256$KeyGenerator() {
        super("HMACSHA256", 256, new h());
    }
}
