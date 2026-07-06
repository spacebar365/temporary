package a.d.d.b;

import a.h;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: NetShareEnum.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a.d.d.c.a {
    public c(h hVar) {
        super(hVar, (byte) 37, (byte) 0);
        this.G = new String("\\PIPE\\LANMAN");
        this.B = 8;
        this.D = (byte) 0;
        this.F = 0;
        this.E = 5000;
    }

    @Override // a.d.d.c.a
    protected final int j(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c.a
    protected final int k(byte[] bArr, int i) {
        try {
            byte[] bytes = "WrLeh\u0000B13BWz\u0000".getBytes("ASCII");
            a.d.f.a.a(0L, bArr, i);
            int i2 = i + 2;
            System.arraycopy(bytes, 0, bArr, i2, bytes.length);
            int length = bytes.length + i2;
            a.d.f.a.a(1L, bArr, length);
            int i3 = length + 2;
            a.d.f.a.a(this.C, bArr, i3);
            return (i3 + 2) - i;
        } catch (UnsupportedEncodingException e) {
            return 0;
        }
    }

    @Override // a.d.d.c.a
    protected final int l(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c.a, a.d.d.c
    public final String toString() {
        return new String("NetShareEnum[" + super.toString() + "]");
    }
}
