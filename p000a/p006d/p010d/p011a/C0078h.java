package p000a.p006d.p010d.p011a;

import p000a.InterfaceC0016c;
import p000a.InterfaceC0267h;
import p000a.p006d.InterfaceC0067d;
import p000a.p006d.InterfaceC0126e;
import p000a.p006d.p010d.AbstractC0068a;
import p000a.p006d.p010d.AbstractC0103c;
import p000a.p006d.p025f.C0173a;
import p000a.p031i.C0284e;
import p000a.p031i.p032a.InterfaceC0278e;

/* JADX INFO: renamed from: a.d.d.a.h */
/* JADX INFO: compiled from: SmbComNTCreateAndX.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0078h extends AbstractC0068a implements InterfaceC0126e<C0079i> {

    /* JADX INFO: renamed from: n */
    private int f338n;

    /* JADX INFO: renamed from: o */
    private int f339o;

    /* JADX INFO: renamed from: p */
    private int f340p;

    /* JADX INFO: renamed from: q */
    private int f341q;

    /* JADX INFO: renamed from: r */
    private int f342r;

    /* JADX INFO: renamed from: s */
    private int f343s;

    /* JADX INFO: renamed from: t */
    private long f344t;

    /* JADX INFO: renamed from: u */
    private byte f345u;

    /* JADX INFO: renamed from: v */
    private int f346v;

    /* JADX INFO: renamed from: w */
    private int f347w;

    /* JADX INFO: renamed from: x */
    private int f348x;

    public C0078h(InterfaceC0267h interfaceC0267h, String str, int i, int i2, int i3) {
        super(interfaceC0267h, (byte) -94, str);
        this.f348x = i2;
        this.f348x |= 137;
        this.f339o = 128;
        this.f340p = i3;
        if ((i & 64) == 64) {
            if ((i & 16) == 16) {
                this.f341q = 5;
            } else {
                this.f341q = 4;
            }
        } else if ((i & 16) == 16) {
            if ((i & 32) == 32) {
                this.f341q = 2;
            } else {
                this.f341q = 3;
            }
        } else {
            this.f341q = 1;
        }
        this.f342r = 64;
        this.f343s = 2;
        this.f345u = (byte) 3;
    }

    /* JADX INFO: renamed from: W */
    public final void m262W() {
        this.f347w |= 22;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: f */
    protected final int mo253f(byte[] bArr, int i) {
        int i2 = i + 1;
        bArr[i] = 0;
        this.f346v = i2;
        int i3 = i2 + 2;
        C0173a.m512b(this.f347w, bArr, i3);
        int i4 = i3 + 4;
        C0173a.m512b(this.f338n, bArr, i4);
        int i5 = i4 + 4;
        C0173a.m512b(this.f348x, bArr, i5);
        int i6 = i5 + 4;
        C0173a.m514c(this.f344t, bArr, i6);
        int i7 = i6 + 8;
        C0173a.m512b(this.f339o, bArr, i7);
        int i8 = i7 + 4;
        C0173a.m512b(this.f340p, bArr, i8);
        int i9 = i8 + 4;
        C0173a.m512b(this.f341q, bArr, i9);
        int i10 = i9 + 4;
        C0173a.m512b(this.f342r, bArr, i10);
        int i11 = i10 + 4;
        C0173a.m512b(this.f343s, bArr, i11);
        int i12 = i11 + 4;
        bArr[i12] = this.f345u;
        return (i12 + 1) - i;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: g */
    protected final int mo254g(byte[] bArr, int i) {
        int iA = m346a(this.f493l, bArr, i);
        C0173a.m510a(m327C() ? this.f493l.length() * 2 : iA, bArr, this.f346v);
        return iA;
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
        return new String("SmbComNTCreateAndX[" + super.toString() + ",flags=0x" + C0284e.m947a(this.f347w, 2) + ",rootDirectoryFid=" + this.f338n + ",desiredAccess=0x" + C0284e.m947a(this.f348x, 4) + ",allocationSize=" + this.f344t + ",extFileAttributes=0x" + C0284e.m947a(this.f339o, 4) + ",shareAccess=0x" + C0284e.m947a(this.f340p, 4) + ",createDisposition=0x" + C0284e.m947a(this.f341q, 4) + ",createOptions=0x" + C0284e.m947a(this.f342r, 8) + ",impersonationLevel=0x" + C0284e.m947a(this.f343s, 4) + ",securityFlags=0x" + C0284e.m947a(this.f345u, 2) + ",name=" + this.f493l + "]");
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: H */
    public final /* bridge */ /* synthetic */ AbstractC0103c mo259V() {
        return (C0079i) super.mo259V();
    }

    @Override // p000a.p006d.p010d.AbstractC0103c, p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: f_ */
    public final /* synthetic */ InterfaceC0067d mo218f_() {
        return (C0079i) super.mo259V();
    }

    @Override // p000a.p006d.p010d.AbstractC0103c, p000a.p031i.p032a.InterfaceC0276c
    /* JADX INFO: renamed from: V */
    public final /* synthetic */ InterfaceC0278e mo218f_() {
        return (C0079i) super.mo259V();
    }

    @Override // p000a.p006d.InterfaceC0126e
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0067d mo260a(InterfaceC0016c interfaceC0016c) {
        C0079i c0079i = new C0079i(interfaceC0016c.mo114a());
        mo210a((InterfaceC0067d) c0079i);
        return c0079i;
    }
}
