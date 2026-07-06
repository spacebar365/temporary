package org.bouncycastle.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ae extends a {
    public ae(int i, g gVar) {
        super(true, i, a(gVar));
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
                byteArrayOutputStream.write(((o) gVar.a(i2)).a("BER"));
                i = i2 + 1;
            } catch (IOException e) {
                throw new t("malformed object: ".concat(String.valueOf(e)), e);
            }
        }
    }

    @Override // org.bouncycastle.a.a, org.bouncycastle.a.u
    final void a(s sVar) throws IOException {
        sVar.a(this.a ? 96 : 64, this.b);
        sVar.b(128);
        sVar.a(this.c);
        sVar.b(0);
        sVar.b(0);
    }
}
