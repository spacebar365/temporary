package org.a.a.a.a.a;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: VMSVersioningFTPEntryParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class q extends p {
    private final Pattern b;

    public q() {
        this(null);
    }

    public q(org.a.a.a.a.d dVar) {
        a(dVar);
        try {
            this.b = Pattern.compile("(.*?);([0-9]+)\\s*.*");
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException("Unparseable regex supplied:  (.*?);([0-9]+)\\s*.*");
        }
    }

    @Override // org.a.a.a.a.i, org.a.a.a.a.h
    public final List<String> a(List<String> list) {
        HashMap map = new HashMap();
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Matcher matcher = this.b.matcher(listIterator.next().trim());
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
            Matcher matcher2 = this.b.matcher(listIterator.previous().trim());
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

    @Override // org.a.a.a.a.a.p
    protected final boolean b() {
        return true;
    }
}
