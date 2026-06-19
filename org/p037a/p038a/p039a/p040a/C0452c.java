package org.p037a.p038a.p039a.p040a;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.p037a.p038a.p039a.C0432a;
import org.p037a.p038a.p039a.p040a.p041a.C0436c;
import org.p037a.p038a.p039a.p040a.p041a.InterfaceC0437d;
import org.p037a.p038a.p039a.p042b.C0467a;
import org.p037a.p038a.p039a.p042b.C0468b;
import org.p037a.p038a.p039a.p042b.C0469c;
import org.p037a.p038a.p039a.p042b.C0470d;

/* JADX INFO: renamed from: org.a.a.a.a.c */
/* JADX INFO: compiled from: FTPClient.java */
/* JADX INFO: loaded from: classes.dex */
public class C0452c extends C0451b implements InterfaceC0433a {

    /* JADX INFO: renamed from: V */
    private static final Pattern f1583V = Pattern.compile("(\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3}),(\\d{1,3}),(\\d{1,3})");

    /* JADX INFO: renamed from: A */
    private InetAddress f1584A;

    /* JADX INFO: renamed from: B */
    private InetAddress f1585B;

    /* JADX INFO: renamed from: C */
    private int f1586C;

    /* JADX INFO: renamed from: D */
    private int f1587D;

    /* JADX INFO: renamed from: E */
    private int f1588E;

    /* JADX INFO: renamed from: F */
    private int f1589F;

    /* JADX INFO: renamed from: G */
    private boolean f1590G;

    /* JADX INFO: renamed from: H */
    private long f1591H;

    /* JADX INFO: renamed from: I */
    private InterfaceC0437d f1592I;

    /* JADX INFO: renamed from: J */
    private int f1593J;

    /* JADX INFO: renamed from: K */
    private int f1594K;

    /* JADX INFO: renamed from: L */
    private int f1595L;

    /* JADX INFO: renamed from: M */
    private boolean f1596M;

    /* JADX INFO: renamed from: N */
    private boolean f1597N;

    /* JADX INFO: renamed from: O */
    private String f1598O;

    /* JADX INFO: renamed from: P */
    private InterfaceC0457h f1599P;

    /* JADX INFO: renamed from: Q */
    private String f1600Q;

    /* JADX INFO: renamed from: R */
    private C0453d f1601R;

    /* JADX INFO: renamed from: S */
    private long f1602S;

    /* JADX INFO: renamed from: T */
    private int f1603T = 1000;

    /* JADX INFO: renamed from: U */
    private a f1604U = new b(this);

    /* JADX INFO: renamed from: W */
    private boolean f1605W = false;

    /* JADX INFO: renamed from: X */
    private HashMap<String, Set<String>> f1606X;

    /* JADX INFO: renamed from: s */
    private int f1607s;

    /* JADX INFO: renamed from: t */
    private int f1608t;

    /* JADX INFO: renamed from: u */
    private int f1609u;

    /* JADX INFO: renamed from: v */
    private String f1610v;

    /* JADX INFO: renamed from: w */
    private final Random f1611w;

    /* JADX INFO: renamed from: x */
    private int f1612x;

    /* JADX INFO: renamed from: y */
    private int f1613y;

    /* JADX INFO: renamed from: z */
    private InetAddress f1614z;

    /* JADX INFO: renamed from: org.a.a.a.a.c$a */
    /* JADX INFO: compiled from: FTPClient.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        String mo1229a(String str);
    }

    /* JADX INFO: renamed from: org.a.a.a.a.c$c */
    /* JADX INFO: compiled from: FTPClient.java */
    private static class c {

        /* JADX INFO: renamed from: a */
        static final Properties f1616a;

