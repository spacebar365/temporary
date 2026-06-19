package org.bouncycastle.p083b.p097k;

import java.security.SecureRandom;
import org.bouncycastle.p083b.C1181x;

/* JADX INFO: renamed from: org.bouncycastle.b.k.aq */
/* JADX INFO: loaded from: classes.dex */
public final class C1065aq extends C1181x {

    /* JADX INFO: renamed from: a */
    private C1067as f4393a;

    public C1065aq(SecureRandom secureRandom, C1067as c1067as) {
        super(secureRandom, c1067as.m2586a().bitLength() - 1);
        this.f4393a = c1067as;
    }

    /* JADX INFO: renamed from: c */
    public final C1067as m2584c() {
        return this.f4393a;
    }
}
