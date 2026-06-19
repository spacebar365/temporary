package org.bouncycastle.p054a;

import java.io.IOException;

/* JADX INFO: renamed from: org.bouncycastle.a.ao */
/* JADX INFO: loaded from: classes.dex */
public final class C0552ao implements InterfaceC0749y {

    /* JADX INFO: renamed from: a */
    private C0758z f2011a;

    C0552ao(C0758z c0758z) {
        this.f2011a = c0758z;
    }

    @Override // org.bouncycastle.p054a.InterfaceC0606cb
    /* JADX INFO: renamed from: d */
    public final AbstractC0686u mo1398d() {
        return new C0551an(this.f2011a.m1780b());
    }

    @Override // org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        try {
            return mo1398d();
        } catch (IOException e) {
            throw new C0684t(e.getMessage(), e);
        }
    }
}
