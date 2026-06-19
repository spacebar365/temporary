package p000a.p006d.p010d.p011a;

import p000a.InterfaceC0267h;
import p000a.p006d.InterfaceC0177i;
import p000a.p006d.p010d.AbstractC0068a;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.d.a.m */
/* JADX INFO: compiled from: SmbComOpenAndXResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0083m extends AbstractC0068a implements InterfaceC0177i {

    /* JADX INFO: renamed from: n */
    private int f383n;

    /* JADX INFO: renamed from: o */
    private int f384o;

    /* JADX INFO: renamed from: p */
    private int f385p;

    /* JADX INFO: renamed from: q */
    private int f386q;

    /* JADX INFO: renamed from: r */
    private int f387r;

    /* JADX INFO: renamed from: s */
    private int f388s;

    /* JADX INFO: renamed from: t */
    private int f389t;

    /* JADX INFO: renamed from: u */
    private int f390u;

    /* JADX INFO: renamed from: v */
    private long f391v;

    public C0083m(InterfaceC0267h interfaceC0267h) {
        super(interfaceC0267h);
    }

    /* JADX INFO: renamed from: W */
    public final int m289W() {
        return this.f383n;
    }

    /* JADX INFO: renamed from: X */
    public final int m290X() {
        return this.f385p;
    }

    /* JADX INFO: renamed from: Y */
    public final int m291Y() {
        return this.f387r;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: d */
    public final long mo230d() {
        return this.f391v;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: b_ */
    public final long mo228b_() {
        return 0L;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: e */
    public final long mo231e() {
        return 0L;
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
        this.f383n = C0173a.m509a(bArr, i);
        int i2 = i + 2;
        this.f384o = C0173a.m509a(bArr, i2);
        int i3 = i2 + 2;
        this.f391v = C0173a.m517e(bArr, i3);
        int i4 = i3 + 4;
        this.f385p = C0173a.m511b(bArr, i4);
        int i5 = i4 + 4;
        this.f386q = C0173a.m509a(bArr, i5);
        int i6 = i5 + 2;
        this.f387r = C0173a.m509a(bArr, i6);
        int i7 = i6 + 2;
        this.f388s = C0173a.m509a(bArr, i7);
        int i8 = i7 + 2;
        this.f389t = C0173a.m509a(bArr, i8);
        int i9 = i8 + 2;
        this.f390u = C0173a.m511b(bArr, i9);
        return (i9 + 6) - i;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: i */
    protected final int mo256i(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0068a, p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("SmbComOpenAndXResponse[" + super.toString() + ",fid=" + this.f383n + ",fileAttributes=" + this.f384o + ",lastWriteTime=" + this.f391v + ",dataSize=" + this.f385p + ",grantedAccess=" + this.f386q + ",fileType=" + this.f387r + ",deviceState=" + this.f388s + ",action=" + this.f389t + ",serverFid=" + this.f390u + "]");
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: c_ */
    public final long mo229c_() {
        return this.f385p;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: b */
    public final int mo227b() {
        return this.f384o;
    }
}
