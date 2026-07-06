package org.bouncycastle.e.b.e;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    private final byte[] b;

    public b(byte[] bArr, String str) {
        super(true, str);
        this.b = org.bouncycastle.f.a.b(bArr);
    }

    public final byte[] c() {
        return org.bouncycastle.f.a.b(this.b);
    }
}
