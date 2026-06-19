package org.bouncycastle.p054a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: org.bouncycastle.a.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0650o implements InterfaceC0618f {
    /* JADX INFO: renamed from: a */
    public final byte[] m1577a(String str) throws IOException {
        if (str.equals("DER")) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new C0583bg(byteArrayOutputStream).mo1459a(this);
            return byteArrayOutputStream.toByteArray();
        }
        if (!str.equals("DL")) {
            return mo1578k();
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        new C0598bv(byteArrayOutputStream2).mo1459a(this);
        return byteArrayOutputStream2.toByteArray();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InterfaceC0618f) {
            return mo1358i().equals(((InterfaceC0618f) obj).mo1358i());
        }
        return false;
    }

    public int hashCode() {
        return mo1358i().hashCode();
    }

    @Override // org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public abstract AbstractC0686u mo1358i();

    /* JADX INFO: renamed from: k */
    public byte[] mo1578k() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new C0660s(byteArrayOutputStream).mo1459a(this);
        return byteArrayOutputStream.toByteArray();
    }
}
