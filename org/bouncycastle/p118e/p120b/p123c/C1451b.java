package org.bouncycastle.p118e.p120b.p123c;

import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.e.b.c.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1451b extends C1075b {

    /* JADX INFO: renamed from: b */
    private int f5263b;

    /* JADX INFO: renamed from: c */
    private byte[] f5264c;

    /* JADX INFO: renamed from: b */
    public final int m3796b() {
        return this.f5263b;
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m3797c() {
        return C1535a.m4086b(this.f5264c);
    }

    public C1451b(int i, byte[] bArr) {
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
        this.f5263b = i;
        this.f5264c = C1535a.m4086b(bArr);
    }
}
