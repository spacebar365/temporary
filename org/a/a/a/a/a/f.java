package org.a.a.a.a.a;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: compiled from: FTPTimestampParserImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements org.a.a.a.a.a, e {
    private static final int[] f = {14, 13, 12, 11, 5, 2, 1};
    private SimpleDateFormat a;
    private int b;
    private SimpleDateFormat c;
    private int d;
    private boolean e = false;

    private static int a(SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat == null) {
            return 0;
        }
        String pattern = simpleDateFormat.toPattern();
        for (char c : "SsmHdM".toCharArray()) {
            if (pattern.indexOf(c) != -1) {
                switch (c) {
                    case 'H':
                        return a(11);
                    case 'M':
                        return a(2);
                    case 'S':
                        return a(14);
                    case 'd':
                        return a(5);
                    case 'm':
                        return a(12);
                    case 's':
                        return a(13);
                }
            }
        }
        return 0;
    }

    private static int a(int i) {
        for (int i2 = 0; i2 < f.length; i2++) {
            if (i == f[i2]) {
                return i2;
            }
        }
        return 0;
    }

    private static void a(int i, Calendar calendar) {
        if (i > 0) {
            int i2 = f[i - 1];
            if (calendar.get(i2) == 0) {
                calendar.clear(i2);
            }
        }
    }

    public f() {
        a("MMM d yyyy", (DateFormatSymbols) null);
        b("MMM d HH:mm", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a7  */
    @Override // org.a.a.a.a.a.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Calendar a(java.lang.String r10) throws java.text.ParseException {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.a.a.a.a.a.f.a(java.lang.String):java.util.Calendar");
    }

    private void a(String str, DateFormatSymbols dateFormatSymbols) {
        if (str != null) {
            if (dateFormatSymbols != null) {
                this.a = new SimpleDateFormat(str, dateFormatSymbols);
            } else {
                this.a = new SimpleDateFormat(str);
            }
            this.a.setLenient(false);
        } else {
            this.a = null;
        }
        this.b = a(this.a);
    }

    private void b(String str, DateFormatSymbols dateFormatSymbols) {
        if (str != null) {
            if (dateFormatSymbols != null) {
                this.c = new SimpleDateFormat(str, dateFormatSymbols);
            } else {
                this.c = new SimpleDateFormat(str);
            }
            this.c.setLenient(false);
        } else {
            this.c = null;
        }
        this.d = a(this.c);
    }

    @Override // org.a.a.a.a.a
    public final void a(org.a.a.a.a.d dVar) {
        DateFormatSymbols dateFormatSymbolsC;
        String strF = dVar.f();
        String strE = dVar.e();
        if (strE != null) {
            dateFormatSymbolsC = org.a.a.a.a.d.d(strE);
        } else if (strF != null) {
            dateFormatSymbolsC = org.a.a.a.a.d.c(strF);
        } else {
            dateFormatSymbolsC = org.a.a.a.a.d.c("en");
        }
        b(dVar.c(), dateFormatSymbolsC);
        String strB = dVar.b();
        if (strB == null) {
            throw new IllegalArgumentException("defaultFormatString cannot be null");
        }
        a(strB, dateFormatSymbolsC);
        String strD = dVar.d();
        TimeZone timeZone = TimeZone.getDefault();
        if (strD != null) {
            timeZone = TimeZone.getTimeZone(strD);
        }
        this.a.setTimeZone(timeZone);
        if (this.c != null) {
            this.c.setTimeZone(timeZone);
        }
        this.e = dVar.g();
    }
}
