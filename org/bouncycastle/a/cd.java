package org.bouncycastle.a;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes.dex */
final class cd implements Enumeration {
    private l a;
    private Object b = a();

    public cd(byte[] bArr) {
        this.a = new l(bArr, (byte) 0);
    }

    private Object a() {
        try {
            return this.a.b();
        } catch (IOException e) {
            throw new t("malformed DER construction: ".concat(String.valueOf(e)), e);
        }
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.b != null;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        Object obj = this.b;
        this.b = a();
        return obj;
    }
}
