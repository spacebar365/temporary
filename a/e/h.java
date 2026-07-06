package a.e;

import a.p;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: NbtAddress.java */
/* JADX INFO: loaded from: classes.dex */
public final class h implements p {
    public static final byte[] a = {0, 0, 0, 0, 0, 0};
    b b;
    int c;
    int d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    byte[] k;
    String l;

    h(b bVar, int i, boolean z, int i2) {
        this.b = bVar;
        this.c = i;
        this.e = z;
        this.d = i2;
    }

    h(b bVar, int i, boolean z, int i2, boolean z2, boolean z3, boolean z4, boolean z5, byte[] bArr) {
        this.b = bVar;
        this.c = i;
        this.e = z;
        this.d = i2;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.k = bArr;
        this.j = true;
    }

    @Override // a.a
    public final <T extends a.a> T a(Class<T> cls) {
        if (cls.isAssignableFrom(getClass())) {
            return this;
        }
        return null;
    }

    @Override // a.a
    public final String d() {
        this.l = this.b.a;
        if (Character.isDigit(this.l.charAt(0))) {
            int length = this.l.length();
            char[] charArray = this.l.toCharArray();
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                if (!Character.isDigit(charArray[i2])) {
                    break;
                }
                if (i3 != length || i != 3) {
                    if (i3 >= length || charArray[i3] != '.') {
                        i2 = i3;
                    } else {
                        i++;
                        i2 = i3 + 1;
                    }
                } else {
                    this.l = "*SMBSERVER     ";
                }
            }
        } else {
            switch (this.b.c) {
                case 27:
                case 28:
                case 29:
                    this.l = "*SMBSERVER     ";
                    break;
            }
        }
        return this.l;
    }

    @Override // a.a
    public final String a(a.c cVar) {
        if (this.l == this.b.a) {
            this.l = "*SMBSERVER     ";
        } else if ("*SMBSERVER     ".equals(this.l)) {
            try {
                p[] pVarArrA = cVar.b().a(this);
                if (this.b.c == 29) {
                    for (int i = 0; i < pVarArrA.length; i++) {
                        if (pVarArrA[i].e() == 32) {
                            return pVarArrA[i].a();
                        }
                    }
                    return null;
                }
                if (this.j) {
                    this.l = null;
                    return a();
                }
            } catch (UnknownHostException e) {
                this.l = null;
            }
        } else {
            this.l = null;
        }
        return this.l;
    }

    @Override // a.a
    public final String a() {
        return this.b.d() ? b() : this.b.a;
    }

    @Override // a.a
    public final String b() {
        return ((this.c >>> 24) & 255) + "." + ((this.c >>> 16) & 255) + "." + ((this.c >>> 8) & 255) + "." + ((this.c >>> 0) & 255);
    }

    @Override // a.p
    public final int e() {
        return this.b.c;
    }

    public final int hashCode() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof h) && ((h) obj).c == this.c;
    }

    public final String toString() {
        return this.b.toString() + "/" + b();
    }

    @Override // a.a
    public final InetAddress c() {
        return InetAddress.getByName(b());
    }
}
