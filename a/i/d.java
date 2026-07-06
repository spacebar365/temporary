package a.i;

import java.security.MessageDigest;

/* JADX INFO: compiled from: HMACT64.java */
/* JADX INFO: loaded from: classes.dex */
final class d extends MessageDigest implements Cloneable {
    private MessageDigest a;
    private byte[] b;
    private byte[] c;

    public d(byte[] bArr) {
        super("HMACT64");
        this.b = new byte[64];
        this.c = new byte[64];
        int iMin = Math.min(bArr.length, 64);
        for (int i = 0; i < iMin; i++) {
            this.b[i] = (byte) (bArr[i] ^ 54);
            this.c[i] = (byte) (bArr[i] ^ 92);
        }
        while (iMin < 64) {
            this.b[iMin] = 54;
            this.c[iMin] = 92;
            iMin++;
        }
        this.a = b.b();
        engineReset();
    }

    private d(d dVar) {
        super("HMACT64");
        this.b = new byte[64];
        this.c = new byte[64];
        this.b = dVar.b;
        this.c = dVar.c;
        this.a = (MessageDigest) dVar.a.clone();
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public final Object clone() {
        try {
            return new d(this);
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override // java.security.MessageDigestSpi
    protected final byte[] engineDigest() {
        byte[] bArrDigest = this.a.digest();
        this.a.update(this.c);
        return this.a.digest(bArrDigest);
    }

    @Override // java.security.MessageDigestSpi
    protected final int engineDigest(byte[] bArr, int i, int i2) {
        byte[] bArrDigest = this.a.digest();
        this.a.update(this.c);
        this.a.update(bArrDigest);
        try {
            return this.a.digest(bArr, i, i2);
        } catch (Exception e) {
            throw new IllegalStateException();
        }
    }

    @Override // java.security.MessageDigestSpi
    protected final int engineGetDigestLength() {
        return this.a.getDigestLength();
    }

    @Override // java.security.MessageDigestSpi
    protected final void engineReset() {
        this.a.reset();
        this.a.update(this.b);
    }

    @Override // java.security.MessageDigestSpi
    protected final void engineUpdate(byte b) {
        this.a.update(b);
    }

    @Override // java.security.MessageDigestSpi
    protected final void engineUpdate(byte[] bArr, int i, int i2) {
        this.a.update(bArr, i, i2);
    }
}
