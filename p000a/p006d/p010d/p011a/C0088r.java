package p000a.p006d.p010d.p011a;

import p000a.InterfaceC0267h;
import p000a.p006d.p010d.AbstractC0103c;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.d.a.r */
/* JADX INFO: compiled from: SmbComSeek.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0088r extends AbstractC0103c {

    /* JADX INFO: renamed from: n */
    private int f407n;

    /* JADX INFO: renamed from: o */
    private int f408o;

    /* JADX INFO: renamed from: p */
    private long f409p;

    public C0088r(InterfaceC0267h interfaceC0267h) {
        super(interfaceC0267h, (byte) 18);
        this.f407n = 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m301j(int i) {
        this.f407n = i;
    }

    /* JADX INFO: renamed from: q */
    public final void m302q() {
        this.f408o = 2;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: f */
    protected final int mo253f(byte[] bArr, int i) {
        C0173a.m510a(this.f407n, bArr, i);
        int i2 = i + 2;
        C0173a.m510a(this.f408o, bArr, i2);
        int i3 = i2 + 2;
        C0173a.m512b(this.f409p, bArr, i3);
        return (i3 + 4) - i;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: g */
    protected final int mo254g(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: h */
    protected final int mo255h(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: i */
    protected final int mo256i(byte[] bArr, int i) {
        return 0;
    }
}
