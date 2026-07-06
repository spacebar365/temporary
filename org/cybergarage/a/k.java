package org.cybergarage.a;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Calendar;

/* JADX INFO: compiled from: HTTPSocket.java */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    private Socket a;
    private InputStream b = null;
    private OutputStream c = null;

    public k(Socket socket) {
        this.a = null;
        this.a = socket;
        c();
    }

    public final void finalize() {
        d();
    }

    public final Socket a() {
        return this.a;
    }

    public final InputStream b() {
        return this.b;
    }

    public final boolean d() {
        try {
            if (this.b != null) {
                this.b.close();
            }
            if (this.c != null) {
                this.c.close();
            }
            this.a.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private boolean a(g gVar, byte[] bArr, long j, long j2, boolean z) {
        if (gVar.j().contains("text")) {
            org.cybergarage.e.a.b("[HTTPSocket.java] Send HTTP POST to host: " + this.a.getLocalAddress() + ":" + this.a.getLocalPort() + " content:\n" + new String(bArr));
        } else {
            org.cybergarage.e.a.b("[HTTPSocket.java] Send HTTP POST to host: " + this.a.getLocalAddress() + ":" + this.a.getLocalPort() + " content:\n" + Arrays.toString(bArr));
        }
        gVar.a(Calendar.getInstance());
        OutputStream outputStream = this.c;
        try {
            gVar.a(j2);
            outputStream.write(gVar.s().getBytes());
            outputStream.write("\r\n".getBytes());
            if (z) {
                outputStream.flush();
                return true;
            }
            boolean zP = gVar.p();
            if (zP) {
                outputStream.write(Long.toHexString(j2).getBytes());
                outputStream.write("\r\n".getBytes());
            }
            outputStream.write(bArr, (int) j, (int) j2);
            if (zP) {
                outputStream.write("\r\n".getBytes());
                outputStream.write("0".getBytes());
                outputStream.write("\r\n".getBytes());
            }
            outputStream.flush();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private boolean a(g gVar, InputStream inputStream, long j, long j2, boolean z) {
        org.cybergarage.e.a.b("[HTTPSocket.java] Send HTTP post() host: " + this.a.getLocalAddress() + ":" + this.a.getLocalPort() + " inputStream:\n" + inputStream.toString());
        gVar.a(Calendar.getInstance());
        OutputStream outputStream = this.c;
        try {
            gVar.a(j2);
            outputStream.write(gVar.s().getBytes());
            outputStream.write("\r\n".getBytes());
            if (z) {
                outputStream.flush();
                return true;
            }
            boolean zP = gVar.p();
            if (0 < j) {
                inputStream.skip(j);
            }
            int iA = b.a();
            byte[] bArr = new byte[iA];
            long j3 = 0;
            int i = inputStream.read(bArr, 0, (int) (((long) iA) < j2 ? iA : j2));
            while (i > 0 && j3 < j2) {
                if (zP) {
                    outputStream.write(Long.toHexString(i).getBytes());
                    outputStream.write("\r\n".getBytes());
                }
                outputStream.write(bArr, 0, i);
                if (zP) {
                    outputStream.write("\r\n".getBytes());
                }
                long j4 = ((long) i) + j3;
                i = inputStream.read(bArr, 0, (int) (((long) iA) < j2 - j4 ? iA : j2 - j4));
                j3 = j4;
            }
            if (zP) {
                outputStream.write("0".getBytes());
                outputStream.write("\r\n".getBytes());
            }
            outputStream.flush();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public final boolean a(g gVar, long j, long j2, boolean z) {
        return gVar.i() ? a(gVar, gVar.h(), j, j2, z) : a(gVar, gVar.e(), j, j2, z);
    }

    public final boolean c() {
        Socket socket = this.a;
        try {
            this.b = socket.getInputStream();
            this.c = socket.getOutputStream();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
