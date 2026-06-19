package org.p037a.p038a.p039a.p042b;

import java.io.BufferedReader;
import java.io.Reader;

/* JADX INFO: renamed from: org.a.a.a.b.a */
/* JADX INFO: compiled from: CRLFLineReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0467a extends BufferedReader {
    public C0467a(Reader reader) {
        super(reader);
    }

    @Override // java.io.BufferedReader
    public final String readLine() {
        StringBuilder sb = new StringBuilder();
        synchronized (this.lock) {
            boolean z = false;
            while (true) {
                int i = read();
                if (i != -1) {
                    if (z && i == 10) {
                        return sb.substring(0, sb.length() - 1);
                    }
                    z = i == 13;
                    sb.append((char) i);
                } else {
                    String string = sb.toString();
                    if (string.length() == 0) {
                        return null;
                    }
                    return string;
                }
            }
        }
    }
}
