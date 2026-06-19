package p000a.p006d.p010d.p013c;

import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.InterfaceC0267h;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.d.c.g */
/* JADX INFO: compiled from: TransTransactNamedPipe.java */
/* JADX INFO: loaded from: classes.dex */
public class C0113g extends AbstractC0104a {

    /* JADX INFO: renamed from: n */
    private static final InterfaceC1612b f565n = C1620c.m4563a((Class<?>) C0113g.class);

    /* JADX INFO: renamed from: I */
    private int f566I;

    /* JADX INFO: renamed from: o */
    private byte[] f567o;

    /* JADX INFO: renamed from: p */
    private int f568p;

    /* JADX INFO: renamed from: q */
    private int f569q;

    public C0113g(InterfaceC0267h interfaceC0267h, int i, byte[] bArr, int i2, int i3) {
        super(interfaceC0267h, (byte) 37, (byte) 38);
        this.f568p = i;
        this.f567o = bArr;
        this.f569q = i2;
        this.f566I = i3;
        this.f508B = 0;
        this.f509C = 65535;
        this.f510D = (byte) 0;
        this.f512F = 2;
        this.f513G = "\\PIPE\\";
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: j */
    protected final int mo319j(byte[] bArr, int i) {
        int i2 = i + 1;
        bArr[i] = m381X();
        bArr[i2] = 0;
        C0173a.m510a(this.f568p, bArr, i2 + 1);
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
        if (bArr.length - i < this.f566I) {
            f565n.mo4534b("TransTransactNamedPipe data too long for buffer");
            return 0;
        }
        System.arraycopy(this.f567o, this.f569q, bArr, i, this.f566I);
        return this.f566I;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a, p000a.p006d.p010d.AbstractC0103c
    public String toString() {
        return new String("TransTransactNamedPipe[" + super.toString() + ",pipeFid=" + this.f568p + "]");
    }
}
