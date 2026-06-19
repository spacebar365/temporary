package org.p037a.p038a.p039a.p040a.p041a;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.p037a.p038a.p039a.p040a.C0453d;

/* JADX INFO: renamed from: org.a.a.a.a.a.q */
/* JADX INFO: compiled from: VMSVersioningFTPEntryParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0450q extends C0449p {

    /* JADX INFO: renamed from: b */
    private final Pattern f1572b;

    public C0450q() {
        this(null);
    }

    public C0450q(C0453d c0453d) {
        mo1178a(c0453d);
        try {
            this.f1572b = Pattern.compile("(.*?);([0-9]+)\\s*.*");
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException("Unparseable regex supplied:  (.*?);([0-9]+)\\s*.*");
        }
    }

    @Override // org.p037a.p038a.p039a.p040a.AbstractC0458i, org.p037a.p038a.p039a.p040a.InterfaceC0457h
    /* JADX INFO: renamed from: a */
    public final List<String> mo1192a(List<String> list) {
        HashMap map = new HashMap();
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Matcher matcher = this.f1572b.matcher(listIterator.next().trim());
            if (matcher.matches()) {
                MatchResult matchResult = matcher.toMatchResult();
                String strGroup = matchResult.group(1);
                Integer numValueOf = Integer.valueOf(matchResult.group(2));
                Integer num = (Integer) map.get(strGroup);
                if (num != null && numValueOf.intValue() < num.intValue()) {
                    listIterator.remove();
                } else {
                    map.put(strGroup, numValueOf);
                }
            }
        }
        while (listIterator.hasPrevious()) {
            Matcher matcher2 = this.f1572b.matcher(listIterator.previous().trim());
            if (matcher2.matches()) {
                MatchResult matchResult2 = matcher2.toMatchResult();
                String strGroup2 = matchResult2.group(1);
                Integer numValueOf2 = Integer.valueOf(matchResult2.group(2));
                Integer num2 = (Integer) map.get(strGroup2);
                if (num2 != null && numValueOf2.intValue() < num2.intValue()) {
                    listIterator.remove();
                }
            }
        }
        return list;
    }

    @Override // org.p037a.p038a.p039a.p040a.p041a.C0449p
    /* JADX INFO: renamed from: b */
    protected final boolean mo1199b() {
        return true;
    }
}
