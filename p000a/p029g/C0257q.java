package p000a.p029g;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p142f.C1535a;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.C0044d;
import p000a.InterfaceC0016c;
import p000a.p006d.p025f.C0173a;
import p000a.p027f.C0206b;
import p000a.p027f.C0207c;
import p000a.p027f.C0208d;
import p000a.p031i.C0281b;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.g.q */
/* JADX INFO: compiled from: NtlmContext.java */
/* JADX INFO: loaded from: classes.dex */
public class C0257q implements InterfaceC0266z {

    /* JADX INFO: renamed from: a */
    public static C0653p f1179a;

    /* JADX INFO: renamed from: b */
    private static final InterfaceC1612b f1180b = C1620c.m4563a((Class<?>) C0257q.class);

    /* JADX INFO: renamed from: c */
    private C0259s f1181c;

    /* JADX INFO: renamed from: e */
    private String f1183e;

    /* JADX INFO: renamed from: j */
    private final boolean f1188j;

    /* JADX INFO: renamed from: n */
    private InterfaceC0016c f1192n;

    /* JADX INFO: renamed from: o */
    private String f1193o;

    /* JADX INFO: renamed from: p */
    private byte[] f1194p;

    /* JADX INFO: renamed from: q */
    private byte[] f1195q;

    /* JADX INFO: renamed from: r */
    private byte[] f1196r;

    /* JADX INFO: renamed from: s */
    private byte[] f1197s;

    /* JADX INFO: renamed from: t */
    private byte[] f1198t;

    /* JADX INFO: renamed from: u */
    private Cipher f1199u;

    /* JADX INFO: renamed from: v */
    private Cipher f1200v;

    /* JADX INFO: renamed from: f */
    private boolean f1184f = false;

    /* JADX INFO: renamed from: g */
    private byte[] f1185g = null;

    /* JADX INFO: renamed from: h */
    private byte[] f1186h = null;

    /* JADX INFO: renamed from: i */
    private String f1187i = null;

    /* JADX INFO: renamed from: k */
    private final AtomicInteger f1189k = new AtomicInteger(0);

    /* JADX INFO: renamed from: l */
    private final AtomicInteger f1190l = new AtomicInteger(0);

    /* JADX INFO: renamed from: m */
    private int f1191m = 1;

    /* JADX INFO: renamed from: d */
    private int f1182d = ((this.f1182d | 4) | 524288) | 536870912;

    /* JADX INFO: renamed from: d */
    private int f1182d = ((this.f1182d | 4) | 524288) | 536870912;

    static {
        try {
            f1179a = new C0653p("1.3.6.1.4.1.311.2.2.10");
        } catch (IllegalArgumentException e) {
            f1180b.mo4544e("Failed to parse OID", e);
        }
    }

    public C0257q(InterfaceC0016c interfaceC0016c, C0259s c0259s, boolean z) {
        this.f1192n = interfaceC0016c;
        this.f1181c = c0259s;
        if (!c0259s.mo899b()) {
            this.f1182d |= 1073774608;
        } else if (c0259s.m902h()) {
            this.f1182d |= 1073741824;
        } else {
            this.f1182d |= 2048;
        }
        this.f1188j = z;
        this.f1183e = interfaceC0016c.mo114a().mo79x();
    }

    @Override // p000a.p029g.InterfaceC0266z
    /* JADX INFO: renamed from: a */
    public final C0653p[] mo839a() {
        return new C0653p[]{f1179a};
    }

    public String toString() {
        String str;
        String str2;
        String str3 = "NtlmContext[auth=" + this.f1181c + ",ntlmsspFlags=0x" + C0284e.m947a(this.f1182d, 8) + ",workstation=" + this.f1183e + ",isEstablished=" + this.f1184f + ",state=" + this.f1191m + ",serverChallenge=";
        if (this.f1185g == null) {
            str = str3 + "null";
        } else {
            str = str3 + C0284e.m948a(this.f1185g);
        }
        String str4 = str + ",signingKey=";
        if (this.f1186h == null) {
            str2 = str4 + "null";
        } else {
            str2 = str4 + C0284e.m948a(this.f1186h);
        }
        return str2 + "]";
    }

    @Override // p000a.p029g.InterfaceC0266z
    /* JADX INFO: renamed from: b */
    public final int mo840b() {
        return 0;
    }

    @Override // p000a.p029g.InterfaceC0266z
    /* JADX INFO: renamed from: a */
    public final boolean mo836a(C0653p c0653p) {
        return f1179a.equals(c0653p);
    }

    @Override // p000a.p029g.InterfaceC0266z
    /* JADX INFO: renamed from: b */
    public final boolean mo841b(C0653p c0653p) {
        return C0259s.m896a(c0653p);
    }

