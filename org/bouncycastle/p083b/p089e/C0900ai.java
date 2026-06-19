package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1085bj;

/* JADX INFO: renamed from: org.bouncycastle.b.e.ai */
/* JADX INFO: loaded from: classes.dex */
public final class C0900ai implements InterfaceC0890e {

    /* JADX INFO: renamed from: a */
    private int f3707a = 12;

    /* JADX INFO: renamed from: b */
    private long[] f3708b = null;

    /* JADX INFO: renamed from: c */
    private boolean f3709c;

    /* JADX INFO: renamed from: a */
    private static long m2172a(long j, long j2) {
        return (j << ((int) (j2 & 63))) | (j >>> ((int) (64 - (63 & j2))));
    }

    /* JADX INFO: renamed from: a */
    private static long m2173a(byte[] bArr, int i) {
        long j = 0;
        for (int i2 = 7; i2 >= 0; i2--) {
            j = (j << 8) + ((long) (bArr[i2 + i] & 255));
        }
        return j;
    }

    /* JADX INFO: renamed from: a */
    private static void m2174a(long j, byte[] bArr, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i2 + i] = (byte) j;
            j >>>= 8;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2175a(byte[] bArr) {
        long[] jArr = new long[(bArr.length + 7) / 8];
        for (int i = 0; i != bArr.length; i++) {
            int i2 = i / 8;
            jArr[i2] = jArr[i2] + (((long) (bArr[i] & 255)) << ((i % 8) * 8));
        }
        this.f3708b = new long[(this.f3707a + 1) * 2];
        this.f3708b[0] = -5196783011329398165L;
        for (int i3 = 1; i3 < this.f3708b.length; i3++) {
            this.f3708b[i3] = r2[i3 - 1] - 7046029254386353131L;
        }
        int length = jArr.length > this.f3708b.length ? jArr.length * 3 : this.f3708b.length * 3;
        int i4 = 0;
        int length2 = 0;
        long jM2172a = 0;
        long j = 0;
        int length3 = 0;
        while (i4 < length) {
            long[] jArr2 = this.f3708b;
            long jM2172a2 = m2172a(jArr2[length3] + j + jM2172a, 3L);
            jArr2[length3] = jM2172a2;
            jM2172a = m2172a(jArr[length2] + jM2172a2 + jM2172a, jM2172a + jM2172a2);
            jArr[length2] = jM2172a;
            length3 = (length3 + 1) % this.f3708b.length;
            length2 = (length2 + 1) % jArr.length;
            i4++;
            j = jM2172a2;
        }
    }

    /* JADX INFO: renamed from: b */
    private static long m2176b(long j, long j2) {
        return (j >>> ((int) (j2 & 63))) | (j << ((int) (64 - (63 & j2))));
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final String mo2123a() {
        return "RC5-64";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final void mo2124a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (!(interfaceC1003i instanceof C1085bj)) {
            throw new IllegalArgumentException("invalid parameter passed to RC564 init - " + interfaceC1003i.getClass().getName());
        }
        C1085bj c1085bj = (C1085bj) interfaceC1003i;
        this.f3709c = z;
        this.f3707a = c1085bj.m2621b();
        m2175a(c1085bj.m2620a());
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return 16;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: c */
    public final void mo2126c() {
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.f3709c) {
            long jM2173a = this.f3708b[0] + m2173a(bArr, i);
            long jM2173a2 = m2173a(bArr, i + 8) + this.f3708b[1];
            for (int i3 = 1; i3 <= this.f3707a; i3++) {
                jM2173a = m2172a(jM2173a ^ jM2173a2, jM2173a2) + this.f3708b[i3 * 2];
                jM2173a2 = m2172a(jM2173a2 ^ jM2173a, jM2173a) + this.f3708b[(i3 * 2) + 1];
            }
            m2174a(jM2173a, bArr2, i2);
            m2174a(jM2173a2, bArr2, i2 + 8);
        } else {
            long jM2173a3 = m2173a(bArr, i);
            long jM2173a4 = m2173a(bArr, i + 8);
            for (int i4 = this.f3707a; i4 > 0; i4--) {
                jM2173a4 = m2176b(jM2173a4 - this.f3708b[(i4 * 2) + 1], jM2173a3) ^ jM2173a3;
                jM2173a3 = m2176b(jM2173a3 - this.f3708b[i4 * 2], jM2173a4) ^ jM2173a4;
            }
            m2174a(jM2173a3 - this.f3708b[0], bArr2, i2);
            m2174a(jM2173a4 - this.f3708b[1], bArr2, i2 + 8);
        }
        return 16;
    }
}
