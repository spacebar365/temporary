package org.bouncycastle.b.b;

/* JADX INFO: loaded from: classes.dex */
public final class w extends i {
    public w() {
        this(256);
    }

    public w(w wVar) {
        super(wVar);
    }

    @Override // org.bouncycastle.b.b.i, org.bouncycastle.b.r
    public final int a(byte[] bArr, int i) {
        a(2, 2);
        return super.a(bArr, i);
    }

    @Override // org.bouncycastle.b.b.i, org.bouncycastle.b.r
    public final String a() {
        return "SHA3-" + this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(int i) {
        super(i);
        switch (i) {
            case 224:
            case 256:
            case 384:
            case 512:
                return;
            default:
                throw new IllegalArgumentException("'bitLength' " + i + " not supported for SHA-3");
        }
    }
}
