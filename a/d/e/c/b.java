package a.d.e.c;

import a.d.g;
import a.h;

/* JADX INFO: compiled from: Smb2ReadResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a.d.e.d {
    private int a;
    private int b;
    private byte[] c;
    private int d;

    public b(h hVar, byte[] bArr, int i) {
        super(hVar);
        this.c = bArr;
        this.d = i;
    }

    public final int e() {
        return this.b;
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) throws g {
        int iA = a.d.f.a.a(bArr, i);
        if (iA == 9) {
            return c(bArr, i);
        }
        if (iA != 17) {
            throw new g("Expected structureSize = 17");
        }
        short s = bArr[i + 2];
        int i2 = i + 4;
        this.b = a.d.f.a.b(bArr, i2);
        int i3 = i2 + 4;
        this.a = a.d.f.a.b(bArr, i3);
        int i4 = i3 + 4 + 4;
        int iM = s + M();
        if (this.b + this.d > this.c.length) {
            throw new g("Buffer to small for read response");
        }
        System.arraycopy(bArr, iM, this.c, this.d, this.b);
        return Math.max(i4, iM + this.b) - i;
    }

    @Override // a.d.e.b
    protected final boolean T() {
        return A() != -2147483643 && super.T();
    }
}
