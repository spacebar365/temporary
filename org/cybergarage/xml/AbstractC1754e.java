package org.cybergarage.xml;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.cybergarage.p154a.C1627e;
import org.cybergarage.p154a.C1629g;
import org.cybergarage.p173e.C1744a;

/* JADX INFO: renamed from: org.cybergarage.xml.e */
/* JADX INFO: compiled from: Parser.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1754e {
    /* JADX INFO: renamed from: a */
    public abstract C1752c mo5171a(InputStream inputStream);

    /* JADX INFO: renamed from: a */
    public final C1752c m5173a(URL url) {
        String host = url.getHost();
        int port = url.getPort();
        int i = port == -1 ? 80 : port;
        String path = url.getPath();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Content-Length", "0");
            if (host != null) {
                httpURLConnection.setRequestProperty("HOST", host);
            }
            C1744a.m5120b("[Parser.java] Request description.xml file, GET the way, Host URL:" + httpURLConnection.getURL());
            InputStream inputStream = httpURLConnection.getInputStream();
            C1752c c1752cMo5171a = mo5171a(inputStream);
            C1744a.m5120b("[Parser.java] Successfully get to the description.xml file, converted to a Node object:\n" + c1752cMo5171a.toString());
            inputStream.close();
            httpURLConnection.disconnect();
            return c1752cMo5171a;
        } catch (Exception e) {
            C1627e c1627e = new C1627e();
            c1627e.m4656k("GET");
            c1627e.m4657l(path);
            C1629g c1629gM4655c = c1627e.m4655c(host, i);
            if (!c1629gM4655c.m4672q()) {
                throw new C1755f("HTTP comunication failed: no answer from peer.Unable to retrive resoure -> " + url.toString());
            }
            return mo5171a(new ByteArrayInputStream(new String(c1629gM4655c.m4620e()).getBytes()));
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1752c m5170a(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            C1752c c1752cMo5171a = mo5171a(fileInputStream);
            fileInputStream.close();
            return c1752cMo5171a;
        } catch (Exception e) {
            throw new C1755f(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1752c m5172a(String str) {
        try {
            return mo5171a(new ByteArrayInputStream(str.getBytes()));
        } catch (Exception e) {
            throw new C1755f(e);
        }
    }
}
