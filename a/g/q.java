package a.g;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: NtlmContext.java */
/* JADX INFO: loaded from: classes.dex */
public class q implements z {
    public static org.bouncycastle.a.p a;
    private static final org.c.b b = org.c.c.a((Class<?>) q.class);
    private s c;
    private String e;
    private final boolean j;
    private a.c n;
    private String o;
    private byte[] p;
    private byte[] q;
    private byte[] r;
    private byte[] s;
    private byte[] t;
    private Cipher u;
    private Cipher v;
    private boolean f = false;
    private byte[] g = null;
    private byte[] h = null;
    private String i = null;
    private final AtomicInteger k = new AtomicInteger(0);
    private final AtomicInteger l = new AtomicInteger(0);
    private int m = 1;
    private int d = ((this.d | 4) | 524288) | 536870912;
    private int d = ((this.d | 4) | 524288) | 536870912;

    static {
        try {
            a = new org.bouncycastle.a.p("1.3.6.1.4.1.311.2.2.10");
        } catch (IllegalArgumentException e) {
            b.e("Failed to parse OID", e);
        }
    }

    public q(a.c cVar, s sVar, boolean z) {
        this.n = cVar;
        this.c = sVar;
        if (!sVar.b()) {
            this.d |= 1073774608;
        } else if (sVar.h()) {
            this.d |= 1073741824;
        } else {
            this.d |= 2048;
        }
        this.j = z;
        this.e = cVar.a().x();
    }

    @Override // a.g.z
    public final org.bouncycastle.a.p[] a() {
        return new org.bouncycastle.a.p[]{a};
    }

    public String toString() {
        String str;
        String str2;
        String str3 = "NtlmContext[auth=" + this.c + ",ntlmsspFlags=0x" + a.i.e.a(this.d, 8) + ",workstation=" + this.e + ",isEstablished=" + this.f + ",state=" + this.m + ",serverChallenge=";
        if (this.g == null) {
            str = str3 + "null";
        } else {
            str = str3 + a.i.e.a(this.g);
        }
        String str4 = str + ",signingKey=";
        if (this.h == null) {
            str2 = str4 + "null";
        } else {
            str2 = str4 + a.i.e.a(this.h);
        }
        return str2 + "]";
    }

    @Override // a.g.z
    public final int b() {
        return 0;
    }

    @Override // a.g.z
    public final boolean a(org.bouncycastle.a.p pVar) {
        return a.equals(pVar);
    }

    @Override // a.g.z
    public final boolean b(org.bouncycastle.a.p pVar) {
        return s.a(pVar);
    }

    @Override // a.g.z
    public final boolean c() {
        return this.f;
    }

    @Override // a.g.z
    public final byte[] d() {
        return this.h;
    }

    @Override // a.g.z
    public final String e() {
        return this.i;
    }

    public final void a(String str) {
        this.o = str;
    }

    @Override // a.g.z
    public final byte[] a(byte[] bArr, int i) throws ad {
        switch (this.m) {
            case 1:
                a.f.b bVar = new a.f.b(this.n, this.d, this.c.a(), this.e);
                byte[] bArrC = bVar.c();
                this.p = bArrC;
                if (b.b()) {
                    b.a(bVar.toString());
                    b.a(a.i.e.a(bArrC));
                }
                this.m++;
                return bArrC;
            case 2:
                return b(bArr);
            default:
                throw new ad("Invalid state");
        }
    }

    private byte[] b(byte[] bArr) throws ad {
        try {
            a.f.c cVar = new a.f.c(bArr);
            if (b.b()) {
                b.a(cVar.toString());
                b.a(a.i.e.a(bArr));
            }
            this.g = cVar.c();
            if (this.j) {
                if (this.n.a().ap() && (!cVar.b(1073741824) || !cVar.b(524288))) {
                    throw new bc("Server does not support extended NTLMv2 key exchange");
                }
                if (!cVar.b(536870912)) {
                    throw new bc("Server does not support 128-bit keys");
                }
            }
            this.d &= cVar.a();
            a.f.d dVar = new a.f.d(this.n, cVar, this.o, this.c.h() ? "invalid" : this.c.g(), this.c.h() ? null : this.c.a(), this.c.h() ? "GUEST" : this.c.f(), this.e, this.d, this.c.b() ? false : true);
            dVar.a(this.p, bArr);
            byte[] bArrD = dVar.d();
            if (b.b()) {
                b.a(dVar.toString());
                b.a(a.i.e.a(bArr));
            }
            this.h = dVar.c();
            if (this.h != null && (this.d & 524288) != 0) {
                byte[] bArrC = dVar.c();
                this.q = a(bArrC, "session key to client-to-server signing key magic constant");
                this.r = a(bArrC, "session key to server-to-client signing key magic constant");
                if (b.c()) {
                    b.b("Sign key is " + a.i.e.a(this.q));
                    b.b("Verify key is " + a.i.e.a(this.r));
                }
                this.s = a(bArrC, "session key to client-to-server sealing key magic constant");
                this.u = a.i.b.b(this.s);
                if (b.c()) {
                    b.b("Seal key is " + a.i.e.a(this.s));
                }
                this.t = a(bArrC, "session key to server-to-client sealing key magic constant");
                this.v = a.i.b.b(this.t);
                if (b.c()) {
                    b.b("Server seal key is " + a.i.e.a(this.t));
                }
            }
            this.f = true;
            this.m++;
            return bArrD;
        } catch (ad e) {
            throw e;
        } catch (Exception e2) {
            throw new ad(e2.getMessage(), e2);
        }
    }

