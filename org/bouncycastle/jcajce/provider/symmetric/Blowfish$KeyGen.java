package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Blowfish$KeyGen extends BaseKeyGenerator {
    public Blowfish$KeyGen() {
        super("Blowfish", 128, new h());
    }
}
