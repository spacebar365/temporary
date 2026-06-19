package p000a.p006d.p010d.p013c;

import java.util.Enumeration;
import p000a.InterfaceC0267h;
import p000a.p006d.C0175g;
import p000a.p006d.p010d.AbstractC0103c;
import p000a.p006d.p025f.C0173a;
import p000a.p029g.InterfaceC0250j;

/* JADX INFO: renamed from: a.d.d.c.b */
/* JADX INFO: compiled from: SmbComTransactionResponse.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0108b extends AbstractC0103c implements Enumeration<AbstractC0108b> {

    /* JADX INFO: renamed from: A */
    volatile boolean f536A;

    /* JADX INFO: renamed from: B */
    byte[] f537B;

    /* JADX INFO: renamed from: C */
    private int f538C;

    /* JADX INFO: renamed from: D */
    private int f539D;

    /* JADX INFO: renamed from: E */
    private boolean f540E;

    /* JADX INFO: renamed from: F */
    private boolean f541F;

    /* JADX INFO: renamed from: G */
    private int f542G;

    /* JADX INFO: renamed from: H */
    private int f543H;

    /* JADX INFO: renamed from: I */
    private InterfaceC0250j[] f544I;

    /* JADX INFO: renamed from: n */
    protected int f545n;

    /* JADX INFO: renamed from: o */
    protected int f546o;

    /* JADX INFO: renamed from: p */
    protected int f547p;

    /* JADX INFO: renamed from: q */
    protected int f548q;

    /* JADX INFO: renamed from: r */
    protected int f549r;

    /* JADX INFO: renamed from: s */
    protected int f550s;

    /* JADX INFO: renamed from: t */
    protected int f551t;

    /* JADX INFO: renamed from: u */
    protected int f552u;

    /* JADX INFO: renamed from: v */
    protected int f553v;

    /* JADX INFO: renamed from: w */
    protected int f554w;

    /* JADX INFO: renamed from: x */
    int f555x;

    /* JADX INFO: renamed from: y */
    byte f556y;

    /* JADX INFO: renamed from: z */
    volatile boolean f557z;

    /* JADX INFO: renamed from: a */
    protected abstract int mo322a(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: j */
    protected abstract int mo323j(byte[] bArr, int i);

    protected AbstractC0108b(InterfaceC0267h interfaceC0267h) {
        super(interfaceC0267h);
        this.f557z = true;
        this.f536A = true;
    }

    protected AbstractC0108b(InterfaceC0267h interfaceC0267h, byte b) {
        super(interfaceC0267h, (byte) 50);
        this.f557z = true;
        this.f536A = true;
        this.f556y = (byte) 1;
    }

    /* JADX INFO: renamed from: W */
    protected final int m389W() {
        return this.f555x;
    }

    /* JADX INFO: renamed from: c */
    public final void m397c(byte[] bArr) {
        this.f537B = bArr;
    }

    /* JADX INFO: renamed from: X */
    public final byte[] m390X() {
        byte[] bArr = this.f537B;
        this.f537B = null;
        return bArr;
    }

    /* JADX INFO: renamed from: Y */
    public final byte m391Y() {
        return this.f556y;
    }

    /* JADX INFO: renamed from: b */
    public final void m396b(byte b) {
        this.f556y = b;
    }

    /* JADX INFO: renamed from: Z */
    public final int m392Z() {
        return this.f542G;
    }

    /* JADX INFO: renamed from: j */
    protected final void m398j(int i) {
        this.f542G = i;
    }

    /* JADX INFO: renamed from: aa */
    public final int m394aa() {
        return this.f543H;
    }

    /* JADX INFO: renamed from: k */
    protected final void m399k(int i) {
        this.f543H = i;
    }

    /* JADX INFO: renamed from: ab */
    public final InterfaceC0250j[] m395ab() {
        return this.f544I;
    }

    /* JADX INFO: renamed from: a */
    protected final void m393a(InterfaceC0250j[] interfaceC0250jArr) {
        this.f544I = interfaceC0250jArr;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c, p000a.p006d.InterfaceC0051b, p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: e_ */
    public final void mo217e_() {
        super.mo217e_();
        this.f554w = 0;
        this.f557z = true;
        this.f536A = true;
        this.f541F = false;
        this.f540E = false;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.f485d == 0 && this.f557z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Enumeration
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public AbstractC0108b nextElement() {
        if (this.f536A) {
            this.f536A = false;
        }
        return this;
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

    @Override // p000a.p006d.p010d.AbstractC0103c, p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: a */
    public final int mo206a(byte[] bArr, int i) throws C0175g {
        int iMo206a = super.mo206a(bArr, i);
        if (this.f491j == 0) {
            mo256i(bArr, iMo206a + i);
        }
        nextElement();
        return iMo206a;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: h */
    protected final int mo255h(byte[] bArr, int i) {
        this.f545n = C0173a.m509a(bArr, i);
        if (this.f554w == 0) {
            this.f554w = this.f545n;
        }
        int i2 = i + 2;
        this.f546o = C0173a.m509a(bArr, i2);
        int i3 = i2 + 4;
        this.f547p = C0173a.m509a(bArr, i3);
        int i4 = i3 + 2;
        this.f548q = C0173a.m509a(bArr, i4);
        int i5 = i4 + 2;
        this.f549r = C0173a.m509a(bArr, i5);
        int i6 = i5 + 2;
        this.f555x = C0173a.m509a(bArr, i6);
        int i7 = i6 + 2;
        this.f550s = C0173a.m509a(bArr, i7);
        int i8 = i7 + 2;
        this.f551t = C0173a.m509a(bArr, i8);
        int i9 = i8 + 2;
        this.f552u = bArr[i9] & 255;
        return (i9 + 2) - i;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: i */
    protected final int mo256i(byte[] bArr, int i) {
        this.f539D = 0;
        this.f538C = 0;
        if (this.f547p > 0) {
            int i2 = this.f548q - (i - this.f482a);
            this.f538C = i2;
            int i3 = i2 + i;
            System.arraycopy(bArr, i3, this.f537B, this.f553v + this.f549r, this.f547p);
            i = i3 + this.f547p;
        }
        if (this.f555x > 0) {
            int i4 = this.f550s - (i - this.f482a);
            this.f539D = i4;
            System.arraycopy(bArr, i4 + i, this.f537B, this.f554w + this.f551t, this.f555x);
        }
        if (!this.f540E && this.f549r + this.f547p == this.f545n) {
            this.f540E = true;
        }
        if (!this.f541F && this.f551t + this.f555x == this.f546o) {
            this.f541F = true;
        }
        if (this.f540E && this.f541F) {
            mo323j(this.f537B, this.f553v);
            mo322a(this.f537B, this.f554w, this.f546o);
            this.f557z = false;
        }
        return this.f538C + this.f547p + this.f539D + this.f555x;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    public String toString() {
        return new String(super.toString() + ",totalParameterCount=" + this.f545n + ",totalDataCount=" + this.f546o + ",parameterCount=" + this.f547p + ",parameterOffset=" + this.f548q + ",parameterDisplacement=" + this.f549r + ",dataCount=" + this.f555x + ",dataOffset=" + this.f550s + ",dataDisplacement=" + this.f551t + ",setupCount=" + this.f552u + ",pad=" + this.f538C + ",pad1=" + this.f539D);
    }
}
