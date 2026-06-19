package org.bouncycastle.p083b.p097k;

import java.security.SecureRandom;
import org.bouncycastle.p083b.C1181x;

/* JADX INFO: renamed from: org.bouncycastle.b.k.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1112o extends C1181x {

    /* JADX INFO: renamed from: a */
    private C1115r f4482a;

    public C1112o(SecureRandom secureRandom, C1115r c1115r) {
        super(secureRandom, c1115r.m2686a().bitLength() - 1);
        this.f4482a = c1115r;
    }

    /* JADX INFO: renamed from: c */
    public final C1115r m2679c() {
        return this.f4482a;
    }
}
