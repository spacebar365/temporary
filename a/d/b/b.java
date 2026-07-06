package a.d.b;

import a.d.g;
import a.g.v;

/* JADX INFO: compiled from: SecurityDescriptor.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c {
    private int a;
    private a[] b;
    private v c;
    private v d;

    @Override // a.j
    public final int a(byte[] bArr, int i, int i2) throws g {
        int i3 = i + 1 + 1;
        this.a = a.d.f.a.a(bArr, i3);
        int i4 = i3 + 2;
        int iB = a.d.f.a.b(bArr, i4);
        int i5 = i4 + 4;
        int iB2 = a.d.f.a.b(bArr, i5);
        int i6 = i5 + 4;
        a.d.f.a.b(bArr, i6);
        int iB3 = a.d.f.a.b(bArr, i6 + 4);
        if (iB > 0) {
            this.c = new v(bArr, i + iB);
        }
        if (iB2 > 0) {
            this.d = new v(bArr, i + iB2);
        }
        int iA = i + iB3;
        if (iB3 > 0) {
            int i7 = iA + 1 + 1;
            a.d.f.a.a(bArr, i7);
            int i8 = i7 + 2;
            int iB4 = a.d.f.a.b(bArr, i8);
            iA = i8 + 4;
            if (iB4 > 4096) {
                throw new g("Invalid SecurityDescriptor");
            }
            this.b = new a[iB4];
            for (int i9 = 0; i9 < iB4; i9++) {
                this.b[i9] = new a();
                iA += this.b[i9].a(bArr, iA, i2 - iA);
            }
        } else {
            this.b = null;
        }
        return iA - i;
    }

    public final String toString() {
        String str = "SecurityDescriptor:\n";
        if (this.b == null) {
            return "SecurityDescriptor:\nNULL";
        }
        for (int i = 0; i < this.b.length; i++) {
            str = str + this.b[i].toString() + "\n";
        }
        return str;
    }
}
