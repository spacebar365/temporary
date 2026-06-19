package org.p037a.p038a.p039a.p040a.p041a;

import java.text.ParseException;
import java.util.List;
import org.p037a.p038a.p039a.p040a.C0453d;
import org.p037a.p038a.p039a.p040a.C0456g;

/* JADX INFO: renamed from: org.a.a.a.a.a.g */
/* JADX INFO: compiled from: MVSFTPEntryParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0440g extends AbstractC0435b {

    /* JADX INFO: renamed from: b */
    private int f1564b;

    /* JADX INFO: renamed from: c */
    private C0448o f1565c;

    public C0440g() {
        super("");
        this.f1564b = -1;
        super.mo1178a((C0453d) null);
    }

    @Override // org.p037a.p038a.p039a.p040a.InterfaceC0457h
    /* JADX INFO: renamed from: a */
    public final C0456g mo1179a(String str) {
        boolean z = true;
        boolean z2 = false;
        C0456g c0456g = new C0456g();
        if (this.f1564b != 0) {
            if (this.f1564b == 1) {
                boolean zM1191a = m1191a(c0456g, str);
                if (zM1191a) {
                    z2 = zM1191a;
                } else {
                    if (str == null || str.trim().length() <= 0) {
                        z = false;
                    } else {
                        c0456g.m1246a(str);
                        c0456g.m1250b(str.split(" ")[0]);
                        c0456g.m1243a(0);
                    }
                    z2 = z;
                }
            } else if (this.f1564b != 2) {
                if (this.f1564b != 3) {
                    if (this.f1564b == 4) {
                        if (m1196c(str) && m1195a(4).equalsIgnoreCase("OUTPUT")) {
                            c0456g.m1246a(str);
                            c0456g.m1250b(m1195a(2));
                            c0456g.m1243a(0);
                        } else {
                            z = false;
                        }
                        z2 = z;
                    }
                } else {
                    if (m1196c(str) && m1195a(3).equalsIgnoreCase("OUTPUT")) {
                        c0456g.m1246a(str);
                        c0456g.m1250b(m1195a(2));
                        c0456g.m1243a(0);
                    } else {
                        z = false;
                    }
                    z2 = z;
                }
            } else if (this.f1565c.mo1179a(str) != null) {
                z2 = true;
            }
        } else if (m1196c(str)) {
            c0456g.m1246a(str);
            String strA = m1195a(2);
            String strA2 = m1195a(1);
            c0456g.m1250b(strA);
            if ("PS".equals(strA2)) {
                c0456g.m1243a(0);
            } else if ("PO".equals(strA2) || "PO-E".equals(strA2)) {
                c0456g.m1243a(1);
            }
            z2 = true;
        }
        if (z2) {
            return c0456g;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private boolean m1191a(C0456g c0456g, String str) {
        if (!m1196c(str)) {
            return false;
        }
        c0456g.m1246a(str);
        String strA = m1195a(1);
        String str2 = m1195a(2) + " " + m1195a(3);
        c0456g.m1250b(strA);
        c0456g.m1243a(0);
        try {
            c0456g.m1247a(super.m1181b(str2));
            return true;
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // org.p037a.p038a.p039a.p040a.AbstractC0458i, org.p037a.p038a.p039a.p040a.InterfaceC0457h
    /* JADX INFO: renamed from: a */
    public final List<String> mo1192a(List<String> list) {
        if (list != null && list.size() > 0) {
            String str = list.get(0);
            if (str.indexOf("Volume") < 0 || str.indexOf("Dsname") < 0) {
                if (str.indexOf("Name") < 0 || str.indexOf("Id") < 0) {
                    if (str.indexOf("total") != 0) {
                        if (str.indexOf("Spool Files") < 30) {
                            if (str.indexOf("JOBNAME") == 0 && str.indexOf("JOBID") > 8) {
                                this.f1564b = 4;
                                super.m1197d("(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+).*");
                            } else {
                                this.f1564b = -1;
                            }
                        } else {
                            this.f1564b = 3;
                            super.m1197d("(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s*");
                        }
                    } else {
                        this.f1564b = 2;
                        this.f1565c = new C0448o();
                    }
                } else {
                    this.f1564b = 1;
                    super.m1197d("(\\S+)\\s+\\S+\\s+\\S+\\s+(\\S+)\\s+(\\S+)\\s+\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s*");
                }
            } else {
                this.f1564b = 0;
                super.m1197d("\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s+[FV]\\S*\\s+\\S+\\s+\\S+\\s+(PS|PO|PO-E)\\s+(\\S+)\\s*");
            }
            if (this.f1564b != 3) {
                list.remove(0);
            }
        }
        return list;
    }

    @Override // org.p037a.p038a.p039a.p040a.p041a.AbstractC0435b
    /* JADX INFO: renamed from: a */
    protected final C0453d mo1180a() {
        return new C0453d("MVS", "yyyy/MM/dd HH:mm", null);
    }
}
