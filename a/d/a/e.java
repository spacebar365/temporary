package a.d.a;

import a.i.f;
import a.j;
import a.u;
import java.util.ArrayList;

/* JADX INFO: compiled from: Referral.java */
/* JADX INFO: loaded from: classes.dex */
public final class e implements j {
    int a;
    int b;
    int c;
    int d;
    int e;
    String f;
    int g;
    String h = null;
    String i = null;
    String j = null;
    String[] k = new String[0];

    @Override // a.j
    public final int a(byte[] bArr, int i, int i2) {
        this.a = a.d.f.a.a(bArr, i);
        if (this.a != 3 && this.a != 1) {
            throw new u("Version " + this.a + " referral not supported. Please report this to jcifs at samba dot org.");
        }
        int i3 = i + 2;
        this.b = a.d.f.a.a(bArr, i3);
        int i4 = i3 + 2;
        this.c = a.d.f.a.a(bArr, i4);
        int i5 = i4 + 2;
        this.d = a.d.f.a.a(bArr, i5);
        int i6 = i5 + 2;
        if (this.a == 3) {
            this.e = a.d.f.a.a(bArr, i6);
            int i7 = i6 + 2;
            this.g = a.d.f.a.a(bArr, i7);
            int i8 = i7 + 2;
            if ((this.d & 2) == 0) {
                int iA = a.d.f.a.a(bArr, i8);
                int i9 = i8 + 2;
                int iA2 = a.d.f.a.a(bArr, i9);
                int iA3 = a.d.f.a.a(bArr, i9 + 2);
                if (iA > 0) {
                    this.h = b(bArr, iA + i, i2);
                }
                if (iA3 > 0) {
                    this.i = b(bArr, iA3 + i, i2);
                }
                if (iA2 > 0) {
                    this.f = b(bArr, i + iA2, i2);
                }
            } else {
                int iA4 = a.d.f.a.a(bArr, i8);
                int i10 = i8 + 2;
                int iA5 = a.d.f.a.a(bArr, i10);
                int iA6 = a.d.f.a.a(bArr, i10 + 2);
                if (iA4 > 0) {
                    this.j = b(bArr, i + iA4, i2);
                }
                if (iA6 > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < iA5; i11++) {
                        String strB = b(bArr, i + iA6, i2);
                        arrayList.add(strB);
                        iA6 += (strB.length() * 2) + 2;
                    }
                    this.k = (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
            }
        } else if (this.a == 1) {
            this.i = b(bArr, i6, i2);
        }
        return this.b;
    }

    private static String b(byte[] bArr, int i, int i2) {
        if (i % 2 != 0) {
            i++;
        }
        return f.a(bArr, i, f.b(bArr, i, i2));
    }

    public final String toString() {
        return new String("Referral[version=" + this.a + ",size=" + this.b + ",serverType=" + this.c + ",flags=" + this.d + ",proximity=" + this.e + ",ttl=" + this.g + ",path=" + this.h + ",altPath=" + this.f + ",node=" + this.i + "]");
    }
}
