package p000a.p006d.p010d.p011a;

import p000a.InterfaceC0267h;
import p000a.p006d.p010d.AbstractC0068a;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.d.a.aa */
/* JADX INFO: compiled from: SmbComWriteAndXResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0070aa extends AbstractC0068a {

    /* JADX INFO: renamed from: n */
    private long f308n;

    public C0070aa(InterfaceC0267h interfaceC0267h) {
        super(interfaceC0267h);
    }

    /* JADX INFO: renamed from: W */
    public final long m252W() {
        return this.f308n;
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
        this.f308n = ((long) C0173a.m509a(bArr, i)) & 65535;
        return 8;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: i */
    protected final int mo256i(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0068a, p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("SmbComWriteAndXResponse[" + super.toString() + ",count=" + this.f308n + "]");
    }
}
