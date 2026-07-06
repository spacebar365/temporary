package org.bouncycastle.a;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
abstract class cf extends InputStream {
    protected final InputStream a;
    private int b;

    cf(InputStream inputStream, int i) {
        this.a = inputStream;
        this.b = i;
    }

    int a() {
        return this.b;
    }

    protected final void c() {
        if (this.a instanceof cc) {
            ((cc) this.a).a(true);
        }
    }
}
