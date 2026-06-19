package p000a.p006d.p010d.p011a;

import p000a.InterfaceC0267h;
import p000a.p006d.p010d.AbstractC0103c;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.d.a.s */
/* JADX INFO: compiled from: SmbComSeekResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0089s extends AbstractC0103c {

    /* JADX INFO: renamed from: n */
    private long f410n;

    public C0089s(InterfaceC0267h interfaceC0267h) {
        super(interfaceC0267h);
    }

    /* JADX INFO: renamed from: q */
    public final long m303q() {
        return this.f410n;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: f */
    protected final int mo253f(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: g */
    protected final int mo254g(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: h */
    protected final int mo255h(byte[] bArr, int i) {
        this.f410n = C0173a.m511b(bArr, i);
        return 4;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: i */
    protected final int mo256i(byte[] bArr, int i) {
        return 0;
    }
}
