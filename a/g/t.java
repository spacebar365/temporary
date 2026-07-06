package a.g;

import java.security.DigestException;
import java.security.MessageDigest;
import javax.crypto.ShortBufferException;

/* JADX INFO: compiled from: NtlmUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    static final byte[] a = {75, 71, 83, 33, 64, 35, 36, 37};

    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, long j, byte[] bArr4) {
        int length = bArr4 != null ? bArr4.length : 0;
        byte[] bArr5 = new byte[length + 28 + 4];
        a.i.c.a(257, bArr5, 0);
        a.i.c.a(0, bArr5, 4);
        a.i.c.a((int) (j & 4294967295L), bArr5, 8);
        a.i.c.a((int) ((j >> 32) & 4294967295L), bArr5, 12);
        System.arraycopy(bArr3, 0, bArr5, 16, 8);
        a.i.c.a(0, bArr5, 24);
        if (bArr4 != null) {
            System.arraycopy(bArr4, 0, bArr5, 28, length);
        }
        a.i.c.a(0, bArr5, length + 28);
        int length2 = bArr5.length;
        MessageDigest messageDigestA = a.i.b.a(bArr);
        messageDigestA.update(bArr2);
        messageDigestA.update(bArr5, 0, length2);
        byte[] bArrDigest = messageDigestA.digest();
        byte[] bArr6 = new byte[bArrDigest.length + bArr5.length];
        System.arraycopy(bArrDigest, 0, bArr6, 0, bArrDigest.length);
        System.arraycopy(bArr5, 0, bArr6, bArrDigest.length, bArr5.length);
        return bArr6;
    }

    public static byte[] a(String str, String str2, String str3) {
        MessageDigest messageDigestA = a.i.b.a();
        messageDigestA.update(a.i.f.a(str3));
        MessageDigest messageDigestA2 = a.i.b.a(messageDigestA.digest());
        messageDigestA2.update(a.i.f.a(str2.toUpperCase()));
        messageDigestA2.update(a.i.f.a(str));
        return messageDigestA2.digest();
    }

    public static byte[] a(String str) {
        if (str == null) {
            throw new NullPointerException("Password parameter is required");
        }
        MessageDigest messageDigestA = a.i.b.a();
        messageDigestA.update(a.i.f.a(str));
        return messageDigestA.digest();
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws ShortBufferException {
        byte[] bArr4 = new byte[8];
        MessageDigest messageDigestB = a.i.b.b();
        messageDigestB.update(bArr2);
        messageDigestB.update(bArr3, 0, 8);
        System.arraycopy(messageDigestB.digest(), 0, bArr4, 0, 8);
        byte[] bArr5 = new byte[21];
        System.arraycopy(bArr, 0, bArr5, 0, 16);
        byte[] bArr6 = new byte[24];
        b(bArr5, bArr4, bArr6);
        return bArr6;
    }

    public static byte[] a(String str, String str2, String str3, byte[] bArr, byte[] bArr2) throws DigestException {
        byte[] bArr3 = new byte[24];
        MessageDigest messageDigestA = a.i.b.a();
        messageDigestA.update(a.i.f.a(str3));
        MessageDigest messageDigestA2 = a.i.b.a(messageDigestA.digest());
        messageDigestA2.update(a.i.f.a(str2.toUpperCase()));
        messageDigestA2.update(a.i.f.a(str.toUpperCase()));
        MessageDigest messageDigestA3 = a.i.b.a(messageDigestA2.digest());
        messageDigestA3.update(bArr);
        messageDigestA3.update(bArr2);
        messageDigestA3.digest(bArr3, 0, 16);
        System.arraycopy(bArr2, 0, bArr3, 16, 8);
        return bArr3;
    }

    public static byte[] a(String str, byte[] bArr) throws DigestException, ShortBufferException {
        byte[] bArr2 = new byte[21];
        byte[] bArr3 = new byte[24];
        byte[] bArrA = a.i.f.a(str);
        MessageDigest messageDigestA = a.i.b.a();
        messageDigestA.update(bArrA);
        messageDigestA.digest(bArr2, 0, 16);
        b(bArr2, bArr, bArr3);
        return bArr3;
    }

    public static byte[] a(a.c cVar, String str, byte[] bArr) throws ShortBufferException {
        byte[] bArr2 = new byte[14];
        byte[] bArr3 = new byte[21];
        byte[] bArr4 = new byte[24];
        byte[] bArrA = a.i.f.a(str, cVar.a());
        int length = bArrA.length;
        System.arraycopy(bArrA, 0, bArr2, 0, length <= 14 ? length : 14);
        b(bArr2, a, bArr3);
        b(bArr3, bArr, bArr4);
        return bArr4;
    }

    private static void b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws ShortBufferException {
        byte[] bArr4 = new byte[7];
        byte[] bArr5 = new byte[8];
        for (int i = 0; i < bArr.length / 7; i++) {
            System.arraycopy(bArr, i * 7, bArr4, 0, 7);
            a.i.b.c(bArr4).update(bArr2, 0, bArr2.length, bArr5);
            System.arraycopy(bArr5, 0, bArr3, i * 8, 8);
        }
    }
}
