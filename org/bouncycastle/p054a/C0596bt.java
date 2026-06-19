package org.bouncycastle.p054a;

/* JADX INFO: renamed from: org.bouncycastle.a.bt */
/* JADX INFO: loaded from: classes.dex */
public final class C0596bt extends AbstractC0603c {
    public C0596bt(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // org.bouncycastle.p054a.AbstractC0603c, org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) {
        byte[] bArr = this.f2135a;
        byte[] bArr2 = new byte[bArr.length + 1];
        bArr2[0] = (byte) m1475f();
        System.arraycopy(bArr, 0, bArr2, 1, bArr2.length - 1);
        c0660s.m1605a(3, bArr2);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1336a() {
        return false;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        return C0612ch.m1488a(this.f2135a.length + 1) + 1 + this.f2135a.length + 1;
    }
}
