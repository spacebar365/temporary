package org.a.a.a.a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: FTPListParseEngine.java */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    private List<String> a = new LinkedList();
    private ListIterator<String> b = this.a.listIterator();
    private final h c;
    private final boolean d;

    o(h hVar, d dVar) {
        this.c = hVar;
        if (dVar != null) {
            this.d = dVar.h();
        } else {
            this.d = false;
        }
    }

    public final void a(InputStream inputStream, String str) throws IOException {
        this.a = new LinkedList();
        b(inputStream, str);
        this.c.a(this.a);
        this.b = this.a.listIterator();
    }

    private void b(InputStream inputStream, String str) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str == null ? Charset.defaultCharset() : Charset.forName(str)));
        String strA = this.c.a(bufferedReader);
        while (strA != null) {
            this.a.add(strA);
            strA = this.c.a(bufferedReader);
        }
        bufferedReader.close();
    }

    public final g[] a(j jVar) {
        ArrayList arrayList = new ArrayList();
        for (String str : this.a) {
            g gVarA = this.c.a(str);
            g gVar = (gVarA == null && this.d) ? new g(str) : gVarA;
            if (jVar.a(gVar)) {
                arrayList.add(gVar);
            }
        }
        return (g[]) arrayList.toArray(new g[arrayList.size()]);
    }
}
