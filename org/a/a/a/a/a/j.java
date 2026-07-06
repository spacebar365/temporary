package org.a.a.a.a.a;

import java.text.ParseException;

/* JADX INFO: compiled from: NetwareFTPEntryParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class j extends b {
    public j() {
        this(null);
    }

    public j(org.a.a.a.a.d dVar) {
        super("(d|-){1}\\s+\\[([-A-Z]+)\\]\\s+(\\S+)\\s+(\\d+)\\s+(\\S+\\s+\\S+\\s+((\\d+:\\d+)|(\\d{4})))\\s+(.*)");
        a(dVar);
    }

    @Override // org.a.a.a.a.h
    public final org.a.a.a.a.g a(String str) {
        org.a.a.a.a.g gVar = new org.a.a.a.a.g();
        if (c(str)) {
            String strA = a(1);
            String strA2 = a(2);
            String strA3 = a(3);
            String strA4 = a(4);
            String strA5 = a(5);
            String strA6 = a(9);
            try {
                gVar.a(super.b(strA5));
            } catch (ParseException e) {
            }
            if (strA.trim().equals("d")) {
                gVar.a(1);
            } else {
                gVar.a(0);
            }
            gVar.d(strA3);
            gVar.b(strA6.trim());
            gVar.a(Long.parseLong(strA4.trim()));
            if (strA2.indexOf("R") != -1) {
                gVar.a(0, 0, true);
            }
            if (strA2.indexOf("W") != -1) {
                gVar.a(0, 1, true);
                return gVar;
            }
            return gVar;
        }
        return null;
    }

    @Override // org.a.a.a.a.a.b
    protected final org.a.a.a.a.d a() {
        return new org.a.a.a.a.d("NETWARE", "MMM dd yyyy", "MMM dd HH:mm");
    }
}
