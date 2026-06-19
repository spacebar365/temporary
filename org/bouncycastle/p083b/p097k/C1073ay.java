package org.bouncycastle.p083b.p097k;

import org.bouncycastle.p083b.InterfaceC1174q;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.k.ay */
/* JADX INFO: loaded from: classes.dex */
public final class C1073ay implements InterfaceC1174q {

    /* JADX INFO: renamed from: a */
    private byte[] f4405a;

    /* JADX INFO: renamed from: b */
    private byte[] f4406b;

    /* JADX INFO: renamed from: c */
    private byte[] f4407c;

    /* JADX INFO: renamed from: d */
    private int f4408d;

    public C1073ay(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new IllegalArgumentException("A KDF requires Ki (a seed) as input");
        }
        this.f4405a = C1535a.m4086b(bArr);
        this.f4406b = new byte[0];
        this.f4407c = C1535a.m4086b(bArr2);
        this.f4408d = 32;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m2596a() {
        return this.f4405a;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m2597b() {
        return C1535a.m4086b(this.f4406b);
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m2598c() {
        return C1535a.m4086b(this.f4407c);
    }

    /* JADX INFO: renamed from: d */
    public final int m2599d() {
        return this.f4408d;
    }
}
