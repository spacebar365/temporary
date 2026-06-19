package p000a.p006d.p016e.p018b;

import p000a.InterfaceC0016c;
import p000a.InterfaceC0267h;
import p000a.InterfaceC0290n;
import p000a.p006d.p016e.AbstractC0141c;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p016e.C0154e;
import p000a.p006d.p016e.InterfaceC0127a;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.e.b.c */
/* JADX INFO: compiled from: Smb2QueryInfoRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0137c extends AbstractC0141c<C0138d> implements InterfaceC0127a {

    /* JADX INFO: renamed from: a */
    private byte f676a;

    /* JADX INFO: renamed from: b */
    private byte f677b;

    /* JADX INFO: renamed from: c */
    private int f678c;

    /* JADX INFO: renamed from: d */
    private int f679d;

    /* JADX INFO: renamed from: e */
    private int f680e;

    /* JADX INFO: renamed from: f */
    private byte[] f681f;

    /* JADX INFO: renamed from: g */
    private InterfaceC0290n f682g;

    public C0137c(InterfaceC0267h interfaceC0267h) {
        this(interfaceC0267h, C0154e.f759a);
    }

    private C0137c(InterfaceC0267h interfaceC0267h, byte[] bArr) {
        super(interfaceC0267h, 16);
        this.f678c = interfaceC0267h.mo44ai();
        this.f681f = bArr;
    }

    @Override // p000a.p006d.p016e.InterfaceC0127a
    /* JADX INFO: renamed from: a */
    public final void mo408a(byte[] bArr) {
        this.f681f = bArr;
    }

    @Override // p000a.p006d.InterfaceC0055c
    /* JADX INFO: renamed from: l_ */
    public final int mo225l_() {
        int iMo198a = 104;
        if (this.f682g != null) {
            iMo198a = this.f682g.mo198a() + 104;
        }
        return m424i(iMo198a);
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: d */
    protected final int mo411d(byte[] bArr, int i) {
        C0173a.m510a(41L, bArr, i);
        bArr[i + 2] = this.f676a;
        bArr[i + 3] = this.f677b;
        int i2 = i + 4;
        C0173a.m512b(this.f678c, bArr, i2);
        int i3 = i2 + 4;
        int i4 = i3 + 4;
        int i5 = i4 + 4;
        C0173a.m512b(this.f679d, bArr, i5);
        int i6 = i5 + 4;
        C0173a.m512b(this.f680e, bArr, i6);
        int i7 = i6 + 4;
        System.arraycopy(this.f681f, 0, bArr, i7, 16);
        int i8 = i7 + 16;
        if (this.f682g == null) {
            C0173a.m510a(0L, bArr, i3);
            C0173a.m512b(0L, bArr, i4);
        } else {
            C0173a.m510a(i8 - m432M(), bArr, i3);
            int iMo199a = this.f682g.mo199a(bArr, i8);
            C0173a.m512b(iMo199a, bArr, i4);
            i8 += iMo199a;
        }
        return i8 - i;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: e */
    protected final int mo412e(byte[] bArr, int i) {
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m459a(byte b) {
        this.f676a = (byte) 2;
        this.f677b = b;
    }

    @Override // p000a.p006d.p016e.AbstractC0141c
    /* JADX INFO: renamed from: c */
    protected final /* synthetic */ AbstractC0146d mo410c(InterfaceC0016c interfaceC0016c) {
        return new C0138d(interfaceC0016c.mo114a(), this.f676a, this.f677b);
    }
}
