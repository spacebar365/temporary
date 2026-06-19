package p000a.p006d.p010d.p013c.p014a;

import p000a.p006d.p025f.C0173a;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.d.d.c.a.a */
/* JADX INFO: compiled from: NtTransQuerySecurityDesc.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0105a extends AbstractC0107c {

    /* JADX INFO: renamed from: n */
    int f533n;

    /* JADX INFO: renamed from: o */
    int f534o;

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: aa */
    public final int mo384aa() {
        return 4;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: j */
    protected final int mo319j(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: k */
    protected final int mo320k(byte[] bArr, int i) {
        C0173a.m510a(this.f533n, bArr, i);
        int i2 = i + 2;
        int i3 = i2 + 1;
        bArr[i2] = 0;
        int i4 = i3 + 1;
        bArr[i3] = 0;
        C0173a.m512b(this.f534o, bArr, i4);
        return (i4 + 4) - i;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: l */
    protected final int mo321l(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a, p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("NtTransQuerySecurityDesc[" + super.toString() + ",fid=0x" + C0284e.m947a(this.f533n, 4) + ",securityInformation=0x" + C0284e.m947a(this.f534o, 8) + "]");
    }
}
