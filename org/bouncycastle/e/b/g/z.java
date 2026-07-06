package org.bouncycastle.e.b.g;

/* JADX INFO: loaded from: classes.dex */
public final class z extends p {
    private final x b;
    private final byte[] c;
    private final byte[] d;

    private z(z$a z_a) {
        super(false, z$a.a(z_a).a().a());
        this.b = z$a.a(z_a);
        if (this.b == null) {
            throw new NullPointerException("params == null");
        }
        int iB = this.b.b();
        byte[] bArrB = z$a.b(z_a);
        if (bArrB != null) {
            if (bArrB.length != iB + iB) {
                throw new IllegalArgumentException("public key has wrong size");
            }
            this.c = aa.a(bArrB, 0, iB);
            this.d = aa.a(bArrB, iB + 0, iB);
            return;
        }
        byte[] bArrC = z$a.c(z_a);
        if (bArrC == null) {
            this.c = new byte[iB];
        } else {
            if (bArrC.length != iB) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.c = bArrC;
        }
        byte[] bArrD = z$a.d(z_a);
        if (bArrD == null) {
            this.d = new byte[iB];
        } else {
            if (bArrD.length != iB) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.d = bArrD;
        }
    }

    /* synthetic */ z(z$a z_a, byte b) {
        this(z_a);
    }

    public final byte[] c() {
        int iB = this.b.b();
        byte[] bArr = new byte[iB + iB];
        aa.a(bArr, this.c, 0);
        aa.a(bArr, this.d, iB + 0);
        return bArr;
    }

    public final byte[] d() {
        return aa.a(this.c);
    }

    public final byte[] e() {
        return aa.a(this.d);
    }

    public final x f() {
        return this.b;
    }
}
