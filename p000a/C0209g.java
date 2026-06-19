package p000a;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;
import java.util.StringTokenizer;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;

/* JADX INFO: renamed from: a.g */
/* JADX INFO: compiled from: Config.java */
/* JADX INFO: loaded from: classes.dex */
public class C0209g {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f942a = C1620c.m4563a((Class<?>) C0209g.class);

    /* JADX INFO: renamed from: a */
    public static int m597a(Properties properties, String str, int i) {
        String property = properties.getProperty(str);
        if (property != null) {
            try {
                return Integer.parseInt(property);
            } catch (NumberFormatException e) {
                f942a.mo4544e("Not a number", e);
                return i;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static long m598a(Properties properties, String str, long j) {
        String property = properties.getProperty(str);
        if (property != null) {
            try {
                return Long.parseLong(property);
            } catch (NumberFormatException e) {
                f942a.mo4544e("Not a number", e);
                return j;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: a */
    public static InetAddress m600a(Properties properties, String str, InetAddress inetAddress) {
        String property = properties.getProperty(str);
        if (property != null) {
            try {
                return InetAddress.getByName(property);
            } catch (UnknownHostException e) {
                f942a.mo4544e("Unknown host ".concat(String.valueOf(property)), e);
                return inetAddress;
            }
        }
        return inetAddress;
    }

    /* JADX INFO: renamed from: a */
    public static InetAddress m599a(Properties properties) {
        String property = properties.getProperty("jcifs.smb.client.laddr");
        if (property != null) {
            try {
                return InetAddress.getByName(property);
            } catch (UnknownHostException e) {
                f942a.mo4544e("Ignoring jcifs.smb.client.laddr address: ".concat(String.valueOf(property)), e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m601a(Properties properties, String str, boolean z) {
        String property = properties.getProperty(str);
        if (property != null) {
            return property.toLowerCase().equals("true");
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public static InetAddress[] m602a(Properties properties, String str, String str2, InetAddress[] inetAddressArr) {
        String property = properties.getProperty(str);
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, str2);
            int iCountTokens = stringTokenizer.countTokens();
            InetAddress[] inetAddressArr2 = new InetAddress[iCountTokens];
            for (int i = 0; i < iCountTokens; i++) {
                String strNextToken = stringTokenizer.nextToken();
                try {
                    inetAddressArr2[i] = InetAddress.getByName(strNextToken);
                } catch (UnknownHostException e) {
                    f942a.mo4544e("Unknown host ".concat(String.valueOf(strNextToken)), e);
                    return inetAddressArr;
                }
            }
            return inetAddressArr2;
        }
        return inetAddressArr;
    }
}
