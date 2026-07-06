package org.bouncycastle.c.c;

import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class p implements AlgorithmParameterSpec {
    private byte[] a;
    private byte[] b;
    private int c;
    private int d;
    private byte[] e;
    private boolean f;

    public p(byte[] bArr, byte[] bArr2, int i) {
        this(bArr, bArr2, i, -1, null, (byte) 0);
    }

    public p(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3) {
        this(bArr, bArr2, i, i2, bArr3, (byte) 0);
    }

    private p(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, byte b) {
        if (bArr != null) {
            this.a = new byte[bArr.length];
            System.arraycopy(bArr, 0, this.a, 0, bArr.length);
        } else {
            this.a = null;
        }
        if (bArr2 != null) {
            this.b = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, this.b, 0, bArr2.length);
        } else {
            this.b = null;
        }
        this.c = i;
        this.d = i2;
        this.e = org.bouncycastle.f.a.b(bArr3);
        this.f = false;
    }

    public final byte[] a() {
        return org.bouncycastle.f.a.b(this.a);
    }

    public final byte[] b() {
        return org.bouncycastle.f.a.b(this.b);
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final byte[] e() {
        return org.bouncycastle.f.a.b(this.e);
    }

    public final boolean f() {
        return this.f;
    }
}