    @Override // p000a.p029g.InterfaceC0266z
    /* JADX INFO: renamed from: c */
    public final boolean mo842c() {
        return this.f1184f;
    }

    @Override // p000a.p029g.InterfaceC0266z
    /* JADX INFO: renamed from: d */
    public final byte[] mo843d() {
        return this.f1186h;
    }

    @Override // p000a.p029g.InterfaceC0266z
    /* JADX INFO: renamed from: e */
    public final String mo844e() {
        return this.f1187i;
    }

    /* JADX INFO: renamed from: a */
    public final void m887a(String str) {
        this.f1193o = str;
    }

    @Override // p000a.p029g.InterfaceC0266z
    /* JADX INFO: renamed from: a */
    public final byte[] mo838a(byte[] bArr, int i) throws C0214ad {
        switch (this.f1191m) {
            case 1:
                C0206b c0206b = new C0206b(this.f1192n, this.f1182d, this.f1181c.mo898a(), this.f1183e);
                byte[] bArrM589c = c0206b.m589c();
                this.f1194p = bArrM589c;
                if (f1180b.mo4536b()) {
                    f1180b.mo4532a(c0206b.toString());
                    f1180b.mo4532a(C0284e.m948a(bArrM589c));
                }
                this.f1191m++;
                return bArrM589c;
            case 2:
                return m886b(bArr);
            default:
                throw new C0214ad("Invalid state");
        }
    }

