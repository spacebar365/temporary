package org.bouncycastle.p054a;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: org.bouncycastle.a.bz */
/* JADX INFO: loaded from: classes.dex */
final class C0602bz {

    /* JADX INFO: renamed from: b */
    private static Long f2132b = 0L;

    /* JADX INFO: renamed from: c */
    private static final Map f2133c = new HashMap();

    /* JADX INFO: renamed from: a */
    static Locale f2131a = m1468a();

    /* JADX INFO: renamed from: a */
    private static Locale m1468a() {
        if ("en".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            return Locale.getDefault();
        }
        Locale[] availableLocales = Locale.getAvailableLocales();
        for (int i = 0; i != availableLocales.length; i++) {
            if ("en".equalsIgnoreCase(availableLocales[i].getLanguage())) {
                return availableLocales[i];
            }
        }
        return Locale.getDefault();
    }

    /* JADX INFO: renamed from: a */
    static Date m1467a(Date date) {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return date;
        }
        synchronized (f2133c) {
            Long lValueOf = (Long) f2133c.get(locale);
            if (lValueOf == null) {
                long time = new SimpleDateFormat("yyyyMMddHHmmssz").parse("19700101000000GMT+00:00").getTime();
                lValueOf = time == 0 ? f2132b : Long.valueOf(time);
                f2133c.put(locale, lValueOf);
            }
            Long l = lValueOf;
            if (l != f2132b) {
                return new Date(date.getTime() - l.longValue());
            }
            return date;
        }
    }
}