        static {
            InputStream resourceAsStream = C0452c.class.getResourceAsStream("/systemType.properties");
            Properties properties = null;
            if (resourceAsStream != null) {
                properties = new Properties();
                try {
                    properties.load(resourceAsStream);
                    try {
                        resourceAsStream.close();
                    } catch (IOException e) {
                    }
                } catch (IOException e2) {
                    try {
                        resourceAsStream.close();
                    } catch (IOException e3) {
                    }
                } catch (Throwable th) {
                    try {
                        resourceAsStream.close();
                    } catch (IOException e4) {
                    }
                    throw th;
                }
            }
            f1616a = properties;
        }
    }

    public C0452c() {
        m1219s();
        this.f1608t = -1;
        this.f1590G = true;
        this.f1592I = new C0436c();
        this.f1601R = null;
        this.f1596M = false;
        this.f1597N = false;
        this.f1611w = new Random();
        this.f1585B = null;
    }

    /* JADX INFO: renamed from: s */
    private void m1219s() {
        this.f1607s = 0;
        this.f1610v = null;
        this.f1609u = -1;
        this.f1614z = null;
        this.f1584A = null;
        this.f1612x = 0;
        this.f1613y = 0;
        this.f1586C = 0;
        this.f1588E = 7;
        this.f1587D = 4;
        this.f1589F = 10;
        this.f1591H = 0L;
        this.f1598O = null;
        this.f1599P = null;
        this.f1600Q = "";
        this.f1606X = null;
    }

