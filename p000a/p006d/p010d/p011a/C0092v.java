package p000a.p006d.p010d.p011a;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import p000a.C0297u;
import p000a.InterfaceC0016c;
import p000a.InterfaceC0267h;
import p000a.p006d.p010d.AbstractC0068a;
import p000a.p006d.p010d.AbstractC0103c;
import p000a.p006d.p025f.C0173a;
import p000a.p029g.C0258r;
import p000a.p029g.C0259s;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.d.d.a.v */
/* JADX INFO: compiled from: SmbComTreeConnectAndX.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0092v extends AbstractC0068a {

    /* JADX INFO: renamed from: n */
    private boolean f423n;

    /* JADX INFO: renamed from: o */
    private String f424o;

    /* JADX INFO: renamed from: p */
    private byte[] f425p;

    /* JADX INFO: renamed from: q */
    private int f426q;

    /* JADX INFO: renamed from: r */
    private InterfaceC0016c f427r;

    /* JADX INFO: renamed from: s */
    private C0072b f428s;

    public C0092v(InterfaceC0016c interfaceC0016c, C0072b c0072b, String str, String str2, AbstractC0103c abstractC0103c) {
        super(interfaceC0016c.mo114a(), (byte) 117, abstractC0103c);
        this.f423n = false;
        this.f427r = interfaceC0016c;
        this.f428s = c0072b;
        this.f493l = str;
        this.f424o = str2;
    }

    @Override // p000a.p006d.p010d.AbstractC0068a
    /* JADX INFO: renamed from: a */
    protected final int mo248a(InterfaceC0267h interfaceC0267h, byte b) {
        switch (b & 255) {
            case 0:
                return interfaceC0267h.mo32a("TreeConnectAndX.CreateDirectory");
            case 1:
                return interfaceC0267h.mo32a("TreeConnectAndX.DeleteDirectory");
            case 6:
                return interfaceC0267h.mo32a("TreeConnectAndX.Delete");
            case 7:
                return interfaceC0267h.mo32a("TreeConnectAndX.Rename");
            case 8:
                return interfaceC0267h.mo32a("TreeConnectAndX.QueryInformation");
            case 16:
                return interfaceC0267h.mo32a("TreeConnectAndX.CheckDirectory");
            case 37:
                return interfaceC0267h.mo32a("TreeConnectAndX.Transaction");
            case 45:
                return interfaceC0267h.mo32a("TreeConnectAndX.OpenAndX");
            default:
                return 0;
        }
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: f */
    protected final int mo253f(byte[] bArr, int i) {
        if (this.f428s.f316g == 0 && (this.f427r.mo109g() instanceof C0259s)) {
            C0259s c0259s = (C0259s) this.f427r.mo109g();
            if (m306a(c0259s)) {
                this.f426q = 1;
            } else if (this.f428s.f317h) {
                try {
                    this.f425p = c0259s.mo890a(this.f427r, this.f428s.f325p);
                    this.f426q = this.f425p.length;
                } catch (GeneralSecurityException e) {
                    throw new C0297u("Failed to encrypt password", e);
                }
            } else {
                if (this.f427r.mo114a().mo9D()) {
                    throw new C0297u("Plain text passwords are disabled");
                }
                this.f425p = new byte[(c0259s.m901g().length() + 1) * 2];
                this.f426q = m346a(c0259s.m901g(), this.f425p, 0);
            }
        } else {
            this.f426q = 1;
        }
        int i2 = i + 1;
        bArr[i] = this.f423n ? (byte) 1 : (byte) 0;
        bArr[i2] = 0;
        C0173a.m510a(this.f426q, bArr, i2 + 1);
        return 4;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m306a(C0259s c0259s) {
        return (c0259s instanceof C0258r) && !((C0258r) c0259s).m892d() && c0259s.m901g().isEmpty();
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: g */
    protected final int mo254g(byte[] bArr, int i) {
        int i2;
        if (this.f428s.f316g == 0 && (this.f427r.mo109g() instanceof C0259s) && !m306a((C0259s) this.f427r.mo109g())) {
            System.arraycopy(this.f425p, 0, bArr, i, this.f426q);
            i2 = this.f426q + i;
        } else {
            i2 = i + 1;
            bArr[i] = 0;
        }
        int iA = i2 + m346a(this.f493l, bArr, i2);
        try {
            System.arraycopy(this.f424o.getBytes("ASCII"), 0, bArr, iA, this.f424o.length());
            int length = iA + this.f424o.length();
            bArr[length] = 0;
            return (length + 1) - i;
        } catch (UnsupportedEncodingException e) {
            return 0;
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
        return new String("SmbComTreeConnectAndX[" + super.toString() + ",disconnectTid=" + this.f423n + ",passwordLength=" + this.f426q + ",password=" + C0284e.m949a(this.f425p, this.f426q, 0) + ",path=" + this.f493l + ",service=" + this.f424o + "]");
    }
}
