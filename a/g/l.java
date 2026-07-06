package a.g;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/* JADX INFO: compiled from: Handler.java */
/* JADX INFO: loaded from: classes.dex */
public class l extends URLStreamHandler {
    private a.c c;
    private static final org.c.b b = org.c.c.a((Class<?>) l.class);
    static final URLStreamHandler a = new l();

    public l() {
    }

    public l(a.c cVar) {
        this.c = cVar;
    }

    @Override // java.net.URLStreamHandler
    protected int getDefaultPort() {
        return 445;
    }

    @Override // java.net.URLStreamHandler
    public URLConnection openConnection(URL url) {
        if (b.c()) {
            b.b("Opening file ".concat(String.valueOf(url)));
        }
        if (this.c == null) {
            this.c = a.b.e.m();
        }
        return new ae(url, this.c);
    }

    @Override // java.net.URLStreamHandler
    protected void parseURL(URL url, String str, int i, int i2) {
        String host = url.getHost();
        if (str.equals("smb://")) {
            str = "smb:////";
            i2 += 2;
        } else if (!str.startsWith("smb://") && host != null && host.length() == 0) {
            str = "//".concat(String.valueOf(str));
            i2 += 2;
        }
        super.parseURL(url, str, i, i2);
        String path = url.getPath();
        String ref = url.getRef();
        if (ref != null) {
            path = path + '#' + ref;
        }
        int port = url.getPort();
        if (port == -1) {
            port = getDefaultPort();
        }
        setURL(url, "smb", url.getHost(), port, url.getAuthority(), url.getUserInfo(), path, url.getQuery(), null);
    }
}
