package org.bouncycastle.b.h;

import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.k.be;
import org.bouncycastle.b.v;
import org.bouncycastle.b.z;

/* JADX INFO: loaded from: classes.dex */
public final class e implements z {
    private final org.bouncycastle.b.i.l a;
    private final int b = 128;

    public e(org.bouncycastle.b.i.l lVar) {
        this.a = lVar;
    }

    @Override // org.bouncycastle.b.z
    public final int a(byte[] bArr, int i) {
        try {
            return this.a.a(bArr, i);
        } catch (v e) {
            throw new IllegalStateException(e.toString());
        }
    }

    @Override // org.bouncycastle.b.z
    public final String a() {
        return this.a.a().a() + "-GMAC";
    }

    @Override // org.bouncycastle.b.z
    public final void a(byte b) {
        this.a.a(b);
    }

    @Override // org.bouncycastle.b.z
    public final void a(org.bouncycastle.b.i iVar) {
        if (!(iVar instanceof be)) {
            throw new IllegalArgumentException("GMAC requires ParametersWithIV");
        }
        be beVar = (be) iVar;
        byte[] bArrA = beVar.a();
        this.a.a(true, (org.bouncycastle.b.i) new org.bouncycastle.b.k.a((ba) beVar.b(), this.b, bArrA));
    }

    @Override // org.bouncycastle.b.z
    public final void a(byte[] bArr, int i, int i2) {
        this.a.a(bArr, i, i2);
    }

    @Override // org.bouncycastle.b.z
    public final int b() {
        return this.b / 8;
    }

    @Override // org.bouncycastle.b.z
    public final void c() {
        this.a.c();
    }
}
