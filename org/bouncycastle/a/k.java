package org.bouncycastle.a;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public class k extends u {
    protected byte[] a;

    public k(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'", bz.a);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.a = org.bouncycastle.f.k.d(simpleDateFormat.format(date));
    }

    k(byte[] bArr) {
        this.a = bArr;
    }

    private static String a(int i) {
        return i < 10 ? "0".concat(String.valueOf(i)) : Integer.toString(i);
    }

    public static k a(Object obj) {
        if (obj == null || (obj instanceof k)) {
            return (k) obj;
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    private boolean b(int i) {
        return this.a.length > i && this.a[i] >= 48 && this.a[i] <= 57;
    }

    private String l() {
        int i;
        String str = "+";
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            str = "-";
            rawOffset = -rawOffset;
        }
        int i2 = rawOffset / 3600000;
        int i3 = (rawOffset - (((i2 * 60) * 60) * 1000)) / 60000;
        if (timeZone.useDaylightTime() && timeZone.inDaylightTime(c())) {
            i = (str.equals("+") ? 1 : -1) + i2;
        } else {
            i = i2;
        }
        return "GMT" + str + a(i) + ":" + a(i3);
    }

    @Override // org.bouncycastle.a.u
    void a(s sVar) {
        sVar.a(24, this.a);
    }

    @Override // org.bouncycastle.a.u
    final boolean a() {
        return false;
    }

    @Override // org.bouncycastle.a.u
    final boolean a(u uVar) {
        if (uVar instanceof k) {
            return org.bouncycastle.f.a.a(this.a, ((k) uVar).a);
        }
        return false;
    }

    public final String b() {
        String strB = org.bouncycastle.f.k.b(this.a);
        if (strB.charAt(strB.length() - 1) == 'Z') {
            return strB.substring(0, strB.length() - 1) + "GMT+00:00";
        }
        int length = strB.length() - 5;
        char cCharAt = strB.charAt(length);
        if (cCharAt == '-' || cCharAt == '+') {
            return strB.substring(0, length) + "GMT" + strB.substring(length, length + 3) + ":" + strB.substring(length + 3);
        }
        int length2 = strB.length() - 3;
        char cCharAt2 = strB.charAt(length2);
        return (cCharAt2 == '-' || cCharAt2 == '+') ? strB.substring(0, length2) + "GMT" + strB.substring(length2) + ":00" : strB + l();
    }

    public final Date c() {
        SimpleDateFormat simpleDateFormat;
        char cCharAt;
        String strB = org.bouncycastle.f.k.b(this.a);
        if (strB.endsWith("Z")) {
            simpleDateFormat = d() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'") : f() ? new SimpleDateFormat("yyyyMMddHHmmss'Z'") : j() ? new SimpleDateFormat("yyyyMMddHHmm'Z'") : new SimpleDateFormat("yyyyMMddHH'Z'");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (strB.indexOf(45) > 0 || strB.indexOf(43) > 0) {
            strB = b();
            simpleDateFormat = d() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : f() ? new SimpleDateFormat("yyyyMMddHHmmssz") : j() ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else {
            simpleDateFormat = d() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : f() ? new SimpleDateFormat("yyyyMMddHHmmss") : j() ? new SimpleDateFormat("yyyyMMddHHmm") : new SimpleDateFormat("yyyyMMddHH");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (d()) {
            String strSubstring = strB.substring(14);
            int i = 1;
            while (i < strSubstring.length() && '0' <= (cCharAt = strSubstring.charAt(i)) && cCharAt <= '9') {
                i++;
            }
            if (i - 1 > 3) {
                strB = strB.substring(0, 14) + (strSubstring.substring(0, 4) + strSubstring.substring(i));
            } else if (i - 1 == 1) {
                strB = strB.substring(0, 14) + (strSubstring.substring(0, i) + "00" + strSubstring.substring(i));
            } else if (i - 1 == 2) {
                strB = strB.substring(0, 14) + (strSubstring.substring(0, i) + "0" + strSubstring.substring(i));
            }
        }
        return bz.a(simpleDateFormat.parse(strB));
    }

    protected final boolean d() {
        for (int i = 0; i != this.a.length; i++) {
            if (this.a[i] == 46 && i == 14) {
                return true;
            }
        }
        return false;
    }

    @Override // org.bouncycastle.a.u
    int e() {
        int length = this.a.length;
        return length + ch.a(length) + 1;
    }

    protected final boolean f() {
        return b(12) && b(13);
    }

    @Override // org.bouncycastle.a.u
    final u g() {
        return new az(this.a);
    }

    @Override // org.bouncycastle.a.u, org.bouncycastle.a.o
    public int hashCode() {
        return org.bouncycastle.f.a.a(this.a);
    }

    protected final boolean j() {
        return b(10) && b(11);
    }
}
