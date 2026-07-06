package org.bouncycastle.b.i;

import android.R$attr;
import org.bouncycastle.b.an;
import org.bouncycastle.b.k.be;

/* JADX INFO: loaded from: classes.dex */
public final class m extends an {
    boolean a;
    int b;
    int c;
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private int g;
    private final int h;
    private final org.bouncycastle.b.e i;

    public m(org.bouncycastle.b.e eVar) {
        super(eVar);
        this.a = true;
        this.i = eVar;
        this.h = eVar.b();
        if (this.h != 8) {
            throw new IllegalArgumentException("GCTR only for 64 bit block ciphers");
        }
        this.d = new byte[eVar.b()];
        this.e = new byte[eVar.b()];
        this.f = new byte[eVar.b()];
    }

    private static int a(byte[] bArr, int i) {
        return ((bArr[i + 3] << 24) & (-16777216)) + ((bArr[i + 2] << 16) & 16711680) + ((bArr[i + 1] << 8) & 65280) + (bArr[i] & 255);
    }

    private static void a(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i >>> 24);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2] = (byte) i;
    }

    @Override // org.bouncycastle.b.an
    protected final byte a(byte b) {
        if (this.g == 0) {
            if (this.a) {
                this.a = false;
                this.i.a(this.e, 0, this.f, 0);
                this.b = a(this.f, 0);
                this.c = a(this.f, 4);
            }
            this.b += R$attr.cacheColorHint;
            this.c += R$attr.hand_minute;
            if (this.c < 16843012 && this.c > 0) {
                this.c++;
            }
            a(this.b, this.e, 0);
            a(this.c, this.e, 4);
            this.i.a(this.e, 0, this.f, 0);
        }
        byte[] bArr = this.f;
        int i = this.g;
        this.g = i + 1;
        byte b2 = (byte) (bArr[i] ^ b);
        if (this.g == this.h) {
            this.g = 0;
            System.arraycopy(this.e, this.h, this.e, 0, this.e.length - this.h);
            System.arraycopy(this.f, 0, this.e, this.e.length - this.h, this.h);
        }
        return b2;
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        a(bArr, i, this.h, bArr2, i2);
        return this.h;
    }

    @Override // org.bouncycastle.b.ao
    public final String a() {
        return this.i.a() + "/GCTR";
    }

    @Override // org.bouncycastle.b.ao
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        this.a = true;
        this.b = 0;
        this.c = 0;
        if (!(iVar instanceof be)) {
            c();
            if (iVar != null) {
                this.i.a(true, iVar);
                return;
            }
            return;
        }
        be beVar = (be) iVar;
        byte[] bArrA = beVar.a();
        if (bArrA.length < this.d.length) {
            System.arraycopy(bArrA, 0, this.d, this.d.length - bArrA.length, bArrA.length);
            for (int i = 0; i < this.d.length - bArrA.length; i++) {
                this.d[i] = 0;
            }
        } else {
            System.arraycopy(bArrA, 0, this.d, 0, this.d.length);
        }
        c();
        if (beVar.b() != null) {
            this.i.a(true, beVar.b());
        }
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return this.h;
    }

    @Override // org.bouncycastle.b.ao
    public final void c() {
        this.a = true;
        this.b = 0;
        this.c = 0;
        System.arraycopy(this.d, 0, this.e, 0, this.d.length);
        this.g = 0;
        this.i.c();
    }
}
