package org.bouncycastle.e.b.c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends org.bouncycastle.b.k.b {
    private int b;
    private byte[] c;

    public final int b() {
        return this.b;
    }

    public final byte[] c() {
        return org.bouncycastle.f.a.b(this.c);
    }

    public b(int i, byte[] bArr) {
        int i2;
        super(false);
        int length = bArr.length;
        switch (i) {
            case 0:
                i2 = 1504;
                break;
            case 1:
                i2 = 2976;
                break;
            case 2:
                i2 = 3104;
                break;
            case 3:
                i2 = 14880;
                break;
            case 4:
                i2 = 39712;
                break;
            default:
                throw new IllegalArgumentException("unknown security category: ".concat(String.valueOf(i)));
        }
        if (length != i2) {
            throw new IllegalArgumentException("invalid key size for security category");
        }
        this.b = i;
        this.c = org.bouncycastle.f.a.b(bArr);
    }
}
