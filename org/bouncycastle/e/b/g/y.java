package org.bouncycastle.e.b.g;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class y extends p {
    private final x b;
    private final byte[] c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;
    private final a g;

    private y(y$a y_a) {
        super(true, y$a.a(y_a).a().a());
        this.b = y$a.a(y_a);
        if (this.b == null) {
            throw new NullPointerException("params == null");
        }
        int iB = this.b.b();
        byte[] bArrB = y$a.b(y_a);
        if (bArrB != null) {
            if (y$a.c(y_a) == null) {
                throw new NullPointerException("xmss == null");
            }
            int iD = this.b.d();
            int iA = org.bouncycastle.f.g.a(bArrB, 0);
            if (!aa.a(iD, iA)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.c = aa.a(bArrB, 4, iB);
            int i = iB + 4;
            this.d = aa.a(bArrB, i, iB);
            int i2 = i + iB;
            this.e = aa.a(bArrB, i2, iB);
            int i3 = i2 + iB;
            this.f = aa.a(bArrB, i3, iB);
            int i4 = iB + i3;
            try {
                a aVar = (a) aa.a(aa.a(bArrB, i4, bArrB.length - i4), a.class);
                if (aVar.a() != iA) {
                    throw new IllegalStateException("serialized BDS has wrong index");
                }
                this.g = aVar.a(f.a(y$a.c(y_a).a().a()));
                return;
            } catch (IOException e) {
                throw new IllegalArgumentException(e.getMessage(), e);
            } catch (ClassNotFoundException e2) {
                throw new IllegalArgumentException(e2.getMessage(), e2);
            }
        }
        byte[] bArrD = y$a.d(y_a);
        if (bArrD == null) {
            this.c = new byte[iB];
        } else {
            if (bArrD.length != iB) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.c = bArrD;
        }
        byte[] bArrE = y$a.e(y_a);
        if (bArrE == null) {
            this.d = new byte[iB];
        } else {
            if (bArrE.length != iB) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.d = bArrE;
        }
        byte[] bArrF = y$a.f(y_a);
        if (bArrF == null) {
            this.e = new byte[iB];
        } else {
            if (bArrF.length != iB) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.e = bArrF;
        }
        byte[] bArrG = y$a.g(y_a);
        if (bArrG == null) {
            this.f = new byte[iB];
        } else {
            if (bArrG.length != iB) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.f = bArrG;
        }
        a aVarH = y$a.h(y_a);
        if (aVarH != null) {
            this.g = aVarH;
        } else if (y$a.i(y_a) >= (1 << this.b.d()) - 2 || bArrF == null || bArrD == null) {
            this.g = new a(this.b, y$a.i(y_a));
        } else {
            this.g = new a(this.b, bArrF, bArrD, (j) new j$a().a(), y$a.i(y_a));
        }
    }

    /* synthetic */ y(y$a y_a, byte b) {
        this(y_a);
    }

    public final byte[] c() {
        int iB = this.b.b();
        byte[] bArr = new byte[iB + 4 + iB + iB + iB];
        org.bouncycastle.f.g.a(this.g.a(), bArr, 0);
        aa.a(bArr, this.c, 4);
        int i = iB + 4;
        aa.a(bArr, this.d, i);
        int i2 = i + iB;
        aa.a(bArr, this.e, i2);
        aa.a(bArr, this.f, iB + i2);
        try {
            return org.bouncycastle.f.a.d(bArr, aa.a(this.g));
        } catch (IOException e) {
            throw new RuntimeException("error serializing bds state: " + e.getMessage());
        }
    }

    public final x d() {
        return this.b;
    }
}
