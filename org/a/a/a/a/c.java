package org.a.a.a.a;

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

/* JADX INFO: compiled from: FTPClient.java */
/* JADX INFO: loaded from: classes.dex */
public class c extends b implements a {
    private static final Pattern V = Pattern.compile("(\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3}),(\\d{1,3}),(\\d{1,3})");
    private InetAddress A;
    private InetAddress B;
    private int C;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private long H;
    private org.a.a.a.a.a.d I;
    private int J;
    private int K;
    private int L;
    private boolean M;
    private boolean N;
    private String O;
    private h P;
    private String Q;
    private d R;
    private long S;
    private int T = 1000;
    private c$a U = new c$b(this);
    private boolean W = false;
    private HashMap<String, Set<String>> X;
    private int s;
    private int t;
    private int u;
    private String v;
    private final Random w;
    private int x;
    private int y;
    private InetAddress z;

    public c() {
        s();
        this.t = -1;
        this.G = true;
        this.I = new org.a.a.a.a.a.c();
        this.R = null;
        this.M = false;
        this.N = false;
        this.w = new Random();
        this.B = null;
    }

    private void s() {
        this.s = 0;
        this.v = null;
        this.u = -1;
        this.z = null;
        this.A = null;
        this.x = 0;
        this.y = 0;
        this.C = 0;
        this.E = 7;
        this.D = 4;
        this.F = 10;
        this.H = 0L;
        this.O = null;
        this.P = null;
        this.Q = "";
        this.X = null;
    }

