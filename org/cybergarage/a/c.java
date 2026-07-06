package org.cybergarage.a;

import java.io.IOException;
import java.io.LineNumberReader;
import java.io.StringReader;

/* JADX INFO: compiled from: HTTPHeader.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static int a = 1024;
    private String b;
    private String c;

    public c(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public c(String str) {
        int iIndexOf;
        this.b = "";
        this.c = "";
        if (str != null && (iIndexOf = str.indexOf(58)) >= 0) {
            String str2 = new String(str.getBytes(), 0, iIndexOf);
            String str3 = new String(str.getBytes(), iIndexOf + 1, (str.length() - iIndexOf) - 1);
            this.b = str2.trim();
            this.c = str3.trim();
        }
    }

    public final void a(String str) {
        this.c = str;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final boolean c() {
        return this.b != null && this.b.length() > 0;
    }

    private static String a(LineNumberReader lineNumberReader, String str) {
        String upperCase = str.toUpperCase();
        try {
            String line = lineNumberReader.readLine();
            while (line != null && line.length() > 0) {
                c cVar = new c(line);
                if (!cVar.c()) {
                    line = lineNumberReader.readLine();
                } else if (!cVar.b.toUpperCase().equals(upperCase)) {
                    line = lineNumberReader.readLine();
                } else {
                    return cVar.c;
                }
            }
            return "";
        } catch (IOException e) {
            org.cybergarage.e.a.a(e);
            return "";
        }
    }

    public static final String a(byte[] bArr, String str) {
        String str2 = new String(bArr);
        return a(new LineNumberReader(new StringReader(str2), Math.min(str2.length(), a)), str);
    }

    public static final int b(byte[] bArr, String str) {
        try {
            return Integer.parseInt(a(bArr, str));
        } catch (Exception e) {
            return 0;
        }
    }
}
