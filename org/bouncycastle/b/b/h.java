package org.bouncycastle.b.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements org.bouncycastle.b.u, org.bouncycastle.f.e {
    private final byte[] a;
    private int b;
    private long c;

    protected h() {
        this.a = new byte[4];
        this.b = 0;
    }

    protected h(h hVar) {
        this.a = new byte[4];
        a(hVar);
    }

    @Override // org.bouncycastle.b.r
    public final void a(byte b) {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        bArr[i] = b;
        if (this.b == this.a.length) {
            b(this.a, 0);
            this.b = 0;
        }
        this.c++;
    }

    protected abstract void a(long j);

    protected final void a(h hVar) {
        System.arraycopy(hVar.a, 0, this.a, 0, hVar.a.length);
        this.b = hVar.b;
        this.c = hVar.c;
    }

    @Override // org.bouncycastle.b.r
    public final void a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int iMax = Math.max(0, i2);
        if (this.b != 0) {
            int i4 = 0;
            while (true) {
                if (i4 >= iMax) {
                    i3 = i4;
                    break;
                }
                byte[] bArr2 = this.a;
                int i5 = this.b;
                this.b = i5 + 1;
                int i6 = i4 + 1;
                bArr2[i5] = bArr[i4 + i];
                if (this.b == 4) {
                    b(this.a, 0);
                    this.b = 0;
                    i3 = i6;
                    break;
                }
                i4 = i6;
            }
        }
        int i7 = ((iMax - i3) & (-4)) + i3;
        while (i3 < i7) {
            b(bArr, i + i3);
            i3 += 4;
        }
        while (i3 < iMax) {
            byte[] bArr3 = this.a;
            int i8 = this.b;
            this.b = i8 + 1;
            bArr3[i8] = bArr[i3 + i];
            i3++;
        }
        this.c += (long) iMax;
    }

    protected abstract void b(byte[] bArr, int i);

    @Override // org.bouncycastle.b.r
    public void c() {
        this.c = 0L;
        this.b = 0;
        for (int i = 0; i < this.a.length; i++) {
            this.a[i] = 0;
        }
    }

    @Override // org.bouncycastle.b.u
    public final int d() {
        return 64;
    }

    public final void f() {
        long j = this.c << 3;
        a((byte) -128);
        while (this.b != 0) {
            a((byte) 0);
        }
        a(j);
        g();
    }

    protected abstract void g();
}
