package p000a.p006d.p010d.p011a;

import p000a.InterfaceC0267h;
import p000a.p006d.p010d.AbstractC0068a;
import p000a.p006d.p010d.AbstractC0103c;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.d.a.p */
/* JADX INFO: compiled from: SmbComReadAndX.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0086p extends AbstractC0068a {

    /* JADX INFO: renamed from: n */
    int f396n;

    /* JADX INFO: renamed from: o */
    int f397o;

    /* JADX INFO: renamed from: p */
    int f398p;

    /* JADX INFO: renamed from: q */
    int f399q;

    /* JADX INFO: renamed from: r */
    private long f400r;

    /* JADX INFO: renamed from: s */
    private int f401s;

    public C0086p(InterfaceC0267h interfaceC0267h, int i, long j, int i2) {
        super(interfaceC0267h, (byte) 46, (AbstractC0103c) null);
        this.f401s = i;
        this.f400r = j;
        this.f398p = i2;
        this.f397o = i2;
        this.f396n = -1;
    }

    /* JADX INFO: renamed from: j */
    public final void m294j(int i) {
        this.f397o = i;
    }

    /* JADX INFO: renamed from: W */
    public final void m292W() {
        this.f398p = 1024;
    }

    /* JADX INFO: renamed from: k */
    public final void m295k(int i) {
        this.f396n = i;
    }

    /* JADX INFO: renamed from: X */
    public final void m293X() {
        this.f399q = 1024;
    }

    @Override // p000a.p006d.p010d.AbstractC0068a
    /* JADX INFO: renamed from: a */
    protected final int mo248a(InterfaceC0267h interfaceC0267h, byte b) {
        if (b == 4) {
            return interfaceC0267h.mo32a("ReadAndX.Close");
        }
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: f */
    protected final int mo253f(byte[] bArr, int i) {
        C0173a.m510a(this.f401s, bArr, i);
        int i2 = i + 2;
        C0173a.m512b(this.f400r, bArr, i2);
        int i3 = i2 + 4;
        C0173a.m510a(this.f397o, bArr, i3);
        int i4 = i3 + 2;
        C0173a.m510a(this.f398p, bArr, i4);
        int i5 = i4 + 2;
        C0173a.m512b(this.f396n, bArr, i5);
        int i6 = i5 + 4;
        C0173a.m510a(this.f399q, bArr, i6);
        int i7 = i6 + 2;
        C0173a.m512b(this.f400r >> 32, bArr, i7);
        return (i7 + 4) - i;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: g */
    protected final int mo254g(byte[] bArr, int i) {
        return 0;
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

    @Override // p000a.p006d.p010d.AbstractC0068a, p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("SmbComReadAndX[" + super.toString() + ",fid=" + this.f401s + ",offset=" + this.f400r + ",maxCount=" + this.f397o + ",minCount=" + this.f398p + ",openTimeout=" + this.f396n + ",remaining=" + this.f399q + ",offset=" + this.f400r + "]");
    }
}
