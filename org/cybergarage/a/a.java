package org.cybergarage.a;

import java.util.Calendar;

/* JADX INFO: compiled from: Date.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static final String[] b = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private static final String[] c = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    private Calendar a;

    public a(Calendar calendar) {
        this.a = calendar;
    }

    private static String a(int i) {
        String str = "";
        if (i < 10) {
            str = String.valueOf("") + "0";
        }
        return String.valueOf(str) + Integer.toString(i);
    }

    public final String a() {
        String str;
        String str2;
        Calendar calendar = this.a;
        int i = calendar.get(7) - 1;
        if (i >= 0 && i < 7) {
            str = c[i];
        } else {
            str = "";
        }
        StringBuilder sbAppend = new StringBuilder(String.valueOf(str)).append(", ").append(a(calendar.get(5))).append(" ");
        int i2 = calendar.get(2) + 0;
        if (i2 >= 0 && i2 < 12) {
            str2 = b[i2];
        } else {
            str2 = "";
        }
        return sbAppend.append(str2).append(" ").append(Integer.toString(calendar.get(1))).append(" ").append(a(calendar.get(11))).append(":").append(a(calendar.get(12))).append(":").append(a(calendar.get(13))).append(" GMT").toString();
    }
}
