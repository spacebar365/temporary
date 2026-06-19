package org.bouncycastle.p083b;

import java.security.SecureRandom;

/* JADX INFO: renamed from: org.bouncycastle.b.h */
/* JADX INFO: loaded from: classes.dex */
public class C0987h {

    /* JADX INFO: renamed from: a */
    protected SecureRandom f4057a;

    /* JADX INFO: renamed from: b */
    protected int f4058b;

    /* JADX INFO: renamed from: a */
    public void mo2415a(C1181x c1181x) {
        this.f4057a = c1181x.m2824a();
        this.f4058b = (c1181x.m2825b() + 7) / 8;
    }

    /* JADX INFO: renamed from: a */
    public byte[] mo2416a() {
        byte[] bArr = new byte[this.f4058b];
        this.f4057a.nextBytes(bArr);
        return bArr;
    }
}
