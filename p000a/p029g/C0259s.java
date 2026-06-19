package p000a.p029g;

import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.Principal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import org.bouncycastle.p054a.C0653p;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.InterfaceC0016c;
import p000a.InterfaceC0272i;
import p000a.p030h.C0268a;
import p000a.p031i.C0281b;
import p000a.p031i.C0285f;

/* JADX INFO: renamed from: a.g.s */
/* JADX INFO: compiled from: NtlmPasswordAuthenticator.java */
/* JADX INFO: loaded from: classes.dex */
public class C0259s implements InterfaceC0237b, Serializable, Principal {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f1205a = C1620c.m4563a((Class<?>) C0259s.class);

    /* JADX INFO: renamed from: b */
    private String f1206b;

    /* JADX INFO: renamed from: c */
    private String f1207c;

    /* JADX INFO: renamed from: d */
    private String f1208d;

    /* JADX INFO: renamed from: e */
    private byte[] f1209e;

    public C0259s() {
        this.f1209e = null;
        this.f1206b = "";
        this.f1207c = "";
        this.f1208d = "";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0259s(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            r2 = 0
            r3.<init>()
            r0 = 0
            r3.f1209e = r0
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
            r3.f1206b = r0
            if (r1 == 0) goto L43
            r0 = r1
        L24:
            r3.f1207c = r0
            if (r6 == 0) goto L46
        L28:
            r3.f1208d = r6
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
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0259s.<init>(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // p000a.InterfaceC0272i
    /* JADX INFO: renamed from: a */
    public final <T extends InterfaceC0272i> T mo897a(Class<T> cls) {
        if (cls.isAssignableFrom(getClass())) {
            return this;
        }
        return null;
    }

    @Override // p000a.p029g.InterfaceC0237b
    /* JADX INFO: renamed from: a */
    public final InterfaceC0266z mo804a(InterfaceC0016c interfaceC0016c, String str, byte[] bArr, boolean z) throws C0214ad {
        if (interfaceC0016c.mo114a().mo8C()) {
            return m894a(interfaceC0016c, str, new C0257q(interfaceC0016c, this, z));
        }
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    C0268a c0268a = new C0268a(bArr);
                    if (f1205a.mo4539c()) {
                        f1205a.mo4534b("Have initial token ".concat(String.valueOf(c0268a)));
                    }
                    if (c0268a.m916a() != null && !new HashSet(Arrays.asList(c0268a.m916a())).contains(C0257q.f1179a)) {
                        throw new C0240bc("Server does not support NTLM authentication");
                    }
                }
            } catch (C0214ad e) {
                throw e;
            } catch (IOException e2) {
                f1205a.mo4535b("Ignoring invalid initial token", e2);
            }
        }
        return new C0241bd(interfaceC0016c.mo114a(), m894a(interfaceC0016c, str, new C0257q(interfaceC0016c, this, z)));
    }

    /* JADX INFO: renamed from: a */
    private static InterfaceC0266z m894a(InterfaceC0016c interfaceC0016c, String str, C0257q c0257q) {
        if (str != null && interfaceC0016c.mo114a().mo52aq()) {
            c0257q.m887a(String.format("cifs/%s", str));
        }
        return c0257q;
    }

    @Override // 
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C0259s clone() {
        C0259s c0259s = new C0259s();
        m895a(c0259s, this);
        return c0259s;
    }

    /* JADX INFO: renamed from: a */
    protected static void m895a(C0259s c0259s, C0259s c0259s2) {
        c0259s.f1206b = c0259s2.f1206b;
        c0259s.f1207c = c0259s2.f1207c;
        c0259s.f1208d = c0259s2.f1208d;
    }

    @Override // p000a.InterfaceC0272i
    /* JADX INFO: renamed from: a */
    public final String mo898a() {
        return this.f1206b;
    }

    /* JADX INFO: renamed from: f */
    public final String m900f() {
        return this.f1207c;
    }

    /* JADX INFO: renamed from: g */
    public final String m901g() {
        return this.f1208d;
    }

