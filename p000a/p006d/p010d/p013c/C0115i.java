package p000a.p006d.p010d.p013c;

import p000a.InterfaceC0267h;

/* JADX INFO: renamed from: a.d.d.c.i */
/* JADX INFO: compiled from: TransWaitNamedPipe.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0115i extends AbstractC0104a {
    public C0115i(InterfaceC0267h interfaceC0267h, String str) {
        super(interfaceC0267h, (byte) 37, (byte) 83);
        this.f513G = str;
        this.f511E = -1;
        this.f508B = 0;
        this.f509C = 0;
        this.f510D = (byte) 0;
        this.f512F = 2;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: j */
    protected final int mo319j(byte[] bArr, int i) {
        int i2 = i + 1;
        bArr[i] = m381X();
        int i3 = i2 + 1;
        bArr[i2] = 0;
        bArr[i3] = 0;
        bArr[i3 + 1] = 0;
        return 4;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: k */
    protected final int mo320k(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: l */
    protected final int mo321l(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a, p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("TransWaitNamedPipe[" + super.toString() + ",pipeName=" + this.f513G + "]");
    }
}
