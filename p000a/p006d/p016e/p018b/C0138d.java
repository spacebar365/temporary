package p000a.p006d.p016e.p018b;

import p000a.C0044d;
import p000a.InterfaceC0267h;
import p000a.InterfaceC0286j;
import p000a.p006d.C0175g;
import p000a.p006d.p008b.C0053b;
import p000a.p006d.p009c.C0060e;
import p000a.p006d.p009c.C0061f;
import p000a.p006d.p009c.C0063h;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.e.b.d */
/* JADX INFO: compiled from: Smb2QueryInfoResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0138d extends AbstractC0146d {

    /* JADX INFO: renamed from: a */
    private byte f683a;

    /* JADX INFO: renamed from: b */
    private byte f684b;

    /* JADX INFO: renamed from: c */
    private InterfaceC0286j f685c;

    public C0138d(InterfaceC0267h interfaceC0267h, byte b, byte b2) {
        super(interfaceC0267h);
        this.f683a = b;
        this.f684b = b2;
    }

    /* JADX INFO: renamed from: a */
    public final <T extends InterfaceC0286j> T m460a(Class<T> cls) throws C0044d {
        if (!cls.isAssignableFrom(this.f685c.getClass())) {
            throw new C0044d("Incompatible file information class");
        }
        return (T) this.f685c;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: d */
    protected final int mo411d(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: e */
    protected final int mo412e(byte[] bArr, int i) throws C0175g {
        InterfaceC0286j c0053b;
        if (C0173a.m509a(bArr, i) != 9) {
            throw new C0175g("Expected structureSize = 9");
        }
        int iM = m432M() + C0173a.m509a(bArr, i + 2);
        int i2 = i + 4;
        int iM511b = C0173a.m511b(bArr, i2);
        int i3 = i2 + 4;
        byte b = this.f683a;
        byte b2 = this.f684b;
        switch (b) {
            case 1:
                switch (b2) {
                    case 6:
                        c0053b = new C0063h();
                        break;
                    default:
                        throw new C0175g("Unknown file info class ".concat(String.valueOf((int) b2)));
                }
                break;
            case 2:
                switch (b2) {
                    case 3:
                        c0053b = new C0061f();
                        break;
                    case 7:
                        c0053b = new C0060e();
                        break;
                    default:
                        throw new C0175g("Unknown filesystem info class ".concat(String.valueOf((int) b2)));
                }
                break;
            case 3:
                c0053b = new C0053b();
                break;
            case 4:
                throw new C0175g("Unknown quota info class ".concat(String.valueOf((int) b2)));
            default:
                throw new C0175g("Unknwon information type ".concat(String.valueOf((int) b)));
        }
        c0053b.mo201a(bArr, iM, iM511b);
        int iMax = Math.max(i3, iM + iM511b);
        this.f685c = c0053b;
        return iMax - i;
    }
}
