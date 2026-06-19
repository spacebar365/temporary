package p000a.p006d.p016e.p024h;

import p000a.InterfaceC0267h;
import p000a.p006d.C0175g;
import p000a.p006d.InterfaceC0055c;
import p000a.p006d.InterfaceC0181m;
import p000a.p006d.p016e.AbstractC0134b;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.e.h.b */
/* JADX INFO: compiled from: Smb2TreeConnectResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0169b extends AbstractC0146d implements InterfaceC0181m {

    /* JADX INFO: renamed from: a */
    private byte f812a;

    /* JADX INFO: renamed from: b */
    private int f813b;

    /* JADX INFO: renamed from: c */
    private int f814c;

    /* JADX INFO: renamed from: d */
    private int f815d;

    public C0169b(InterfaceC0267h interfaceC0267h) {
        super(interfaceC0267h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000a.p006d.p016e.AbstractC0146d, p000a.p006d.InterfaceC0067d
    /* JADX INFO: renamed from: b */
    public final void mo243b(InterfaceC0055c interfaceC0055c) {
        if (mo328D()) {
            ((AbstractC0134b) interfaceC0055c).m443f(m449r());
        }
        super.mo243b(interfaceC0055c);
    }

    @Override // p000a.p006d.InterfaceC0181m
    /* JADX INFO: renamed from: d_ */
    public final int mo508d_() {
        return m449r();
    }

    @Override // p000a.p006d.InterfaceC0181m
    /* JADX INFO: renamed from: h */
    public final boolean mo308h() {
        return m449r() != 0;
    }

    @Override // p000a.p006d.InterfaceC0181m
    /* JADX INFO: renamed from: p_ */
    public final String mo309p_() {
        return null;
    }

    @Override // p000a.p006d.InterfaceC0181m
    /* JADX INFO: renamed from: g */
    public final boolean mo307g() {
        return (this.f813b & 3) != 0 || (this.f814c & 8) == 8;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: d */
    protected final int mo411d(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: e */
    protected final int mo412e(byte[] bArr, int i) throws C0175g {
        if (C0173a.m509a(bArr, i) != 16) {
            throw new C0175g("Structure size is not 16");
        }
        this.f812a = bArr[i + 2];
        int i2 = i + 4;
        this.f813b = C0173a.m511b(bArr, i2);
        int i3 = i2 + 4;
        this.f814c = C0173a.m511b(bArr, i3);
        int i4 = i3 + 4;
        this.f815d = C0173a.m511b(bArr, i4);
        return (i4 + 4) - i;
    }
}
