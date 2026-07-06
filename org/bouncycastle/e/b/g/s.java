package org.bouncycastle.e.b.g;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class s extends q {
    private final r b;
    private final long c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;
    private final byte[] g;
    private final b h;

    private s(s$a s_a) {
        super(true, s$a.a(s_a).d().a());
        this.b = s$a.a(s_a);
        if (this.b == null) {
            throw new NullPointerException("params == null");
        }
        int iE = this.b.e();
        byte[] bArrB = s$a.b(s_a);
        if (bArrB != null) {
            if (s$a.c(s_a) == null) {
                throw new NullPointerException("xmss == null");
            }
            int iA = this.b.a();
            int i = (iA + 7) / 8;
            this.c = aa.a(bArrB, i);
            if (!aa.a(iA, this.c)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            int i2 = i + 0;
            this.d = aa.a(bArrB, i2, iE);
            int i3 = i2 + iE;
            this.e = aa.a(bArrB, i3, iE);
            int i4 = i3 + iE;
            this.f = aa.a(bArrB, i4, iE);
            int i5 = i4 + iE;
            this.g = aa.a(bArrB, i5, iE);
            int i6 = iE + i5;
            try {
                this.h = ((b) aa.a(aa.a(bArrB, i6, bArrB.length - i6), b.class)).a(f.a(s$a.c(s_a).a().a()));
                return;
            } catch (IOException e) {
                throw new IllegalArgumentException(e.getMessage(), e);
            } catch (ClassNotFoundException e2) {
                throw new IllegalArgumentException(e2.getMessage(), e2);
            }
        }
        this.c = s$a.d(s_a);
        byte[] bArrE = s$a.e(s_a);
        if (bArrE == null) {
            this.d = new byte[iE];
        } else {
            if (bArrE.length != iE) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.d = bArrE;
        }
        byte[] bArrF = s$a.f(s_a);
        if (bArrF == null) {
            this.e = new byte[iE];
        } else {
            if (bArrF.length != iE) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.e = bArrF;
        }
        byte[] bArrG = s$a.g(s_a);
        if (bArrG == null) {
            this.f = new byte[iE];
        } else {
            if (bArrG.length != iE) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f = bArrG;
        }
        byte[] bArrH = s$a.h(s_a);
        if (bArrH == null) {
            this.g = new byte[iE];
        } else {
            if (bArrH.length != iE) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.g = bArrH;
        }
        b bVarI = s$a.i(s_a);
        if (bVarI != null) {
            this.h = bVarI;
            return;
        }
        if (!aa.a(this.b.a(), s$a.d(s_a)) || bArrG == null || bArrE == null) {
            this.h = new b();
        } else {
            this.h = new b(this.b, s$a.d(s_a), bArrG, bArrE);
        }
    }

    /* synthetic */ s(s$a s_a, byte b) {
        this(s_a);
    }

    public final byte[] c() {
        int iE = this.b.e();
        int iA = (this.b.a() + 7) / 8;
        byte[] bArr = new byte[iA + iE + iE + iE + iE];
        aa.a(bArr, aa.a(this.c, iA), 0);
        int i = iA + 0;
        aa.a(bArr, this.d, i);
        int i2 = i + iE;
        aa.a(bArr, this.e, i2);
        int i3 = i2 + iE;
        aa.a(bArr, this.f, i3);
        aa.a(bArr, this.g, iE + i3);
        try {
            return org.bouncycastle.f.a.d(bArr, aa.a(this.h));
        } catch (IOException e) {
            throw new IllegalStateException("error serializing bds state: " + e.getMessage(), e);
        }
    }

    public final r d() {
        return this.b;
    }
}
