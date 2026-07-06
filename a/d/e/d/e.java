package a.d.e.d;

import a.j;

/* JADX INFO: compiled from: SrvRequestResumeKeyResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class e implements j {
    private byte[] a;

    @Override // a.j
    public final int a(byte[] bArr, int i, int i2) throws a.d.g {
        if (i2 < 24) {
            throw new a.d.g("Invalid resume key");
        }
        this.a = new byte[24];
        System.arraycopy(bArr, i, this.a, 0, 24);
        int i3 = i + 24;
        a.d.f.a.b(bArr, i3);
        return (i3 + 4) - i;
    }
}
