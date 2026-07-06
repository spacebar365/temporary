package org.a.a.a.a.a;

import java.text.ParseException;

/* JADX INFO: compiled from: OS2FTPEntryParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class k extends b {
    public k() {
        this(null);
    }

    public k(org.a.a.a.a.d dVar) {
        super("\\s*([0-9]+)\\s*(\\s+|[A-Z]+)\\s*(DIR|\\s+)\\s*(\\S+)\\s+(\\S+)\\s+(\\S.*)");
        a(dVar);
    }

    @Override // org.a.a.a.a.h
    public final org.a.a.a.a.g a(String str) {
        org.a.a.a.a.g gVar = new org.a.a.a.a.g();
        if (c(str)) {
            String strA = a(1);
            String strA2 = a(2);
            String strA3 = a(3);
            String str2 = a(4) + " " + a(5);
            String strA4 = a(6);
            try {
                gVar.a(super.b(str2));
            } catch (ParseException e) {
            }
            if (strA3.trim().equals("DIR") || strA2.trim().equals("DIR")) {
                gVar.a(1);
            } else {
                gVar.a(0);
            }
            gVar.b(strA4.trim());
            gVar.a(Long.parseLong(strA.trim()));
            return gVar;
        }
        return null;
    }

    @Override // org.a.a.a.a.a.b
    protected final org.a.a.a.a.d a() {
        return new org.a.a.a.a.d("OS/2", "MM-dd-yy HH:mm", null);
    }
}
