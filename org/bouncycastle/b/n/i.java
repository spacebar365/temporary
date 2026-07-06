package org.bouncycastle.b.n;

import org.bouncycastle.b.ak;
import org.bouncycastle.b.k.ag;
import org.bouncycastle.b.k.ah;

/* JADX INFO: loaded from: classes.dex */
public final class i implements ak {
    private final i$a a = new i$a((byte) 0);
    private boolean b;
    private ag c;
    private ah d;

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
        if (this.b || this.d == null) {
            throw new IllegalStateException("Ed25519Signer not initialised for verification");
        }
        return this.a.a(this.d, bArr);
    }

    @Override // org.bouncycastle.b.ak
    public final byte[] a() {
        if (!this.b || this.c == null) {
            throw new IllegalStateException("Ed25519Signer not initialised for signature generation.");
        }
        return this.a.a(this.c, this.d);
    }

    @Override // org.bouncycastle.b.ak
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        this.b = z;
        if (z) {
            this.c = (ag) iVar;
            this.d = this.c.c();
        } else {
            this.c = null;
            this.d = (ah) iVar;
        }
        this.a.reset();
    }
}
