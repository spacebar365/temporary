package p000a.p006d.p009c;

import p000a.InterfaceC0290n;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.c.d */
/* JADX INFO: compiled from: FileEndOfFileInformation.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0059d implements InterfaceC0062g, InterfaceC0290n {

    /* JADX INFO: renamed from: a */
    private long f281a;

    public C0059d() {
    }

    @Override // p000a.p006d.p009c.InterfaceC0062g
    /* JADX INFO: renamed from: g */
    public final byte mo232g() {
        return (byte) 20;
    }

    public C0059d(byte b) {
        this.f281a = 0L;
    }

    @Override // p000a.InterfaceC0286j
    /* JADX INFO: renamed from: a */
    public final int mo201a(byte[] bArr, int i, int i2) {
        this.f281a = C0173a.m513c(bArr, i);
        return 8;
    }

    @Override // p000a.InterfaceC0290n
    /* JADX INFO: renamed from: a */
    public final int mo198a() {
        return 8;
    }

    @Override // p000a.InterfaceC0290n
    /* JADX INFO: renamed from: a */
    public final int mo199a(byte[] bArr, int i) {
        C0173a.m514c(this.f281a, bArr, i);
        return 8;
    }

    public final String toString() {
        return new String("EndOfFileInformation[endOfFile=" + this.f281a + "]");
    }
}
