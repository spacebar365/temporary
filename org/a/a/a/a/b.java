package org.a.a.a.a;

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

/* JADX INFO: compiled from: FTP.java */
/* JADX INFO: loaded from: classes.dex */
public class b extends org.a.a.a.d {
    protected int j;
    protected ArrayList<String> k;
    protected boolean l;
    protected String m;
    protected String n;
    protected org.a.a.a.c o;
    protected BufferedReader q;
    protected BufferedWriter r;
    protected boolean p = false;
    private boolean s = true;

    public b() {
        d();
        this.k = new ArrayList<>();
        this.l = false;
        this.m = null;
        this.n = "ISO-8859-1";
        this.o = new org.a.a.a.c(this);
    }

    @Override // org.a.a.a.d
    protected void a() throws IOException {
        a((Reader) null);
    }

    protected void a(Reader reader) throws IOException {
        super.a();
        if (reader == null) {
            this.q = new org.a.a.a.b.a(new InputStreamReader(this.e, this.n));
        } else {
            this.q = new org.a.a.a.b.a(reader);
        }
        this.r = new BufferedWriter(new OutputStreamWriter(this.f, this.n));
        if (this.i > 0) {
            int soTimeout = this.b.getSoTimeout();
            this.b.setSoTimeout(this.i);
            try {
                try {
                    o();
                    if (p.a(this.j)) {
                        o();
                    }
                    return;
                } catch (SocketTimeoutException e) {
                    IOException iOException = new IOException("Timed out waiting for initial connect reply");
                    iOException.initCause(e);
                    throw iOException;
                }
            } finally {
                this.b.setSoTimeout(soTimeout);
            }
        }
        o();
        if (p.a(this.j)) {
            o();
        }
    }

    public final void a(String str) {
        this.n = str;
    }

    public final String i() {
        return this.n;
    }

    @Override // org.a.a.a.d
    public void b() {
        super.b();
        this.q = null;
        this.r = null;
        this.l = false;
        this.m = null;
    }

    public final int b(String str, String str2) throws IOException {
        if (this.r == null) {
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
            this.r.write(string);
            this.r.flush();
            a(str, string);
            o();
            return this.j;
        } catch (SocketException e) {
            if (!c()) {
                throw new f("Connection unexpectedly closed.");
            }
            throw e;
        }
    }

    public final int j() {
        return this.j;
    }

    public final int k() throws IOException {
        o();
        return this.j;
    }

    public final String[] l() {
        return (String[]) this.k.toArray(new String[this.k.size()]);
    }

    public final String m() {
        if (!this.l) {
            return this.m;
        }
        StringBuilder sb = new StringBuilder(256);
        Iterator<String> it = this.k.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append("\r\n");
        }
        this.l = false;
        String string = sb.toString();
        this.m = string;
        return string;
    }

    public final int n() {
        return a(e.j, (String) null);
    }

    public final int b(String str) {
        return a(e.A, str);
    }

    @Override // org.a.a.a.d
    protected final org.a.a.a.c h() {
        return this.o;
    }

    private void o() throws IOException {
        this.l = true;
        this.k.clear();
        String line = this.q.readLine();
        if (line == null) {
            throw new f("Connection closed without indication.");
        }
        int length = line.length();
        if (length < 3) {
            throw new org.a.a.a.a("Truncated server reply: ".concat(String.valueOf(line)));
        }
        try {
            String strSubstring = line.substring(0, 3);
            this.j = Integer.parseInt(strSubstring);
            this.k.add(line);
            if (length > 3) {
                char cCharAt = line.charAt(3);
                if (cCharAt == '-') {
                    while (true) {
                        String line2 = this.q.readLine();
                        if (line2 == null) {
                            throw new f("Connection closed without indication.");
                        }
                        this.k.add(line2);
                        if (this.p) {
                            if (!((line2.startsWith(strSubstring) && line2.charAt(3) == ' ') ? false : true)) {
                                break;
                            }
                        } else {
                            if (!(line2.length() <= 3 || line2.charAt(3) == '-' || !Character.isDigit(line2.charAt(0)))) {
                                break;
                            }
                        }
                    }
                } else if (this.s) {
                    if (length == 4) {
                        throw new org.a.a.a.a("Truncated server reply: '" + line + "'");
                    }
                    if (cCharAt != ' ') {
                        throw new org.a.a.a.a("Invalid server reply: '" + line + "'");
                    }
                }
            } else if (this.s) {
                throw new org.a.a.a.a("Truncated server reply: '" + line + "'");
            }
            a(this.j, m());
            if (this.j != 421) {
            } else {
                throw new f("FTP response 421 received.  Server closed connection.");
            }
        } catch (NumberFormatException e) {
            throw new org.a.a.a.a("Could not parse response code.\nServer Reply: ".concat(String.valueOf(line)));
        }
    }

    public final int a(e eVar, String str) {
        return b(eVar.name(), str);
    }
}