    /* JADX INFO: renamed from: d */
    private Socket m1217d(String str, String str2) throws IOException {
        Socket socketCreateSocket;
        if (this.f1607s != 0 && this.f1607s != 2) {
            return null;
        }
        boolean z = m1279f() instanceof Inet6Address;
        if (this.f1607s == 0) {
            ServerSocket serverSocketCreateServerSocket = this.f1739h.createServerSocket((this.f1612x <= 0 || this.f1613y < this.f1612x) ? 0 : this.f1613y == this.f1612x ? this.f1613y : this.f1611w.nextInt((this.f1613y - this.f1612x) + 1) + this.f1612x, 1, m1220t());
            try {
                if (z) {
                    InetAddress inetAddressM1221u = m1221u();
                    int localPort = serverSocketCreateServerSocket.getLocalPort();
                    StringBuilder sb = new StringBuilder();
                    String hostAddress = inetAddressM1221u.getHostAddress();
                    int iIndexOf = hostAddress.indexOf("%");
                    if (iIndexOf > 0) {
                        hostAddress = hostAddress.substring(0, iIndexOf);
                    }
                    sb.append("|");
                    if (inetAddressM1221u instanceof Inet4Address) {
                        sb.append("1");
                    } else if (inetAddressM1221u instanceof Inet6Address) {
                        sb.append("2");
                    }
                    sb.append("|");
                    sb.append(hostAddress);
                    sb.append("|");
                    sb.append(localPort);
                    sb.append("|");
                    if (!C0465p.m1263b(m1201a(EnumC0454e.EPRT, sb.toString()))) {
                        return null;
                    }
                } else {
                    InetAddress inetAddressM1221u2 = m1221u();
                    int localPort2 = serverSocketCreateServerSocket.getLocalPort();
                    StringBuilder sb2 = new StringBuilder(24);
                    sb2.append(inetAddressM1221u2.getHostAddress().replace('.', ','));
                    sb2.append(',');
                    sb2.append(localPort2 >>> 8);
                    sb2.append(',');
                    sb2.append(localPort2 & 255);
                    if (!C0465p.m1263b(m1201a(EnumC0454e.PORT, sb2.toString()))) {
                        return null;
                    }
                }
                if (this.f1591H > 0 && !m1216a(this.f1591H)) {
                    return null;
                }
                if (!C0465p.m1262a(m1206b(str, str2))) {
                    return null;
                }
                if (this.f1608t >= 0) {
                    serverSocketCreateServerSocket.setSoTimeout(this.f1608t);
                }
                socketCreateSocket = serverSocketCreateServerSocket.accept();
                if (this.f1608t >= 0) {
                    socketCreateSocket.setSoTimeout(this.f1608t);
                }
                if (this.f1595L > 0) {
                    socketCreateSocket.setReceiveBufferSize(this.f1595L);
                }
                if (this.f1594K > 0) {
                    socketCreateSocket.setSendBufferSize(this.f1594K);
                }
            } finally {
                serverSocketCreateServerSocket.close();
            }
        } else {
            if (!(this.f1597N || z) || m1201a(EnumC0454e.EPSV, (String) null) != 229) {
                if (!z && m1201a(EnumC0454e.PASV, (String) null) == 227) {
                    String str3 = this.f1574k.get(0);
                    Matcher matcher = f1583V.matcher(str3);
                    if (!matcher.find()) {
                        throw new C0432a("Could not parse passive host information.\nServer Reply: ".concat(String.valueOf(str3)));
                    }
                    this.f1610v = matcher.group(1).replace(',', '.');
                    try {
                        this.f1609u = (Integer.parseInt(matcher.group(2)) << 8) | Integer.parseInt(matcher.group(3));
                        if (this.f1604U != null) {
                            try {
                                String strMo1229a = this.f1604U.mo1229a(this.f1610v);
                                if (!this.f1610v.equals(strMo1229a)) {
                                    m1272a(0, "[Replacing PASV mode reply address " + this.f1610v + " with " + strMo1229a + "]\n");
                                    this.f1610v = strMo1229a;
                                }
                            } catch (UnknownHostException e) {
                                throw new C0432a("Could not parse passive host information.\nServer Reply: ".concat(String.valueOf(str3)));
                            }
                        }
                    } catch (NumberFormatException e2) {
                        throw new C0432a("Could not parse passive port information.\nServer Reply: ".concat(String.valueOf(str3)));
                    }
                }
                return null;
            }
            String str4 = this.f1574k.get(0);
            String strTrim = str4.substring(str4.indexOf(40) + 1, str4.indexOf(41)).trim();
            char cCharAt = strTrim.charAt(0);
            char cCharAt2 = strTrim.charAt(1);
            char cCharAt3 = strTrim.charAt(2);
            char cCharAt4 = strTrim.charAt(strTrim.length() - 1);
            if (cCharAt != cCharAt2 || cCharAt2 != cCharAt3 || cCharAt3 != cCharAt4) {
                throw new C0432a("Could not parse extended passive host information.\nServer Reply: ".concat(String.valueOf(strTrim)));
            }
            try {
                int i = Integer.parseInt(strTrim.substring(3, strTrim.length() - 1));
                this.f1610v = m1279f().getHostAddress();
                this.f1609u = i;
            } catch (NumberFormatException e3) {
                throw new C0432a("Could not parse extended passive host information.\nServer Reply: ".concat(String.valueOf(strTrim)));
            }
            socketCreateSocket = this.f1738g.createSocket();
            if (this.f1595L > 0) {
                socketCreateSocket.setReceiveBufferSize(this.f1595L);
            }
            if (this.f1594K > 0) {
                socketCreateSocket.setSendBufferSize(this.f1594K);
            }
            if (this.f1585B != null) {
                socketCreateSocket.bind(new InetSocketAddress(this.f1585B, 0));
            }
            if (this.f1608t >= 0) {
                socketCreateSocket.setSoTimeout(this.f1608t);
            }
            socketCreateSocket.connect(new InetSocketAddress(this.f1610v, this.f1609u), this.f1740i);
            if (this.f1591H > 0 && !m1216a(this.f1591H)) {
                socketCreateSocket.close();
                return null;
            }
            if (!C0465p.m1262a(m1206b(str, str2))) {
                socketCreateSocket.close();
                return null;
            }
        }
        if (!this.f1590G || m1275a(socketCreateSocket)) {
            return socketCreateSocket;
        }
        socketCreateSocket.close();
        throw new IOException("Host attempting data connection " + socketCreateSocket.getInetAddress().getHostAddress() + " is not same as server " + m1279f().getHostAddress());
    }

