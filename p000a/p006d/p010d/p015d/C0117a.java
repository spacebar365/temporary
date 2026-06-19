package p000a.p006d.p010d.p015d;

import p000a.InterfaceC0267h;
import p000a.p006d.p010d.p013c.AbstractC0104a;
import p000a.p006d.p025f.C0173a;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.d.d.d.a */
/* JADX INFO: compiled from: Trans2FindFirst2.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0117a extends AbstractC0104a {

    /* JADX INFO: renamed from: I */
    private int f571I;

    /* JADX INFO: renamed from: J */
    private String f572J;

    /* JADX INFO: renamed from: n */
    private int f573n;

    /* JADX INFO: renamed from: o */
    private int f574o;

    /* JADX INFO: renamed from: p */
    private int f575p;

    /* JADX INFO: renamed from: q */
    private int f576q;

    public C0117a(InterfaceC0267h interfaceC0267h, String str, String str2, int i, int i2, int i3) {
        super(interfaceC0267h, (byte) 50, (byte) 1);
        this.f576q = 0;
        if (!str.equals("\\") && str.charAt(str.length() - 1) != '\\') {
            this.f493l = str + "\\";
        } else {
            this.f493l = str;
        }
        this.f572J = str2;
        this.f573n = i & 55;
        this.f574o = 0;
        this.f575p = 260;
        this.f507A = 0;
        this.f508B = 10;
        this.f571I = i2;
        this.f509C = i3;
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
        C0173a.m510a(this.f573n, bArr, i);
        int i2 = i + 2;
        C0173a.m510a(this.f571I, bArr, i2);
        int i3 = i2 + 2;
        C0173a.m510a(this.f574o, bArr, i3);
        int i4 = i3 + 2;
        C0173a.m510a(this.f575p, bArr, i4);
        int i5 = i4 + 2;
        C0173a.m512b(this.f576q, bArr, i5);
        int i6 = i5 + 4;
        return (i6 + m346a(this.f493l + this.f572J, bArr, i6)) - i;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: l */
    protected final int mo321l(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a, p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("Trans2FindFirst2[" + super.toString() + ",searchAttributes=0x" + C0284e.m947a(this.f573n, 2) + ",searchCount=" + this.f571I + ",flags=0x" + C0284e.m947a(this.f574o, 2) + ",informationLevel=0x" + C0284e.m947a(this.f575p, 3) + ",searchStorageType=" + this.f576q + ",filename=" + this.f493l + "]");
    }
}
