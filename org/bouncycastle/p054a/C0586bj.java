package org.bouncycastle.p054a;

import java.io.IOException;

/* JADX INFO: renamed from: org.bouncycastle.a.bj */
/* JADX INFO: loaded from: classes.dex */
public final class C0586bj implements InterfaceC0740w {

    /* JADX INFO: renamed from: a */
    private C0758z f2118a;

    C0586bj(C0758z c0758z) {
        this.f2118a = c0758z;
    }

    @Override // org.bouncycastle.p054a.InterfaceC0606cb
    /* JADX INFO: renamed from: d */
    public final AbstractC0686u mo1398d() {
        return new C0585bi(this.f2118a.m1780b());
    }

    @Override // org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        try {
            return mo1398d();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
