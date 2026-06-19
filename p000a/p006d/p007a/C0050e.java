package p000a.p006d.p007a;

import java.util.ArrayList;
import p000a.C0297u;
import p000a.InterfaceC0286j;
import p000a.p006d.p025f.C0173a;
import p000a.p031i.C0285f;

/* JADX INFO: renamed from: a.d.a.e */
/* JADX INFO: compiled from: Referral.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0050e implements InterfaceC0286j {

    /* JADX INFO: renamed from: a */
    int f243a;

    /* JADX INFO: renamed from: b */
    int f244b;

    /* JADX INFO: renamed from: c */
    int f245c;

    /* JADX INFO: renamed from: d */
    int f246d;

    /* JADX INFO: renamed from: e */
    int f247e;

    /* JADX INFO: renamed from: f */
    String f248f;

    /* JADX INFO: renamed from: g */
    int f249g;

    /* JADX INFO: renamed from: h */
    String f250h = null;

    /* JADX INFO: renamed from: i */
    String f251i = null;

    /* JADX INFO: renamed from: j */
    String f252j = null;

    /* JADX INFO: renamed from: k */
    String[] f253k = new String[0];

    @Override // p000a.InterfaceC0286j
    /* JADX INFO: renamed from: a */
    public final int mo201a(byte[] bArr, int i, int i2) {
        this.f243a = C0173a.m509a(bArr, i);
        if (this.f243a != 3 && this.f243a != 1) {
            throw new C0297u("Version " + this.f243a + " referral not supported. Please report this to jcifs at samba dot org.");
        }
        int i3 = i + 2;
        this.f244b = C0173a.m509a(bArr, i3);
        int i4 = i3 + 2;
        this.f245c = C0173a.m509a(bArr, i4);
        int i5 = i4 + 2;
        this.f246d = C0173a.m509a(bArr, i5);
        int i6 = i5 + 2;
        if (this.f243a == 3) {
            this.f247e = C0173a.m509a(bArr, i6);
            int i7 = i6 + 2;
            this.f249g = C0173a.m509a(bArr, i7);
            int i8 = i7 + 2;
            if ((this.f246d & 2) == 0) {
                int iM509a = C0173a.m509a(bArr, i8);
                int i9 = i8 + 2;
                int iM509a2 = C0173a.m509a(bArr, i9);
                int iM509a3 = C0173a.m509a(bArr, i9 + 2);
                if (iM509a > 0) {
                    this.f250h = m205b(bArr, iM509a + i, i2);
                }
                if (iM509a3 > 0) {
                    this.f251i = m205b(bArr, iM509a3 + i, i2);
                }
                if (iM509a2 > 0) {
                    this.f248f = m205b(bArr, i + iM509a2, i2);
                }
            } else {
                int iM509a4 = C0173a.m509a(bArr, i8);
                int i10 = i8 + 2;
                int iM509a5 = C0173a.m509a(bArr, i10);
                int iM509a6 = C0173a.m509a(bArr, i10 + 2);
                if (iM509a4 > 0) {
                    this.f252j = m205b(bArr, i + iM509a4, i2);
                }
                if (iM509a6 > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < iM509a5; i11++) {
                        String strM205b = m205b(bArr, i + iM509a6, i2);
                        arrayList.add(strM205b);
                        iM509a6 += (strM205b.length() * 2) + 2;
                    }
                    this.f253k = (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
            }
        } else if (this.f243a == 1) {
            this.f251i = m205b(bArr, i6, i2);
        }
        return this.f244b;
    }

    /* JADX INFO: renamed from: b */
    private static String m205b(byte[] bArr, int i, int i2) {
        if (i % 2 != 0) {
            i++;
        }
        return C0285f.m950a(bArr, i, C0285f.m955b(bArr, i, i2));
    }

    public final String toString() {
        return new String("Referral[version=" + this.f243a + ",size=" + this.f244b + ",serverType=" + this.f245c + ",flags=" + this.f246d + ",proximity=" + this.f247e + ",ttl=" + this.f249g + ",path=" + this.f250h + ",altPath=" + this.f248f + ",node=" + this.f251i + "]");
    }
}
