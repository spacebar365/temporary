package com.al.dlnaserver.a;

import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* JADX INFO: compiled from: M3UParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static String b(InputStream inputStream) {
        try {
            Scanner scanner = new Scanner(inputStream);
            String next = scanner.useDelimiter("\\A").next();
            scanner.close();
            return next;
        } catch (NoSuchElementException e) {
            return "";
        }
    }

    public static a$a a(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Input stream is null!");
        }
        String[] strArrSplit = b(inputStream).replaceAll("#EXTM3U.*", "").trim().split("\n");
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
        return new a$a(strConcat.split("####"), strConcat2.split("####"));
    }
}
