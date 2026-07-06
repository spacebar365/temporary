package org.bouncycastle.c;

import java.io.IOException;
import java.security.Principal;
import org.bouncycastle.a.v;
import org.bouncycastle.a.y.c;
import org.bouncycastle.a.z.y;

/* JADX INFO: loaded from: classes.dex */
public final class b extends y implements Principal {
    public b(c cVar) {
        super((v) cVar.i());
    }

    @Override // java.security.Principal
    public final String getName() {
        return toString();
    }

    @Override // org.bouncycastle.a.o
    public final byte[] k() {
        try {
            return a("DER");
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }
}
