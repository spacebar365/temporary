package org.cybergarage.p157d;

import org.cybergarage.p155b.C1637a;
import org.cybergarage.p156c.C1638a;
import org.cybergarage.p157d.p161d.C1672c;
import org.cybergarage.p173e.C1744a;
import org.cybergarage.xml.AbstractC1754e;

/* JADX INFO: renamed from: org.cybergarage.d.n */
/* JADX INFO: compiled from: UPnP.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1742n {

    /* JADX INFO: renamed from: a */
    private static AbstractC1754e f6517a;

    /* JADX INFO: renamed from: b */
    private static int f6518b;

    /* JADX INFO: renamed from: a */
    public static final String m5101a() {
        return String.valueOf(System.getProperty("os.name")) + "/" + System.getProperty("os.version") + " UPnP/1.0 CyberLinkJava/3.0";
    }

    /* JADX INFO: renamed from: a */
    public static final void m5102a(int i) {
        switch (i) {
            case 1:
                C1637a.f6362c = true;
                break;
            case 2:
                C1637a.f6360a = true;
                break;
            case 3:
                C1672c.m4810a("FF02::C");
                break;
            case 4:
                C1672c.m4810a("FF03::C");
                break;
            case 5:
                C1672c.m4810a("FF04::C");
                break;
            case 6:
                C1672c.m4810a("FF05::C");
                break;
            case 7:
                C1672c.m4810a("FF0E::C");
                break;
            case 9:
                C1637a.f6361b = true;
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m5104b() {
        C1637a.f6360a = false;
    }

    /* JADX INFO: renamed from: b */
    private static final String m5103b(int i) {
        String string = Integer.toString(65535 & i, 16);
        int length = string.length();
        String str = "";
        for (int i2 = 0; i2 < 4 - length; i2++) {
            str = String.valueOf(str) + "0";
        }
        return String.valueOf(str) + string;
    }

    /* JADX INFO: renamed from: c */
    public static final String m5105c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = (long) (System.currentTimeMillis() * Math.random());
        return String.valueOf(m5103b((int) (jCurrentTimeMillis & 65535))) + "-" + m5103b(((int) ((jCurrentTimeMillis >> 32) | 40960)) & 65535) + "-" + m5103b((int) (jCurrentTimeMillis2 & 65535)) + "-" + m5103b(((int) ((jCurrentTimeMillis2 >> 32) | 57344)) & 65535);
    }

    /* JADX INFO: renamed from: d */
    public static final int m5106d() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    /* JADX INFO: renamed from: a */
    public static final int m5100a(String str) {
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

    /* JADX INFO: renamed from: e */
    public static final AbstractC1754e m5107e() {
        if (f6517a == null) {
            AbstractC1754e abstractC1754eM5110h = m5110h();
            f6517a = abstractC1754eM5110h;
            if (abstractC1754eM5110h == null) {
                throw new RuntimeException("No XML parser defined. And unable to load any. \nTry to invoke UPnP.setXMLParser before UPnP.getXMLParser");
            }
            C1638a.m4716a(f6517a);
        }
        return f6517a;
    }

    /* JADX INFO: renamed from: h */
    private static AbstractC1754e m5110h() {
        String[] strArr = {System.getProperty("cyberlink.upnp.xml.parser"), "org.cybergarage.xml.parser.XmlPullParser", "org.cybergarage.xml.parser.JaxpParser"};
        for (int i = 0; i < 3; i++) {
            if (strArr[i] != null) {
                try {
                    return (AbstractC1754e) Class.forName(strArr[i]).newInstance();
                } catch (Throwable th) {
                    C1744a.m5121c("Unable to load " + strArr[i] + " as XMLParser due to " + th);
                }
            }
        }
        return null;
    }

    static {
        f6518b = 4;
        f6518b = 4;
    }

    /* JADX INFO: renamed from: f */
    public static final int m5108f() {
        return f6518b;
    }

    /* JADX INFO: renamed from: g */
    public static final void m5109g() {
    }
}
