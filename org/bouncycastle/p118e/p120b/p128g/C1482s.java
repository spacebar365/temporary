package org.bouncycastle.p118e.p120b.p128g;

import java.io.IOException;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.e.b.g.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1482s extends C1480q {

    /* JADX INFO: renamed from: b */
    private final C1481r f5364b;

    /* JADX INFO: renamed from: c */
    private final long f5365c;

    /* JADX INFO: renamed from: d */
    private final byte[] f5366d;

    /* JADX INFO: renamed from: e */
    private final byte[] f5367e;

    /* JADX INFO: renamed from: f */
    private final byte[] f5368f;

    /* JADX INFO: renamed from: g */
    private final byte[] f5369g;

    /* JADX INFO: renamed from: h */
    private final C1465b f5370h;

    /* JADX INFO: renamed from: org.bouncycastle.e.b.g.s$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final C1481r f5371a;

        /* JADX INFO: renamed from: b */
        private long f5372b = 0;

        /* JADX INFO: renamed from: c */
        private byte[] f5373c = null;

        /* JADX INFO: renamed from: d */
        private byte[] f5374d = null;

        /* JADX INFO: renamed from: e */
        private byte[] f5375e = null;

        /* JADX INFO: renamed from: f */
        private byte[] f5376f = null;

        /* JADX INFO: renamed from: g */
        private C1465b f5377g = null;

        /* JADX INFO: renamed from: h */
        private byte[] f5378h = null;

        /* JADX INFO: renamed from: i */
        private C1487x f5379i = null;

        public a(C1481r c1481r) {
            this.f5371a = c1481r;
        }

        /* JADX INFO: renamed from: a */
        public final a m3938a(long j) {
            this.f5372b = j;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m3939a(C1465b c1465b) {
            this.f5377g = c1465b;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m3940a(byte[] bArr) {
            this.f5373c = C1464aa.m3841a(bArr);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1482s m3941a() {
            return new C1482s(this, (byte) 0);
        }

        /* JADX INFO: renamed from: b */
        public final a m3942b(byte[] bArr) {
            this.f5374d = C1464aa.m3841a(bArr);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final a m3943c(byte[] bArr) {
            this.f5375e = C1464aa.m3841a(bArr);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final a m3944d(byte[] bArr) {
            this.f5376f = C1464aa.m3841a(bArr);
            return this;
        }
    }

    private C1482s(a aVar) {
        super(true, aVar.f5371a.m3925d().mo1927a());
        this.f5364b = aVar.f5371a;
        if (this.f5364b == null) {
            throw new NullPointerException("params == null");
        }
        int iM3926e = this.f5364b.m3926e();
        byte[] bArr = aVar.f5378h;
        if (bArr != null) {
            if (aVar.f5379i == null) {
                throw new NullPointerException("xmss == null");
            }
            int iM3922a = this.f5364b.m3922a();
            int i = (iM3922a + 7) / 8;
            this.f5365c = C1464aa.m3835a(bArr, i);
            if (!C1464aa.m3838a(iM3922a, this.f5365c)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            int i2 = i + 0;
            this.f5366d = C1464aa.m3842a(bArr, i2, iM3926e);
            int i3 = i2 + iM3926e;
            this.f5367e = C1464aa.m3842a(bArr, i3, iM3926e);
            int i4 = i3 + iM3926e;
            this.f5368f = C1464aa.m3842a(bArr, i4, iM3926e);
            int i5 = i4 + iM3926e;
            this.f5369g = C1464aa.m3842a(bArr, i5, iM3926e);
            int i6 = iM3926e + i5;
            try {
                this.f5370h = ((C1465b) C1464aa.m3836a(C1464aa.m3842a(bArr, i6, bArr.length - i6), C1465b.class)).m3850a(C1469f.m3863a(aVar.f5379i.m3962a().mo1927a()));
                return;
            } catch (IOException e) {
                throw new IllegalArgumentException(e.getMessage(), e);
            } catch (ClassNotFoundException e2) {
                throw new IllegalArgumentException(e2.getMessage(), e2);
            }
        }
        this.f5365c = aVar.f5372b;
        byte[] bArr2 = aVar.f5373c;
        if (bArr2 == null) {
            this.f5366d = new byte[iM3926e];
        } else {
            if (bArr2.length != iM3926e) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.f5366d = bArr2;
        }
        byte[] bArr3 = aVar.f5374d;
        if (bArr3 == null) {
            this.f5367e = new byte[iM3926e];
        } else {
            if (bArr3.length != iM3926e) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.f5367e = bArr3;
        }
        byte[] bArr4 = aVar.f5375e;
        if (bArr4 == null) {
            this.f5368f = new byte[iM3926e];
        } else {
            if (bArr4.length != iM3926e) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f5368f = bArr4;
        }
        byte[] bArr5 = aVar.f5376f;
        if (bArr5 == null) {
            this.f5369g = new byte[iM3926e];
        } else {
            if (bArr5.length != iM3926e) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.f5369g = bArr5;
        }
        C1465b c1465b = aVar.f5377g;
        if (c1465b != null) {
            this.f5370h = c1465b;
            return;
        }
        if (!C1464aa.m3838a(this.f5364b.m3922a(), aVar.f5372b) || bArr4 == null || bArr2 == null) {
            this.f5370h = new C1465b();
        } else {
            this.f5370h = new C1465b(this.f5364b, aVar.f5372b, bArr4, bArr2);
        }
    }

    /* synthetic */ C1482s(a aVar, byte b) {
        this(aVar);
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m3927c() {
        int iM3926e = this.f5364b.m3926e();
        int iM3922a = (this.f5364b.m3922a() + 7) / 8;
        byte[] bArr = new byte[iM3922a + iM3926e + iM3926e + iM3926e + iM3926e];
        C1464aa.m3837a(bArr, C1464aa.m3839a(this.f5365c, iM3922a), 0);
        int i = iM3922a + 0;
        C1464aa.m3837a(bArr, this.f5366d, i);
        int i2 = i + iM3926e;
        C1464aa.m3837a(bArr, this.f5367e, i2);
        int i3 = i2 + iM3926e;
        C1464aa.m3837a(bArr, this.f5368f, i3);
        C1464aa.m3837a(bArr, this.f5369g, iM3926e + i3);
        try {
            return C1535a.m4095d(bArr, C1464aa.m3840a(this.f5370h));
        } catch (IOException e) {
            throw new IllegalStateException("error serializing bds state: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final C1481r m3928d() {
        return this.f5364b;
    }
}
