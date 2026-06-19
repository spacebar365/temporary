package org.p037a.p038a.p039a.p040a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: org.a.a.a.a.o */
/* JADX INFO: compiled from: FTPListParseEngine.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0464o {

    /* JADX INFO: renamed from: a */
    private List<String> f1714a = new LinkedList();

    /* JADX INFO: renamed from: b */
    private ListIterator<String> f1715b = this.f1714a.listIterator();

    /* JADX INFO: renamed from: c */
    private final InterfaceC0457h f1716c;

    /* JADX INFO: renamed from: d */
    private final boolean f1717d;

    C0464o(InterfaceC0457h interfaceC0457h, C0453d c0453d) {
        this.f1716c = interfaceC0457h;
        if (c0453d != null) {
            this.f1717d = c0453d.m1242h();
        } else {
            this.f1717d = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1260a(InputStream inputStream, String str) throws IOException {
        this.f1714a = new LinkedList();
        m1259b(inputStream, str);
        this.f1716c.mo1192a(this.f1714a);
        this.f1715b = this.f1714a.listIterator();
    }

    /* JADX INFO: renamed from: b */
    private void m1259b(InputStream inputStream, String str) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str == null ? Charset.defaultCharset() : Charset.forName(str)));
        String strMo1198a = this.f1716c.mo1198a(bufferedReader);
        while (strMo1198a != null) {
            this.f1714a.add(strMo1198a);
            strMo1198a = this.f1716c.mo1198a(bufferedReader);
        }
        bufferedReader.close();
    }

    /* JADX INFO: renamed from: a */
    public final C0456g[] m1261a(InterfaceC0459j interfaceC0459j) {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f1714a) {
            C0456g c0456gMo1179a = this.f1716c.mo1179a(str);
            C0456g c0456g = (c0456gMo1179a == null && this.f1717d) ? new C0456g(str) : c0456gMo1179a;
            if (interfaceC0459j.mo1258a(c0456g)) {
                arrayList.add(c0456g);
            }
        }
        return (C0456g[]) arrayList.toArray(new C0456g[arrayList.size()]);
    }
}
