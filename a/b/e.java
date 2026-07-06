package a.b;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: compiled from: SingletonContext.java */
/* JADX INFO: loaded from: classes.dex */
public class e extends b implements a.c {
    private static final org.c.b a = org.c.c.a((Class<?>) e.class);
    private static e b;

    private static synchronized void n() {
        if (b != null) {
            throw new a.d("Singleton context is already initialized");
        }
        Properties properties = new Properties();
        try {
            String property = System.getProperty("jcifs.properties");
            if (property != null && property.length() > 1) {
                FileInputStream fileInputStream = new FileInputStream(property);
                Throwable th = null;
                try {
                    properties.load(fileInputStream);
                    fileInputStream.close();
                } catch (Throwable th2) {
                    if (0 != 0) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    } else {
                        fileInputStream.close();
                    }
                    throw th2;
                }
            }
        } catch (IOException e) {
            a.e("Failed to load config", e);
        }
        properties.putAll(System.getProperties());
        b = new e(properties);
    }

    public static final synchronized e m() {
        if (b == null) {
            try {
                a.b("Initializing singleton context");
                n();
            } catch (a.d e) {
                a.e("Failed to create singleton JCIFS context", e);
            }
        }
        return b;
    }

    private e(Properties properties) {
        super(new a.a.b(properties));
    }
}
