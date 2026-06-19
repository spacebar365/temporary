package org.bouncycastle.p107d.p116b;

import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.d.b.d */
/* JADX INFO: loaded from: classes.dex */
final class C1409d implements InterfaceC1411f {

    /* JADX INFO: renamed from: a */
    protected final int[] f5118a;

    C1409d(int[] iArr) {
        this.f5118a = C1535a.m4092c(iArr);
    }

    @Override // org.bouncycastle.p107d.p116b.InterfaceC1411f
    /* JADX INFO: renamed from: a */
    public final int mo3556a() {
        return this.f5118a[this.f5118a.length - 1];
    }

    @Override // org.bouncycastle.p107d.p116b.InterfaceC1411f
    /* JADX INFO: renamed from: b */
    public final int[] mo3557b() {
        return C1535a.m4092c(this.f5118a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1409d) {
            return C1535a.m4077a(this.f5118a, ((C1409d) obj).f5118a);
        }
        return false;
    }

    public final int hashCode() {
        return C1535a.m4082b(this.f5118a);
    }
}
