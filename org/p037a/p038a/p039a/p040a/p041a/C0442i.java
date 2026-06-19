package org.p037a.p038a.p039a.p040a.p041a;

import java.text.ParseException;
import org.p037a.p038a.p039a.p040a.C0453d;
import org.p037a.p038a.p039a.p040a.C0456g;
import org.p037a.p038a.p039a.p040a.InterfaceC0433a;

/* JADX INFO: renamed from: org.a.a.a.a.a.i */
/* JADX INFO: compiled from: NTFTPEntryParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0442i extends AbstractC0435b {

    /* JADX INFO: renamed from: b */
    private final InterfaceC0438e f1566b;

    public C0442i() {
        this(null);
    }

    public C0442i(C0453d c0453d) {
        super("(\\S+)\\s+(\\S+)\\s+(?:(<DIR>)|([0-9]+))\\s+(\\S.*)", (byte) 0);
        mo1178a(c0453d);
        C0453d c0453d2 = new C0453d("WINDOWS", "MM-dd-yy kk:mm", null);
        c0453d2.m1234a("MM-dd-yy kk:mm");
        this.f1566b = new C0439f();
        ((InterfaceC0433a) this.f1566b).mo1178a(c0453d2);
    }

    @Override // org.p037a.p038a.p039a.p040a.InterfaceC0457h
    /* JADX INFO: renamed from: a */
    public final C0456g mo1179a(String str) {
        C0456g c0456g = new C0456g();
        c0456g.m1246a(str);
        if (!m1196c(str)) {
            return null;
        }
        String str2 = m1195a(1) + " " + m1195a(2);
        String strA = m1195a(3);
        String strA2 = m1195a(4);
        String strA3 = m1195a(5);
        try {
            c0456g.m1247a(super.m1181b(str2));
        } catch (ParseException e) {
            try {
                c0456g.m1247a(this.f1566b.mo1185a(str2));
            } catch (ParseException e2) {
            }
        }
        if (strA3 == null || strA3.equals(".") || strA3.equals("..")) {
            return null;
        }
        c0456g.m1250b(strA3);
        if ("<DIR>".equals(strA)) {
            c0456g.m1243a(1);
            c0456g.m1245a(0L);
            return c0456g;
        }
        c0456g.m1243a(0);
        if (strA2 != null) {
            c0456g.m1245a(Long.parseLong(strA2));
            return c0456g;
        }
        return c0456g;
    }

    @Override // org.p037a.p038a.p039a.p040a.p041a.AbstractC0435b
    /* JADX INFO: renamed from: a */
    public final C0453d mo1180a() {
        return new C0453d("WINDOWS", "MM-dd-yy hh:mma", null);
    }
}
