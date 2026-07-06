package a.d.e.d;

import a.j;

/* JADX INFO: compiled from: SrvPipePeekResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements j {
    private int a;
    private int b;
    private int c;
    private int d;
    private byte[] e;

    public final int a() {
        return this.b;
    }

    @Override // a.j
    public final int a(byte[] bArr, int i, int i2) {
        this.a = a.d.f.a.b(bArr, i);
        int i3 = i + 4;
        this.b = a.d.f.a.b(bArr, i3);
        int i4 = i3 + 4;
        this.c = a.d.f.a.b(bArr, i4);
        int i5 = i4 + 4;
        this.d = a.d.f.a.b(bArr, i5);
        int i6 = i5 + 4;
        this.e = new byte[i2 - 16];
        if (this.e.length > 0) {
            System.arraycopy(bArr, i6, this.e, 0, this.e.length);
        }
        return i6 - i;
    }
}
