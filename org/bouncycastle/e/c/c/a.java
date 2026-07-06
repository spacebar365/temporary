package org.bouncycastle.e.c.c;

import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes.dex */
public class a implements KeySpec {
    private short[][] a;
    private short[] b;
    private short[][] c;
    private short[] d;
    private int[] e;
    private org.bouncycastle.e.b.d.a[] f;

    public a(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, org.bouncycastle.e.b.d.a[] aVarArr) {
        this.a = sArr;
        this.b = sArr2;
        this.c = sArr3;
        this.d = sArr4;
        this.e = iArr;
        this.f = aVarArr;
    }

    public final short[] a() {
        return this.b;
    }

    public final short[][] b() {
        return this.a;
    }

    public final short[] c() {
        return this.d;
    }

    public final short[][] d() {
        return this.c;
    }

    public final org.bouncycastle.e.b.d.a[] e() {
        return this.f;
    }

    public final int[] f() {
        return this.e;
    }
}
