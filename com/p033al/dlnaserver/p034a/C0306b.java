package com.p033al.dlnaserver.p034a;

import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.al.dlnaserver.a.b */
/* JADX INFO: compiled from: PLSParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0306b {

    /* JADX INFO: renamed from: a */
    private static final String f1304a = C0306b.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    private static final Pattern f1305b = Pattern.compile("\\s*NumberOfEntries=(.*)", 2);

    /* JADX INFO: renamed from: c */
    private static final Pattern f1306c = Pattern.compile("\\s*Version=(.*)", 2);

    /* JADX INFO: renamed from: d */
    private static final Pattern f1307d = Pattern.compile("\\s*File(\\d+)=(.*)", 2);

    /* JADX INFO: renamed from: e */
    private static final Pattern f1308e = Pattern.compile("\\s*Title(\\d+)=(.*)", 2);

    /* JADX INFO: renamed from: f */
    private static final Pattern f1309f = Pattern.compile("\\s*Length(\\d+)=(.*)", 2);

    private C0306b() {
    }

    /* JADX INFO: renamed from: a */
    public static a m1003a(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Input stream is null!");
        }
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        int iIntValue = -1;
        int iIntValue2 = -1;
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                Matcher matcher = f1307d.matcher(line);
                if (matcher.matches()) {
                    ((a.C1770a) arrayList.get(m1002a(arrayList, matcher))).f1312a = matcher.group(2).trim();
                } else {
                    Matcher matcher2 = f1308e.matcher(line);
                    if (matcher2.matches()) {
                        ((a.C1770a) arrayList.get(m1002a(arrayList, matcher2))).f1313b = matcher2.group(2).trim();
                    } else {
                        Matcher matcher3 = f1309f.matcher(line);
                        if (matcher3.matches()) {
                            ((a.C1770a) arrayList.get(m1002a(arrayList, matcher3))).f1314c = Long.valueOf(matcher3.group(2).trim()).longValue();
                        } else {
                            Matcher matcher4 = f1305b.matcher(line);
                            if (matcher4.matches()) {
                                iIntValue = Integer.valueOf(matcher4.group(1).trim()).intValue();
                            } else {
                                Matcher matcher5 = f1306c.matcher(line);
                                if (matcher5.matches()) {
                                    iIntValue2 = Integer.valueOf(matcher5.group(1).trim()).intValue();
                                }
                            }
                        }
                    }
                }
            } catch (IOException e) {
                Log.e(f1304a, "Failed to parse playlist file: ".concat(String.valueOf(e)));
            }
        }
        if (arrayList.size() != iIntValue) {
            Log.w(f1304a, "Parsed track count doesn't match proclaimed NumberOfEntries");
        }
        return new a(arrayList, iIntValue2);
    }

    /* JADX INFO: renamed from: a */
    private static int m1002a(List<a.C1770a> list, Matcher matcher) {
        int iIntValue = Integer.valueOf(matcher.group(1)).intValue() - 1;
        try {
            list.get(iIntValue);
        } catch (IndexOutOfBoundsException e) {
            list.add(iIntValue, new a.C1770a());
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: com.al.dlnaserver.a.b$a */
    /* JADX INFO: compiled from: PLSParser.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final List<C1770a> f1310a;

        /* JADX INFO: renamed from: b */
        private final int f1311b;

        a(List<C1770a> list, int i) {
            this.f1310a = list;
            this.f1311b = i;
        }

        /* JADX INFO: renamed from: a */
        public final C1770a m1005a(int i) {
            return this.f1310a.get(i);
        }

        /* JADX INFO: renamed from: a */
        public final int m1004a() {
            return this.f1310a.size();
        }

        public final String toString() {
            return "Playlist{tracks=" + this.f1310a + ", version=" + this.f1311b + '}';
        }

        /* JADX INFO: renamed from: com.al.dlnaserver.a.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PLSParser.java */
        public static final class C1770a {

            /* JADX INFO: renamed from: a */
            String f1312a;

            /* JADX INFO: renamed from: b */
            String f1313b;

            /* JADX INFO: renamed from: c */
            long f1314c;

            /* JADX INFO: renamed from: a */
            public final String m1006a() {
                return this.f1312a;
            }

            /* JADX INFO: renamed from: b */
            public final String m1007b() {
                return this.f1313b;
            }

            public final String toString() {
                return "Track{url='" + this.f1312a + "', title='" + this.f1313b + "', length=" + this.f1314c + '}';
            }
        }
    }
}
