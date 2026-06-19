package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;

/* JADX INFO: renamed from: org.bouncycastle.b.e.aj */
/* JADX INFO: loaded from: classes.dex */
public final class C0901aj implements InterfaceC0890e {

    /* JADX INFO: renamed from: a */
    private int[] f3710a = null;

    /* JADX INFO: renamed from: b */
    private boolean f3711b;

    /* JADX INFO: renamed from: a */
    private static int m2177a(int i, int i2) {
        return (i << i2) | (i >>> (-i2));
    }

    /* JADX INFO: renamed from: a */
    private static int m2178a(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 3; i3 >= 0; i3--) {
            i2 = (i2 << 8) + (bArr[i3 + i] & 255);
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    private static void m2179a(int i, byte[] bArr, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i3 + i2] = (byte) i;
            i >>>= 8;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2180a(byte[] bArr) {
        int[] iArr = new int[((bArr.length + 4) - 1) / 4];
        for (int length = bArr.length - 1; length >= 0; length--) {
            iArr[length / 4] = (iArr[length / 4] << 8) + (bArr[length] & 255);
        }
        this.f3710a = new int[44];
        this.f3710a[0] = -1209970333;
        for (int i = 1; i < this.f3710a.length; i++) {
            this.f3710a[i] = r1[i - 1] - 1640531527;
        }
        int length2 = iArr.length > this.f3710a.length ? iArr.length * 3 : this.f3710a.length * 3;
        int i2 = 0;
        int length3 = 0;
        int length4 = 0;
        int iM2177a = 0;
        int iM2177a2 = 0;
        while (i2 < length2) {
            int[] iArr2 = this.f3710a;
            iM2177a2 = m2177a(iM2177a2 + iArr2[length4] + iM2177a, 3);
            iArr2[length4] = iM2177a2;
            iM2177a = m2177a(iArr[length3] + iM2177a2 + iM2177a, iM2177a + iM2177a2);
            iArr[length3] = iM2177a;
            length4 = (length4 + 1) % this.f3710a.length;
            i2++;
            length3 = (length3 + 1) % iArr.length;
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m2181b(int i, int i2) {
        return (i >>> i2) | (i << (-i2));
    }

    /* JADX INFO: renamed from: b */
    private int m2182b(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = 1;
        int iM2178a = m2178a(bArr, i);
        int iM2178a2 = m2178a(bArr, i + 4);
        int iM2178a3 = m2178a(bArr, i + 8);
        int iM2178a4 = m2178a(bArr, i + 12);
        int i4 = this.f3710a[0] + iM2178a2;
        int i5 = this.f3710a[1] + iM2178a4;
        int i6 = iM2178a;
        while (i3 <= 20) {
            int iM2177a = m2177a(((i4 * 2) + 1) * i4, 5);
            int iM2177a2 = m2177a(((i5 * 2) + 1) * i5, 5);
            int iM2177a3 = this.f3710a[i3 * 2] + m2177a(i6 ^ iM2177a, iM2177a2);
            int iM2177a4 = this.f3710a[(i3 * 2) + 1] + m2177a(iM2178a3 ^ iM2177a2, iM2177a);
            i3++;
            iM2178a3 = i5;
            i6 = i4;
            i4 = iM2177a4;
            i5 = iM2177a3;
        }
        int i7 = this.f3710a[42] + i6;
        int i8 = iM2178a3 + this.f3710a[43];
        m2179a(i7, bArr2, i2);
        m2179a(i4, bArr2, i2 + 4);
        m2179a(i8, bArr2, i2 + 8);
        m2179a(i5, bArr2, i2 + 12);
        return 16;
    }

    /* JADX INFO: renamed from: c */
    private int m2183c(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iM2178a = m2178a(bArr, i);
        int iM2178a2 = m2178a(bArr, i + 4);
        int iM2178a3 = m2178a(bArr, i + 8);
        int iM2178a4 = m2178a(bArr, i + 12);
        int i3 = iM2178a3 - this.f3710a[43];
        int i4 = iM2178a - this.f3710a[42];
        int i5 = iM2178a2;
        int i6 = 20;
        while (i6 > 0) {
            int iM2177a = m2177a(((i4 * 2) + 1) * i4, 5);
            int iM2177a2 = m2177a(((i3 * 2) + 1) * i3, 5);
            int iM2181b = m2181b(i5 - this.f3710a[(i6 * 2) + 1], iM2177a) ^ iM2177a2;
            int iM2181b2 = iM2177a ^ m2181b(iM2178a4 - this.f3710a[i6 * 2], iM2177a2);
            i6--;
            i5 = i4;
            iM2178a4 = i3;
            i4 = iM2181b2;
            i3 = iM2181b;
        }
        int i7 = iM2178a4 - this.f3710a[1];
        int i8 = i5 - this.f3710a[0];
        m2179a(i4, bArr2, i2);
        m2179a(i8, bArr2, i2 + 4);
        m2179a(i3, bArr2, i2 + 8);
        m2179a(i7, bArr2, i2 + 12);
        return 16;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.f3710a == null) {
            throw new IllegalStateException("RC6 engine not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new C1163o("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new C0803ac("output buffer too short");
        }
        return this.f3711b ? m2182b(bArr, i, bArr2, i2) : m2183c(bArr, i, bArr2, i2);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final String mo2123a() {
        return "RC6";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final void mo2124a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (!(interfaceC1003i instanceof C1076ba)) {
            throw new IllegalArgumentException("invalid parameter passed to RC6 init - " + interfaceC1003i.getClass().getName());
        }
        this.f3711b = z;
        m2180a(((C1076ba) interfaceC1003i).m2603a());
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
}
