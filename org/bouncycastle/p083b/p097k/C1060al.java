package org.bouncycastle.p083b.p097k;

import java.security.SecureRandom;
import org.bouncycastle.p083b.C1181x;

/* JADX INFO: renamed from: org.bouncycastle.b.k.al */
/* JADX INFO: loaded from: classes.dex */
public final class C1060al extends C1181x {

    /* JADX INFO: renamed from: a */
    private C1062an f4386a;

    /* JADX INFO: renamed from: c */
    public final C1062an m2577c() {
        return this.f4386a;
    }

    public C1060al(SecureRandom secureRandom, C1062an c1062an) {
        super(secureRandom, c1062an.m2581c() != 0 ? c1062an.m2581c() : c1062an.m2579a().bitLength());
        this.f4386a = c1062an;
    }
}
