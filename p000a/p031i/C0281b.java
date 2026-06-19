package p000a.p031i;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.p103c.p105b.C1200a;
import p000a.C0182e;

/* JADX INFO: renamed from: a.i.b */
/* JADX INFO: compiled from: Crypto.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0281b {

    /* JADX INFO: renamed from: a */
    private static final C1200a f1247a = new C1200a();

    /* JADX INFO: renamed from: a */
    public static MessageDigest m934a() {
        try {
            return MessageDigest.getInstance("MD4", f1247a);
        } catch (NoSuchAlgorithmException e) {
            throw new C0182e(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static MessageDigest m936b() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new C0182e(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static MessageDigest m938c() {
        try {
            return MessageDigest.getInstance("SHA-512");
        } catch (NoSuchAlgorithmException e) {
            throw new C0182e(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static MessageDigest m935a(byte[] bArr) {
        return new C0283d(bArr);
    }

    /* JADX INFO: renamed from: b */
    public static Cipher m937b(byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance("RC4");
            cipher.init(1, new SecretKeySpec(bArr, "RC4"));
            return cipher;
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new C0182e(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static Cipher m939c(byte[] bArr) {
        while (bArr.length == 7) {
            byte[] bArr2 = new byte[8];
            bArr2[0] = (byte) (bArr[0] & 254);
            bArr2[1] = (byte) ((bArr[0] << 7) | ((bArr[1] & 255) >>> 1));
            bArr2[2] = (byte) ((bArr[1] << 6) | ((bArr[2] & 255) >>> 2));
            bArr2[3] = (byte) ((bArr[2] << 5) | ((bArr[3] & 255) >>> 3));
            bArr2[4] = (byte) ((bArr[3] << 4) | ((bArr[4] & 255) >>> 4));
            bArr2[5] = (byte) ((bArr[4] << 3) | ((bArr[5] & 255) >>> 5));
            bArr2[6] = (byte) ((bArr[5] << 2) | ((bArr[6] & 255) >>> 6));
            bArr2[7] = (byte) (bArr[6] << 1);
            for (int i = 0; i < 8; i++) {
                bArr2[i] = (byte) (bArr2[i] ^ (Integer.bitCount(bArr2[i] ^ 1) & 1));
            }
            bArr = bArr2;
        }
        try {
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, new SecretKeySpec(bArr, "DES"));
            return cipher;
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new C0182e(e);
        }
    }
}
