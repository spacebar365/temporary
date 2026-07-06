package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Keccak$KeyGenerator512 extends BaseKeyGenerator {
    public Keccak$KeyGenerator512() {
        super("HMACKECCAK512", 512, new h());
    }
}
