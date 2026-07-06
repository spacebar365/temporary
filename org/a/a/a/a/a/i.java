package org.a.a.a.a.a;

import java.text.ParseException;

/* JADX INFO: compiled from: NTFTPEntryParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class i extends b {
    private final e b;

    public i() {
        this(null);
    }

    public i(org.a.a.a.a.d dVar) {
        super("(\\S+)\\s+(\\S+)\\s+(?:(<DIR>)|([0-9]+))\\s+(\\S.*)", (byte) 0);
        a(dVar);
        org.a.a.a.a.d dVar2 = new org.a.a.a.a.d("WINDOWS", "MM-dd-yy kk:mm", null);
        dVar2.a("MM-dd-yy kk:mm");
        this.b = new f();
        ((org.a.a.a.a.a) this.b).a(dVar2);
    }

    @Override // org.a.a.a.a.h
    public final org.a.a.a.a.g a(String str) {
        org.a.a.a.a.g gVar = new org.a.a.a.a.g();
        gVar.a(str);
        if (!c(str)) {
            return null;
        }
        String str2 = a(1) + " " + a(2);
        String strA = a(3);
        String strA2 = a(4);
        String strA3 = a(5);
        try {
            gVar.a(super.b(str2));
        } catch (ParseException e) {
            try {
                gVar.a(this.b.a(str2));
            } catch (ParseException e2) {
            }
        }
        if (strA3 == null || strA3.equals(".") || strA3.equals("..")) {
            return null;
        }
        gVar.b(strA3);
        if ("<DIR>".equals(strA)) {
            gVar.a(1);
            gVar.a(0L);
            return gVar;
        }
        gVar.a(0);
        if (strA2 != null) {
            gVar.a(Long.parseLong(strA2));
            return gVar;
        }
        return gVar;
    }

    @Override // org.a.a.a.a.a.b
    public final org.a.a.a.a.d a() {
        return new org.a.a.a.a.d("WINDOWS", "MM-dd-yy hh:mma", null);
    }
}
