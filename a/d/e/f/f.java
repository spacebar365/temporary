package a.d.e.f;

import a.d.g;
import a.d.k;
import a.d.l;
import a.h;
import a.m;
import java.util.Date;

/* JADX INFO: compiled from: Smb2NegotiateResponse.java */
/* JADX INFO: loaded from: classes.dex */
public class f extends a.d.e.d implements l {
    private static final org.c.b a = org.c.c.a((Class<?>) f.class);
    private int b;
    private int c;
    private byte[] d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private long j;
    private long k;
    private c[] l;
    private byte[] m;
    private m n;
    private boolean o;
    private int p;
    private int q;

    public f(h hVar) {
        super(hVar);
        this.d = new byte[16];
        this.p = -1;
        this.q = -1;
    }

    @Override // a.d.l
    public final int m() {
        return v();
    }

    public final int s() {
        return this.c;
    }

    public final byte[] I() {
        return this.d;
    }

    @Override // a.d.l
    public final m e() {
        return this.n;
    }

    public final int U() {
        return this.q;
    }

    public final int V() {
        return this.e;
    }

    public final int W() {
        return this.f;
    }

    public final byte[] X() {
        return this.m;
    }

    public final int Y() {
        return this.b;
    }

    @Override // a.d.l
    public final boolean c(int i) {
        return (this.f & i) == i;
    }

    @Override // a.d.l
    public final boolean h() {
        return !q().d() && c(1);
    }

    @Override // a.d.l
    public final boolean a(a.c cVar) {
        return q().equals(cVar.a());
    }

