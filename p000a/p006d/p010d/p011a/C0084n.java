package p000a.p006d.p010d.p011a;

import p000a.InterfaceC0267h;
import p000a.p006d.p010d.AbstractC0103c;

/* JADX INFO: renamed from: a.d.d.a.n */
/* JADX INFO: compiled from: SmbComQueryInformation.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0084n extends AbstractC0103c {
    public C0084n(InterfaceC0267h interfaceC0267h, String str) {
        super(interfaceC0267h, (byte) 8, str);
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: f */
    protected final int mo253f(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: g */
    protected final int mo254g(byte[] bArr, int i) {
        int i2 = i + 1;
        bArr[i] = 4;
        return (i2 + m346a(this.f493l, bArr, i2)) - i;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: h */
    protected final int mo255h(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: i */
    protected final int mo256i(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("SmbComQueryInformation[" + super.toString() + ",filename=" + this.f493l + "]");
    }
}
