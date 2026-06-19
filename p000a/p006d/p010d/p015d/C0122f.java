package p000a.p006d.p010d.p015d;

import p000a.InterfaceC0267h;
import p000a.p006d.p010d.p013c.AbstractC0104a;
import p000a.p006d.p025f.C0173a;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.d.d.d.f */
/* JADX INFO: compiled from: Trans2QueryFSInformation.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0122f extends AbstractC0104a {

    /* JADX INFO: renamed from: n */
    private int f593n;

    public C0122f(InterfaceC0267h interfaceC0267h, int i) {
        super(interfaceC0267h, (byte) 50, (byte) 3);
        this.f593n = i;
        this.f532z = 2;
        this.f507A = 0;
        this.f508B = 0;
        this.f509C = 800;
        this.f510D = (byte) 0;
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
        int i2;
        switch (this.f593n) {
            case -1:
                i2 = 1;
                break;
            case 3:
                i2 = 259;
                break;
            default:
                throw new IllegalArgumentException("Unhandled information level");
        }
        C0173a.m510a(i2, bArr, i);
        return (i + 2) - i;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: l */
    protected final int mo321l(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a, p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("Trans2QueryFSInformation[" + super.toString() + ",informationLevel=0x" + C0284e.m947a(this.f593n, 3) + "]");
    }
}
