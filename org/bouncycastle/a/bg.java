package org.bouncycastle.a;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class bg extends s {
    public bg(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // org.bouncycastle.a.s
    public final void a(f fVar) throws IOException {
        if (fVar == null) {
            throw new IOException("null object detected");
        }
        fVar.i().g().a(this);
    }

    @Override // org.bouncycastle.a.s
    final s b() {
        return this;
    }

    @Override // org.bouncycastle.a.s
    final s c() {
        return this;
    }
}
