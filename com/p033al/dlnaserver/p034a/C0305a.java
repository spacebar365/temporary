package com.p033al.dlnaserver.p034a;

import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* JADX INFO: renamed from: com.al.dlnaserver.a.a */
/* JADX INFO: compiled from: M3UParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0305a {
    /* JADX INFO: renamed from: b */
    private static String m998b(InputStream inputStream) {
        try {
            Scanner scanner = new Scanner(inputStream);
            String next = scanner.useDelimiter("\\A").next();
            scanner.close();
            return next;
        } catch (NoSuchElementException e) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m997a(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Input stream is null!");
        }
        String[] strArrSplit = m998b(inputStream).replaceAll("#EXTM3U.*", "").trim().split("\n");
        String strConcat = "";
        String strConcat2 = "";
        for (int i = 0; i < strArrSplit.length; i++) {
            String strReplaceAll = strArrSplit[i].replaceAll("\r", "");
            if (!strArrSplit[i].contains("#EXTINF")) {
                if (!strReplaceAll.trim().startsWith("#")) {
                    strConcat = strConcat.concat(strReplaceAll).concat("####");
                }
            } else {
                strConcat2 = strConcat2.concat(strReplaceAll.replaceAll("#EXTINF:.*,", "")).concat("####");
            }
        }
        return new a(strConcat.split("####"), strConcat2.split("####"));
    }

    /* JADX INFO: renamed from: com.al.dlnaserver.a.a$a */
    /* JADX INFO: compiled from: M3UParser.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        private String[] f1302a;

        /* JADX INFO: renamed from: b */
        private String[] f1303b;

        public a(String[] strArr, String[] strArr2) {
            this.f1302a = strArr;
            this.f1303b = strArr2;
        }

        /* JADX INFO: renamed from: a */
        public final int m999a() {
            if (this.f1302a != null) {
                return this.f1302a.length;
            }
            return 0;
        }

        /* JADX INFO: renamed from: a */
        public final String m1000a(int i) {
            return this.f1302a[i];
        }

        /* JADX INFO: renamed from: b */
        public final String m1001b(int i) {
            return this.f1303b[i];
        }
    }
}
