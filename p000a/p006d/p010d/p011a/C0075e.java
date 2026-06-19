package p000a.p006d.p010d.p011a;

import p000a.InterfaceC0267h;
import p000a.p006d.p010d.AbstractC0103c;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.d.a.e */
/* JADX INFO: compiled from: SmbComFindClose2.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0075e extends AbstractC0103c {

    /* JADX INFO: renamed from: n */
    private int f330n;

    public C0075e(InterfaceC0267h interfaceC0267h, int i) {
        super(interfaceC0267h, (byte) 52);
        this.f330n = i;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: f */
    protected final int mo253f(byte[] bArr, int i) {
        C0173a.m510a(this.f330n, bArr, i);
        return 2;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: g */
    protected final int mo254g(byte[] bArr, int i) {
        return 0;
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
        return new String("SmbComFindClose2[" + super.toString() + ",sid=" + this.f330n + "]");
    }
}
