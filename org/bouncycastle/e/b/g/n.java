package org.bouncycastle.e.b.g;

/* JADX INFO: loaded from: classes.dex */
final class n {
    private final byte[][] a;

    protected n(m mVar, byte[][] bArr) {
        if (mVar == null) {
            throw new NullPointerException("params == null");
        }
        if (aa.b(bArr)) {
            throw new NullPointerException("publicKey byte array == null");
        }
        if (bArr.length != mVar.d()) {
            throw new IllegalArgumentException("wrong publicKey size");
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != mVar.b()) {
                throw new IllegalArgumentException("wrong publicKey format");
            }
        }
        this.a = aa.a(bArr);
    }

    protected final byte[][] a() {
        return aa.a(this.a);
    }
}
