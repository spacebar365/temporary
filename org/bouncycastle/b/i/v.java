package org.bouncycastle.b.i;

import org.bouncycastle.b.am;
import org.bouncycastle.b.an;
import org.bouncycastle.b.k.be;

/* JADX INFO: loaded from: classes.dex */
public final class v extends an implements am {
    private final org.bouncycastle.b.e a;
    private final int b;
    private byte[] c;
    private byte[] d;
    private byte[] e;
    private int f;

    public v(org.bouncycastle.b.e eVar) {
        super(eVar);
        this.a = eVar;
        this.b = this.a.b();
        this.c = new byte[this.b];
        this.d = new byte[this.b];
        this.e = new byte[this.b];
        this.f = 0;
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        a(bArr, i, this.b, bArr2, i2);
        return this.b;
    }

    @Override // org.bouncycastle.b.ao
    public final String a() {
        return this.a.a() + "/SIC";
    }

    @Override // org.bouncycastle.b.ao
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (!(iVar instanceof be)) {
            throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
        }
        be beVar = (be) iVar;
        this.c = org.bouncycastle.f.a.b(beVar.a());
        if (this.b < this.c.length) {
            throw new IllegalArgumentException("CTR/SIC mode requires IV no greater than: " + this.b + " bytes.");
        }
        int i = 8 > this.b / 2 ? this.b / 2 : 8;
        if (this.b - this.c.length > i) {
            throw new IllegalArgumentException("CTR/SIC mode requires IV of at least: " + (this.b - i) + " bytes.");
        }
        if (beVar.b() != null) {
            this.a.a(true, beVar.b());
        }
        c();
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return this.a.b();
    }

    @Override // org.bouncycastle.b.ao
    public final void c() {
        org.bouncycastle.f.a.a(this.d, (byte) 0);
        System.arraycopy(this.c, 0, this.d, 0, this.c.length);
        this.a.c();
        this.f = 0;
    }

    @Override // org.bouncycastle.b.an
    protected final byte a(byte b) {
        byte b2;
        if (this.f == 0) {
            this.a.a(this.d, 0, this.e, 0);
            byte[] bArr = this.e;
            int i = this.f;
            this.f = i + 1;
            return (byte) (bArr[i] ^ b);
        }
        byte[] bArr2 = this.e;
        int i2 = this.f;
        this.f = i2 + 1;
        byte b3 = (byte) (bArr2[i2] ^ b);
        if (this.f == this.d.length) {
            this.f = 0;
            int length = this.d.length + 0;
            do {
                length--;
                if (length < 0) {
                    break;
                }
                byte[] bArr3 = this.d;
                b2 = (byte) (bArr3[length] + 1);
                bArr3[length] = b2;
            } while (b2 == 0);
            if (this.c.length < this.b) {
                for (int i3 = 0; i3 != this.c.length; i3++) {
                    if (this.d[i3] != this.c[i3]) {
                        throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
                    }
                }
            }
        }
        return b3;
    }
}
