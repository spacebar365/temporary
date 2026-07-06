package org.bouncycastle.e.b.g;

/* JADX INFO: loaded from: classes.dex */
final class k {
    private final m a;
    private final h b;
    private byte[] c;
    private byte[] d;

    protected k(m mVar) {
        this.a = mVar;
        int iB = mVar.b();
        this.b = new h(mVar.a(), iB);
        this.c = new byte[iB];
        this.d = new byte[iB];
    }

    private byte[] a(byte[] bArr, int i, int i2, j jVar) {
        int iB = this.a.b();
        if (bArr == null) {
            throw new NullPointerException("startHash == null");
        }
        if (bArr.length != iB) {
            throw new IllegalArgumentException("startHash needs to be " + iB + "bytes");
        }
        if (jVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (jVar.a() == null) {
            throw new NullPointerException("otsHashAddress byte array == null");
        }
        if (i + i2 > this.a.c() - 1) {
            throw new IllegalArgumentException("max chain length must not be greater than w");
        }
        if (i2 == 0) {
            return bArr;
        }
        byte[] bArrA = a(bArr, i, i2 - 1, jVar);
        j jVar2 = (j) new j$a().d(jVar.e()).a(jVar.f()).a(jVar.b()).b(jVar.c()).c((i + i2) - 1).e(0).a();
        byte[] bArrC = this.b.c(this.d, jVar2.a());
        byte[] bArrC2 = this.b.c(this.d, ((j) new j$a().d(jVar2.e()).a(jVar2.f()).a(jVar2.b()).b(jVar2.c()).c(jVar2.d()).e(1).a()).a());
        byte[] bArr2 = new byte[iB];
        for (int i3 = 0; i3 < iB; i3++) {
            bArr2[i3] = (byte) (bArrA[i3] ^ bArrC2[i3]);
        }
        return this.b.a(bArrC, bArr2);
    }

    protected final m a() {
        return this.a;
    }

    final void a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("secretKeySeed == null");
        }
        if (bArr.length != this.a.b()) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        }
        if (bArr2 == null) {
            throw new NullPointerException("publicSeed == null");
        }
        if (bArr2.length != this.a.b()) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
        this.c = bArr;
        this.d = bArr2;
    }

    protected final byte[] a(byte[] bArr, j jVar) {
        return this.b.c(bArr, ((j) new j$a().d(jVar.e()).a(jVar.f()).a(jVar.b()).a()).a());
    }

    protected final h b() {
        return this.b;
    }

    protected final byte[] c() {
        return org.bouncycastle.f.a.b(this.d);
    }

    protected final n a(j jVar) {
        if (jVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        byte[][] bArr = new byte[this.a.d()][];
        int i = 0;
        while (i < this.a.d()) {
            j jVar2 = (j) new j$a().d(jVar.e()).a(jVar.f()).a(jVar.b()).b(i).c(jVar.d()).e(jVar.g()).a();
            if (i < 0 || i >= this.a.d()) {
                throw new IllegalArgumentException("index out of bounds");
            }
            bArr[i] = a(this.b.c(this.c, aa.a(i, 32)), 0, this.a.c() - 1, jVar2);
            i++;
            jVar = jVar2;
        }
        return new n(this.a, bArr);
    }
}
