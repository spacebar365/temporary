package org.bouncycastle.b.h;

import java.util.Hashtable;
import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.r;
import org.bouncycastle.b.u;
import org.bouncycastle.b.z;

/* JADX INFO: loaded from: classes.dex */
public final class g implements z {
    private static Hashtable h;
    private r a;
    private int b;
    private int c;
    private org.bouncycastle.f.e d;
    private org.bouncycastle.f.e e;
    private byte[] f;
    private byte[] g;

    private g(r rVar, int i) {
        this.a = rVar;
        this.b = rVar.b();
        this.c = i;
        this.f = new byte[this.c];
        this.g = new byte[this.c + this.b];
    }

    private static void a(byte[] bArr, int i, byte b) {
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ b);
        }
    }

    @Override // org.bouncycastle.b.z
    public final int a(byte[] bArr, int i) {
        this.a.a(this.g, this.c);
        if (this.e != null) {
            ((org.bouncycastle.f.e) this.a).a(this.e);
            this.a.a(this.g, this.c, this.a.b());
        } else {
            this.a.a(this.g, 0, this.g.length);
        }
        int iA = this.a.a(bArr, i);
        for (int i2 = this.c; i2 < this.g.length; i2++) {
            this.g[i2] = 0;
        }
        if (this.d != null) {
            ((org.bouncycastle.f.e) this.a).a(this.d);
        } else {
            this.a.a(this.f, 0, this.f.length);
        }
        return iA;
    }

    @Override // org.bouncycastle.b.z
    public final String a() {
        return this.a.a() + "/HMAC";
    }

    @Override // org.bouncycastle.b.z
    public final void a(byte b) {
        this.a.a(b);
    }

    @Override // org.bouncycastle.b.z
    public final void a(org.bouncycastle.b.i iVar) {
        this.a.c();
        byte[] bArrA = ((ba) iVar).a();
        int length = bArrA.length;
        if (length > this.c) {
            this.a.a(bArrA, 0, length);
            this.a.a(this.f, 0);
            length = this.b;
        } else {
            System.arraycopy(bArrA, 0, this.f, 0, length);
        }
        while (length < this.f.length) {
            this.f[length] = 0;
            length++;
        }
        System.arraycopy(this.f, 0, this.g, 0, this.c);
        a(this.f, this.c, (byte) 54);
        a(this.g, this.c, (byte) 92);
        if (this.a instanceof org.bouncycastle.f.e) {
            this.e = ((org.bouncycastle.f.e) this.a).e();
            ((r) this.e).a(this.g, 0, this.c);
        }
        this.a.a(this.f, 0, this.f.length);
        if (this.a instanceof org.bouncycastle.f.e) {
            this.d = ((org.bouncycastle.f.e) this.a).e();
        }
    }

    @Override // org.bouncycastle.b.z
    public final void a(byte[] bArr, int i, int i2) {
        this.a.a(bArr, i, i2);
    }

    @Override // org.bouncycastle.b.z
    public final int b() {
        return this.b;
    }

    @Override // org.bouncycastle.b.z
    public final void c() {
        this.a.c();
        this.a.a(this.f, 0, this.f.length);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(r rVar) {
        int iIntValue;
        if (rVar instanceof u) {
            iIntValue = ((u) rVar).d();
        } else {
            Integer num = (Integer) h.get(rVar.a());
            if (num == null) {
                throw new IllegalArgumentException("unknown digest passed: " + rVar.a());
            }
            iIntValue = num.intValue();
        }
        this(rVar, iIntValue);
    }

    static {
        Hashtable hashtable = new Hashtable();
        h = hashtable;
        hashtable.put("GOST3411", 32);
        h.put("MD2", 16);
        h.put("MD4", 64);
        h.put("MD5", 64);
        h.put("RIPEMD128", 64);
        h.put("RIPEMD160", 64);
        h.put("SHA-1", 64);
        h.put("SHA-224", 64);
        h.put("SHA-256", 64);
        h.put("SHA-384", 128);
        h.put("SHA-512", 128);
        h.put("Tiger", 64);
        h.put("Whirlpool", 64);
    }
}
