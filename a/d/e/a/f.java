package a.d.e.a;

import a.d.g;
import a.d.i;
import a.h;
import java.util.LinkedList;

/* JADX INFO: compiled from: Smb2CreateResponse.java */
/* JADX INFO: loaded from: classes.dex */
public class f extends a.d.e.d implements i {
    private static final org.c.b a = org.c.c.a((Class<?>) f.class);
    private byte b;
    private byte c;
    private int d;
    private long e;
    private long f;
    private long g;
    private long h;
    private long i;
    private long j;
    private int k;
    private byte[] l;
    private b[] m;
    private final String n;

    public f(h hVar, String str) {
        super(hVar);
        this.l = new byte[16];
        this.n = str;
    }

    @Override // a.d.e.d, a.d.d
    public final void b(a.d.c cVar) {
        if (D() && (cVar instanceof a.d.e.a)) {
            ((a.d.e.a) cVar).a(this.l);
        }
        super.b(cVar);
    }

    @Override // a.d.i
    public final long e() {
        return this.f;
    }

    @Override // a.d.i
    public final long d() {
        return this.g;
    }

    public final long g() {
        return this.j;
    }

    public final byte[] h() {
        return this.l;
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) throws g {
        int iB;
        if (a.d.f.a.a(bArr, i) != 89) {
            throw new g("Structure size is not 89");
        }
        this.b = bArr[i + 2];
        this.c = bArr[i + 3];
        int i2 = i + 4;
        this.d = a.d.f.a.b(bArr, i2);
        int i3 = i2 + 4;
        this.e = a.d.f.a.d(bArr, i3);
        int i4 = i3 + 8;
        this.f = a.d.f.a.d(bArr, i4);
        int i5 = i4 + 8;
        this.g = a.d.f.a.d(bArr, i5);
        int i6 = i5 + 8;
        this.h = a.d.f.a.d(bArr, i6);
        int i7 = i6 + 8;
        this.i = a.d.f.a.c(bArr, i7);
        int i8 = i7 + 8;
        this.j = a.d.f.a.c(bArr, i8);
        int i9 = i8 + 8;
        this.k = a.d.f.a.b(bArr, i9);
        int i10 = i9 + 4 + 4;
        System.arraycopy(bArr, i10, this.l, 0, 16);
        int i11 = i10 + 16;
        int iB2 = a.d.f.a.b(bArr, i11);
        int i12 = i11 + 4;
        int iB3 = a.d.f.a.b(bArr, i12);
        int iMax = i12 + 4;
        if (iB2 > 0 && iB3 > 0) {
            LinkedList linkedList = new LinkedList();
            int iM = M() + iB2;
            do {
                iB = a.d.f.a.b(bArr, iM);
                int i13 = iM + 4;
                int iA = a.d.f.a.a(bArr, i13);
                int iA2 = a.d.f.a.a(bArr, i13 + 2);
                int i14 = i13 + 4;
                int iA3 = a.d.f.a.a(bArr, i14 + 2);
                int i15 = i14 + 4;
                int iB4 = a.d.f.a.b(bArr, i15);
                byte[] bArr2 = new byte[iA2];
                System.arraycopy(bArr, iM + iA, bArr2, 0, bArr2.length);
                int iMax2 = Math.max(Math.max(i15 + 4, iA + iM + iA2), iM + iA3 + iB4);
                if (iB > 0) {
                    iM += iB;
                }
                iMax = Math.max(iMax, iMax2);
            } while (iB > 0);
            this.m = (b[]) linkedList.toArray(new b[0]);
        }
        if (a.c()) {
            a.b("Opened " + this.n + ": " + a.i.e.a(this.l));
        }
        return iMax - i;
    }

    @Override // a.d.i
    public final long b_() {
        return this.e;
    }

    @Override // a.d.i
    public final long c_() {
        return this.j;
    }

    @Override // a.d.i
    public final int b() {
        return this.k;
    }
}
