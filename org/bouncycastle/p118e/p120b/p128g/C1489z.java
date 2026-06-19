package org.bouncycastle.p118e.p120b.p128g;

/* JADX INFO: renamed from: org.bouncycastle.e.b.g.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1489z extends C1479p {

    /* JADX INFO: renamed from: b */
    private final C1487x f5408b;

    /* JADX INFO: renamed from: c */
    private final byte[] f5409c;

    /* JADX INFO: renamed from: d */
    private final byte[] f5410d;

    /* JADX INFO: renamed from: org.bouncycastle.e.b.g.z$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final C1487x f5411a;

        /* JADX INFO: renamed from: b */
        private byte[] f5412b = null;

        /* JADX INFO: renamed from: c */
        private byte[] f5413c = null;

        /* JADX INFO: renamed from: d */
        private byte[] f5414d = null;

        public a(C1487x c1487x) {
            this.f5411a = c1487x;
        }

        /* JADX INFO: renamed from: a */
        public final a m3994a(byte[] bArr) {
            this.f5412b = C1464aa.m3841a(bArr);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C1489z m3995a() {
            return new C1489z(this, (byte) 0);
        }

        /* JADX INFO: renamed from: b */
        public final a m3996b(byte[] bArr) {
            this.f5413c = C1464aa.m3841a(bArr);
            return this;
        }
    }

    private C1489z(a aVar) {
        super(false, aVar.f5411a.m3962a().mo1927a());
        this.f5408b = aVar.f5411a;
        if (this.f5408b == null) {
            throw new NullPointerException("params == null");
        }
        int iM3963b = this.f5408b.m3963b();
        byte[] bArr = aVar.f5414d;
        if (bArr != null) {
            if (bArr.length != iM3963b + iM3963b) {
                throw new IllegalArgumentException("public key has wrong size");
            }
            this.f5409c = C1464aa.m3842a(bArr, 0, iM3963b);
            this.f5410d = C1464aa.m3842a(bArr, iM3963b + 0, iM3963b);
            return;
        }
        byte[] bArr2 = aVar.f5412b;
        if (bArr2 == null) {
            this.f5409c = new byte[iM3963b];
        } else {
            if (bArr2.length != iM3963b) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.f5409c = bArr2;
        }
        byte[] bArr3 = aVar.f5413c;
        if (bArr3 == null) {
            this.f5410d = new byte[iM3963b];
        } else {
            if (bArr3.length != iM3963b) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.f5410d = bArr3;
        }
    }

    /* synthetic */ C1489z(a aVar, byte b) {
        this(aVar);
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m3986c() {
        int iM3963b = this.f5408b.m3963b();
        byte[] bArr = new byte[iM3963b + iM3963b];
        C1464aa.m3837a(bArr, this.f5409c, 0);
        C1464aa.m3837a(bArr, this.f5410d, iM3963b + 0);
        return bArr;
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m3987d() {
        return C1464aa.m3841a(this.f5409c);
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m3988e() {
        return C1464aa.m3841a(this.f5410d);
    }

    /* JADX INFO: renamed from: f */
    public final C1487x m3989f() {
        return this.f5408b;
    }
}
