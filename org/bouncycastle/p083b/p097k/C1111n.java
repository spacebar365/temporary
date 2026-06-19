package org.bouncycastle.p083b.p097k;

import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.k.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1111n {

    /* JADX INFO: renamed from: a */
    private byte[] f4480a;

    /* JADX INFO: renamed from: b */
    private int f4481b;

    public C1111n(byte[] bArr, int i) {
        this.f4480a = C1535a.m4086b(bArr);
        this.f4481b = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m2677a() {
        return this.f4481b;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m2678b() {
        return C1535a.m4086b(this.f4480a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1111n)) {
            return false;
        }
        C1111n c1111n = (C1111n) obj;
        if (c1111n.f4481b == this.f4481b) {
            return C1535a.m4076a(this.f4480a, c1111n.f4480a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4481b ^ C1535a.m4066a(this.f4480a);
    }
}
