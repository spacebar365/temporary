package org.bouncycastle.p118e.p120b.p123c;

import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.e.b.c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1450a extends C1075b {

    /* JADX INFO: renamed from: b */
    private int f5261b;

    /* JADX INFO: renamed from: c */
    private byte[] f5262c;

    /* JADX INFO: renamed from: b */
    public final int m3794b() {
        return this.f5261b;
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m3795c() {
        return C1535a.m4086b(this.f5262c);
    }

    public C1450a(int i, byte[] bArr) {
        int i2;
        super(true);
        int length = bArr.length;
        switch (i) {
            case 0:
                i2 = 1344;
                break;
            case 1:
                i2 = 2112;
                break;
            case 2:
                i2 = 2368;
                break;
            case 3:
                i2 = 5184;
                break;
            case 4:
                i2 = 12352;
                break;
            default:
                throw new IllegalArgumentException("unknown security category: ".concat(String.valueOf(i)));
        }
        if (length != i2) {
            throw new IllegalArgumentException("invalid key size for security category");
        }
        this.f5261b = i;
        this.f5262c = C1535a.m4086b(bArr);
    }
}
