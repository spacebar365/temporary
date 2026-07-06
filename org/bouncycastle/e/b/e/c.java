package org.bouncycastle.e.b.e;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {
    private final byte[] b;

    public c(byte[] bArr, String str) {
        super(false, str);
        this.b = org.bouncycastle.f.a.b(bArr);
    }

    public final byte[] c() {
        return org.bouncycastle.f.a.b(this.b);
    }
}
