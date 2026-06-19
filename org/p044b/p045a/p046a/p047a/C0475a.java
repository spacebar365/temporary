package org.p044b.p045a.p046a.p047a;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: org.b.a.a.a.a */
/* JADX INFO: compiled from: ContentType.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0475a {

    /* JADX INFO: renamed from: a */
    private static final Pattern f1748a = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);

    /* JADX INFO: renamed from: b */
    private static final Pattern f1749b = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

    /* JADX INFO: renamed from: c */
    private static final Pattern f1750c = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

    /* JADX INFO: renamed from: d */
    private final String f1751d;

    /* JADX INFO: renamed from: e */
    private final String f1752e;

    /* JADX INFO: renamed from: f */
    private final String f1753f;

    /* JADX INFO: renamed from: g */
    private final String f1754g;

    public C0475a(String str) {
        this.f1751d = str;
        if (str != null) {
            this.f1752e = m1282a(str, f1748a, "", 1);
            this.f1753f = m1282a(str, f1749b, null, 2);
        } else {
            this.f1752e = "";
            this.f1753f = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f1752e)) {
            this.f1754g = m1282a(str, f1750c, null, 2);
        } else {
            this.f1754g = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m1282a(String str, Pattern pattern, String str2, int i) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(i) : str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m1283a() {
        return this.f1751d;
    }

    /* JADX INFO: renamed from: b */
    public final String m1284b() {
        return this.f1753f == null ? "US-ASCII" : this.f1753f;
    }

    /* JADX INFO: renamed from: c */
    public final C0475a m1285c() {
        if (this.f1753f == null) {
            return new C0475a(String.valueOf(this.f1751d) + "; charset=UTF-8");
        }
        return this;
    }
}
