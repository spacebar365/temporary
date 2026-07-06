package org.a.a.a.a;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: compiled from: FTPClient.java */
/* JADX INFO: loaded from: classes.dex */
public class c$c {
    static final Properties a;

    static {
        InputStream resourceAsStream = c.class.getResourceAsStream("/systemType.properties");
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
        a = properties;
    }
}
