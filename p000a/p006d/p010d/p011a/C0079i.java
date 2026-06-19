package p000a.p006d.p010d.p011a;

import java.util.Date;
import p000a.InterfaceC0267h;
import p000a.p006d.InterfaceC0177i;
import p000a.p006d.p010d.AbstractC0068a;
import p000a.p006d.p025f.C0173a;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.d.d.a.i */
/* JADX INFO: compiled from: SmbComNTCreateAndXResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0079i extends AbstractC0068a implements InterfaceC0177i {

    /* JADX INFO: renamed from: A */
    private boolean f349A;

    /* JADX INFO: renamed from: n */
    private byte f350n;

    /* JADX INFO: renamed from: o */
    private int f351o;

    /* JADX INFO: renamed from: p */
    private int f352p;

    /* JADX INFO: renamed from: q */
    private int f353q;

    /* JADX INFO: renamed from: r */
    private int f354r;

    /* JADX INFO: renamed from: s */
    private int f355s;

    /* JADX INFO: renamed from: t */
    private long f356t;

    /* JADX INFO: renamed from: u */
    private long f357u;

    /* JADX INFO: renamed from: v */
    private long f358v;

    /* JADX INFO: renamed from: w */
    private long f359w;

    /* JADX INFO: renamed from: x */
    private long f360x;

    /* JADX INFO: renamed from: y */
    private long f361y;

    /* JADX INFO: renamed from: z */
    private boolean f362z;

    public C0079i(InterfaceC0267h interfaceC0267h) {
        super(interfaceC0267h);
    }

    /* JADX INFO: renamed from: W */
    public final int m263W() {
        return this.f354r;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m264X() {
        return this.f349A;
    }

    /* JADX INFO: renamed from: Y */
    public final void m265Y() {
        this.f349A = true;
    }

    /* JADX INFO: renamed from: Z */
    public final int m266Z() {
        return this.f351o;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: e */
    public final long mo231e() {
        return this.f357u;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: d */
    public final long mo230d() {
        return this.f358v;
    }

    /* JADX INFO: renamed from: aa */
    public final long m267aa() {
        return this.f361y;
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
        int i2 = i + 1;
        this.f350n = bArr[i];
        this.f351o = C0173a.m509a(bArr, i2);
        int i3 = i2 + 2;
        this.f352p = C0173a.m511b(bArr, i3);
        int i4 = i3 + 4;
        this.f356t = C0173a.m515d(bArr, i4);
        int i5 = i4 + 8;
        this.f357u = C0173a.m515d(bArr, i5);
        int i6 = i5 + 8;
        this.f358v = C0173a.m515d(bArr, i6);
        int i7 = i6 + 8;
        this.f359w = C0173a.m515d(bArr, i7);
        int i8 = i7 + 8;
        this.f353q = C0173a.m511b(bArr, i8);
        int i9 = i8 + 4;
        this.f360x = C0173a.m513c(bArr, i9);
        int i10 = i9 + 8;
        this.f361y = C0173a.m513c(bArr, i10);
        int i11 = i10 + 8;
        this.f354r = C0173a.m509a(bArr, i11);
        int i12 = i11 + 2;
        this.f355s = C0173a.m509a(bArr, i12);
        int i13 = i12 + 2;
        int i14 = i13 + 1;
        this.f362z = (bArr[i13] & 255) > 0;
        return i14 - i;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: i */
    protected final int mo256i(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0068a, p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("SmbComNTCreateAndXResponse[" + super.toString() + ",oplockLevel=" + ((int) this.f350n) + ",fid=" + this.f351o + ",createAction=0x" + C0284e.m947a(this.f352p, 4) + ",creationTime=" + new Date(this.f356t) + ",lastAccessTime=" + new Date(this.f357u) + ",lastWriteTime=" + new Date(this.f358v) + ",changeTime=" + new Date(this.f359w) + ",extFileAttributes=0x" + C0284e.m947a(this.f353q, 4) + ",allocationSize=" + this.f360x + ",endOfFile=" + this.f361y + ",fileType=" + this.f354r + ",deviceState=" + this.f355s + ",directory=" + this.f362z + "]");
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: b */
    public final int mo227b() {
        return this.f353q;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: b_ */
    public final long mo228b_() {
        return this.f356t;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: c_ */
    public final long mo229c_() {
        return this.f361y;
    }
}
