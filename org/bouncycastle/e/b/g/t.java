package org.bouncycastle.e.b.g;

/* JADX INFO: loaded from: classes.dex */
public final class t extends q {
    private final r b;
    private final byte[] c;
    private final byte[] d;

    private t(t$a t_a) {
        super(false, t$a.a(t_a).d().a());
        this.b = t$a.a(t_a);
        if (this.b == null) {
            throw new NullPointerException("params == null");
        }
        int iE = this.b.e();
        byte[] bArrB = t$a.b(t_a);
        if (bArrB != null) {
            if (bArrB.length != iE + iE) {
                throw new IllegalArgumentException("public key has wrong size");
            }
            this.c = aa.a(bArrB, 0, iE);
            this.d = aa.a(bArrB, iE + 0, iE);
            return;
        }
        byte[] bArrC = t$a.c(t_a);
        if (bArrC == null) {
            this.c = new byte[iE];
        } else {
            if (bArrC.length != iE) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.c = bArrC;
        }
        byte[] bArrD = t$a.d(t_a);
        if (bArrD == null) {
            this.d = new byte[iE];
        } else {
            if (bArrD.length != iE) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.d = bArrD;
        }
    }

    /* synthetic */ t(t$a t_a, byte b) {
        this(t_a);
    }

    public final byte[] c() {
        int iE = this.b.e();
        byte[] bArr = new byte[iE + iE];
        aa.a(bArr, this.c, 0);
        aa.a(bArr, this.d, iE + 0);
        return bArr;
    }

    public final byte[] d() {
        return aa.a(this.c);
    }

    public final byte[] e() {
        return aa.a(this.d);
    }

    public final r f() {
        return this.b;
    }
}
