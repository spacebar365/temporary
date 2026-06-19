package org.bouncycastle.p054a;

import java.io.IOException;

/* JADX INFO: renamed from: org.bouncycastle.a.aw */
/* JADX INFO: loaded from: classes.dex */
public final class C0560aw implements InterfaceC0606cb, InterfaceC0618f {

    /* JADX INFO: renamed from: a */
    private C0758z f2019a;

    public C0560aw(C0758z c0758z) {
        this.f2019a = c0758z;
    }

    @Override // org.bouncycastle.p054a.InterfaceC0606cb
    /* JADX INFO: renamed from: d */
    public final AbstractC0686u mo1398d() throws C0629i {
        try {
            return new C0597bu(this.f2019a.m1780b());
        } catch (IllegalArgumentException e) {
            throw new C0629i(e.getMessage(), e);
        }
    }

    @Override // org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        try {
            return mo1398d();
        } catch (IOException e) {
            throw new C0684t("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new C0684t("unable to get DER object", e2);
        }
    }
}
