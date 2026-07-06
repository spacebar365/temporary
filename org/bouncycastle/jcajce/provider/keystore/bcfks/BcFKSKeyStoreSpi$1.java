package org.bouncycastle.jcajce.provider.keystore.bcfks;

import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class BcFKSKeyStoreSpi$1 implements Enumeration {
    final /* synthetic */ Iterator a;
    final /* synthetic */ BcFKSKeyStoreSpi b;

    BcFKSKeyStoreSpi$1(BcFKSKeyStoreSpi bcFKSKeyStoreSpi, Iterator it) {
        this.b = bcFKSKeyStoreSpi;
        this.a = it;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.a.hasNext();
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        return this.a.next();
    }
}
