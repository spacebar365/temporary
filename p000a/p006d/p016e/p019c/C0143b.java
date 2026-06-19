package p000a.p006d.p016e.p019c;

import p000a.InterfaceC0267h;
import p000a.p006d.C0175g;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.e.c.b */
/* JADX INFO: compiled from: Smb2ReadResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0143b extends AbstractC0146d {

    /* JADX INFO: renamed from: a */
    private int f707a;

    /* JADX INFO: renamed from: b */
    private int f708b;

    /* JADX INFO: renamed from: c */
    private byte[] f709c;

    /* JADX INFO: renamed from: d */
    private int f710d;

    public C0143b(InterfaceC0267h interfaceC0267h, byte[] bArr, int i) {
        super(interfaceC0267h);
        this.f709c = bArr;
        this.f710d = i;
    }

    /* JADX INFO: renamed from: e */
    public final int m466e() {
        return this.f708b;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: d */
    protected final int mo411d(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: e */
    protected final int mo412e(byte[] bArr, int i) throws C0175g {
        int iM509a = C0173a.m509a(bArr, i);
        if (iM509a == 9) {
            return m440c(bArr, i);
        }
        if (iM509a != 17) {
            throw new C0175g("Expected structureSize = 17");
        }
        short s = bArr[i + 2];
        int i2 = i + 4;
        this.f708b = C0173a.m511b(bArr, i2);
        int i3 = i2 + 4;
        this.f707a = C0173a.m511b(bArr, i3);
        int i4 = i3 + 4 + 4;
        int iM = s + m432M();
        if (this.f708b + this.f710d > this.f709c.length) {
            throw new C0175g("Buffer to small for read response");
        }
        System.arraycopy(bArr, iM, this.f709c, this.f710d, this.f708b);
        return Math.max(i4, iM + this.f708b) - i;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: T */
    protected final boolean mo434T() {
        return m425A() != -2147483643 && super.mo434T();
    }
}
