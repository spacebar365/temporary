package org.a.a.a.a.a;

import java.text.ParseException;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: UnixFTPEntryParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class o extends b {
    public static final org.a.a.a.a.d b = new org.a.a.a.a.d("UNIX", "yyyy-MM-dd HH:mm", null);
    final boolean c;

    public o() {
        this(null);
    }

    public o(org.a.a.a.a.d dVar) {
        this(dVar, false);
    }

    public o(org.a.a.a.a.d dVar, boolean z) {
        super("([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s*(\\d+)\\s+(?:(\\S+(?:\\s\\S+)*?)\\s+)?(?:(\\S+(?:\\s\\S+)*)\\s+)?(\\d+(?:,\\s*\\d+)?)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3})|(?:\\d{1,2}月\\s+\\d{1,2}日))\\s+((?:\\d+(?::\\d+)?)|(?:\\d{4}年))\\s(.*)");
        a(dVar);
        this.c = z;
    }

    @Override // org.a.a.a.a.i, org.a.a.a.a.h
    public final List<String> a(List<String> list) {
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().matches("^total \\d+$")) {
                listIterator.remove();
            }
        }
        return list;
    }

    @Override // org.a.a.a.a.h
    public final org.a.a.a.a.g a(String str) {
        int i;
        int iIndexOf;
        org.a.a.a.a.g gVar = new org.a.a.a.a.g();
        gVar.a(str);
        boolean z = false;
        if (c(str)) {
            String strA = a(1);
            String strA2 = a(15);
            String strA3 = a(16);
            String strA4 = a(17);
            String strA5 = a(18);
            String str2 = a(19) + " " + a(20);
            String strA6 = a(21);
            String strReplaceFirst = this.c ? strA6.replaceFirst("^\\s+", "") : strA6;
            try {
                if (a(19).contains("月")) {
                    f fVar = new f();
                    fVar.a(new org.a.a.a.a.d("UNIX", "M'月' d'日' yyyy'年'", "M'月' d'日' HH:mm"));
                    gVar.a(fVar.a(str2));
                } else {
                    gVar.a(super.b(str2));
                }
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
                int i4 = i2;
                if (i3 < 3) {
                    gVar.a(i3, 0, !a(i4).equals("-"));
                    gVar.a(i3, 1, !a(i4 + 1).equals("-"));
                    String strA7 = a(i4 + 2);
                    if (!strA7.equals("-") && !Character.isUpperCase(strA7.charAt(0))) {
                        gVar.a(i3, 2, true);
                    } else {
                        gVar.a(i3, 2, false);
                    }
                    i3++;
                    i2 = i4 + 4;
                } else {
                    if (!z) {
                        try {
                            gVar.b(Integer.parseInt(strA2));
                        } catch (NumberFormatException e2) {
                        }
                    }
                    gVar.d(strA3);
                    gVar.c(strA4);
                    try {
                        gVar.a(Long.parseLong(strA5));
                    } catch (NumberFormatException e3) {
                    }
                    if (i == 2 && (iIndexOf = strReplaceFirst.indexOf(" -> ")) != -1) {
                        gVar.b(strReplaceFirst.substring(0, iIndexOf));
                        gVar.e(strReplaceFirst.substring(iIndexOf + 4));
                    } else {
                        gVar.b(strReplaceFirst);
                    }
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
