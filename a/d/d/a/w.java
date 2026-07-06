package a.d.d.a;

import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: SmbComTreeConnectAndXResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class w extends a.d.d.a implements a.d.m {
    private boolean n;
    private boolean o;
    private String p;
    private String q;

    public w(a.h hVar, a.d.d.c cVar) {
        super(hVar, cVar);
        this.q = "";
    }

    @Override // a.d.m
    public final String p_() {
        return this.p;
    }

    @Override // a.d.m
    public final boolean g() {
        return this.o;
    }

    @Override // a.d.m
    public final boolean h() {
        return d_() != 65535;
    }

    @Override // a.d.d.c
    protected final int f(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c
    protected final int g(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c
    protected final int h(byte[] bArr, int i) {
        this.n = (bArr[i] & 1) == 1;
        this.o = (bArr[i] & 2) == 2;
        return 2;
    }

    @Override // a.d.d.c
    protected final int i(byte[] bArr, int i) {
        int i2 = 0;
        while (bArr[i + i2] != 0) {
            int i3 = i2 + 1;
            if (i2 > 32) {
                throw new a.u("zero termination not found: ".concat(String.valueOf(this)));
            }
            i2 = i3;
        }
        try {
            this.p = new String(bArr, i, i2, "ASCII");
            return ((i2 + 1) + i) - i;
        } catch (UnsupportedEncodingException e) {
            return 0;
        }
    }

    @Override // a.d.d.a, a.d.d.c
    public final String toString() {
        return new String("SmbComTreeConnectAndXResponse[" + super.toString() + ",supportSearchBits=" + this.n + ",shareIsInDfs=" + this.o + ",service=" + this.p + ",nativeFileSystem=" + this.q + "]");
    }
}