    @Override // org.p037a.p038a.p039a.p040a.C0451b, org.p037a.p038a.p039a.AbstractC0473d
    /* JADX INFO: renamed from: a */
    protected final void mo1202a() throws IOException {
        mo1203a((Reader) null);
    }

    @Override // org.p037a.p038a.p039a.p040a.C0451b
    /* JADX INFO: renamed from: a */
    protected final void mo1203a(Reader reader) throws IOException {
        super.mo1203a(reader);
        m1219s();
        if (this.f1605W) {
            ArrayList arrayList = new ArrayList(this.f1574k);
            int i = this.f1573j;
            if (m1218d("UTF8") || m1218d("UTF-8")) {
                m1204a("UTF-8");
                this.f1580q = new C0467a(new InputStreamReader(this.f1736e, m1209i()));
                this.f1581r = new BufferedWriter(new OutputStreamWriter(this.f1737f, m1209i()));
            }
            this.f1574k.clear();
            this.f1574k.addAll(arrayList);
            this.f1573j = i;
            this.f1575l = true;
        }
    }

    @Override // org.p037a.p038a.p039a.p040a.C0451b, org.p037a.p038a.p039a.AbstractC0473d
    /* JADX INFO: renamed from: b */
    public final void mo1207b() {
        super.mo1207b();
        m1219s();
    }

    /* JADX INFO: renamed from: o */
    public final void m1225o() {
        this.f1607s = 2;
        this.f1610v = null;
        this.f1609u = -1;
    }

    /* JADX INFO: renamed from: t */
    private InetAddress m1220t() {
        return this.f1614z != null ? this.f1614z : m1278e();
    }

    /* JADX INFO: renamed from: u */
    private InetAddress m1221u() {
        return this.f1584A != null ? this.f1584A : m1220t();
    }

    /* JADX INFO: renamed from: c */
    public final InputStream m1223c(String str) throws IOException {
        InputStream inputStream;
        BufferedInputStream bufferedInputStream;
        Socket socketM1217d = m1217d(EnumC0454e.RETR.name(), str);
        if (socketM1217d == null) {
            return null;
        }
        if (this.f1586C != 0) {
            inputStream = socketM1217d.getInputStream();
        } else {
            InputStream inputStream2 = socketM1217d.getInputStream();
            if (this.f1593J > 0) {
                bufferedInputStream = new BufferedInputStream(inputStream2, this.f1593J);
            } else {
                bufferedInputStream = new BufferedInputStream(inputStream2);
            }
            inputStream = new C0468b(bufferedInputStream);
        }
        return new C0469c(socketM1217d, inputStream);
    }

