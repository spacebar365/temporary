package org.a.a.a.b;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/* JADX INFO: compiled from: SocketInputStream.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends FilterInputStream {
    private final Socket a;

    public c(Socket socket, InputStream inputStream) {
        super(inputStream);
        this.a = socket;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.a.close();
    }
}