    private static byte[] a(byte[] bArr, String str) {
        MessageDigest messageDigestB = a.i.b.b();
        messageDigestB.update(bArr);
        messageDigestB.update(str.getBytes(StandardCharsets.US_ASCII));
        messageDigestB.update((byte) 0);
        return messageDigestB.digest();
    }

    @Override // a.g.z
    public final boolean f() {
        return true;
    }

    @Override // a.g.z
    public final boolean g() {
        return (this.q == null || this.r == null) ? false : true;
    }

    @Override // a.g.z
    public final byte[] a(byte[] bArr) throws a.d {
        byte[] bArr2 = this.q;
        if (bArr2 == null) {
            throw new a.d("Signing is not initialized");
        }
        int andIncrement = this.k.getAndIncrement();
        byte[] bArr3 = new byte[4];
        a.d.f.a.b(andIncrement, bArr3, 0);
        MessageDigest messageDigestA = a.i.b.a(bArr2);
        messageDigestA.update(bArr3);
        messageDigestA.update(bArr);
        byte[] bArrDigest = messageDigestA.digest();
        byte[] bArrDoFinal = new byte[8];
        System.arraycopy(bArrDigest, 0, bArrDoFinal, 0, 8);
        if (b.c()) {
            b.b("Digest " + a.i.e.a(bArrDigest));
            b.b("Truncated " + a.i.e.a(bArrDoFinal));
        }
        if ((this.d & 1073741824) != 0) {
            try {
                bArrDoFinal = this.u.doFinal(bArrDoFinal);
                if (b.c()) {
                    b.b("Encrypted " + a.i.e.a(bArrDoFinal));
                }
            } catch (GeneralSecurityException e) {
                throw new a.d("Failed to encrypt MIC", e);
            }
        }
        byte[] bArr4 = new byte[16];
        a.d.f.a.b(1L, bArr4, 0);
        System.arraycopy(bArrDoFinal, 0, bArr4, 4, 8);
        a.d.f.a.b(andIncrement, bArr4, 12);
        return bArr4;
    }

    @Override // a.g.z
    public final void a(byte[] bArr, byte[] bArr2) throws a.d {
        byte[] bArr3 = this.r;
        if (bArr3 == null) {
            throw new a.d("Signing is not initialized");
        }
        int iB = a.d.f.a.b(bArr2, 0);
        if (iB != 1) {
            throw new bc("Invalid signature version");
        }
        MessageDigest messageDigestA = a.i.b.a(bArr3);
        int iB2 = a.d.f.a.b(bArr2, 12);
        messageDigestA.update(bArr2, 12, 4);
        byte[] bArrDigest = messageDigestA.digest(bArr);
        byte[] bArrA = org.bouncycastle.f.a.a(bArrDigest, 8);
        if (b.c()) {
            b.b("Digest " + a.i.e.a(bArrDigest));
            b.b("Truncated " + a.i.e.a(bArrA));
        }
        boolean z = (this.d & 1073741824) != 0;
        if (z) {
            try {
                bArrA = this.v.doFinal(bArrA);
                if (b.c()) {
                    b.b("Decrypted " + a.i.e.a(bArrA));
                }
            } catch (GeneralSecurityException e) {
                throw new a.d("Failed to decrypt MIC", e);
            }
        }
        int andIncrement = this.l.getAndIncrement();
        if (andIncrement != iB2) {
            throw new a.d(String.format("Invalid MIC sequence, expect %d have %d", Integer.valueOf(andIncrement), Integer.valueOf(iB2)));
        }
        byte[] bArr4 = new byte[8];
        System.arraycopy(bArr2, 4, bArr4, 0, 8);
        if (!MessageDigest.isEqual(bArrA, bArr4)) {
            if (b.c()) {
                b.b(String.format("Seq = %d ver = %d encrypted = %s", Integer.valueOf(iB2), Integer.valueOf(iB), Boolean.valueOf(z)));
                b.b(String.format("Expected MIC %s != %s", a.i.e.a(bArrA), a.i.e.a(bArr4)));
            }
            throw new a.d("Invalid MIC");
        }
    }
}
