package org.bouncycastle.b.i;

import org.bouncycastle.b.ac;
import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.k.be;

/* JADX INFO: loaded from: classes.dex */
public final class q implements a {
    private org.bouncycastle.b.e a;
    private org.bouncycastle.b.f b;
    private boolean d;
    private byte[] e;
    private byte[] f;
    private byte[] g;
    private org.bouncycastle.b.i.b.a h;
    private long[] i;
    private final int j;
    private q$a k = new q$a(this);
    private q$a l = new q$a(this);
    private int c = -1;

    private void a(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i2;
        while (i < i4) {
            a(this.i, bArr, i);
            this.h.b(this.i);
            i += this.j;
        }
        long[] jArr = this.i;
        jArr[0] = ((((long) i3) & 4294967295L) << 3) ^ jArr[0];
        long[] jArr2 = this.i;
        int i5 = this.j >>> 4;
        jArr2[i5] = ((((long) i2) & 4294967295L) << 3) ^ jArr2[i5];
        this.f = org.bouncycastle.f.g.a(this.i);
        this.a.a(this.f, 0, this.f, 0);
    }

    private static void a(long[] jArr, byte[] bArr, int i) {
        for (int i2 = 0; i2 < jArr.length; i2++) {
            jArr[i2] = jArr[i2] ^ org.bouncycastle.f.g.d(bArr, i);
            i += 8;
        }
    }

    @Override // org.bouncycastle.b.i.a
    public final int a(int i) {
        return 0;
    }

    @Override // org.bouncycastle.b.i.a
    public final int a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr.length < i + i2) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        this.l.write(bArr, i, i2);
        return 0;
    }

    @Override // org.bouncycastle.b.i.a
    public final org.bouncycastle.b.e a() {
        return this.a;
    }

    public final void a(byte b) {
        this.k.write(b);
    }

    @Override // org.bouncycastle.b.i.a
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        ba baVarA;
        this.d = z;
        if (iVar instanceof org.bouncycastle.b.k.a) {
            org.bouncycastle.b.k.a aVar = (org.bouncycastle.b.k.a) iVar;
            byte[] bArrD = aVar.d();
            int length = this.g.length - bArrD.length;
            org.bouncycastle.f.a.a(this.g, (byte) 0);
            System.arraycopy(bArrD, 0, this.g, length, bArrD.length);
            this.e = aVar.c();
            int iB = aVar.b();
            if (iB < 64 || iB > (this.j << 3) || (iB & 7) != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: ".concat(String.valueOf(iB)));
            }
            this.c = iB >>> 3;
            baVarA = aVar.a();
            if (this.e != null) {
                a(this.e, 0, this.e.length);
            }
        } else {
            if (!(iVar instanceof be)) {
                throw new IllegalArgumentException("Invalid parameter passed");
            }
            be beVar = (be) iVar;
            byte[] bArrA = beVar.a();
            int length2 = this.g.length - bArrA.length;
            org.bouncycastle.f.a.a(this.g, (byte) 0);
            System.arraycopy(bArrA, 0, this.g, length2, bArrA.length);
            this.e = null;
            this.c = this.j;
            baVarA = (ba) beVar.b();
        }
        this.f = new byte[this.j];
        this.b.a(true, (org.bouncycastle.b.i) new be(baVarA, this.g));
        this.a.a(true, baVarA);
    }

    @Override // org.bouncycastle.b.i.a
    public final void a(byte[] bArr, int i, int i2) {
        this.k.write(bArr, i, i2);
    }

    @Override // org.bouncycastle.b.i.a
    public final int b(int i) {
        int size = this.l.size() + i;
        if (this.d) {
            return size + this.c;
        }
        if (size < this.c) {
            return 0;
        }
        return size - this.c;
    }

    @Override // org.bouncycastle.b.i.a
    public final byte[] b() {
        byte[] bArr = new byte[this.c];
        System.arraycopy(this.f, 0, bArr, 0, this.c);
        return bArr;
    }

    public final void c() {
        org.bouncycastle.f.a.a(this.i);
        this.a.c();
        this.l.reset();
        this.k.reset();
        if (this.e != null) {
            a(this.e, 0, this.e.length);
        }
    }

    public q(org.bouncycastle.b.e eVar) {
        org.bouncycastle.b.i.b.a eVar2;
        this.a = eVar;
        this.b = new org.bouncycastle.b.f(new p(this.a));
        this.j = this.a.b();
        this.e = new byte[this.j];
        this.g = new byte[this.j];
        switch (this.j) {
            case 16:
                eVar2 = new org.bouncycastle.b.i.b.f();
                break;
            case 32:
                eVar2 = new org.bouncycastle.b.i.b.g();
                break;
            case 64:
                eVar2 = new org.bouncycastle.b.i.b.e();
                break;
            default:
                throw new IllegalArgumentException("Only 128, 256, and 512 -bit block sizes supported");
        }
        this.h = eVar2;
        this.i = new long[this.j >>> 3];
        this.f = null;
    }

    @Override // org.bouncycastle.b.i.a
    public final int a(byte[] bArr, int i) throws org.bouncycastle.b.v {
        int iA;
        int size = this.l.size();
        if (!this.d && size < this.c) {
            throw new org.bouncycastle.b.v("data too short");
        }
        byte[] bArr2 = new byte[this.j];
        this.a.a(bArr2, 0, bArr2, 0);
        long[] jArr = new long[this.j >>> 3];
        org.bouncycastle.f.g.b(bArr2, 0, jArr);
        this.h.a(jArr);
        org.bouncycastle.f.a.a(bArr2, (byte) 0);
        org.bouncycastle.f.a.a(jArr);
        int size2 = this.k.size();
        if (size2 > 0) {
            byte[] bArrA = this.k.a();
            int i2 = size2 + 0;
            int i3 = 0;
            while (i3 < i2) {
                a(this.i, bArrA, i3);
                this.h.b(this.i);
                i3 += this.j;
            }
        }
        if (!this.d) {
            int i4 = size - this.c;
            if (bArr.length - i < i4) {
                throw new ac("Output buffer too short");
            }
            a(this.l.a(), 0, i4, size2);
            int iA2 = this.b.a(this.l.a(), 0, i4, bArr, i);
            iA = iA2 + this.b.a(bArr, i + iA2);
        } else {
            if ((bArr.length - i) - this.c < size) {
                throw new ac("Output buffer too short");
            }
            int iA3 = this.b.a(this.l.a(), 0, size, bArr, i);
            iA = iA3 + this.b.a(bArr, i + iA3);
            a(bArr, i, size, size2);
        }
        if (this.f == null) {
            throw new IllegalStateException("mac is not calculated");
        }
        if (this.d) {
            System.arraycopy(this.f, 0, bArr, i + iA, this.c);
            c();
            return iA + this.c;
        }
        byte[] bArr3 = new byte[this.c];
        System.arraycopy(this.l.a(), size - this.c, bArr3, 0, this.c);
        byte[] bArr4 = new byte[this.c];
        System.arraycopy(this.f, 0, bArr4, 0, this.c);
        if (!org.bouncycastle.f.a.b(bArr3, bArr4)) {
            throw new org.bouncycastle.b.v("mac verification failed");
        }
        c();
        return iA;
    }
}
