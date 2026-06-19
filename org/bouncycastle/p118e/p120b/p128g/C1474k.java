package org.bouncycastle.p118e.p120b.p128g;

import org.bouncycastle.p118e.p120b.p128g.C1473j;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.e.b.g.k */
/* JADX INFO: loaded from: classes.dex */
final class C1474k {

    /* JADX INFO: renamed from: a */
    private final C1476m f5335a;

    /* JADX INFO: renamed from: b */
    private final C1471h f5336b;

    /* JADX INFO: renamed from: c */
    private byte[] f5337c;

    /* JADX INFO: renamed from: d */
    private byte[] f5338d;

    protected C1474k(C1476m c1476m) {
        this.f5335a = c1476m;
        int iM3906b = c1476m.m3906b();
        this.f5336b = new C1471h(c1476m.m3905a(), iM3906b);
        this.f5337c = new byte[iM3906b];
        this.f5338d = new byte[iM3906b];
    }

    /* JADX INFO: renamed from: a */
    private byte[] m3896a(byte[] bArr, int i, int i2, C1473j c1473j) {
        int iM3906b = this.f5335a.m3906b();
        if (bArr == null) {
            throw new NullPointerException("startHash == null");
        }
        if (bArr.length != iM3906b) {
            throw new IllegalArgumentException("startHash needs to be " + iM3906b + "bytes");
        }
        if (c1473j == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (c1473j.mo3865a() == null) {
            throw new NullPointerException("otsHashAddress byte array == null");
        }
        if (i + i2 > this.f5335a.m3907c() - 1) {
            throw new IllegalArgumentException("max chain length must not be greater than w");
        }
        if (i2 == 0) {
            return bArr;
        }
        byte[] bArrM3896a = m3896a(bArr, i, i2 - 1, c1473j);
        C1473j c1473j2 = (C1473j) new C1473j.a().m3918d(c1473j.m3910e()).m3917a(c1473j.m3911f()).m3893a(c1473j.m3887b()).m3894b(c1473j.m3888c()).m3895c((i + i2) - 1).m3919e(0).mo3871a();
        byte[] bArrM3877c = this.f5336b.m3877c(this.f5338d, c1473j2.mo3865a());
        byte[] bArrM3877c2 = this.f5336b.m3877c(this.f5338d, ((C1473j) new C1473j.a().m3918d(c1473j2.m3910e()).m3917a(c1473j2.m3911f()).m3893a(c1473j2.m3887b()).m3894b(c1473j2.m3888c()).m3895c(c1473j2.m3889d()).m3919e(1).mo3871a()).mo3865a());
        byte[] bArr2 = new byte[iM3906b];
        for (int i3 = 0; i3 < iM3906b; i3++) {
            bArr2[i3] = (byte) (bArrM3896a[i3] ^ bArrM3877c2[i3]);
        }
        return this.f5336b.m3875a(bArrM3877c, bArr2);
    }

    /* JADX INFO: renamed from: a */
    protected final C1476m m3897a() {
        return this.f5335a;
    }

    /* JADX INFO: renamed from: a */
    final void m3899a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("secretKeySeed == null");
        }
        if (bArr.length != this.f5335a.m3906b()) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        }
        if (bArr2 == null) {
            throw new NullPointerException("publicSeed == null");
        }
        if (bArr2.length != this.f5335a.m3906b()) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
        this.f5337c = bArr;
        this.f5338d = bArr2;
    }

    /* JADX INFO: renamed from: a */
    protected final byte[] m3900a(byte[] bArr, C1473j c1473j) {
        return this.f5336b.m3877c(bArr, ((C1473j) new C1473j.a().m3918d(c1473j.m3910e()).m3917a(c1473j.m3911f()).m3893a(c1473j.m3887b()).mo3871a()).mo3865a());
    }

    /* JADX INFO: renamed from: b */
    protected final C1471h m3901b() {
        return this.f5336b;
    }

    /* JADX INFO: renamed from: c */
    protected final byte[] m3902c() {
        return C1535a.m4086b(this.f5338d);
    }

    /* JADX INFO: renamed from: a */
    protected final C1477n m3898a(C1473j c1473j) {
        if (c1473j == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        byte[][] bArr = new byte[this.f5335a.m3908d()][];
        int i = 0;
        while (i < this.f5335a.m3908d()) {
            C1473j c1473j2 = (C1473j) new C1473j.a().m3918d(c1473j.m3910e()).m3917a(c1473j.m3911f()).m3893a(c1473j.m3887b()).m3894b(i).m3895c(c1473j.m3889d()).m3919e(c1473j.m3912g()).mo3871a();
            if (i < 0 || i >= this.f5335a.m3908d()) {
                throw new IllegalArgumentException("index out of bounds");
            }
            bArr[i] = m3896a(this.f5336b.m3877c(this.f5337c, C1464aa.m3839a(i, 32)), 0, this.f5335a.m3907c() - 1, c1473j2);
            i++;
            c1473j = c1473j2;
        }
        return new C1477n(this.f5335a, bArr);
    }
}
