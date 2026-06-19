package p000a.p026e;

import java.net.InetAddress;
import p000a.InterfaceC0000a;
import p000a.InterfaceC0016c;

/* JADX INFO: renamed from: a.e.n */
/* JADX INFO: compiled from: UniAddress.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0196n implements InterfaceC0000a {

    /* JADX INFO: renamed from: a */
    Object f917a;

    /* JADX INFO: renamed from: b */
    String f918b;

    /* JADX INFO: renamed from: a */
    public static boolean m573a(String str) {
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

    public C0196n(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        }
        this.f917a = obj;
    }

    public final int hashCode() {
        return this.f917a.hashCode();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0196n) && this.f917a.equals(((C0196n) obj).f917a);
    }

    @Override // p000a.InterfaceC0000a
    /* JADX INFO: renamed from: d */
    public final String mo5d() {
        if (this.f917a instanceof C0190h) {
            return ((C0190h) this.f917a).mo5d();
        }
        this.f918b = ((InetAddress) this.f917a).getHostName();
        if (m573a(this.f918b)) {
            this.f918b = "*SMBSERVER     ";
        } else {
            int iIndexOf = this.f918b.indexOf(46);
            if (iIndexOf > 1 && iIndexOf < 15) {
                this.f918b = this.f918b.substring(0, iIndexOf).toUpperCase();
            } else if (this.f918b.length() > 15) {
                this.f918b = "*SMBSERVER     ";
            } else {
                this.f918b = this.f918b.toUpperCase();
            }
        }
        return this.f918b;
    }

    @Override // p000a.InterfaceC0000a
    /* JADX INFO: renamed from: a */
    public final String mo2a(InterfaceC0016c interfaceC0016c) {
        if (this.f917a instanceof C0190h) {
            return ((C0190h) this.f917a).mo2a(interfaceC0016c);
        }
        if (this.f918b != "*SMBSERVER     ") {
            this.f918b = "*SMBSERVER     ";
            return this.f918b;
        }
        return null;
    }

    @Override // p000a.InterfaceC0000a
    /* JADX INFO: renamed from: a */
    public final String mo1a() {
        return this.f917a instanceof C0190h ? ((C0190h) this.f917a).mo1a() : ((InetAddress) this.f917a).getHostName();
    }

    @Override // p000a.InterfaceC0000a
    /* JADX INFO: renamed from: b */
    public final String mo3b() {
        return this.f917a instanceof C0190h ? ((C0190h) this.f917a).mo3b() : ((InetAddress) this.f917a).getHostAddress();
    }

    @Override // p000a.InterfaceC0000a
    /* JADX INFO: renamed from: c */
    public final InetAddress mo4c() {
        if (this.f917a instanceof InterfaceC0000a) {
            return ((InterfaceC0000a) this.f917a).mo4c();
        }
        if (this.f917a instanceof InetAddress) {
            return (InetAddress) this.f917a;
        }
        return null;
    }

    @Override // p000a.InterfaceC0000a
    /* JADX INFO: renamed from: a */
    public final <T extends InterfaceC0000a> T mo0a(Class<T> cls) {
        if (this.f917a instanceof InterfaceC0000a) {
            return (T) ((InterfaceC0000a) this.f917a).mo0a(cls);
        }
        if (!getClass().isAssignableFrom(cls)) {
            return null;
        }
        return this;
    }

    public final String toString() {
        return this.f917a.toString();
    }
}
