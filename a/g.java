package a;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;
import java.util.StringTokenizer;

/* JADX INFO: compiled from: Config.java */
/* JADX INFO: loaded from: classes.dex */
public class g {
    private static final org.c.b a = org.c.c.a((Class<?>) g.class);

    public static int a(Properties properties, String str, int i) {
        String property = properties.getProperty(str);
        if (property != null) {
            try {
                return Integer.parseInt(property);
            } catch (NumberFormatException e) {
                a.e("Not a number", e);
                return i;
            }
        }
        return i;
    }

    public static long a(Properties properties, String str, long j) {
        String property = properties.getProperty(str);
        if (property != null) {
            try {
                return Long.parseLong(property);
            } catch (NumberFormatException e) {
                a.e("Not a number", e);
                return j;
            }
        }
        return j;
    }

    public static InetAddress a(Properties properties, String str, InetAddress inetAddress) {
        String property = properties.getProperty(str);
        if (property != null) {
            try {
                return InetAddress.getByName(property);
            } catch (UnknownHostException e) {
                a.e("Unknown host ".concat(String.valueOf(property)), e);
                return inetAddress;
            }
        }
        return inetAddress;
    }

    public static InetAddress a(Properties properties) {
        String property = properties.getProperty("jcifs.smb.client.laddr");
        if (property != null) {
            try {
                return InetAddress.getByName(property);
            } catch (UnknownHostException e) {
                a.e("Ignoring jcifs.smb.client.laddr address: ".concat(String.valueOf(property)), e);
            }
        }
        return null;
    }

    public static boolean a(Properties properties, String str, boolean z) {
        String property = properties.getProperty(str);
        if (property != null) {
            return property.toLowerCase().equals("true");
        }
        return z;
    }

    public static InetAddress[] a(Properties properties, String str, String str2, InetAddress[] inetAddressArr) {
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
                    a.e("Unknown host ".concat(String.valueOf(strNextToken)), e);
                    return inetAddressArr;
                }
            }
            return inetAddressArr2;
        }
        return inetAddressArr;
    }
}
