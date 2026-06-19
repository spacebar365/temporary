package org.p037a.p038a.p039a.p040a.p041a;

import java.text.ParseException;
import org.p037a.p038a.p039a.p040a.C0453d;
import org.p037a.p038a.p039a.p040a.C0456g;

/* JADX INFO: renamed from: org.a.a.a.a.a.j */
/* JADX INFO: compiled from: NetwareFTPEntryParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0443j extends AbstractC0435b {
    public C0443j() {
        this(null);
    }

    public C0443j(C0453d c0453d) {
        super("(d|-){1}\\s+\\[([-A-Z]+)\\]\\s+(\\S+)\\s+(\\d+)\\s+(\\S+\\s+\\S+\\s+((\\d+:\\d+)|(\\d{4})))\\s+(.*)");
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
            String strA4 = m1195a(4);
            String strA5 = m1195a(5);
            String strA6 = m1195a(9);
            try {
                c0456g.m1247a(super.m1181b(strA5));
            } catch (ParseException e) {
            }
            if (strA.trim().equals("d")) {
                c0456g.m1243a(1);
            } else {
                c0456g.m1243a(0);
            }
            c0456g.m1255d(strA3);
            c0456g.m1250b(strA6.trim());
            c0456g.m1245a(Long.parseLong(strA4.trim()));
            if (strA2.indexOf("R") != -1) {
                c0456g.m1244a(0, 0, true);
            }
            if (strA2.indexOf("W") != -1) {
                c0456g.m1244a(0, 1, true);
                return c0456g;
            }
            return c0456g;
        }
        return null;
    }

    @Override // org.p037a.p038a.p039a.p040a.p041a.AbstractC0435b
    /* JADX INFO: renamed from: a */
    protected final C0453d mo1180a() {
        return new C0453d("NETWARE", "MMM dd yyyy", "MMM dd HH:mm");
    }
}
