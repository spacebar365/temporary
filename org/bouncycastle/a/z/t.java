package org.bouncycastle.a.z;

import org.bouncycastle.a.be;

/* JADX INFO: loaded from: classes.dex */
public final class t extends org.bouncycastle.a.o {
    private byte[] a;

    public t(byte[] bArr) {
        this.a = org.bouncycastle.f.a.b(bArr);
    }

    public final byte[] a() {
        return org.bouncycastle.f.a.b(this.a);
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        return new be(org.bouncycastle.f.a.b(this.a));
    }
}
