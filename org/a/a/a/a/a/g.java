package org.a.a.a.a.a;

import java.text.ParseException;
import java.util.List;

/* JADX INFO: compiled from: MVSFTPEntryParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class g extends b {
    private int b;
    private o c;

    public g() {
        super("");
        this.b = -1;
        super.a((org.a.a.a.a.d) null);
    }

    @Override // org.a.a.a.a.h
    public final org.a.a.a.a.g a(String str) {
        boolean z = true;
        boolean z2 = false;
        org.a.a.a.a.g gVar = new org.a.a.a.a.g();
        if (this.b != 0) {
            if (this.b == 1) {
                boolean zA = a(gVar, str);
                if (zA) {
                    z2 = zA;
                } else {
                    if (str == null || str.trim().length() <= 0) {
                        z = false;
                    } else {
                        gVar.a(str);
                        gVar.b(str.split(" ")[0]);
                        gVar.a(0);
                    }
                    z2 = z;
                }
            } else if (this.b != 2) {
                if (this.b != 3) {
                    if (this.b == 4) {
                        if (c(str) && a(4).equalsIgnoreCase("OUTPUT")) {
                            gVar.a(str);
                            gVar.b(a(2));
                            gVar.a(0);
                        } else {
                            z = false;
                        }
                        z2 = z;
                    }
                } else {
                    if (c(str) && a(3).equalsIgnoreCase("OUTPUT")) {
                        gVar.a(str);
                        gVar.b(a(2));
                        gVar.a(0);
                    } else {
                        z = false;
                    }
                    z2 = z;
                }
            } else if (this.c.a(str) != null) {
                z2 = true;
            }
        } else if (c(str)) {
            gVar.a(str);
            String strA = a(2);
            String strA2 = a(1);
            gVar.b(strA);
            if ("PS".equals(strA2)) {
                gVar.a(0);
            } else if ("PO".equals(strA2) || "PO-E".equals(strA2)) {
                gVar.a(1);
            }
            z2 = true;
        }
        if (z2) {
            return gVar;
        }
        return null;
    }

    private boolean a(org.a.a.a.a.g gVar, String str) {
        if (!c(str)) {
            return false;
        }
        gVar.a(str);
        String strA = a(1);
        String str2 = a(2) + " " + a(3);
        gVar.b(strA);
        gVar.a(0);
        try {
            gVar.a(super.b(str2));
            return true;
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // org.a.a.a.a.i, org.a.a.a.a.h
    public final List<String> a(List<String> list) {
        if (list != null && list.size() > 0) {
            String str = list.get(0);
            if (str.indexOf("Volume") < 0 || str.indexOf("Dsname") < 0) {
                if (str.indexOf("Name") < 0 || str.indexOf("Id") < 0) {
                    if (str.indexOf("total") != 0) {
                        if (str.indexOf("Spool Files") < 30) {
                            if (str.indexOf("JOBNAME") == 0 && str.indexOf("JOBID") > 8) {
                                this.b = 4;
                                super.d("(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+).*");
                            } else {
                                this.b = -1;
                            }
                        } else {
                            this.b = 3;
                            super.d("(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s*");
                        }
                    } else {
                        this.b = 2;
                        this.c = new o();
                    }
                } else {
                    this.b = 1;
                    super.d("(\\S+)\\s+\\S+\\s+\\S+\\s+(\\S+)\\s+(\\S+)\\s+\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s*");
                }
            } else {
                this.b = 0;
                super.d("\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s+[FV]\\S*\\s+\\S+\\s+\\S+\\s+(PS|PO|PO-E)\\s+(\\S+)\\s*");
            }
            if (this.b != 3) {
                list.remove(0);
            }
        }
        return list;
    }

    @Override // org.a.a.a.a.a.b
    protected final org.a.a.a.a.d a() {
        return new org.a.a.a.a.d("MVS", "yyyy/MM/dd HH:mm", null);
    }
}
