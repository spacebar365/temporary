package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Keccak$KeyGenerator384 extends BaseKeyGenerator {
    public Keccak$KeyGenerator384() {
        super("HMACKECCAK384", 384, new h());
    }
}
