package a.e;

import java.net.InetAddress;

/* JADX INFO: compiled from: UniAddress.java */
/* JADX INFO: loaded from: classes.dex */
public final class n implements a.a {
    Object a;
    String b;

    public static boolean a(String str) {
        if (!Character.isDigit(str.charAt(0))) {
            return false;
        }
        int length = str.length();
        char[] charArray = str.toCharArray();
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!Character.isDigit(charArray[i2])) {
                return false;
            }
            if (i3 == length && i == 3) {
                return true;
            }
            if (i3 >= length || charArray[i3] != '.') {
                i2 = i3;
            } else {
                i++;
                i2 = i3 + 1;
            }
        }
        return false;
    }

    public n(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        }
        this.a = obj;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n) && this.a.equals(((n) obj).a);
    }

    @Override // a.a
    public final String d() {
        if (this.a instanceof h) {
            return ((h) this.a).d();
        }
        this.b = ((InetAddress) this.a).getHostName();
        if (a(this.b)) {
            this.b = "*SMBSERVER     ";
        } else {
            int iIndexOf = this.b.indexOf(46);
            if (iIndexOf > 1 && iIndexOf < 15) {
                this.b = this.b.substring(0, iIndexOf).toUpperCase();
            } else if (this.b.length() > 15) {
                this.b = "*SMBSERVER     ";
            } else {
                this.b = this.b.toUpperCase();
            }
        }
        return this.b;
    }

    @Override // a.a
    public final String a(a.c cVar) {
        if (this.a instanceof h) {
            return ((h) this.a).a(cVar);
        }
        if (this.b != "*SMBSERVER     ") {
            this.b = "*SMBSERVER     ";
            return this.b;
        }
        return null;
    }

    @Override // a.a
    public final String a() {
        return this.a instanceof h ? ((h) this.a).a() : ((InetAddress) this.a).getHostName();
    }

    @Override // a.a
    public final String b() {
        return this.a instanceof h ? ((h) this.a).b() : ((InetAddress) this.a).getHostAddress();
    }

    @Override // a.a
    public final InetAddress c() {
        if (this.a instanceof a.a) {
            return ((a.a) this.a).c();
        }
        if (this.a instanceof InetAddress) {
            return (InetAddress) this.a;
        }
        return null;
    }

    @Override // a.a
    public final <T extends a.a> T a(Class<T> cls) {
        if (this.a instanceof a.a) {
            return (T) ((a.a) this.a).a(cls);
        }
        if (!getClass().isAssignableFrom(cls)) {
            return null;
        }
        return this;
    }

    public final String toString() {
        return this.a.toString();
    }
}
