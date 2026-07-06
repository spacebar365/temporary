package org.a.a.a.a;

import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

/* JADX INFO: compiled from: FTPClientConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    private static final Map<String, Object> i;
    private final String a;
    private String b;
    private String c;
    private boolean d;
    private String e;
    private String f;
    private String g;
    private boolean h;

    private d(String str) {
        this.b = null;
        this.c = null;
        this.d = true;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = false;
        this.a = str;
    }

    public d() {
        this("UNIX");
    }

    public d(String str, String str2, String str3) {
        this(str);
        this.b = str2;
        this.c = str3;
    }

    d(String str, d dVar) {
        this.b = null;
        this.c = null;
        this.d = true;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = false;
        this.a = str;
        this.b = dVar.b;
        this.d = dVar.d;
        this.c = dVar.c;
        this.h = dVar.h;
        this.e = dVar.e;
        this.g = dVar.g;
        this.f = dVar.f;
    }

    public d(d dVar) {
        this.b = null;
        this.c = null;
        this.d = true;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = false;
        this.a = dVar.a;
        this.b = dVar.b;
        this.d = dVar.d;
        this.c = dVar.c;
        this.h = dVar.h;
        this.e = dVar.e;
        this.g = dVar.g;
        this.f = dVar.f;
    }

    static {
        TreeMap treeMap = new TreeMap();
        i = treeMap;
        treeMap.put("en", Locale.ENGLISH);
        i.put("de", Locale.GERMAN);
        i.put("it", Locale.ITALIAN);
        i.put("es", new Locale("es", "", ""));
        i.put("pt", new Locale("pt", "", ""));
        i.put("da", new Locale("da", "", ""));
        i.put("sv", new Locale("sv", "", ""));
        i.put("no", new Locale("no", "", ""));
        i.put("nl", new Locale("nl", "", ""));
        i.put("ro", new Locale("ro", "", ""));
        i.put("sq", new Locale("sq", "", ""));
        i.put("sh", new Locale("sh", "", ""));
        i.put("sk", new Locale("sk", "", ""));
        i.put("sl", new Locale("sl", "", ""));
        i.put("fr", "jan|fév|mar|avr|mai|jun|jui|aoû|sep|oct|nov|déc");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.g;
    }

    public final String e() {
        return this.f;
    }

    public final String f() {
        return this.e;
    }

    public final boolean g() {
        return this.d;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final void b(String str) {
        this.c = str;
    }

    public static DateFormatSymbols c(String str) {
        Object obj = i.get(str);
        if (obj != null) {
            if (obj instanceof Locale) {
                return new DateFormatSymbols((Locale) obj);
            }
            if (obj instanceof String) {
                return d((String) obj);
            }
        }
        return new DateFormatSymbols(Locale.US);
    }

    public static DateFormatSymbols d(String str) {
        String[] strArrE = e(str);
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(Locale.US);
        dateFormatSymbols.setShortMonths(strArrE);
        return dateFormatSymbols;
    }

    private static String[] e(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "|");
        if (12 != stringTokenizer.countTokens()) {
            throw new IllegalArgumentException("expecting a pipe-delimited string containing 12 tokens");
        }
        String[] strArr = new String[13];
        int i2 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            strArr[i2] = stringTokenizer.nextToken();
            i2++;
        }
        strArr[i2] = "";
        return strArr;
    }

    public final boolean h() {
        return this.h;
    }
}
