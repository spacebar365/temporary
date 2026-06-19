package org.bouncycastle.p083b.p099m;

import java.security.SecureRandom;

/* JADX INFO: renamed from: org.bouncycastle.b.m.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1128a implements InterfaceC1136e {

    /* JADX INFO: renamed from: a */
    private final SecureRandom f4528a;

    /* JADX INFO: renamed from: b */
    private final boolean f4529b;

    public C1128a(SecureRandom secureRandom, boolean z) {
        this.f4528a = secureRandom;
        this.f4529b = z;
    }

    @Override // org.bouncycastle.p083b.p099m.InterfaceC1136e
    /* JADX INFO: renamed from: a */
    public final InterfaceC1135d mo2719a(int i) {
        return new C1133b(this, i);
    }
}
