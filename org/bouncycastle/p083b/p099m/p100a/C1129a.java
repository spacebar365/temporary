package org.bouncycastle.p083b.p099m.p100a;

import org.bouncycastle.p083b.InterfaceC1183z;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p099m.InterfaceC1135d;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.m.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1129a implements InterfaceC1131c {

    /* JADX INFO: renamed from: a */
    private byte[] f4530a;

    /* JADX INFO: renamed from: b */
    private byte[] f4531b;

    /* JADX INFO: renamed from: c */
    private long f4532c;

    /* JADX INFO: renamed from: d */
    private InterfaceC1135d f4533d;

    /* JADX INFO: renamed from: e */
    private InterfaceC1183z f4534e;

    /* JADX INFO: renamed from: f */
    private int f4535f;

    public C1129a(InterfaceC1183z interfaceC1183z, int i, InterfaceC1135d interfaceC1135d, byte[] bArr, byte[] bArr2) {
        if (i > C1132d.m2730a(interfaceC1183z)) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        }
        if (interfaceC1135d.mo2733b() < i) {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
        this.f4535f = i;
        this.f4533d = interfaceC1135d;
        this.f4534e = interfaceC1183z;
        byte[] bArrM4079a = C1535a.m4079a(m2722b(), bArr2, bArr);
        this.f4530a = new byte[interfaceC1183z.mo2451b()];
        this.f4531b = new byte[this.f4530a.length];
        C1535a.m4071a(this.f4531b, (byte) 1);
        m2720a(bArrM4079a);
        this.f4532c = 1L;
    }

    /* JADX INFO: renamed from: a */
    private void m2720a(byte[] bArr) {
        m2721a(bArr, (byte) 0);
        if (bArr != null) {
            m2721a(bArr, (byte) 1);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2721a(byte[] bArr, byte b) {
        this.f4534e.mo2449a(new C1076ba(this.f4530a));
        this.f4534e.mo2450a(this.f4531b, 0, this.f4531b.length);
        this.f4534e.mo2448a(b);
        if (bArr != null) {
            this.f4534e.mo2450a(bArr, 0, bArr.length);
        }
        this.f4534e.mo2446a(this.f4530a, 0);
        this.f4534e.mo2449a(new C1076ba(this.f4530a));
        this.f4534e.mo2450a(this.f4531b, 0, this.f4531b.length);
        this.f4534e.mo2446a(this.f4531b, 0);
    }

    /* JADX INFO: renamed from: b */
    private byte[] m2722b() {
        byte[] bArrMo2732a = this.f4533d.mo2732a();
        if (bArrMo2732a.length < (this.f4535f + 7) / 8) {
            throw new IllegalStateException("Insufficient entropy provided by entropy source");
        }
        return bArrMo2732a;
    }

    @Override // org.bouncycastle.p083b.p099m.p100a.InterfaceC1131c
    /* JADX INFO: renamed from: a */
    public final int mo2723a(byte[] bArr, boolean z) {
        int length = bArr.length * 8;
        if (length > 262144) {
            throw new IllegalArgumentException("Number of bits per request limited to 262144");
        }
        if (this.f4532c > 140737488355328L) {
            return -1;
        }
        if (z) {
            mo2724a();
        }
        byte[] bArr2 = new byte[bArr.length];
        int length2 = bArr.length / this.f4531b.length;
        this.f4534e.mo2449a(new C1076ba(this.f4530a));
        for (int i = 0; i < length2; i++) {
            this.f4534e.mo2450a(this.f4531b, 0, this.f4531b.length);
            this.f4534e.mo2446a(this.f4531b, 0);
            System.arraycopy(this.f4531b, 0, bArr2, this.f4531b.length * i, this.f4531b.length);
        }
        if (this.f4531b.length * length2 < bArr2.length) {
            this.f4534e.mo2450a(this.f4531b, 0, this.f4531b.length);
            this.f4534e.mo2446a(this.f4531b, 0);
            System.arraycopy(this.f4531b, 0, bArr2, this.f4531b.length * length2, bArr2.length - (length2 * this.f4531b.length));
        }
        m2720a(null);
        this.f4532c++;
        System.arraycopy(bArr2, 0, bArr, 0, bArr.length);
        return length;
    }

    @Override // org.bouncycastle.p083b.p099m.p100a.InterfaceC1131c
    /* JADX INFO: renamed from: a */
    public final void mo2724a() {
        m2720a(C1535a.m4095d(m2722b(), null));
        this.f4532c = 1L;
    }
}
