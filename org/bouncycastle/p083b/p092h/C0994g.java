package org.bouncycastle.p083b.p092h;

import java.util.Hashtable;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.InterfaceC1178u;
import org.bouncycastle.p083b.InterfaceC1183z;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p142f.InterfaceC1554e;

/* JADX INFO: renamed from: org.bouncycastle.b.h.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0994g implements InterfaceC1183z {

    /* JADX INFO: renamed from: h */
    private static Hashtable f4096h;

    /* JADX INFO: renamed from: a */
    private InterfaceC1175r f4097a;

    /* JADX INFO: renamed from: b */
    private int f4098b;

    /* JADX INFO: renamed from: c */
    private int f4099c;

    /* JADX INFO: renamed from: d */
    private InterfaceC1554e f4100d;

    /* JADX INFO: renamed from: e */
    private InterfaceC1554e f4101e;

    /* JADX INFO: renamed from: f */
    private byte[] f4102f;

    /* JADX INFO: renamed from: g */
    private byte[] f4103g;

    private C0994g(InterfaceC1175r interfaceC1175r, int i) {
        this.f4097a = interfaceC1175r;
        this.f4098b = interfaceC1175r.mo1930b();
        this.f4099c = i;
        this.f4102f = new byte[this.f4099c];
        this.f4103g = new byte[this.f4099c + this.f4098b];
    }

    /* JADX INFO: renamed from: a */
    private static void m2459a(byte[] bArr, int i, byte b) {
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ b);
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final int mo2446a(byte[] bArr, int i) {
        this.f4097a.mo1926a(this.f4103g, this.f4099c);
        if (this.f4101e != null) {
            ((InterfaceC1554e) this.f4097a).mo1939a(this.f4101e);
            this.f4097a.mo1929a(this.f4103g, this.f4099c, this.f4097a.mo1930b());
        } else {
            this.f4097a.mo1929a(this.f4103g, 0, this.f4103g.length);
        }
        int iMo1926a = this.f4097a.mo1926a(bArr, i);
        for (int i2 = this.f4099c; i2 < this.f4103g.length; i2++) {
            this.f4103g[i2] = 0;
        }
        if (this.f4100d != null) {
            ((InterfaceC1554e) this.f4097a).mo1939a(this.f4100d);
        } else {
            this.f4097a.mo1929a(this.f4102f, 0, this.f4102f.length);
        }
        return iMo1926a;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final String mo2447a() {
        return this.f4097a.mo1927a() + "/HMAC";
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2448a(byte b) {
        this.f4097a.mo1928a(b);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2449a(InterfaceC1003i interfaceC1003i) {
        this.f4097a.mo1931c();
        byte[] bArrM2603a = ((C1076ba) interfaceC1003i).m2603a();
        int length = bArrM2603a.length;
        if (length > this.f4099c) {
            this.f4097a.mo1929a(bArrM2603a, 0, length);
            this.f4097a.mo1926a(this.f4102f, 0);
            length = this.f4098b;
        } else {
            System.arraycopy(bArrM2603a, 0, this.f4102f, 0, length);
        }
        while (length < this.f4102f.length) {
            this.f4102f[length] = 0;
            length++;
        }
        System.arraycopy(this.f4102f, 0, this.f4103g, 0, this.f4099c);
        m2459a(this.f4102f, this.f4099c, (byte) 54);
        m2459a(this.f4103g, this.f4099c, (byte) 92);
        if (this.f4097a instanceof InterfaceC1554e) {
            this.f4101e = ((InterfaceC1554e) this.f4097a).mo1941e();
            ((InterfaceC1175r) this.f4101e).mo1929a(this.f4103g, 0, this.f4099c);
        }
        this.f4097a.mo1929a(this.f4102f, 0, this.f4102f.length);
        if (this.f4097a instanceof InterfaceC1554e) {
            this.f4100d = ((InterfaceC1554e) this.f4097a).mo1941e();
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2450a(byte[] bArr, int i, int i2) {
        this.f4097a.mo1929a(bArr, i, i2);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: b */
    public final int mo2451b() {
        return this.f4098b;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: c */
    public final void mo2452c() {
        this.f4097a.mo1931c();
        this.f4097a.mo1929a(this.f4102f, 0, this.f4102f.length);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0994g(InterfaceC1175r interfaceC1175r) {
        int iIntValue;
        if (interfaceC1175r instanceof InterfaceC1178u) {
            iIntValue = ((InterfaceC1178u) interfaceC1175r).mo1932d();
        } else {
            Integer num = (Integer) f4096h.get(interfaceC1175r.mo1927a());
            if (num == null) {
                throw new IllegalArgumentException("unknown digest passed: " + interfaceC1175r.mo1927a());
            }
            iIntValue = num.intValue();
        }
        this(interfaceC1175r, iIntValue);
    }

    static {
        Hashtable hashtable = new Hashtable();
        f4096h = hashtable;
        hashtable.put("GOST3411", 32);
        f4096h.put("MD2", 16);
        f4096h.put("MD4", 64);
        f4096h.put("MD5", 64);
        f4096h.put("RIPEMD128", 64);
        f4096h.put("RIPEMD160", 64);
        f4096h.put("SHA-1", 64);
        f4096h.put("SHA-224", 64);
        f4096h.put("SHA-256", 64);
        f4096h.put("SHA-384", 128);
        f4096h.put("SHA-512", 128);
        f4096h.put("Tiger", 64);
        f4096h.put("Whirlpool", 64);
    }
}
