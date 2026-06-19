package org.bouncycastle.p083b.p097k;

import org.bouncycastle.p083b.InterfaceC1003i;

/* JADX INFO: renamed from: org.bouncycastle.b.k.ba */
/* JADX INFO: loaded from: classes.dex */
public class C1076ba implements InterfaceC1003i {

    /* JADX INFO: renamed from: a */
    private byte[] f4412a;

    public C1076ba(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public C1076ba(byte[] bArr, int i, int i2) {
        this.f4412a = new byte[i2];
        System.arraycopy(bArr, i, this.f4412a, 0, i2);
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m2603a() {
        return this.f4412a;
    }
}
