package org.p037a.p038a.p039a.p040a;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import org.p037a.p038a.p039a.AbstractC0473d;
import org.p037a.p038a.p039a.C0432a;
import org.p037a.p038a.p039a.C0471c;
import org.p037a.p038a.p039a.p042b.C0467a;

/* JADX INFO: renamed from: org.a.a.a.a.b */
/* JADX INFO: compiled from: FTP.java */
/* JADX INFO: loaded from: classes.dex */
public class C0451b extends AbstractC0473d {

    /* JADX INFO: renamed from: j */
    protected int f1573j;

    /* JADX INFO: renamed from: k */
    protected ArrayList<String> f1574k;

    /* JADX INFO: renamed from: l */
    protected boolean f1575l;

    /* JADX INFO: renamed from: m */
    protected String f1576m;

    /* JADX INFO: renamed from: n */
    protected String f1577n;

    /* JADX INFO: renamed from: o */
    protected C0471c f1578o;

    /* JADX INFO: renamed from: q */
    protected BufferedReader f1580q;

    /* JADX INFO: renamed from: r */
    protected BufferedWriter f1581r;

    /* JADX INFO: renamed from: p */
    protected boolean f1579p = false;

    /* JADX INFO: renamed from: s */
    private boolean f1582s = true;

    public C0451b() {
        m1277d();
        this.f1574k = new ArrayList<>();
        this.f1575l = false;
        this.f1576m = null;
        this.f1577n = "ISO-8859-1";
        this.f1578o = new C0471c(this);
    }

    @Override // org.p037a.p038a.p039a.AbstractC0473d
    /* JADX INFO: renamed from: a */
    protected void mo1202a() throws IOException {
        mo1203a((Reader) null);
    }

    /* JADX INFO: renamed from: a */
    protected void mo1203a(Reader reader) throws IOException {
        super.mo1202a();
        if (reader == null) {
            this.f1580q = new C0467a(new InputStreamReader(this.f1736e, this.f1577n));
        } else {
            this.f1580q = new C0467a(reader);
        }
        this.f1581r = new BufferedWriter(new OutputStreamWriter(this.f1737f, this.f1577n));
        if (this.f1740i > 0) {
            int soTimeout = this.f1733b.getSoTimeout();
            this.f1733b.setSoTimeout(this.f1740i);
            try {
                try {
                    m1200o();
                    if (C0465p.m1262a(this.f1573j)) {
                        m1200o();
                    }
                    return;
                } catch (SocketTimeoutException e) {
                    IOException iOException = new IOException("Timed out waiting for initial connect reply");
                    iOException.initCause(e);
                    throw iOException;
                }
            } finally {
                this.f1733b.setSoTimeout(soTimeout);
            }
        }
        m1200o();
        if (C0465p.m1262a(this.f1573j)) {
            m1200o();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1204a(String str) {
        this.f1577n = str;
    }

    /* JADX INFO: renamed from: i */
    public final String m1209i() {
        return this.f1577n;
    }

    @Override // org.p037a.p038a.p039a.AbstractC0473d
    /* JADX INFO: renamed from: b */
    public void mo1207b() {
        super.mo1207b();
        this.f1580q = null;
        this.f1581r = null;
        this.f1575l = false;
        this.f1576m = null;
    }

    /* JADX INFO: renamed from: b */
    public final int m1206b(String str, String str2) throws IOException {
        if (this.f1581r == null) {
            throw new IOException("Connection is not open");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str2 != null) {
            sb.append(' ');
            sb.append(str2);
        }
        sb.append("\r\n");
        String string = sb.toString();
        try {
            this.f1581r.write(string);
            this.f1581r.flush();
            m1274a(str, string);
            m1200o();
            return this.f1573j;
        } catch (SocketException e) {
            if (!m1276c()) {
                throw new C0455f("Connection unexpectedly closed.");
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m1210j() {
        return this.f1573j;
    }

    /* JADX INFO: renamed from: k */
    public final int m1211k() throws IOException {
        m1200o();
        return this.f1573j;
    }

    /* JADX INFO: renamed from: l */
    public final String[] m1212l() {
        return (String[]) this.f1574k.toArray(new String[this.f1574k.size()]);
    }

    /* JADX INFO: renamed from: m */
    public final String m1213m() {
        if (!this.f1575l) {
            return this.f1576m;
        }
        StringBuilder sb = new StringBuilder(256);
        Iterator<String> it = this.f1574k.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append("\r\n");
        }
        this.f1575l = false;
        String string = sb.toString();
        this.f1576m = string;
        return string;
    }

    /* JADX INFO: renamed from: n */
    public final int m1214n() {
        return m1201a(EnumC0454e.FEAT, (String) null);
    }

    /* JADX INFO: renamed from: b */
    public final int m1205b(String str) {
        return m1201a(EnumC0454e.REST, str);
    }

    @Override // org.p037a.p038a.p039a.AbstractC0473d
    /* JADX INFO: renamed from: h */
    protected final C0471c mo1208h() {
        return this.f1578o;
    }

    /* JADX INFO: renamed from: o */
    private void m1200o() throws IOException {
        this.f1575l = true;
        this.f1574k.clear();
        String line = this.f1580q.readLine();
        if (line == null) {
            throw new C0455f("Connection closed without indication.");
        }
        int length = line.length();
        if (length < 3) {
            throw new C0432a("Truncated server reply: ".concat(String.valueOf(line)));
        }
        try {
            String strSubstring = line.substring(0, 3);
            this.f1573j = Integer.parseInt(strSubstring);
            this.f1574k.add(line);
            if (length > 3) {
                char cCharAt = line.charAt(3);
                if (cCharAt == '-') {
                    while (true) {
                        String line2 = this.f1580q.readLine();
                        if (line2 == null) {
                            throw new C0455f("Connection closed without indication.");
                        }
                        this.f1574k.add(line2);
                        if (this.f1579p) {
                            if (!((line2.startsWith(strSubstring) && line2.charAt(3) == ' ') ? false : true)) {
                                break;
                            }
                        } else {
                            if (!(line2.length() <= 3 || line2.charAt(3) == '-' || !Character.isDigit(line2.charAt(0)))) {
                                break;
                            }
                        }
                    }
                } else if (this.f1582s) {
                    if (length == 4) {
                        throw new C0432a("Truncated server reply: '" + line + "'");
                    }
                    if (cCharAt != ' ') {
                        throw new C0432a("Invalid server reply: '" + line + "'");
                    }
                }
            } else if (this.f1582s) {
                throw new C0432a("Truncated server reply: '" + line + "'");
            }
            m1272a(this.f1573j, m1213m());
            if (this.f1573j != 421) {
            } else {
                throw new C0455f("FTP response 421 received.  Server closed connection.");
            }
        } catch (NumberFormatException e) {
            throw new C0432a("Could not parse response code.\nServer Reply: ".concat(String.valueOf(line)));
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m1201a(EnumC0454e enumC0454e, String str) {
        return m1206b(enumC0454e.name(), str);
    }
}