    @Override // a.d.l
    public final boolean a(a.c cVar, k kVar) {
        boolean z;
        boolean z2;
        boolean z3;
        if (!D() || A() != 0) {
            return false;
        }
        if (kVar.g_() && !k_()) {
            a.e("Signing is enforced but server does not allow it");
            return false;
        }
        if (this.c == 767) {
            a.e("Server returned ANY dialect");
            return false;
        }
        e eVar = (e) kVar;
        m mVar = null;
        m[] mVarArrValues = m.values();
        int length = mVarArrValues.length;
        int i = 0;
        while (i < length) {
            m mVar2 = mVarArrValues[i];
            if (!mVar2.a() || mVar2.b() != this.c) {
                mVar2 = mVar;
            }
            i++;
            mVar = mVar2;
        }
        if (mVar == null) {
            a.e("Server returned an unknown dialect");
            return false;
        }
        if (!mVar.a(q().f()) || !mVar.b(q().g())) {
            a.e(String.format("Server selected an disallowed dialect version %s (min: %s max: %s)", mVar, q().f(), q().g()));
            return false;
        }
        this.n = mVar;
        this.f = eVar.l() & this.e;
        if ((this.f & 64) != 0) {
            this.o = cVar.a().V();
        }
        if (this.n.a(m.f)) {
            int i2 = this.f;
            if (this.l == null || this.l.length == 0) {
                a.e("Response lacks negotiate contexts");
                z = false;
            } else {
                boolean z4 = false;
                boolean z5 = false;
                c[] cVarArr = this.l;
                int length2 = cVarArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length2) {
                        c cVar2 = cVarArr[i3];
                        if (cVar2 != null) {
                            if (!z5 && cVar2.c() == 2) {
                                z5 = true;
                                a aVar = (a) cVar2;
                                if (aVar.b() == null || aVar.b().length != 1) {
                                    a.e("Server returned no cipher selection");
                                    z3 = false;
                                } else {
                                    a aVar2 = null;
                                    b[] bVarArrO = eVar.o();
                                    int length3 = bVarArrO.length;
                                    int i4 = 0;
                                    while (i4 < length3) {
                                        b bVar = bVarArrO[i4];
                                        i4++;
                                        aVar2 = bVar instanceof a ? (a) bVar : aVar2;
                                    }
                                    if (aVar2 == null) {
                                        z3 = false;
                                    } else {
                                        boolean z6 = false;
                                        int[] iArrB = aVar2.b();
                                        for (int i5 : iArrB) {
                                            if (i5 == aVar.b()[0]) {
                                                z6 = true;
                                            }
                                        }
                                        if (!z6) {
                                            a.e("Server returned invalid cipher selection");
                                            z3 = false;
                                        } else {
                                            z3 = true;
                                        }
                                    }
                                }
                                if (!z3) {
                                    z = false;
                                    break;
                                }
                                this.p = aVar.b()[0];
                                this.o = true;
                            } else {
                                if (cVar2.c() == 2) {
                                    a.e("Multiple encryption negotiate contexts");
                                    z = false;
                                    break;
                                }
                                if (!z4 && cVar2.c() == 1) {
                                    z4 = true;
                                    d dVar = (d) cVar2;
                                    if (dVar.b() == null || dVar.b().length != 1) {
                                        a.e("Server returned no hash selection");
                                        z2 = false;
                                    } else {
                                        d dVar2 = null;
                                        b[] bVarArrO2 = eVar.o();
                                        int length4 = bVarArrO2.length;
                                        int i6 = 0;
                                        while (i6 < length4) {
                                            b bVar2 = bVarArrO2[i6];
                                            i6++;
                                            dVar2 = bVar2 instanceof d ? (d) bVar2 : dVar2;
                                        }
                                        if (dVar2 == null) {
                                            z2 = false;
                                        } else {
                                            boolean z7 = false;
                                            int[] iArrB2 = dVar2.b();
                                            for (int i7 : iArrB2) {
                                                if (i7 == dVar.b()[0]) {
                                                    z7 = true;
                                                }
                                            }
                                            if (!z7) {
                                                a.e("Server returned invalid hash selection");
                                                z2 = false;
                                            } else {
                                                z2 = true;
                                            }
                                        }
                                    }
                                    if (!z2) {
                                        z = false;
                                        break;
                                    }
                                    this.q = dVar.b()[0];
                                } else if (cVar2.c() == 1) {
                                    a.e("Multiple preauth negotiate contexts");
                                    z = false;
                                    break;
                                }
                            }
                        }
                        i3++;
                        z5 = z5;
                        z4 = z4;
                    } else if (!z4) {
                        a.e("Missing preauth negotiate context");
                        z = false;
                    } else if (!z5 && (i2 & 64) != 0) {
                        a.e("Missing encryption negotiate context");
                        z = false;
                    } else {
                        if (!z5) {
                            a.b("No encryption support");
                        }
                        z = true;
                    }
                }
            }
            if (!z) {
                return false;
            }
        }
        int iAf = cVar.a().af();
        this.h = Math.min(iAf - 80, Math.min(cVar.a().p(), this.h)) & (-8);
        this.i = Math.min(iAf - 112, Math.min(cVar.a().q(), this.i)) & (-8);
        this.g = Math.min(iAf - 512, this.g) & (-8);
        return true;
    }

    @Override // a.d.l
    public final int i_() {
        return this.h;
    }

    @Override // a.d.l
    public final int j() {
        return this.i;
    }

    @Override // a.d.l
    public final boolean k_() {
        return (this.b & 1) != 0;
    }

    @Override // a.d.l
    public final boolean g() {
        return (this.b & 2) != 0;
    }

    @Override // a.d.l
    public final boolean j_() {
        return g();
    }

    @Override // a.d.l
    public final void a(a.d.b bVar) {
    }

    @Override // a.d.l
    public final void a(a.i.a.e eVar) {
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) throws g {
        c dVar;
        if (a.d.f.a.a(bArr, i) != 65) {
            throw new g("Structure size is not 65");
        }
        this.b = a.d.f.a.a(bArr, i + 2);
        int i2 = i + 4;
        this.c = a.d.f.a.a(bArr, i2);
        int iA = a.d.f.a.a(bArr, i2 + 2);
        int i3 = i2 + 4;
        System.arraycopy(bArr, i3, this.d, 0, 16);
        int i4 = i3 + 16;
        this.e = a.d.f.a.b(bArr, i4);
        int i5 = i4 + 4;
        this.g = a.d.f.a.b(bArr, i5);
        int i6 = i5 + 4;
        this.h = a.d.f.a.b(bArr, i6);
        int i7 = i6 + 4;
        this.i = a.d.f.a.b(bArr, i7);
        int i8 = i7 + 4;
        this.j = a.d.f.a.d(bArr, i8);
        int i9 = i8 + 8;
        this.k = a.d.f.a.d(bArr, i9);
        int i10 = i9 + 8;
        int iA2 = a.d.f.a.a(bArr, i10);
        int iA3 = a.d.f.a.a(bArr, i10 + 2);
        int i11 = i10 + 4;
        int iB = a.d.f.a.b(bArr, i11);
        int i12 = i11 + 4;
        int iM = M();
        if (iM + iA2 + iA3 < bArr.length) {
            this.m = new byte[iA3];
            System.arraycopy(bArr, iA2 + iM, this.m, 0, iA3);
            i12 += iA3;
        }
        int i13 = ((i12 - iM) % 8) + i12;
        int iM2 = M() + iB;
        if (this.c == 785 && iB != 0 && iA != 0) {
            c[] cVarArr = new c[iA];
            for (int i14 = 0; i14 < iA; i14++) {
                int iA4 = a.d.f.a.a(bArr, iM2);
                int iA5 = a.d.f.a.a(bArr, iM2 + 2);
                int i15 = iM2 + 4 + 4;
                switch (iA4) {
                    case 1:
                        dVar = new d();
                        break;
                    case 2:
                        dVar = new a();
                        break;
                    default:
                        dVar = null;
                        break;
                }
                if (dVar != null) {
                    dVar.a(bArr, i15, iA5);
                    cVarArr[i14] = dVar;
                }
                iM2 = i15 + iA5;
                if (i14 != iA - 1) {
                    iM2 += j(iM2);
                }
            }
            this.l = cVarArr;
        }
        return Math.max(i13, iM2) - i;
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.e.b
    public String toString() {
        return new String("Smb2NegotiateResponse[" + super.toString() + ",dialectRevision=" + this.c + ",securityMode=0x" + a.i.e.a(this.b, 1) + ",capabilities=0x" + a.i.e.a(this.e, 8) + ",serverTime=" + new Date(this.j));
    }

    @Override // a.d.l
    public final int h_() {
        return this.g;
    }
}
