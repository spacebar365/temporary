package org.bouncycastle.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class bu extends j {
    public bu(g gVar) {
        super(gVar);
    }

    @Override // org.bouncycastle.a.u
    final void a(s sVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (this.a != null) {
            byteArrayOutputStream.write(this.a.a("DL"));
        }
        if (this.b != null) {
            byteArrayOutputStream.write(this.b.a("DL"));
        }
        if (this.c != null) {
            byteArrayOutputStream.write(this.c.a("DL"));
        }
        byteArrayOutputStream.write(new bn(true, this.d, this.e).a("DL"));
        sVar.a(32, 8, byteArrayOutputStream.toByteArray());
    }

    @Override // org.bouncycastle.a.j, org.bouncycastle.a.u
    final int e() {
        return k().length;
    }
}
