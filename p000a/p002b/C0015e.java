package p000a.p002b;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.C0044d;
import p000a.InterfaceC0016c;
import p000a.p001a.C0002b;

/* JADX INFO: renamed from: a.b.e */
/* JADX INFO: compiled from: SingletonContext.java */
/* JADX INFO: loaded from: classes.dex */
public class C0015e extends C0012b implements InterfaceC0016c {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f96a = C1620c.m4563a((Class<?>) C0015e.class);

    /* JADX INFO: renamed from: b */
    private static C0015e f97b;

    /* JADX INFO: renamed from: n */
    private static synchronized void m122n() {
        if (f97b != null) {
            throw new C0044d("Singleton context is already initialized");
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
            f96a.mo4544e("Failed to load config", e);
        }
        properties.putAll(System.getProperties());
        f97b = new C0015e(properties);
    }

    /* JADX INFO: renamed from: m */
    public static final synchronized C0015e m121m() {
        if (f97b == null) {
            try {
                f96a.mo4534b("Initializing singleton context");
                m122n();
            } catch (C0044d e) {
                f96a.mo4544e("Failed to create singleton JCIFS context", e);
            }
        }
        return f97b;
    }

    private C0015e(Properties properties) {
        super(new C0002b(properties));
    }
}
