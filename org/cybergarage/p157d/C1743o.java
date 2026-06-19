package org.cybergarage.p157d;

import org.cybergarage.p154a.C1634l;

/* JADX INFO: renamed from: org.cybergarage.d.o */
/* JADX INFO: compiled from: UPnPStatus.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1743o {

    /* JADX INFO: renamed from: a */
    private int f6519a = 0;

    /* JADX INFO: renamed from: b */
    private String f6520b = "";

    /* JADX INFO: renamed from: a */
    public static final String m5111a(int i) {
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
                return C1634l.m4696a(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m5112a() {
        return this.f6519a;
    }

    /* JADX INFO: renamed from: b */
    public final void m5115b(int i) {
        this.f6519a = i;
    }

    /* JADX INFO: renamed from: b */
    public final String m5114b() {
        return this.f6520b;
    }

    /* JADX INFO: renamed from: a */
    public final void m5113a(String str) {
        this.f6520b = str;
    }
}
