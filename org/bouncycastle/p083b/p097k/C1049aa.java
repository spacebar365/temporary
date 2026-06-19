package org.bouncycastle.p083b.p097k;

import java.security.SecureRandom;
import org.bouncycastle.p083b.C1181x;

/* JADX INFO: renamed from: org.bouncycastle.b.k.aa */
/* JADX INFO: loaded from: classes.dex */
public final class C1049aa extends C1181x {

    /* JADX INFO: renamed from: a */
    private C1122y f4377a;

    public C1049aa(C1122y c1122y, SecureRandom secureRandom) {
        super(secureRandom, c1122y.m2701c().bitLength());
        this.f4377a = c1122y;
    }

    /* JADX INFO: renamed from: c */
    public final C1122y m2562c() {
        return this.f4377a;
    }
}
