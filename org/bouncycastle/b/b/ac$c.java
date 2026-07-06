package org.bouncycastle.b.b;

import org.bouncycastle.b.e.ba;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class ac$c {
    final /* synthetic */ ac a;
    private final ac$d b = new ac$d();
    private byte[] c;
    private int d;
    private long[] e;

    public ac$c(ac acVar, int i) {
        this.a = acVar;
        this.c = new byte[i];
        this.e = new long[this.c.length / 8];
    }

    private void b(long[] jArr) {
        this.a.a.a(true, this.a.b, this.b.c());
        for (int i = 0; i < this.e.length; i++) {
            this.e[i] = ba.a(this.c, i * 8);
        }
        this.a.a.a(this.e, jArr);
        for (int i2 = 0; i2 < jArr.length; i2++) {
            jArr[i2] = jArr[i2] ^ this.e[i2];
        }
    }

    public final void a(int i) {
        this.b.a();
        this.b.a(i);
        this.d = 0;
    }

    public final void a(ac$c ac_c) {
        this.c = org.bouncycastle.f.a.c(ac_c.c, this.c);
        this.d = ac_c.d;
        this.e = org.bouncycastle.f.a.a(ac_c.e, this.e);
        this.b.a(ac_c.b);
    }

    public final void a(byte[] bArr, int i, int i2, long[] jArr) {
        int i3 = 0;
        while (i2 > i3) {
            if (this.d == this.c.length) {
                b(jArr);
                this.b.a(false);
                this.d = 0;
            }
            int iMin = Math.min(i2 - i3, this.c.length - this.d);
            System.arraycopy(bArr, i + i3, this.c, this.d, iMin);
            i3 += iMin;
            this.d += iMin;
            this.b.b(iMin);
        }
    }

    public final void a(long[] jArr) {
        for (int i = this.d; i < this.c.length; i++) {
            this.c[i] = 0;
        }
        this.b.b();
        b(jArr);
    }
}
