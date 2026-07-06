package a.g;

import java.util.Arrays;

/* JADX INFO: compiled from: BufferCacheImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements a.b {
    private final Object[] a;
    private final int b;
    private int c;

    public a(a.h hVar) {
        this(hVar.ag(), hVar.ae());
    }

    private a(int i, int i2) {
        this.c = 0;
        this.a = new Object[i];
        this.b = i2;
    }

    @Override // a.b
    public final byte[] a() {
        byte[] bArr;
        synchronized (this.a) {
            if (this.c > 0) {
                for (int i = 0; i < this.a.length; i++) {
                    if (this.a[i] != null) {
                        bArr = (byte[]) this.a[i];
                        this.a[i] = null;
                        this.c--;
                        break;
                    }
                }
                bArr = new byte[this.b];
            } else {
                bArr = new byte[this.b];
            }
        }
        return bArr;
    }

    @Override // a.b
    public final void a(byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        synchronized (this.a) {
            if (this.c < this.a.length) {
                for (int i = 0; i < this.a.length; i++) {
                    if (this.a[i] == null) {
                        this.a[i] = bArr;
                        this.c++;
                        return;
                    }
                }
            }
        }
    }
}
