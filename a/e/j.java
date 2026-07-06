package a.e;

/* JADX INFO: compiled from: NodeStatusRequest.java */
/* JADX INFO: loaded from: classes.dex */
final class j extends g {
    j(a.h hVar, b bVar) {
        super(hVar);
        this.q = bVar;
        this.s = 33;
        this.n = false;
        this.p = false;
    }

    @Override // a.e.g
    final int a(byte[] bArr) {
        int i = this.q.c;
        this.q.c = 0;
        int iC = c(bArr);
        this.q.c = i;
        return iC;
    }

    @Override // a.e.g
    final int b(byte[] bArr) {
        return 0;
    }

    @Override // a.e.g
    final int a(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.e.g
    public final String toString() {
        return new String("NodeStatusRequest[" + super.toString() + "]");
    }
}
