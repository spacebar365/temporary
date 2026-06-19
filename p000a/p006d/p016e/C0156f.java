package p000a.p006d.p016e;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.p103c.p105b.C1200a;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.p006d.InterfaceC0176h;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.e.f */
/* JADX INFO: compiled from: Smb2SigningDigest.java */
/* JADX INFO: loaded from: classes.dex */
public class C0156f implements InterfaceC0176h {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f762a = C1620c.m4563a((Class<?>) C0156f.class);

    /* JADX INFO: renamed from: c */
    private static final Provider f763c = new C1200a();

    /* JADX INFO: renamed from: b */
    private final Mac f764b;

    public C0156f(byte[] bArr, int i, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac;
        switch (i) {
            case 514:
            case 528:
                mac = Mac.getInstance("HmacSHA256");
                break;
            case 768:
            case 770:
                bArr = C0163g.m503a(i, bArr, new byte[0]);
                mac = Mac.getInstance("AESCMAC", f763c);
                break;
            case 785:
                if (bArr2 == null) {
                    throw new IllegalArgumentException("Missing preauthIntegrityHash for SMB 3.1");
                }
                bArr = C0163g.m503a(i, bArr, bArr2);
                mac = Mac.getInstance("AESCMAC", f763c);
                break;
                break;
            default:
                throw new IllegalArgumentException("Unknown dialect");
        }
        mac.init(new SecretKeySpec(bArr, "HMAC"));
        this.f764b = mac;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m486a(byte[] bArr, int i, int i2) {
        synchronized (this) {
            this.f764b.reset();
            int i3 = i + 48;
            for (int i4 = 0; i4 < 16; i4++) {
                bArr[i3 + i4] = 0;
            }
            C0173a.m512b(C0173a.m511b(bArr, i + 16) | 8, bArr, i + 16);
            this.f764b.update(bArr, i, i2);
            System.arraycopy(this.f764b.doFinal(), 0, bArr, i + 48, 16);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m487b(byte[] bArr, int i, int i2) {
        boolean z = true;
        synchronized (this) {
            this.f764b.reset();
            if ((C0173a.m511b(bArr, i + 16) & 8) == 0) {
                f762a.mo4543e("The server did not sign a message we expected to be signed");
            } else {
                byte[] bArr2 = new byte[16];
                System.arraycopy(bArr, i + 48, bArr2, 0, 16);
                int i3 = i + 48;
                for (int i4 = 0; i4 < 16; i4++) {
                    bArr[i3 + i4] = 0;
                }
                this.f764b.update(bArr, i, i2);
                byte[] bArr3 = new byte[16];
                System.arraycopy(this.f764b.doFinal(), 0, bArr3, 0, 16);
                if (MessageDigest.isEqual(bArr2, bArr3)) {
                    z = false;
                }
            }
        }
        return z;
    }
}
