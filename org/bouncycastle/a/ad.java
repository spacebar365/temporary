package org.bouncycastle.a;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class ad extends u {
    private byte[] a;

    ad(byte[] bArr) {
        this.a = bArr;
    }

    @Override // org.bouncycastle.a.u
    final void a(s sVar) {
        sVar.b(23);
        int length = this.a.length;
        sVar.a(length);
        for (int i = 0; i != length; i++) {
            sVar.b(this.a[i]);
        }
    }

    @Override // org.bouncycastle.a.u
    final boolean a() {
        return false;
    }

    @Override // org.bouncycastle.a.u
    final boolean a(u uVar) {
        if (uVar instanceof ad) {
            return org.bouncycastle.f.a.a(this.a, ((ad) uVar).a);
        }
        return false;
    }

    public final Date b() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return bz.a(simpleDateFormat.parse(d()));
    }

    public final String c() {
        String strB = org.bouncycastle.f.k.b(this.a);
        if (strB.indexOf(45) < 0 && strB.indexOf(43) < 0) {
            return strB.length() == 11 ? strB.substring(0, 10) + "00GMT+00:00" : strB.substring(0, 12) + "GMT+00:00";
        }
        int iIndexOf = strB.indexOf(45);
        if (iIndexOf < 0) {
            iIndexOf = strB.indexOf(43);
        }
        if (iIndexOf == strB.length() - 3) {
            strB = strB + "00";
        }
        return iIndexOf == 10 ? strB.substring(0, 10) + "00GMT" + strB.substring(10, 13) + ":" + strB.substring(13, 15) : strB.substring(0, 12) + "GMT" + strB.substring(12, 15) + ":" + strB.substring(15, 17);
    }

    public final String d() {
        String strC = c();
        return strC.charAt(0) < '5' ? "20".concat(String.valueOf(strC)) : "19".concat(String.valueOf(strC));
    }

    @Override // org.bouncycastle.a.u
    final int e() {
        int length = this.a.length;
        return length + ch.a(length) + 1;
    }

    @Override // org.bouncycastle.a.u, org.bouncycastle.a.o
    public final int hashCode() {
        return org.bouncycastle.f.a.a(this.a);
    }

    public final String toString() {
        return org.bouncycastle.f.k.b(this.a);
    }
}
