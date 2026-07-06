package org.a.a.a.a.a;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.StringTokenizer;

/* JADX INFO: compiled from: VMSFTPEntryParser.java */
/* JADX INFO: loaded from: classes.dex */
public class p extends b {
    public p() {
        this((byte) 0);
    }

    private p(byte b) {
        super("(.*?;[0-9]+)\\s*(\\d+)/\\d+\\s*(\\S+)\\s+(\\S+)\\s+\\[(([0-9$A-Za-z_]+)|([0-9$A-Za-z_]+),([0-9$a-zA-Z_]+))\\]?\\s*\\([a-zA-Z]*,([a-zA-Z]*),([a-zA-Z]*),([a-zA-Z]*)\\)");
        a((org.a.a.a.a.d) null);
    }

    @Override // org.a.a.a.a.h
    public final org.a.a.a.a.g a(String str) {
        String strNextToken;
        String str2;
        if (!c(str)) {
            return null;
        }
        org.a.a.a.a.g gVar = new org.a.a.a.a.g();
        gVar.a(str);
        String strA = a(1);
        String strA2 = a(2);
        String str3 = a(3) + " " + a(4);
        String strA3 = a(5);
        String[] strArr = {a(9), a(10), a(11)};
        try {
            gVar.a(super.b(str3));
        } catch (ParseException e) {
        }
        StringTokenizer stringTokenizer = new StringTokenizer(strA3, ",");
        switch (stringTokenizer.countTokens()) {
            case 1:
                strNextToken = stringTokenizer.nextToken();
                str2 = null;
                break;
            case 2:
                String strNextToken2 = stringTokenizer.nextToken();
                strNextToken = stringTokenizer.nextToken();
                str2 = strNextToken2;
                break;
            default:
                strNextToken = null;
                str2 = null;
                break;
        }
        if (strA.lastIndexOf(".DIR") != -1) {
            gVar.a(1);
        } else {
            gVar.a(0);
        }
        if (b()) {
            gVar.b(strA);
        } else {
            gVar.b(strA.substring(0, strA.lastIndexOf(";")));
        }
        gVar.a(Long.parseLong(strA2) * 512);
        gVar.c(str2);
        gVar.d(strNextToken);
        for (int i = 0; i < 3; i++) {
            String str4 = strArr[i];
            gVar.a(i, 0, str4.indexOf(82) >= 0);
            gVar.a(i, 1, str4.indexOf(87) >= 0);
            gVar.a(i, 2, str4.indexOf(69) >= 0);
        }
        return gVar;
    }

    @Override // org.a.a.a.a.i, org.a.a.a.a.h
    public final String a(BufferedReader bufferedReader) throws IOException {
        String line = bufferedReader.readLine();
        StringBuilder sb = new StringBuilder();
        while (line != null) {
            if (line.startsWith("Directory") || line.startsWith("Total")) {
                line = bufferedReader.readLine();
            } else {
                sb.append(line);
                if (line.trim().endsWith(")")) {
                    break;
                }
                line = bufferedReader.readLine();
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    protected boolean b() {
        return false;
    }

    @Override // org.a.a.a.a.a.b
    protected final org.a.a.a.a.d a() {
        return new org.a.a.a.a.d("VMS", "d-MMM-yyyy HH:mm:ss", null);
    }
}
