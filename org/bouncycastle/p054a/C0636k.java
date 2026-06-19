package org.bouncycastle.p054a;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: renamed from: org.bouncycastle.a.k */
/* JADX INFO: loaded from: classes.dex */
public class C0636k extends AbstractC0686u {

    /* JADX INFO: renamed from: a */
    protected byte[] f2370a;

    public C0636k(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'", C0602bz.f2131a);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.f2370a = C1560k.m4168d(simpleDateFormat.format(date));
    }

    C0636k(byte[] bArr) {
        this.f2370a = bArr;
    }

    /* JADX INFO: renamed from: a */
    private static String m1541a(int i) {
        return i < 10 ? "0".concat(String.valueOf(i)) : Integer.toString(i);
    }

    /* JADX INFO: renamed from: a */
    public static C0636k m1542a(Object obj) {
        if (obj == null || (obj instanceof C0636k)) {
            return (C0636k) obj;
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    /* JADX INFO: renamed from: b */
    private boolean m1543b(int i) {
        return this.f2370a.length > i && this.f2370a[i] >= 48 && this.f2370a[i] <= 57;
    }

    /* JADX INFO: renamed from: l */
    private String m1544l() {
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
        if (timeZone.useDaylightTime() && timeZone.inDaylightTime(m1546c())) {
            i = (str.equals("+") ? 1 : -1) + i2;
        } else {
            i = i2;
        }
        return "GMT" + str + m1541a(i) + ":" + m1541a(i3);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    void mo1335a(C0660s c0660s) {
        c0660s.m1605a(24, this.f2370a);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1336a() {
        return false;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1337a(AbstractC0686u abstractC0686u) {
        if (abstractC0686u instanceof C0636k) {
            return C1535a.m4076a(this.f2370a, ((C0636k) abstractC0686u).f2370a);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final String m1545b() {
        String strM4164b = C1560k.m4164b(this.f2370a);
        if (strM4164b.charAt(strM4164b.length() - 1) == 'Z') {
            return strM4164b.substring(0, strM4164b.length() - 1) + "GMT+00:00";
        }
        int length = strM4164b.length() - 5;
        char cCharAt = strM4164b.charAt(length);
        if (cCharAt == '-' || cCharAt == '+') {
            return strM4164b.substring(0, length) + "GMT" + strM4164b.substring(length, length + 3) + ":" + strM4164b.substring(length + 3);
        }
        int length2 = strM4164b.length() - 3;
        char cCharAt2 = strM4164b.charAt(length2);
        return (cCharAt2 == '-' || cCharAt2 == '+') ? strM4164b.substring(0, length2) + "GMT" + strM4164b.substring(length2) + ":00" : strM4164b + m1544l();
    }

    /* JADX INFO: renamed from: c */
    public final Date m1546c() {
        SimpleDateFormat simpleDateFormat;
        char cCharAt;
        String strM4164b = C1560k.m4164b(this.f2370a);
        if (strM4164b.endsWith("Z")) {
            simpleDateFormat = m1547d() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'") : m1548f() ? new SimpleDateFormat("yyyyMMddHHmmss'Z'") : m1549j() ? new SimpleDateFormat("yyyyMMddHHmm'Z'") : new SimpleDateFormat("yyyyMMddHH'Z'");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (strM4164b.indexOf(45) > 0 || strM4164b.indexOf(43) > 0) {
            strM4164b = m1545b();
            simpleDateFormat = m1547d() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : m1548f() ? new SimpleDateFormat("yyyyMMddHHmmssz") : m1549j() ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else {
            simpleDateFormat = m1547d() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : m1548f() ? new SimpleDateFormat("yyyyMMddHHmmss") : m1549j() ? new SimpleDateFormat("yyyyMMddHHmm") : new SimpleDateFormat("yyyyMMddHH");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (m1547d()) {
            String strSubstring = strM4164b.substring(14);
            int i = 1;
            while (i < strSubstring.length() && '0' <= (cCharAt = strSubstring.charAt(i)) && cCharAt <= '9') {
                i++;
            }
            if (i - 1 > 3) {
                strM4164b = strM4164b.substring(0, 14) + (strSubstring.substring(0, 4) + strSubstring.substring(i));
            } else if (i - 1 == 1) {
                strM4164b = strM4164b.substring(0, 14) + (strSubstring.substring(0, i) + "00" + strSubstring.substring(i));
            } else if (i - 1 == 2) {
                strM4164b = strM4164b.substring(0, 14) + (strSubstring.substring(0, i) + "0" + strSubstring.substring(i));
            }
        }
        return C0602bz.m1467a(simpleDateFormat.parse(strM4164b));
    }

    /* JADX INFO: renamed from: d */
    protected final boolean m1547d() {
        for (int i = 0; i != this.f2370a.length; i++) {
            if (this.f2370a[i] == 46 && i == 14) {
                return true;
            }
        }
        return false;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    int mo1341e() {
        int length = this.f2370a.length;
        return length + C0612ch.m1488a(length) + 1;
    }

    /* JADX INFO: renamed from: f */
    protected final boolean m1548f() {
        return m1543b(12) && m1543b(13);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: g */
    final AbstractC0686u mo1400g() {
        return new C0563az(this.f2370a);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u, org.bouncycastle.p054a.AbstractC0650o
    public int hashCode() {
        return C1535a.m4066a(this.f2370a);
    }

    /* JADX INFO: renamed from: j */
    protected final boolean m1549j() {
        return m1543b(10) && m1543b(11);
    }
}
