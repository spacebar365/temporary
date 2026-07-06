package org.bouncycastle.e.b.g;

import org.bouncycastle.e.b.g.o$a;

/* JADX INFO: Access modifiers changed from: protected */
/* JADX INFO: loaded from: classes.dex */
public abstract class o$a<T extends o$a> {
    private final int a;
    private int b = 0;
    private long c = 0;
    private int d = 0;

    protected o$a(int i) {
        this.a = i;
    }

    static /* synthetic */ int a(o$a o_a) {
        return o_a.b;
    }

    static /* synthetic */ long b(o$a o_a) {
        return o_a.c;
    }

    static /* synthetic */ int c(o$a o_a) {
        return o_a.a;
    }

    static /* synthetic */ int d(o$a o_a) {
        return o_a.d;
    }

    protected final T a(long j) {
        this.c = j;
        return (T) b();
    }

    protected abstract o a();

    protected abstract T b();

    protected final T d(int i) {
        this.b = i;
        return (T) b();
    }

    protected final T e(int i) {
        this.d = i;
        return (T) b();
    }
}
