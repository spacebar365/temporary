package org.a.a.a.a.a;

import java.io.File;
import java.text.ParseException;

/* JADX INFO: compiled from: OS400FTPEntryParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class l extends b {
    public l() {
        this(null);
    }

    public l(org.a.a.a.a.d dVar) {
        super("(\\S+)\\s+(?:(\\d+)\\s+)?(?:(\\S+)\\s+(\\S+)\\s+)?(\\*STMF|\\*DIR|\\*FILE|\\*MEM)\\s+(?:(\\S+)\\s*)?");
        a(dVar);
    }

    @Override // org.a.a.a.a.h
    public final org.a.a.a.a.g a(String str) {
        boolean z;
        int iLastIndexOf;
        int i = 3;
        org.a.a.a.a.g gVar = new org.a.a.a.a.g();
        gVar.a(str);
        if (!c(str)) {
            return null;
        }
        String strA = a(1);
        String strA2 = a(2);
        String str2 = "";
        if (!e(a(3)) || !e(a(4))) {
            str2 = a(3) + " " + a(4);
        }
        String strA3 = a(5);
        String strA4 = a(6);
        try {
            gVar.a(super.b(str2));
        } catch (ParseException e) {
        }
        if (strA3.equalsIgnoreCase("*STMF")) {
            if (e(strA2) || e(strA4)) {
                return null;
            }
            z = true;
            i = 0;
        } else if (strA3.equalsIgnoreCase("*DIR")) {
            if (e(strA2) || e(strA4)) {
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
            if (e(strA4)) {
                return null;
            }
            if (!e(strA2) || !e(str2)) {
                return null;
            }
            z = false;
            strA4 = strA4.replace('/', File.separatorChar);
            i = 0;
        }
        gVar.a(i);
        gVar.d(strA);
        try {
            gVar.a(Long.parseLong(strA2));
        } catch (NumberFormatException e2) {
        }
        String strSubstring = strA4.endsWith("/") ? strA4.substring(0, strA4.length() - 1) : strA4;
        gVar.b((!z || (iLastIndexOf = strSubstring.lastIndexOf(47)) < 0) ? strSubstring : strSubstring.substring(iLastIndexOf + 1));
        return gVar;
    }

    private static boolean e(String str) {
        return str == null || str.length() == 0;
    }

    @Override // org.a.a.a.a.a.b
    protected final org.a.a.a.a.d a() {
        return new org.a.a.a.a.d("OS/400", "yy/MM/dd HH:mm:ss", null);
    }
}
