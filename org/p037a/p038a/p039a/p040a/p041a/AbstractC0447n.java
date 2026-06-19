package org.p037a.p038a.p039a.p040a.p041a;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.p037a.p038a.p039a.p040a.AbstractC0458i;

/* JADX INFO: renamed from: org.a.a.a.a.a.n */
/* JADX INFO: compiled from: RegexFTPFileEntryParserImpl.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0447n extends AbstractC0458i {

    /* JADX INFO: renamed from: b */
    private Pattern f1568b = null;

    /* JADX INFO: renamed from: c */
    private MatchResult f1569c = null;

    /* JADX INFO: renamed from: a */
    protected Matcher f1567a = null;

    public AbstractC0447n(String str) {
        m1194a(str, 0);
    }

    public AbstractC0447n(String str, byte b) {
        m1194a(str, 32);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1196c(String str) {
        this.f1569c = null;
        this.f1567a = this.f1568b.matcher(str);
        if (this.f1567a.matches()) {
            this.f1569c = this.f1567a.toMatchResult();
        }
        return this.f1569c != null;
    }

    /* JADX INFO: renamed from: a */
    public final String m1195a(int i) {
        if (this.f1569c == null) {
            return null;
        }
        return this.f1569c.group(i);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1197d(String str) {
        m1194a(str, 0);
        return true;
    }

    /* JADX INFO: renamed from: a */
    private void m1194a(String str, int i) {
        try {
            this.f1568b = Pattern.compile(str, i);
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException("Unparseable regex supplied: ".concat(String.valueOf(str)));
        }
    }
}
