package p000a.p006d.p010d.p011a;

import p000a.InterfaceC0016c;
import p000a.InterfaceC0267h;
import p000a.p006d.p010d.AbstractC0068a;
import p000a.p006d.p010d.AbstractC0103c;
import p000a.p006d.p025f.C0173a;
import p000a.p029g.C0214ad;
import p000a.p029g.C0259s;

/* JADX INFO: renamed from: a.d.d.a.t */
/* JADX INFO: compiled from: SmbComSessionSetupAndX.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0090t extends AbstractC0068a {

    /* JADX INFO: renamed from: n */
    private byte[] f411n;

    /* JADX INFO: renamed from: o */
    private byte[] f412o;

    /* JADX INFO: renamed from: p */
    private byte[] f413p;

    /* JADX INFO: renamed from: q */
    private String f414q;

    /* JADX INFO: renamed from: r */
    private String f415r;

    /* JADX INFO: renamed from: s */
    private C0081k f416s;

    /* JADX INFO: renamed from: t */
    private int f417t;

    public C0090t(InterfaceC0016c interfaceC0016c, C0081k c0081k, AbstractC0103c abstractC0103c, Object obj) throws C0214ad {
        super(interfaceC0016c.mo114a(), (byte) 115, abstractC0103c);
        this.f413p = null;
        this.f416s = c0081k;
        this.f417t = c0081k.m288q();
        C0072b c0072bM277aa = c0081k.m277aa();
        if (c0072bM277aa.f316g == 1) {
            if (obj instanceof C0259s) {
                C0259s c0259s = (C0259s) obj;
                if (c0259s.mo899b()) {
                    this.f411n = new byte[0];
                    this.f412o = new byte[0];
                    this.f417t &= Integer.MAX_VALUE;
                    if (c0259s.m902h()) {
                        this.f414q = c0259s.m900f();
                        if (m327C()) {
                            this.f414q = this.f414q.toUpperCase();
                        }
                        this.f415r = c0259s.mo898a() != null ? c0259s.mo898a().toUpperCase() : "?";
                        return;
                    }
                    this.f414q = "";
                    this.f415r = "";
                    return;
                }
                this.f414q = c0259s.m900f();
                if (m327C()) {
                    this.f414q = this.f414q.toUpperCase();
                }
                this.f415r = c0259s.mo898a() != null ? c0259s.mo898a().toUpperCase() : "?";
                if (c0072bM277aa.f317h) {
                    this.f411n = c0259s.mo890a(interfaceC0016c, c0072bM277aa.f325p);
                    this.f412o = c0259s.mo891b(interfaceC0016c, c0072bM277aa.f325p);
                    if (this.f411n.length == 0 && this.f412o.length == 0) {
                        throw new RuntimeException("Null setup prohibited.");
                    }
                    return;
                }
                if (interfaceC0016c.mo114a().mo9D()) {
                    throw new RuntimeException("Plain text passwords are disabled");
                }
                String strM901g = c0259s.m901g();
                this.f411n = new byte[(strM901g.length() + 1) * 2];
                this.f412o = new byte[0];
                m346a(strM901g, this.f411n, 0);
                return;
            }
            if (obj instanceof byte[]) {
                this.f413p = (byte[]) obj;
                return;
            }
            throw new C0214ad("Unsupported credential type " + (obj != null ? obj.getClass() : "NULL"));
        }
        if (c0072bM277aa.f316g == 0) {
            if (obj instanceof C0259s) {
                C0259s c0259s2 = (C0259s) obj;
                this.f411n = new byte[0];
                this.f412o = new byte[0];
                if (!c0259s2.mo899b()) {
                    this.f414q = c0259s2.m900f();
                    if (m327C()) {
                        this.f414q = this.f414q.toUpperCase();
                    }
                    this.f415r = c0259s2.mo898a() != null ? c0259s2.mo898a().toUpperCase() : "?";
                    return;
                }
                this.f414q = "";
                this.f415r = "";
                return;
            }
            throw new C0214ad("Unsupported credential type");
        }
        throw new C0214ad("Unsupported");
    }

    @Override // p000a.p006d.p010d.AbstractC0068a
    /* JADX INFO: renamed from: a */
    protected final int mo248a(InterfaceC0267h interfaceC0267h, byte b) {
        if (b == 117) {
            return interfaceC0267h.mo32a("SessionSetupAndX.TreeConnectAndX");
        }
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: f */
    protected final int mo253f(byte[] bArr, int i) {
        int i2;
        C0173a.m510a(this.f416s.m269W(), bArr, i);
        int i3 = i + 2;
        C0173a.m510a(this.f416s.m270X(), bArr, i3);
        int i4 = i3 + 2;
        C0173a.m510a(m343T().mo16K(), bArr, i4);
        int i5 = i4 + 2;
        C0173a.m512b(this.f416s.m271Y(), bArr, i5);
        int i6 = i5 + 4;
        if (this.f413p != null) {
            C0173a.m510a(this.f413p.length, bArr, i6);
            i2 = i6 + 2;
        } else {
            C0173a.m510a(this.f411n.length, bArr, i6);
            int i7 = i6 + 2;
            C0173a.m510a(this.f412o.length, bArr, i7);
            i2 = i7 + 2;
        }
        int i8 = i2 + 1;
        bArr[i2] = 0;
        int i9 = i8 + 1;
        bArr[i8] = 0;
        int i10 = i9 + 1;
        bArr[i9] = 0;
        int i11 = i10 + 1;
        bArr[i10] = 0;
        C0173a.m512b(this.f417t, bArr, i11);
        return (i11 + 4) - i;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: g */
    protected final int mo254g(byte[] bArr, int i) {
        int iA;
        if (this.f413p != null) {
            System.arraycopy(this.f413p, 0, bArr, i, this.f413p.length);
            iA = this.f413p.length + i;
        } else {
            System.arraycopy(this.f411n, 0, bArr, i, this.f411n.length);
            int length = this.f411n.length + i;
            System.arraycopy(this.f412o, 0, bArr, length, this.f412o.length);
            int length2 = length + this.f412o.length;
            int iA2 = length2 + m346a(this.f414q, bArr, length2);
            iA = iA2 + m346a(this.f415r, bArr, iA2);
        }
        int iA3 = iA + m346a(m343T().mo69n(), bArr, iA);
        return (iA3 + m346a(m343T().mo70o(), bArr, iA3)) - i;
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
        return new String("SmbComSessionSetupAndX[" + super.toString() + ",snd_buf_size=" + this.f416s.m269W() + ",maxMpxCount=" + this.f416s.m270X() + ",VC_NUMBER=" + m343T().mo16K() + ",sessionKey=" + this.f416s.m271Y() + ",lmHash.length=" + (this.f411n == null ? 0 : this.f411n.length) + ",ntHash.length=" + (this.f412o != null ? this.f412o.length : 0) + ",capabilities=" + this.f417t + ",accountName=" + this.f414q + ",primaryDomain=" + this.f415r + ",NATIVE_OS=" + m343T().mo69n() + ",NATIVE_LANMAN=" + m343T().mo70o() + "]");
    }
}
