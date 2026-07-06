package org.bouncycastle.a;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends u {
    protected final boolean a;
    protected final int b;
    protected final byte[] c;

    a(boolean z, int i, byte[] bArr) {
        this.a = z;
        this.b = i;
        this.c = org.bouncycastle.f.a.b(bArr);
    }

    @Override // org.bouncycastle.a.u
    void a(s sVar) throws IOException {
        sVar.a(this.a ? 96 : 64, this.b, this.c);
    }

    @Override // org.bouncycastle.a.u
    public final boolean a() {
        return this.a;
    }

    @Override // org.bouncycastle.a.u
    final boolean a(u uVar) {
        if (!(uVar instanceof a)) {
            return false;
        }
        a aVar = (a) uVar;
        return this.a == aVar.a && this.b == aVar.b && org.bouncycastle.f.a.a(this.c, aVar.c);
    }

    public final byte[] b() {
        return org.bouncycastle.f.a.b(this.c);
    }

    public final int c() {
        return this.b;
    }

    @Override // org.bouncycastle.a.u
    final int e() {
        return ch.b(this.b) + ch.a(this.c.length) + this.c.length;
    }

    @Override // org.bouncycastle.a.u, org.bouncycastle.a.o
    public int hashCode() {
        return ((this.a ? 1 : 0) ^ this.b) ^ org.bouncycastle.f.a.a(this.c);
    }

    public final u d() throws IOException {
        int i;
        byte[] bArrK = k();
        if ((bArrK[0] & 31) == 31) {
            i = 2;
            int i2 = bArrK[1] & 255;
            if ((i2 & 127) == 0) {
                throw new IOException("corrupted stream - invalid high tag number found");
            }
            int i3 = i2;
            while ((i3 & 128) != 0) {
                i3 = bArrK[i] & 255;
                i++;
            }
        } else {
            i = 1;
        }
        byte[] bArr = new byte[(bArrK.length - i) + 1];
        System.arraycopy(bArrK, i, bArr, 1, bArr.length - 1);
        bArr[0] = 16;
        if ((bArrK[0] & 32) != 0) {
            bArr[0] = (byte) (bArr[0] | 32);
        }
        return u.b(bArr);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (this.a) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(this.b));
        stringBuffer.append("]");
        if (this.c != null) {
            stringBuffer.append(" #");
            stringBuffer.append(org.bouncycastle.f.a.f.a(this.c));
        } else {
            stringBuffer.append(" #null");
        }
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }
}
