package org.p037a.p038a.p039a.p040a.p041a;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.StringTokenizer;
import org.p037a.p038a.p039a.p040a.C0453d;
import org.p037a.p038a.p039a.p040a.C0456g;

/* JADX INFO: renamed from: org.a.a.a.a.a.p */
/* JADX INFO: compiled from: VMSFTPEntryParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C0449p extends AbstractC0435b {
    public C0449p() {
        this((byte) 0);
    }

    private C0449p(byte b) {
        super("(.*?;[0-9]+)\\s*(\\d+)/\\d+\\s*(\\S+)\\s+(\\S+)\\s+\\[(([0-9$A-Za-z_]+)|([0-9$A-Za-z_]+),([0-9$a-zA-Z_]+))\\]?\\s*\\([a-zA-Z]*,([a-zA-Z]*),([a-zA-Z]*),([a-zA-Z]*)\\)");
        mo1178a((C0453d) null);
    }

    @Override // org.p037a.p038a.p039a.p040a.InterfaceC0457h
    /* JADX INFO: renamed from: a */
    public final C0456g mo1179a(String str) {
        String strNextToken;
        String str2;
        if (!m1196c(str)) {
            return null;
        }
        C0456g c0456g = new C0456g();
        c0456g.m1246a(str);
        String strA = m1195a(1);
        String strA2 = m1195a(2);
        String str3 = m1195a(3) + " " + m1195a(4);
        String strA3 = m1195a(5);
        String[] strArr = {m1195a(9), m1195a(10), m1195a(11)};
        try {
            c0456g.m1247a(super.m1181b(str3));
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
            c0456g.m1243a(1);
        } else {
            c0456g.m1243a(0);
        }
        if (mo1199b()) {
            c0456g.m1250b(strA);
        } else {
            c0456g.m1250b(strA.substring(0, strA.lastIndexOf(";")));
        }
        c0456g.m1245a(Long.parseLong(strA2) * 512);
        c0456g.m1253c(str2);
        c0456g.m1255d(strNextToken);
        for (int i = 0; i < 3; i++) {
            String str4 = strArr[i];
            c0456g.m1244a(i, 0, str4.indexOf(82) >= 0);
            c0456g.m1244a(i, 1, str4.indexOf(87) >= 0);
            c0456g.m1244a(i, 2, str4.indexOf(69) >= 0);
        }
        return c0456g;
    }

    @Override // org.p037a.p038a.p039a.p040a.AbstractC0458i, org.p037a.p038a.p039a.p040a.InterfaceC0457h
    /* JADX INFO: renamed from: a */
    public final String mo1198a(BufferedReader bufferedReader) throws IOException {
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

    /* JADX INFO: renamed from: b */
    protected boolean mo1199b() {
        return false;
    }

    @Override // org.p037a.p038a.p039a.p040a.p041a.AbstractC0435b
    /* JADX INFO: renamed from: a */
    protected final C0453d mo1180a() {
        return new C0453d("VMS", "d-MMM-yyyy HH:mm:ss", null);
    }
}
