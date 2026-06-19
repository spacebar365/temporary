package p000a.p006d.p016e.p020d;

import p000a.InterfaceC0016c;
import p000a.InterfaceC0267h;
import p000a.InterfaceC0290n;
import p000a.p006d.p016e.AbstractC0141c;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p016e.C0154e;
import p000a.p006d.p016e.InterfaceC0127a;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.e.d.a */
/* JADX INFO: compiled from: Smb2IoctlRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0147a extends AbstractC0141c<C0148b> implements InterfaceC0127a {

    /* JADX INFO: renamed from: a */
    private byte[] f727a;

    /* JADX INFO: renamed from: b */
    private final int f728b;

    /* JADX INFO: renamed from: c */
    private final byte[] f729c;

    /* JADX INFO: renamed from: d */
    private int f730d;

    /* JADX INFO: renamed from: e */
    private int f731e;

    /* JADX INFO: renamed from: f */
    private int f732f;

    /* JADX INFO: renamed from: g */
    private InterfaceC0290n f733g;

    /* JADX INFO: renamed from: h */
    private InterfaceC0290n f734h;

    public C0147a(InterfaceC0267h interfaceC0267h, int i) {
        this(interfaceC0267h, i, C0154e.f759a);
    }

    public C0147a(InterfaceC0267h interfaceC0267h, int i, byte[] bArr) {
        super(interfaceC0267h, 11);
        this.f728b = i;
        this.f727a = bArr;
        this.f730d = interfaceC0267h.mo41af() & (-8);
        this.f729c = null;
    }

    @Override // p000a.p006d.p016e.InterfaceC0127a
    /* JADX INFO: renamed from: a */
    public final void mo408a(byte[] bArr) {
        this.f727a = bArr;
    }

    public C0147a(InterfaceC0267h interfaceC0267h, byte[] bArr, byte[] bArr2) {
        super(interfaceC0267h, 11);
        this.f728b = 1163287;
        this.f727a = bArr;
        this.f729c = bArr2;
        this.f730d = bArr2.length;
    }

    /* JADX INFO: renamed from: k */
    public final void m475k() {
        this.f732f = 1;
    }

    /* JADX INFO: renamed from: k */
    public final void m476k(int i) {
        this.f730d = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m474a(InterfaceC0290n interfaceC0290n) {
        this.f733g = interfaceC0290n;
    }

    @Override // p000a.p006d.InterfaceC0055c
    /* JADX INFO: renamed from: l_ */
    public final int mo225l_() {
        int iMo198a = 0;
        if (this.f733g != null) {
            iMo198a = this.f733g.mo198a() + 0;
        }
        if (this.f734h != null) {
            iMo198a += this.f734h.mo198a();
        }
        return m424i(iMo198a + 120);
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: d */
    protected final int mo411d(byte[] bArr, int i) {
        C0173a.m510a(57L, bArr, i);
        int i2 = i + 4;
        C0173a.m512b(this.f728b, bArr, i2);
        int i3 = i2 + 4;
        System.arraycopy(this.f727a, 0, bArr, i3, 16);
        int i4 = i3 + 16;
        int i5 = i4 + 4;
        int i6 = i5 + 4;
        C0173a.m512b(this.f731e, bArr, i6);
        int i7 = i6 + 4;
        int i8 = i7 + 4;
        int i9 = i8 + 4;
        C0173a.m512b(this.f730d, bArr, i9);
        int i10 = i9 + 4;
        C0173a.m512b(this.f732f, bArr, i10);
        int i11 = i10 + 4 + 4;
        if (this.f733g != null) {
            C0173a.m512b(i11 - m432M(), bArr, i4);
            int iMo199a = this.f733g.mo199a(bArr, i11);
            C0173a.m512b(iMo199a, bArr, i5);
            i11 += iMo199a;
        } else {
            C0173a.m512b(0L, bArr, i4);
            C0173a.m512b(0L, bArr, i5);
        }
        if (this.f734h != null) {
            C0173a.m512b(i11 - m432M(), bArr, i7);
            int iMo199a2 = this.f734h.mo199a(bArr, i11);
            C0173a.m512b(iMo199a2, bArr, i8);
            i11 += iMo199a2;
        } else {
            C0173a.m512b(0L, bArr, i7);
            C0173a.m512b(0L, bArr, i8);
        }
        return i11 - i;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: e */
    protected final int mo412e(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p016e.AbstractC0141c
    /* JADX INFO: renamed from: c */
    protected final /* synthetic */ AbstractC0146d mo410c(InterfaceC0016c interfaceC0016c) {
        return new C0148b(interfaceC0016c.mo114a(), this.f729c, this.f728b);
    }
}
