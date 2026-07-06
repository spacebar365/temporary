package a.g;

import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.Principal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: compiled from: NtlmPasswordAuthenticator.java */
/* JADX INFO: loaded from: classes.dex */
public class s implements b, Serializable, Principal {
    private static final org.c.b a = org.c.c.a((Class<?>) s.class);
    private String b;
    private String c;
    private String d;
    private byte[] e;

    @Override // a.g.b
    public /* synthetic */ b c() {
        return e();
    }

    public /* synthetic */ Object clone() {
        return e();
    }

    public s() {
        this.e = null;
        this.b = "";
        this.c = "";
        this.d = "";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            r2 = 0
            r3.<init>()
            r0 = 0
            r3.e = r0
            if (r5 == 0) goto L49
            r0 = 64
            int r0 = r5.indexOf(r0)
            if (r0 <= 0) goto L2b
            int r1 = r0 + 1
            java.lang.String r4 = r5.substring(r1)
            java.lang.String r5 = r5.substring(r2, r0)
            r1 = r5
            r0 = r4
        L1d:
            if (r0 == 0) goto L40
        L1f:
            r3.b = r0
            if (r1 == 0) goto L43
            r0 = r1
        L24:
            r3.c = r0
            if (r6 == 0) goto L46
        L28:
            r3.d = r6
            return
        L2b:
            r0 = 92
            int r0 = r5.indexOf(r0)
            if (r0 <= 0) goto L49
            java.lang.String r4 = r5.substring(r2, r0)
            int r0 = r0 + 1
            java.lang.String r5 = r5.substring(r0)
            r1 = r5
            r0 = r4
            goto L1d
        L40:
            java.lang.String r0 = ""
            goto L1f
        L43:
            java.lang.String r0 = ""
            goto L24
        L46:
            java.lang.String r6 = ""
            goto L28
        L49:
            r1 = r5
            r0 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.s.<init>(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // a.i
    public final <T extends a.i> T a(Class<T> cls) {
        if (cls.isAssignableFrom(getClass())) {
            return this;
        }
        return null;
    }

    @Override // a.g.b
    public final z a(a.c cVar, String str, byte[] bArr, boolean z) throws ad {
        if (cVar.a().C()) {
            return a(cVar, str, new q(cVar, this, z));
        }
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    a.h.a aVar = new a.h.a(bArr);
                    if (a.c()) {
                        a.b("Have initial token ".concat(String.valueOf(aVar)));
                    }
                    if (aVar.a() != null && !new HashSet(Arrays.asList(aVar.a())).contains(q.a)) {
                        throw new bc("Server does not support NTLM authentication");
                    }
                }
            } catch (ad e) {
                throw e;
            } catch (IOException e2) {
                a.b("Ignoring invalid initial token", e2);
            }
        }
        return new bd(cVar.a(), a(cVar, str, new q(cVar, this, z)));
    }

    private static z a(a.c cVar, String str, q qVar) {
        if (str != null && cVar.a().aq()) {
            qVar.a(String.format("cifs/%s", str));
        }
        return qVar;
    }

    public s e() {
        s sVar = new s();
        a(sVar, this);
        return sVar;
    }

    protected static void a(s sVar, s sVar2) {
        sVar.b = sVar2.b;
        sVar.c = sVar2.c;
        sVar.d = sVar2.d;
    }

    @Override // a.i
    public final String a() {
        return this.b;
    }

    public final String f() {
        return this.c;
    }

    public final String g() {
        return this.d;
    }

    @Override // java.security.Principal
    public String getName() {
        return this.b != null && this.b.length() > 0 ? this.b + "\\" + this.c : this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Objects.equals(sVar.b != null ? sVar.b.toUpperCase() : null, this.b != null ? this.b.toUpperCase() : null) && sVar.c.equalsIgnoreCase(this.c) && Objects.equals(this.d, sVar.d);
    }

    @Override // java.security.Principal
    public int hashCode() {
        return getName().toUpperCase().hashCode();
    }

    @Override // java.security.Principal
    public String toString() {
        return getName();
    }

    public final boolean h() {
        return "GUEST".equalsIgnoreCase(this.c);
    }

    public static boolean a(org.bouncycastle.a.p pVar) {
        return q.a.equals(pVar);
    }

    public byte[] a(a.c cVar, byte[] bArr) {
        switch (cVar.a().B()) {
            case 3:
            case 4:
            case 5:
                if (this.e == null) {
                    this.e = new byte[8];
                    cVar.a().a().nextBytes(this.e);
                }
                break;
        }
        return t.a(cVar, this.d, bArr);
    }

    public byte[] b(a.c cVar, byte[] bArr) {
        switch (cVar.a().B()) {
        }
        return t.a(this.d, bArr);
    }

    public void a(a.c cVar, byte[] bArr, byte[] bArr2, int i) throws ad {
        try {
            MessageDigest messageDigestA = a.i.b.a();
            messageDigestA.update(a.i.f.a(this.d));
            switch (cVar.a().B()) {
                case 0:
                case 1:
                case 2:
                    messageDigestA.update(messageDigestA.digest());
                    messageDigestA.digest(bArr2, i, 16);
                    return;
                case 3:
                case 4:
                case 5:
                    synchronized (this) {
                        if (this.e == null) {
                            this.e = new byte[8];
                            cVar.a().a().nextBytes(this.e);
                        }
                        break;
                    }
                    MessageDigest messageDigestA2 = a.i.b.a(messageDigestA.digest());
                    messageDigestA2.update(a.i.f.a(this.c.toUpperCase()));
                    messageDigestA2.update(a.i.f.a(this.b.toUpperCase()));
                    byte[] bArrDigest = messageDigestA2.digest();
                    MessageDigest messageDigestA3 = a.i.b.a(bArrDigest);
                    messageDigestA3.update(bArr);
                    messageDigestA3.update(this.e);
                    MessageDigest messageDigestA4 = a.i.b.a(bArrDigest);
                    messageDigestA4.update(messageDigestA3.digest());
                    messageDigestA4.digest(bArr2, i, 16);
                    return;
                default:
                    messageDigestA.update(messageDigestA.digest());
                    messageDigestA.digest(bArr2, i, 16);
                    return;
            }
        } catch (Exception e) {
            throw new ad("", e);
        }
        throw new ad("", e);
    }

    @Override // a.i
    public final boolean b() {
        return (this.b == null || this.b.isEmpty()) && (this.c.isEmpty() || h()) && this.d.isEmpty();
    }
}
