package org.bouncycastle.b.h;

import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.z;

/* JADX INFO: loaded from: classes.dex */
public final class c implements z {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private byte[] d;
    private int e;
    private org.bouncycastle.b.e f;
    private int g;
    private byte[] h;
    private byte[] i;

    public c(org.bouncycastle.b.e eVar) {
        this(eVar, eVar.b() * 8);
    }

    @Override // org.bouncycastle.b.z
    public final int a(byte[] bArr, int i) {
        byte[] bArr2;
        if (this.e == this.f.b()) {
            bArr2 = this.h;
        } else {
            new org.bouncycastle.b.j.c().a(this.d, this.e);
            bArr2 = this.i;
        }
        for (int i2 = 0; i2 < this.c.length; i2++) {
            byte[] bArr3 = this.d;
            bArr3[i2] = (byte) (bArr3[i2] ^ bArr2[i2]);
        }
        this.f.a(this.d, 0, this.c, 0);
        System.arraycopy(this.c, 0, bArr, i, this.g);
        c();
        return this.g;
    }

    @Override // org.bouncycastle.b.z
    public final String a() {
        return this.f.a();
    }

    @Override // org.bouncycastle.b.z
    public final void a(byte b) {
        if (this.e == this.d.length) {
            this.f.a(this.d, 0, this.c, 0);
            this.e = 0;
        }
        byte[] bArr = this.d;
        int i = this.e;
        this.e = i + 1;
        bArr[i] = b;
    }

    @Override // org.bouncycastle.b.z
    public final void a(byte[] bArr, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int iB = this.f.b();
        int i3 = iB - this.e;
        if (i2 > i3) {
            System.arraycopy(bArr, i, this.d, this.e, i3);
            this.f.a(this.d, 0, this.c, 0);
            this.e = 0;
            i2 -= i3;
            i += i3;
            while (i2 > iB) {
                this.f.a(bArr, i, this.c, 0);
                i2 -= iB;
                i += iB;
            }
        }
        System.arraycopy(bArr, i, this.d, this.e, i2);
        this.e += i2;
    }

    @Override // org.bouncycastle.b.z
    public final int b() {
        return this.g;
    }

    @Override // org.bouncycastle.b.z
    public final void c() {
        for (int i = 0; i < this.d.length; i++) {
            this.d[i] = 0;
        }
        this.e = 0;
        this.f.c();
    }

    private c(org.bouncycastle.b.e eVar, int i) {
        int i2 = 27;
        if (i % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        if (i > eVar.b() * 8) {
            throw new IllegalArgumentException("MAC size must be less or equal to " + (eVar.b() * 8));
        }
        this.f = new org.bouncycastle.b.i.b(eVar);
        this.g = i / 8;
        int iB = eVar.b();
        switch (iB * 8) {
            case 64:
            case 320:
                break;
            case 128:
                i2 = 135;
                break;
            case 160:
                i2 = 45;
                break;
            case 192:
                i2 = 135;
                break;
            case 224:
                i2 = 777;
                break;
            case 256:
                i2 = 1061;
                break;
            case 384:
                i2 = 4109;
                break;
            case 448:
                i2 = 2129;
                break;
            case 512:
                i2 = 293;
                break;
            case 768:
                i2 = 655377;
                break;
            case 1024:
                i2 = 524355;
                break;
            case 2048:
                i2 = 548865;
                break;
            default:
                throw new IllegalArgumentException("Unknown block size for CMAC: " + (iB * 8));
        }
        this.a = org.bouncycastle.f.g.a(i2);
        this.c = new byte[eVar.b()];
        this.d = new byte[eVar.b()];
        this.b = new byte[eVar.b()];
        this.e = 0;
    }

    private byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                int i2 = (-i) & 255;
                int length2 = bArr.length - 3;
                bArr2[length2] = (byte) (bArr2[length2] ^ (this.a[1] & i2));
                int length3 = bArr.length - 2;
                bArr2[length3] = (byte) (bArr2[length3] ^ (this.a[2] & i2));
                int length4 = bArr.length - 1;
                bArr2[length4] = (byte) ((i2 & this.a[3]) ^ bArr2[length4]);
                return bArr2;
            }
            int i3 = bArr[length] & 255;
            bArr2[length] = (byte) (i | (i3 << 1));
            i = (i3 >>> 7) & 1;
        }
    }

    @Override // org.bouncycastle.b.z
    public final void a(org.bouncycastle.b.i iVar) {
        if (iVar != null && !(iVar instanceof ba)) {
            throw new IllegalArgumentException("CMac mode only permits key to be set.");
        }
        this.f.a(true, iVar);
        byte[] bArr = new byte[this.b.length];
        this.f.a(this.b, 0, bArr, 0);
        this.h = a(bArr);
        this.i = a(this.h);
        c();
    }
}
