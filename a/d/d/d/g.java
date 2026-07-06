package a.d.d.d;

import a.d.c.j;
import a.d.c.k;

/* JADX INFO: compiled from: Trans2QueryFSInformationResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class g extends a.d.d.c.b {
    private int C;
    private j D;

    public g(a.h hVar, int i) {
        super(hVar);
        this.C = i;
        a(50);
        b((byte) 3);
    }

    public final <T extends j> T a(Class<T> cls) throws a.d {
        if (!cls.isAssignableFrom(this.D.getClass())) {
            throw new a.d("Incompatible file information class");
        }
        return (T) this.D;
    }

    @Override // a.d.d.c.b
    protected final int j(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c.b, a.d.d.c
    public final String toString() {
        return new String("Trans2QueryFSInformationResponse[" + super.toString() + "]");
    }

    @Override // a.d.d.c.b
    protected final int a(byte[] bArr, int i, int i2) {
        j eVar;
        j jVar;
        int iA;
        switch (this.C) {
            case -1:
                eVar = new k();
                jVar = eVar;
                break;
            case 3:
                eVar = new a.d.c.f();
                jVar = eVar;
                break;
            case 7:
                eVar = new a.d.c.e();
                jVar = eVar;
                break;
            default:
                jVar = null;
                break;
        }
        if (jVar != null) {
            iA = jVar.a(bArr, i, W()) + i;
            this.D = jVar;
        } else {
            iA = i;
        }
        return iA - i;
    }
}
