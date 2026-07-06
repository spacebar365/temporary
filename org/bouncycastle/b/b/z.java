package org.bouncycastle.b.b;

import org.bouncycastle.b.aq;

/* JADX INFO: loaded from: classes.dex */
public final class z extends i implements aq {
    public z() {
        this(128);
    }

    private int c(byte[] bArr, int i, int i2) {
        if (!this.f) {
            a(15, 4);
        }
        a(bArr, i, ((long) i2) * 8);
        return i2;
    }

    @Override // org.bouncycastle.b.b.i, org.bouncycastle.b.r
    public final int a(byte[] bArr, int i) {
        return b(bArr, i, b());
    }

    @Override // org.bouncycastle.b.b.i, org.bouncycastle.b.r
    public final String a() {
        return "SHAKE" + this.e;
    }

    @Override // org.bouncycastle.b.aq
    public final int b(byte[] bArr, int i, int i2) {
        int iC = c(bArr, i, i2);
        c();
        return iC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(int i) {
        super(i);
        switch (i) {
            case 128:
            case 256:
                return;
            default:
                throw new IllegalArgumentException("'bitLength' " + i + " not supported for SHAKE");
        }
    }
}
