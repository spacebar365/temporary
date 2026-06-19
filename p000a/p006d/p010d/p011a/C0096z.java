package p000a.p006d.p010d.p011a;

import p000a.InterfaceC0267h;
import p000a.p006d.p010d.AbstractC0068a;
import p000a.p006d.p010d.AbstractC0103c;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.d.a.z */
/* JADX INFO: compiled from: SmbComWriteAndX.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0096z extends AbstractC0068a {

    /* JADX INFO: renamed from: n */
    private int f439n;

    /* JADX INFO: renamed from: o */
    private int f440o;

    /* JADX INFO: renamed from: p */
    private int f441p;

    /* JADX INFO: renamed from: q */
    private int f442q;

    /* JADX INFO: renamed from: r */
    private int f443r;

    /* JADX INFO: renamed from: s */
    private byte[] f444s;

    /* JADX INFO: renamed from: t */
    private long f445t;

    /* JADX INFO: renamed from: u */
    private int f446u;

    /* JADX INFO: renamed from: v */
    private int f447v;

    public C0096z(InterfaceC0267h interfaceC0267h) {
        super(interfaceC0267h, (byte) 47, (AbstractC0103c) null);
    }

    /* JADX INFO: renamed from: a */
    public final void m311a(int i, long j, int i2, byte[] bArr, int i3, int i4) {
        this.f439n = i;
        this.f445t = j;
        this.f440o = i2;
        this.f444s = bArr;
        this.f443r = i3;
        this.f441p = i4;
        this.f494m = null;
    }

    /* JADX INFO: renamed from: j */
    public final void m312j(int i) {
        this.f447v = i;
    }

    @Override // p000a.p006d.p010d.AbstractC0068a
    /* JADX INFO: renamed from: a */
    protected final int mo248a(InterfaceC0267h interfaceC0267h, byte b) {
        if (b == 46) {
            return interfaceC0267h.mo32a("WriteAndX.ReadAndX");
        }
        if (b == 4) {
            return interfaceC0267h.mo32a("WriteAndX.Close");
        }
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: f */
    protected final int mo253f(byte[] bArr, int i) {
        this.f442q = (i - this.f482a) + 26;
        this.f446u = (this.f442q - this.f482a) % 4;
        this.f446u = this.f446u == 0 ? 0 : 4 - this.f446u;
        this.f442q += this.f446u;
        C0173a.m510a(this.f439n, bArr, i);
        int i2 = i + 2;
        C0173a.m512b(this.f445t, bArr, i2);
        int i3 = i2 + 4;
        int i4 = 0;
        while (i4 < 4) {
            bArr[i3] = -1;
            i4++;
            i3++;
        }
        C0173a.m510a(this.f447v, bArr, i3);
        int i5 = i3 + 2;
        C0173a.m510a(this.f440o, bArr, i5);
        int i6 = i5 + 2;
        int i7 = i6 + 1;
        bArr[i6] = 0;
        int i8 = i7 + 1;
        bArr[i7] = 0;
        C0173a.m510a(this.f441p, bArr, i8);
        int i9 = i8 + 2;
        C0173a.m510a(this.f442q, bArr, i9);
        int i10 = i9 + 2;
        C0173a.m512b(this.f445t >> 32, bArr, i10);
        return (i10 + 4) - i;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: g */
    protected final int mo254g(byte[] bArr, int i) {
        int i2 = i;
        while (true) {
            int i3 = this.f446u;
            this.f446u = i3 - 1;
            if (i3 > 0) {
                bArr[i2] = -18;
                i2++;
            } else {
                System.arraycopy(this.f444s, this.f443r, bArr, i2, this.f441p);
                return (i2 + this.f441p) - i;
            }
        }
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
        return new String("SmbComWriteAndX[" + super.toString() + ",fid=" + this.f439n + ",offset=" + this.f445t + ",writeMode=" + this.f447v + ",remaining=" + this.f440o + ",dataLength=" + this.f441p + ",dataOffset=" + this.f442q + "]");
    }
}
