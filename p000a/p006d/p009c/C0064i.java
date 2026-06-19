package p000a.p006d.p009c;

import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.c.i */
/* JADX INFO: compiled from: FileStandardInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0064i implements InterfaceC0056a {

    /* JADX INFO: renamed from: a */
    private long f291a;

    /* JADX INFO: renamed from: b */
    private long f292b;

    /* JADX INFO: renamed from: c */
    private int f293c;

    /* JADX INFO: renamed from: d */
    private boolean f294d;

    /* JADX INFO: renamed from: e */
    private boolean f295e;

    @Override // p000a.p006d.p009c.InterfaceC0062g
    /* JADX INFO: renamed from: g */
    public final byte mo232g() {
        return (byte) 5;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: b */
    public final int mo227b() {
        return 0;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: b_ */
    public final long mo228b_() {
        return 0L;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: d */
    public final long mo230d() {
        return 0L;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: e */
    public final long mo231e() {
        return 0L;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: c_ */
    public final long mo229c_() {
        return this.f292b;
    }

    @Override // p000a.InterfaceC0286j
    /* JADX INFO: renamed from: a */
    public final int mo201a(byte[] bArr, int i, int i2) {
        this.f291a = C0173a.m513c(bArr, i);
        int i3 = i + 8;
        this.f292b = C0173a.m513c(bArr, i3);
        int i4 = i3 + 8;
        this.f293c = C0173a.m511b(bArr, i4);
        int i5 = i4 + 4;
        int i6 = i5 + 1;
        this.f294d = (bArr[i5] & 255) > 0;
        int i7 = i6 + 1;
        this.f295e = (bArr[i6] & 255) > 0;
        return i7 - i;
    }

    @Override // p000a.InterfaceC0290n
    /* JADX INFO: renamed from: a */
    public final int mo198a() {
        return 22;
    }

    @Override // p000a.InterfaceC0290n
    /* JADX INFO: renamed from: a */
    public final int mo199a(byte[] bArr, int i) {
        C0173a.m514c(this.f291a, bArr, i);
        int i2 = i + 8;
        C0173a.m514c(this.f292b, bArr, i2);
        int i3 = i2 + 8;
        C0173a.m512b(this.f293c, bArr, i3);
        int i4 = i3 + 4;
        int i5 = i4 + 1;
        bArr[i4] = (byte) (this.f294d ? 1 : 0);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (this.f295e ? 1 : 0);
        return i6 - i;
    }

    public final String toString() {
        return new String("SmbQueryInfoStandard[allocationSize=" + this.f291a + ",endOfFile=" + this.f292b + ",numberOfLinks=" + this.f293c + ",deletePending=" + this.f294d + ",directory=" + this.f295e + "]");
    }
}
