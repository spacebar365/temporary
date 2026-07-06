package org.bouncycastle.a;

/* JADX INFO: loaded from: classes.dex */
public final class bt extends c {
    public bt(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // org.bouncycastle.a.c, org.bouncycastle.a.u
    final void a(s sVar) {
        byte[] bArr = this.a;
        byte[] bArr2 = new byte[bArr.length + 1];
        bArr2[0] = (byte) f();
        System.arraycopy(bArr, 0, bArr2, 1, bArr2.length - 1);
        sVar.a(3, bArr2);
    }

    @Override // org.bouncycastle.a.u
    final boolean a() {
        return false;
    }

    @Override // org.bouncycastle.a.u
    final int e() {
        return ch.a(this.a.length + 1) + 1 + this.a.length + 1;
    }
}
