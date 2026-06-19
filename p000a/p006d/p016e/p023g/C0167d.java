package p000a.p006d.p016e.p023g;

import p000a.InterfaceC0267h;
import p000a.p006d.C0175g;
import p000a.p006d.InterfaceC0055c;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.e.g.d */
/* JADX INFO: compiled from: Smb2SessionSetupResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0167d extends AbstractC0146d {

    /* JADX INFO: renamed from: a */
    private int f808a;

    /* JADX INFO: renamed from: b */
    private byte[] f809b;

    public C0167d(InterfaceC0267h interfaceC0267h) {
        super(interfaceC0267h);
    }

    @Override // p000a.p006d.p016e.AbstractC0146d, p000a.p006d.InterfaceC0067d
    /* JADX INFO: renamed from: b */
    public final void mo243b(InterfaceC0055c interfaceC0055c) {
        if (mo328D()) {
            interfaceC0055c.mo215b(m426B());
        }
        super.mo243b(interfaceC0055c);
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: T */
    protected final boolean mo434T() {
        return m425A() != -1073741802 && super.mo434T();
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: d */
    protected final int mo411d(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: e */
    protected final int mo412e(byte[] bArr, int i) throws C0175g {
        if (C0173a.m509a(bArr, i) != 9) {
            throw new C0175g("Structure size != 9");
        }
        this.f808a = C0173a.m509a(bArr, i + 2);
        int i2 = i + 4;
        int iM509a = C0173a.m509a(bArr, i2);
        int iM509a2 = C0173a.m509a(bArr, i2 + 2);
        int i3 = i2 + 4;
        int iM = i3 - (m432M() + iM509a);
        this.f809b = new byte[iM509a2];
        System.arraycopy(bArr, iM509a + m432M(), this.f809b, 0, iM509a2);
        return ((i3 + iM) + iM509a2) - i;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m505e() {
        return (this.f808a & 3) != 0;
    }

    /* JADX INFO: renamed from: f */
    public final int m506f() {
        return this.f808a;
    }

    /* JADX INFO: renamed from: g */
    public final byte[] m507g() {
        return this.f809b;
    }
}
