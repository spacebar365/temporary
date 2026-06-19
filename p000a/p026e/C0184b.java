package p000a.p026e;

import p000a.InterfaceC0267h;
import p000a.InterfaceC0293q;
import p000a.p031i.C0284e;
import p000a.p031i.C0285f;

/* JADX INFO: renamed from: a.e.b */
/* JADX INFO: compiled from: Name.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0184b implements InterfaceC0293q {

    /* JADX INFO: renamed from: a */
    public String f826a;

    /* JADX INFO: renamed from: b */
    public String f827b;

    /* JADX INFO: renamed from: c */
    public int f828c;

    /* JADX INFO: renamed from: d */
    int f829d;

    /* JADX INFO: renamed from: e */
    private InterfaceC0267h f830e;

    C0184b(InterfaceC0267h interfaceC0267h) {
        this.f830e = interfaceC0267h;
    }

    @Override // p000a.InterfaceC0293q
    /* JADX INFO: renamed from: a */
    public final String mo528a() {
        return this.f826a;
    }

    @Override // p000a.InterfaceC0293q
    /* JADX INFO: renamed from: b */
    public final String mo529b() {
        return this.f827b;
    }

    @Override // p000a.InterfaceC0293q
    /* JADX INFO: renamed from: c */
    public final int mo530c() {
        return this.f828c;
    }

    public C0184b(InterfaceC0267h interfaceC0267h, String str, int i, String str2) {
        this.f830e = interfaceC0267h;
        this.f826a = (str.length() > 15 ? str.substring(0, 15) : str).toUpperCase();
        this.f828c = i;
        this.f827b = (str2 == null || str2.length() <= 0) ? interfaceC0267h.mo30Y() : str2;
        this.f829d = 0;
    }

    public C0184b(InterfaceC0267h interfaceC0267h, InterfaceC0293q interfaceC0293q) {
        this.f830e = interfaceC0267h;
        this.f826a = interfaceC0293q.mo528a();
        this.f828c = interfaceC0293q.mo530c();
        this.f827b = interfaceC0293q.mo529b();
        if (interfaceC0293q instanceof C0184b) {
            this.f829d = ((C0184b) interfaceC0293q).f829d;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m531d() {
        return "0.0.0.0".equals(this.f826a) && this.f828c == 0 && this.f827b == null;
    }

    /* JADX INFO: renamed from: a */
    final int m527a(byte[] bArr, int i) {
        int length;
        bArr[i] = 32;
        byte[] bArrM953a = C0285f.m953a(this.f826a, this.f830e);
        int i2 = 0;
        while (i2 < bArrM953a.length) {
            bArr[(i2 * 2) + 1 + i] = (byte) (((bArrM953a[i2] & 240) >> 4) + 65);
            bArr[(i2 * 2) + 2 + i] = (byte) ((bArrM953a[i2] & 15) + 65);
            i2++;
        }
        while (i2 < 15) {
            bArr[(i2 * 2) + 1 + i] = 67;
            bArr[(i2 * 2) + 2 + i] = 65;
            i2++;
        }
        bArr[i + 31] = (byte) (((this.f828c & 240) >> 4) + 65);
        bArr[i + 31 + 1] = (byte) ((this.f828c & 15) + 65);
        int i3 = i + 33;
        if (this.f827b == null) {
            bArr[i3] = 0;
            length = 1;
        } else {
            int i4 = i3 + 1;
            bArr[i3] = 46;
            System.arraycopy(C0285f.m953a(this.f827b, this.f830e), 0, bArr, i4, this.f827b.length());
            int length2 = this.f827b.length() + i4;
            bArr[length2] = 0;
            int i5 = (length2 + 1) - 2;
            int length3 = i5 - this.f827b.length();
            int i6 = 0;
            while (true) {
                if (bArr[i5] == 46) {
                    bArr[i5] = (byte) i6;
                    i6 = 0;
                } else {
                    i6++;
                }
                int i7 = i5 - 1;
                if (i5 <= length3) {
                    break;
                }
                i5 = i7;
            }
            length = this.f827b.length() + 2;
        }
        return length + 33;
    }

    /* JADX INFO: renamed from: a */
    final int m526a(byte[] bArr) {
        int i;
        int i2;
        byte[] bArr2 = new byte[33];
        int i3 = 15;
        for (int i4 = 0; i4 < 15; i4++) {
            bArr2[i4] = (byte) (((bArr[((i4 * 2) + 1) + 12] & 255) - 65) << 4);
            bArr2[i4] = (byte) (bArr2[i4] | ((byte) (((bArr[((i4 * 2) + 2) + 12] & 255) - 65) & 15)));
            if (bArr2[i4] != 32) {
                i3 = i4 + 1;
            }
        }
        this.f826a = C0285f.m951a(bArr2, 0, i3, this.f830e);
        this.f828c = ((bArr[43] & 255) - 65) << 4;
        this.f828c |= ((bArr[44] & 255) - 65) & 15;
        int i5 = bArr[45] & 255;
        if (i5 == 0) {
            this.f827b = null;
            i2 = 1;
        } else {
            StringBuffer stringBuffer = new StringBuffer(C0285f.m951a(bArr, 46, i5, this.f830e));
            int i6 = i5 + 46;
            while (true) {
                i = i6 + 1;
                int i7 = bArr[i6] & 255;
                if (i7 == 0) {
                    break;
                }
                stringBuffer.append('.').append(C0285f.m951a(bArr, i, i7, this.f830e));
                i6 = i7 + i;
            }
            this.f827b = stringBuffer.toString();
            i2 = i - 45;
        }
        return i2 + 33;
    }

    public final int hashCode() {
        int iHashCode = this.f826a.hashCode() + (this.f828c * 65599) + (this.f829d * 65599);
        if (this.f827b != null && this.f827b.length() != 0) {
            return iHashCode + this.f827b.hashCode();
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0184b)) {
            return false;
        }
        C0184b c0184b = (C0184b) obj;
        return (this.f827b == null && c0184b.f827b == null) ? this.f826a.equals(c0184b.f826a) && this.f828c == c0184b.f828c : this.f826a.equals(c0184b.f826a) && this.f828c == c0184b.f828c && this.f827b.equals(c0184b.f827b);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = this.f826a;
        if (str == null) {
            str = "null";
        } else if (str.charAt(0) == 1) {
            char[] charArray = str.toCharArray();
            charArray[0] = '.';
            charArray[1] = '.';
            charArray[14] = '.';
            str = new String(charArray);
        }
        stringBuffer.append(str).append("<").append(C0284e.m947a(this.f828c, 2)).append(">");
        if (this.f827b != null) {
            stringBuffer.append(".").append(this.f827b);
        }
        return stringBuffer.toString();
    }
}
