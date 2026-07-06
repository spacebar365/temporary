package org.bouncycastle.e.c.c;

import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes.dex */
public class b implements KeySpec {
    private short[][] a;
    private short[][] b;
    private short[] c;
    private int d;

    public b(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.d = i;
        this.a = sArr;
        this.b = sArr2;
        this.c = sArr3;
    }

    public final int a() {
        return this.d;
    }

    public final short[][] b() {
        return this.a;
    }

    public final short[][] c() {
        return this.b;
    }

    public final short[] d() {
        return this.c;
    }
}
