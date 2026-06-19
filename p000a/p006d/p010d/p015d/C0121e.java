package p000a.p006d.p010d.p015d;

import p000a.InterfaceC0267h;
import p000a.p006d.p007a.C0049d;
import p000a.p006d.p010d.p013c.AbstractC0108b;

/* JADX INFO: renamed from: a.d.d.d.e */
/* JADX INFO: compiled from: Trans2GetDfsReferralResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0121e extends AbstractC0108b {

    /* JADX INFO: renamed from: C */
    private final C0049d f592C;

    public C0121e(InterfaceC0267h interfaceC0267h) {
        super(interfaceC0267h);
        this.f592C = new C0049d();
        m396b((byte) 16);
    }

    /* JADX INFO: renamed from: q */
    public final C0049d m405q() {
        return this.f592C;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: w */
    public final boolean mo376w() {
        return true;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0108b
    /* JADX INFO: renamed from: j */
    protected final int mo323j(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0108b
    /* JADX INFO: renamed from: a */
    protected final int mo322a(byte[] bArr, int i, int i2) {
        return (this.f592C.mo201a(bArr, i, i2) + i) - i;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0108b, p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("Trans2GetDfsReferralResponse[" + super.toString() + ",buffer=" + this.f592C + "]");
    }
}
