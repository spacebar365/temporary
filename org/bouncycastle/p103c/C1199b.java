package org.bouncycastle.p103c;

import java.io.IOException;
import java.security.Principal;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.p080y.C0756c;
import org.bouncycastle.p054a.p082z.C0784y;

/* JADX INFO: renamed from: org.bouncycastle.c.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1199b extends C0784y implements Principal {
    public C1199b(C0756c c0756c) {
        super((AbstractC0723v) c0756c.mo1358i());
    }

    @Override // java.security.Principal
    public final String getName() {
        return toString();
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o
    /* JADX INFO: renamed from: k */
    public final byte[] mo1578k() {
        try {
            return m1577a("DER");
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }
}
