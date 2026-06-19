package p000a.p006d.p010d.p013c;

import p000a.InterfaceC0267h;
import p000a.p006d.C0175g;

/* JADX INFO: renamed from: a.d.d.c.d */
/* JADX INFO: compiled from: TransCallNamedPipeResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0110d extends AbstractC0108b {

    /* JADX INFO: renamed from: C */
    private final byte[] f562C;

    public C0110d(InterfaceC0267h interfaceC0267h, byte[] bArr) {
        super(interfaceC0267h);
        this.f562C = bArr;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0108b
    /* JADX INFO: renamed from: j */
    protected final int mo323j(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0108b
    /* JADX INFO: renamed from: a */
    protected final int mo322a(byte[] bArr, int i, int i2) throws C0175g {
        if (i2 > this.f562C.length) {
            throw new C0175g("Payload exceeds buffer size");
        }
        System.arraycopy(bArr, i, this.f562C, 0, i2);
        return i2;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0108b, p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("TransCallNamedPipeResponse[" + super.toString() + "]");
    }
}
