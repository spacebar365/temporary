package org.bouncycastle.p083b.p097k;

import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.k.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1048a implements InterfaceC1003i {

    /* JADX INFO: renamed from: a */
    private byte[] f4373a;

    /* JADX INFO: renamed from: b */
    private byte[] f4374b;

    /* JADX INFO: renamed from: c */
    private C1076ba f4375c;

    /* JADX INFO: renamed from: d */
    private int f4376d;

    public C1048a(C1076ba c1076ba, int i, byte[] bArr) {
        this(c1076ba, i, bArr, null);
    }

    public C1048a(C1076ba c1076ba, int i, byte[] bArr, byte[] bArr2) {
        this.f4375c = c1076ba;
        this.f4374b = C1535a.m4086b(bArr);
        this.f4376d = i;
        this.f4373a = C1535a.m4086b(bArr2);
    }

    /* JADX INFO: renamed from: a */
    public final C1076ba m2558a() {
        return this.f4375c;
    }

    /* JADX INFO: renamed from: b */
    public final int m2559b() {
        return this.f4376d;
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m2560c() {
        return C1535a.m4086b(this.f4373a);
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m2561d() {
        return C1535a.m4086b(this.f4374b);
    }
}
