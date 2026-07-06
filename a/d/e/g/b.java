package a.d.e.g;

import a.d.g;
import a.h;

/* JADX INFO: compiled from: Smb2LogoffResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a.d.e.d {
    public b(h hVar) {
        super(hVar);
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) throws g {
        if (a.d.f.a.a(bArr, i) != 4) {
            throw new g("Structure size is not 4");
        }
        return 4;
    }
}
