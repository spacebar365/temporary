package a.d.e.h;

import a.d.g;
import a.h;

/* JADX INFO: compiled from: Smb2TreeDisconnectResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a.d.e.d {
    public d(h hVar) {
        super(hVar);
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) throws g {
        if (a.d.f.a.a(bArr, i) != 4) {
            throw new g("Structure size != 4");
        }
        return 4;
    }
}
