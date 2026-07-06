package org.bouncycastle.e.b.g;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Serializable {
    private final int a;
    private final byte[] b;

    protected u(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public final int a() {
        return this.a;
    }

    public final byte[] b() {
        return aa.a(this.b);
    }

    protected final /* synthetic */ Object clone() {
        return c();
    }

    protected final u c() {
        return new u(this.a, aa.a(this.b));
    }
}
