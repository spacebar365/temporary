package a.e;

/* JADX INFO: compiled from: NameQueryResponse.java */
/* JADX INFO: loaded from: classes.dex */
final class d extends g {
    d(a.h hVar) {
        super(hVar);
        this.r = new b(hVar);
    }

    @Override // a.e.g
    final int a(byte[] bArr) {
        return 0;
    }

    @Override // a.e.g
    final int b(byte[] bArr) {
        return d(bArr, 12);
    }

    @Override // a.e.g
    final int a(byte[] bArr, int i) {
        if (this.e != 0 || this.d != 0) {
            return 0;
        }
        boolean z = (bArr[i] & 128) == 128;
        int i2 = (bArr[i] & 96) >> 5;
        int iC = c(bArr, i + 2);
        if (iC != 0) {
            this.b[this.a] = new h(this.r, iC, z, i2);
        } else {
            this.b[this.a] = null;
        }
        return 6;
    }

    @Override // a.e.g
    public final String toString() {
        return new String("NameQueryResponse[" + super.toString() + ",addrEntry=" + this.b + "]");
    }
}
