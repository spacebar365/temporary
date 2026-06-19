package org.bouncycastle.p054a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: org.bouncycastle.a.av */
/* JADX INFO: loaded from: classes.dex */
public final class C0559av extends AbstractC0634j {
    public C0559av(C0653p c0653p, C0640m c0640m, AbstractC0686u abstractC0686u, int i, AbstractC0686u abstractC0686u2) {
        super(c0653p, c0640m, abstractC0686u, i, abstractC0686u2);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (this.f2340a != null) {
            byteArrayOutputStream.write(this.f2340a.m1577a("DER"));
        }
        if (this.f2341b != null) {
            byteArrayOutputStream.write(this.f2341b.m1577a("DER"));
        }
        if (this.f2342c != null) {
            byteArrayOutputStream.write(this.f2342c.m1577a("DER"));
        }
        byteArrayOutputStream.write(new C0590bn(true, this.f2343d, this.f2344e).m1577a("DER"));
        c0660s.m1604a(32, 8, byteArrayOutputStream.toByteArray());
    }

    @Override // org.bouncycastle.p054a.AbstractC0634j, org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        return mo1578k().length;
    }
}
