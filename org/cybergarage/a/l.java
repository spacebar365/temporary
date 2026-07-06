package org.cybergarage.a;

import java.util.StringTokenizer;

/* JADX INFO: compiled from: HTTPStatus.java */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    private String a;
    private int b;
    private String c;

    public static final String a(int i) {
        switch (i) {
            case 100:
                return "Continue";
            case 200:
                return "OK";
            case 206:
                return "Partial Content";
            case 400:
                return "Bad Request";
            case 404:
                return "Not Found";
            case 412:
                return "Precondition Failed";
            case 416:
                return "Invalid Range";
            case 500:
                return "Internal Server Error";
            default:
                return "";
        }
    }

    public l() {
        this.a = "";
        this.b = 0;
        this.c = "";
        this.a = "";
        this.b = 0;
        this.c = "";
    }

    public l(String str) {
        this.a = "";
        this.b = 0;
        this.c = "";
        a(str);
    }

    public final int a() {
        return this.b;
    }

    private void a(String str) {
        if (str != null) {
            try {
                StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
                if (!stringTokenizer.hasMoreTokens()) {
                    return;
                }
                this.a = stringTokenizer.nextToken().trim();
                if (stringTokenizer.hasMoreTokens()) {
                    int i = 0;
                    try {
                        i = Integer.parseInt(stringTokenizer.nextToken());
                    } catch (Exception e) {
                    }
                    this.b = i;
                    String str2 = "";
                    while (stringTokenizer.hasMoreTokens()) {
                        if (str2.length() >= 0) {
                            str2 = String.valueOf(str2) + " ";
                        }
                        str2 = String.valueOf(str2) + stringTokenizer.nextToken();
                    }
                    this.c = str2.trim();
                    return;
                }
                return;
            } catch (Exception e2) {
                org.cybergarage.e.a.a(e2);
                return;
            }
        }
        this.a = "1.1";
        this.b = 500;
        this.c = a(500);
    }
}
