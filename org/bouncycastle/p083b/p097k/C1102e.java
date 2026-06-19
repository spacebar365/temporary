package org.bouncycastle.p083b.p097k;

import java.security.SecureRandom;
import org.bouncycastle.p083b.C1181x;

/* JADX INFO: renamed from: org.bouncycastle.b.k.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1102e extends C1181x {

    /* JADX INFO: renamed from: a */
    private C1106i f4457a;

    /* JADX INFO: renamed from: c */
    public final C1106i m2657c() {
        return this.f4457a;
    }

    public C1102e(SecureRandom secureRandom, C1106i c1106i) {
        super(secureRandom, c1106i.m2669f() != 0 ? c1106i.m2669f() : c1106i.m2664a().bitLength());
        this.f4457a = c1106i;
    }
}
