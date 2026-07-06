package a.d.e;

import a.d.h;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: Smb2SigningDigest.java */
/* JADX INFO: loaded from: classes.dex */
public class f implements h {
    private static final org.c.b a = org.c.c.a((Class<?>) f.class);
    private static final Provider c = new org.bouncycastle.c.b.a();
    private final Mac b;

    public f(byte[] bArr, int i, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac;
        switch (i) {
            case 514:
            case 528:
                mac = Mac.getInstance("HmacSHA256");
                break;
            case 768:
            case 770:
                bArr = g.a(i, bArr, new byte[0]);
                mac = Mac.getInstance("AESCMAC", c);
                break;
            case 785:
                if (bArr2 == null) {
                    throw new IllegalArgumentException("Missing preauthIntegrityHash for SMB 3.1");
                }
                bArr = g.a(i, bArr, bArr2);
                mac = Mac.getInstance("AESCMAC", c);
                break;
                break;
            default:
                throw new IllegalArgumentException("Unknown dialect");
        }
        mac.init(new SecretKeySpec(bArr, "HMAC"));
        this.b = mac;
    }

    public final synchronized void a(byte[] bArr, int i, int i2) {
        synchronized (this) {
            this.b.reset();
            int i3 = i + 48;
            for (int i4 = 0; i4 < 16; i4++) {
                bArr[i3 + i4] = 0;
            }
            a.d.f.a.b(a.d.f.a.b(bArr, i + 16) | 8, bArr, i + 16);
            this.b.update(bArr, i, i2);
            System.arraycopy(this.b.doFinal(), 0, bArr, i + 48, 16);
        }
    }

    public final synchronized boolean b(byte[] bArr, int i, int i2) {
        boolean z = true;
        synchronized (this) {
            this.b.reset();
            if ((a.d.f.a.b(bArr, i + 16) & 8) == 0) {
                a.e("The server did not sign a message we expected to be signed");
            } else {
                byte[] bArr2 = new byte[16];
                System.arraycopy(bArr, i + 48, bArr2, 0, 16);
                int i3 = i + 48;
                for (int i4 = 0; i4 < 16; i4++) {
                    bArr[i3 + i4] = 0;
                }
                this.b.update(bArr, i, i2);
                byte[] bArr3 = new byte[16];
                System.arraycopy(this.b.doFinal(), 0, bArr3, 0, 16);
                if (MessageDigest.isEqual(bArr2, bArr3)) {
                    z = false;
                }
            }
        }
        return z;
    }
}
