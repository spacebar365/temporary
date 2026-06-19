package org.bouncycastle.p118e.p120b.p128g;

import org.bouncycastle.p083b.InterfaceC1175r;

/* JADX INFO: renamed from: org.bouncycastle.e.b.g.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1487x {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1486w f5389a;

    /* JADX INFO: renamed from: b */
    private final C1474k f5390b;

    /* JADX INFO: renamed from: c */
    private final int f5391c;

    /* JADX INFO: renamed from: d */
    private final int f5392d;

    public C1487x(int i, InterfaceC1175r interfaceC1175r) {
        if (i < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        if (interfaceC1175r == null) {
            throw new NullPointerException("digest == null");
        }
        this.f5390b = new C1474k(new C1476m(interfaceC1175r));
        this.f5391c = i;
        this.f5392d = m3961g();
        this.f5389a = C1468e.m3861a(m3962a().mo1927a(), m3963b(), m3964c(), this.f5390b.m3897a().m3908d(), i);
    }

    /* JADX INFO: renamed from: g */
    private int m3961g() {
        for (int i = 2; i <= this.f5391c; i++) {
            if ((this.f5391c - i) % 2 == 0) {
                return i;
            }
        }
        throw new IllegalStateException("should never happen...");
    }

    /* JADX INFO: renamed from: a */
    protected final InterfaceC1175r m3962a() {
        return this.f5390b.m3897a().m3905a();
    }

    /* JADX INFO: renamed from: b */
    public final int m3963b() {
        return this.f5390b.m3897a().m3906b();
    }

    /* JADX INFO: renamed from: c */
    public final int m3964c() {
        return this.f5390b.m3897a().m3907c();
    }

    /* JADX INFO: renamed from: d */
    public final int m3965d() {
        return this.f5391c;
    }

    /* JADX INFO: renamed from: e */
    final C1474k m3966e() {
        return this.f5390b;
    }

    /* JADX INFO: renamed from: f */
    final int m3967f() {
        return this.f5392d;
    }
}
