package org.bouncycastle.p118e.p120b.p128g;

import org.bouncycastle.p083b.InterfaceC1175r;

/* JADX INFO: renamed from: org.bouncycastle.e.b.g.m */
/* JADX INFO: loaded from: classes.dex */
final class C1476m {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1486w f5342a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1175r f5343b;

    /* JADX INFO: renamed from: c */
    private final int f5344c;

    /* JADX INFO: renamed from: d */
    private final int f5345d;

    /* JADX INFO: renamed from: e */
    private final int f5346e;

    /* JADX INFO: renamed from: f */
    private final int f5347f;

    /* JADX INFO: renamed from: g */
    private final int f5348g;

    /* JADX INFO: renamed from: a */
    protected final InterfaceC1175r m3905a() {
        return this.f5343b;
    }

    /* JADX INFO: renamed from: b */
    protected final int m3906b() {
        return this.f5344c;
    }

    /* JADX INFO: renamed from: c */
    protected final int m3907c() {
        return this.f5345d;
    }

    /* JADX INFO: renamed from: d */
    protected final int m3908d() {
        return this.f5346e;
    }

    protected C1476m(InterfaceC1175r interfaceC1175r) {
        if (interfaceC1175r == null) {
            throw new NullPointerException("digest == null");
        }
        this.f5343b = interfaceC1175r;
        if (interfaceC1175r == null) {
            throw new NullPointerException("digest == null");
        }
        String strMo1927a = interfaceC1175r.mo1927a();
        this.f5344c = strMo1927a.equals("SHAKE128") ? 32 : strMo1927a.equals("SHAKE256") ? 64 : interfaceC1175r.mo1930b();
        this.f5345d = 16;
        this.f5347f = (int) Math.ceil(((double) (this.f5344c * 8)) / ((double) C1464aa.m3833a(this.f5345d)));
        this.f5348g = (C1464aa.m3833a(this.f5347f * (this.f5345d - 1)) / C1464aa.m3833a(this.f5345d)) + 1;
        this.f5346e = this.f5347f + this.f5348g;
        this.f5342a = C1475l.m3903a(interfaceC1175r.mo1927a(), this.f5344c, this.f5345d, this.f5346e);
        if (this.f5342a == null) {
            throw new IllegalArgumentException("cannot find OID for digest algorithm: " + interfaceC1175r.mo1927a());
        }
    }
}
