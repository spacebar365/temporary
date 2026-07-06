package org.cybergarage.d;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* JADX INFO: compiled from: Icon.java */
/* JADX INFO: loaded from: classes.dex */
public class h {
    private org.cybergarage.xml.c a;
    private Object b;
    private byte[] c;

    public final org.cybergarage.xml.c a() {
        return this.a;
    }

    public h(org.cybergarage.xml.c cVar) {
        this.b = null;
        this.c = null;
        this.a = cVar;
    }

    public h() {
        this(new org.cybergarage.xml.c("icon"));
    }

    public static boolean a(org.cybergarage.xml.c cVar) {
        return "icon".equals(cVar.h());
    }

    public final void a(int i) {
        try {
            this.a.d("width", Integer.toString(i));
        } catch (Exception e) {
        }
    }

    public final void b(int i) {
        try {
            this.a.d("height", Integer.toString(i));
        } catch (Exception e) {
        }
    }

    public final void b() {
        try {
            this.a.d("depth", Integer.toString(24));
        } catch (Exception e) {
        }
    }

    public final boolean d() {
        String strC = c();
        return strC != null && strC.length() > 0;
    }

    public final void a(byte[] bArr) {
        this.c = bArr;
    }

    public final boolean e() {
        if (this.c != null) {
            return true;
        }
        return d() && h.class.getResourceAsStream(c()) != null;
    }

    public final byte[] f() {
        if (this.c == null && d()) {
            try {
                InputStream resourceAsStream = h.class.getResourceAsStream(c());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int i = resourceAsStream.read();
                    if (i == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(i);
                }
                resourceAsStream.close();
                this.c = byteArrayOutputStream.toByteArray();
            } catch (Exception e) {
            }
        }
        return this.c;
    }

    public final void a(String str) {
        this.a.d("mimetype", str);
    }

    public final void b(String str) {
        this.a.d("url", str);
    }

    public final String c() {
        return this.a.n("url");
    }
}
