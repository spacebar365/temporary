package p000a.p006d.p010d;

import java.security.MessageDigest;
import java.util.Date;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.InterfaceC0267h;
import p000a.p006d.InterfaceC0051b;
import p000a.p006d.InterfaceC0176h;
import p000a.p006d.p010d.p011a.C0087q;
import p000a.p006d.p010d.p013c.p014a.C0106b;
import p000a.p006d.p025f.C0173a;
import p000a.p031i.C0281b;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.d.d.b */
/* JADX INFO: compiled from: SMB1SigningDigest.java */
/* JADX INFO: loaded from: classes.dex */
public class C0097b implements InterfaceC0176h {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f448a = C1620c.m4563a((Class<?>) C0097b.class);

    /* JADX INFO: renamed from: b */
    private MessageDigest f449b;

    /* JADX INFO: renamed from: c */
    private byte[] f450c;

    /* JADX INFO: renamed from: d */
    private boolean f451d;

    /* JADX INFO: renamed from: e */
    private int f452e;

    /* JADX INFO: renamed from: f */
    private int f453f;

    public C0097b(byte[] bArr) {
        this(bArr, (byte) 0);
    }

    private C0097b(byte[] bArr, byte b) {
        this.f451d = false;
        this.f449b = C0281b.m936b();
        this.f450c = bArr;
        this.f453f = 0;
        this.f451d = false;
        if (f448a.mo4536b()) {
            f448a.mo4532a("macSigningKey:");
            f448a.mo4532a(C0284e.m949a(bArr, 0, bArr.length));
        }
    }

    public C0097b(byte[] bArr, char c) {
        this.f451d = false;
        this.f449b = C0281b.m936b();
        this.f450c = bArr;
    }

    public C0097b(byte[] bArr, short s) {
        this.f451d = false;
        this.f449b = C0281b.m936b();
        this.f450c = bArr;
        this.f453f = 2;
    }

    /* JADX INFO: renamed from: a */
    private void m314a(byte[] bArr, int i, int i2) {
        if (f448a.mo4536b()) {
            f448a.mo4532a("update: " + this.f452e + " " + i + ":" + i2);
            f448a.mo4532a(C0284e.m949a(bArr, i, Math.min(i2, 256)));
        }
        if (i2 != 0) {
            this.f449b.update(bArr, i, i2);
            this.f452e++;
        }
    }

    /* JADX INFO: renamed from: a */
    private byte[] m315a() {
        byte[] bArrDigest = this.f449b.digest();
        if (f448a.mo4536b()) {
            f448a.mo4532a("digest: ");
            f448a.mo4532a(C0284e.m949a(bArrDigest, 0, bArrDigest.length));
        }
        this.f452e = 0;
        return bArrDigest;
    }

    /* JADX INFO: renamed from: a */
    public final void m316a(byte[] bArr, int i, int i2, InterfaceC0051b interfaceC0051b, InterfaceC0051b interfaceC0051b2) {
        if (f448a.mo4536b()) {
            f448a.mo4532a("Signing with seq " + this.f453f);
        }
        ((AbstractC0103c) interfaceC0051b).m367i(this.f453f);
        if (interfaceC0051b2 != null) {
            ((AbstractC0103c) interfaceC0051b2).m367i(this.f453f + 1);
        }
        try {
            try {
                m314a(this.f450c, 0, this.f450c.length);
                int i3 = i + 14;
                for (int i4 = 0; i4 < 8; i4++) {
                    bArr[i3 + i4] = 0;
                }
                C0173a.m512b(this.f453f, bArr, i3);
                m314a(bArr, i, i2);
                System.arraycopy(m315a(), 0, bArr, i3, 8);
                if (this.f451d) {
                    this.f451d = false;
                    System.arraycopy("BSRSPYL ".getBytes(), 0, bArr, i3, 8);
                }
                if (interfaceC0051b instanceof C0106b) {
                    this.f453f++;
                } else {
                    this.f453f += 2;
                }
            } catch (Exception e) {
                f448a.mo4544e("Signature failed", e);
                if (interfaceC0051b instanceof C0106b) {
                    this.f453f++;
                } else {
                    this.f453f += 2;
                }
            }
        } catch (Throwable th) {
            if (interfaceC0051b instanceof C0106b) {
                this.f453f++;
            } else {
                this.f453f += 2;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m317a(byte[] bArr, InterfaceC0051b interfaceC0051b) {
        AbstractC0103c abstractC0103c = (AbstractC0103c) interfaceC0051b;
        if ((abstractC0103c.m378y() & 4) == 0) {
            f448a.mo4540d("Expected signed response, but is not signed");
            return false;
        }
        m314a(this.f450c, 0, this.f450c.length);
        m314a(bArr, 4, 14);
        byte[] bArr2 = new byte[8];
        C0173a.m512b(abstractC0103c.m336M(), bArr2, 0);
        m314a(bArr2, 0, 8);
        if (abstractC0103c.mo216c() == 46) {
            C0087q c0087q = (C0087q) abstractC0103c;
            m314a(bArr, 26, ((abstractC0103c.m375v() - c0087q.m298Y()) - 14) - 8);
            m314a(c0087q.m296W(), c0087q.m297X(), c0087q.m298Y());
        } else {
            m314a(bArr, 26, (abstractC0103c.m375v() - 14) - 8);
        }
        byte[] bArrM315a = m315a();
        for (int i = 0; i < 8; i++) {
            if (bArrM315a[i] != bArr[i + 18]) {
                if (f448a.mo4539c()) {
                    f448a.mo4534b("signature verification failure");
                    f448a.mo4534b("Expect: " + C0284e.m949a(bArrM315a, 0, 8));
                    f448a.mo4534b("Have: " + C0284e.m949a(bArr, 18, 8));
                }
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MacSigningKey=" + C0284e.m949a(this.f450c, 0, this.f450c.length);
    }

    /* JADX INFO: renamed from: a */
    public static void m313a(InterfaceC0267h interfaceC0267h, long j, byte[] bArr, int i) {
        if (j == 0 || j == -1) {
            C0173a.m512b(-1L, bArr, i);
            return;
        }
        if (interfaceC0267h.mo21P().inDaylightTime(new Date())) {
            if (!interfaceC0267h.mo21P().inDaylightTime(new Date(j))) {
                j -= 3600000;
            }
        } else if (interfaceC0267h.mo21P().inDaylightTime(new Date(j))) {
            j += 3600000;
        }
        C0173a.m512b((int) (j / 1000), bArr, i);
    }
}
