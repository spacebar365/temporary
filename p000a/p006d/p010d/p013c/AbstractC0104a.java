package p000a.p006d.p010d.p013c;

import java.util.Enumeration;
import p000a.InterfaceC0267h;
import p000a.p006d.p010d.AbstractC0103c;
import p000a.p006d.p025f.C0173a;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.d.d.c.a */
/* JADX INFO: compiled from: SmbComTransaction.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0104a extends AbstractC0103c implements Enumeration<AbstractC0104a> {

    /* JADX INFO: renamed from: A */
    protected int f507A;

    /* JADX INFO: renamed from: B */
    protected int f508B;

    /* JADX INFO: renamed from: C */
    protected int f509C;

    /* JADX INFO: renamed from: D */
    protected byte f510D;

    /* JADX INFO: renamed from: E */
    protected int f511E;

    /* JADX INFO: renamed from: F */
    protected int f512F;

    /* JADX INFO: renamed from: G */
    protected String f513G;

    /* JADX INFO: renamed from: H */
    protected int f514H;

    /* JADX INFO: renamed from: I */
    private boolean f515I;

    /* JADX INFO: renamed from: J */
    private int f516J;

    /* JADX INFO: renamed from: K */
    private int f517K;

    /* JADX INFO: renamed from: L */
    private byte f518L;

    /* JADX INFO: renamed from: M */
    private byte[] f519M;

    /* JADX INFO: renamed from: n */
    private int f520n;

    /* JADX INFO: renamed from: o */
    private int f521o;

    /* JADX INFO: renamed from: p */
    private int f522p;

    /* JADX INFO: renamed from: q */
    private boolean f523q;

    /* JADX INFO: renamed from: r */
    protected int f524r;

    /* JADX INFO: renamed from: s */
    protected int f525s;

    /* JADX INFO: renamed from: t */
    protected int f526t;

    /* JADX INFO: renamed from: u */
    protected int f527u;

    /* JADX INFO: renamed from: v */
    protected int f528v;

    /* JADX INFO: renamed from: w */
    protected int f529w;

    /* JADX INFO: renamed from: x */
    protected int f530x;

    /* JADX INFO: renamed from: y */
    protected int f531y;

    /* JADX INFO: renamed from: z */
    protected int f532z;

    /* JADX INFO: renamed from: j */
    protected abstract int mo319j(byte[] bArr, int i);

    /* JADX INFO: renamed from: k */
    protected abstract int mo320k(byte[] bArr, int i);

    /* JADX INFO: renamed from: l */
    protected abstract int mo321l(byte[] bArr, int i);

    protected AbstractC0104a(InterfaceC0267h interfaceC0267h, byte b, byte b2) {
        super(interfaceC0267h, b);
        this.f520n = 0;
        this.f521o = 0;
        this.f522p = 0;
        this.f523q = true;
        this.f515I = true;
        this.f511E = 0;
        this.f512F = 1;
        this.f513G = "";
        this.f518L = b2;
        this.f509C = interfaceC0267h.mo41af() - 512;
        this.f508B = 1024;
        this.f524r = 61;
        this.f525s = 51;
    }

    /* JADX INFO: renamed from: j */
    public final void m386j(int i) {
        this.f514H = i;
    }

    /* JADX INFO: renamed from: q */
    public final void m387q() {
        this.f509C = 1024;
    }

    /* JADX INFO: renamed from: c */
    public final void m385c(byte[] bArr) {
        this.f519M = bArr;
    }

    /* JADX INFO: renamed from: W */
    public final byte[] m380W() {
        byte[] bArr = this.f519M;
        this.f519M = null;
        return bArr;
    }

    /* JADX INFO: renamed from: X */
    public final byte m381X() {
        return this.f518L;
    }

    /* JADX INFO: renamed from: Y */
    public final void m382Y() {
        this.f518L = (byte) -41;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c, p000a.p006d.InterfaceC0051b, p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: e_ */
    public final void mo217e_() {
        super.mo217e_();
        this.f523q = true;
        this.f515I = true;
    }

    /* JADX INFO: renamed from: a */
    protected void mo318a(int i, String str) {
        mo217e_();
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.f523q;
    }

    @Override // java.util.Enumeration
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final AbstractC0104a nextElement() {
        if (this.f515I) {
            this.f515I = false;
            this.f527u = this.f524r + (this.f512F * 2) + 2;
            if (mo216c() != -96) {
                if (mo216c() == 37 && !m344U()) {
                    this.f527u += m345a(this.f513G, this.f527u);
                }
            } else if (mo216c() == -96) {
                this.f527u += 2;
            }
            this.f521o = this.f527u % mo384aa();
            this.f521o = this.f521o == 0 ? 0 : mo384aa() - this.f521o;
            this.f527u += this.f521o;
            this.f532z = mo320k(this.f519M, this.f516J);
            this.f517K = this.f532z;
            int i = this.f514H - this.f527u;
            this.f526t = Math.min(this.f532z, i);
            int i2 = i - this.f526t;
            this.f530x = this.f527u + this.f526t;
            this.f522p = this.f530x % mo384aa();
            this.f522p = this.f522p == 0 ? 0 : mo384aa() - this.f522p;
            this.f530x += this.f522p;
            this.f507A = mo321l(this.f519M, this.f517K);
            this.f529w = Math.min(this.f507A, i2);
        } else {
            if (mo216c() != -96) {
                mo208a(38);
            } else {
                mo208a(-95);
            }
            this.f527u = 51;
            if (this.f532z - this.f528v > 0) {
                this.f521o = this.f527u % mo384aa();
                this.f521o = this.f521o == 0 ? 0 : mo384aa() - this.f521o;
                this.f527u += this.f521o;
            }
            this.f528v += this.f526t;
            int i3 = (this.f514H - this.f527u) - this.f521o;
            this.f526t = Math.min(this.f532z - this.f528v, i3);
            int i4 = i3 - this.f526t;
            this.f530x = this.f527u + this.f526t;
            this.f522p = this.f530x % mo384aa();
            this.f522p = this.f522p == 0 ? 0 : mo384aa() - this.f522p;
            this.f530x += this.f522p;
            this.f531y += this.f529w;
            this.f529w = Math.min(this.f507A - this.f531y, i4 - this.f522p);
        }
        if (this.f528v + this.f526t >= this.f532z && this.f531y + this.f529w >= this.f507A) {
            this.f523q = false;
        }
        return this;
    }

    /* JADX INFO: renamed from: aa */
    public int mo384aa() {
        return 2;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: f */
    protected int mo253f(byte[] bArr, int i) {
        int iMo319j;
        C0173a.m510a(this.f532z, bArr, i);
        int i2 = i + 2;
        C0173a.m510a(this.f507A, bArr, i2);
        int i3 = i2 + 2;
        if (mo216c() != 38) {
            C0173a.m510a(this.f508B, bArr, i3);
            int i4 = i3 + 2;
            C0173a.m510a(this.f509C, bArr, i4);
            int i5 = i4 + 2;
            int i6 = i5 + 1;
            bArr[i5] = this.f510D;
            int i7 = i6 + 1;
            bArr[i6] = 0;
            C0173a.m510a(this.f520n, bArr, i7);
            int i8 = i7 + 2;
            C0173a.m512b(this.f511E, bArr, i8);
            int i9 = i8 + 4;
            int i10 = i9 + 1;
            bArr[i9] = 0;
            i3 = i10 + 1;
            bArr[i10] = 0;
        }
        C0173a.m510a(this.f526t, bArr, i3);
        int i11 = i3 + 2;
        C0173a.m510a(this.f527u, bArr, i11);
        int i12 = i11 + 2;
        if (mo216c() == 38) {
            C0173a.m510a(this.f528v, bArr, i12);
            i12 += 2;
        }
        C0173a.m510a(this.f529w, bArr, i12);
        int i13 = i12 + 2;
        C0173a.m510a(this.f529w == 0 ? 0 : this.f530x, bArr, i13);
        int i14 = i13 + 2;
        if (mo216c() == 38) {
            C0173a.m510a(this.f531y, bArr, i14);
            iMo319j = i14 + 2;
        } else {
            int i15 = i14 + 1;
            bArr[i14] = (byte) this.f512F;
            int i16 = i15 + 1;
            bArr[i15] = 0;
            iMo319j = i16 + mo319j(bArr, i16);
        }
        return iMo319j - i;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: g */
    protected final int mo254g(byte[] bArr, int i) {
        int i2 = this.f521o;
        int iA = (mo216c() != 37 || m344U()) ? i : m346a(this.f513G, bArr, i) + i;
        if (this.f526t > 0) {
            int i3 = iA;
            while (true) {
                int i4 = i2 - 1;
                if (i2 <= 0) {
                    break;
                }
                bArr[i3] = 0;
                i2 = i4;
                i3++;
            }
            System.arraycopy(this.f519M, this.f516J, bArr, i3, this.f526t);
            iA = this.f526t + i3;
        }
        if (this.f529w > 0) {
            int i5 = this.f522p;
            int i6 = iA;
            while (true) {
                int i7 = i5 - 1;
                if (i5 <= 0) {
                    break;
                }
                bArr[i6] = 0;
                i5 = i7;
                i6++;
            }
            System.arraycopy(this.f519M, this.f517K, bArr, i6, this.f529w);
            this.f517K += this.f529w;
            iA = this.f529w + i6;
        }
        return iA - i;
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
    public String toString() {
        return new String(super.toString() + ",totalParameterCount=" + this.f532z + ",totalDataCount=" + this.f507A + ",maxParameterCount=" + this.f508B + ",maxDataCount=" + this.f509C + ",maxSetupCount=" + ((int) this.f510D) + ",flags=0x" + C0284e.m947a(this.f520n, 2) + ",timeout=" + this.f511E + ",parameterCount=" + this.f526t + ",parameterOffset=" + this.f527u + ",parameterDisplacement=" + this.f528v + ",dataCount=" + this.f529w + ",dataOffset=" + this.f530x + ",dataDisplacement=" + this.f531y + ",setupCount=" + this.f512F + ",pad=" + this.f521o + ",pad1=" + this.f522p);
    }
}
