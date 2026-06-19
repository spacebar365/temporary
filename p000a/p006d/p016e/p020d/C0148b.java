package p000a.p006d.p016e.p020d;

import p000a.InterfaceC0267h;
import p000a.InterfaceC0286j;
import p000a.p006d.C0175g;
import p000a.p006d.p007a.C0049d;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p025f.C0173a;
import p000a.p029g.C0214ad;

/* JADX INFO: renamed from: a.d.e.d.b */
/* JADX INFO: compiled from: Smb2IoctlResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0148b extends AbstractC0146d {

    /* JADX INFO: renamed from: a */
    private final byte[] f735a;

    /* JADX INFO: renamed from: b */
    private int f736b;

    /* JADX INFO: renamed from: c */
    private byte[] f737c;

    /* JADX INFO: renamed from: d */
    private int f738d;

    /* JADX INFO: renamed from: e */
    private InterfaceC0286j f739e;

    /* JADX INFO: renamed from: f */
    private InterfaceC0286j f740f;

    /* JADX INFO: renamed from: g */
    private int f741g;

    public C0148b(InterfaceC0267h interfaceC0267h, byte[] bArr, int i) {
        super(interfaceC0267h);
        this.f735a = bArr;
        this.f736b = i;
    }

    /* JADX INFO: renamed from: e */
    public final int m478e() {
        return this.f736b;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC0286j m479f() {
        return this.f739e;
    }

    /* JADX INFO: renamed from: g */
    public final int m480g() {
        return this.f741g;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: d */
    protected final int mo411d(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: T */
    protected final boolean mo434T() {
        int iA = m425A();
        return iA != -1073741811 && !(iA == -1073741811 && (this.f736b == 1327346 || this.f736b == 1343730)) && (!(iA == -2147483643 && (this.f736b == 1163287 || this.f736b == 1130508 || this.f736b == 393620)) && super.mo434T());
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: e */
    protected final int mo412e(byte[] bArr, int i) throws C0175g {
        InterfaceC0286j c0150d = null;
        int iM509a = C0173a.m509a(bArr, i);
        if (iM509a == 9) {
            return super.m440c(bArr, i);
        }
        if (iM509a != 49) {
            throw new C0175g("Expected structureSize = 49");
        }
        int i2 = i + 4;
        this.f736b = C0173a.m511b(bArr, i2);
        int i3 = i2 + 4;
        this.f737c = new byte[16];
        System.arraycopy(bArr, i3, this.f737c, 0, 16);
        int i4 = i3 + 16;
        int iM511b = C0173a.m511b(bArr, i4) + m432M();
        int i5 = i4 + 4;
        int iM511b2 = C0173a.m511b(bArr, i5);
        int i6 = i5 + 4;
        int iM511b3 = C0173a.m511b(bArr, i6) + m432M();
        int i7 = i6 + 4;
        int iM511b4 = C0173a.m511b(bArr, i7);
        int i8 = i7 + 4;
        this.f738d = C0173a.m511b(bArr, i8);
        int i9 = i8 + 4 + 4;
        this.f740f = null;
        if (this.f735a == null) {
            switch (this.f736b) {
                case 393620:
                    c0150d = new C0049d();
                    break;
                case 1130508:
                    c0150d = new C0150d();
                    break;
                case 1310840:
                    c0150d = new C0151e();
                    break;
                case 1311236:
                    c0150d = new C0153g();
                    break;
                case 1327346:
                case 1343730:
                    c0150d = new C0149c();
                    break;
            }
        }
        this.f739e = c0150d;
        if (this.f740f != null) {
            this.f740f.mo201a(bArr, iM511b, iM511b2);
        }
        int iMax = Math.max(iM511b + iM511b2, i9);
        if (this.f735a != null) {
            if (iM511b4 > this.f735a.length) {
                throw new C0175g("Output length exceeds buffer size");
            }
            System.arraycopy(bArr, iM511b3, this.f735a, 0, iM511b4);
        } else if (this.f739e != null) {
            this.f739e.mo201a(bArr, iM511b3, iM511b4);
        }
        this.f741g = iM511b4;
        return Math.max(iM511b3 + iM511b4, iMax) - i;
    }

    /* JADX INFO: renamed from: a */
    public final <T extends InterfaceC0286j> T m477a(Class<T> cls) throws C0214ad {
        T t = (T) this.f739e;
        if (t == null) {
            throw new C0214ad("Failed to decode output data");
        }
        if (!cls.isAssignableFrom(t.getClass())) {
            throw new C0214ad("Incompatible response data " + t.getClass());
        }
        return t;
    }
}
