package org.bouncycastle.p083b.p097k;

import org.bouncycastle.p054a.C0653p;

/* JADX INFO: renamed from: org.bouncycastle.b.k.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1123z extends C1051ac {

    /* JADX INFO: renamed from: a */
    private final C0653p f4512a;

    /* JADX INFO: renamed from: b */
    private final C0653p f4513b;

    /* JADX INFO: renamed from: i */
    private final C0653p f4514i;

    public C1123z(C1122y c1122y, C0653p c0653p, C0653p c0653p2, C0653p c0653p3) {
        super(c0653p, c1122y.m2699a(), c1122y.m2700b(), c1122y.m2701c(), c1122y.m2702d(), c1122y.m2704f());
        if (!c0653p.equals(((C1051ac) c1122y).m2564j())) {
            throw new IllegalArgumentException("named parameters do not match publicKeyParamSet value");
        }
        this.f4512a = c0653p;
        this.f4513b = c0653p2;
        this.f4514i = c0653p3;
    }

    /* JADX INFO: renamed from: g */
    public final C0653p m2705g() {
        return this.f4512a;
    }

    /* JADX INFO: renamed from: h */
    public final C0653p m2706h() {
        return this.f4513b;
    }

    /* JADX INFO: renamed from: i */
    public final C0653p m2707i() {
        return this.f4514i;
    }
}
