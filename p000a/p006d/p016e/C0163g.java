package p000a.p006d.p016e;

import java.nio.charset.StandardCharsets;
import org.bouncycastle.p083b.p086b.C0844u;
import org.bouncycastle.p083b.p090f.C0973t;
import org.bouncycastle.p083b.p092h.C0994g;
import org.bouncycastle.p083b.p097k.C1073ay;

/* JADX INFO: renamed from: a.d.e.g */
/* JADX INFO: compiled from: Smb3KeyDerivation.java */
/* JADX INFO: loaded from: classes.dex */
final class C0163g {

    /* JADX INFO: renamed from: a */
    private static final byte[] f791a = m504a("SmbSign");

    /* JADX INFO: renamed from: b */
    private static final byte[] f792b = m504a("SMB2AESCMAC");

    /* JADX INFO: renamed from: c */
    private static final byte[] f793c = m504a("SMBSigningKey");

    /* JADX INFO: renamed from: d */
    private static final byte[] f794d = m504a("SmbRpc");

    /* JADX INFO: renamed from: e */
    private static final byte[] f795e = m504a("SMB2APP");

    /* JADX INFO: renamed from: f */
    private static final byte[] f796f = m504a("SMBAppKey");

    /* JADX INFO: renamed from: g */
    private static final byte[] f797g = m504a("ServerIn ");

    /* JADX INFO: renamed from: h */
    private static final byte[] f798h = m504a("SMB2AESCCM");

    /* JADX INFO: renamed from: i */
    private static final byte[] f799i = m504a("SMB2C2SCipherKey");

    /* JADX INFO: renamed from: j */
    private static final byte[] f800j = m504a("ServerOut");

    /* JADX INFO: renamed from: k */
    private static final byte[] f801k = m504a("SMB2AESCCM");

    /* JADX INFO: renamed from: l */
    private static final byte[] f802l = m504a("SMB2S2CCipherKey");

    /* JADX INFO: renamed from: a */
    public static byte[] m503a(int i, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = i == 785 ? f793c : f792b;
        if (i != 785) {
            bArr2 = f791a;
        }
        C0973t c0973t = new C0973t(new C0994g(new C0844u()));
        byte[] bArr4 = new byte[bArr3.length + bArr2.length + 5];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        System.arraycopy(bArr2, 0, bArr4, bArr3.length + 1, bArr2.length);
        bArr4[bArr4.length - 1] = -128;
        c0973t.mo1877a(new C1073ay(bArr, bArr4));
        byte[] bArr5 = new byte[16];
        c0973t.mo1876a(bArr5, 0, 16);
        return bArr5;
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m504a(String str) {
        byte[] bArr = new byte[str.length() + 1];
        System.arraycopy(str.getBytes(StandardCharsets.US_ASCII), 0, bArr, 0, str.length());
        return bArr;
    }
}
