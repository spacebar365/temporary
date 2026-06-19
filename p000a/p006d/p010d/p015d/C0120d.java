package p000a.p006d.p010d.p015d;

import p000a.InterfaceC0267h;
import p000a.p006d.p007a.C0048c;
import p000a.p006d.p010d.p013c.AbstractC0104a;

/* JADX INFO: renamed from: a.d.d.d.d */
/* JADX INFO: compiled from: Trans2GetDfsReferral.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0120d extends AbstractC0104a {

    /* JADX INFO: renamed from: n */
    private int f590n;

    /* JADX INFO: renamed from: o */
    private final C0048c f591o;

    public C0120d(InterfaceC0267h interfaceC0267h, String str) {
        super(interfaceC0267h, (byte) 50, (byte) 16);
        this.f590n = 3;
        this.f591o = new C0048c(str);
        this.f507A = 0;
        this.f508B = 0;
        this.f509C = 4096;
        this.f510D = (byte) 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: w */
    public final boolean mo376w() {
        return true;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: j */
    protected final int mo319j(byte[] bArr, int i) {
        bArr[i] = m381X();
        bArr[i + 1] = 0;
        return 2;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: k */
    protected final int mo320k(byte[] bArr, int i) {
        return (this.f591o.mo199a(bArr, i) + i) - i;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: l */
    protected final int mo321l(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a, p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("Trans2GetDfsReferral[" + super.toString() + ",maxReferralLevel=0x" + this.f590n + ",filename=" + this.f493l + "]");
    }
}
