package org.bouncycastle.p054a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: org.bouncycastle.a.as */
/* JADX INFO: loaded from: classes.dex */
public final class C0556as extends AbstractC0498a {
    public C0556as(C0625g c0625g) {
        super(true, 0, m1413a(c0625g));
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m1413a(C0625g c0625g) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 == c0625g.m1519a()) {
                return byteArrayOutputStream.toByteArray();
            }
            try {
                byteArrayOutputStream.write(((AbstractC0650o) c0625g.m1520a(i2)).m1577a("DER"));
                i = i2 + 1;
            } catch (IOException e) {
                throw new C0684t("malformed object: ".concat(String.valueOf(e)), e);
            }
        }
    }

    @Override // org.bouncycastle.p054a.AbstractC0498a, org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) throws IOException {
        c0660s.m1604a(this.f1869a ? 96 : 64, this.f1870b, this.f1871c);
    }
}