    @Override // java.security.Principal
    public String getName() {
        return this.f1206b != null && this.f1206b.length() > 0 ? this.f1206b + "\\" + this.f1207c : this.f1207c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0259s)) {
            return false;
        }
        C0259s c0259s = (C0259s) obj;
        return Objects.equals(c0259s.f1206b != null ? c0259s.f1206b.toUpperCase() : null, this.f1206b != null ? this.f1206b.toUpperCase() : null) && c0259s.f1207c.equalsIgnoreCase(this.f1207c) && Objects.equals(this.f1208d, c0259s.f1208d);
    }

    @Override // java.security.Principal
    public int hashCode() {
        return getName().toUpperCase().hashCode();
    }

    @Override // java.security.Principal
    public String toString() {
        return getName();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m902h() {
        return "GUEST".equalsIgnoreCase(this.f1207c);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m896a(C0653p c0653p) {
        return C0257q.f1179a.equals(c0653p);
    }

    /* JADX INFO: renamed from: a */
    public byte[] mo890a(InterfaceC0016c interfaceC0016c, byte[] bArr) {
        switch (interfaceC0016c.mo114a().mo7B()) {
            case 3:
            case 4:
            case 5:
                if (this.f1209e == null) {
                    this.f1209e = new byte[8];
                    interfaceC0016c.mo114a().mo33a().nextBytes(this.f1209e);
                }
                break;
        }
        return C0260t.m903a(interfaceC0016c, this.f1208d, bArr);
    }

    /* JADX INFO: renamed from: b */
    public byte[] mo891b(InterfaceC0016c interfaceC0016c, byte[] bArr) {
        switch (interfaceC0016c.mo114a().mo7B()) {
        }
        return C0260t.m907a(this.f1208d, bArr);
    }

    /* JADX INFO: renamed from: a */
    public void mo889a(InterfaceC0016c interfaceC0016c, byte[] bArr, byte[] bArr2, int i) throws C0214ad {
        try {
            MessageDigest messageDigestM934a = C0281b.m934a();
            messageDigestM934a.update(C0285f.m952a(this.f1208d));
            switch (interfaceC0016c.mo114a().mo7B()) {
                case 0:
                case 1:
                case 2:
                    messageDigestM934a.update(messageDigestM934a.digest());
                    messageDigestM934a.digest(bArr2, i, 16);
                    return;
                case 3:
                case 4:
                case 5:
                    synchronized (this) {
                        if (this.f1209e == null) {
                            this.f1209e = new byte[8];
                            interfaceC0016c.mo114a().mo33a().nextBytes(this.f1209e);
                        }
                        break;
                    }
                    MessageDigest messageDigestM935a = C0281b.m935a(messageDigestM934a.digest());
                    messageDigestM935a.update(C0285f.m952a(this.f1207c.toUpperCase()));
                    messageDigestM935a.update(C0285f.m952a(this.f1206b.toUpperCase()));
                    byte[] bArrDigest = messageDigestM935a.digest();
                    MessageDigest messageDigestM935a2 = C0281b.m935a(bArrDigest);
                    messageDigestM935a2.update(bArr);
                    messageDigestM935a2.update(this.f1209e);
                    MessageDigest messageDigestM935a3 = C0281b.m935a(bArrDigest);
                    messageDigestM935a3.update(messageDigestM935a2.digest());
                    messageDigestM935a3.digest(bArr2, i, 16);
                    return;
                default:
                    messageDigestM934a.update(messageDigestM934a.digest());
                    messageDigestM934a.digest(bArr2, i, 16);
                    return;
            }
        } catch (Exception e) {
            throw new C0214ad("", e);
        }
        throw new C0214ad("", e);
    }

    @Override // p000a.InterfaceC0272i
    /* JADX INFO: renamed from: b */
    public final boolean mo899b() {
        return (this.f1206b == null || this.f1206b.isEmpty()) && (this.f1207c.isEmpty() || m902h()) && this.f1208d.isEmpty();
    }
}
