package org.a.a.a.a.a;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: RegexFTPFileEntryParserImpl.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends org.a.a.a.a.i {
    private Pattern b = null;
    private MatchResult c = null;
    protected Matcher a = null;

    public n(String str) {
        a(str, 0);
    }

    public n(String str, byte b) {
        a(str, 32);
    }

    public final boolean c(String str) {
        this.c = null;
        this.a = this.b.matcher(str);
        if (this.a.matches()) {
            this.c = this.a.toMatchResult();
        }
        return this.c != null;
    }

    public final String a(int i) {
        if (this.c == null) {
            return null;
        }
        return this.c.group(i);
    }

    public final boolean d(String str) {
        a(str, 0);
        return true;
    }

    private void a(String str, int i) {
        try {
            this.b = Pattern.compile(str, i);
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException("Unparseable regex supplied: ".concat(String.valueOf(str)));
        }
    }
}
