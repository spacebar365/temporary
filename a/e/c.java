package a.e;

/* JADX INFO: compiled from: NameQueryRequest.java */
/* JADX INFO: loaded from: classes.dex */
final class c extends g {
    c(a.h hVar, b bVar) {
        super(hVar);
        this.q = bVar;
        this.s = 32;
    }

    @Override // a.e.g
    final int a(byte[] bArr) {
        return c(bArr);
    }

    @Override // a.e.g
    final int a(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.e.g
    public final String toString() {
        return new String("NameQueryRequest[" + super.toString() + "]");
    }

    @Override // a.e.g
    final int b(byte[] bArr) {
        int iA = this.q.a(bArr) + 12;
        this.s = g.b(bArr, iA);
        this.t = g.b(bArr, iA + 2);
        return (r0 + 2) - 12;
    }
}
