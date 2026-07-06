package a.e;

import a.q;

/* JADX INFO: compiled from: Name.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements q {
    public String a;
    public String b;
    public int c;
    int d;
    private a.h e;

    b(a.h hVar) {
        this.e = hVar;
    }

    @Override // a.q
    public final String a() {
        return this.a;
    }

    @Override // a.q
    public final String b() {
        return this.b;
    }

    @Override // a.q
    public final int c() {
        return this.c;
    }

    public b(a.h hVar, String str, int i, String str2) {
        this.e = hVar;
        this.a = (str.length() > 15 ? str.substring(0, 15) : str).toUpperCase();
        this.c = i;
        this.b = (str2 == null || str2.length() <= 0) ? hVar.Y() : str2;
        this.d = 0;
    }

    public b(a.h hVar, q qVar) {
        this.e = hVar;
        this.a = qVar.a();
        this.c = qVar.c();
        this.b = qVar.b();
        if (qVar instanceof b) {
            this.d = ((b) qVar).d;
        }
    }

    public final boolean d() {
        return "0.0.0.0".equals(this.a) && this.c == 0 && this.b == null;
    }

    final int a(byte[] bArr, int i) {
        int length;
        bArr[i] = 32;
        byte[] bArrA = a.i.f.a(this.a, this.e);
        int i2 = 0;
        while (i2 < bArrA.length) {
            bArr[(i2 * 2) + 1 + i] = (byte) (((bArrA[i2] & 240) >> 4) + 65);
            bArr[(i2 * 2) + 2 + i] = (byte) ((bArrA[i2] & 15) + 65);
            i2++;
        }
        while (i2 < 15) {
            bArr[(i2 * 2) + 1 + i] = 67;
            bArr[(i2 * 2) + 2 + i] = 65;
            i2++;
        }
        bArr[i + 31] = (byte) (((this.c & 240) >> 4) + 65);
        bArr[i + 31 + 1] = (byte) ((this.c & 15) + 65);
        int i3 = i + 33;
        if (this.b == null) {
            bArr[i3] = 0;
            length = 1;
        } else {
            int i4 = i3 + 1;
            bArr[i3] = 46;
            System.arraycopy(a.i.f.a(this.b, this.e), 0, bArr, i4, this.b.length());
            int length2 = this.b.length() + i4;
            bArr[length2] = 0;
            int i5 = (length2 + 1) - 2;
            int length3 = i5 - this.b.length();
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
            length = this.b.length() + 2;
        }
        return length + 33;
    }

    final int a(byte[] bArr) {
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
        this.a = a.i.f.a(bArr2, 0, i3, this.e);
        this.c = ((bArr[43] & 255) - 65) << 4;
        this.c |= ((bArr[44] & 255) - 65) & 15;
        int i5 = bArr[45] & 255;
        if (i5 == 0) {
            this.b = null;
            i2 = 1;
        } else {
            StringBuffer stringBuffer = new StringBuffer(a.i.f.a(bArr, 46, i5, this.e));
            int i6 = i5 + 46;
            while (true) {
                i = i6 + 1;
                int i7 = bArr[i6] & 255;
                if (i7 == 0) {
                    break;
                }
                stringBuffer.append('.').append(a.i.f.a(bArr, i, i7, this.e));
                i6 = i7 + i;
            }
            this.b = stringBuffer.toString();
            i2 = i - 45;
        }
        return i2 + 33;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() + (this.c * 65599) + (this.d * 65599);
        if (this.b != null && this.b.length() != 0) {
            return iHashCode + this.b.hashCode();
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return (this.b == null && bVar.b == null) ? this.a.equals(bVar.a) && this.c == bVar.c : this.a.equals(bVar.a) && this.c == bVar.c && this.b.equals(bVar.b);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = this.a;
        if (str == null) {
            str = "null";
        } else if (str.charAt(0) == 1) {
            char[] charArray = str.toCharArray();
            charArray[0] = '.';
            charArray[1] = '.';
            charArray[14] = '.';
            str = new String(charArray);
        }
        stringBuffer.append(str).append("<").append(a.i.e.a(this.c, 2)).append(">");
        if (this.b != null) {
            stringBuffer.append(".").append(this.b);
        }
        return stringBuffer.toString();
    }
}
