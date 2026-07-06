package a.d.d.b;

import a.h;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: NetServerEnum2.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends a.d.d.c.a {
    static final String[] n = {"WrLehDO\u0000B16BBDz\u0000", "WrLehDz\u0000B16BBDz\u0000"};
    String o;
    String p;
    int q;

    public a(h hVar, String str, int i) {
        super(hVar, (byte) 37, (byte) 104);
        this.p = null;
        this.o = str;
        this.q = i;
        this.G = "\\PIPE\\LANMAN";
        this.B = 8;
        this.C = 16384;
        this.D = (byte) 0;
        this.F = 0;
        this.E = 5000;
    }

    @Override // a.d.d.c.a
    public final void a(int i, String str) {
        super.e_();
        this.p = str;
    }

    @Override // a.d.d.c.a
    protected final int j(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c.a
    protected final int k(byte[] bArr, int i) {
        char c = X() == 104 ? (char) 0 : (char) 1;
        try {
            byte[] bytes = n[c].getBytes("ASCII");
            a.d.f.a.a(X() & 255, bArr, i);
            int i2 = i + 2;
            System.arraycopy(bytes, 0, bArr, i2, bytes.length);
            int length = bytes.length + i2;
            a.d.f.a.a(1L, bArr, length);
            int i3 = length + 2;
            a.d.f.a.a(this.C, bArr, i3);
            int i4 = i3 + 2;
            a.d.f.a.b(this.q, bArr, i4);
            int i5 = i4 + 4;
            int iA = i5 + a(this.o.toUpperCase(), bArr, i5, false);
            return (c == 1 ? a(this.p.toUpperCase(), bArr, iA, false) + iA : iA) - i;
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
        return new String("NetServerEnum2[" + super.toString() + ",name=" + this.G + ",serverTypes=" + (this.q == -1 ? "SV_TYPE_ALL" : "SV_TYPE_DOMAIN_ENUM") + "]");
    }
}
