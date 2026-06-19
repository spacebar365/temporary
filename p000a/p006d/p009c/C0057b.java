package p000a.p006d.p009c;

import java.util.Date;
import p000a.p006d.p025f.C0173a;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.d.c.b */
/* JADX INFO: compiled from: FileBasicInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0057b implements InterfaceC0056a {

    /* JADX INFO: renamed from: a */
    private long f262a;

    /* JADX INFO: renamed from: b */
    private long f263b;

    /* JADX INFO: renamed from: c */
    private long f264c;

    /* JADX INFO: renamed from: d */
    private long f265d;

    /* JADX INFO: renamed from: e */
    private int f266e;

    @Override // p000a.p006d.p009c.InterfaceC0062g
    /* JADX INFO: renamed from: g */
    public final byte mo232g() {
        return (byte) 4;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: b */
    public final int mo227b() {
        return this.f266e;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: b_ */
    public final long mo228b_() {
        return this.f262a;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: d */
    public final long mo230d() {
        return this.f264c;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: e */
    public final long mo231e() {
        return this.f263b;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: c_ */
    public final long mo229c_() {
        return 0L;
    }

    @Override // p000a.InterfaceC0286j
    /* JADX INFO: renamed from: a */
    public final int mo201a(byte[] bArr, int i, int i2) {
        this.f262a = C0173a.m515d(bArr, i);
        int i3 = i + 8;
        this.f263b = C0173a.m515d(bArr, i3);
        int i4 = i3 + 8;
        this.f264c = C0173a.m515d(bArr, i4);
        int i5 = i4 + 8;
        this.f265d = C0173a.m515d(bArr, i5);
        int i6 = i5 + 8;
        this.f266e = C0173a.m511b(bArr, i6);
        return (i6 + 4) - i;
    }

    @Override // p000a.InterfaceC0290n
    /* JADX INFO: renamed from: a */
    public final int mo198a() {
        return 40;
    }

    @Override // p000a.InterfaceC0290n
    /* JADX INFO: renamed from: a */
    public final int mo199a(byte[] bArr, int i) {
        C0173a.m516d(this.f262a, bArr, i);
        int i2 = i + 8;
        C0173a.m516d(this.f263b, bArr, i2);
        int i3 = i2 + 8;
        C0173a.m516d(this.f264c, bArr, i3);
        int i4 = i3 + 8;
        C0173a.m516d(this.f265d, bArr, i4);
        int i5 = i4 + 8;
        C0173a.m512b(this.f266e, bArr, i5);
        return ((i5 + 4) + 4) - i;
    }

    public final String toString() {
        return new String("SmbQueryFileBasicInfo[createTime=" + new Date(this.f262a) + ",lastAccessTime=" + new Date(this.f263b) + ",lastWriteTime=" + new Date(this.f264c) + ",changeTime=" + new Date(this.f265d) + ",attributes=0x" + C0284e.m947a(this.f266e, 4) + "]");
    }
}
