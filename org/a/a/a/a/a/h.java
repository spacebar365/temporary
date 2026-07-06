package org.a.a.a.a.a;

import java.text.ParseException;

/* JADX INFO: compiled from: MacOsPeterFTPEntryParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class h extends b {
    public h() {
        this(null);
    }

    public h(org.a.a.a.a.d dVar) {
        super("([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s+((folder\\s+)|((\\d+)\\s+(\\d+)\\s+))(\\d+)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3}))\\s+(\\d+(?::\\d+)?)\\s+(\\S*)(\\s*.*)");
        a(dVar);
    }

    @Override // org.a.a.a.a.h
    public final org.a.a.a.a.g a(String str) {
        int i;
        String str2;
        int iIndexOf;
        org.a.a.a.a.g gVar = new org.a.a.a.a.g();
        gVar.a(str);
        boolean z = false;
        if (c(str)) {
            String strA = a(1);
            String strA2 = a(20);
            String str3 = a(21) + " " + a(22);
            String strA3 = a(23);
            String strA4 = a(24);
            try {
                gVar.a(super.b(str3));
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
            gVar.a(i);
            int i2 = 4;
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 < 3) {
                    gVar.a(i4, 0, !a(i2).equals("-"));
                    gVar.a(i4, 1, !a(i2 + 1).equals("-"));
                    String strA5 = a(i2 + 2);
                    if (!strA5.equals("-") && !Character.isUpperCase(strA5.charAt(0))) {
                        gVar.a(i4, 2, true);
                    } else {
                        gVar.a(i4, 2, false);
                    }
                    i3 = i4 + 1;
                    i2 += 4;
                } else {
                    if (!z) {
                        try {
                            gVar.b(Integer.parseInt("0"));
                        } catch (NumberFormatException e2) {
                        }
                    }
                    gVar.d(null);
                    gVar.c(null);
                    try {
                        gVar.a(Long.parseLong(strA2));
                    } catch (NumberFormatException e3) {
                    }
                    if (strA4 != null) {
                        str2 = strA3 + strA4;
                        if (i == 2 && (iIndexOf = str2.indexOf(" -> ")) != -1) {
                            gVar.b(str2.substring(0, iIndexOf));
                            gVar.e(str2.substring(iIndexOf + 4));
                        }
                        return gVar;
                    }
                    str2 = strA3;
                    gVar.b(str2);
                    return gVar;
                }
            }
        } else {
            return null;
        }
    }

    @Override // org.a.a.a.a.a.b
    protected final org.a.a.a.a.d a() {
        return new org.a.a.a.a.d("UNIX", "MMM d yyyy", "MMM d HH:mm");
    }
}
