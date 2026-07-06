package org.bouncycastle.b;

/* JADX INFO: loaded from: classes.dex */
public class f {
    protected byte[] a;
    protected int b;
    protected boolean c;
    protected e d;
    protected boolean e;
    protected boolean f;

    protected f() {
    }

    public f(e eVar) {
        boolean z = true;
        this.d = eVar;
        this.a = new byte[eVar.b()];
        this.b = 0;
        String strA = eVar.a();
        int iIndexOf = strA.indexOf(47) + 1;
        this.f = iIndexOf > 0 && strA.startsWith("PGP", iIndexOf);
        if (!this.f && !(eVar instanceof ao) && (iIndexOf <= 0 || !strA.startsWith("OpenPGP", iIndexOf))) {
            z = false;
        }
        this.e = z;
    }

    public int a(int i) {
        int i2 = i + this.b;
        int length = (this.f && this.c) ? (i2 % this.a.length) - (this.d.b() + 2) : i2 % this.a.length;
        return i2 - length;
    }

    public int a(byte[] bArr, int i) {
        int i2 = 0;
        try {
            if (this.b + i > bArr.length) {
                throw new ac("output buffer too short for doFinal()");
            }
            if (this.b != 0) {
                if (!this.e) {
                    throw new o("data not block size aligned");
                }
                this.d.a(this.a, 0, this.a, 0);
                i2 = this.b;
                this.b = 0;
                System.arraycopy(this.a, 0, bArr, i, i2);
            }
            return i2;
        } finally {
            c();
        }
    }

    public int a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int iA;
        int i4;
        int i5;
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int iB = b();
        int iA2 = a(i2);
        if (iA2 > 0 && iA2 + i3 > bArr2.length) {
            throw new ac("output buffer too short");
        }
        int length = this.a.length - this.b;
        if (i2 > length) {
            System.arraycopy(bArr, i, this.a, this.b, length);
            iA = this.d.a(this.a, 0, bArr2, i3) + 0;
            this.b = 0;
            i4 = i2 - length;
            i5 = length + i;
            while (i4 > this.a.length) {
                iA += this.d.a(bArr, i5, bArr2, i3 + iA);
                i4 -= iB;
                i5 += iB;
            }
        } else {
            iA = 0;
            i4 = i2;
            i5 = i;
        }
        System.arraycopy(bArr, i5, this.a, this.b, i4);
        this.b = i4 + this.b;
        if (this.b != this.a.length) {
            return iA;
        }
        int iA3 = iA + this.d.a(this.a, 0, bArr2, i3 + iA);
        this.b = 0;
        return iA3;
    }

    public final e a() {
        return this.d;
    }

    public void a(boolean z, i iVar) {
        this.c = z;
        c();
        this.d.a(z, iVar);
    }

    public final int b() {
        return this.d.b();
    }

    public int b(int i) {
        return this.b + i;
    }

    public final void c() {
        for (int i = 0; i < this.a.length; i++) {
            this.a[i] = 0;
        }
        this.b = 0;
        this.d.c();
    }
}
