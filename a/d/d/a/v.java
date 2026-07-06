package a.d.d.a;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: SmbComTreeConnectAndX.java */
/* JADX INFO: loaded from: classes.dex */
public final class v extends a.d.d.a {
    private boolean n;
    private String o;
    private byte[] p;
    private int q;
    private a.c r;
    private b s;

    public v(a.c cVar, b bVar, String str, String str2, a.d.d.c cVar2) {
        super(cVar.a(), (byte) 117, cVar2);
        this.n = false;
        this.r = cVar;
        this.s = bVar;
        this.l = str;
        this.o = str2;
    }

    @Override // a.d.d.a
    protected final int a(a.h hVar, byte b) {
        switch (b & 255) {
            case 0:
                return hVar.a("TreeConnectAndX.CreateDirectory");
            case 1:
                return hVar.a("TreeConnectAndX.DeleteDirectory");
            case 6:
                return hVar.a("TreeConnectAndX.Delete");
            case 7:
                return hVar.a("TreeConnectAndX.Rename");
            case 8:
                return hVar.a("TreeConnectAndX.QueryInformation");
            case 16:
                return hVar.a("TreeConnectAndX.CheckDirectory");
            case 37:
                return hVar.a("TreeConnectAndX.Transaction");
            case 45:
                return hVar.a("TreeConnectAndX.OpenAndX");
            default:
                return 0;
        }
    }

    @Override // a.d.d.c
    protected final int f(byte[] bArr, int i) {
        if (this.s.g == 0 && (this.r.g() instanceof a.g.s)) {
            a.g.s sVar = (a.g.s) this.r.g();
            if (a(sVar)) {
                this.q = 1;
            } else if (this.s.h) {
                try {
                    this.p = sVar.a(this.r, this.s.p);
                    this.q = this.p.length;
                } catch (GeneralSecurityException e) {
                    throw new a.u("Failed to encrypt password", e);
                }
            } else {
                if (this.r.a().D()) {
                    throw new a.u("Plain text passwords are disabled");
                }
                this.p = new byte[(sVar.g().length() + 1) * 2];
                this.q = a(sVar.g(), this.p, 0);
            }
        } else {
            this.q = 1;
        }
        int i2 = i + 1;
        bArr[i] = this.n ? (byte) 1 : (byte) 0;
        bArr[i2] = 0;
        a.d.f.a.a(this.q, bArr, i2 + 1);
        return 4;
    }

    private static boolean a(a.g.s sVar) {
        return (sVar instanceof a.g.r) && !((a.g.r) sVar).d() && sVar.g().isEmpty();
    }

    @Override // a.d.d.c
    protected final int g(byte[] bArr, int i) {
        int i2;
        if (this.s.g == 0 && (this.r.g() instanceof a.g.s) && !a((a.g.s) this.r.g())) {
            System.arraycopy(this.p, 0, bArr, i, this.q);
            i2 = this.q + i;
        } else {
            i2 = i + 1;
            bArr[i] = 0;
        }
        int iA = i2 + a(this.l, bArr, i2);
        try {
            System.arraycopy(this.o.getBytes("ASCII"), 0, bArr, iA, this.o.length());
            int length = iA + this.o.length();
            bArr[length] = 0;
            return (length + 1) - i;
        } catch (UnsupportedEncodingException e) {
            return 0;
        }
    }

    @Override // a.d.d.c
    protected final int h(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c
    protected final int i(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.a, a.d.d.c
    public final String toString() {
        return new String("SmbComTreeConnectAndX[" + super.toString() + ",disconnectTid=" + this.n + ",passwordLength=" + this.q + ",password=" + a.i.e.a(this.p, this.q, 0) + ",path=" + this.l + ",service=" + this.o + "]");
    }
}
