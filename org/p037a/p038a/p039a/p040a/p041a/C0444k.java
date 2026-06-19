package org.p037a.p038a.p039a.p040a.p041a;

import java.text.ParseException;
import org.p037a.p038a.p039a.p040a.C0453d;
import org.p037a.p038a.p039a.p040a.C0456g;

/* JADX INFO: renamed from: org.a.a.a.a.a.k */
/* JADX INFO: compiled from: OS2FTPEntryParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0444k extends AbstractC0435b {
    public C0444k() {
        this(null);
    }

    public C0444k(C0453d c0453d) {
        super("\\s*([0-9]+)\\s*(\\s+|[A-Z]+)\\s*(DIR|\\s+)\\s*(\\S+)\\s+(\\S+)\\s+(\\S.*)");
        mo1178a(c0453d);
    }

    @Override // org.p037a.p038a.p039a.p040a.InterfaceC0457h
    /* JADX INFO: renamed from: a */
    public final C0456g mo1179a(String str) {
        C0456g c0456g = new C0456g();
        if (m1196c(str)) {
            String strA = m1195a(1);
            String strA2 = m1195a(2);
            String strA3 = m1195a(3);
            String str2 = m1195a(4) + " " + m1195a(5);
            String strA4 = m1195a(6);
            try {
                c0456g.m1247a(super.m1181b(str2));
            } catch (ParseException e) {
            }
            if (strA3.trim().equals("DIR") || strA2.trim().equals("DIR")) {
                c0456g.m1243a(1);
            } else {
                c0456g.m1243a(0);
            }
            c0456g.m1250b(strA4.trim());
            c0456g.m1245a(Long.parseLong(strA.trim()));
            return c0456g;
        }
        return null;
    }

    @Override // org.p037a.p038a.p039a.p040a.p041a.AbstractC0435b
    /* JADX INFO: renamed from: a */
    protected final C0453d mo1180a() {
        return new C0453d("OS/2", "MM-dd-yy HH:mm", null);
    }
}
