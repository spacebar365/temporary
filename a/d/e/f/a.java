package a.d.e.f;

/* JADX INFO: compiled from: EncryptionNegotiateContext.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b, c {
    private int[] a;

    public a(int[] iArr) {
        this.a = iArr;
    }

    public a() {
    }

    public final int[] b() {
        return this.a;
    }

    @Override // a.d.e.f.b, a.d.e.f.c
    public final int c() {
        return 2;
    }

    @Override // a.n
    public final int a(byte[] bArr, int i) {
        a.d.f.a.a(this.a != null ? this.a.length : 0L, bArr, i);
        int i2 = i + 2;
        if (this.a != null) {
            int length = this.a.length;
            for (int i3 = 0; i3 < length; i3++) {
                a.d.f.a.a(r2[i3], bArr, i2);
                i2 += 2;
            }
        }
        return i2 - i;
    }

    @Override // a.j
    public final int a(byte[] bArr, int i, int i2) {
        int iA = a.d.f.a.a(bArr, i);
        int i3 = i + 2;
        this.a = new int[iA];
        for (int i4 = 0; i4 < iA; i4++) {
            this.a[i4] = a.d.f.a.a(bArr, i3);
            i3 += 2;
        }
        return i3 - i;
    }

    @Override // a.n
    public final int a() {
        return (this.a != null ? this.a.length * 2 : 0) + 4;
    }
}
