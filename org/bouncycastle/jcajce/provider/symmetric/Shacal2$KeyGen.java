package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Shacal2$KeyGen extends BaseKeyGenerator {
    public Shacal2$KeyGen() {
        super("SHACAL-2", 128, new h());
    }
}
