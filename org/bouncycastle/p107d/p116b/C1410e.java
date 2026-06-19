package org.bouncycastle.p107d.p116b;

import java.math.BigInteger;

/* JADX INFO: renamed from: org.bouncycastle.d.b.e */
/* JADX INFO: loaded from: classes.dex */
final class C1410e implements InterfaceC1412g {

    /* JADX INFO: renamed from: a */
    protected final InterfaceC1407b f5119a;

    /* JADX INFO: renamed from: b */
    protected final InterfaceC1411f f5120b;

    C1410e(InterfaceC1407b interfaceC1407b, InterfaceC1411f interfaceC1411f) {
        this.f5119a = interfaceC1407b;
        this.f5120b = interfaceC1411f;
    }

    @Override // org.bouncycastle.p107d.p116b.InterfaceC1407b
    /* JADX INFO: renamed from: a */
    public final BigInteger mo3552a() {
        return this.f5119a.mo3552a();
    }

    @Override // org.bouncycastle.p107d.p116b.InterfaceC1407b
    /* JADX INFO: renamed from: b */
    public final int mo3553b() {
        return this.f5119a.mo3553b() * this.f5120b.mo3556a();
    }

    @Override // org.bouncycastle.p107d.p116b.InterfaceC1412g
    /* JADX INFO: renamed from: c */
    public final InterfaceC1411f mo3558c() {
        return this.f5120b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1410e)) {
            return false;
        }
        C1410e c1410e = (C1410e) obj;
        return this.f5119a.equals(c1410e.f5119a) && this.f5120b.equals(c1410e.f5120b);
    }

    public final int hashCode() {
        return this.f5119a.hashCode() ^ Integer.rotateLeft(this.f5120b.hashCode(), 16);
    }
}
