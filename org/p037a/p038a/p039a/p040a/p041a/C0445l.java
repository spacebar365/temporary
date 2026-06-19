package org.p037a.p038a.p039a.p040a.p041a;

import java.io.File;
import java.text.ParseException;
import org.p037a.p038a.p039a.p040a.C0453d;
import org.p037a.p038a.p039a.p040a.C0456g;

/* JADX INFO: renamed from: org.a.a.a.a.a.l */
/* JADX INFO: compiled from: OS400FTPEntryParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0445l extends AbstractC0435b {
    public C0445l() {
        this(null);
    }

    public C0445l(C0453d c0453d) {
        super("(\\S+)\\s+(?:(\\d+)\\s+)?(?:(\\S+)\\s+(\\S+)\\s+)?(\\*STMF|\\*DIR|\\*FILE|\\*MEM)\\s+(?:(\\S+)\\s*)?");
        mo1178a(c0453d);
    }

    @Override // org.p037a.p038a.p039a.p040a.InterfaceC0457h
    /* JADX INFO: renamed from: a */
    public final C0456g mo1179a(String str) {
        boolean z;
        int iLastIndexOf;
        int i = 3;
        C0456g c0456g = new C0456g();
        c0456g.m1246a(str);
        if (!m1196c(str)) {
            return null;
        }
        String strA = m1195a(1);
        String strA2 = m1195a(2);
        String str2 = "";
        if (!m1193e(m1195a(3)) || !m1193e(m1195a(4))) {
            str2 = m1195a(3) + " " + m1195a(4);
        }
        String strA3 = m1195a(5);
        String strA4 = m1195a(6);
        try {
            c0456g.m1247a(super.m1181b(str2));
        } catch (ParseException e) {
        }
        if (strA3.equalsIgnoreCase("*STMF")) {
            if (m1193e(strA2) || m1193e(strA4)) {
                return null;
            }
            z = true;
            i = 0;
        } else if (strA3.equalsIgnoreCase("*DIR")) {
            if (m1193e(strA2) || m1193e(strA4)) {
                return null;
            }
            z = true;
            i = 1;
        } else if (strA3.equalsIgnoreCase("*FILE")) {
            if (strA4 == null || !strA4.toUpperCase().endsWith(".SAVF")) {
                return null;
            }
            z = false;
            i = 0;
        } else if (!strA3.equalsIgnoreCase("*MEM")) {
            z = true;
        } else {
            if (m1193e(strA4)) {
                return null;
            }
            if (!m1193e(strA2) || !m1193e(str2)) {
                return null;
            }
            z = false;
            strA4 = strA4.replace('/', File.separatorChar);
            i = 0;
        }
        c0456g.m1243a(i);
        c0456g.m1255d(strA);
        try {
            c0456g.m1245a(Long.parseLong(strA2));
        } catch (NumberFormatException e2) {
        }
        String strSubstring = strA4.endsWith("/") ? strA4.substring(0, strA4.length() - 1) : strA4;
        c0456g.m1250b((!z || (iLastIndexOf = strSubstring.lastIndexOf(47)) < 0) ? strSubstring : strSubstring.substring(iLastIndexOf + 1));
        return c0456g;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m1193e(String str) {
        return str == null || str.length() == 0;
    }

    @Override // org.p037a.p038a.p039a.p040a.p041a.AbstractC0435b
    /* JADX INFO: renamed from: a */
    protected final C0453d mo1180a() {
        return new C0453d("OS/400", "yy/MM/dd HH:mm:ss", null);
    }
}
