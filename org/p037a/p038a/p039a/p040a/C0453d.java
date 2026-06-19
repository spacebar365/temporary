package org.p037a.p038a.p039a.p040a;

import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

/* JADX INFO: renamed from: org.a.a.a.a.d */
/* JADX INFO: compiled from: FTPClientConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0453d {

    /* JADX INFO: renamed from: i */
    private static final Map<String, Object> f1617i;

    /* JADX INFO: renamed from: a */
    private final String f1618a;

    /* JADX INFO: renamed from: b */
    private String f1619b;

    /* JADX INFO: renamed from: c */
    private String f1620c;

    /* JADX INFO: renamed from: d */
    private boolean f1621d;

    /* JADX INFO: renamed from: e */
    private String f1622e;

    /* JADX INFO: renamed from: f */
    private String f1623f;

    /* JADX INFO: renamed from: g */
    private String f1624g;

    /* JADX INFO: renamed from: h */
    private boolean f1625h;

    private C0453d(String str) {
        this.f1619b = null;
        this.f1620c = null;
        this.f1621d = true;
        this.f1622e = null;
        this.f1623f = null;
        this.f1624g = null;
        this.f1625h = false;
        this.f1618a = str;
    }

    public C0453d() {
        this("UNIX");
    }

    public C0453d(String str, String str2, String str3) {
        this(str);
        this.f1619b = str2;
        this.f1620c = str3;
    }

    C0453d(String str, C0453d c0453d) {
        this.f1619b = null;
        this.f1620c = null;
        this.f1621d = true;
        this.f1622e = null;
        this.f1623f = null;
        this.f1624g = null;
        this.f1625h = false;
        this.f1618a = str;
        this.f1619b = c0453d.f1619b;
        this.f1621d = c0453d.f1621d;
        this.f1620c = c0453d.f1620c;
        this.f1625h = c0453d.f1625h;
        this.f1622e = c0453d.f1622e;
        this.f1624g = c0453d.f1624g;
        this.f1623f = c0453d.f1623f;
    }

    public C0453d(C0453d c0453d) {
        this.f1619b = null;
        this.f1620c = null;
        this.f1621d = true;
        this.f1622e = null;
        this.f1623f = null;
        this.f1624g = null;
        this.f1625h = false;
        this.f1618a = c0453d.f1618a;
        this.f1619b = c0453d.f1619b;
        this.f1621d = c0453d.f1621d;
        this.f1620c = c0453d.f1620c;
        this.f1625h = c0453d.f1625h;
        this.f1622e = c0453d.f1622e;
        this.f1624g = c0453d.f1624g;
        this.f1623f = c0453d.f1623f;
    }

    static {
        TreeMap treeMap = new TreeMap();
        f1617i = treeMap;
        treeMap.put("en", Locale.ENGLISH);
        f1617i.put("de", Locale.GERMAN);
        f1617i.put("it", Locale.ITALIAN);
        f1617i.put("es", new Locale("es", "", ""));
        f1617i.put("pt", new Locale("pt", "", ""));
        f1617i.put("da", new Locale("da", "", ""));
        f1617i.put("sv", new Locale("sv", "", ""));
        f1617i.put("no", new Locale("no", "", ""));
        f1617i.put("nl", new Locale("nl", "", ""));
        f1617i.put("ro", new Locale("ro", "", ""));
        f1617i.put("sq", new Locale("sq", "", ""));
        f1617i.put("sh", new Locale("sh", "", ""));
        f1617i.put("sk", new Locale("sk", "", ""));
        f1617i.put("sl", new Locale("sl", "", ""));
        f1617i.put("fr", "jan|fév|mar|avr|mai|jun|jui|aoû|sep|oct|nov|déc");
    }

    /* JADX INFO: renamed from: a */
    public final String m1233a() {
        return this.f1618a;
    }

    /* JADX INFO: renamed from: b */
    public final String m1235b() {
        return this.f1619b;
    }

    /* JADX INFO: renamed from: c */
    public final String m1237c() {
        return this.f1620c;
    }

    /* JADX INFO: renamed from: d */
    public final String m1238d() {
        return this.f1624g;
    }

    /* JADX INFO: renamed from: e */
    public final String m1239e() {
        return this.f1623f;
    }

    /* JADX INFO: renamed from: f */
    public final String m1240f() {
        return this.f1622e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1241g() {
        return this.f1621d;
    }

    /* JADX INFO: renamed from: a */
    public final void m1234a(String str) {
        this.f1619b = str;
    }

    /* JADX INFO: renamed from: b */
    public final void m1236b(String str) {
        this.f1620c = str;
    }

    /* JADX INFO: renamed from: c */
    public static DateFormatSymbols m1230c(String str) {
        Object obj = f1617i.get(str);
        if (obj != null) {
            if (obj instanceof Locale) {
                return new DateFormatSymbols((Locale) obj);
            }
            if (obj instanceof String) {
                return m1231d((String) obj);
            }
        }
        return new DateFormatSymbols(Locale.US);
    }

    /* JADX INFO: renamed from: d */
    public static DateFormatSymbols m1231d(String str) {
        String[] strArrM1232e = m1232e(str);
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(Locale.US);
        dateFormatSymbols.setShortMonths(strArrM1232e);
        return dateFormatSymbols;
    }

    /* JADX INFO: renamed from: e */
    private static String[] m1232e(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "|");
        if (12 != stringTokenizer.countTokens()) {
            throw new IllegalArgumentException("expecting a pipe-delimited string containing 12 tokens");
        }
        String[] strArr = new String[13];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            strArr[i] = stringTokenizer.nextToken();
            i++;
        }
        strArr[i] = "";
        return strArr;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1242h() {
        return this.f1625h;
    }
}
