package org.bouncycastle.b.e;

import org.bouncycastle.b.k.bh;

/* JADX INFO: loaded from: classes.dex */
public class v implements org.bouncycastle.b.ap {
    private u a = new u();
    private org.bouncycastle.b.h.f b = new org.bouncycastle.b.h.f();

    @Override // org.bouncycastle.b.ap
    public final String a() {
        return "GOST28147Wrap";
    }

    @Override // org.bouncycastle.b.ap
    public void a(boolean z, org.bouncycastle.b.i iVar) {
        bh bhVar = (bh) (iVar instanceof org.bouncycastle.b.k.bf ? ((org.bouncycastle.b.k.bf) iVar).b() : iVar);
        this.a.a(z, bhVar.b());
        this.b.a(new org.bouncycastle.b.k.be(bhVar.b() instanceof org.bouncycastle.b.k.bg ? (org.bouncycastle.b.k.ba) ((org.bouncycastle.b.k.bg) bhVar.b()).b() : (org.bouncycastle.b.k.ba) bhVar.b(), bhVar.a()));
    }

    @Override // org.bouncycastle.b.ap
    public final byte[] a(byte[] bArr, int i) {
        this.b.a(bArr, 0, i);
        byte[] bArr2 = new byte[this.b.b() + i];
        this.a.a(bArr, 0, bArr2, 0);
        this.a.a(bArr, 8, bArr2, 8);
        this.a.a(bArr, 16, bArr2, 16);
        this.a.a(bArr, 24, bArr2, 24);
        this.b.a(bArr2, i);
        return bArr2;
    }

    @Override // org.bouncycastle.b.ap
    public final byte[] b(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i - this.b.b()];
        this.a.a(bArr, 0, bArr2, 0);
        this.a.a(bArr, 8, bArr2, 8);
        this.a.a(bArr, 16, bArr2, 16);
        this.a.a(bArr, 24, bArr2, 24);
        byte[] bArr3 = new byte[this.b.b()];
        this.b.a(bArr2, 0, bArr2.length);
        this.b.a(bArr3, 0);
        byte[] bArr4 = new byte[this.b.b()];
        System.arraycopy(bArr, (i + 0) - 4, bArr4, 0, this.b.b());
        if (org.bouncycastle.f.a.b(bArr3, bArr4)) {
            return bArr2;
        }
        throw new IllegalStateException("mac mismatch");
    }
}
