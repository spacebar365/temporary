package org.bouncycastle.b.a;

import org.bouncycastle.b.ai;
import org.bouncycastle.b.k.br;
import org.bouncycastle.b.k.bs;

/* JADX INFO: loaded from: classes.dex */
public final class i implements ai {
    private br a;

    @Override // org.bouncycastle.b.ai
    public final int a() {
        return 32;
    }

    @Override // org.bouncycastle.b.ai
    public final void a(org.bouncycastle.b.i iVar) {
        this.a = (br) iVar;
    }

    @Override // org.bouncycastle.b.ai
    public final void a(org.bouncycastle.b.i iVar, byte[] bArr, int i) {
        this.a.a((bs) iVar, bArr, i);
    }
}
