package p000a.p026e;

import java.net.InetAddress;
import java.net.UnknownHostException;
import p000a.InterfaceC0000a;
import p000a.InterfaceC0016c;
import p000a.InterfaceC0292p;

/* JADX INFO: renamed from: a.e.h */
/* JADX INFO: compiled from: NbtAddress.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0190h implements InterfaceC0292p {

    /* JADX INFO: renamed from: a */
    public static final byte[] f894a = {0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: b */
    C0184b f895b;

    /* JADX INFO: renamed from: c */
    int f896c;

    /* JADX INFO: renamed from: d */
    int f897d;

    /* JADX INFO: renamed from: e */
    boolean f898e;

    /* JADX INFO: renamed from: f */
    boolean f899f;

    /* JADX INFO: renamed from: g */
    boolean f900g;

    /* JADX INFO: renamed from: h */
    boolean f901h;

    /* JADX INFO: renamed from: i */
    boolean f902i;

    /* JADX INFO: renamed from: j */
    boolean f903j;

    /* JADX INFO: renamed from: k */
    byte[] f904k;

    /* JADX INFO: renamed from: l */
    String f905l;

    C0190h(C0184b c0184b, int i, boolean z, int i2) {
        this.f895b = c0184b;
        this.f896c = i;
        this.f898e = z;
        this.f897d = i2;
    }

    C0190h(C0184b c0184b, int i, boolean z, int i2, boolean z2, boolean z3, boolean z4, boolean z5, byte[] bArr) {
        this.f895b = c0184b;
        this.f896c = i;
        this.f898e = z;
        this.f897d = i2;
        this.f899f = z2;
        this.f900g = z3;
        this.f901h = z4;
        this.f902i = z5;
        this.f904k = bArr;
        this.f903j = true;
    }

    @Override // p000a.InterfaceC0000a
    /* JADX INFO: renamed from: a */
    public final <T extends InterfaceC0000a> T mo0a(Class<T> cls) {
        if (cls.isAssignableFrom(getClass())) {
            return this;
        }
        return null;
    }

    @Override // p000a.InterfaceC0000a
    /* JADX INFO: renamed from: d */
    public final String mo5d() {
        this.f905l = this.f895b.f826a;
        if (Character.isDigit(this.f905l.charAt(0))) {
            int length = this.f905l.length();
            char[] charArray = this.f905l.toCharArray();
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
                    this.f905l = "*SMBSERVER     ";
                }
            }
        } else {
            switch (this.f895b.f828c) {
                case 27:
                case 28:
                case 29:
                    this.f905l = "*SMBSERVER     ";
                    break;
            }
        }
        return this.f905l;
    }

    @Override // p000a.InterfaceC0000a
    /* JADX INFO: renamed from: a */
    public final String mo2a(InterfaceC0016c interfaceC0016c) {
        if (this.f905l == this.f895b.f826a) {
            this.f905l = "*SMBSERVER     ";
        } else if ("*SMBSERVER     ".equals(this.f905l)) {
            try {
                InterfaceC0292p[] interfaceC0292pArrMo559a = interfaceC0016c.mo115b().mo559a(this);
                if (this.f895b.f828c == 29) {
                    for (int i = 0; i < interfaceC0292pArrMo559a.length; i++) {
                        if (interfaceC0292pArrMo559a[i].mo569e() == 32) {
                            return interfaceC0292pArrMo559a[i].mo1a();
                        }
                    }
                    return null;
                }
                if (this.f903j) {
                    this.f905l = null;
                    return mo1a();
                }
            } catch (UnknownHostException e) {
                this.f905l = null;
            }
        } else {
            this.f905l = null;
        }
        return this.f905l;
    }

    @Override // p000a.InterfaceC0000a
    /* JADX INFO: renamed from: a */
    public final String mo1a() {
        return this.f895b.m531d() ? mo3b() : this.f895b.f826a;
    }

    @Override // p000a.InterfaceC0000a
    /* JADX INFO: renamed from: b */
    public final String mo3b() {
        return ((this.f896c >>> 24) & 255) + "." + ((this.f896c >>> 16) & 255) + "." + ((this.f896c >>> 8) & 255) + "." + ((this.f896c >>> 0) & 255);
    }

    @Override // p000a.InterfaceC0292p
    /* JADX INFO: renamed from: e */
    public final int mo569e() {
        return this.f895b.f828c;
    }

    public final int hashCode() {
        return this.f896c;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof C0190h) && ((C0190h) obj).f896c == this.f896c;
    }

    public final String toString() {
        return this.f895b.toString() + "/" + mo3b();
    }

    @Override // p000a.InterfaceC0000a
    /* JADX INFO: renamed from: c */
    public final InetAddress mo4c() {
        return InetAddress.getByName(mo3b());
    }
}
