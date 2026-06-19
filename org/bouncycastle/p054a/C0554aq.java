package org.bouncycastle.p054a;

import java.io.IOException;

/* JADX INFO: renamed from: org.bouncycastle.a.aq */
/* JADX INFO: loaded from: classes.dex */
public final class C0554aq implements InterfaceC0540ac {

    /* JADX INFO: renamed from: a */
    private boolean f2012a;

    /* JADX INFO: renamed from: b */
    private int f2013b;

    /* JADX INFO: renamed from: c */
    private C0758z f2014c;

    C0554aq(boolean z, int i, C0758z c0758z) {
        this.f2012a = z;
        this.f2013b = i;
        this.f2014c = c0758z;
    }

    @Override // org.bouncycastle.p054a.InterfaceC0606cb
    /* JADX INFO: renamed from: d */
    public final AbstractC0686u mo1398d() {
        return this.f2014c.m1779a(this.f2012a, this.f2013b);
    }

    @Override // org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        try {
            return mo1398d();
        } catch (IOException e) {
            throw new C0684t(e.getMessage());
        }
    }
}
