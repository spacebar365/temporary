package a.d.d.b;

import a.g.j;
import a.h;

/* JADX INFO: compiled from: NetShareEnumResponse.java */
/* JADX INFO: loaded from: classes.dex */
public class d extends a.d.d.c.b {
    private static final org.c.b C = org.c.c.a((Class<?>) d.class);
    private int D;
    private int E;

    public d(h hVar) {
        super(hVar);
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
        b(false);
        j[] jVarArr = new e[aa()];
        int i3 = i;
        for (int i4 = 0; i4 < aa(); i4++) {
            e eVar = new e();
            jVarArr[i4] = eVar;
            eVar.b = a(bArr, i3, 13, false);
            int i5 = i3 + 14;
            eVar.c = a.d.f.a.a(bArr, i5);
            int i6 = i5 + 2;
            int iB = a.d.f.a.b(bArr, i6);
            i3 = i6 + 4;
            eVar.d = a(bArr, ((iB & 65535) - this.D) + i, 128, false);
            if (C.b()) {
                C.a(eVar.toString());
            }
        }
        a(jVarArr);
        return i3 - i;
    }

    @Override // a.d.d.c.b, a.d.d.c
    public String toString() {
        return new String("NetShareEnumResponse[" + super.toString() + ",status=" + Z() + ",converter=" + this.D + ",entriesReturned=" + aa() + ",totalAvailableEntries=" + this.E + "]");
    }
}
