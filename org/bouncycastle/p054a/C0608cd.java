package org.bouncycastle.p054a;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: renamed from: org.bouncycastle.a.cd */
/* JADX INFO: loaded from: classes.dex */
final class C0608cd implements Enumeration {

    /* JADX INFO: renamed from: a */
    private C0638l f2167a;

    /* JADX INFO: renamed from: b */
    private Object f2168b = m1480a();

    public C0608cd(byte[] bArr) {
        this.f2167a = new C0638l(bArr, (byte) 0);
    }

    /* JADX INFO: renamed from: a */
    private Object m1480a() {
        try {
            return this.f2167a.m1560b();
        } catch (IOException e) {
            throw new C0684t("malformed DER construction: ".concat(String.valueOf(e)), e);
        }
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f2168b != null;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        Object obj = this.f2168b;
        this.f2168b = m1480a();
        return obj;
    }
}