    private Socket d(String str, String str2) throws IOException {
        Socket socketCreateSocket;
        if (this.s != 0 && this.s != 2) {
            return null;
        }
        boolean z = f() instanceof Inet6Address;
        if (this.s == 0) {
            ServerSocket serverSocketCreateServerSocket = this.h.createServerSocket((this.x <= 0 || this.y < this.x) ? 0 : this.y == this.x ? this.y : this.w.nextInt((this.y - this.x) + 1) + this.x, 1, t());
            try {
                if (z) {
                    InetAddress inetAddressU = u();
                    int localPort = serverSocketCreateServerSocket.getLocalPort();
                    StringBuilder sb = new StringBuilder();
                    String hostAddress = inetAddressU.getHostAddress();
                    int iIndexOf = hostAddress.indexOf("%");
                    if (iIndexOf > 0) {
                        hostAddress = hostAddress.substring(0, iIndexOf);
                    }
                    sb.append("|");
                    if (inetAddressU instanceof Inet4Address) {
                        sb.append("1");
                    } else if (inetAddressU instanceof Inet6Address) {
                        sb.append("2");
                    }
                    sb.append("|");
                    sb.append(hostAddress);
                    sb.append("|");
                    sb.append(localPort);
                    sb.append("|");
                    if (!p.b(a(e.h, sb.toString()))) {
                        return null;
                    }
                } else {
                    InetAddress inetAddressU2 = u();
                    int localPort2 = serverSocketCreateServerSocket.getLocalPort();
                    StringBuilder sb2 = new StringBuilder(24);
                    sb2.append(inetAddressU2.getHostAddress().replace('.', ','));
                    sb2.append(',');
                    sb2.append(localPort2 >>> 8);
                    sb2.append(',');
                    sb2.append(localPort2 & 255);
                    if (!p.b(a(e.w, sb2.toString()))) {
                        return null;
                    }
                }
                if (this.H > 0 && !a(this.H)) {
                    return null;
                }
                if (!p.a(b(str, str2))) {
                    return null;
                }
                if (this.t >= 0) {
                    serverSocketCreateServerSocket.setSoTimeout(this.t);
                }
                socketCreateSocket = serverSocketCreateServerSocket.accept();
                if (this.t >= 0) {
                    socketCreateSocket.setSoTimeout(this.t);
                }
                if (this.L > 0) {
                    socketCreateSocket.setReceiveBufferSize(this.L);
                }
                if (this.K > 0) {
                    socketCreateSocket.setSendBufferSize(this.K);
                }
            } finally {
                serverSocketCreateServerSocket.close();
            }
        } else {
            if (!(this.N || z) || a(e.i, (String) null) != 229) {
                if (!z && a(e.v, (String) null) == 227) {
                    String str3 = this.k.get(0);
                    Matcher matcher = V.matcher(str3);
                    if (!matcher.find()) {
                        throw new org.a.a.a.a("Could not parse passive host information.\nServer Reply: ".concat(String.valueOf(str3)));
                    }
                    this.v = matcher.group(1).replace(',', '.');
                    try {
                        this.u = (Integer.parseInt(matcher.group(2)) << 8) | Integer.parseInt(matcher.group(3));
                        if (this.U != null) {
                            try {
                                String strA = this.U.a(this.v);
                                if (!this.v.equals(strA)) {
                                    a(0, "[Replacing PASV mode reply address " + this.v + " with " + strA + "]\n");
                                    this.v = strA;
                                }
                            } catch (UnknownHostException e) {
                                throw new org.a.a.a.a("Could not parse passive host information.\nServer Reply: ".concat(String.valueOf(str3)));
                            }
                        }
                    } catch (NumberFormatException e2) {
                        throw new org.a.a.a.a("Could not parse passive port information.\nServer Reply: ".concat(String.valueOf(str3)));
                    }
                }
                return null;
            }
            String str4 = this.k.get(0);
            String strTrim = str4.substring(str4.indexOf(40) + 1, str4.indexOf(41)).trim();
            char cCharAt = strTrim.charAt(0);
            char cCharAt2 = strTrim.charAt(1);
            char cCharAt3 = strTrim.charAt(2);
            char cCharAt4 = strTrim.charAt(strTrim.length() - 1);
            if (cCharAt != cCharAt2 || cCharAt2 != cCharAt3 || cCharAt3 != cCharAt4) {
                throw new org.a.a.a.a("Could not parse extended passive host information.\nServer Reply: ".concat(String.valueOf(strTrim)));
            }
            try {
                int i = Integer.parseInt(strTrim.substring(3, strTrim.length() - 1));
                this.v = f().getHostAddress();
                this.u = i;
            } catch (NumberFormatException e3) {
                throw new org.a.a.a.a("Could not parse extended passive host information.\nServer Reply: ".concat(String.valueOf(strTrim)));
            }
            socketCreateSocket = this.g.createSocket();
            if (this.L > 0) {
                socketCreateSocket.setReceiveBufferSize(this.L);
            }
            if (this.K > 0) {
                socketCreateSocket.setSendBufferSize(this.K);
            }
            if (this.B != null) {
                socketCreateSocket.bind(new InetSocketAddress(this.B, 0));
            }
            if (this.t >= 0) {
                socketCreateSocket.setSoTimeout(this.t);
            }
            socketCreateSocket.connect(new InetSocketAddress(this.v, this.u), this.i);
            if (this.H > 0 && !a(this.H)) {
                socketCreateSocket.close();
                return null;
            }
            if (!p.a(b(str, str2))) {
                socketCreateSocket.close();
                return null;
            }
        }
        if (!this.G || a(socketCreateSocket)) {
            return socketCreateSocket;
        }
        socketCreateSocket.close();
        throw new IOException("Host attempting data connection " + socketCreateSocket.getInetAddress().getHostAddress() + " is not same as server " + f().getHostAddress());
    }

    @Override // org.a.a.a.a.b, org.a.a.a.d
    protected final void a() throws IOException {
        a((Reader) null);
    }

    @Override // org.a.a.a.a.b
    protected final void a(Reader reader) throws IOException {
        super.a(reader);
        s();
        if (this.W) {
            ArrayList arrayList = new ArrayList(this.k);
            int i = this.j;
            if (d("UTF8") || d("UTF-8")) {
                a("UTF-8");
                this.q = new org.a.a.a.b.a(new InputStreamReader(this.e, i()));
                this.r = new BufferedWriter(new OutputStreamWriter(this.f, i()));
            }
            this.k.clear();
            this.k.addAll(arrayList);
            this.j = i;
            this.l = true;
        }
    }

    @Override // org.a.a.a.a.b, org.a.a.a.d
    public final void b() {
        super.b();
        s();
    }

