package p000a.p006d.p010d.p011a;

import p000a.InterfaceC0267h;
import p000a.p006d.p010d.AbstractC0068a;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.d.a.f */
/* JADX INFO: compiled from: SmbComLockingAndX.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0076f extends AbstractC0068a {

    /* JADX INFO: renamed from: n */
    private int f331n;

    /* JADX INFO: renamed from: o */
    private byte f332o;

    /* JADX INFO: renamed from: p */
    private byte f333p;

    /* JADX INFO: renamed from: q */
    private long f334q;

    /* JADX INFO: renamed from: r */
    private C0069a[] f335r;

    /* JADX INFO: renamed from: s */
    private C0069a[] f336s;

    /* JADX INFO: renamed from: t */
    private boolean f337t;

    public C0076f(InterfaceC0267h interfaceC0267h) {
        super(interfaceC0267h);
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: f */
    protected final int mo253f(byte[] bArr, int i) {
        C0173a.m510a(this.f331n, bArr, i);
        int i2 = i + 2;
        bArr[i2] = this.f332o;
        bArr[i2 + 1] = this.f333p;
        int i3 = i2 + 2;
        C0173a.m512b(this.f334q, bArr, i3);
        int i4 = i3 + 4;
        C0173a.m510a(this.f336s != null ? this.f336s.length : 0L, bArr, i4);
        int i5 = i4 + 2;
        C0173a.m510a(this.f335r != null ? this.f335r.length : 0L, bArr, i5);
        return i - (i5 + 2);
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: h */
    protected final int mo255h(byte[] bArr, int i) {
        this.f331n = C0173a.m509a(bArr, i);
        int i2 = i + 2;
        this.f332o = bArr[i2];
        if ((this.f332o & 16) == 16) {
            this.f337t = true;
        }
        this.f333p = bArr[i2 + 1];
        this.f334q = C0173a.m511b(bArr, r0);
        int i3 = i2 + 2 + 4;
        this.f336s = new C0069a[C0173a.m509a(bArr, i3)];
        int i4 = i3 + 2;
        this.f335r = new C0069a[C0173a.m509a(bArr, i4)];
        return i - (i4 + 2);
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: g */
    protected final int mo254g(byte[] bArr, int i) {
        int iMo199a;
        if (this.f336s != null) {
            iMo199a = i;
            for (C0069a c0069a : this.f336s) {
                iMo199a += c0069a.mo199a(bArr, iMo199a);
            }
        } else {
            iMo199a = i;
        }
        if (this.f335r != null) {
            for (C0069a c0069a2 : this.f335r) {
                iMo199a += c0069a2.mo199a(bArr, iMo199a);
            }
        }
        return i - iMo199a;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: i */
    protected final int mo256i(byte[] bArr, int i) {
        int iMo201a = i;
        for (int i2 = 0; i2 < this.f336s.length; i2++) {
            this.f336s[i2] = m261W();
            iMo201a += this.f336s[i2].mo201a(bArr, iMo201a, bArr.length);
        }
        for (int i3 = 0; i3 < this.f335r.length; i3++) {
            this.f335r[i3] = m261W();
            iMo201a += this.f335r[i3].mo201a(bArr, iMo201a, bArr.length);
        }
        return i - iMo201a;
    }

    /* JADX INFO: renamed from: W */
    private C0069a m261W() {
        return new C0069a(this.f337t);
    }

    @Override // p000a.p006d.p010d.AbstractC0068a, p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("SmbComLockingAndX[" + super.toString() + ",fid=" + this.f331n + ",typeOfLock=" + ((int) this.f332o) + ",newOplockLevel=" + ((int) this.f333p) + "]");
    }
}
