package org.cybergarage.p157d;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.cybergarage.xml.C1752c;

/* JADX INFO: renamed from: org.cybergarage.d.h */
/* JADX INFO: compiled from: Icon.java */
/* JADX INFO: loaded from: classes.dex */
public class C1736h {

    /* JADX INFO: renamed from: a */
    private C1752c f6507a;

    /* JADX INFO: renamed from: b */
    private Object f6508b;

    /* JADX INFO: renamed from: c */
    private byte[] f6509c;

    /* JADX INFO: renamed from: a */
    public final C1752c m5040a() {
        return this.f6507a;
    }

    public C1736h(C1752c c1752c) {
        this.f6508b = null;
        this.f6509c = null;
        this.f6507a = c1752c;
    }

    public C1736h() {
        this(new C1752c("icon"));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5039a(C1752c c1752c) {
        return "icon".equals(c1752c.m5153h());
    }

    /* JADX INFO: renamed from: a */
    public final void m5041a(int i) {
        try {
            this.f6507a.m5147d("width", Integer.toString(i));
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5045b(int i) {
        try {
            this.f6507a.m5147d("height", Integer.toString(i));
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5044b() {
        try {
            this.f6507a.m5147d("depth", Integer.toString(24));
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5048d() {
        String strM5047c = m5047c();
        return strM5047c != null && strM5047c.length() > 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m5043a(byte[] bArr) {
        this.f6509c = bArr;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5049e() {
        if (this.f6509c != null) {
            return true;
        }
        return m5048d() && C1736h.class.getResourceAsStream(m5047c()) != null;
    }

    /* JADX INFO: renamed from: f */
    public final byte[] m5050f() {
        if (this.f6509c == null && m5048d()) {
            try {
                InputStream resourceAsStream = C1736h.class.getResourceAsStream(m5047c());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int i = resourceAsStream.read();
                    if (i == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(i);
                }
                resourceAsStream.close();
                this.f6509c = byteArrayOutputStream.toByteArray();
            } catch (Exception e) {
            }
        }
        return this.f6509c;
    }

    /* JADX INFO: renamed from: a */
    public final void m5042a(String str) {
        this.f6507a.m5147d("mimetype", str);
    }

    /* JADX INFO: renamed from: b */
    public final void m5046b(String str) {
        this.f6507a.m5147d("url", str);
    }

    /* JADX INFO: renamed from: c */
    public final String m5047c() {
        return this.f6507a.m5166n("url");
    }
}
