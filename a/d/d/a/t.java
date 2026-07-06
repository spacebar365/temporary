package a.d.d.a;

import a.g.ad;

/* JADX INFO: compiled from: SmbComSessionSetupAndX.java */
/* JADX INFO: loaded from: classes.dex */
public final class t extends a.d.d.a {
    private byte[] n;
    private byte[] o;
    private byte[] p;
    private String q;
    private String r;
    private k s;
    private int t;

    public t(a.c cVar, k kVar, a.d.d.c cVar2, Object obj) throws ad {
        super(cVar.a(), (byte) 115, cVar2);
        this.p = null;
        this.s = kVar;
        this.t = kVar.q();
        b bVarAa = kVar.aa();
        if (bVarAa.g == 1) {
            if (obj instanceof a.g.s) {
                a.g.s sVar = (a.g.s) obj;
                if (sVar.b()) {
                    this.n = new byte[0];
                    this.o = new byte[0];
                    this.t &= Integer.MAX_VALUE;
                    if (sVar.h()) {
                        this.q = sVar.f();
                        if (C()) {
                            this.q = this.q.toUpperCase();
                        }
                        this.r = sVar.a() != null ? sVar.a().toUpperCase() : "?";
                        return;
                    }
                    this.q = "";
                    this.r = "";
                    return;
                }
                this.q = sVar.f();
                if (C()) {
                    this.q = this.q.toUpperCase();
                }
                this.r = sVar.a() != null ? sVar.a().toUpperCase() : "?";
                if (bVarAa.h) {
                    this.n = sVar.a(cVar, bVarAa.p);
                    this.o = sVar.b(cVar, bVarAa.p);
                    if (this.n.length == 0 && this.o.length == 0) {
                        throw new RuntimeException("Null setup prohibited.");
                    }
                    return;
                }
                if (cVar.a().D()) {
                    throw new RuntimeException("Plain text passwords are disabled");
                }
                String strG = sVar.g();
                this.n = new byte[(strG.length() + 1) * 2];
                this.o = new byte[0];
                a(strG, this.n, 0);
                return;
            }
            if (obj instanceof byte[]) {
                this.p = (byte[]) obj;
                return;
            }
            throw new ad("Unsupported credential type " + (obj != null ? obj.getClass() : "NULL"));
        }
        if (bVarAa.g == 0) {
            if (obj instanceof a.g.s) {
                a.g.s sVar2 = (a.g.s) obj;
                this.n = new byte[0];
                this.o = new byte[0];
                if (!sVar2.b()) {
                    this.q = sVar2.f();
                    if (C()) {
                        this.q = this.q.toUpperCase();
                    }
                    this.r = sVar2.a() != null ? sVar2.a().toUpperCase() : "?";
                    return;
                }
                this.q = "";
                this.r = "";
                return;
            }
            throw new ad("Unsupported credential type");
        }
        throw new ad("Unsupported");
    }

    @Override // a.d.d.a
    protected final int a(a.h hVar, byte b) {
        if (b == 117) {
            return hVar.a("SessionSetupAndX.TreeConnectAndX");
        }
        return 0;
    }

    @Override // a.d.d.c
    protected final int f(byte[] bArr, int i) {
        int i2;
        a.d.f.a.a(this.s.W(), bArr, i);
        int i3 = i + 2;
        a.d.f.a.a(this.s.X(), bArr, i3);
        int i4 = i3 + 2;
        a.d.f.a.a(T().K(), bArr, i4);
        int i5 = i4 + 2;
        a.d.f.a.b(this.s.Y(), bArr, i5);
        int i6 = i5 + 4;
        if (this.p != null) {
            a.d.f.a.a(this.p.length, bArr, i6);
            i2 = i6 + 2;
        } else {
            a.d.f.a.a(this.n.length, bArr, i6);
            int i7 = i6 + 2;
            a.d.f.a.a(this.o.length, bArr, i7);
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
        a.d.f.a.b(this.t, bArr, i11);
        return (i11 + 4) - i;
    }

    @Override // a.d.d.c
    protected final int g(byte[] bArr, int i) {
        int iA;
        if (this.p != null) {
            System.arraycopy(this.p, 0, bArr, i, this.p.length);
            iA = this.p.length + i;
        } else {
            System.arraycopy(this.n, 0, bArr, i, this.n.length);
            int length = this.n.length + i;
            System.arraycopy(this.o, 0, bArr, length, this.o.length);
            int length2 = length + this.o.length;
            int iA2 = length2 + a(this.q, bArr, length2);
            iA = iA2 + a(this.r, bArr, iA2);
        }
        int iA3 = iA + a(T().n(), bArr, iA);
        return (iA3 + a(T().o(), bArr, iA3)) - i;
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
        return new String("SmbComSessionSetupAndX[" + super.toString() + ",snd_buf_size=" + this.s.W() + ",maxMpxCount=" + this.s.X() + ",VC_NUMBER=" + T().K() + ",sessionKey=" + this.s.Y() + ",lmHash.length=" + (this.n == null ? 0 : this.n.length) + ",ntHash.length=" + (this.o != null ? this.o.length : 0) + ",capabilities=" + this.t + ",accountName=" + this.q + ",primaryDomain=" + this.r + ",NATIVE_OS=" + T().n() + ",NATIVE_LANMAN=" + T().o() + "]");
    }
}
