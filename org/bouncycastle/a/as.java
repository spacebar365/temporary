package org.bouncycastle.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class as extends a {
    public as(g gVar) {
        super(true, 0, a(gVar));
    }

    private static byte[] a(g gVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 == gVar.a()) {
                return byteArrayOutputStream.toByteArray();
            }
            try {
                byteArrayOutputStream.write(((o) gVar.a(i2)).a("DER"));
                i = i2 + 1;
            } catch (IOException e) {
                throw new t("malformed object: ".concat(String.valueOf(e)), e);
            }
        }
    }

    @Override // org.bouncycastle.a.a, org.bouncycastle.a.u
    final void a(s sVar) throws IOException {
        sVar.a(this.a ? 96 : 64, this.b, this.c);
    }
}
