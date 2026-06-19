package org.p037a.p038a.p039a.p042b;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/* JADX INFO: renamed from: org.a.a.a.b.c */
/* JADX INFO: compiled from: SocketInputStream.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0469c extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    private final Socket f1726a;

    public C0469c(Socket socket, InputStream inputStream) {
        super(inputStream);
        this.f1726a = socket;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f1726a.close();
    }
}
