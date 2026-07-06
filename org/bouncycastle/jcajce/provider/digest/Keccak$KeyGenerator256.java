package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Keccak$KeyGenerator256 extends BaseKeyGenerator {
    public Keccak$KeyGenerator256() {
        super("HMACKECCAK256", 256, new h());
    }
}
