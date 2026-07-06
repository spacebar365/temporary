package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class ChaCha$KeyGen extends BaseKeyGenerator {
    public ChaCha$KeyGen() {
        super("ChaCha", 128, new h());
    }
}
