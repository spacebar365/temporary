package p000a.p006d.p010d.p011a;

import p000a.InterfaceC0267h;
import p000a.p006d.p010d.AbstractC0103c;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.d.a.y */
/* JADX INFO: compiled from: SmbComWrite.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0095y extends AbstractC0103c {

    /* JADX INFO: renamed from: n */
    private int f433n;

    /* JADX INFO: renamed from: o */
    private int f434o;

    /* JADX INFO: renamed from: p */
    private int f435p;

    /* JADX INFO: renamed from: q */
    private int f436q;

    /* JADX INFO: renamed from: r */
    private int f437r;

    /* JADX INFO: renamed from: s */
    private byte[] f438s;

    public C0095y(InterfaceC0267h interfaceC0267h) {
        super(interfaceC0267h, (byte) 11);
    }

    /* JADX INFO: renamed from: a */
    public final void m310a(int i, long j, int i2, byte[] bArr, int i3, int i4) {
        this.f433n = i;
        this.f435p = (int) (4294967295L & j);
        this.f436q = i2;
        this.f438s = bArr;
        this.f437r = i3;
        this.f434o = i4;
        this.f494m = null;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: f */
    protected final int mo253f(byte[] bArr, int i) {
        C0173a.m510a(this.f433n, bArr, i);
        int i2 = i + 2;
        C0173a.m510a(this.f434o, bArr, i2);
        int i3 = i2 + 2;
        C0173a.m512b(this.f435p, bArr, i3);
        int i4 = i3 + 4;
        C0173a.m510a(this.f436q, bArr, i4);
        return (i4 + 2) - i;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: g */
    protected final int mo254g(byte[] bArr, int i) {
        int i2 = i + 1;
        bArr[i] = 1;
        C0173a.m510a(this.f434o, bArr, i2);
        int i3 = i2 + 2;
        System.arraycopy(this.f438s, this.f437r, bArr, i3, this.f434o);
        return (i3 + this.f434o) - i;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: h */
    protected final int mo255h(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: i */
    protected final int mo256i(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("SmbComWrite[" + super.toString() + ",fid=" + this.f433n + ",count=" + this.f434o + ",offset=" + this.f435p + ",remaining=" + this.f436q + "]");
    }
}
