package org.bouncycastle.p054a;

import java.io.IOException;

/* JADX INFO: renamed from: org.bouncycastle.a.am */
/* JADX INFO: loaded from: classes.dex */
public final class C0550am implements InterfaceC0740w {

    /* JADX INFO: renamed from: a */
    private C0758z f2010a;

    C0550am(C0758z c0758z) {
        this.f2010a = c0758z;
    }

    @Override // org.bouncycastle.p054a.InterfaceC0606cb
    /* JADX INFO: renamed from: d */
    public final AbstractC0686u mo1398d() {
        return new C0549al(this.f2010a.m1780b());
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
