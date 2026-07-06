package a.d.e.b;

import a.d.g;
import a.g.j;
import a.h;
import java.util.ArrayList;

/* JADX INFO: compiled from: Smb2QueryDirectoryResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a.d.e.d {
    private final byte a;
    private j[] b;

    public b(h hVar, byte b) {
        super(hVar);
        this.a = b;
    }

    public final j[] e() {
        return this.b;
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) throws g {
        a.d.c.c cVar;
        if (a.d.f.a.a(bArr, i) != 9) {
            throw new g("Expected structureSize = 9");
        }
        int iA = a.d.f.a.a(bArr, i + 2) + M();
        int i2 = i + 4;
        int iB = a.d.f.a.b(bArr, i2);
        int i3 = i2 + 4;
        ArrayList arrayList = new ArrayList();
        do {
            if (this.a == 3) {
                cVar = new a.d.c.c(q(), true);
            } else {
                cVar = null;
            }
            if (cVar == null) {
                break;
            }
            cVar.a(bArr, i3, iB);
            arrayList.add(cVar);
            int iJ = cVar.j();
            if (iJ <= 0) {
                break;
            }
            i3 += iJ;
        } while (i3 < iA + iB);
        int i4 = i3;
        this.b = (j[]) arrayList.toArray(new j[arrayList.size()]);
        return i4 - i;
    }
}
