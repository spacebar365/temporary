package org.bouncycastle.a;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class bv extends s {
    public bv(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // org.bouncycastle.a.s
    public final void a(f fVar) {
        if (fVar == null) {
            throw new IOException("null object detected");
        }
        fVar.i().h().a(this);
    }
}
