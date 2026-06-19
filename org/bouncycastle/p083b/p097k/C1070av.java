package org.bouncycastle.p083b.p097k;

import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.k.av */
/* JADX INFO: loaded from: classes.dex */
public class C1070av implements InterfaceC1003i {

    /* JADX INFO: renamed from: a */
    private byte[] f4400a;

    /* JADX INFO: renamed from: b */
    private byte[] f4401b;

    /* JADX INFO: renamed from: c */
    private int f4402c;

    public C1070av(byte[] bArr, byte[] bArr2, int i) {
        this.f4400a = C1535a.m4086b(bArr);
        this.f4401b = C1535a.m4086b(bArr2);
        this.f4402c = i;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m2591a() {
        return C1535a.m4086b(this.f4400a);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m2592b() {
        return C1535a.m4086b(this.f4401b);
    }

    /* JADX INFO: renamed from: c */
    public final int m2593c() {
        return this.f4402c;
    }
}
