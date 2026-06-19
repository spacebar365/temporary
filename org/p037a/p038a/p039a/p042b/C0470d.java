package org.p037a.p038a.p039a.p042b;

import java.io.IOException;
import java.net.Socket;

/* JADX INFO: renamed from: org.a.a.a.b.d */
/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0470d {
    /* JADX INFO: renamed from: a */
    public static void m1266a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
            }
        }
    }
}
