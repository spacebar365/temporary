package org.bouncycastle.p083b.p090f;

import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.C1181x;

/* JADX INFO: renamed from: org.bouncycastle.b.f.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0978y extends C0987h {
    @Override // org.bouncycastle.p083b.C0987h
    /* JADX INFO: renamed from: a */
    public final void mo2415a(C1181x c1181x) {
        super.mo2415a(new C1181x(c1181x.m2824a(), 256));
    }

    @Override // org.bouncycastle.p083b.C0987h
    /* JADX INFO: renamed from: a */
    public final byte[] mo2416a() {
        byte[] bArrMo2416a = super.mo2416a();
        if (bArrMo2416a.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        bArrMo2416a[3] = (byte) (bArrMo2416a[3] & 15);
        bArrMo2416a[7] = (byte) (bArrMo2416a[7] & 15);
        bArrMo2416a[11] = (byte) (bArrMo2416a[11] & 15);
        bArrMo2416a[15] = (byte) (bArrMo2416a[15] & 15);
        bArrMo2416a[4] = (byte) (bArrMo2416a[4] & (-4));
        bArrMo2416a[8] = (byte) (bArrMo2416a[8] & (-4));
        bArrMo2416a[12] = (byte) (bArrMo2416a[12] & (-4));
        return bArrMo2416a;
    }
}
