package org.p037a.p038a.p039a;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.nio.charset.Charset;
import javax.net.ServerSocketFactory;
import javax.net.SocketFactory;

/* JADX INFO: renamed from: org.a.a.a.d */
/* JADX INFO: compiled from: SocketClient.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0473d {

    /* JADX INFO: renamed from: j */
    private static final SocketFactory f1730j = SocketFactory.getDefault();

    /* JADX INFO: renamed from: k */
    private static final ServerSocketFactory f1731k = ServerSocketFactory.getDefault();

    /* JADX INFO: renamed from: l */
    private C0471c f1741l;

    /* JADX INFO: renamed from: i */
    protected int f1740i = 0;

    /* JADX INFO: renamed from: m */
    private int f1742m = -1;

    /* JADX INFO: renamed from: n */
    private int f1743n = -1;

    /* JADX INFO: renamed from: o */
    private Charset f1744o = Charset.defaultCharset();

    /* JADX INFO: renamed from: b */
    protected Socket f1733b = null;

    /* JADX INFO: renamed from: c */
    protected String f1734c = null;

    /* JADX INFO: renamed from: e */
    protected InputStream f1736e = null;

    /* JADX INFO: renamed from: f */
    protected OutputStream f1737f = null;

    /* JADX INFO: renamed from: a */
    protected int f1732a = 0;

    /* JADX INFO: renamed from: d */
    protected int f1735d = 0;

    /* JADX INFO: renamed from: g */
    protected SocketFactory f1738g = f1730j;

    /* JADX INFO: renamed from: h */
    protected ServerSocketFactory f1739h = f1731k;

    /* JADX INFO: renamed from: a */
    protected void mo1202a() throws SocketException {
        this.f1733b.setSoTimeout(this.f1732a);
        this.f1736e = this.f1733b.getInputStream();
        this.f1737f = this.f1733b.getOutputStream();
    }

    /* JADX INFO: renamed from: a */
    public final void m1273a(String str, int i) throws IOException {
        this.f1734c = str;
        InetAddress byName = InetAddress.getByName(str);
        this.f1733b = this.f1738g.createSocket();
        if (this.f1742m != -1) {
            this.f1733b.setReceiveBufferSize(this.f1742m);
        }
        if (this.f1743n != -1) {
            this.f1733b.setSendBufferSize(this.f1743n);
        }
        this.f1733b.connect(new InetSocketAddress(byName, i), this.f1740i);
        mo1202a();
    }

    /* JADX INFO: renamed from: b */
    public void mo1207b() {
        Socket socket = this.f1733b;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
            }
        }
        m1271a(this.f1736e);
        m1271a(this.f1737f);
        this.f1733b = null;
        this.f1734c = null;
        this.f1736e = null;
        this.f1737f = null;
    }

    /* JADX INFO: renamed from: a */
    private static void m1271a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1276c() {
        if (this.f1733b == null) {
            return false;
        }
        return this.f1733b.isConnected();
    }

    /* JADX INFO: renamed from: d */
    public final void m1277d() {
        this.f1735d = 21;
    }

    /* JADX INFO: renamed from: e */
    public final InetAddress m1278e() {
        return this.f1733b.getLocalAddress();
    }

    /* JADX INFO: renamed from: f */
    public final InetAddress m1279f() {
        return this.f1733b.getInetAddress();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1275a(Socket socket) {
        return socket.getInetAddress().equals(this.f1733b.getInetAddress());
    }

    /* JADX INFO: renamed from: g */
    public final void m1280g() {
        this.f1740i = 7000;
    }

    /* JADX INFO: renamed from: a */
    protected final void m1272a(int i, String str) {
        if (mo1208h().m1267a() > 0) {
            mo1208h().m1268a(i, str);
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m1274a(String str, String str2) {
        if (mo1208h().m1267a() > 0) {
            mo1208h().m1269a(str, str2);
        }
    }

    /* JADX INFO: renamed from: h */
    protected C0471c mo1208h() {
        return this.f1741l;
    }
}
