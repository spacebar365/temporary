package org.bouncycastle.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class av extends j {
    public av(p pVar, m mVar, u uVar, int i, u uVar2) {
        super(pVar, mVar, uVar, i, uVar2);
    }

    @Override // org.bouncycastle.a.u
    final void a(s sVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (this.a != null) {
            byteArrayOutputStream.write(this.a.a("DER"));
        }
        if (this.b != null) {
            byteArrayOutputStream.write(this.b.a("DER"));
        }
        if (this.c != null) {
            byteArrayOutputStream.write(this.c.a("DER"));
        }
        byteArrayOutputStream.write(new bn(true, this.d, this.e).a("DER"));
        sVar.a(32, 8, byteArrayOutputStream.toByteArray());
    }

    @Override // org.bouncycastle.a.j, org.bouncycastle.a.u
    final int e() {
        return k().length;
    }
}
