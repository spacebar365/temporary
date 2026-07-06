package a.d.d.d;

/* JADX INFO: compiled from: Trans2QueryPathInformationResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class i extends a.d.d.c.b {
    private final int C;
    private a.d.c.g D;

    public i(a.h hVar, int i) {
        super(hVar);
        this.C = i;
        b((byte) 5);
    }

    public final <T extends a.d.c.g> T a(Class<T> cls) throws a.d {
        if (!cls.isAssignableFrom(this.D.getClass())) {
            throw new a.d("Incompatible file information class");
        }
        return (T) this.D;
    }

    @Override // a.d.d.c.b
    protected final int j(byte[] bArr, int i) {
        return 2;
    }

    @Override // a.d.d.c.b, a.d.d.c
    public final String toString() {
        return new String("Trans2QueryPathInformationResponse[" + super.toString() + "]");
    }

    @Override // a.d.d.c.b
    protected final int a(byte[] bArr, int i, int i2) {
        a.d.c.g hVar;
        a.d.c.g gVar;
        int iA;
        switch (this.C) {
            case 4:
                hVar = new a.d.c.b();
                gVar = hVar;
                break;
            case 5:
                hVar = new a.d.c.i();
                gVar = hVar;
                break;
            case 6:
                hVar = new a.d.c.h();
                gVar = hVar;
                break;
            default:
                gVar = null;
                break;
        }
        if (gVar != null) {
            iA = gVar.a(bArr, i, W()) + i;
            this.D = gVar;
        } else {
            iA = i;
        }
        return iA - i;
    }
}
