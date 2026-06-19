package org.bouncycastle.p118e.p120b.p128g;

import java.io.IOException;
import org.bouncycastle.p118e.p120b.p128g.C1473j;
import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.e.b.g.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1488y extends C1479p {

    /* JADX INFO: renamed from: b */
    private final C1487x f5393b;

    /* JADX INFO: renamed from: c */
    private final byte[] f5394c;

    /* JADX INFO: renamed from: d */
    private final byte[] f5395d;

    /* JADX INFO: renamed from: e */
    private final byte[] f5396e;

    /* JADX INFO: renamed from: f */
    private final byte[] f5397f;

    /* JADX INFO: renamed from: g */
    private final C1463a f5398g;

    /* JADX INFO: renamed from: org.bouncycastle.e.b.g.y$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final C1487x f5399a;

        /* JADX INFO: renamed from: b */
        private int f5400b = 0;

        /* JADX INFO: renamed from: c */
        private byte[] f5401c = null;

        /* JADX INFO: renamed from: d */
        private byte[] f5402d = null;

        /* JADX INFO: renamed from: e */
        private byte[] f5403e = null;

        /* JADX INFO: renamed from: f */
        private byte[] f5404f = null;

        /* JADX INFO: renamed from: g */
        private C1463a f5405g = null;

        /* JADX INFO: renamed from: h */
        private byte[] f5406h = null;

        /* JADX INFO: renamed from: i */
        private C1487x f5407i = null;

        public a(C1487x c1487x) {
            this.f5399a = c1487x;
        }

        /* JADX INFO: renamed from: a */
        public final a m3979a(int i) {
            this.f5400b = i;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m3980a(C1463a c1463a) {
            this.f5405g = c1463a;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m3981a(byte[] bArr) {
            this.f5401c = C1464aa.m3841a(bArr);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1488y m3982a() {
            return new C1488y(this, (byte) 0);
        }

        /* JADX INFO: renamed from: b */
        public final a m3983b(byte[] bArr) {
            this.f5402d = C1464aa.m3841a(bArr);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final a m3984c(byte[] bArr) {
            this.f5403e = C1464aa.m3841a(bArr);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final a m3985d(byte[] bArr) {
            this.f5404f = C1464aa.m3841a(bArr);
            return this;
        }
    }

    private C1488y(a aVar) {
        super(true, aVar.f5399a.m3962a().mo1927a());
        this.f5393b = aVar.f5399a;
        if (this.f5393b == null) {
            throw new NullPointerException("params == null");
        }
        int iM3963b = this.f5393b.m3963b();
        byte[] bArr = aVar.f5406h;
        if (bArr != null) {
            if (aVar.f5407i == null) {
                throw new NullPointerException("xmss == null");
            }
            int iM3965d = this.f5393b.m3965d();
            int iM4135a = AbstractC1556g.m4135a(bArr, 0);
            if (!C1464aa.m3838a(iM3965d, iM4135a)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.f5394c = C1464aa.m3842a(bArr, 4, iM3963b);
            int i = iM3963b + 4;
            this.f5395d = C1464aa.m3842a(bArr, i, iM3963b);
            int i2 = i + iM3963b;
            this.f5396e = C1464aa.m3842a(bArr, i2, iM3963b);
            int i3 = i2 + iM3963b;
            this.f5397f = C1464aa.m3842a(bArr, i3, iM3963b);
            int i4 = iM3963b + i3;
            try {
                C1463a c1463a = (C1463a) C1464aa.m3836a(C1464aa.m3842a(bArr, i4, bArr.length - i4), C1463a.class);
                if (c1463a.m3830a() != iM4135a) {
                    throw new IllegalStateException("serialized BDS has wrong index");
                }
                this.f5398g = c1463a.m3831a(C1469f.m3863a(aVar.f5407i.m3962a().mo1927a()));
                return;
            } catch (IOException e) {
                throw new IllegalArgumentException(e.getMessage(), e);
            } catch (ClassNotFoundException e2) {
                throw new IllegalArgumentException(e2.getMessage(), e2);
            }
        }
        byte[] bArr2 = aVar.f5401c;
        if (bArr2 == null) {
            this.f5394c = new byte[iM3963b];
        } else {
            if (bArr2.length != iM3963b) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.f5394c = bArr2;
        }
        byte[] bArr3 = aVar.f5402d;
        if (bArr3 == null) {
            this.f5395d = new byte[iM3963b];
        } else {
            if (bArr3.length != iM3963b) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.f5395d = bArr3;
        }
        byte[] bArr4 = aVar.f5403e;
        if (bArr4 == null) {
            this.f5396e = new byte[iM3963b];
        } else {
            if (bArr4.length != iM3963b) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f5396e = bArr4;
        }
        byte[] bArr5 = aVar.f5404f;
        if (bArr5 == null) {
            this.f5397f = new byte[iM3963b];
        } else {
            if (bArr5.length != iM3963b) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.f5397f = bArr5;
        }
        C1463a c1463a2 = aVar.f5405g;
        if (c1463a2 != null) {
            this.f5398g = c1463a2;
        } else if (aVar.f5400b >= (1 << this.f5393b.m3965d()) - 2 || bArr4 == null || bArr2 == null) {
            this.f5398g = new C1463a(this.f5393b, aVar.f5400b);
        } else {
            this.f5398g = new C1463a(this.f5393b, bArr4, bArr2, (C1473j) new C1473j.a().mo3871a(), aVar.f5400b);
        }
    }

    /* synthetic */ C1488y(a aVar, byte b) {
        this(aVar);
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m3968c() {
        int iM3963b = this.f5393b.m3963b();
        byte[] bArr = new byte[iM3963b + 4 + iM3963b + iM3963b + iM3963b];
        AbstractC1556g.m4136a(this.f5398g.m3830a(), bArr, 0);
        C1464aa.m3837a(bArr, this.f5394c, 4);
        int i = iM3963b + 4;
        C1464aa.m3837a(bArr, this.f5395d, i);
        int i2 = i + iM3963b;
        C1464aa.m3837a(bArr, this.f5396e, i2);
        C1464aa.m3837a(bArr, this.f5397f, iM3963b + i2);
        try {
            return C1535a.m4095d(bArr, C1464aa.m3840a(this.f5398g));
        } catch (IOException e) {
            throw new RuntimeException("error serializing bds state: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: d */
    public final C1487x m3969d() {
        return this.f5393b;
    }
}
