package a.d.d.b;

import a.g.j;
import a.h;

/* JADX INFO: compiled from: NetServerEnum2Response.java */
/* JADX INFO: loaded from: classes.dex */
public class b extends a.d.d.c.b {
    private static final org.c.b C = org.c.c.a((Class<?>) b.class);
    private int D;
    private int E;
    private String F;

    public b(h hVar) {
        super(hVar);
    }

    public final String q() {
        return this.F;
    }

    @Override // a.d.d.c.b
    protected final int j(byte[] bArr, int i) {
        j(a.d.f.a.a(bArr, i));
        int i2 = i + 2;
        this.D = a.d.f.a.a(bArr, i2);
        int i3 = i2 + 2;
        k(a.d.f.a.a(bArr, i3));
        int i4 = i3 + 2;
        this.E = a.d.f.a.a(bArr, i4);
        return (i4 + 2) - i;
    }

    @Override // a.d.d.c.b
    protected final int a(byte[] bArr, int i, int i2) {
        j[] jVarArr = new b$a[aa()];
        b$a b_a = null;
        int i3 = i;
        for (int i4 = 0; i4 < aa(); i4++) {
            b_a = new b$a(this);
            jVarArr[i4] = b_a;
            b_a.a = a(bArr, i3, 16, false);
            int i5 = i3 + 16;
            int i6 = i5 + 1;
            b_a.b = bArr[i5] & 255;
            int i7 = i6 + 1;
            b_a.c = bArr[i6] & 255;
            b_a.d = a.d.f.a.b(bArr, i7);
            int i8 = i7 + 4;
            int iB = a.d.f.a.b(bArr, i8);
            i3 = i8 + 4;
            b_a.e = a(bArr, ((iB & 65535) - this.D) + i, 48, false);
            if (C.b()) {
                C.a(b_a.toString());
            }
        }
        a(jVarArr);
        this.F = b_a != null ? b_a.a : null;
        return i3 - i;
    }

    @Override // a.d.d.c.b, a.d.d.c
    public String toString() {
        return new String("NetServerEnum2Response[" + super.toString() + ",status=" + Z() + ",converter=" + this.D + ",entriesReturned=" + aa() + ",totalAvailableEntries=" + this.E + ",lastName=" + this.F + "]");
    }
}
