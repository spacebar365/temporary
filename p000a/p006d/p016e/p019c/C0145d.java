package p000a.p006d.p016e.p019c;

import p000a.InterfaceC0267h;
import p000a.p006d.C0175g;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.e.c.d */
/* JADX INFO: compiled from: Smb2WriteResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0145d extends AbstractC0146d {

    /* JADX INFO: renamed from: a */
    private int f719a;

    /* JADX INFO: renamed from: b */
    private int f720b;

    public C0145d(InterfaceC0267h interfaceC0267h) {
        super(interfaceC0267h);
    }

    /* JADX INFO: renamed from: e */
    public final int m469e() {
        return this.f719a;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: d */
    protected final int mo411d(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: e */
    protected final int mo412e(byte[] bArr, int i) throws C0175g {
        if (C0173a.m509a(bArr, i) != 17) {
            throw new C0175g("Expected structureSize = 17");
        }
        int i2 = i + 4;
        this.f719a = C0173a.m511b(bArr, i2);
        int i3 = i2 + 4;
        this.f720b = C0173a.m511b(bArr, i3);
        return ((i3 + 4) + 4) - i;
    }
}
