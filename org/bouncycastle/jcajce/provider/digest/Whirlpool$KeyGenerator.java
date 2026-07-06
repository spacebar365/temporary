package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Whirlpool$KeyGenerator extends BaseKeyGenerator {
    public Whirlpool$KeyGenerator() {
        super("HMACWHIRLPOOL", 512, new h());
    }
}
