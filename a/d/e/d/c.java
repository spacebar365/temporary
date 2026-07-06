package a.d.e.d;

import a.j;

/* JADX INFO: compiled from: SrvCopyChunkCopyResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements j {
    private int a;
    private int b;
    private int c;

    @Override // a.j
    public final int a(byte[] bArr, int i, int i2) {
        this.a = a.d.f.a.b(bArr, i);
        int i3 = i + 4;
        this.b = a.d.f.a.b(bArr, i3);
        int i4 = i3 + 4;
        this.c = a.d.f.a.b(bArr, i4);
        return (i4 + 4) - i;
    }
}
