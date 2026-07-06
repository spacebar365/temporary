package org.a.a.a;

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

/* JADX INFO: compiled from: SocketClient.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    private static final SocketFactory j = SocketFactory.getDefault();
    private static final ServerSocketFactory k = ServerSocketFactory.getDefault();
    private c l;
    protected int i = 0;
    private int m = -1;
    private int n = -1;
    private Charset o = Charset.defaultCharset();
    protected Socket b = null;
    protected String c = null;
    protected InputStream e = null;
    protected OutputStream f = null;
    protected int a = 0;
    protected int d = 0;
    protected SocketFactory g = j;
    protected ServerSocketFactory h = k;

    protected void a() throws SocketException {
        this.b.setSoTimeout(this.a);
        this.e = this.b.getInputStream();
        this.f = this.b.getOutputStream();
    }

    public final void a(String str, int i) throws IOException {
        this.c = str;
        InetAddress byName = InetAddress.getByName(str);
        this.b = this.g.createSocket();
        if (this.m != -1) {
            this.b.setReceiveBufferSize(this.m);
        }
        if (this.n != -1) {
            this.b.setSendBufferSize(this.n);
        }
        this.b.connect(new InetSocketAddress(byName, i), this.i);
        a();
    }

    public void b() {
        Socket socket = this.b;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
            }
        }
        a(this.e);
        a(this.f);
        this.b = null;
        this.c = null;
        this.e = null;
        this.f = null;
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    public final boolean c() {
        if (this.b == null) {
            return false;
        }
        return this.b.isConnected();
    }

    public final void d() {
        this.d = 21;
    }

    public final InetAddress e() {
        return this.b.getLocalAddress();
    }

    public final InetAddress f() {
        return this.b.getInetAddress();
    }

    public final boolean a(Socket socket) {
        return socket.getInetAddress().equals(this.b.getInetAddress());
    }

    public final void g() {
        this.i = 7000;
    }

    protected final void a(int i, String str) {
        if (h().a() > 0) {
            h().a(i, str);
        }
    }

    protected final void a(String str, String str2) {
        if (h().a() > 0) {
            h().a(str, str2);
        }
    }

    protected c h() {
        return this.l;
    }
}
