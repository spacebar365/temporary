package a.d.d.c.a;

import a.i.e;

/* JADX INFO: compiled from: NtTransQuerySecurityDesc.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    int n;
    int o;

    @Override // a.d.d.c.a
    public final int aa() {
        return 4;
    }

    @Override // a.d.d.c.a
    protected final int j(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c.a
    protected final int k(byte[] bArr, int i) {
        a.d.f.a.a(this.n, bArr, i);
        int i2 = i + 2;
        int i3 = i2 + 1;
        bArr[i2] = 0;
        int i4 = i3 + 1;
        bArr[i3] = 0;
        a.d.f.a.b(this.o, bArr, i4);
        return (i4 + 4) - i;
    }

    @Override // a.d.d.c.a
    protected final int l(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c.a, a.d.d.c
    public final String toString() {
        return new String("NtTransQuerySecurityDesc[" + super.toString() + ",fid=0x" + e.a(this.n, 4) + ",securityInformation=0x" + e.a(this.o, 8) + "]");
    }
}
