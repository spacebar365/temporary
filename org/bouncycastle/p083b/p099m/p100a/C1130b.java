package org.bouncycastle.p083b.p099m.p100a;

import java.util.Hashtable;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p099m.InterfaceC1135d;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.m.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1130b implements InterfaceC1131c {

    /* JADX INFO: renamed from: a */
    private static final byte[] f4536a = {1};

    /* JADX INFO: renamed from: b */
    private static final Hashtable f4537b;

    /* JADX INFO: renamed from: c */
    private InterfaceC1175r f4538c;

    /* JADX INFO: renamed from: d */
    private byte[] f4539d;

    /* JADX INFO: renamed from: e */
    private byte[] f4540e;

    /* JADX INFO: renamed from: f */
    private long f4541f;

    /* JADX INFO: renamed from: g */
    private InterfaceC1135d f4542g;

    /* JADX INFO: renamed from: h */
    private int f4543h;

    /* JADX INFO: renamed from: i */
    private int f4544i;

    public C1130b(InterfaceC1175r interfaceC1175r, int i, InterfaceC1135d interfaceC1135d, byte[] bArr, byte[] bArr2) {
        if (i > C1132d.m2729a(interfaceC1175r)) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        }
        if (interfaceC1135d.mo2733b() < i) {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
        this.f4538c = interfaceC1175r;
        this.f4542g = interfaceC1135d;
        this.f4543h = i;
        this.f4544i = ((Integer) f4537b.get(interfaceC1175r.mo1927a())).intValue();
        this.f4539d = C1132d.m2731a(this.f4538c, C1535a.m4079a(m2728b(), bArr2, bArr), this.f4544i);
        byte[] bArr3 = new byte[this.f4539d.length + 1];
        System.arraycopy(this.f4539d, 0, bArr3, 1, this.f4539d.length);
        this.f4540e = C1132d.m2731a(this.f4538c, bArr3, this.f4544i);
        this.f4541f = 1L;
    }

    /* JADX INFO: renamed from: a */
    private static void m2725a(byte[] bArr, byte[] bArr2) {
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

    /* JADX INFO: renamed from: a */
    private byte[] m2726a(byte[] bArr, int i) {
        int iMo1930b = (i / 8) / this.f4538c.mo1930b();
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = new byte[i / 8];
        byte[] bArr4 = new byte[this.f4538c.mo1930b()];
        for (int i2 = 0; i2 <= iMo1930b; i2++) {
            m2727b(bArr2, bArr4);
            System.arraycopy(bArr4, 0, bArr3, bArr4.length * i2, bArr3.length - (bArr4.length * i2) > bArr4.length ? bArr4.length : bArr3.length - (bArr4.length * i2));
            m2725a(bArr2, f4536a);
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: b */
    private void m2727b(byte[] bArr, byte[] bArr2) {
        this.f4538c.mo1929a(bArr, 0, bArr.length);
        this.f4538c.mo1926a(bArr2, 0);
    }

    /* JADX INFO: renamed from: b */
    private byte[] m2728b() {
        byte[] bArrMo2732a = this.f4542g.mo2732a();
        if (bArrMo2732a.length < (this.f4543h + 7) / 8) {
            throw new IllegalStateException("Insufficient entropy provided by entropy source");
        }
        return bArrMo2732a;
    }

    @Override // org.bouncycastle.p083b.p099m.p100a.InterfaceC1131c
    /* JADX INFO: renamed from: a */
    public final void mo2724a() {
        this.f4539d = C1132d.m2731a(this.f4538c, C1535a.m4080a(f4536a, this.f4539d, m2728b(), null), this.f4544i);
        byte[] bArr = new byte[this.f4539d.length + 1];
        bArr[0] = 0;
        System.arraycopy(this.f4539d, 0, bArr, 1, this.f4539d.length);
        this.f4540e = C1132d.m2731a(this.f4538c, bArr, this.f4544i);
        this.f4541f = 1L;
    }

    @Override // org.bouncycastle.p083b.p099m.p100a.InterfaceC1131c
    /* JADX INFO: renamed from: a */
    public final int mo2723a(byte[] bArr, boolean z) {
        int length = bArr.length * 8;
        if (length > 262144) {
            throw new IllegalArgumentException("Number of bits per request limited to 262144");
        }
        if (this.f4541f > 140737488355328L) {
            return -1;
        }
        if (z) {
            mo2724a();
        }
        byte[] bArrM2726a = m2726a(this.f4539d, length);
        byte[] bArr2 = new byte[this.f4539d.length + 1];
        System.arraycopy(this.f4539d, 0, bArr2, 1, this.f4539d.length);
        bArr2[0] = 3;
        byte[] bArr3 = new byte[this.f4538c.mo1930b()];
        m2727b(bArr2, bArr3);
        m2725a(this.f4539d, bArr3);
        m2725a(this.f4539d, this.f4540e);
        m2725a(this.f4539d, new byte[]{(byte) (this.f4541f >> 24), (byte) (this.f4541f >> 16), (byte) (this.f4541f >> 8), (byte) this.f4541f});
        this.f4541f++;
        System.arraycopy(bArrM2726a, 0, bArr, 0, bArr.length);
        return length;
    }

    static {
        Hashtable hashtable = new Hashtable();
        f4537b = hashtable;
        hashtable.put("SHA-1", 440);
        f4537b.put("SHA-224", 440);
        f4537b.put("SHA-256", 440);
        f4537b.put("SHA-512/256", 440);
        f4537b.put("SHA-512/224", 440);
        f4537b.put("SHA-384", 888);
        f4537b.put("SHA-512", 888);
    }
}
