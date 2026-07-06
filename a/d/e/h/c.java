package a.d.e.h;

import a.h;

/* JADX INFO: compiled from: Smb2TreeDisconnectRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a.d.e.c<d> {
    public c(h hVar) {
        super(hVar, 4);
    }

    @Override // a.d.c
    public final int l_() {
        return i(68);
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        a.d.f.a.a(4L, bArr, i);
        a.d.f.a.a(0L, bArr, i + 2);
        return 4;
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.e.c
    protected final /* synthetic */ a.d.e.d c(a.c cVar) {
        return new d(cVar.a());
    }
}
