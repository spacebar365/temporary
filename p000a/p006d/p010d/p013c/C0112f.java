package p000a.p006d.p010d.p013c;

import p000a.InterfaceC0267h;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.d.c.f */
/* JADX INFO: compiled from: TransPeekNamedPipeResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0112f extends AbstractC0108b {

    /* JADX INFO: renamed from: C */
    private int f564C;

    public C0112f(InterfaceC0267h interfaceC0267h) {
        super(interfaceC0267h);
    }

    /* JADX INFO: renamed from: q */
    public final int m400q() {
        return this.f564C;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0108b
    /* JADX INFO: renamed from: j */
    protected final int mo323j(byte[] bArr, int i) {
        this.f564C = C0173a.m509a(bArr, i);
        int i2 = i + 2;
        C0173a.m509a(bArr, i2);
        m398j(C0173a.m509a(bArr, i2 + 2));
        return 6;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0108b
    /* JADX INFO: renamed from: a */
    protected final int mo322a(byte[] bArr, int i, int i2) {
        return 0;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0108b, p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("TransPeekNamedPipeResponse[" + super.toString() + "]");
    }
}
