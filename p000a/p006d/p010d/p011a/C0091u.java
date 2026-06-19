package p000a.p006d.p010d.p011a;

import p000a.InterfaceC0267h;
import p000a.p006d.p010d.AbstractC0068a;
import p000a.p006d.p010d.AbstractC0103c;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.d.a.u */
/* JADX INFO: compiled from: SmbComSessionSetupAndXResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0091u extends AbstractC0068a {

    /* JADX INFO: renamed from: n */
    private String f418n;

    /* JADX INFO: renamed from: o */
    private String f419o;

    /* JADX INFO: renamed from: p */
    private String f420p;

    /* JADX INFO: renamed from: q */
    private boolean f421q;

    /* JADX INFO: renamed from: r */
    private byte[] f422r;

    public C0091u(InterfaceC0267h interfaceC0267h, AbstractC0103c abstractC0103c) {
        super(interfaceC0267h, abstractC0103c);
        this.f418n = "";
        this.f419o = "";
        this.f420p = "";
        this.f422r = null;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m304W() {
        return this.f421q;
    }

    /* JADX INFO: renamed from: X */
    public final byte[] m305X() {
        return this.f422r;
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
        this.f421q = (bArr[i] & 1) == 1;
        int i2 = i + 2;
        if (m326B()) {
            int iM509a = C0173a.m509a(bArr, i2);
            i2 += 2;
            this.f422r = new byte[iM509a];
        }
        return i2 - i;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: i */
    protected final int mo256i(byte[] bArr, int i) {
        int length;
        if (m326B()) {
            System.arraycopy(bArr, i, this.f422r, 0, this.f422r.length);
            length = this.f422r.length + i;
        } else {
            length = i;
        }
        this.f418n = m358c(bArr, length);
        int iA = length + m345a(this.f418n, length);
        this.f419o = m349a(bArr, iA, m327C());
        int iA2 = iA + m345a(this.f419o, iA);
        if (!m326B()) {
            this.f420p = m349a(bArr, iA2, m327C());
            iA2 += m345a(this.f420p, iA2);
        }
        return iA2 - i;
    }

    @Override // p000a.p006d.p010d.AbstractC0068a, p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("SmbComSessionSetupAndXResponse[" + super.toString() + ",isLoggedInAsGuest=" + this.f421q + ",nativeOs=" + this.f418n + ",nativeLanMan=" + this.f419o + ",primaryDomain=" + this.f420p + "]");
    }
}
