package p000a.p006d.p010d.p013c;

import p000a.InterfaceC0267h;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.d.c.e */
/* JADX INFO: compiled from: TransPeekNamedPipe.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0111e extends AbstractC0104a {

    /* JADX INFO: renamed from: n */
    private int f563n;

    public C0111e(InterfaceC0267h interfaceC0267h, String str, int i) {
        super(interfaceC0267h, (byte) 37, (byte) 35);
        this.f513G = str;
        this.f563n = i;
        this.f511E = -1;
        this.f508B = 6;
        this.f509C = 1;
        this.f510D = (byte) 0;
        this.f512F = 2;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: j */
    protected final int mo319j(byte[] bArr, int i) {
        int i2 = i + 1;
        bArr[i] = m381X();
        bArr[i2] = 0;
        C0173a.m510a(this.f563n, bArr, i2 + 1);
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
        return new String("TransPeekNamedPipe[" + super.toString() + ",pipeName=" + this.f513G + "]");
    }
}
