package a.d.e.d;

import a.j;

/* JADX INFO: compiled from: ValidateNegotiateInfoResponse.java */
/* JADX INFO: loaded from: classes.dex */
public class g implements j {
    private int a;
    private byte[] b = new byte[16];
    private int c;
    private int d;

    public final int a() {
        return this.a;
    }

    public final byte[] b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    @Override // a.j
    public final int a(byte[] bArr, int i, int i2) {
        this.a = a.d.f.a.b(bArr, i);
        int i3 = i + 4;
        System.arraycopy(bArr, i3, this.b, 0, 16);
        int i4 = i3 + 16;
        this.c = a.d.f.a.a(bArr, i4);
        this.d = a.d.f.a.a(bArr, i4 + 2);
        return (i4 + 4) - i;
    }
}
