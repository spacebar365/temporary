package a.d.e.c;

import a.d.g;
import a.h;

/* JADX INFO: compiled from: Smb2WriteResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a.d.e.d {
    private int a;
    private int b;

    public d(h hVar) {
        super(hVar);
    }

    public final int e() {
        return this.a;
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) throws g {
        if (a.d.f.a.a(bArr, i) != 17) {
            throw new g("Expected structureSize = 17");
        }
        int i2 = i + 4;
        this.a = a.d.f.a.b(bArr, i2);
        int i3 = i2 + 4;
        this.b = a.d.f.a.b(bArr, i3);
        return ((i3 + 4) + 4) - i;
    }
}
