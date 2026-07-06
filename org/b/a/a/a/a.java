package org.b.a.a.a;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: ContentType.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static final Pattern a = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    private static final Pattern b = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    private static final Pattern c = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    public a(String str) {
        this.d = str;
        if (str != null) {
            this.e = a(str, a, "", 1);
            this.f = a(str, b, null, 2);
        } else {
            this.e = "";
            this.f = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.e)) {
            this.g = a(str, c, null, 2);
        } else {
            this.g = null;
        }
    }

    private static String a(String str, Pattern pattern, String str2, int i) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(i) : str2;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f == null ? "US-ASCII" : this.f;
    }

    public final a c() {
        if (this.f == null) {
            return new a(String.valueOf(this.d) + "; charset=UTF-8");
        }
        return this;
    }
}
