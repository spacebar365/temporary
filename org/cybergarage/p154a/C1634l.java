package org.cybergarage.p154a;

import java.util.StringTokenizer;
import org.cybergarage.p173e.C1744a;

/* JADX INFO: renamed from: org.cybergarage.a.l */
/* JADX INFO: compiled from: HTTPStatus.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1634l {

    /* JADX INFO: renamed from: a */
    private String f6355a;

    /* JADX INFO: renamed from: b */
    private int f6356b;

    /* JADX INFO: renamed from: c */
    private String f6357c;

    /* JADX INFO: renamed from: a */
    public static final String m4696a(int i) {
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

    public C1634l() {
        this.f6355a = "";
        this.f6356b = 0;
        this.f6357c = "";
        this.f6355a = "";
        this.f6356b = 0;
        this.f6357c = "";
    }

    public C1634l(String str) {
        this.f6355a = "";
        this.f6356b = 0;
        this.f6357c = "";
        m4697a(str);
    }

    /* JADX INFO: renamed from: a */
    public final int m4698a() {
        return this.f6356b;
    }

    /* JADX INFO: renamed from: a */
    private void m4697a(String str) {
        if (str != null) {
            try {
                StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
                if (!stringTokenizer.hasMoreTokens()) {
                    return;
                }
                this.f6355a = stringTokenizer.nextToken().trim();
                if (stringTokenizer.hasMoreTokens()) {
                    int i = 0;
                    try {
                        i = Integer.parseInt(stringTokenizer.nextToken());
                    } catch (Exception e) {
                    }
                    this.f6356b = i;
                    String str2 = "";
                    while (stringTokenizer.hasMoreTokens()) {
                        if (str2.length() >= 0) {
                            str2 = String.valueOf(str2) + " ";
                        }
                        str2 = String.valueOf(str2) + stringTokenizer.nextToken();
                    }
                    this.f6357c = str2.trim();
                    return;
                }
                return;
            } catch (Exception e2) {
                C1744a.m5117a(e2);
                return;
            }
        }
        this.f6355a = "1.1";
        this.f6356b = 500;
        this.f6357c = m4696a(500);
    }
}
