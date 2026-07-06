package a.d.e.d;

import a.n;

/* JADX INFO: compiled from: ValidateNegotiateInfoRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements n {
    private int a;
    private byte[] b;
    private int c;
    private int[] d;

    public f(int i, byte[] bArr, int i2, int[] iArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = iArr;
    }

    @Override // a.n
    public final int a(byte[] bArr, int i) {
        a.d.f.a.b(this.a, bArr, i);
        int i2 = i + 4;
        System.arraycopy(this.b, 0, bArr, i2, 16);
        int i3 = i2 + 16;
        a.d.f.a.a(this.c, bArr, i3);
        int i4 = i3 + 2;
        a.d.f.a.a(this.d.length, bArr, i4);
        int i5 = i4 + 2;
        int length = this.d.length;
        for (int i6 = 0; i6 < length; i6++) {
            a.d.f.a.a(r2[i6], bArr, i5);
            i5 += 2;
        }
        return i5 - i;
    }

    @Override // a.n
    public final int a() {
        return (this.d.length * 2) + 24;
    }
}
