package org.p037a.p038a.p039a.p040a.p041a;

import java.text.ParseException;
import java.util.List;
import java.util.ListIterator;
import org.p037a.p038a.p039a.p040a.C0453d;
import org.p037a.p038a.p039a.p040a.C0456g;

/* JADX INFO: renamed from: org.a.a.a.a.a.o */
/* JADX INFO: compiled from: UnixFTPEntryParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0448o extends AbstractC0435b {

    /* JADX INFO: renamed from: b */
    public static final C0453d f1570b = new C0453d("UNIX", "yyyy-MM-dd HH:mm", null);

    /* JADX INFO: renamed from: c */
    final boolean f1571c;

    public C0448o() {
        this(null);
    }

    public C0448o(C0453d c0453d) {
        this(c0453d, false);
    }

    public C0448o(C0453d c0453d, boolean z) {
        super("([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s*(\\d+)\\s+(?:(\\S+(?:\\s\\S+)*?)\\s+)?(?:(\\S+(?:\\s\\S+)*)\\s+)?(\\d+(?:,\\s*\\d+)?)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3})|(?:\\d{1,2}月\\s+\\d{1,2}日))\\s+((?:\\d+(?::\\d+)?)|(?:\\d{4}年))\\s(.*)");
        mo1178a(c0453d);
        this.f1571c = z;
    }

    @Override // org.p037a.p038a.p039a.p040a.AbstractC0458i, org.p037a.p038a.p039a.p040a.InterfaceC0457h
    /* JADX INFO: renamed from: a */
    public final List<String> mo1192a(List<String> list) {
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().matches("^total \\d+$")) {
                listIterator.remove();
            }
        }
        return list;
    }

    @Override // org.p037a.p038a.p039a.p040a.InterfaceC0457h
    /* JADX INFO: renamed from: a */
    public final C0456g mo1179a(String str) {
        int i;
        int iIndexOf;
        C0456g c0456g = new C0456g();
        c0456g.m1246a(str);
        boolean z = false;
        if (m1196c(str)) {
            String strA = m1195a(1);
            String strA2 = m1195a(15);
            String strA3 = m1195a(16);
            String strA4 = m1195a(17);
            String strA5 = m1195a(18);
            String str2 = m1195a(19) + " " + m1195a(20);
            String strA6 = m1195a(21);
            String strReplaceFirst = this.f1571c ? strA6.replaceFirst("^\\s+", "") : strA6;
            try {
                if (m1195a(19).contains("月")) {
                    C0439f c0439f = new C0439f();
                    c0439f.mo1178a(new C0453d("UNIX", "M'月' d'日' yyyy'年'", "M'月' d'日' HH:mm"));
                    c0456g.m1247a(c0439f.mo1185a(str2));
                } else {
                    c0456g.m1247a(super.m1181b(str2));
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
            c0456g.m1243a(i);
            int i2 = 4;
            int i3 = 0;
            while (true) {
                int i4 = i2;
                if (i3 < 3) {
                    c0456g.m1244a(i3, 0, !m1195a(i4).equals("-"));
                    c0456g.m1244a(i3, 1, !m1195a(i4 + 1).equals("-"));
                    String strA7 = m1195a(i4 + 2);
                    if (!strA7.equals("-") && !Character.isUpperCase(strA7.charAt(0))) {
                        c0456g.m1244a(i3, 2, true);
                    } else {
                        c0456g.m1244a(i3, 2, false);
                    }
                    i3++;
                    i2 = i4 + 4;
                } else {
                    if (!z) {
                        try {
                            c0456g.m1249b(Integer.parseInt(strA2));
                        } catch (NumberFormatException e2) {
                        }
                    }
                    c0456g.m1255d(strA3);
                    c0456g.m1253c(strA4);
                    try {
                        c0456g.m1245a(Long.parseLong(strA5));
                    } catch (NumberFormatException e3) {
                    }
                    if (i == 2 && (iIndexOf = strReplaceFirst.indexOf(" -> ")) != -1) {
                        c0456g.m1250b(strReplaceFirst.substring(0, iIndexOf));
                        c0456g.m1257e(strReplaceFirst.substring(iIndexOf + 4));
                    } else {
                        c0456g.m1250b(strReplaceFirst);
                    }
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
