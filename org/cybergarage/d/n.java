package org.cybergarage.d;

/* JADX INFO: compiled from: UPnP.java */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    private static org.cybergarage.xml.e a;
    private static int b;

    public static final String a() {
        return String.valueOf(System.getProperty("os.name")) + "/" + System.getProperty("os.version") + " UPnP/1.0 CyberLinkJava/3.0";
    }

    public static final void a(int i) {
        switch (i) {
            case 1:
                org.cybergarage.b.a.c = true;
                break;
            case 2:
                org.cybergarage.b.a.a = true;
                break;
            case 3:
                org.cybergarage.d.d.c.a("FF02::C");
                break;
            case 4:
                org.cybergarage.d.d.c.a("FF03::C");
                break;
            case 5:
                org.cybergarage.d.d.c.a("FF04::C");
                break;
            case 6:
                org.cybergarage.d.d.c.a("FF05::C");
                break;
            case 7:
                org.cybergarage.d.d.c.a("FF0E::C");
                break;
            case 9:
                org.cybergarage.b.a.b = true;
                break;
        }
    }

    public static final void b() {
        org.cybergarage.b.a.a = false;
    }

    private static final String b(int i) {
        String string = Integer.toString(65535 & i, 16);
        int length = string.length();
        String str = "";
        for (int i2 = 0; i2 < 4 - length; i2++) {
            str = String.valueOf(str) + "0";
        }
        return String.valueOf(str) + string;
    }

    public static final String c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = (long) (System.currentTimeMillis() * Math.random());
        return String.valueOf(b((int) (jCurrentTimeMillis & 65535))) + "-" + b(((int) ((jCurrentTimeMillis >> 32) | 40960)) & 65535) + "-" + b((int) (jCurrentTimeMillis2 & 65535)) + "-" + b(((int) ((jCurrentTimeMillis2 >> 32) | 57344)) & 65535);
    }

    public static final int d() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    public static final int a(String str) {
        if (str == null) {
            return 0;
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int iCodePointAt = str.codePointAt(i) + i2;
            if (iCodePointAt >= 16777215) {
                iCodePointAt %= 16777215;
            }
            i++;
            i2 = iCodePointAt;
        }
        return i2;
    }

    public static final org.cybergarage.xml.e e() {
        if (a == null) {
            org.cybergarage.xml.e eVarH = h();
            a = eVarH;
            if (eVarH == null) {
                throw new RuntimeException("No XML parser defined. And unable to load any. \nTry to invoke UPnP.setXMLParser before UPnP.getXMLParser");
            }
            org.cybergarage.c.a.a(a);
        }
        return a;
    }

    private static org.cybergarage.xml.e h() {
        String[] strArr = {System.getProperty("cyberlink.upnp.xml.parser"), "org.cybergarage.xml.parser.XmlPullParser", "org.cybergarage.xml.parser.JaxpParser"};
        for (int i = 0; i < 3; i++) {
            if (strArr[i] != null) {
                try {
                    return (org.cybergarage.xml.e) Class.forName(strArr[i]).newInstance();
                } catch (Throwable th) {
                    org.cybergarage.e.a.c("Unable to load " + strArr[i] + " as XMLParser due to " + th);
                }
            }
        }
        return null;
    }

    static {
        b = 4;
        b = 4;
    }

    public static final int f() {
        return b;
    }

    public static final void g() {
    }
}
