package org.bouncycastle.b.n;

import org.bouncycastle.b.ak;
import org.bouncycastle.b.k.aj;

/* JADX INFO: loaded from: classes.dex */
public final class j implements ak {
    private final j$a a = new j$a((byte) 0);
    private final byte[] b;
    private boolean c;
    private aj d;
    private org.bouncycastle.b.k.ak e;

    public j(byte[] bArr) {
        this.b = org.bouncycastle.f.a.b(bArr);
    }

    @Override // org.bouncycastle.b.ak
    public final void a(byte b) {
        this.a.write(b);
    }

    @Override // org.bouncycastle.b.ak
    public final void a(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
    }

    @Override // org.bouncycastle.b.ak
    public final boolean a(byte[] bArr) {
        if (this.c || this.e == null) {
            throw new IllegalStateException("Ed448Signer not initialised for verification");
        }
        return this.a.a(this.e, this.b, bArr);
    }

    @Override // org.bouncycastle.b.ak
    public final byte[] a() {
        if (!this.c || this.d == null) {
            throw new IllegalStateException("Ed448Signer not initialised for signature generation.");
        }
        return this.a.a(this.d, this.e, this.b);
    }

    @Override // org.bouncycastle.b.ak
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        this.c = z;
        if (z) {
            this.d = (aj) iVar;
            this.e = this.d.c();
        } else {
            this.d = null;
            this.e = (org.bouncycastle.b.k.ak) iVar;
        }
        this.a.reset();
    }
}
