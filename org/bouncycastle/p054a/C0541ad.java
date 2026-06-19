package org.bouncycastle.p054a;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: renamed from: org.bouncycastle.a.ad */
/* JADX INFO: loaded from: classes.dex */
public final class C0541ad extends AbstractC0686u {

    /* JADX INFO: renamed from: a */
    private byte[] f2000a;

    C0541ad(byte[] bArr) {
        this.f2000a = bArr;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) {
        c0660s.mo1608b(23);
        int length = this.f2000a.length;
        c0660s.m1602a(length);
        for (int i = 0; i != length; i++) {
            c0660s.mo1608b(this.f2000a[i]);
        }
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1336a() {
        return false;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1337a(AbstractC0686u abstractC0686u) {
        if (abstractC0686u instanceof C0541ad) {
            return C1535a.m4076a(this.f2000a, ((C0541ad) abstractC0686u).f2000a);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final Date m1403b() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return C0602bz.m1467a(simpleDateFormat.parse(m1405d()));
    }

    /* JADX INFO: renamed from: c */
    public final String m1404c() {
        String strM4164b = C1560k.m4164b(this.f2000a);
        if (strM4164b.indexOf(45) < 0 && strM4164b.indexOf(43) < 0) {
            return strM4164b.length() == 11 ? strM4164b.substring(0, 10) + "00GMT+00:00" : strM4164b.substring(0, 12) + "GMT+00:00";
        }
        int iIndexOf = strM4164b.indexOf(45);
        if (iIndexOf < 0) {
            iIndexOf = strM4164b.indexOf(43);
        }
        if (iIndexOf == strM4164b.length() - 3) {
            strM4164b = strM4164b + "00";
        }
        return iIndexOf == 10 ? strM4164b.substring(0, 10) + "00GMT" + strM4164b.substring(10, 13) + ":" + strM4164b.substring(13, 15) : strM4164b.substring(0, 12) + "GMT" + strM4164b.substring(12, 15) + ":" + strM4164b.substring(15, 17);
    }

    /* JADX INFO: renamed from: d */
    public final String m1405d() {
        String strM1404c = m1404c();
        return strM1404c.charAt(0) < '5' ? "20".concat(String.valueOf(strM1404c)) : "19".concat(String.valueOf(strM1404c));
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        int length = this.f2000a.length;
        return length + C0612ch.m1488a(length) + 1;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u, org.bouncycastle.p054a.AbstractC0650o
    public final int hashCode() {
        return C1535a.m4066a(this.f2000a);
    }

    public final String toString() {
        return C1560k.m4164b(this.f2000a);
    }
}
