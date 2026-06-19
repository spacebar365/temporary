package org.bouncycastle.p083b.p097k;

import org.bouncycastle.p083b.InterfaceC1003i;

/* JADX INFO: renamed from: org.bouncycastle.b.k.bh */
/* JADX INFO: loaded from: classes.dex */
public final class C1083bh implements InterfaceC1003i {

    /* JADX INFO: renamed from: a */
    private byte[] f4426a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1003i f4427b;

    public C1083bh(InterfaceC1003i interfaceC1003i, byte[] bArr) {
        this(interfaceC1003i, bArr, bArr.length);
    }

    private C1083bh(InterfaceC1003i interfaceC1003i, byte[] bArr, int i) {
        this.f4426a = new byte[i];
        this.f4427b = interfaceC1003i;
        System.arraycopy(bArr, 0, this.f4426a, 0, i);
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m2617a() {
        return this.f4426a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC1003i m2618b() {
        return this.f4427b;
    }
}
