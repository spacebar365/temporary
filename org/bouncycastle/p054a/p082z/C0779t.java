package org.bouncycastle.p054a.p082z;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.a.z.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0779t extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private byte[] f3215a;

    public C0779t(byte[] bArr) {
        this.f3215a = C1535a.m4086b(bArr);
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m1842a() {
        return C1535a.m4086b(this.f3215a);
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        return new C0581be(C1535a.m4086b(this.f3215a));
    }
}