    public final void o() {
        this.s = 2;
        this.v = null;
        this.u = -1;
    }

    private InetAddress t() {
        return this.z != null ? this.z : e();
    }

    private InetAddress u() {
        return this.A != null ? this.A : t();
    }

    public final InputStream c(String str) throws IOException {
        InputStream inputStream;
        BufferedInputStream bufferedInputStream;
        Socket socketD = d(e.B.name(), str);
        if (socketD == null) {
            return null;
        }
        if (this.C != 0) {
            inputStream = socketD.getInputStream();
        } else {
            InputStream inputStream2 = socketD.getInputStream();
            if (this.J > 0) {
                bufferedInputStream = new BufferedInputStream(inputStream2, this.J);
            } else {
                bufferedInputStream = new BufferedInputStream(inputStream2);
            }
            inputStream = new org.a.a.a.b.b(bufferedInputStream);
        }
        return new org.a.a.a.b.c(socketD, inputStream);
    }

    private boolean d(String str) {
        if (v()) {
            return this.X.containsKey(str.toUpperCase(Locale.ENGLISH));
        }
        return false;
    }

    private boolean v() {
        String strSubstring;
        String strSubstring2;
        if (this.X == null) {
            int iN = n();
            if (iN == 530) {
                return false;
            }
            boolean zB = p.b(iN);
            this.X = new HashMap<>();
            if (!zB) {
                return false;
            }
            for (String str : l()) {
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
                    Set<String> hashSet = this.X.get(upperCase);
                    if (hashSet == null) {
                        hashSet = new HashSet<>();
                        this.X.put(upperCase, hashSet);
                    }
                    hashSet.add(strSubstring2);
                }
            }
        }
        return true;
    }

    private boolean a(long j) {
        this.H = 0L;
        return p.c(b(Long.toString(j)));
    }

    private o a(h hVar) throws IOException {
        String str;
        e eVar = e.l;
        if (this.M) {
            str = "-a";
        } else {
            str = null;
        }
        Socket socketD = d(eVar.name(), str);
        o oVar = new o(hVar, this.R);
        if (socketD != null) {
            try {
                oVar.a(socketD.getInputStream(), i());
                org.a.a.a.b.d.a(socketD);
                k();
            } catch (Throwable th) {
                org.a.a.a.b.d.a(socketD);
                throw th;
            }
        }
        return oVar;
    }

    @Override // org.a.a.a.a.a
    public final void a(d dVar) {
        this.R = dVar;
    }

    public final void r() {
        this.S = 2000000L;
    }

    public final boolean c(String str, String str2) {
        a(e.N, str);
        if (p.b(this.j)) {
            return true;
        }
        if (!p.c(this.j)) {
            return false;
        }
        return p.b(a(e.u, str2));
    }

    public final boolean p() {
        if (!p.b(a(e.M, "AEILNTCFRPSBC".substring(2, 3)))) {
            return false;
        }
        this.C = 2;
        this.D = 4;
        return true;
    }

    public final o q() throws IOException {
        if (this.P == null) {
            if (this.R != null && this.R.a().length() > 0) {
                this.P = this.I.a(this.R);
                this.Q = this.R.a();
            } else {
                String property = System.getProperty("org.apache.commons.net.ftp.systemType");
                if (property == null) {
                    if (this.O == null) {
                        if (p.b(a(e.L, (String) null))) {
                            this.O = this.k.get(this.k.size() - 1).substring(4);
                        } else {
                            String property2 = System.getProperty("org.apache.commons.net.ftp.systemType.default");
                            if (property2 != null) {
                                this.O = property2;
                            } else {
                                throw new IOException("Unable to determine system type - response: " + m());
                            }
                        }
                    }
                    String str = this.O;
                    Properties properties = c$c.a;
                    if (properties == null || (property = properties.getProperty(str)) == null) {
                        property = str;
                    }
                }
                if (this.R != null) {
                    this.P = this.I.a(new d(property, this.R));
                } else {
                    this.P = this.I.a(property);
                }
                this.Q = property;
            }
        }
        return a(this.P);
    }
}
