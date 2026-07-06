package a.d.e.d;

import a.g.ad;
import a.h;
import a.j;

/* JADX INFO: compiled from: Smb2IoctlResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a.d.e.d {
    private final byte[] a;
    private int b;
    private byte[] c;
    private int d;
    private j e;
    private j f;
    private int g;

    public b(h hVar, byte[] bArr, int i) {
        super(hVar);
        this.a = bArr;
        this.b = i;
    }

    public final int e() {
        return this.b;
    }

    public final j f() {
        return this.e;
    }

    public final int g() {
        return this.g;
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.e.b
    protected final boolean T() {
        int iA = A();
        return iA != -1073741811 && !(iA == -1073741811 && (this.b == 1327346 || this.b == 1343730)) && (!(iA == -2147483643 && (this.b == 1163287 || this.b == 1130508 || this.b == 393620)) && super.T());
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) throws a.d.g {
        j dVar = null;
        int iA = a.d.f.a.a(bArr, i);
        if (iA == 9) {
            return super.c(bArr, i);
        }
        if (iA != 49) {
            throw new a.d.g("Expected structureSize = 49");
        }
        int i2 = i + 4;
        this.b = a.d.f.a.b(bArr, i2);
        int i3 = i2 + 4;
        this.c = new byte[16];
        System.arraycopy(bArr, i3, this.c, 0, 16);
        int i4 = i3 + 16;
        int iB = a.d.f.a.b(bArr, i4) + M();
        int i5 = i4 + 4;
        int iB2 = a.d.f.a.b(bArr, i5);
        int i6 = i5 + 4;
        int iB3 = a.d.f.a.b(bArr, i6) + M();
        int i7 = i6 + 4;
        int iB4 = a.d.f.a.b(bArr, i7);
        int i8 = i7 + 4;
        this.d = a.d.f.a.b(bArr, i8);
        int i9 = i8 + 4 + 4;
        this.f = null;
        if (this.a == null) {
            switch (this.b) {
                case 393620:
                    dVar = new a.d.a.d();
                    break;
                case 1130508:
                    dVar = new d();
                    break;
                case 1310840:
                    dVar = new e();
                    break;
                case 1311236:
                    dVar = new g();
                    break;
                case 1327346:
                case 1343730:
                    dVar = new c();
                    break;
            }
        }
        this.e = dVar;
        if (this.f != null) {
            this.f.a(bArr, iB, iB2);
        }
        int iMax = Math.max(iB + iB2, i9);
        if (this.a != null) {
            if (iB4 > this.a.length) {
                throw new a.d.g("Output length exceeds buffer size");
            }
            System.arraycopy(bArr, iB3, this.a, 0, iB4);
        } else if (this.e != null) {
            this.e.a(bArr, iB3, iB4);
        }
        this.g = iB4;
        return Math.max(iB3 + iB4, iMax) - i;
    }

    public final <T extends j> T a(Class<T> cls) throws ad {
        T t = (T) this.e;
        if (t == null) {
            throw new ad("Failed to decode output data");
        }
        if (!cls.isAssignableFrom(t.getClass())) {
            throw new ad("Incompatible response data " + t.getClass());
        }
        return t;
    }
}
