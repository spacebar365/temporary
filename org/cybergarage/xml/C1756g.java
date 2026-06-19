package org.cybergarage.xml;

/* JADX INFO: renamed from: org.cybergarage.xml.g */
/* JADX INFO: compiled from: XML.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1756g {
    /* JADX INFO: renamed from: a */
    public static final String m5174a(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        char[] cArr = new char[length];
        str.getChars(0, length, cArr, 0);
        int i = 0;
        String str3 = null;
        int i2 = 0;
        while (i < length) {
            switch (cArr[i]) {
                case '\"':
                    str2 = "&quot;";
                    break;
                case '&':
                    str2 = "&amp;";
                    break;
                case '\'':
                    str2 = "&apos;";
                    break;
                case '<':
                    str2 = "&lt;";
                    break;
                case '>':
                    str2 = "&gt;";
                    break;
                default:
                    str2 = str3;
                    break;
            }
            if (str2 != null) {
                stringBuffer.append(cArr, i2, i - i2);
                stringBuffer.append(str2);
                i2 = i + 1;
                str2 = null;
            }
            i++;
            str3 = str2;
        }
        if (i2 == 0) {
            return str;
        }
        stringBuffer.append(cArr, i2, length - i2);
        return stringBuffer.toString();
    }
}
