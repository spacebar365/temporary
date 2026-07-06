package a.d.e.b;

import a.d.g;
import a.h;

/* JADX INFO: compiled from: Smb2SetInfoResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class f extends a.d.e.d {
    public f(h hVar) {
        super(hVar);
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) throws g {
        if (a.d.f.a.a(bArr, i) != 2) {
            throw new g("Expected structureSize = 2");
        }
        return 2;
    }
}
