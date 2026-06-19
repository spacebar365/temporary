package org.cybergarage.p154a;

import java.util.Calendar;

/* JADX INFO: renamed from: org.cybergarage.a.a */
/* JADX INFO: compiled from: Date.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1623a {

    /* JADX INFO: renamed from: b */
    private static final String[] f6323b = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    /* JADX INFO: renamed from: c */
    private static final String[] f6324c = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

    /* JADX INFO: renamed from: a */
    private Calendar f6325a;

    public C1623a(Calendar calendar) {
        this.f6325a = calendar;
    }

    /* JADX INFO: renamed from: a */
    private static String m4575a(int i) {
        String str = "";
        if (i < 10) {
            str = String.valueOf("") + "0";
        }
        return String.valueOf(str) + Integer.toString(i);
    }

    /* JADX INFO: renamed from: a */
    public final String m4576a() {
        String str;
        String str2;
        Calendar calendar = this.f6325a;
        int i = calendar.get(7) - 1;
        if (i >= 0 && i < 7) {
            str = f6324c[i];
        } else {
            str = "";
        }
        StringBuilder sbAppend = new StringBuilder(String.valueOf(str)).append(", ").append(m4575a(calendar.get(5))).append(" ");
        int i2 = calendar.get(2) + 0;
        if (i2 >= 0 && i2 < 12) {
            str2 = f6323b[i2];
        } else {
            str2 = "";
        }
        return sbAppend.append(str2).append(" ").append(Integer.toString(calendar.get(1))).append(" ").append(m4575a(calendar.get(11))).append(":").append(m4575a(calendar.get(12))).append(":").append(m4575a(calendar.get(13))).append(" GMT").toString();
    }
}
