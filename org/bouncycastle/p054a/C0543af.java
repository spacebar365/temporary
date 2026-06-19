package org.bouncycastle.p054a;

import java.io.IOException;

/* JADX INFO: renamed from: org.bouncycastle.a.af */
/* JADX INFO: loaded from: classes.dex */
public final class C0543af implements InterfaceC0564b {

    /* JADX INFO: renamed from: a */
    private final int f2001a;

    /* JADX INFO: renamed from: b */
    private final C0758z f2002b;

    C0543af(int i, C0758z c0758z) {
        this.f2001a = i;
        this.f2002b = c0758z;
    }

    @Override // org.bouncycastle.p054a.InterfaceC0606cb
    /* JADX INFO: renamed from: d */
    public final AbstractC0686u mo1398d() {
        return new C0542ae(this.f2001a, this.f2002b.m1780b());
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
