package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1085bj;

/* JADX INFO: renamed from: org.bouncycastle.b.e.ah */
/* JADX INFO: loaded from: classes.dex */
public final class C0899ah implements InterfaceC0890e {

    /* JADX INFO: renamed from: a */
    private int f3704a = 12;

    /* JADX INFO: renamed from: b */
    private int[] f3705b = null;

    /* JADX INFO: renamed from: c */
    private boolean f3706c;

    /* JADX INFO: renamed from: a */
    private static int m2167a(int i, int i2) {
        return (i << (i2 & 31)) | (i >>> (32 - (i2 & 31)));
    }

    /* JADX INFO: renamed from: a */
    private static int m2168a(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX INFO: renamed from: a */
    private static void m2169a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
    }

    /* JADX INFO: renamed from: a */
    private void m2170a(byte[] bArr) {
        int[] iArr = new int[(bArr.length + 3) / 4];
        for (int i = 0; i != bArr.length; i++) {
            int i2 = i / 4;
            iArr[i2] = iArr[i2] + ((bArr[i] & 255) << ((i % 4) * 8));
        }
        this.f3705b = new int[(this.f3704a + 1) * 2];
        this.f3705b[0] = -1209970333;
        for (int i3 = 1; i3 < this.f3705b.length; i3++) {
            this.f3705b[i3] = r2[i3 - 1] - 1640531527;
        }
        int length = iArr.length > this.f3705b.length ? iArr.length * 3 : this.f3705b.length * 3;
        int length2 = 0;
        int length3 = 0;
        int iM2167a = 0;
        int iM2167a2 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int[] iArr2 = this.f3705b;
            iM2167a2 = m2167a(iM2167a2 + iArr2[length3] + iM2167a, 3);
            iArr2[length3] = iM2167a2;
            iM2167a = m2167a(iArr[length2] + iM2167a2 + iM2167a, iM2167a + iM2167a2);
            iArr[length2] = iM2167a;
            length3 = (length3 + 1) % this.f3705b.length;
            length2 = (length2 + 1) % iArr.length;
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m2171b(int i, int i2) {
        return (i >>> (i2 & 31)) | (i << (32 - (i2 & 31)));
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final String mo2123a() {
        return "RC5-32";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final void mo2124a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (interfaceC1003i instanceof C1085bj) {
            C1085bj c1085bj = (C1085bj) interfaceC1003i;
            this.f3704a = c1085bj.m2621b();
            m2170a(c1085bj.m2620a());
        } else {
            if (!(interfaceC1003i instanceof C1076ba)) {
                throw new IllegalArgumentException("invalid parameter passed to RC532 init - " + interfaceC1003i.getClass().getName());
            }
            m2170a(((C1076ba) interfaceC1003i).m2603a());
        }
        this.f3706c = z;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return 8;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: c */
    public final void mo2126c() {
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.f3706c) {
            int iM2168a = m2168a(bArr, i) + this.f3705b[0];
            int iM2168a2 = m2168a(bArr, i + 4) + this.f3705b[1];
            for (int i3 = 1; i3 <= this.f3704a; i3++) {
                iM2168a = m2167a(iM2168a ^ iM2168a2, iM2168a2) + this.f3705b[i3 * 2];
                iM2168a2 = m2167a(iM2168a2 ^ iM2168a, iM2168a) + this.f3705b[(i3 * 2) + 1];
            }
            m2169a(iM2168a, bArr2, i2);
            m2169a(iM2168a2, bArr2, i2 + 4);
        } else {
            int iM2168a3 = m2168a(bArr, i);
            int iM2168a4 = m2168a(bArr, i + 4);
            for (int i4 = this.f3704a; i4 > 0; i4--) {
                iM2168a4 = m2171b(iM2168a4 - this.f3705b[(i4 * 2) + 1], iM2168a3) ^ iM2168a3;
                iM2168a3 = m2171b(iM2168a3 - this.f3705b[i4 * 2], iM2168a4) ^ iM2168a4;
            }
            m2169a(iM2168a3 - this.f3705b[0], bArr2, i2);
            m2169a(iM2168a4 - this.f3705b[1], bArr2, i2 + 4);
        }
        return 8;
    }
}
