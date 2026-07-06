package org.bouncycastle.a;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class bz {
    private static Long b = 0L;
    private static final Map c = new HashMap();
    static Locale a = a();

    private static Locale a() {
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

    static Date a(Date date) {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return date;
        }
        synchronized (c) {
            Long lValueOf = (Long) c.get(locale);
            if (lValueOf == null) {
                long time = new SimpleDateFormat("yyyyMMddHHmmssz").parse("19700101000000GMT+00:00").getTime();
                lValueOf = time == 0 ? b : Long.valueOf(time);
                c.put(locale, lValueOf);
            }
            Long l = lValueOf;
            if (l != b) {
                return new Date(date.getTime() - l.longValue());
            }
            return date;
        }
    }
}
