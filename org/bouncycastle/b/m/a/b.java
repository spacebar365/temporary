package org.bouncycastle.b.m.a;

import java.util.Hashtable;
import org.bouncycastle.b.r;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c {
    private static final byte[] a = {1};
    private static final Hashtable b;
    private r c;
    private byte[] d;
    private byte[] e;
    private long f;
    private org.bouncycastle.b.m.d g;
    private int h;
    private int i;

    public b(r rVar, int i, org.bouncycastle.b.m.d dVar, byte[] bArr, byte[] bArr2) {
        if (i > d.a(rVar)) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        }
        if (dVar.b() < i) {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
        this.c = rVar;
        this.g = dVar;
        this.h = i;
        this.i = ((Integer) b.get(rVar.a())).intValue();
        this.d = d.a(this.c, org.bouncycastle.f.a.a(b(), bArr2, bArr), this.i);
        byte[] bArr3 = new byte[this.d.length + 1];
        System.arraycopy(this.d, 0, bArr3, 1, this.d.length);
        this.e = d.a(this.c, bArr3, this.i);
        this.f = 1L;
    }

    private static void a(byte[] bArr, byte[] bArr2) {
        int i = 0;
        for (int i2 = 1; i2 <= bArr2.length; i2++) {
            int i3 = (bArr[bArr.length - i2] & 255) + (bArr2[bArr2.length - i2] & 255) + i;
            i = i3 > 255 ? 1 : 0;
            bArr[bArr.length - i2] = (byte) i3;
        }
        int length = bArr2.length;
        while (true) {
            length++;
            if (length > bArr.length) {
                return;
            }
            int i4 = (bArr[bArr.length - length] & 255) + i;
            i = i4 > 255 ? 1 : 0;
            bArr[bArr.length - length] = (byte) i4;
        }
    }

    private byte[] a(byte[] bArr, int i) {
        int iB = (i / 8) / this.c.b();
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = new byte[i / 8];
        byte[] bArr4 = new byte[this.c.b()];
        for (int i2 = 0; i2 <= iB; i2++) {
            b(bArr2, bArr4);
            System.arraycopy(bArr4, 0, bArr3, bArr4.length * i2, bArr3.length - (bArr4.length * i2) > bArr4.length ? bArr4.length : bArr3.length - (bArr4.length * i2));
            a(bArr2, a);
        }
        return bArr3;
    }

    private void b(byte[] bArr, byte[] bArr2) {
        this.c.a(bArr, 0, bArr.length);
        this.c.a(bArr2, 0);
    }

    private byte[] b() {
        byte[] bArrA = this.g.a();
        if (bArrA.length < (this.h + 7) / 8) {
            throw new IllegalStateException("Insufficient entropy provided by entropy source");
        }
        return bArrA;
    }

    @Override // org.bouncycastle.b.m.a.c
    public final void a() {
        this.d = d.a(this.c, org.bouncycastle.f.a.a(a, this.d, b(), null), this.i);
        byte[] bArr = new byte[this.d.length + 1];
        bArr[0] = 0;
        System.arraycopy(this.d, 0, bArr, 1, this.d.length);
        this.e = d.a(this.c, bArr, this.i);
        this.f = 1L;
    }

    @Override // org.bouncycastle.b.m.a.c
    public final int a(byte[] bArr, boolean z) {
        int length = bArr.length * 8;
        if (length > 262144) {
            throw new IllegalArgumentException("Number of bits per request limited to 262144");
        }
        if (this.f > 140737488355328L) {
            return -1;
        }
        if (z) {
            a();
        }
        byte[] bArrA = a(this.d, length);
        byte[] bArr2 = new byte[this.d.length + 1];
        System.arraycopy(this.d, 0, bArr2, 1, this.d.length);
        bArr2[0] = 3;
        byte[] bArr3 = new byte[this.c.b()];
        b(bArr2, bArr3);
        a(this.d, bArr3);
        a(this.d, this.e);
        a(this.d, new byte[]{(byte) (this.f >> 24), (byte) (this.f >> 16), (byte) (this.f >> 8), (byte) this.f});
        this.f++;
        System.arraycopy(bArrA, 0, bArr, 0, bArr.length);
        return length;
    }

    static {
        Hashtable hashtable = new Hashtable();
        b = hashtable;
        hashtable.put("SHA-1", 440);
        b.put("SHA-224", 440);
        b.put("SHA-256", 440);
        b.put("SHA-512/256", 440);
        b.put("SHA-512/224", 440);
        b.put("SHA-384", 888);
        b.put("SHA-512", 888);
    }
}
