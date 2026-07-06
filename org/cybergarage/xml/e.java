package org.cybergarage.xml;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: compiled from: Parser.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public abstract c a(InputStream inputStream);

    public final c a(URL url) {
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
            org.cybergarage.e.a.b("[Parser.java] Request description.xml file, GET the way, Host URL:" + httpURLConnection.getURL());
            InputStream inputStream = httpURLConnection.getInputStream();
            c cVarA = a(inputStream);
            org.cybergarage.e.a.b("[Parser.java] Successfully get to the description.xml file, converted to a Node object:\n" + cVarA.toString());
            inputStream.close();
            httpURLConnection.disconnect();
            return cVarA;
        } catch (Exception e) {
            org.cybergarage.a.e eVar = new org.cybergarage.a.e();
            eVar.k("GET");
            eVar.l(path);
            org.cybergarage.a.g gVarC = eVar.c(host, i);
            if (!gVarC.q()) {
                throw new f("HTTP comunication failed: no answer from peer.Unable to retrive resoure -> " + url.toString());
            }
            return a(new ByteArrayInputStream(new String(gVarC.e()).getBytes()));
        }
    }

    public final c a(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            c cVarA = a(fileInputStream);
            fileInputStream.close();
            return cVarA;
        } catch (Exception e) {
            throw new f(e);
        }
    }

    public final c a(String str) {
        try {
            return a(new ByteArrayInputStream(str.getBytes()));
        } catch (Exception e) {
            throw new f(e);
        }
    }
}
