package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.InterfaceC0813am;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: renamed from: org.bouncycastle.b.e.au */
/* JADX INFO: loaded from: classes.dex */
public class C0912au implements InterfaceC0813am {

    /* JADX INFO: renamed from: a */
    protected static final byte[] f3771a;

    /* JADX INFO: renamed from: b */
    protected static final byte[] f3772b;

    /* JADX INFO: renamed from: f */
    private static final int[] f3773f;

    /* JADX INFO: renamed from: c */
    protected int f3774c;

    /* JADX INFO: renamed from: d */
    protected int[] f3775d;

    /* JADX INFO: renamed from: e */
    protected int[] f3776e;

    /* JADX INFO: renamed from: g */
    private int f3777g;

    /* JADX INFO: renamed from: h */
    private byte[] f3778h;

    /* JADX INFO: renamed from: i */
    private boolean f3779i;

    /* JADX INFO: renamed from: j */
    private int f3780j;

    /* JADX INFO: renamed from: k */
    private int f3781k;

    /* JADX INFO: renamed from: l */
    private int f3782l;

    public C0912au() {
        this((byte) 0);
    }

    private C0912au(byte b) {
        this.f3777g = 0;
        this.f3775d = new int[16];
        this.f3776e = new int[16];
        this.f3778h = new byte[64];
        this.f3779i = false;
        this.f3774c = 20;
    }

    /* JADX INFO: renamed from: a */
    protected static int m2223a(int i, int i2) {
        return (i << i2) | (i >>> (-i2));
    }

    /* JADX INFO: renamed from: a */
    protected static void m2224a(int i, int[] iArr) {
        int i2 = (i - 16) / 4;
        iArr[0] = f3773f[i2];
        iArr[1] = f3773f[i2 + 1];
        iArr[2] = f3773f[i2 + 2];
        iArr[3] = f3773f[i2 + 3];
    }

