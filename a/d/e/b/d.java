package a.d.e.b;

import a.d.g;
import a.h;
import a.j;

/* JADX INFO: compiled from: Smb2QueryInfoResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a.d.e.d {
    private byte a;
    private byte b;
    private j c;

    public d(h hVar, byte b, byte b2) {
        super(hVar);
        this.a = b;
        this.b = b2;
    }

    public final <T extends j> T a(Class<T> cls) throws a.d {
        if (!cls.isAssignableFrom(this.c.getClass())) {
            throw new a.d("Incompatible file information class");
        }
        return (T) this.c;
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) throws g {
        j bVar;
        if (a.d.f.a.a(bArr, i) != 9) {
            throw new g("Expected structureSize = 9");
        }
        int iM = M() + a.d.f.a.a(bArr, i + 2);
        int i2 = i + 4;
        int iB = a.d.f.a.b(bArr, i2);
        int i3 = i2 + 4;
        byte b = this.a;
        byte b2 = this.b;
        switch (b) {
            case 1:
                switch (b2) {
                    case 6:
                        bVar = new a.d.c.h();
                        break;
                    default:
                        throw new g("Unknown file info class ".concat(String.valueOf((int) b2)));
                }
                break;
            case 2:
                switch (b2) {
                    case 3:
                        bVar = new a.d.c.f();
                        break;
                    case 7:
                        bVar = new a.d.c.e();
                        break;
                    default:
                        throw new g("Unknown filesystem info class ".concat(String.valueOf((int) b2)));
                }
                break;
            case 3:
                bVar = new a.d.b.b();
                break;
            case 4:
                throw new g("Unknown quota info class ".concat(String.valueOf((int) b2)));
            default:
                throw new g("Unknwon information type ".concat(String.valueOf((int) b)));
        }
        bVar.a(bArr, iM, iB);
        int iMax = Math.max(i3, iM + iB);
        this.c = bVar;
        return iMax - i;
    }
}
