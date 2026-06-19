package org.bouncycastle.p083b.p097k;

import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.k.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1118u {

    /* JADX INFO: renamed from: a */
    private int f4497a;

    /* JADX INFO: renamed from: b */
    private byte[] f4498b;

    /* JADX INFO: renamed from: c */
    private int f4499c;

    public C1118u(byte[] bArr, int i) {
        this(bArr, i, -1);
    }

    public C1118u(byte[] bArr, int i, int i2) {
        this.f4498b = C1535a.m4086b(bArr);
        this.f4499c = i;
        this.f4497a = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m2692a() {
        return this.f4499c;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m2693b() {
        return C1535a.m4086b(this.f4498b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1118u)) {
            return false;
        }
        C1118u c1118u = (C1118u) obj;
        if (c1118u.f4499c == this.f4499c) {
            return C1535a.m4076a(this.f4498b, c1118u.f4498b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4499c ^ C1535a.m4066a(this.f4498b);
    }
}
