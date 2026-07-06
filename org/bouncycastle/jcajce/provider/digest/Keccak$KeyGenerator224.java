package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Keccak$KeyGenerator224 extends BaseKeyGenerator {
    public Keccak$KeyGenerator224() {
        super("HMACKECCAK224", 224, new h());
    }
}
