package p000a.p006d.p010d.p015d;

import p000a.InterfaceC0267h;
import p000a.p006d.p010d.p013c.AbstractC0104a;
import p000a.p006d.p025f.C0173a;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.d.d.d.c */
/* JADX INFO: compiled from: Trans2FindNext2.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0119c extends AbstractC0104a {

    /* JADX INFO: renamed from: I */
    private String f584I;

    /* JADX INFO: renamed from: J */
    private long f585J;

    /* JADX INFO: renamed from: n */
    private int f586n;

    /* JADX INFO: renamed from: o */
    private int f587o;

    /* JADX INFO: renamed from: p */
    private int f588p;

    /* JADX INFO: renamed from: q */
    private int f589q;

    public C0119c(InterfaceC0267h interfaceC0267h, int i, int i2, String str, int i3, int i4) {
        super(interfaceC0267h, (byte) 50, (byte) 2);
        this.f586n = i;
        this.f588p = i2;
        this.f584I = str;
        this.f587o = 260;
        this.f589q = 0;
        this.f508B = 8;
        this.f585J = i3;
        this.f509C = i4;
        this.f510D = (byte) 0;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: a */
    public final void mo318a(int i, String str) {
        super.mo217e_();
        this.f588p = i;
        this.f584I = str;
        this.f486e = 0;
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
        C0173a.m510a(this.f586n, bArr, i);
        int i2 = i + 2;
        C0173a.m510a(this.f585J, bArr, i2);
        int i3 = i2 + 2;
        C0173a.m510a(this.f587o, bArr, i3);
        int i4 = i3 + 2;
        C0173a.m512b(this.f588p, bArr, i4);
        int i5 = i4 + 4;
        C0173a.m510a(this.f589q, bArr, i5);
        int i6 = i5 + 2;
        return (i6 + m346a(this.f584I, bArr, i6)) - i;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: l */
    protected final int mo321l(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a, p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("Trans2FindNext2[" + super.toString() + ",sid=" + this.f586n + ",searchCount=" + m343T().mo44ai() + ",informationLevel=0x" + C0284e.m947a(this.f587o, 3) + ",resumeKey=0x" + C0284e.m947a(this.f588p, 4) + ",flags=0x" + C0284e.m947a(this.f589q, 2) + ",filename=" + this.f584I + "]");
    }
}
