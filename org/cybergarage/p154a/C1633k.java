package org.cybergarage.p154a;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Calendar;
import org.cybergarage.p173e.C1744a;

/* JADX INFO: renamed from: org.cybergarage.a.k */
/* JADX INFO: compiled from: HTTPSocket.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1633k {

    /* JADX INFO: renamed from: a */
    private Socket f6352a;

    /* JADX INFO: renamed from: b */
    private InputStream f6353b = null;

    /* JADX INFO: renamed from: c */
    private OutputStream f6354c = null;

    public C1633k(Socket socket) {
        this.f6352a = null;
        this.f6352a = socket;
        m4694c();
    }

    public final void finalize() {
        m4695d();
    }

    /* JADX INFO: renamed from: a */
    public final Socket m4691a() {
        return this.f6352a;
    }

    /* JADX INFO: renamed from: b */
    public final InputStream m4693b() {
        return this.f6353b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4695d() {
        try {
            if (this.f6353b != null) {
                this.f6353b.close();
            }
            if (this.f6354c != null) {
                this.f6354c.close();
            }
            this.f6352a.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m4690a(C1629g c1629g, byte[] bArr, long j, long j2, boolean z) {
        if (c1629g.m4629j().contains("text")) {
            C1744a.m5120b("[HTTPSocket.java] Send HTTP POST to host: " + this.f6352a.getLocalAddress() + ":" + this.f6352a.getLocalPort() + " content:\n" + new String(bArr));
        } else {
            C1744a.m5120b("[HTTPSocket.java] Send HTTP POST to host: " + this.f6352a.getLocalAddress() + ":" + this.f6352a.getLocalPort() + " content:\n" + Arrays.toString(bArr));
        }
        c1629g.m4607a(Calendar.getInstance());
        OutputStream outputStream = this.f6354c;
        try {
            c1629g.m4603a(j2);
            outputStream.write(c1629g.mo4674s().getBytes());
            outputStream.write("\r\n".getBytes());
            if (z) {
                outputStream.flush();
                return true;
            }
            boolean zP = c1629g.m4636p();
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

    /* JADX INFO: renamed from: a */
    private boolean m4689a(C1629g c1629g, InputStream inputStream, long j, long j2, boolean z) {
        C1744a.m5120b("[HTTPSocket.java] Send HTTP post() host: " + this.f6352a.getLocalAddress() + ":" + this.f6352a.getLocalPort() + " inputStream:\n" + inputStream.toString());
        c1629g.m4607a(Calendar.getInstance());
        OutputStream outputStream = this.f6354c;
        try {
            c1629g.m4603a(j2);
            outputStream.write(c1629g.mo4674s().getBytes());
            outputStream.write("\r\n".getBytes());
            if (z) {
                outputStream.flush();
                return true;
            }
            boolean zP = c1629g.m4636p();
            if (0 < j) {
                inputStream.skip(j);
            }
            int iM4577a = C1624b.m4577a();
            byte[] bArr = new byte[iM4577a];
            long j3 = 0;
            int i = inputStream.read(bArr, 0, (int) (((long) iM4577a) < j2 ? iM4577a : j2));
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
                i = inputStream.read(bArr, 0, (int) (((long) iM4577a) < j2 - j4 ? iM4577a : j2 - j4));
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

    /* JADX INFO: renamed from: a */
    public final boolean m4692a(C1629g c1629g, long j, long j2, boolean z) {
        return c1629g.m4628i() ? m4689a(c1629g, c1629g.m4625h(), j, j2, z) : m4690a(c1629g, c1629g.m4620e(), j, j2, z);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4694c() {
        Socket socket = this.f6352a;
        try {
            this.f6353b = socket.getInputStream();
            this.f6354c = socket.getOutputStream();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
