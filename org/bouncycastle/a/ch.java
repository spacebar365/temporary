package org.bouncycastle.a;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
final class ch {
    private static final long a = Runtime.getRuntime().maxMemory();

    static int a(int i) {
        int i2 = 1;
        if (i > 127) {
            int i3 = 1;
            while (true) {
                i >>>= 8;
                if (i == 0) {
                    break;
                }
                i3++;
            }
            for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
                i2++;
            }
        }
        return i2;
    }

    static int a(InputStream inputStream) {
        if (inputStream instanceof cf) {
            return ((cf) inputStream).a();
        }
        if (inputStream instanceof l) {
            return ((l) inputStream).a();
        }
        if (inputStream instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream) inputStream).available();
        }
        if (inputStream instanceof FileInputStream) {
            try {
                FileChannel channel = ((FileInputStream) inputStream).getChannel();
                long size = channel != null ? channel.size() : 2147483647L;
                if (size < 2147483647L) {
                    return (int) size;
                }
            } catch (IOException e) {
            }
        }
        if (a > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) a;
    }

    static int b(int i) {
        int i2 = 4;
        if (i < 31) {
            return 1;
        }
        if (i < 128) {
            return 2;
        }
        byte[] bArr = new byte[5];
        bArr[4] = (byte) (i & 127);
        do {
            i >>= 7;
            i2--;
            bArr[i2] = (byte) ((i & 127) | 128);
        } while (i > 127);
        return (5 - i2) + 1;
    }
}
