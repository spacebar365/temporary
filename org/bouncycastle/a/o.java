package org.bouncycastle.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class o implements f {
    public final byte[] a(String str) throws IOException {
        if (str.equals("DER")) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new bg(byteArrayOutputStream).a(this);
            return byteArrayOutputStream.toByteArray();
        }
        if (!str.equals("DL")) {
            return k();
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        new bv(byteArrayOutputStream2).a(this);
        return byteArrayOutputStream2.toByteArray();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return i().equals(((f) obj).i());
        }
        return false;
    }

    public int hashCode() {
        return i().hashCode();
    }

    @Override // org.bouncycastle.a.f
    public abstract u i();

    public byte[] k() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new s(byteArrayOutputStream).a(this);
        return byteArrayOutputStream.toByteArray();
    }
}
