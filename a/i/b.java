package a.i;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: Crypto.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final org.bouncycastle.c.b.a a = new org.bouncycastle.c.b.a();

    public static MessageDigest a() {
        try {
            return MessageDigest.getInstance("MD4", a);
        } catch (NoSuchAlgorithmException e) {
            throw new a.e(e);
        }
    }

    public static MessageDigest b() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new a.e(e);
        }
    }

    public static MessageDigest c() {
        try {
            return MessageDigest.getInstance("SHA-512");
        } catch (NoSuchAlgorithmException e) {
            throw new a.e(e);
        }
    }

    public static MessageDigest a(byte[] bArr) {
        return new d(bArr);
    }

    public static Cipher b(byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance("RC4");
            cipher.init(1, new SecretKeySpec(bArr, "RC4"));
            return cipher;
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new a.e(e);
        }
    }

    public static Cipher c(byte[] bArr) {
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
            throw new a.e(e);
        }
    }
}
