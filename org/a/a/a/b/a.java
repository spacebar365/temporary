package org.a.a.a.b;

import java.io.BufferedReader;
import java.io.Reader;

/* JADX INFO: compiled from: CRLFLineReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends BufferedReader {
    public a(Reader reader) {
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
