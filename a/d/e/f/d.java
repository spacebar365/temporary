package a.d.e.f;

/* JADX INFO: compiled from: PreauthIntegrityNegotiateContext.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b, c {
    private int[] a;
    private byte[] b;

    public d(int[] iArr, byte[] bArr) {
        this.a = iArr;
        this.b = bArr;
    }

    public d() {
    }

    public final int[] b() {
        return this.a;
    }

    @Override // a.d.e.f.b, a.d.e.f.c
    public final int c() {
        return 1;
    }

    @Override // a.n
    public final int a(byte[] bArr, int i) {
        a.d.f.a.a(this.a != null ? this.a.length : 0L, bArr, i);
        a.d.f.a.a(this.b != null ? this.b.length : 0L, bArr, i + 2);
        int length = i + 4;
        if (this.a != null) {
            int length2 = this.a.length;
            for (int i2 = 0; i2 < length2; i2++) {
                a.d.f.a.a(r2[i2], bArr, length);
                length += 2;
            }
        }
        if (this.b != null) {
            System.arraycopy(this.b, 0, bArr, length, this.b.length);
            length += this.b.length;
        }
        return length - i;
    }

    @Override // a.j
    public final int a(byte[] bArr, int i, int i2) {
        int iA = a.d.f.a.a(bArr, i);
        int iA2 = a.d.f.a.a(bArr, i + 2);
        int i3 = i + 4;
        this.a = new int[iA];
        for (int i4 = 0; i4 < iA; i4++) {
            this.a[i4] = a.d.f.a.a(bArr, i3);
            i3 += 2;
        }
        this.b = new byte[iA2];
        System.arraycopy(bArr, i3, this.b, 0, iA2);
        return (i3 + iA2) - i;
    }

    @Override // a.n
    public final int a() {
        return (this.a != null ? this.a.length * 2 : 0) + 4 + (this.b != null ? this.b.length : 0);
    }
}
