package org.bouncycastle.b;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public class h {
    protected SecureRandom a;
    protected int b;

    public void a(x xVar) {
        this.a = xVar.a();
        this.b = (xVar.b() + 7) / 8;
    }

    public byte[] a() {
        byte[] bArr = new byte[this.b];
        this.a.nextBytes(bArr);
        return bArr;
    }
}
