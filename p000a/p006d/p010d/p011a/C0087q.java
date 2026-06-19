package p000a.p006d.p010d.p011a;

import p000a.InterfaceC0267h;
import p000a.p006d.p010d.AbstractC0068a;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.d.a.q */
/* JADX INFO: compiled from: SmbComReadAndXResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0087q extends AbstractC0068a {

    /* JADX INFO: renamed from: n */
    private byte[] f402n;

    /* JADX INFO: renamed from: o */
    private int f403o;

    /* JADX INFO: renamed from: p */
    private int f404p;

    /* JADX INFO: renamed from: q */
    private int f405q;

    /* JADX INFO: renamed from: r */
    private int f406r;

    public C0087q(InterfaceC0267h interfaceC0267h, byte[] bArr, int i) {
        super(interfaceC0267h);
        this.f402n = bArr;
        this.f403o = i;
    }

    /* JADX INFO: renamed from: W */
    public final byte[] m296W() {
        return this.f402n;
    }

    /* JADX INFO: renamed from: X */
    public final int m297X() {
        return this.f403o;
    }

    /* JADX INFO: renamed from: j */
    public final void m300j(int i) {
        this.f403o += i;
    }

    /* JADX INFO: renamed from: Y */
    public final int m298Y() {
        return this.f405q;
    }

    /* JADX INFO: renamed from: Z */
    public final int m299Z() {
        return this.f406r;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: f */
    protected final int mo253f(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: g */
    protected final int mo254g(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: h */
    protected final int mo255h(byte[] bArr, int i) {
        int i2 = i + 2;
        this.f404p = C0173a.m509a(bArr, i2);
        int i3 = i2 + 4;
        this.f405q = C0173a.m509a(bArr, i3);
        int i4 = i3 + 2;
        this.f406r = C0173a.m509a(bArr, i4);
        return (i4 + 12) - i;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: i */
    protected final int mo256i(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0068a, p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("SmbComReadAndXResponse[" + super.toString() + ",dataCompactionMode=" + this.f404p + ",dataLength=" + this.f405q + ",dataOffset=" + this.f406r + "]");
    }
}
