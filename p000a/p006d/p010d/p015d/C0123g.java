package p000a.p006d.p010d.p015d;

import p000a.C0044d;
import p000a.InterfaceC0267h;
import p000a.p006d.p009c.C0060e;
import p000a.p006d.p009c.C0061f;
import p000a.p006d.p009c.C0066k;
import p000a.p006d.p009c.InterfaceC0065j;
import p000a.p006d.p010d.p013c.AbstractC0108b;

/* JADX INFO: renamed from: a.d.d.d.g */
/* JADX INFO: compiled from: Trans2QueryFSInformationResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0123g extends AbstractC0108b {

    /* JADX INFO: renamed from: C */
    private int f594C;

    /* JADX INFO: renamed from: D */
    private InterfaceC0065j f595D;

    public C0123g(InterfaceC0267h interfaceC0267h, int i) {
        super(interfaceC0267h);
        this.f594C = i;
        mo208a(50);
        m396b((byte) 3);
    }

    /* JADX INFO: renamed from: a */
    public final <T extends InterfaceC0065j> T m406a(Class<T> cls) throws C0044d {
        if (!cls.isAssignableFrom(this.f595D.getClass())) {
            throw new C0044d("Incompatible file information class");
        }
        return (T) this.f595D;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0108b
    /* JADX INFO: renamed from: j */
    protected final int mo323j(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0108b, p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("Trans2QueryFSInformationResponse[" + super.toString() + "]");
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0108b
    /* JADX INFO: renamed from: a */
    protected final int mo322a(byte[] bArr, int i, int i2) {
        InterfaceC0065j c0060e;
        InterfaceC0065j interfaceC0065j;
        int iA;
        switch (this.f594C) {
            case -1:
                c0060e = new C0066k();
                interfaceC0065j = c0060e;
                break;
            case 3:
                c0060e = new C0061f();
                interfaceC0065j = c0060e;
                break;
            case 7:
                c0060e = new C0060e();
                interfaceC0065j = c0060e;
                break;
            default:
                interfaceC0065j = null;
                break;
        }
        if (interfaceC0065j != null) {
            iA = interfaceC0065j.mo201a(bArr, i, m389W()) + i;
            this.f595D = interfaceC0065j;
        } else {
            iA = i;
        }
        return iA - i;
    }
}
