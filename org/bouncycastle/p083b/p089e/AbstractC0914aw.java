package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;

/* JADX INFO: renamed from: org.bouncycastle.b.e.aw */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0914aw implements InterfaceC0890e {

    /* JADX INFO: renamed from: a */
    protected boolean f3783a;

    /* JADX INFO: renamed from: b */
    protected int[] f3784b;

    /* JADX INFO: renamed from: c */
    protected int f3785c;

    /* JADX INFO: renamed from: d */
    protected int f3786d;

    /* JADX INFO: renamed from: e */
    protected int f3787e;

    /* JADX INFO: renamed from: f */
    protected int f3788f;

    AbstractC0914aw() {
    }

    /* JADX INFO: renamed from: a */
    protected static int m2234a(int i, int i2) {
        return (i << i2) | (i >>> (-i2));
    }

    /* JADX INFO: renamed from: b */
    private static int m2235b(int i, int i2) {
        return (i >>> i2) | (i << (-i2));
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.f3784b == null) {
            throw new IllegalStateException(mo2123a() + " not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new C1163o("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new C0803ac("output buffer too short");
        }
        if (this.f3783a) {
            mo2232b(bArr, i, bArr2, i2);
            return 16;
        }
        mo2233c(bArr, i, bArr2, i2);
        return 16;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public String mo2123a() {
        return "Serpent";
    }

    /* JADX INFO: renamed from: a */
    protected final void m2236a(int i, int i2, int i3, int i4) {
        int i5 = i ^ i4;
        int i6 = i3 ^ i5;
        int i7 = i2 ^ i6;
        this.f3788f = (i & i4) ^ i7;
        int i8 = (i5 & i2) ^ i;
        this.f3787e = i7 ^ (i3 | i8);
        int i9 = this.f3788f & (i6 ^ i8);
        this.f3786d = (i6 ^ (-1)) ^ i9;
        this.f3785c = (i8 ^ (-1)) ^ i9;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final void mo2124a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (!(interfaceC1003i instanceof C1076ba)) {
            throw new IllegalArgumentException("invalid parameter passed to " + mo2123a() + " init - " + interfaceC1003i.getClass().getName());
        }
        this.f3783a = z;
        this.f3784b = mo2231a(((C1076ba) interfaceC1003i).m2603a());
    }

    /* JADX INFO: renamed from: a */
    protected abstract int[] mo2231a(byte[] bArr);

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return 16;
    }

    /* JADX INFO: renamed from: b */
    protected final void m2237b(int i, int i2, int i3, int i4) {
        int i5 = i ^ (-1);
        int i6 = i ^ i2;
        int i7 = (i5 | i6) ^ i4;
        int i8 = i3 ^ i7;
        this.f3787e = i6 ^ i8;
        int i9 = i5 ^ (i6 & i4);
        this.f3786d = (this.f3787e & i9) ^ i7;
        this.f3788f = (i & i7) ^ (this.f3786d | i8);
        this.f3785c = (i9 ^ i8) ^ this.f3788f;
    }

    /* JADX INFO: renamed from: b */
    protected abstract void mo2232b(byte[] bArr, int i, byte[] bArr2, int i2);

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: c */
    public final void mo2126c() {
    }

    /* JADX INFO: renamed from: c */
    protected final void m2238c(int i, int i2, int i3, int i4) {
        int i5 = (i ^ (-1)) ^ i2;
        int i6 = (i | i5) ^ i3;
        this.f3787e = i4 ^ i6;
        int i7 = (i4 | i5) ^ i2;
        int i8 = i5 ^ this.f3787e;
        this.f3788f = (i6 & i7) ^ i8;
        int i9 = i7 ^ i6;
        this.f3786d = this.f3788f ^ i9;
        this.f3785c = (i8 & i9) ^ i6;
    }

    /* JADX INFO: renamed from: c */
    protected abstract void mo2233c(byte[] bArr, int i, byte[] bArr2, int i2);

    /* JADX INFO: renamed from: d */
    protected final void m2239d() {
        int iM2234a = m2234a(this.f3785c, 13);
        int iM2234a2 = m2234a(this.f3787e, 3);
        int i = (this.f3786d ^ iM2234a) ^ iM2234a2;
        int i2 = (this.f3788f ^ iM2234a2) ^ (iM2234a << 3);
        this.f3786d = m2234a(i, 1);
        this.f3788f = m2234a(i2, 7);
        this.f3785c = m2234a((iM2234a ^ this.f3786d) ^ this.f3788f, 5);
        this.f3787e = m2234a((this.f3788f ^ iM2234a2) ^ (this.f3786d << 7), 22);
    }

    /* JADX INFO: renamed from: d */
    protected final void m2240d(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ i4;
        int i6 = (i2 & i5) ^ i;
        int i7 = i5 ^ i6;
        this.f3788f = i3 ^ i7;
        int i8 = (i5 & i6) ^ i2;
        this.f3786d = i6 ^ (this.f3788f | i8);
        int i9 = this.f3786d ^ (-1);
        int i10 = i8 ^ this.f3788f;
        this.f3785c = i9 ^ i10;
        this.f3787e = (i10 | i9) ^ i7;
    }

    /* JADX INFO: renamed from: e */
    protected final void m2241e() {
        int iM2235b = (m2235b(this.f3787e, 22) ^ this.f3788f) ^ (this.f3786d << 7);
        int iM2235b2 = (m2235b(this.f3785c, 5) ^ this.f3786d) ^ this.f3788f;
        int iM2235b3 = m2235b(this.f3788f, 7);
        int iM2235b4 = m2235b(this.f3786d, 1);
        this.f3788f = (iM2235b3 ^ iM2235b) ^ (iM2235b2 << 3);
        this.f3786d = (iM2235b4 ^ iM2235b2) ^ iM2235b;
        this.f3787e = m2235b(iM2235b, 3);
        this.f3785c = m2235b(iM2235b2, 13);
    }

    /* JADX INFO: renamed from: e */
    protected final void m2242e(int i, int i2, int i3, int i4) {
        int i5 = i ^ (-1);
        int i6 = i2 ^ i4;
        this.f3785c = (i3 & i5) ^ i6;
        int i7 = i3 ^ i5;
        int i8 = (this.f3785c ^ i3) & i2;
        this.f3788f = i7 ^ i8;
        this.f3787e = ((i7 | this.f3785c) & (i8 | i4)) ^ i;
        this.f3786d = ((i5 | i4) ^ this.f3787e) ^ (i6 ^ this.f3788f);
    }

    /* JADX INFO: renamed from: f */
    protected final void m2243f(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ i4;
        int i6 = i ^ i3;
        int i7 = i3 ^ i5;
        this.f3785c = (i2 & i7) ^ i6;
        this.f3788f = i5 ^ ((((i5 ^ (-1)) | i) ^ i4) | i6);
        int i8 = i7 ^ (-1);
        int i9 = this.f3785c | this.f3788f;
        this.f3786d = i8 ^ i9;
        this.f3787e = (i8 & i4) ^ (i9 ^ i6);
    }

    /* JADX INFO: renamed from: g */
    protected final void m2244g(int i, int i2, int i3, int i4) {
        int i5 = i ^ i2;
        int i6 = i | i4;
        int i7 = i3 ^ i4;
        int i8 = (i & i3) | (i5 & i6);
        this.f3787e = i7 ^ i8;
        int i9 = i8 ^ (i6 ^ i2);
        this.f3785c = i5 ^ (i7 & i9);
        int i10 = this.f3787e & this.f3785c;
        this.f3786d = i9 ^ i10;
        this.f3788f = (i10 ^ i7) ^ (i2 | i4);
    }

    /* JADX INFO: renamed from: h */
    protected final void m2245h(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ i3;
        int i6 = (i2 & i5) ^ i;
        int i7 = i4 | i6;
        this.f3785c = i5 ^ i7;
        int i8 = (i5 | i7) ^ i4;
        this.f3787e = (i3 ^ i6) ^ i8;
        int i9 = (i | i2) ^ i8;
        this.f3788f = (this.f3785c & i9) ^ i6;
        this.f3786d = (i9 ^ this.f3785c) ^ this.f3788f;
    }

    /* JADX INFO: renamed from: i */
    protected final void m2246i(int i, int i2, int i3, int i4) {
        int i5 = i ^ i4;
        int i6 = (i4 & i5) ^ i3;
        int i7 = i2 | i6;
        this.f3788f = i5 ^ i7;
        int i8 = i2 ^ (-1);
        this.f3785c = (i5 | i8) ^ i6;
        int i9 = i5 ^ i8;
        this.f3787e = (i7 & i9) ^ (this.f3785c & i);
        this.f3786d = (i9 & this.f3787e) ^ (i6 ^ i);
    }

    /* JADX INFO: renamed from: j */
    protected final void m2247j(int i, int i2, int i3, int i4) {
        int i5 = ((i3 | i4) & i) ^ i2;
        int i6 = (i & i5) ^ i3;
        this.f3786d = i4 ^ i6;
        int i7 = i ^ (-1);
        this.f3788f = (i6 & this.f3786d) ^ i5;
        int i8 = (this.f3786d | i7) ^ i4;
        this.f3785c = this.f3788f ^ i8;
        this.f3787e = (i5 & i8) ^ (this.f3786d ^ i7);
    }

    /* JADX INFO: renamed from: k */
    protected final void m2248k(int i, int i2, int i3, int i4) {
        int i5 = i ^ (-1);
        int i6 = i ^ i2;
        int i7 = i ^ i4;
        this.f3785c = (i3 ^ i5) ^ (i6 | i7);
        int i8 = this.f3785c & i4;
        this.f3786d = (this.f3785c ^ i6) ^ i8;
        int i9 = (i5 | this.f3785c) ^ i7;
        this.f3787e = (i6 | i8) ^ i9;
        this.f3788f = (i9 & this.f3786d) ^ (i2 ^ i8);
    }

    /* JADX INFO: renamed from: l */
    protected final void m2249l(int i, int i2, int i3, int i4) {
        int i5 = i3 ^ (-1);
        int i6 = (i2 & i5) ^ i4;
        int i7 = i & i6;
        this.f3788f = (i2 ^ i5) ^ i7;
        int i8 = this.f3788f | i2;
        this.f3786d = i6 ^ (i & i8);
        int i9 = i | i4;
        this.f3785c = (i5 ^ i8) ^ i9;
        this.f3787e = (i2 & i9) ^ ((i ^ i3) | i7);
    }

    /* JADX INFO: renamed from: m */
    protected final void m2250m(int i, int i2, int i3, int i4) {
        int i5 = i ^ i4;
        int i6 = i2 ^ i5;
        int i7 = ((i ^ (-1)) | i5) ^ i3;
        this.f3786d = i2 ^ i7;
        int i8 = (i5 | this.f3786d) ^ i4;
        this.f3787e = (i7 & i8) ^ i6;
        int i9 = i8 ^ i7;
        this.f3785c = this.f3787e ^ i9;
        this.f3788f = (i7 ^ (-1)) ^ (i9 & i6);
    }

    /* JADX INFO: renamed from: n */
    protected final void m2251n(int i, int i2, int i3, int i4) {
        int i5 = i ^ (-1);
        int i6 = i ^ i2;
        int i7 = i3 ^ i6;
        int i8 = (i3 | i5) ^ i4;
        this.f3786d = i7 ^ i8;
        int i9 = i6 ^ (i7 & i8);
        this.f3788f = i8 ^ (i2 | i9);
        int i10 = this.f3788f | i2;
        this.f3785c = i9 ^ i10;
        this.f3787e = (i5 & i4) ^ (i7 ^ i10);
    }

    /* JADX INFO: renamed from: o */
    protected final void m2252o(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ i3;
        int i6 = (i3 & i5) ^ i4;
        int i7 = i ^ i6;
        this.f3786d = ((i4 | i5) & i7) ^ i2;
        int i8 = this.f3786d | i6;
        this.f3788f = i5 ^ (i & i7);
        int i9 = i7 ^ i8;
        this.f3787e = i6 ^ (this.f3788f & i9);
        this.f3785c = (i9 ^ (-1)) ^ (this.f3788f & this.f3787e);
    }

    /* JADX INFO: renamed from: p */
    protected final void m2253p(int i, int i2, int i3, int i4) {
        int i5 = (i & i2) | i3;
        int i6 = (i | i2) & i4;
        this.f3788f = i5 ^ i6;
        int i7 = i6 ^ i2;
        this.f3786d = (((i4 ^ (-1)) ^ this.f3788f) | i7) ^ i;
        this.f3785c = (i7 ^ i3) ^ (this.f3786d | i4);
        this.f3787e = (i5 ^ this.f3786d) ^ (this.f3785c ^ (this.f3788f & i));
    }
}
