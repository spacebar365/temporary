package p000a.p006d.p010d.p015d;

import p000a.C0044d;
import p000a.InterfaceC0267h;
import p000a.p006d.p009c.C0057b;
import p000a.p006d.p009c.C0063h;
import p000a.p006d.p009c.C0064i;
import p000a.p006d.p009c.InterfaceC0062g;
import p000a.p006d.p010d.p013c.AbstractC0108b;

/* JADX INFO: renamed from: a.d.d.d.i */
/* JADX INFO: compiled from: Trans2QueryPathInformationResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0125i extends AbstractC0108b {

    /* JADX INFO: renamed from: C */
    private final int f597C;

    /* JADX INFO: renamed from: D */
    private InterfaceC0062g f598D;

    public C0125i(InterfaceC0267h interfaceC0267h, int i) {
        super(interfaceC0267h);
        this.f597C = i;
        m396b((byte) 5);
    }

    /* JADX INFO: renamed from: a */
    public final <T extends InterfaceC0062g> T m407a(Class<T> cls) throws C0044d {
        if (!cls.isAssignableFrom(this.f598D.getClass())) {
            throw new C0044d("Incompatible file information class");
        }
        return (T) this.f598D;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0108b
    /* JADX INFO: renamed from: j */
    protected final int mo323j(byte[] bArr, int i) {
        return 2;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0108b, p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("Trans2QueryPathInformationResponse[" + super.toString() + "]");
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0108b
    /* JADX INFO: renamed from: a */
    protected final int mo322a(byte[] bArr, int i, int i2) {
        InterfaceC0062g c0063h;
        InterfaceC0062g interfaceC0062g;
        int iA;
        switch (this.f597C) {
            case 4:
                c0063h = new C0057b();
                interfaceC0062g = c0063h;
                break;
            case 5:
                c0063h = new C0064i();
                interfaceC0062g = c0063h;
                break;
            case 6:
                c0063h = new C0063h();
                interfaceC0062g = c0063h;
                break;
            default:
                interfaceC0062g = null;
                break;
        }
        if (interfaceC0062g != null) {
            iA = interfaceC0062g.mo201a(bArr, i, m389W()) + i;
            this.f598D = interfaceC0062g;
        } else {
            iA = i;
        }
        return iA - i;
    }
}
