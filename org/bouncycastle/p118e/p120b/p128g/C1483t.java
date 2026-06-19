package org.bouncycastle.p118e.p120b.p128g;

/* JADX INFO: renamed from: org.bouncycastle.e.b.g.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1483t extends C1480q {

    /* JADX INFO: renamed from: b */
    private final C1481r f5380b;

    /* JADX INFO: renamed from: c */
    private final byte[] f5381c;

    /* JADX INFO: renamed from: d */
    private final byte[] f5382d;

    /* JADX INFO: renamed from: org.bouncycastle.e.b.g.t$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final C1481r f5383a;

        /* JADX INFO: renamed from: b */
        private byte[] f5384b = null;

        /* JADX INFO: renamed from: c */
        private byte[] f5385c = null;

        /* JADX INFO: renamed from: d */
        private byte[] f5386d = null;

        public a(C1481r c1481r) {
            this.f5383a = c1481r;
        }

        /* JADX INFO: renamed from: a */
        public final a m3953a(byte[] bArr) {
            this.f5384b = C1464aa.m3841a(bArr);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1483t m3954a() {
            return new C1483t(this, (byte) 0);
        }

        /* JADX INFO: renamed from: b */
        public final a m3955b(byte[] bArr) {
            this.f5385c = C1464aa.m3841a(bArr);
            return this;
        }
    }

    private C1483t(a aVar) {
        super(false, aVar.f5383a.m3925d().mo1927a());
        this.f5380b = aVar.f5383a;
        if (this.f5380b == null) {
            throw new NullPointerException("params == null");
        }
        int iM3926e = this.f5380b.m3926e();
        byte[] bArr = aVar.f5386d;
        if (bArr != null) {
            if (bArr.length != iM3926e + iM3926e) {
                throw new IllegalArgumentException("public key has wrong size");
            }
            this.f5381c = C1464aa.m3842a(bArr, 0, iM3926e);
            this.f5382d = C1464aa.m3842a(bArr, iM3926e + 0, iM3926e);
            return;
        }
        byte[] bArr2 = aVar.f5384b;
        if (bArr2 == null) {
            this.f5381c = new byte[iM3926e];
        } else {
            if (bArr2.length != iM3926e) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.f5381c = bArr2;
        }
        byte[] bArr3 = aVar.f5385c;
        if (bArr3 == null) {
            this.f5382d = new byte[iM3926e];
        } else {
            if (bArr3.length != iM3926e) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.f5382d = bArr3;
        }
    }

    /* synthetic */ C1483t(a aVar, byte b) {
        this(aVar);
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m3945c() {
        int iM3926e = this.f5380b.m3926e();
        byte[] bArr = new byte[iM3926e + iM3926e];
        C1464aa.m3837a(bArr, this.f5381c, 0);
        C1464aa.m3837a(bArr, this.f5382d, iM3926e + 0);
        return bArr;
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m3946d() {
        return C1464aa.m3841a(this.f5381c);
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m3947e() {
        return C1464aa.m3841a(this.f5382d);
    }

    /* JADX INFO: renamed from: f */
    public final C1481r m3948f() {
        return this.f5380b;
    }
}
