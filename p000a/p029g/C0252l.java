package p000a.p029g;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.InterfaceC0016c;
import p000a.p002b.C0015e;

/* JADX INFO: renamed from: a.g.l */
/* JADX INFO: compiled from: Handler.java */
/* JADX INFO: loaded from: classes.dex */
public class C0252l extends URLStreamHandler {

    /* JADX INFO: renamed from: c */
    private InterfaceC0016c f1164c;

    /* JADX INFO: renamed from: b */
    private static final InterfaceC1612b f1163b = C1620c.m4563a((Class<?>) C0252l.class);

    /* JADX INFO: renamed from: a */
    static final URLStreamHandler f1162a = new C0252l();

    public C0252l() {
    }

    public C0252l(InterfaceC0016c interfaceC0016c) {
        this.f1164c = interfaceC0016c;
    }

    @Override // java.net.URLStreamHandler
    protected int getDefaultPort() {
        return 445;
    }

    @Override // java.net.URLStreamHandler
    public URLConnection openConnection(URL url) {
        if (f1163b.mo4539c()) {
            f1163b.mo4534b("Opening file ".concat(String.valueOf(url)));
        }
        if (this.f1164c == null) {
            this.f1164c = C0015e.m121m();
        }
        return new C0215ae(url, this.f1164c);
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
