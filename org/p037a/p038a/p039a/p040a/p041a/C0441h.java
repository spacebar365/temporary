package org.p037a.p038a.p039a.p040a.p041a;

import java.text.ParseException;
import org.p037a.p038a.p039a.p040a.C0453d;
import org.p037a.p038a.p039a.p040a.C0456g;

/* JADX INFO: renamed from: org.a.a.a.a.a.h */
/* JADX INFO: compiled from: MacOsPeterFTPEntryParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0441h extends AbstractC0435b {
    public C0441h() {
        this(null);
    }

    public C0441h(C0453d c0453d) {
        super("([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s+((folder\\s+)|((\\d+)\\s+(\\d+)\\s+))(\\d+)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3}))\\s+(\\d+(?::\\d+)?)\\s+(\\S*)(\\s*.*)");
        mo1178a(c0453d);
    }

    @Override // org.p037a.p038a.p039a.p040a.InterfaceC0457h
    /* JADX INFO: renamed from: a */
    public final C0456g mo1179a(String str) {
        int i;
        String str2;
        int iIndexOf;
        C0456g c0456g = new C0456g();
        c0456g.m1246a(str);
        boolean z = false;
        if (m1196c(str)) {
            String strA = m1195a(1);
            String strA2 = m1195a(20);
            String str3 = m1195a(21) + " " + m1195a(22);
            String strA3 = m1195a(23);
            String strA4 = m1195a(24);
            try {
                c0456g.m1247a(super.m1181b(str3));
            } catch (ParseException e) {
            }
            switch (strA.charAt(0)) {
                case '-':
                case 'f':
                    i = 0;
                    break;
                case 'b':
                case 'c':
                    z = true;
                    i = 0;
                    break;
                case 'd':
                    i = 1;
                    break;
                case 'e':
                    i = 2;
                    break;
                case 'l':
                    i = 2;
                    break;
                default:
                    i = 3;
                    break;
            }
            c0456g.m1243a(i);
            int i2 = 4;
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 < 3) {
                    c0456g.m1244a(i4, 0, !m1195a(i2).equals("-"));
                    c0456g.m1244a(i4, 1, !m1195a(i2 + 1).equals("-"));
                    String strA5 = m1195a(i2 + 2);
                    if (!strA5.equals("-") && !Character.isUpperCase(strA5.charAt(0))) {
                        c0456g.m1244a(i4, 2, true);
                    } else {
                        c0456g.m1244a(i4, 2, false);
                    }
                    i3 = i4 + 1;
                    i2 += 4;
                } else {
                    if (!z) {
                        try {
                            c0456g.m1249b(Integer.parseInt("0"));
                        } catch (NumberFormatException e2) {
                        }
                    }
                    c0456g.m1255d(null);
                    c0456g.m1253c(null);
                    try {
                        c0456g.m1245a(Long.parseLong(strA2));
                    } catch (NumberFormatException e3) {
                    }
                    if (strA4 != null) {
                        str2 = strA3 + strA4;
                        if (i == 2 && (iIndexOf = str2.indexOf(" -> ")) != -1) {
                            c0456g.m1250b(str2.substring(0, iIndexOf));
                            c0456g.m1257e(str2.substring(iIndexOf + 4));
                        }
                        return c0456g;
                    }
                    str2 = strA3;
                    c0456g.m1250b(str2);
                    return c0456g;
                }
            }
        } else {
            return null;
        }
    }

    @Override // org.p037a.p038a.p039a.p040a.p041a.AbstractC0435b
    /* JADX INFO: renamed from: a */
    protected final C0453d mo1180a() {
        return new C0453d("UNIX", "MMM d yyyy", "MMM d HH:mm");
    }
}
