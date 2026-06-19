package p000a.p031i;

import java.security.MessageDigest;

/* JADX INFO: renamed from: a.i.d */
/* JADX INFO: compiled from: HMACT64.java */
/* JADX INFO: loaded from: classes.dex */
final class C0283d extends MessageDigest implements Cloneable {

    /* JADX INFO: renamed from: a */
    private MessageDigest f1248a;

    /* JADX INFO: renamed from: b */
    private byte[] f1249b;

    /* JADX INFO: renamed from: c */
    private byte[] f1250c;

    public C0283d(byte[] bArr) {
        super("HMACT64");
        this.f1249b = new byte[64];
        this.f1250c = new byte[64];
        int iMin = Math.min(bArr.length, 64);
        for (int i = 0; i < iMin; i++) {
            this.f1249b[i] = (byte) (bArr[i] ^ 54);
            this.f1250c[i] = (byte) (bArr[i] ^ 92);
        }
        while (iMin < 64) {
            this.f1249b[iMin] = 54;
            this.f1250c[iMin] = 92;
            iMin++;
        }
        this.f1248a = C0281b.m936b();
        engineReset();
    }

    private C0283d(C0283d c0283d) {
        super("HMACT64");
        this.f1249b = new byte[64];
        this.f1250c = new byte[64];
        this.f1249b = c0283d.f1249b;
        this.f1250c = c0283d.f1250c;
        this.f1248a = (MessageDigest) c0283d.f1248a.clone();
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public final Object clone() {
        try {
            return new C0283d(this);
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override // java.security.MessageDigestSpi
    protected final byte[] engineDigest() {
        byte[] bArrDigest = this.f1248a.digest();
        this.f1248a.update(this.f1250c);
        return this.f1248a.digest(bArrDigest);
    }

    @Override // java.security.MessageDigestSpi
    protected final int engineDigest(byte[] bArr, int i, int i2) {
        byte[] bArrDigest = this.f1248a.digest();
        this.f1248a.update(this.f1250c);
        this.f1248a.update(bArrDigest);
        try {
            return this.f1248a.digest(bArr, i, i2);
        } catch (Exception e) {
            throw new IllegalStateException();
        }
    }

    @Override // java.security.MessageDigestSpi
    protected final int engineGetDigestLength() {
        return this.f1248a.getDigestLength();
    }

    @Override // java.security.MessageDigestSpi
    protected final void engineReset() {
        this.f1248a.reset();
        this.f1248a.update(this.f1249b);
    }

    @Override // java.security.MessageDigestSpi
    protected final void engineUpdate(byte b) {
        this.f1248a.update(b);
    }

    @Override // java.security.MessageDigestSpi
    protected final void engineUpdate(byte[] bArr, int i, int i2) {
        this.f1248a.update(bArr, i, i2);
    }
}
