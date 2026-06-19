package p000a.p006d.p010d.p015d;

import p000a.InterfaceC0267h;
import p000a.p006d.p009c.C0058c;
import p000a.p006d.p010d.p013c.AbstractC0108b;
import p000a.p006d.p025f.C0173a;
import p000a.p029g.InterfaceC0250j;

/* JADX INFO: renamed from: a.d.d.d.b */
/* JADX INFO: compiled from: Trans2FindFirst2Response.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0118b extends AbstractC0108b {

    /* JADX INFO: renamed from: C */
    private int f577C;

    /* JADX INFO: renamed from: D */
    private boolean f578D;

    /* JADX INFO: renamed from: E */
    private int f579E;

    /* JADX INFO: renamed from: F */
    private int f580F;

    /* JADX INFO: renamed from: G */
    private int f581G;

    /* JADX INFO: renamed from: H */
    private String f582H;

    /* JADX INFO: renamed from: I */
    private int f583I;

    public C0118b(InterfaceC0267h interfaceC0267h) {
        super(interfaceC0267h, (byte) 0);
    }

    /* JADX INFO: renamed from: q */
    public final int m404q() {
        return this.f577C;
    }

    /* JADX INFO: renamed from: ac */
    public final boolean m401ac() {
        return this.f578D;
    }

    /* JADX INFO: renamed from: ad */
    public final String m402ad() {
        return this.f582H;
    }

    /* JADX INFO: renamed from: ae */
    public final int m403ae() {
        return this.f583I;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0108b
    /* JADX INFO: renamed from: j */
    protected final int mo323j(byte[] bArr, int i) {
        int i2;
        if (m391Y() == 1) {
            this.f577C = C0173a.m509a(bArr, i);
            i2 = i + 2;
        } else {
            i2 = i;
        }
        m399k(C0173a.m509a(bArr, i2));
        int i3 = i2 + 2;
        this.f578D = (bArr[i3] & 1) == 1;
        int i4 = i3 + 2;
        this.f579E = C0173a.m509a(bArr, i4);
        int i5 = i4 + 2;
        this.f580F = C0173a.m509a(bArr, i5);
        return (i5 + 2) - i;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0108b
    /* JADX INFO: renamed from: a */
    protected final int mo322a(byte[] bArr, int i, int i2) {
        this.f581G = this.f580F + i;
        InterfaceC0250j[] interfaceC0250jArr = new C0058c[m394aa()];
        for (int i3 = 0; i3 < m394aa(); i3++) {
            C0058c c0058c = new C0058c(m343T(), m327C());
            interfaceC0250jArr[i3] = c0058c;
            c0058c.mo201a(bArr, i, i2);
            if (this.f581G >= i && (c0058c.m242j() == 0 || this.f581G < c0058c.m242j() + i)) {
                this.f582H = c0058c.m236d();
                this.f583I = c0058c.mo235c();
            }
            i += c0058c.m242j();
        }
        m393a(interfaceC0250jArr);
        return m389W();
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0108b, p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        String str;
        if (m391Y() == 1) {
            str = "Trans2FindFirst2Response[";
        } else {
            str = "Trans2FindNext2Response[";
        }
        return new String(str + super.toString() + ",sid=" + this.f577C + ",searchCount=" + m394aa() + ",isEndOfSearch=" + this.f578D + ",eaErrorOffset=" + this.f579E + ",lastNameOffset=" + this.f580F + ",lastName=" + this.f582H + "]");
    }
}
