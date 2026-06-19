package p000a.p029g;

import java.security.DigestException;
import java.security.MessageDigest;
import javax.crypto.ShortBufferException;
import p000a.InterfaceC0016c;
import p000a.p031i.C0281b;
import p000a.p031i.C0282c;
import p000a.p031i.C0285f;

/* JADX INFO: renamed from: a.g.t */
/* JADX INFO: compiled from: NtlmUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0260t {

    /* JADX INFO: renamed from: a */
    static final byte[] f1210a = {75, 71, 83, 33, 64, 35, 36, 37};

    /* JADX INFO: renamed from: a */
    public static byte[] m909a(byte[] bArr, byte[] bArr2, byte[] bArr3, long j, byte[] bArr4) {
        int length = bArr4 != null ? bArr4.length : 0;
        byte[] bArr5 = new byte[length + 28 + 4];
        C0282c.m941a(257, bArr5, 0);
        C0282c.m941a(0, bArr5, 4);
        C0282c.m941a((int) (j & 4294967295L), bArr5, 8);
        C0282c.m941a((int) ((j >> 32) & 4294967295L), bArr5, 12);
        System.arraycopy(bArr3, 0, bArr5, 16, 8);
        C0282c.m941a(0, bArr5, 24);
        if (bArr4 != null) {
            System.arraycopy(bArr4, 0, bArr5, 28, length);
        }
        C0282c.m941a(0, bArr5, length + 28);
        int length2 = bArr5.length;
        MessageDigest messageDigestM935a = C0281b.m935a(bArr);
        messageDigestM935a.update(bArr2);
        messageDigestM935a.update(bArr5, 0, length2);
        byte[] bArrDigest = messageDigestM935a.digest();
        byte[] bArr6 = new byte[bArrDigest.length + bArr5.length];
        System.arraycopy(bArrDigest, 0, bArr6, 0, bArrDigest.length);
        System.arraycopy(bArr5, 0, bArr6, bArrDigest.length, bArr5.length);
        return bArr6;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m905a(String str, String str2, String str3) {
        MessageDigest messageDigestM934a = C0281b.m934a();
        messageDigestM934a.update(C0285f.m952a(str3));
        MessageDigest messageDigestM935a = C0281b.m935a(messageDigestM934a.digest());
        messageDigestM935a.update(C0285f.m952a(str2.toUpperCase()));
        messageDigestM935a.update(C0285f.m952a(str));
        return messageDigestM935a.digest();
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m904a(String str) {
        if (str == null) {
            throw new NullPointerException("Password parameter is required");
        }
        MessageDigest messageDigestM934a = C0281b.m934a();
        messageDigestM934a.update(C0285f.m952a(str));
        return messageDigestM934a.digest();
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m908a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws ShortBufferException {
        byte[] bArr4 = new byte[8];
        MessageDigest messageDigestM936b = C0281b.m936b();
        messageDigestM936b.update(bArr2);
        messageDigestM936b.update(bArr3, 0, 8);
        System.arraycopy(messageDigestM936b.digest(), 0, bArr4, 0, 8);
        byte[] bArr5 = new byte[21];
        System.arraycopy(bArr, 0, bArr5, 0, 16);
        byte[] bArr6 = new byte[24];
        m910b(bArr5, bArr4, bArr6);
        return bArr6;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m906a(String str, String str2, String str3, byte[] bArr, byte[] bArr2) throws DigestException {
        byte[] bArr3 = new byte[24];
        MessageDigest messageDigestM934a = C0281b.m934a();
        messageDigestM934a.update(C0285f.m952a(str3));
        MessageDigest messageDigestM935a = C0281b.m935a(messageDigestM934a.digest());
        messageDigestM935a.update(C0285f.m952a(str2.toUpperCase()));
        messageDigestM935a.update(C0285f.m952a(str.toUpperCase()));
        MessageDigest messageDigestM935a2 = C0281b.m935a(messageDigestM935a.digest());
        messageDigestM935a2.update(bArr);
        messageDigestM935a2.update(bArr2);
        messageDigestM935a2.digest(bArr3, 0, 16);
        System.arraycopy(bArr2, 0, bArr3, 16, 8);
        return bArr3;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m907a(String str, byte[] bArr) throws DigestException, ShortBufferException {
        byte[] bArr2 = new byte[21];
        byte[] bArr3 = new byte[24];
        byte[] bArrM952a = C0285f.m952a(str);
        MessageDigest messageDigestM934a = C0281b.m934a();
        messageDigestM934a.update(bArrM952a);
        messageDigestM934a.digest(bArr2, 0, 16);
        m910b(bArr2, bArr, bArr3);
        return bArr3;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m903a(InterfaceC0016c interfaceC0016c, String str, byte[] bArr) throws ShortBufferException {
        byte[] bArr2 = new byte[14];
        byte[] bArr3 = new byte[21];
        byte[] bArr4 = new byte[24];
        byte[] bArrM953a = C0285f.m953a(str, interfaceC0016c.mo114a());
        int length = bArrM953a.length;
        System.arraycopy(bArrM953a, 0, bArr2, 0, length <= 14 ? length : 14);
        m910b(bArr2, f1210a, bArr3);
        m910b(bArr3, bArr, bArr4);
        return bArr4;
    }

    /* JADX INFO: renamed from: b */
    private static void m910b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws ShortBufferException {
        byte[] bArr4 = new byte[7];
        byte[] bArr5 = new byte[8];
        for (int i = 0; i < bArr.length / 7; i++) {
            System.arraycopy(bArr, i * 7, bArr4, 0, 7);
            C0281b.m939c(bArr4).update(bArr2, 0, bArr2.length, bArr5);
            System.arraycopy(bArr5, 0, bArr3, i * 8, 8);
        }
    }
}
