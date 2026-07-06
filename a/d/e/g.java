package a.d.e;

import java.nio.charset.StandardCharsets;
import org.bouncycastle.b.b.u;
import org.bouncycastle.b.f.t;
import org.bouncycastle.b.k.ay;

/* JADX INFO: compiled from: Smb3KeyDerivation.java */
/* JADX INFO: loaded from: classes.dex */
final class g {
    private static final byte[] a = a("SmbSign");
    private static final byte[] b = a("SMB2AESCMAC");
    private static final byte[] c = a("SMBSigningKey");
    private static final byte[] d = a("SmbRpc");
    private static final byte[] e = a("SMB2APP");
    private static final byte[] f = a("SMBAppKey");
    private static final byte[] g = a("ServerIn ");
    private static final byte[] h = a("SMB2AESCCM");
    private static final byte[] i = a("SMB2C2SCipherKey");
    private static final byte[] j = a("ServerOut");
    private static final byte[] k = a("SMB2AESCCM");
    private static final byte[] l = a("SMB2S2CCipherKey");

    public static byte[] a(int i2, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = i2 == 785 ? c : b;
        if (i2 != 785) {
            bArr2 = a;
        }
        t tVar = new t(new org.bouncycastle.b.h.g(new u()));
        byte[] bArr4 = new byte[bArr3.length + bArr2.length + 5];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        System.arraycopy(bArr2, 0, bArr4, bArr3.length + 1, bArr2.length);
        bArr4[bArr4.length - 1] = -128;
        tVar.a(new ay(bArr, bArr4));
        byte[] bArr5 = new byte[16];
        tVar.a(bArr5, 0, 16);
        return bArr5;
    }

    private static byte[] a(String str) {
        byte[] bArr = new byte[str.length() + 1];
        System.arraycopy(str.getBytes(StandardCharsets.US_ASCII), 0, bArr, 0, str.length());
        return bArr;
    }
}
