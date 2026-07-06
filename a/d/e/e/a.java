package a.d.e.e;

import a.d.e.d;
import a.d.g;
import a.h;
import a.i.e;

/* JADX INFO: compiled from: Smb2OplockBreakNotification.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends d {
    private byte a;
    private byte[] b;

    public a(h hVar) {
        super(hVar);
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) throws g {
        if (a.d.f.a.a(bArr, i) != 24) {
            throw new g("Expected structureSize = 24");
        }
        this.a = bArr[i + 2];
        int i2 = i + 4 + 4;
        this.b = new byte[16];
        System.arraycopy(bArr, i2, this.b, 0, 16);
        return (i2 + 16) - i;
    }

    @Override // a.d.e.b
    public final String toString() {
        return "Smb2OpblockBreakNotification[oplockLevel=" + ((int) this.a) + ",fileId=" + e.a(this.b) + "]";
    }
}
