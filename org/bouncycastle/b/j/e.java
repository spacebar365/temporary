package org.bouncycastle.b.j;

import java.security.SecureRandom;
import org.bouncycastle.b.ac;
import org.bouncycastle.b.i;
import org.bouncycastle.b.k.bf;
import org.bouncycastle.b.o;

/* JADX INFO: loaded from: classes.dex */
public final class e extends org.bouncycastle.b.f {
    a g;

    public e(org.bouncycastle.b.e eVar) {
        this(eVar, new d());
    }

    public e(org.bouncycastle.b.e eVar, a aVar) {
        this.d = eVar;
        this.g = aVar;
        this.a = new byte[eVar.b()];
        this.b = 0;
    }

    @Override // org.bouncycastle.b.f
    public final int a(int i) {
        int i2 = this.b + i;
        int length = i2 % this.a.length;
        return length == 0 ? Math.max(0, i2 - this.a.length) : i2 - length;
    }

    @Override // org.bouncycastle.b.f
    public final int a(byte[] bArr, int i) {
        int iA;
        int iB = this.d.b();
        if (this.c) {
            if (this.b != iB) {
                iA = 0;
            } else {
                if ((iB * 2) + i > bArr.length) {
                    c();
                    throw new ac("output buffer too short");
                }
                iA = this.d.a(this.a, 0, bArr, i);
                this.b = 0;
            }
            this.g.a(this.a, this.b);
            return iA + this.d.a(this.a, 0, bArr, i + iA);
        }
        if (this.b != iB) {
            c();
            throw new o("last block incomplete in decryption");
        }
        int iA2 = this.d.a(this.a, 0, this.a, 0);
        this.b = 0;
        try {
            int iA3 = iA2 - this.g.a(this.a);
            System.arraycopy(this.a, 0, bArr, i, iA3);
            return iA3;
        } finally {
            c();
        }
    }

    @Override // org.bouncycastle.b.f
    public final int a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int iA;
        int i4;
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
            int i5 = i2 - length;
            i4 = length + i;
            while (i5 > this.a.length) {
                iA += this.d.a(bArr, i4, bArr2, i3 + iA);
                i5 -= iB;
                i4 += iB;
            }
            i2 = i5;
        } else {
            iA = 0;
            i4 = i;
        }
        System.arraycopy(bArr, i4, this.a, this.b, i2);
        this.b += i2;
        return iA;
    }

    @Override // org.bouncycastle.b.f
    public final void a(boolean z, i iVar) {
        this.c = z;
        c();
        if (!(iVar instanceof bf)) {
            this.g.a((SecureRandom) null);
            this.d.a(z, iVar);
        } else {
            bf bfVar = (bf) iVar;
            this.g.a(bfVar.a());
            this.d.a(z, bfVar.b());
        }
    }

    @Override // org.bouncycastle.b.f
    public final int b(int i) {
        int i2 = this.b + i;
        int length = i2 % this.a.length;
        return length == 0 ? this.c ? i2 + this.a.length : i2 : (i2 - length) + this.a.length;
    }
}