    /* JADX INFO: renamed from: b */
    private byte[] m886b(byte[] bArr) throws C0214ad {
        try {
            C0207c c0207c = new C0207c(bArr);
            if (f1180b.mo4536b()) {
                f1180b.mo4532a(c0207c.toString());
                f1180b.mo4532a(C0284e.m948a(bArr));
            }
            this.f1185g = c0207c.m591c();
            if (this.f1188j) {
                if (this.f1192n.mo114a().mo51ap() && (!c0207c.m583b(1073741824) || !c0207c.m583b(524288))) {
                    throw new C0240bc("Server does not support extended NTLMv2 key exchange");
                }
                if (!c0207c.m583b(536870912)) {
                    throw new C0240bc("Server does not support 128-bit keys");
                }
            }
            this.f1182d &= c0207c.m580a();
            C0208d c0208d = new C0208d(this.f1192n, c0207c, this.f1193o, this.f1181c.m902h() ? "invalid" : this.f1181c.m901g(), this.f1181c.m902h() ? null : this.f1181c.mo898a(), this.f1181c.m902h() ? "GUEST" : this.f1181c.m900f(), this.f1183e, this.f1182d, this.f1181c.mo899b() ? false : true);
            c0208d.m594a(this.f1194p, bArr);
            byte[] bArrM596d = c0208d.m596d();
            if (f1180b.mo4536b()) {
                f1180b.mo4532a(c0208d.toString());
                f1180b.mo4532a(C0284e.m948a(bArr));
            }
            this.f1186h = c0208d.m595c();
            if (this.f1186h != null && (this.f1182d & 524288) != 0) {
                byte[] bArrM595c = c0208d.m595c();
                this.f1195q = m885a(bArrM595c, "session key to client-to-server signing key magic constant");
                this.f1196r = m885a(bArrM595c, "session key to server-to-client signing key magic constant");
                if (f1180b.mo4539c()) {
                    f1180b.mo4534b("Sign key is " + C0284e.m948a(this.f1195q));
                    f1180b.mo4534b("Verify key is " + C0284e.m948a(this.f1196r));
                }
                this.f1197s = m885a(bArrM595c, "session key to client-to-server sealing key magic constant");
                this.f1199u = C0281b.m937b(this.f1197s);
                if (f1180b.mo4539c()) {
                    f1180b.mo4534b("Seal key is " + C0284e.m948a(this.f1197s));
                }
                this.f1198t = m885a(bArrM595c, "session key to server-to-client sealing key magic constant");
                this.f1200v = C0281b.m937b(this.f1198t);
                if (f1180b.mo4539c()) {
                    f1180b.mo4534b("Server seal key is " + C0284e.m948a(this.f1198t));
                }
            }
            this.f1184f = true;
            this.f1191m++;
            return bArrM596d;
        } catch (C0214ad e) {
            throw e;
        } catch (Exception e2) {
            throw new C0214ad(e2.getMessage(), e2);
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m885a(byte[] bArr, String str) {
        MessageDigest messageDigestM936b = C0281b.m936b();
        messageDigestM936b.update(bArr);
        messageDigestM936b.update(str.getBytes(StandardCharsets.US_ASCII));
        messageDigestM936b.update((byte) 0);
        return messageDigestM936b.digest();
    }

    @Override // p000a.p029g.InterfaceC0266z
    /* JADX INFO: renamed from: f */
    public final boolean mo845f() {
        return true;
    }

    @Override // p000a.p029g.InterfaceC0266z
    /* JADX INFO: renamed from: g */
    public final boolean mo846g() {
        return (this.f1195q == null || this.f1196r == null) ? false : true;
    }

    @Override // p000a.p029g.InterfaceC0266z
    /* JADX INFO: renamed from: a */
    public final byte[] mo837a(byte[] bArr) throws C0044d {
        byte[] bArr2 = this.f1195q;
        if (bArr2 == null) {
            throw new C0044d("Signing is not initialized");
        }
        int andIncrement = this.f1189k.getAndIncrement();
        byte[] bArr3 = new byte[4];
        C0173a.m512b(andIncrement, bArr3, 0);
        MessageDigest messageDigestM935a = C0281b.m935a(bArr2);
        messageDigestM935a.update(bArr3);
        messageDigestM935a.update(bArr);
        byte[] bArrDigest = messageDigestM935a.digest();
        byte[] bArrDoFinal = new byte[8];
        System.arraycopy(bArrDigest, 0, bArrDoFinal, 0, 8);
        if (f1180b.mo4539c()) {
            f1180b.mo4534b("Digest " + C0284e.m948a(bArrDigest));
            f1180b.mo4534b("Truncated " + C0284e.m948a(bArrDoFinal));
        }
        if ((this.f1182d & 1073741824) != 0) {
            try {
                bArrDoFinal = this.f1199u.doFinal(bArrDoFinal);
                if (f1180b.mo4539c()) {
                    f1180b.mo4534b("Encrypted " + C0284e.m948a(bArrDoFinal));
                }
            } catch (GeneralSecurityException e) {
                throw new C0044d("Failed to encrypt MIC", e);
            }
        }
        byte[] bArr4 = new byte[16];
        C0173a.m512b(1L, bArr4, 0);
        System.arraycopy(bArrDoFinal, 0, bArr4, 4, 8);
        C0173a.m512b(andIncrement, bArr4, 12);
        return bArr4;
    }

    @Override // p000a.p029g.InterfaceC0266z
    /* JADX INFO: renamed from: a */
    public final void mo835a(byte[] bArr, byte[] bArr2) throws C0044d {
        byte[] bArr3 = this.f1196r;
        if (bArr3 == null) {
            throw new C0044d("Signing is not initialized");
        }
        int iM511b = C0173a.m511b(bArr2, 0);
        if (iM511b != 1) {
            throw new C0240bc("Invalid signature version");
        }
        MessageDigest messageDigestM935a = C0281b.m935a(bArr3);
        int iM511b2 = C0173a.m511b(bArr2, 12);
        messageDigestM935a.update(bArr2, 12, 4);
        byte[] bArrDigest = messageDigestM935a.digest(bArr);
        byte[] bArrM4078a = C1535a.m4078a(bArrDigest, 8);
        if (f1180b.mo4539c()) {
            f1180b.mo4534b("Digest " + C0284e.m948a(bArrDigest));
            f1180b.mo4534b("Truncated " + C0284e.m948a(bArrM4078a));
        }
        boolean z = (this.f1182d & 1073741824) != 0;
        if (z) {
            try {
                bArrM4078a = this.f1200v.doFinal(bArrM4078a);
                if (f1180b.mo4539c()) {
                    f1180b.mo4534b("Decrypted " + C0284e.m948a(bArrM4078a));
                }
            } catch (GeneralSecurityException e) {
                throw new C0044d("Failed to decrypt MIC", e);
            }
        }
        int andIncrement = this.f1190l.getAndIncrement();
        if (andIncrement != iM511b2) {
            throw new C0044d(String.format("Invalid MIC sequence, expect %d have %d", Integer.valueOf(andIncrement), Integer.valueOf(iM511b2)));
        }
        byte[] bArr4 = new byte[8];
        System.arraycopy(bArr2, 4, bArr4, 0, 8);
        if (!MessageDigest.isEqual(bArrM4078a, bArr4)) {
            if (f1180b.mo4539c()) {
                f1180b.mo4534b(String.format("Seq = %d ver = %d encrypted = %s", Integer.valueOf(iM511b2), Integer.valueOf(iM511b), Boolean.valueOf(z)));
                f1180b.mo4534b(String.format("Expected MIC %s != %s", C0284e.m948a(bArrM4078a), C0284e.m948a(bArr4)));
            }
            throw new C0044d("Invalid MIC");
        }
    }
}
