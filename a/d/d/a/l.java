package a.d.d.a;

import java.util.Date;

/* JADX INFO: compiled from: SmbComOpenAndX.java */
/* JADX INFO: loaded from: classes.dex */
public final class l extends a.d.d.a {
    int n;
    int o;
    int p;
    int q;
    int r;
    int s;
    int t;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l(a.h r5, java.lang.String r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            r3 = 2
            r2 = 16
            r0 = 45
            r4.<init>(r5, r0, r6)
            r0 = 128(0x80, float:1.8E-43)
            r4.q = r0
            r0 = r7 & 3
            r4.o = r0
            int r0 = r4.o
            r1 = 3
            if (r0 != r1) goto L17
            r4.o = r3
        L17:
            r0 = r8 & 1
            if (r0 == 0) goto L3e
            r0 = r8 & 2
            if (r0 == 0) goto L3e
            int r0 = r4.o
            r0 = r0 | 64
            r4.o = r0
        L25:
            int r0 = r4.o
            r0 = r0 & (-2)
            r4.o = r0
            r0 = 22
            r4.p = r0
            r0 = r9 & 64
            r1 = 64
            if (r0 != r1) goto L60
            r0 = r9 & 16
            if (r0 != r2) goto L5d
            r0 = 18
            r4.s = r0
        L3d:
            return
        L3e:
            if (r8 == 0) goto L56
            r0 = r8 & 2
            if (r0 != 0) goto L4b
            int r0 = r4.o
            r0 = r0 | 32
            r4.o = r0
            goto L25
        L4b:
            r0 = r8 & 1
            if (r0 != 0) goto L56
            int r0 = r4.o
            r0 = r0 | 48
            r4.o = r0
            goto L25
        L56:
            int r0 = r4.o
            r0 = r0 | 16
            r4.o = r0
            goto L25
        L5d:
            r4.s = r3
            goto L3d
        L60:
            r0 = r9 & 16
            if (r0 != r2) goto L72
            r0 = r9 & 32
            r1 = 32
            if (r0 != r1) goto L6d
            r4.s = r2
            goto L3d
        L6d:
            r0 = 17
            r4.s = r0
            goto L3d
        L72:
            r0 = 1
            r4.s = r0
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d.d.a.l.<init>(a.h, java.lang.String, int, int, int):void");
    }

    @Override // a.d.d.a
    protected final int a(a.h hVar, byte b) {
        if (b == 46) {
            return hVar.a("OpenAndX.ReadAndX");
        }
        return 0;
    }

    @Override // a.d.d.c
    protected final int f(byte[] bArr, int i) {
        a.d.f.a.a(this.n, bArr, i);
        int i2 = i + 2;
        a.d.f.a.a(this.o, bArr, i2);
        int i3 = i2 + 2;
        a.d.f.a.a(this.p, bArr, i3);
        int i4 = i3 + 2;
        a.d.f.a.a(this.q, bArr, i4);
        int i5 = i4 + 2;
        this.r = 0;
        a.d.f.a.b(this.r, bArr, i5);
        int i6 = i5 + 4;
        a.d.f.a.a(this.s, bArr, i6);
        int i7 = i6 + 2;
        a.d.f.a.b(this.t, bArr, i7);
        int i8 = i7 + 4;
        int i9 = 0;
        while (i9 < 8) {
            bArr[i8] = 0;
            i9++;
            i8++;
        }
        return i8 - i;
    }

    @Override // a.d.d.c
    protected final int g(byte[] bArr, int i) {
        int i2;
        if (C()) {
            i2 = i + 1;
            bArr[i] = 0;
        } else {
            i2 = i;
        }
        return (i2 + a(this.l, bArr, i2)) - i;
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
        return new String("SmbComOpenAndX[" + super.toString() + ",flags=0x" + a.i.e.a(this.n, 2) + ",desiredAccess=0x" + a.i.e.a(this.o, 4) + ",searchAttributes=0x" + a.i.e.a(this.p, 4) + ",fileAttributes=0x" + a.i.e.a(this.q, 4) + ",creationTime=" + new Date(this.r) + ",openFunction=0x" + a.i.e.a(this.s, 2) + ",allocationSize=" + this.t + ",fileName=" + this.l + "]");
    }
}