    /* JADX INFO: renamed from: d */
    private boolean m1218d(String str) {
        if (m1222v()) {
            return this.f1606X.containsKey(str.toUpperCase(Locale.ENGLISH));
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    private boolean m1222v() {
        String strSubstring;
        String strSubstring2;
        if (this.f1606X == null) {
            int iN = m1214n();
            if (iN == 530) {
                return false;
            }
            boolean zM1263b = C0465p.m1263b(iN);
            this.f1606X = new HashMap<>();
            if (!zM1263b) {
                return false;
            }
            for (String str : m1212l()) {
                if (str.startsWith(" ")) {
                    int iIndexOf = str.indexOf(32, 1);
                    if (iIndexOf > 0) {
                        strSubstring = str.substring(1, iIndexOf);
                        strSubstring2 = str.substring(iIndexOf + 1);
                    } else {
                        strSubstring = str.substring(1);
                        strSubstring2 = "";
                    }
                    String upperCase = strSubstring.toUpperCase(Locale.ENGLISH);
                    Set<String> hashSet = this.f1606X.get(upperCase);
                    if (hashSet == null) {
                        hashSet = new HashSet<>();
                        this.f1606X.put(upperCase, hashSet);
                    }
                    hashSet.add(strSubstring2);
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private boolean m1216a(long j) {
        this.f1591H = 0L;
        return C0465p.m1264c(m1205b(Long.toString(j)));
    }

    /* JADX INFO: renamed from: a */
    private C0464o m1215a(InterfaceC0457h interfaceC0457h) throws IOException {
        String str;
        EnumC0454e enumC0454e = EnumC0454e.LIST;
        if (this.f1596M) {
            str = "-a";
        } else {
            str = null;
        }
        Socket socketM1217d = m1217d(enumC0454e.name(), str);
        C0464o c0464o = new C0464o(interfaceC0457h, this.f1601R);
        if (socketM1217d != null) {
            try {
                c0464o.m1260a(socketM1217d.getInputStream(), m1209i());
                C0470d.m1266a(socketM1217d);
                m1211k();
            } catch (Throwable th) {
                C0470d.m1266a(socketM1217d);
                throw th;
            }
        }
        return c0464o;
    }

    @Override // org.p037a.p038a.p039a.p040a.InterfaceC0433a
    /* JADX INFO: renamed from: a */
    public final void mo1178a(C0453d c0453d) {
        this.f1601R = c0453d;
    }

    /* JADX INFO: renamed from: r */
    public final void m1228r() {
        this.f1602S = 2000000L;
    }

    /* JADX INFO: renamed from: org.a.a.a.a.c$b */
    /* JADX INFO: compiled from: FTPClient.java */
    public static class b implements a {

        /* JADX INFO: renamed from: a */
        private C0452c f1615a;

        public b(C0452c c0452c) {
            this.f1615a = c0452c;
        }

        @Override // org.p037a.p038a.p039a.p040a.C0452c.a
        /* JADX INFO: renamed from: a */
        public final String mo1229a(String str) {
            if (InetAddress.getByName(str).isSiteLocalAddress()) {
                InetAddress inetAddressF = this.f1615a.m1279f();
                if (!inetAddressF.isSiteLocalAddress()) {
                    return inetAddressF.getHostAddress();
                }
                return str;
            }
            return str;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1224c(String str, String str2) {
        m1201a(EnumC0454e.USER, str);
        if (C0465p.m1263b(this.f1573j)) {
            return true;
        }
        if (!C0465p.m1264c(this.f1573j)) {
            return false;
        }
        return C0465p.m1263b(m1201a(EnumC0454e.PASS, str2));
    }

    /* JADX INFO: renamed from: p */
    public final boolean m1226p() {
        if (!C0465p.m1263b(m1201a(EnumC0454e.TYPE, "AEILNTCFRPSBC".substring(2, 3)))) {
            return false;
        }
        this.f1586C = 2;
        this.f1587D = 4;
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final C0464o m1227q() throws IOException {
        if (this.f1599P == null) {
            if (this.f1601R != null && this.f1601R.m1233a().length() > 0) {
                this.f1599P = this.f1592I.mo1184a(this.f1601R);
                this.f1600Q = this.f1601R.m1233a();
            } else {
                String property = System.getProperty("org.apache.commons.net.ftp.systemType");
                if (property == null) {
                    if (this.f1598O == null) {
                        if (C0465p.m1263b(m1201a(EnumC0454e.SYST, (String) null))) {
                            this.f1598O = this.f1574k.get(this.f1574k.size() - 1).substring(4);
                        } else {
                            String property2 = System.getProperty("org.apache.commons.net.ftp.systemType.default");
                            if (property2 != null) {
                                this.f1598O = property2;
                            } else {
                                throw new IOException("Unable to determine system type - response: " + m1213m());
                            }
                        }
                    }
                    String str = this.f1598O;
                    Properties properties = c.f1616a;
                    if (properties == null || (property = properties.getProperty(str)) == null) {
                        property = str;
                    }
                }
                if (this.f1601R != null) {
                    this.f1599P = this.f1592I.mo1184a(new C0453d(property, this.f1601R));
                } else {
                    this.f1599P = this.f1592I.mo1183a(property);
                }
                this.f1600Q = property;
            }
        }
        return m1215a(this.f1599P);
    }
}
