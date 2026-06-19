package p000a.p006d.p016e.p018b;

import p000a.InterfaceC0016c;
import p000a.InterfaceC0267h;
import p000a.InterfaceC0290n;
import p000a.p006d.p009c.InterfaceC0062g;
import p000a.p006d.p016e.AbstractC0141c;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p016e.InterfaceC0127a;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.e.b.e */
/* JADX INFO: compiled from: Smb2SetInfoRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0139e extends AbstractC0141c<C0140f> implements InterfaceC0127a {

    /* JADX INFO: renamed from: a */
    private byte[] f686a;

    /* JADX INFO: renamed from: b */
    private byte f687b;

    /* JADX INFO: renamed from: c */
    private byte f688c;

    /* JADX INFO: renamed from: d */
    private int f689d;

    /* JADX INFO: renamed from: e */
    private InterfaceC0290n f690e;

    public C0139e(InterfaceC0267h interfaceC0267h, byte[] bArr) {
        super(interfaceC0267h, 17);
        this.f686a = bArr;
    }

    @Override // p000a.p006d.p016e.InterfaceC0127a
    /* JADX INFO: renamed from: a */
    public final void mo408a(byte[] bArr) {
        this.f686a = bArr;
    }

    @Override // p000a.p006d.InterfaceC0055c
    /* JADX INFO: renamed from: l_ */
    public final int mo225l_() {
        return m424i(this.f690e.mo198a() + 96);
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: d */
    protected final int mo411d(byte[] bArr, int i) {
        C0173a.m510a(33L, bArr, i);
        bArr[i + 2] = this.f687b;
        bArr[i + 3] = this.f688c;
        int i2 = i + 4;
        int i3 = i2 + 4;
        int i4 = i3 + 4;
        C0173a.m512b(this.f689d, bArr, i4);
        int i5 = i4 + 4;
        System.arraycopy(this.f686a, 0, bArr, i5, 16);
        int i6 = i5 + 16;
        C0173a.m510a(i6 - m432M(), bArr, i3);
        int iMo199a = this.f690e.mo199a(bArr, i6);
        C0173a.m512b(iMo199a, bArr, i2);
        return (i6 + iMo199a) - i;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: e */
    protected final int mo412e(byte[] bArr, int i) {
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final <T extends InterfaceC0062g & InterfaceC0290n> void m461a(T t) {
        this.f687b = (byte) 1;
        this.f688c = t.mo232g();
        this.f690e = t;
    }

    @Override // p000a.p006d.p016e.AbstractC0141c
    /* JADX INFO: renamed from: c */
    protected final /* synthetic */ AbstractC0146d mo410c(InterfaceC0016c interfaceC0016c) {
        return new C0140f(interfaceC0016c.mo114a());
    }
}
