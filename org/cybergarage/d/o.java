package org.cybergarage.d;

/* JADX INFO: compiled from: UPnPStatus.java */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    private int a = 0;
    private String b = "";

    public static final String a(int i) {
        switch (i) {
            case 401:
                return "Invalid Action";
            case 402:
                return "Invalid Args";
            case 403:
                return "Out of Sync";
            case 404:
                return "Invalid Var";
            case 412:
                return "Precondition Failed";
            case 501:
                return "Action Failed";
            default:
                return org.cybergarage.a.l.a(i);
        }
    }

    public final int a() {
        return this.a;
    }

    public final void b(int i) {
        this.a = i;
    }

    public final String b() {
        return this.b;
    }

    public final void a(String str) {
        this.b = str;
    }
}
