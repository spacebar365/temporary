package org.bouncycastle.b.a;

import org.bouncycastle.b.ai;
import org.bouncycastle.b.k.bw;
import org.bouncycastle.b.k.bx;

/* JADX INFO: loaded from: classes.dex */
public final class k implements ai {
    private final ai a;
    private bw b;

    public k(ai aiVar) {
        this.a = aiVar;
    }

    @Override // org.bouncycastle.b.ai
    public final int a() {
        return this.a.a() * 2;
    }

    @Override // org.bouncycastle.b.ai
    public final void a(org.bouncycastle.b.i iVar) {
        this.b = (bw) iVar;
    }

    @Override // org.bouncycastle.b.ai
    public final void a(org.bouncycastle.b.i iVar, byte[] bArr, int i) {
        bx bxVar = (bx) iVar;
        this.a.a(this.b.b());
        this.a.a(bxVar.b(), bArr, i);
        this.a.a(this.b.a());
        this.a.a(bxVar.a(), bArr, this.a.a() + i);
    }
}
