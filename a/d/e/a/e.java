package a.d.e.a;

import a.h;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: Smb2CreateRequest.java */
/* JADX INFO: loaded from: classes.dex */
public class e extends a.d.e.c<f> implements a.d.f {
    private static final org.c.b a = org.c.c.a((Class<?>) e.class);
    private byte b;
    private byte c;
    private int d;
    private long e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private String k;
    private a[] l;
    private String m;
    private String n;
    private String o;
    private boolean p;

    public e(h hVar, String str) {
        super(hVar, 5);
        this.c = (byte) 0;
        this.d = 2;
        this.f = 1179785;
        this.h = 3;
        this.i = 1;
        this.j = 0;
        a(str);
    }

    @Override // a.d.f
    public final String l() {
        return "\\" + this.k;
    }

    @Override // a.d.f
    public final String o() {
        return this.m;
    }

    @Override // a.d.f
    public final String o_() {
        return this.o;
    }

    @Override // a.d.f
    public final String n() {
        return this.n;
    }

    @Override // a.d.f
    public final void a(String str, String str2, String str3) {
        this.n = str;
        this.o = str2;
        this.m = str3;
    }

    @Override // a.d.f
    public final void a(String str) {
        if (str.length() > 0 && str.charAt(0) == '\\') {
            str = str.substring(1);
        }
        if (str.length() > 1 && str.charAt(str.length() - 1) == '\\') {
            str = str.substring(0, str.length() - 1);
        }
        this.k = str;
    }

    @Override // a.d.f
    public final void p() {
        h(268435456);
        this.p = true;
    }

    public final void k(int i) {
        this.f = i;
    }

    public final void k() {
        this.g = 128;
    }

    public final void l(int i) {
        this.h = i;
    }

    public final void m(int i) {
        this.i = i;
    }

    public final void n(int i) {
        this.j = i;
    }

    @Override // a.d.c
    public final int l_() {
        int length = this.k.length() * 2;
        if (length == 0) {
            length++;
        }
        int i = i(length) + 120;
        if (this.l != null) {
            for (a aVar : this.l) {
                i += i(aVar.a());
            }
        }
        return i(i);
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        int length;
        if (a.c()) {
            a.b("Opening " + this.k);
            a.b("Flags are " + a.i.e.a(C(), 4));
        }
        a.d.f.a.a(57L, bArr, i);
        bArr[i + 2] = this.b;
        bArr[i + 3] = this.c;
        int i2 = i + 4;
        a.d.f.a.b(this.d, bArr, i2);
        int i3 = i2 + 4;
        a.d.f.a.c(this.e, bArr, i3);
        int i4 = i3 + 8 + 8;
        a.d.f.a.b(this.f, bArr, i4);
        int i5 = i4 + 4;
        a.d.f.a.b(this.g, bArr, i5);
        int i6 = i5 + 4;
        a.d.f.a.b(this.h, bArr, i6);
        int i7 = i6 + 4;
        a.d.f.a.b(this.i, bArr, i7);
        int i8 = i7 + 4;
        a.d.f.a.b(this.j, bArr, i8);
        int i9 = i8 + 4;
        byte[] bytes = this.k.getBytes(StandardCharsets.UTF_16LE);
        a.d.f.a.a(bytes.length, bArr, i9 + 2);
        int i10 = i9 + 4;
        int i11 = i10 + 4;
        int i12 = i11 + 4;
        a.d.f.a.a(i12 - M(), bArr, i9);
        System.arraycopy(bytes, 0, bArr, i12, bytes.length);
        if (bytes.length == 0) {
            length = i12 + 1;
        } else {
            length = bytes.length + i12;
        }
        int iJ = j(length) + length;
        if (this.l == null || this.l.length == 0) {
            a.d.f.a.b(0L, bArr, i10);
        } else {
            a.d.f.a.b(iJ - M(), bArr, i10);
        }
        int i13 = 0;
        if (this.l != null) {
            int i14 = -1;
            a[] aVarArr = this.l;
            int length2 = aVarArr.length;
            int i15 = 0;
            while (i15 < length2) {
                a aVar = aVarArr[i15];
                a.d.f.a.b(0L, bArr, iJ);
                if (i14 > 0) {
                    a.d.f.a.b(iJ - iJ, bArr, i14);
                }
                int i16 = iJ + 4;
                byte[] bArrB = aVar.b();
                a.d.f.a.a(bArrB.length, bArr, i16 + 2);
                int i17 = i16 + 4;
                int i18 = i17 + 2;
                int i19 = i17 + 4;
                int i20 = i19 + 4;
                a.d.f.a.a(i20 - iJ, bArr, i16);
                System.arraycopy(bArrB, 0, bArr, i20, bArrB.length);
                int length3 = bArrB.length + i20;
                int iJ2 = length3 + j(length3);
                a.d.f.a.a(iJ2 - iJ, bArr, i18);
                int iA = aVar.a(bArr, iJ2);
                a.d.f.a.b(iA, bArr, i19);
                int i21 = iJ2 + iA;
                int iJ3 = j(i21);
                i13 += iA + iJ3;
                int i22 = i21 + iJ3;
                i15++;
                i14 = iJ;
                iJ = i22;
            }
        }
        a.d.f.a.b(i13, bArr, i11);
        return iJ - i;
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.e.b
    public String toString() {
        return "[" + super.toString() + ",name=" + this.k + ",resolveDfs=" + this.p + "]";
    }

    @Override // a.d.e.c
    protected final /* synthetic */ a.d.e.d c(a.c cVar) {
        return new f(cVar.a(), this.k);
    }
}
