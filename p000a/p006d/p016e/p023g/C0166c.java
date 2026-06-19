package p000a.p006d.p016e.p023g;

import p000a.InterfaceC0016c;
import p000a.p006d.p016e.AbstractC0134b;
import p000a.p006d.p016e.AbstractC0141c;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.e.g.c */
/* JADX INFO: compiled from: Smb2SessionSetupRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0166c extends AbstractC0141c<C0167d> {

    /* JADX INFO: renamed from: a */
    private byte[] f803a;

    /* JADX INFO: renamed from: b */
    private int f804b;

    /* JADX INFO: renamed from: c */
    private boolean f805c;

    /* JADX INFO: renamed from: d */
    private long f806d;

    /* JADX INFO: renamed from: e */
    private int f807e;

    public C0166c(InterfaceC0016c interfaceC0016c, int i, int i2, long j, byte[] bArr) {
        super(interfaceC0016c.mo114a(), 1);
        this.f807e = i;
        this.f804b = i2;
        this.f806d = j;
        this.f803a = bArr;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: a */
    public final boolean mo437a(AbstractC0134b abstractC0134b) {
        abstractC0134b.mo215b(-1L);
        return super.mo437a(abstractC0134b);
    }

    @Override // p000a.p006d.InterfaceC0055c
    /* JADX INFO: renamed from: l_ */
    public final int mo225l_() {
        return m424i((this.f803a != null ? this.f803a.length : 0) + 88);
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: d */
    protected final int mo411d(byte[] bArr, int i) {
        C0173a.m510a(25L, bArr, i);
        bArr[i + 2] = (byte) (this.f805c ? 1 : 0);
        bArr[i + 3] = (byte) this.f807e;
        int i2 = i + 4;
        C0173a.m512b(this.f804b, bArr, i2);
        int i3 = i2 + 4;
        C0173a.m512b(0L, bArr, i3);
        int i4 = i3 + 4;
        int i5 = i4 + 2;
        C0173a.m510a(this.f803a != null ? this.f803a.length : 0L, bArr, i5);
        int i6 = i5 + 2;
        C0173a.m514c(this.f806d, bArr, i6);
        int i7 = i6 + 8;
        C0173a.m510a(i7 - m432M(), bArr, i4);
        int iJ = m446j(i7) + i7;
        if (this.f803a != null) {
            System.arraycopy(this.f803a, 0, bArr, iJ, this.f803a.length);
            iJ += this.f803a.length;
        }
        return iJ - i;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: e */
    protected final int mo412e(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p016e.AbstractC0141c
    /* JADX INFO: renamed from: c */
    protected final /* synthetic */ AbstractC0146d mo410c(InterfaceC0016c interfaceC0016c) {
        return new C0167d(interfaceC0016c.mo114a());
    }
}
