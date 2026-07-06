package a.c.b;

import a.i.f;

/* JADX INFO: compiled from: NdrBuffer.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public byte[] a;
    public int b;
    public int c;
    public int d = 0;
    public a e = this;

    public a(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = i;
    }

    public final a a(int i) {
        a aVar = new a(this.a, this.b);
        aVar.c = i;
        aVar.e = this.e;
        return aVar;
    }

    public final void a() {
        this.c = this.b;
        this.d = 0;
        this.e = this;
    }

    public final void b(int i) {
        this.e.d = i;
    }

    public final void c(int i) {
        this.c += i;
        if (this.c - this.b > this.e.d) {
            this.e.d = this.c - this.b;
        }
    }

    public final int d(int i) {
        int i2 = i - 1;
        int i3 = this.c - this.b;
        int i4 = ((i2 ^ (-1)) & (i3 + i2)) - i3;
        c(i4);
        return i4;
    }

    public final void e(int i) {
        this.a[this.c] = (byte) (i & 255);
        c(1);
    }

    public final int b() {
        int i = this.a[this.c] & 255;
        c(1);
        return i;
    }

    public final void f(int i) {
        d(2);
        a.i.c.a((short) i, this.a, this.c);
        c(2);
    }

    public final int c() {
        d(2);
        short sA = a.i.c.a(this.a, this.c);
        c(2);
        return sA;
    }

    public final void g(int i) {
        d(4);
        a.i.c.a(i, this.a, this.c);
        c(4);
    }

    public final int d() {
        d(4);
        int iB = a.i.c.b(this.a, this.c);
        c(4);
        return iB;
    }

    public final void a(String str) {
        d(4);
        int i = this.c;
        int length = str.length();
        a.i.c.a(length + 1, this.a, i);
        int i2 = i + 4;
        a.i.c.a(0, this.a, i2);
        int i3 = i2 + 4;
        a.i.c.a(length + 1, this.a, i3);
        int i4 = i3 + 4;
        System.arraycopy(f.a(str), 0, this.a, i4, length * 2);
        int i5 = i4 + (length * 2);
        int i6 = i5 + 1;
        this.a[i5] = 0;
        this.a[i6] = 0;
        c((i6 + 1) - this.c);
    }

    public final String e() throws b {
        d(4);
        int i = this.c;
        String strA = null;
        int iB = a.i.c.b(this.a, i);
        int i2 = i + 12;
        if (iB != 0) {
            int i3 = (iB - 1) * 2;
            if (i3 < 0 || i3 > 65535) {
                throw new b("invalid array conformance");
            }
            strA = f.a(this.a, i2, i3);
            i2 += i3 + 2;
        }
        c(i2 - this.c);
        return strA;
    }

    public final void a(Object obj) {
        if (obj == null) {
            g(0);
        } else {
            g(System.identityHashCode(obj));
        }
    }

    public final String toString() {
        return "start=" + this.b + ",index=" + this.c + ",length=" + this.e.d;
    }
}
