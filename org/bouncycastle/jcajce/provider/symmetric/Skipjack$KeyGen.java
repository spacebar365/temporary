package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Skipjack$KeyGen extends BaseKeyGenerator {
    public Skipjack$KeyGen() {
        super("Skipjack", 80, new h());
    }
}
