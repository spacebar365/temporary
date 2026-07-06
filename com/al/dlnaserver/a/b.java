package com.al.dlnaserver.a;

import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PLSParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final String a = b.class.getSimpleName();
    private static final Pattern b = Pattern.compile("\\s*NumberOfEntries=(.*)", 2);
    private static final Pattern c = Pattern.compile("\\s*Version=(.*)", 2);
    private static final Pattern d = Pattern.compile("\\s*File(\\d+)=(.*)", 2);
    private static final Pattern e = Pattern.compile("\\s*Title(\\d+)=(.*)", 2);
    private static final Pattern f = Pattern.compile("\\s*Length(\\d+)=(.*)", 2);

    private b() {
    }

    public static b$a a(InputStream inputStream) {
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
                Matcher matcher = d.matcher(line);
                if (matcher.matches()) {
                    ((b$a$a) arrayList.get(a(arrayList, matcher))).a = matcher.group(2).trim();
                } else {
                    Matcher matcher2 = e.matcher(line);
                    if (matcher2.matches()) {
                        ((b$a$a) arrayList.get(a(arrayList, matcher2))).b = matcher2.group(2).trim();
                    } else {
                        Matcher matcher3 = f.matcher(line);
                        if (matcher3.matches()) {
                            ((b$a$a) arrayList.get(a(arrayList, matcher3))).c = Long.valueOf(matcher3.group(2).trim()).longValue();
                        } else {
                            Matcher matcher4 = b.matcher(line);
                            if (matcher4.matches()) {
                                iIntValue = Integer.valueOf(matcher4.group(1).trim()).intValue();
                            } else {
                                Matcher matcher5 = c.matcher(line);
                                if (matcher5.matches()) {
                                    iIntValue2 = Integer.valueOf(matcher5.group(1).trim()).intValue();
                                }
                            }
                        }
                    }
                }
            } catch (IOException e2) {
                Log.e(a, "Failed to parse playlist file: ".concat(String.valueOf(e2)));
            }
        }
        if (arrayList.size() != iIntValue) {
            Log.w(a, "Parsed track count doesn't match proclaimed NumberOfEntries");
        }
        return new b$a(arrayList, iIntValue2);
    }

    private static int a(List<b$a$a> list, Matcher matcher) {
        int iIntValue = Integer.valueOf(matcher.group(1)).intValue() - 1;
        try {
            list.get(iIntValue);
        } catch (IndexOutOfBoundsException e2) {
            list.add(iIntValue, new b$a$a());
        }
        return iIntValue;
    }
}
