package a.d.d;

import a.d.d.a.q;
import a.d.h;
import a.i.e;
import java.security.MessageDigest;
import java.util.Date;

/* JADX INFO: compiled from: SMB1SigningDigest.java */
/* JADX INFO: loaded from: classes.dex */
public class b implements h {
    private static final org.c.b a = org.c.c.a((Class<?>) b.class);
    private MessageDigest b;
    private byte[] c;
    private boolean d;
    private int e;
    private int f;

    public b(byte[] bArr) {
        this(bArr, (byte) 0);
    }

    private b(byte[] bArr, byte b) {
        this.d = false;
        this.b = a.i.b.b();
        this.c = bArr;
        this.f = 0;
        this.d = false;
        if (a.b()) {
            a.a("macSigningKey:");
            a.a(e.a(bArr, 0, bArr.length));
        }
    }

    public b(byte[] bArr, char c) {
        this.d = false;
        this.b = a.i.b.b();
        this.c = bArr;
    }

    public b(byte[] bArr, short s) {
        this.d = false;
        this.b = a.i.b.b();
        this.c = bArr;
        this.f = 2;
    }

    private void a(byte[] bArr, int i, int i2) {
        if (a.b()) {
            a.a("update: " + this.e + " " + i + ":" + i2);
            a.a(e.a(bArr, i, Math.min(i2, 256)));
        }
        if (i2 != 0) {
            this.b.update(bArr, i, i2);
            this.e++;
        }
    }

    private byte[] a() {
        byte[] bArrDigest = this.b.digest();
        if (a.b()) {
            a.a("digest: ");
            a.a(e.a(bArrDigest, 0, bArrDigest.length));
        }
        this.e = 0;
        return bArrDigest;
    }

    public final void a(byte[] bArr, int i, int i2, a.d.b bVar, a.d.b bVar2) {
        if (a.b()) {
            a.a("Signing with seq " + this.f);
        }
        ((c) bVar).i(this.f);
        if (bVar2 != null) {
            ((c) bVar2).i(this.f + 1);
        }
        try {
            try {
                a(this.c, 0, this.c.length);
                int i3 = i + 14;
                for (int i4 = 0; i4 < 8; i4++) {
                    bArr[i3 + i4] = 0;
                }
                a.d.f.a.b(this.f, bArr, i3);
                a(bArr, i, i2);
                System.arraycopy(a(), 0, bArr, i3, 8);
                if (this.d) {
                    this.d = false;
                    System.arraycopy("BSRSPYL ".getBytes(), 0, bArr, i3, 8);
                }
                if (bVar instanceof a.d.d.c.a.b) {
                    this.f++;
                } else {
                    this.f += 2;
                }
            } catch (Exception e) {
                a.e("Signature failed", e);
                if (bVar instanceof a.d.d.c.a.b) {
                    this.f++;
                } else {
                    this.f += 2;
                }
            }
        } catch (Throwable th) {
            if (bVar instanceof a.d.d.c.a.b) {
                this.f++;
            } else {
                this.f += 2;
            }
            throw th;
        }
    }

    public final boolean a(byte[] bArr, a.d.b bVar) {
        c cVar = (c) bVar;
        if ((cVar.y() & 4) == 0) {
            a.d("Expected signed response, but is not signed");
            return false;
        }
        a(this.c, 0, this.c.length);
        a(bArr, 4, 14);
        byte[] bArr2 = new byte[8];
        a.d.f.a.b(cVar.M(), bArr2, 0);
        a(bArr2, 0, 8);
        if (cVar.c() == 46) {
            q qVar = (q) cVar;
            a(bArr, 26, ((cVar.v() - qVar.Y()) - 14) - 8);
            a(qVar.W(), qVar.X(), qVar.Y());
        } else {
            a(bArr, 26, (cVar.v() - 14) - 8);
        }
        byte[] bArrA = a();
        for (int i = 0; i < 8; i++) {
            if (bArrA[i] != bArr[i + 18]) {
                if (a.c()) {
                    a.b("signature verification failure");
                    a.b("Expect: " + e.a(bArrA, 0, 8));
                    a.b("Have: " + e.a(bArr, 18, 8));
                }
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MacSigningKey=" + e.a(this.c, 0, this.c.length);
    }

    public static void a(a.h hVar, long j, byte[] bArr, int i) {
        if (j == 0 || j == -1) {
            a.d.f.a.b(-1L, bArr, i);
            return;
        }
        if (hVar.P().inDaylightTime(new Date())) {
            if (!hVar.P().inDaylightTime(new Date(j))) {
                j -= 3600000;
            }
        } else if (hVar.P().inDaylightTime(new Date(j))) {
            j += 3600000;
        }
        a.d.f.a.b((int) (j / 1000), bArr, i);
    }
}
