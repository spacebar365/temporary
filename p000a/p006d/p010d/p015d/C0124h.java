package p000a.p006d.p010d.p015d;

import p000a.InterfaceC0267h;
import p000a.p006d.p010d.p013c.AbstractC0104a;
import p000a.p006d.p025f.C0173a;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.d.d.d.h */
/* JADX INFO: compiled from: Trans2QueryPathInformation.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0124h extends AbstractC0104a {

    /* JADX INFO: renamed from: n */
    private final int f596n;

    public C0124h(InterfaceC0267h interfaceC0267h, String str, int i) {
        super(interfaceC0267h, (byte) 50, (byte) 5);
        this.f493l = str;
        this.f596n = i;
        this.f507A = 0;
        this.f508B = 2;
        this.f509C = 40;
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
        long j;
        int i2 = this.f596n;
        switch (i2) {
            case 4:
                j = 257;
                break;
            case 5:
                j = 258;
                break;
            case 20:
                j = 260;
                break;
            default:
                throw new IllegalArgumentException("Unsupported information level ".concat(String.valueOf(i2)));
        }
        C0173a.m510a(j, bArr, i);
        int i3 = i + 2;
        int i4 = i3 + 1;
        bArr[i3] = 0;
        int i5 = i4 + 1;
        bArr[i4] = 0;
        int i6 = i5 + 1;
        bArr[i5] = 0;
        int i7 = i6 + 1;
        bArr[i6] = 0;
        return (i7 + m346a(this.f493l, bArr, i7)) - i;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: l */
    protected final int mo321l(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a, p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("Trans2QueryPathInformation[" + super.toString() + ",informationLevel=0x" + C0284e.m947a(this.f596n, 3) + ",filename=" + this.f493l + "]");
    }
}