    /* JADX INFO: renamed from: b */
    public static void m2225b(int i, int[] iArr, int[] iArr2) {
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        int iM2223a = iArr[0];
        int iM2223a2 = iArr[1];
        int iM2223a3 = iArr[2];
        int iM2223a4 = iArr[3];
        int iM2223a5 = iArr[4];
        int iM2223a6 = iArr[5];
        int iM2223a7 = iArr[6];
        int iM2223a8 = iArr[7];
        int iM2223a9 = iArr[8];
        int iM2223a10 = iArr[9];
        int iM2223a11 = iArr[10];
        int iM2223a12 = iArr[11];
        int iM2223a13 = iArr[12];
        int iM2223a14 = iArr[13];
        int iM2223a15 = iArr[14];
        int iM2223a16 = iArr[15];
        while (i > 0) {
            int iM2223a17 = iM2223a5 ^ m2223a(iM2223a + iM2223a13, 7);
            int iM2223a18 = iM2223a9 ^ m2223a(iM2223a17 + iM2223a, 9);
            int iM2223a19 = iM2223a13 ^ m2223a(iM2223a18 + iM2223a17, 13);
            int iM2223a20 = iM2223a ^ m2223a(iM2223a19 + iM2223a18, 18);
            int iM2223a21 = iM2223a10 ^ m2223a(iM2223a6 + iM2223a2, 7);
            int iM2223a22 = iM2223a14 ^ m2223a(iM2223a21 + iM2223a6, 9);
            int iM2223a23 = iM2223a2 ^ m2223a(iM2223a22 + iM2223a21, 13);
            int iM2223a24 = iM2223a6 ^ m2223a(iM2223a23 + iM2223a22, 18);
            int iM2223a25 = iM2223a15 ^ m2223a(iM2223a11 + iM2223a7, 7);
            int iM2223a26 = iM2223a3 ^ m2223a(iM2223a25 + iM2223a11, 9);
            int iM2223a27 = iM2223a7 ^ m2223a(iM2223a26 + iM2223a25, 13);
            int iM2223a28 = iM2223a11 ^ m2223a(iM2223a27 + iM2223a26, 18);
            int iM2223a29 = iM2223a4 ^ m2223a(iM2223a16 + iM2223a12, 7);
            int iM2223a30 = iM2223a8 ^ m2223a(iM2223a29 + iM2223a16, 9);
            int iM2223a31 = iM2223a12 ^ m2223a(iM2223a30 + iM2223a29, 13);
            int iM2223a32 = iM2223a16 ^ m2223a(iM2223a31 + iM2223a30, 18);
            iM2223a2 = iM2223a23 ^ m2223a(iM2223a20 + iM2223a29, 7);
            iM2223a3 = iM2223a26 ^ m2223a(iM2223a2 + iM2223a20, 9);
            iM2223a4 = iM2223a29 ^ m2223a(iM2223a3 + iM2223a2, 13);
            iM2223a = iM2223a20 ^ m2223a(iM2223a4 + iM2223a3, 18);
            iM2223a7 = iM2223a27 ^ m2223a(iM2223a24 + iM2223a17, 7);
            iM2223a8 = iM2223a30 ^ m2223a(iM2223a7 + iM2223a24, 9);
            iM2223a5 = iM2223a17 ^ m2223a(iM2223a8 + iM2223a7, 13);
            iM2223a6 = iM2223a24 ^ m2223a(iM2223a5 + iM2223a8, 18);
            iM2223a12 = iM2223a31 ^ m2223a(iM2223a28 + iM2223a21, 7);
            iM2223a9 = iM2223a18 ^ m2223a(iM2223a12 + iM2223a28, 9);
            iM2223a10 = iM2223a21 ^ m2223a(iM2223a9 + iM2223a12, 13);
            iM2223a11 = iM2223a28 ^ m2223a(iM2223a10 + iM2223a9, 18);
            iM2223a13 = iM2223a19 ^ m2223a(iM2223a32 + iM2223a25, 7);
            iM2223a14 = iM2223a22 ^ m2223a(iM2223a13 + iM2223a32, 9);
            iM2223a15 = iM2223a25 ^ m2223a(iM2223a14 + iM2223a13, 13);
            iM2223a16 = iM2223a32 ^ m2223a(iM2223a15 + iM2223a14, 18);
            i -= 2;
        }
        iArr2[0] = iM2223a + iArr[0];
        iArr2[1] = iM2223a2 + iArr[1];
        iArr2[2] = iM2223a3 + iArr[2];
        iArr2[3] = iM2223a4 + iArr[3];
        iArr2[4] = iM2223a5 + iArr[4];
        iArr2[5] = iM2223a6 + iArr[5];
        iArr2[6] = iM2223a7 + iArr[6];
        iArr2[7] = iM2223a8 + iArr[7];
        iArr2[8] = iM2223a9 + iArr[8];
        iArr2[9] = iM2223a10 + iArr[9];
        iArr2[10] = iM2223a11 + iArr[10];
        iArr2[11] = iM2223a12 + iArr[11];
        iArr2[12] = iM2223a13 + iArr[12];
        iArr2[13] = iM2223a14 + iArr[13];
        iArr2[14] = iM2223a15 + iArr[14];
        iArr2[15] = iM2223a16 + iArr[15];
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public String mo1911a() {
        return this.f3774c != 20 ? "Salsa20/" + this.f3774c : "Salsa20";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final void mo1912a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (!(interfaceC1003i instanceof C1080be)) {
            throw new IllegalArgumentException(mo1911a() + " Init parameters must include an IV");
        }
        C1080be c1080be = (C1080be) interfaceC1003i;
        byte[] bArrM2611a = c1080be.m2611a();
        if (bArrM2611a == null || bArrM2611a.length != mo2228b()) {
            throw new IllegalArgumentException(mo1911a() + " requires exactly " + mo2228b() + " bytes of IV");
        }
        InterfaceC1003i interfaceC1003iM2612b = c1080be.m2612b();
        if (interfaceC1003iM2612b == null) {
            if (!this.f3779i) {
                throw new IllegalStateException(mo1911a() + " KeyParameter can not be null for first initialisation");
            }
            mo2227a((byte[]) null, bArrM2611a);
        } else {
            if (!(interfaceC1003iM2612b instanceof C1076ba)) {
                throw new IllegalArgumentException(mo1911a() + " Init parameters must contain a KeyParameter (or null for re-init)");
            }
            mo2227a(((C1076ba) interfaceC1003iM2612b).m2603a(), bArrM2611a);
        }
        mo1913c();
        this.f3779i = true;
    }

    /* JADX INFO: renamed from: a */
    protected void mo2226a(byte[] bArr) {
        m2225b(this.f3774c, this.f3775d, this.f3776e);
        AbstractC1556g.m4140a(this.f3776e, bArr, 0);
    }

    /* JADX INFO: renamed from: a */
    protected void mo2227a(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(mo1911a() + " requires 128 bit or 256 bit key");
            }
            int length = (bArr.length - 16) / 4;
            this.f3775d[0] = f3773f[length];
            this.f3775d[5] = f3773f[length + 1];
            this.f3775d[10] = f3773f[length + 2];
            this.f3775d[15] = f3773f[length + 3];
            AbstractC1556g.m4138a(bArr, 0, this.f3775d, 1, 4);
            AbstractC1556g.m4138a(bArr, bArr.length - 16, this.f3775d, 11, 4);
        }
        AbstractC1556g.m4138a(bArr2, 0, this.f3775d, 6, 2);
    }

    /* JADX INFO: renamed from: b */
    protected int mo2228b() {
        return 8;
    }

    /* JADX INFO: renamed from: d */
    protected void mo2229d() {
        int[] iArr = this.f3775d;
        int i = iArr[8] + 1;
        iArr[8] = i;
        if (i == 0) {
            int[] iArr2 = this.f3775d;
            iArr2[9] = iArr2[9] + 1;
        }
    }

    /* JADX INFO: renamed from: e */
    protected void mo2230e() {
        int[] iArr = this.f3775d;
        this.f3775d[9] = 0;
        iArr[8] = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo1909a(byte[] r5, int r6, int r7, byte[] r8, int r9) {
        /*
            r4 = this;
            r0 = 0
            boolean r1 = r4.f3779i
            if (r1 != 0) goto L22
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.mo1911a()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " not initialised"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L22:
            int r1 = r6 + r7
            int r2 = r5.length
            if (r1 <= r2) goto L2f
            org.bouncycastle.b.o r0 = new org.bouncycastle.b.o
            java.lang.String r1 = "input buffer too short"
            r0.<init>(r1)
            throw r0
        L2f:
            int r1 = r9 + r7
            int r2 = r8.length
            if (r1 <= r2) goto L3c
            org.bouncycastle.b.ac r0 = new org.bouncycastle.b.ac
            java.lang.String r1 = "output buffer too short"
            r0.<init>(r1)
            throw r0
        L3c:
            int r1 = r4.f3780j
            int r1 = r1 + r7
            r4.f3780j = r1
            int r1 = r4.f3780j
            if (r1 >= r7) goto L68
            int r1 = r4.f3780j
            if (r1 < 0) goto L68
            int r1 = r4.f3781k
            int r1 = r1 + 1
            r4.f3781k = r1
            if (r1 != 0) goto L68
            int r1 = r4.f3782l
            int r1 = r1 + 1
            r4.f3782l = r1
            r1 = r1 & 32
            if (r1 == 0) goto L66
            r1 = 1
        L5c:
            if (r1 == 0) goto L6a
            org.bouncycastle.b.ab r0 = new org.bouncycastle.b.ab
            java.lang.String r1 = "2^70 byte limit per IV would be exceeded; Change IV"
            r0.<init>(r1)
            throw r0
        L66:
            r1 = r0
            goto L5c
        L68:
            r1 = r0
            goto L5c
        L6a:
            if (r0 >= r7) goto L93
            int r1 = r0 + r9
            byte[] r2 = r4.f3778h
            int r3 = r4.f3777g
            r2 = r2[r3]
            int r3 = r0 + r6
            r3 = r5[r3]
            r2 = r2 ^ r3
            byte r2 = (byte) r2
            r8[r1] = r2
            int r1 = r4.f3777g
            int r1 = r1 + 1
            r1 = r1 & 63
            r4.f3777g = r1
            int r1 = r4.f3777g
            if (r1 != 0) goto L90
            r4.mo2229d()
            byte[] r1 = r4.f3778h
            r4.mo2226a(r1)
        L90:
            int r0 = r0 + 1
            goto L6a
        L93:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.p083b.p089e.C0912au.mo1909a(byte[], int, int, byte[], int):int");
    }

    @Override // org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: c */
    public final void mo1913c() {
        this.f3777g = 0;
        this.f3780j = 0;
        this.f3781k = 0;
        this.f3782l = 0;
        mo2230e();
        mo2226a(this.f3778h);
    }

    static {
        byte[] bArrM4168d = C1560k.m4168d("expand 16-byte kexpand 32-byte k");
        int[] iArr = new int[8];
        int i = 0;
        int i2 = 0;
        while (i < 8) {
            iArr[i] = AbstractC1556g.m4152c(bArrM4168d, i2);
            i++;
            i2 += 4;
        }
        f3773f = iArr;
        f3771a = C1560k.m4168d("expand 32-byte k");
        f3772b = C1560k.m4168d("expand 16-byte k");
    }
}
