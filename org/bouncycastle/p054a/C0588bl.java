package org.bouncycastle.p054a;

import java.io.IOException;

/* JADX INFO: renamed from: org.bouncycastle.a.bl */
/* JADX INFO: loaded from: classes.dex */
public final class C0588bl implements InterfaceC0749y {

    /* JADX INFO: renamed from: a */
    private C0758z f2120a;

    C0588bl(C0758z c0758z) {
        this.f2120a = c0758z;
    }

    @Override // org.bouncycastle.p054a.InterfaceC0606cb
    /* JADX INFO: renamed from: d */
    public final AbstractC0686u mo1398d() {
        return new C0587bk(this.f2120a.m1780b(), (byte) 0);
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
