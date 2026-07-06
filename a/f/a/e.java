package a.f.a;

import a.h;

/* JADX INFO: compiled from: AvSingleHost.java */
/* JADX INFO: loaded from: classes.dex */
public final class e extends c {
    public e(byte[] bArr) {
        super(8, bArr);
    }

    public e(h hVar) {
        this(new byte[8], hVar.an());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private e(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[48];
        a.d.f.a.b(48L, bArr3, 0);
        a.d.f.a.b(0L, bArr3, 4);
        System.arraycopy(bArr, 0, bArr3, 8, 8);
        System.arraycopy(bArr2, 0, bArr3, 16, 32);
        this(bArr3);
    }
}
