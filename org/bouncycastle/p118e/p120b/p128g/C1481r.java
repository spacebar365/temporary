package org.bouncycastle.p118e.p120b.p128g;

import org.bouncycastle.p083b.InterfaceC1175r;

/* JADX INFO: renamed from: org.bouncycastle.e.b.g.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1481r {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1486w f5360a;

    /* JADX INFO: renamed from: b */
    private final C1487x f5361b;

    /* JADX INFO: renamed from: c */
    private final int f5362c;

    /* JADX INFO: renamed from: d */
    private final int f5363d;

    /* JADX INFO: renamed from: a */
    public final int m3922a() {
        return this.f5362c;
    }

    /* JADX INFO: renamed from: b */
    public final int m3923b() {
        return this.f5363d;
    }

    /* JADX INFO: renamed from: c */
    protected final C1487x m3924c() {
        return this.f5361b;
    }

    /* JADX INFO: renamed from: d */
    protected final InterfaceC1175r m3925d() {
        return this.f5361b.m3962a();
    }

    /* JADX INFO: renamed from: e */
    public final int m3926e() {
        return this.f5361b.m3963b();
    }

    public C1481r(int i, int i2, InterfaceC1175r interfaceC1175r) {
        this.f5362c = i;
        this.f5363d = i2;
        if (i < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        }
        if (i % i2 != 0) {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        if (i / i2 == 1) {
            throw new IllegalArgumentException("height / layers must be greater than 1");
        }
        this.f5361b = new C1487x(i / i2, interfaceC1175r);
        this.f5360a = C1467d.m3859a(this.f5361b.m3962a().mo1927a(), this.f5361b.m3963b(), this.f5361b.m3964c(), this.f5361b.m3966e().m3897a().m3908d(), this.f5362c, i2);
    }
}
