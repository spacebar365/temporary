package org.p037a.p038a.p039a.p040a.p041a;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import org.p037a.p038a.p039a.p040a.C0453d;
import org.p037a.p038a.p039a.p040a.InterfaceC0433a;

/* JADX INFO: renamed from: org.a.a.a.a.a.f */
/* JADX INFO: compiled from: FTPTimestampParserImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0439f implements InterfaceC0433a, InterfaceC0438e {

    /* JADX INFO: renamed from: f */
    private static final int[] f1558f = {14, 13, 12, 11, 5, 2, 1};

    /* JADX INFO: renamed from: a */
    private SimpleDateFormat f1559a;

    /* JADX INFO: renamed from: b */
    private int f1560b;

    /* JADX INFO: renamed from: c */
    private SimpleDateFormat f1561c;

    /* JADX INFO: renamed from: d */
    private int f1562d;

    /* JADX INFO: renamed from: e */
    private boolean f1563e = false;

    /* JADX INFO: renamed from: a */
    private static int m1187a(SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat == null) {
            return 0;
        }
        String pattern = simpleDateFormat.toPattern();
        for (char c : "SsmHdM".toCharArray()) {
            if (pattern.indexOf(c) != -1) {
                switch (c) {
                    case 'H':
                        return m1186a(11);
                    case 'M':
                        return m1186a(2);
                    case 'S':
                        return m1186a(14);
                    case 'd':
                        return m1186a(5);
                    case 'm':
                        return m1186a(12);
                    case 's':
                        return m1186a(13);
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private static int m1186a(int i) {
        for (int i2 = 0; i2 < f1558f.length; i2++) {
            if (i == f1558f[i2]) {
                return i2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private static void m1188a(int i, Calendar calendar) {
        if (i > 0) {
            int i2 = f1558f[i - 1];
            if (calendar.get(i2) == 0) {
                calendar.clear(i2);
            }
        }
    }

    public C0439f() {
        m1189a("MMM d yyyy", (DateFormatSymbols) null);
        m1190b("MMM d HH:mm", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a7  */
    @Override // org.p037a.p038a.p039a.p040a.p041a.InterfaceC0438e
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Calendar mo1185a(java.lang.String r10) throws java.text.ParseException {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p037a.p038a.p039a.p040a.p041a.C0439f.mo1185a(java.lang.String):java.util.Calendar");
    }

    /* JADX INFO: renamed from: a */
    private void m1189a(String str, DateFormatSymbols dateFormatSymbols) {
        if (str != null) {
            if (dateFormatSymbols != null) {
                this.f1559a = new SimpleDateFormat(str, dateFormatSymbols);
            } else {
                this.f1559a = new SimpleDateFormat(str);
            }
            this.f1559a.setLenient(false);
        } else {
            this.f1559a = null;
        }
        this.f1560b = m1187a(this.f1559a);
    }

    /* JADX INFO: renamed from: b */
    private void m1190b(String str, DateFormatSymbols dateFormatSymbols) {
        if (str != null) {
            if (dateFormatSymbols != null) {
                this.f1561c = new SimpleDateFormat(str, dateFormatSymbols);
            } else {
                this.f1561c = new SimpleDateFormat(str);
            }
            this.f1561c.setLenient(false);
        } else {
            this.f1561c = null;
        }
        this.f1562d = m1187a(this.f1561c);
    }

    @Override // org.p037a.p038a.p039a.p040a.InterfaceC0433a
    /* JADX INFO: renamed from: a */
    public final void mo1178a(C0453d c0453d) {
        DateFormatSymbols dateFormatSymbolsM1230c;
        String strM1240f = c0453d.m1240f();
        String strM1239e = c0453d.m1239e();
        if (strM1239e != null) {
            dateFormatSymbolsM1230c = C0453d.m1231d(strM1239e);
        } else if (strM1240f != null) {
            dateFormatSymbolsM1230c = C0453d.m1230c(strM1240f);
        } else {
            dateFormatSymbolsM1230c = C0453d.m1230c("en");
        }
        m1190b(c0453d.m1237c(), dateFormatSymbolsM1230c);
        String strM1235b = c0453d.m1235b();
        if (strM1235b == null) {
            throw new IllegalArgumentException("defaultFormatString cannot be null");
        }
        m1189a(strM1235b, dateFormatSymbolsM1230c);
        String strM1238d = c0453d.m1238d();
        TimeZone timeZone = TimeZone.getDefault();
        if (strM1238d != null) {
            timeZone = TimeZone.getTimeZone(strM1238d);
        }
        this.f1559a.setTimeZone(timeZone);
        if (this.f1561c != null) {
            this.f1561c.setTimeZone(timeZone);
        }
        this.f1563e = c0453d.m1241g();
    }
}
