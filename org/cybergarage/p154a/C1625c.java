package org.cybergarage.p154a;

import java.io.IOException;
import java.io.LineNumberReader;
import java.io.StringReader;
import org.cybergarage.p173e.C1744a;

/* JADX INFO: renamed from: org.cybergarage.a.c */
/* JADX INFO: compiled from: HTTPHeader.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1625c {

    /* JADX INFO: renamed from: a */
    private static int f6327a = 1024;

    /* JADX INFO: renamed from: b */
    private String f6328b;

    /* JADX INFO: renamed from: c */
    private String f6329c;

    public C1625c(String str, String str2) {
        this.f6328b = str;
        this.f6329c = str2;
    }

    public C1625c(String str) {
        int iIndexOf;
        this.f6328b = "";
        this.f6329c = "";
        if (str != null && (iIndexOf = str.indexOf(58)) >= 0) {
            String str2 = new String(str.getBytes(), 0, iIndexOf);
            String str3 = new String(str.getBytes(), iIndexOf + 1, (str.length() - iIndexOf) - 1);
            this.f6328b = str2.trim();
            this.f6329c = str3.trim();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4589a(String str) {
        this.f6329c = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m4588a() {
        return this.f6328b;
    }

    /* JADX INFO: renamed from: b */
    public final String m4590b() {
        return this.f6329c;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4591c() {
        return this.f6328b != null && this.f6328b.length() > 0;
    }

    /* JADX INFO: renamed from: a */
    private static String m4585a(LineNumberReader lineNumberReader, String str) {
        String upperCase = str.toUpperCase();
        try {
            String line = lineNumberReader.readLine();
            while (line != null && line.length() > 0) {
                C1625c c1625c = new C1625c(line);
                if (!c1625c.m4591c()) {
                    line = lineNumberReader.readLine();
                } else if (!c1625c.f6328b.toUpperCase().equals(upperCase)) {
                    line = lineNumberReader.readLine();
                } else {
                    return c1625c.f6329c;
                }
            }
            return "";
        } catch (IOException e) {
            C1744a.m5117a(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m4586a(byte[] bArr, String str) {
        String str2 = new String(bArr);
        return m4585a(new LineNumberReader(new StringReader(str2), Math.min(str2.length(), f6327a)), str);
    }

    /* JADX INFO: renamed from: b */
    public static final int m4587b(byte[] bArr, String str) {
        try {
            return Integer.parseInt(m4586a(bArr, str));
        } catch (Exception e) {
            return 0;
        }
    }
}
