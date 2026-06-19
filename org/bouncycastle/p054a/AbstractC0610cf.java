package org.bouncycastle.p054a;

import java.io.InputStream;

/* JADX INFO: renamed from: org.bouncycastle.a.cf */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0610cf extends InputStream {

    /* JADX INFO: renamed from: a */
    protected final InputStream f2170a;

    /* JADX INFO: renamed from: b */
    private int f2171b;

    AbstractC0610cf(InputStream inputStream, int i) {
        this.f2170a = inputStream;
        this.f2171b = i;
    }

    /* JADX INFO: renamed from: a */
    int mo1476a() {
        return this.f2171b;
    }

    /* JADX INFO: renamed from: c */
    protected final void m1485c() {
        if (this.f2170a instanceof C0607cc) {
            ((C0607cc) this.f2170a).m1479a(true);
        }
    }
}
