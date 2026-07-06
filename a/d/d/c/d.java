package a.d.d.c;

/* JADX INFO: compiled from: TransCallNamedPipeResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    private final byte[] C;

    public d(a.h hVar, byte[] bArr) {
        super(hVar);
        this.C = bArr;
    }

    @Override // a.d.d.c.b
    protected final int j(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c.b
    protected final int a(byte[] bArr, int i, int i2) throws a.d.g {
        if (i2 > this.C.length) {
            throw new a.d.g("Payload exceeds buffer size");
        }
        System.arraycopy(bArr, i, this.C, 0, i2);
        return i2;
    }

    @Override // a.d.d.c.b, a.d.d.c
    public final String toString() {
        return new String("TransCallNamedPipeResponse[" + super.toString() + "]");
    }
}
