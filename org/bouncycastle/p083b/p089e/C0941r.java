package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.e.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0941r implements InterfaceC0890e {

    /* JADX INFO: renamed from: h */
    private static final byte[] f3910h = {-88, 67, 95, 6, 107, 117, 108, 89, 113, -33, -121, -107, 23, -16, -40, 9, 109, -13, 29, -53, -55, 77, 44, -81, 121, -32, -105, -3, 111, 75, 69, 57, 62, -35, -93, 79, -76, -74, -102, 14, 31, -65, 21, -31, 73, -46, -109, -58, -110, 114, -98, 97, -47, 99, -6, -18, -12, 25, -43, -83, 88, -92, -69, -95, -36, -14, -125, 55, 66, -28, 122, 50, -100, -52, -85, 74, -113, 110, 4, 39, 46, -25, -30, 90, -106, 22, 35, 43, -62, 101, 102, 15, -68, -87, 71, 65, 52, 72, -4, -73, 106, -120, -91, 83, -122, -7, 91, -37, 56, 123, -61, 30, 34, 51, 36, 40, 54, -57, -78, 59, -114, 119, -70, -11, 20, -97, 8, 85, -101, 76, -2, 96, 92, -38, 24, 70, -51, 125, 33, -80, 63, 27, -119, -1, -21, -124, 105, 58, -99, -41, -45, 112, 103, 64, -75, -34, 93, 48, -111, -79, 120, 17, 1, -27, 0, 104, -104, -96, -59, 2, -90, 116, 45, 11, -94, 118, -77, -66, -50, -67, -82, -23, -118, 49, 28, -20, -15, -103, -108, -86, -10, 38, 47, -17, -24, -116, 53, 3, -44, 127, -5, 5, -63, 94, -112, 32, 61, -126, -9, -22, 10, 13, 126, -8, 80, 26, -60, 7, 87, -72, 60, 98, -29, -56, -84, 82, 100, 16, -48, -39, 19, 12, 18, 41, 81, -71, -49, -42, 115, -115, -127, 84, -64, -19, 78, 68, -89, 42, -123, 37, -26, -54, 124, -117, 86, -128};

    /* JADX INFO: renamed from: i */
    private static final byte[] f3911i = {-50, -69, -21, -110, -22, -53, 19, -63, -23, 58, -42, -78, -46, -112, 23, -8, 66, 21, 86, -76, 101, 28, -120, 67, -59, 92, 54, -70, -11, 87, 103, -115, 49, -10, 100, 88, -98, -12, 34, -86, 117, 15, 2, -79, -33, 109, 115, 77, 124, 38, 46, -9, 8, 93, 68, 62, -97, 20, -56, -82, 84, 16, -40, -68, 26, 107, 105, -13, -67, 51, -85, -6, -47, -101, 104, 78, 22, -107, -111, -18, 76, 99, -114, 91, -52, 60, 25, -95, -127, 73, 123, -39, 111, 55, 96, -54, -25, 43, 72, -3, -106, 69, -4, 65, 18, 13, 121, -27, -119, -116, -29, 32, 48, -36, -73, 108, 74, -75, 63, -105, -44, 98, 45, 6, -92, -91, -125, 95, 42, -38, -55, 0, 126, -94, 85, -65, 17, -43, -100, -49, 14, 10, 61, 81, 125, -109, 27, -2, -60, 71, 9, -122, 11, -113, -99, 106, 7, -71, -80, -104, 24, 50, 113, 75, -17, 59, 112, -96, -28, 64, -1, -61, -87, -26, 120, -7, -117, 70, -128, 30, 56, -31, -72, -88, -32, 12, 35, 118, 29, 37, 36, 5, -15, 110, -108, 40, -102, -124, -24, -93, 79, 119, -45, -123, -30, 82, -14, -126, 80, 122, 47, 116, 83, -77, 97, -81, 57, 53, -34, -51, 31, -103, -84, -83, 114, 44, -35, -48, -121, -66, 94, -90, -20, 4, -58, 3, 52, -5, -37, 89, -74, -62, 1, -16, 90, -19, -89, 102, 33, 127, -118, 39, -57, -64, 41, -41};

    /* JADX INFO: renamed from: j */
    private static final byte[] f3912j = {-109, -39, -102, -75, -104, 34, 69, -4, -70, 106, -33, 2, -97, -36, 81, 89, 74, 23, 43, -62, -108, -12, -69, -93, 98, -28, 113, -44, -51, 112, 22, -31, 73, 60, -64, -40, 92, -101, -83, -123, 83, -95, 122, -56, 45, -32, -47, 114, -90, 44, -60, -29, 118, 120, -73, -76, 9, 59, 14, 65, 76, -34, -78, -112, 37, -91, -41, 3, 17, 0, -61, 46, -110, -17, 78, 18, -99, 125, -53, 53, 16, -43, 79, -98, 77, -87, 85, -58, -48, 123, 24, -105, -45, 54, -26, 72, 86, -127, -113, 119, -52, -100, -71, -30, -84, -72, 47, 21, -92, 124, -38, 56, 30, 11, 5, -42, 20, 110, 108, 126, 102, -3, -79, -27, 96, -81, 94, 51, -121, -55, -16, 93, 109, 63, -120, -115, -57, -9, 29, -23, -20, -19, -128, 41, 39, -49, -103, -88, 80, 15, 55, 36, 40, 48, -107, -46, 62, 91, 64, -125, -77, 105, 87, 31, 7, 28, -118, -68, 32, -21, -50, -114, -85, -18, 49, -94, 115, -7, -54, 58, 26, -5, 13, -63, -2, -6, -14, 111, -67, -106, -35, 67, 82, -74, 8, -13, -82, -66, 25, -119, 50, 38, -80, -22, 75, 100, -124, -126, 107, -11, 121, -65, 1, 95, 117, 99, 27, 35, 61, 104, 42, 101, -24, -111, -10, -1, 19, 88, -15, 71, 10, 127, -59, -89, -25, 97, 90, 6, 70, 68, 66, 4, -96, -37, 57, -122, 84, -86, -116, 52, 33, -117, -8, 12, 116, 103};

    /* JADX INFO: renamed from: k */
    private static final byte[] f3913k = {104, -115, -54, 77, 115, 75, 78, 42, -44, 82, 38, -77, 84, 30, 25, 31, 34, 3, 70, 61, 45, 74, 83, -125, 19, -118, -73, -43, 37, 121, -11, -67, 88, 47, 13, 2, -19, 81, -98, 17, -14, 62, 85, 94, -47, 22, 60, 102, 112, 93, -13, 69, 64, -52, -24, -108, 86, 8, -50, 26, 58, -46, -31, -33, -75, 56, 110, 14, -27, -12, -7, -122, -23, 79, -42, -123, 35, -49, 50, -103, 49, 20, -82, -18, -56, 72, -45, 48, -95, -110, 65, -79, 24, -60, 44, 113, 114, 68, 21, -3, 55, -66, 95, -86, -101, -120, -40, -85, -119, -100, -6, 96, -22, -68, 98, 12, 36, -90, -88, -20, 103, 32, -37, 124, 40, -35, -84, 91, 52, 126, 16, -15, 123, -113, 99, -96, 5, -102, 67, 119, 33, -65, 39, 9, -61, -97, -74, -41, 41, -62, -21, -64, -92, -117, -116, 29, -5, -1, -63, -78, -105, 46, -8, 101, -10, 117, 7, 4, 73, 51, -28, -39, -71, -48, 66, -57, 108, -112, 0, -114, 111, 80, 1, -59, -38, 71, 63, -51, 105, -94, -30, 122, -89, -58, -109, 15, 10, 6, -26, 43, -106, -93, 28, -81, 106, 18, -124, 57, -25, -80, -126, -9, -2, -99, -121, 92, -127, 53, -34, -76, -91, -4, -128, -17, -53, -69, 107, 118, -70, 90, 125, 120, 11, -107, -29, -83, 116, -104, 59, 54, 100, 109, -36, -16, 89, -87, 76, 23, 127, -111, -72, -55, 87, 27, -32, 97};

    /* JADX INFO: renamed from: l */
    private static final byte[] f3914l = {-92, -94, -87, -59, 78, -55, 3, -39, 126, 15, -46, -83, -25, -45, 39, 91, -29, -95, -24, -26, 124, 42, 85, 12, -122, 57, -41, -115, -72, 18, 111, 40, -51, -118, 112, 86, 114, -7, -65, 79, 115, -23, -9, 87, 22, -84, 80, -64, -99, -73, 71, 113, 96, -60, 116, 67, 108, 31, -109, 119, -36, -50, 32, -116, -103, 95, 68, 1, -11, 30, -121, 94, 97, 44, 75, 29, -127, 21, -12, 35, -42, -22, -31, 103, -15, 127, -2, -38, 60, 7, 83, 106, -124, -100, -53, 2, -125, 51, -35, 53, -30, 89, 90, -104, -91, -110, 100, 4, 6, 16, 77, 28, -105, 8, 49, -18, -85, 5, -81, 121, -96, 24, 70, 109, -4, -119, -44, -57, -1, -16, -49, 66, -111, -8, 104, 10, 101, -114, -74, -3, -61, -17, 120, 76, -52, -98, 48, 46, -68, 11, 84, 26, -90, -69, 38, -128, 72, -108, 50, 125, -89, 63, -82, 34, 61, 102, -86, -10, 0, 93, -67, 74, -32, 59, -76, 23, -117, -97, 118, -80, 36, -102, 37, 99, -37, -21, 122, 62, 92, -77, -79, 41, -14, -54, 88, 110, -40, -88, 47, 117, -33, 20, -5, 19, 73, -120, -78, -20, -28, 52, 45, -106, -58, 58, -19, -107, 14, -27, -123, 107, 64, 33, -101, 9, 25, 43, 82, -34, 69, -93, -6, 81, -62, -75, -47, -112, -71, -13, 55, -63, 13, -70, 65, 17, 56, 123, -66, -48, -43, 105, 54, -56, 98, 27, -126, -113};

    /* JADX INFO: renamed from: m */
    private static final byte[] f3915m = {-125, -14, 42, -21, -23, -65, 123, -100, 52, -106, -115, -104, -71, 105, -116, 41, 61, -120, 104, 6, 57, 17, 76, 14, -96, 86, 64, -110, 21, -68, -77, -36, 111, -8, 38, -70, -66, -67, 49, -5, -61, -2, -128, 97, -31, 122, 50, -46, 112, 32, -95, 69, -20, -39, 26, 93, -76, -40, 9, -91, 85, -114, 55, 118, -87, 103, 16, 23, 54, 101, -79, -107, 98, 89, 116, -93, 80, 47, 75, -56, -48, -113, -51, -44, 60, -122, 18, 29, 35, -17, -12, 83, 25, 53, -26, 127, 94, -42, 121, 81, 34, 20, -9, 30, 74, 66, -101, 65, 115, 45, -63, 92, -90, -94, -32, 46, -45, 40, -69, -55, -82, 106, -47, 90, 48, -112, -124, -7, -78, 88, -49, 126, -59, -53, -105, -28, 22, 108, -6, -80, 109, 31, 82, -103, 13, 78, 3, -111, -62, 77, 100, 119, -97, -35, -60, 73, -118, -102, 36, 56, -89, 87, -123, -57, 124, 125, -25, -10, -73, -84, 39, 70, -34, -33, 59, -41, -98, 43, 11, -43, 19, 117, -16, 114, -74, -99, 27, 1, 63, 68, -27, -121, -3, 7, -15, -85, -108, 24, -22, -4, 58, -126, 95, 5, 84, -37, 0, -117, -29, 72, 12, -54, 120, -119, 10, -1, 62, 91, -127, -18, 113, -30, -38, 44, -72, -75, -52, 110, -88, 107, -83, 96, -58, 8, 4, 2, -24, -11, 79, -92, -13, -64, -50, 67, 37, 28, 33, 51, 15, -81, 71, -19, 102, 99, -109, -86};

    /* JADX INFO: renamed from: n */
    private static final byte[] f3916n = {69, -44, 11, 67, -15, 114, -19, -92, -62, 56, -26, 113, -3, -74, 58, -107, 80, 68, 75, -30, 116, 107, 30, 17, 90, -58, -76, -40, -91, -118, 112, -93, -88, -6, 5, -39, -105, 64, -55, -112, -104, -113, -36, 18, 49, 44, 71, 106, -103, -82, -56, 127, -7, 79, 93, -106, 111, -12, -77, 57, 33, -38, -100, -123, -98, 59, -16, -65, -17, 6, -18, -27, 95, 32, 16, -52, 60, 84, 74, 82, -108, 14, -64, 40, -10, 86, 96, -94, -29, 15, -20, -99, 36, -125, 126, -43, 124, -21, 24, -41, -51, -35, 120, -1, -37, -95, 9, -48, 118, -124, 117, -69, 29, 26, 47, -80, -2, -42, 52, 99, 53, -46, 42, 89, 109, 77, 119, -25, -114, 97, -49, -97, -50, 39, -11, -128, -122, -57, -90, -5, -8, -121, -85, 98, 63, -33, 72, 0, 20, -102, -67, 91, 4, -110, 2, 37, 101, 76, 83, 12, -14, 41, -81, 23, 108, 65, 48, -23, -109, 85, -9, -84, 104, 38, -60, 125, -54, 122, 62, -96, 55, 3, -63, 54, 105, 102, 8, 22, -89, -68, -59, -45, 34, -73, 19, 70, 50, -24, 87, -120, 43, -127, -78, 78, 100, 28, -86, -111, 88, 46, -101, 92, 27, 81, 115, 66, 35, 1, 110, -13, 13, -66, 61, 10, 45, 31, 103, 51, 25, 123, 94, -22, -34, -117, -53, -87, -116, -115, -83, 73, -126, -28, -70, -61, 21, -47, -32, -119, -4, -79, -71, -75, 7, 121, -72, -31};

    /* JADX INFO: renamed from: o */
    private static final byte[] f3917o = {-78, -74, 35, 17, -89, -120, -59, -90, 57, -113, -60, -24, 115, 34, 67, -61, -126, 39, -51, 24, 81, 98, 45, -9, 92, 14, 59, -3, -54, -101, 13, 15, 121, -116, 16, 76, 116, 28, 10, -114, 124, -108, 7, -57, 94, 20, -95, 33, 87, 80, 78, -87, -128, -39, -17, 100, 65, -49, 60, -18, 46, 19, 41, -70, 52, 90, -82, -118, 97, 51, 18, -71, 85, -88, 21, 5, -10, 3, 6, 73, -75, 37, 9, 22, 12, 42, 56, -4, 32, -12, -27, 127, -41, 49, 43, 102, 111, -1, 114, -122, -16, -93, 47, 120, 0, -68, -52, -30, -80, -15, 66, -76, 48, 95, 96, 4, -20, -91, -29, -117, -25, 29, -65, -124, 123, -26, -127, -8, -34, -40, -46, 23, -50, 75, 71, -42, 105, 108, 25, -103, -102, 1, -77, -123, -79, -7, 89, -62, 55, -23, -56, -96, -19, 79, -119, 104, 109, -43, 38, -111, -121, 88, -67, -55, -104, -36, 117, -64, 118, -11, 103, 107, 126, -21, 82, -53, -47, 91, -97, 11, -37, 64, -110, 26, -6, -84, -28, -31, 113, 31, 101, -115, -105, -98, -107, -112, 93, -73, -63, -81, 84, -5, 2, -32, 53, -69, 58, 77, -83, 44, 61, 86, 8, 27, 74, -109, 106, -85, -72, 122, -14, 125, -38, 63, -2, 62, -66, -22, -86, 68, -58, -48, 54, 72, 112, -106, 119, 36, 83, -33, -13, -125, 40, 50, 69, 30, -92, -45, -94, 70, 110, -100, -35, 99, -44, -99};

    /* JADX INFO: renamed from: a */
    private long[] f3918a;

    /* JADX INFO: renamed from: b */
    private long[] f3919b;

    /* JADX INFO: renamed from: c */
    private long[][] f3920c;

    /* JADX INFO: renamed from: d */
    private int f3921d;

    /* JADX INFO: renamed from: e */
    private int f3922e;

    /* JADX INFO: renamed from: f */
    private int f3923f;

    /* JADX INFO: renamed from: g */
    private boolean f3924g;

    public C0941r(int i) {
        if (i != 128 && i != 256 && i != 512) {
            throw new IllegalArgumentException("unsupported block length: only 128/256/512 are allowed");
        }
        this.f3921d = i >>> 6;
        this.f3918a = new long[this.f3921d];
    }

    /* JADX INFO: renamed from: a */
    private static long m2352a(int i, long j) {
        return (j >>> i) | (j << (-i));
    }

    /* JADX INFO: renamed from: a */
    private static long m2353a(long j) {
        long jM2360c = m2360c(j);
        long jM2352a = m2352a(8, j) ^ j;
        long jM2352a2 = (jM2352a ^ m2352a(16, jM2352a)) ^ m2352a(48, j);
        return m2352a(48, jM2360c) ^ ((jM2352a2 ^ m2352a(32, m2363d((jM2352a2 ^ j) ^ jM2360c))) ^ m2352a(40, jM2360c));
    }

    /* JADX INFO: renamed from: a */
    private void m2354a(int i) {
        long[] jArr = this.f3920c[i];
        for (int i2 = 0; i2 < this.f3921d; i2++) {
            long[] jArr2 = this.f3918a;
            jArr2[i2] = jArr2[i2] + jArr[i2];
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2355a(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[this.f3921d];
        long[] jArr4 = new long[this.f3921d];
        this.f3918a = new long[this.f3921d];
        long[] jArr5 = this.f3918a;
        jArr5[0] = jArr5[0] + ((long) (this.f3921d + this.f3922e + 1));
        if (this.f3921d == this.f3922e) {
            System.arraycopy(jArr, 0, jArr3, 0, jArr3.length);
            System.arraycopy(jArr, 0, jArr4, 0, jArr4.length);
        } else {
            System.arraycopy(jArr, 0, jArr3, 0, this.f3921d);
            System.arraycopy(jArr, this.f3921d, jArr4, 0, this.f3921d);
        }
        for (int i = 0; i < this.f3918a.length; i++) {
            long[] jArr6 = this.f3918a;
            jArr6[i] = jArr6[i] + jArr3[i];
        }
        m2365e();
        m2367g();
        m2368h();
        for (int i2 = 0; i2 < this.f3918a.length; i2++) {
            long[] jArr7 = this.f3918a;
            jArr7[i2] = jArr7[i2] ^ jArr4[i2];
        }
        m2365e();
        m2367g();
        m2368h();
        for (int i3 = 0; i3 < this.f3918a.length; i3++) {
            long[] jArr8 = this.f3918a;
            jArr8[i3] = jArr8[i3] + jArr3[i3];
        }
        m2365e();
        m2367g();
        m2368h();
        System.arraycopy(this.f3918a, 0, jArr2, 0, this.f3921d);
    }

    /* JADX INFO: renamed from: b */
    private static long m2356b(long j) {
        long jM2352a = m2352a(8, j) ^ j;
        long jM2352a2 = (jM2352a ^ m2352a(32, jM2352a)) ^ m2352a(48, j);
        long j2 = jM2352a2 ^ j;
        long jM2352a3 = m2352a(48, j);
        long jM2352a4 = m2352a(56, j);
        long jM2360c = m2360c(j2 ^ jM2352a4) ^ m2352a(56, j2);
        long jM2360c2 = m2360c(m2352a(40, m2360c(jM2360c) ^ j) ^ (m2352a(16, j2) ^ j)) ^ (j2 ^ jM2352a3);
        return jM2352a2 ^ m2360c(m2352a(40, ((m2352a(32, j2) ^ j) ^ jM2352a4) ^ m2360c(((jM2352a3 ^ (m2352a(24, j) ^ j2)) ^ jM2352a4) ^ m2360c(m2360c(jM2360c2) ^ m2352a(16, jM2352a2)))));
    }

    /* JADX INFO: renamed from: b */
    private void m2357b(int i) {
        long[] jArr = this.f3920c[i];
        for (int i2 = 0; i2 < this.f3921d; i2++) {
            long[] jArr2 = this.f3918a;
            jArr2[i2] = jArr2[i2] - jArr[i2];
        }
    }

    /* JADX INFO: renamed from: b */
    private void m2358b(byte[] bArr, int i, byte[] bArr2, int i2) {
        long jM4153d = AbstractC1556g.m4153d(bArr, i);
        long jM4153d2 = AbstractC1556g.m4153d(bArr, i + 8);
        long[] jArr = this.f3920c[this.f3923f];
        long j = jM4153d - jArr[0];
        long j2 = jM4153d2 - jArr[1];
        int i3 = this.f3923f;
        while (true) {
            long jM2356b = m2356b(j);
            long jM2356b2 = m2356b(j2);
            int i4 = (int) jM2356b;
            int i5 = (int) (jM2356b >>> 32);
            int i6 = (int) jM2356b2;
            int i7 = (int) (jM2356b2 >>> 32);
            int i8 = (f3914l[i4 & 255] & 255) | ((f3915m[(i4 >>> 8) & 255] & 255) << 8) | ((f3916n[(i4 >>> 16) & 255] & 255) << 16) | (f3917o[i4 >>> 24] << 24);
            long j3 = (((long) ((f3917o[i7 >>> 24] << 24) | (((f3914l[i7 & 255] & 255) | ((f3915m[(i7 >>> 8) & 255] & 255) << 8)) | ((f3916n[(i7 >>> 16) & 255] & 255) << 16)))) << 32) | (((long) i8) & 4294967295L);
            long j4 = (((long) ((f3917o[i6 >>> 24] << 24) | (f3914l[i6 & 255] & 255) | ((f3915m[(i6 >>> 8) & 255] & 255) << 8) | ((f3916n[(i6 >>> 16) & 255] & 255) << 16))) & 4294967295L) | (((long) ((f3917o[i5 >>> 24] << 24) | (((f3914l[i5 & 255] & 255) | ((f3915m[(i5 >>> 8) & 255] & 255) << 8)) | ((f3916n[(i5 >>> 16) & 255] & 255) << 16)))) << 32);
            i3--;
            if (i3 == 0) {
                long[] jArr2 = this.f3920c[0];
                long j5 = j3 - jArr2[0];
                long j6 = j4 - jArr2[1];
                AbstractC1556g.m4148b(j5, bArr2, i2);
                AbstractC1556g.m4148b(j6, bArr2, i2 + 8);
                return;
            }
            long[] jArr3 = this.f3920c[i3];
            j = jArr3[0] ^ j3;
            j2 = jArr3[1] ^ j4;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m2359b(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[this.f3922e];
        long[] jArr4 = new long[this.f3921d];
        System.arraycopy(jArr, 0, jArr3, 0, this.f3922e);
        long j = 281479271743489L;
        int i = 0;
        while (true) {
            for (int i2 = 0; i2 < this.f3921d; i2++) {
                jArr4[i2] = jArr2[i2] + j;
            }
            for (int i3 = 0; i3 < this.f3921d; i3++) {
                this.f3918a[i3] = jArr3[i3] + jArr4[i3];
            }
            m2365e();
            m2367g();
            m2368h();
            for (int i4 = 0; i4 < this.f3921d; i4++) {
                long[] jArr5 = this.f3918a;
                jArr5[i4] = jArr5[i4] ^ jArr4[i4];
            }
            m2365e();
            m2367g();
            m2368h();
            for (int i5 = 0; i5 < this.f3921d; i5++) {
                long[] jArr6 = this.f3918a;
                jArr6[i5] = jArr6[i5] + jArr4[i5];
            }
            System.arraycopy(this.f3918a, 0, this.f3920c[i], 0, this.f3921d);
            if (this.f3923f == i) {
                return;
            }
            if (this.f3921d != this.f3922e) {
                i += 2;
                long j2 = j << 1;
                for (int i6 = 0; i6 < this.f3921d; i6++) {
                    jArr4[i6] = jArr2[i6] + j2;
                }
                for (int i7 = 0; i7 < this.f3921d; i7++) {
                    this.f3918a[i7] = jArr3[this.f3921d + i7] + jArr4[i7];
                }
                m2365e();
                m2367g();
                m2368h();
                for (int i8 = 0; i8 < this.f3921d; i8++) {
                    long[] jArr7 = this.f3918a;
                    jArr7[i8] = jArr7[i8] ^ jArr4[i8];
                }
                m2365e();
                m2367g();
                m2368h();
                for (int i9 = 0; i9 < this.f3921d; i9++) {
                    long[] jArr8 = this.f3918a;
                    jArr8[i9] = jArr8[i9] + jArr4[i9];
                }
                System.arraycopy(this.f3918a, 0, this.f3920c[i], 0, this.f3921d);
                if (this.f3923f == i) {
                    return;
                } else {
                    j = j2;
                }
            }
            i += 2;
            long j3 = j << 1;
            long j4 = jArr3[0];
            for (int i10 = 1; i10 < jArr3.length; i10++) {
                jArr3[i10 - 1] = jArr3[i10];
            }
            jArr3[jArr3.length - 1] = j4;
            j = j3;
        }
    }

    /* JADX INFO: renamed from: c */
    private static long m2360c(long j) {
        return ((9187201950435737471L & j) << 1) ^ ((((-9187201950435737472L) & j) >>> 7) * 29);
    }

    /* JADX INFO: renamed from: c */
    private void m2361c(int i) {
        long[] jArr = this.f3920c[i];
        for (int i2 = 0; i2 < this.f3921d; i2++) {
            long[] jArr2 = this.f3918a;
            jArr2[i2] = jArr2[i2] ^ jArr[i2];
        }
    }

    /* JADX INFO: renamed from: c */
    private void m2362c(byte[] bArr, int i, byte[] bArr2, int i2) {
        long jM4153d = AbstractC1556g.m4153d(bArr, i);
        long jM4153d2 = AbstractC1556g.m4153d(bArr, i + 8);
        long[] jArr = this.f3920c[0];
        long j = jArr[0] + jM4153d;
        long j2 = jArr[1] + jM4153d2;
        int i3 = 0;
        while (true) {
            int i4 = (int) j;
            int i5 = (int) (j >>> 32);
            int i6 = (int) j2;
            int i7 = (int) (j2 >>> 32);
            int i8 = (f3910h[i4 & 255] & 255) | ((f3911i[(i4 >>> 8) & 255] & 255) << 8) | ((f3912j[(i4 >>> 16) & 255] & 255) << 16) | (f3913k[i4 >>> 24] << 24);
            byte b = f3910h[i7 & 255];
            byte b2 = f3911i[(i7 >>> 8) & 255];
            byte b3 = f3912j[(i7 >>> 16) & 255];
            long j3 = (((long) ((f3913k[i7 >>> 24] << 24) | (((b & 255) | ((b2 & 255) << 8)) | ((b3 & 255) << 16)))) << 32) | (((long) i8) & 4294967295L);
            byte b4 = f3910h[i6 & 255];
            byte b5 = f3911i[(i6 >>> 8) & 255];
            byte b6 = f3912j[(i6 >>> 16) & 255];
            int i9 = (f3913k[i6 >>> 24] << 24) | (b4 & 255) | ((b5 & 255) << 8) | ((b6 & 255) << 16);
            byte b7 = f3910h[i5 & 255];
            byte b8 = f3911i[(i5 >>> 8) & 255];
            byte b9 = f3912j[(i5 >>> 16) & 255];
            long j4 = ((long) ((f3913k[i5 >>> 24] << 24) | (((b7 & 255) | ((b8 & 255) << 8)) | ((b9 & 255) << 16)))) << 32;
            long jM2353a = m2353a(j3);
            long jM2353a2 = m2353a(j4 | (((long) i9) & 4294967295L));
            i3++;
            if (i3 == this.f3923f) {
                long[] jArr2 = this.f3920c[this.f3923f];
                long j5 = jM2353a + jArr2[0];
                long j6 = jArr2[1] + jM2353a2;
                AbstractC1556g.m4148b(j5, bArr2, i2);
                AbstractC1556g.m4148b(j6, bArr2, i2 + 8);
                return;
            }
            long[] jArr3 = this.f3920c[i3];
            j = jArr3[0] ^ jM2353a;
            j2 = jArr3[1] ^ jM2353a2;
        }
    }

    /* JADX INFO: renamed from: d */
    private static long m2363d(long j) {
        return (((4557430888798830399L & j) << 2) ^ ((((-9187201950435737472L) & j) >>> 6) * 29)) ^ (((4629771061636907072L & j) >>> 6) * 29);
    }

    /* JADX INFO: renamed from: e */
    private void m2365e() {
        for (int i = 0; i < this.f3921d; i++) {
            long j = this.f3918a[i];
            int i2 = (int) j;
            int i3 = (int) (j >>> 32);
            byte b = f3910h[i2 & 255];
            byte b2 = f3911i[(i2 >>> 8) & 255];
            byte b3 = f3912j[(i2 >>> 16) & 255];
            int i4 = (f3913k[i2 >>> 24] << 24) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16);
            byte b4 = f3910h[i3 & 255];
            byte b5 = f3911i[(i3 >>> 8) & 255];
            byte b6 = f3912j[(i3 >>> 16) & 255];
            this.f3918a[i] = (((long) i4) & 4294967295L) | (((long) ((f3913k[i3 >>> 24] << 24) | (((b4 & 255) | ((b5 & 255) << 8)) | ((b6 & 255) << 16)))) << 32);
        }
    }

    /* JADX INFO: renamed from: f */
    private void m2366f() {
        for (int i = 0; i < this.f3921d; i++) {
            long j = this.f3918a[i];
            int i2 = (int) j;
            int i3 = (int) (j >>> 32);
            byte b = f3914l[i2 & 255];
            byte b2 = f3915m[(i2 >>> 8) & 255];
            byte b3 = f3916n[(i2 >>> 16) & 255];
            int i4 = (f3917o[i2 >>> 24] << 24) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16);
            byte b4 = f3914l[i3 & 255];
            byte b5 = f3915m[(i3 >>> 8) & 255];
            byte b6 = f3916n[(i3 >>> 16) & 255];
            this.f3918a[i] = (((long) i4) & 4294967295L) | (((long) ((f3917o[i3 >>> 24] << 24) | (((b4 & 255) | ((b5 & 255) << 8)) | ((b6 & 255) << 16)))) << 32);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m2367g() {
        switch (this.f3921d) {
            case 2:
                long j = this.f3918a[0];
                long j2 = this.f3918a[1];
                long j3 = (j ^ j2) & (-4294967296L);
                this.f3918a[0] = j ^ j3;
                this.f3918a[1] = j2 ^ j3;
                return;
            case 4:
                long j4 = this.f3918a[0];
                long j5 = this.f3918a[1];
                long j6 = this.f3918a[2];
                long j7 = this.f3918a[3];
                long j8 = (j4 ^ j6) & (-4294967296L);
                long j9 = j4 ^ j8;
                long j10 = j6 ^ j8;
                long j11 = (j5 ^ j7) & 281474976645120L;
                long j12 = j5 ^ j11;
                long j13 = j7 ^ j11;
                long j14 = (j9 ^ j12) & (-281470681808896L);
                long j15 = j9 ^ j14;
                long j16 = j12 ^ j14;
                long j17 = (j10 ^ j13) & (-281470681808896L);
                this.f3918a[0] = j15;
                this.f3918a[1] = j16;
                this.f3918a[2] = j10 ^ j17;
                this.f3918a[3] = j13 ^ j17;
                return;
            case 8:
                long j18 = this.f3918a[0];
                long j19 = this.f3918a[1];
                long j20 = this.f3918a[2];
                long j21 = this.f3918a[3];
                long j22 = this.f3918a[4];
                long j23 = this.f3918a[5];
                long j24 = this.f3918a[6];
                long j25 = this.f3918a[7];
                long j26 = (j18 ^ j22) & (-4294967296L);
                long j27 = j18 ^ j26;
                long j28 = j22 ^ j26;
                long j29 = (j19 ^ j23) & 72057594021150720L;
                long j30 = j19 ^ j29;
                long j31 = j23 ^ j29;
                long j32 = (j20 ^ j24) & 281474976645120L;
                long j33 = j20 ^ j32;
                long j34 = j24 ^ j32;
                long j35 = (j21 ^ j25) & 1099511627520L;
                long j36 = j21 ^ j35;
                long j37 = j25 ^ j35;
                long j38 = (j27 ^ j33) & (-281470681808896L);
                long j39 = j27 ^ j38;
                long j40 = j33 ^ j38;
                long j41 = (j30 ^ j36) & 72056494543077120L;
                long j42 = j30 ^ j41;
                long j43 = j36 ^ j41;
                long j44 = (j28 ^ j34) & (-281470681808896L);
                long j45 = j28 ^ j44;
                long j46 = j34 ^ j44;
                long j47 = (j31 ^ j37) & 72056494543077120L;
                long j48 = j31 ^ j47;
                long j49 = j37 ^ j47;
                long j50 = (j39 ^ j42) & (-71777214294589696L);
                long j51 = j39 ^ j50;
                long j52 = j42 ^ j50;
                long j53 = (j40 ^ j43) & (-71777214294589696L);
                long j54 = j40 ^ j53;
                long j55 = j43 ^ j53;
                long j56 = (j45 ^ j48) & (-71777214294589696L);
                long j57 = j45 ^ j56;
                long j58 = j48 ^ j56;
                long j59 = (j46 ^ j49) & (-71777214294589696L);
                this.f3918a[0] = j51;
                this.f3918a[1] = j52;
                this.f3918a[2] = j54;
                this.f3918a[3] = j55;
                this.f3918a[4] = j57;
                this.f3918a[5] = j58;
                this.f3918a[6] = j46 ^ j59;
                this.f3918a[7] = j49 ^ j59;
                return;
            default:
                throw new IllegalStateException("unsupported block length: only 128/256/512 are allowed");
        }
    }

    /* JADX INFO: renamed from: h */
    private void m2368h() {
        for (int i = 0; i < this.f3921d; i++) {
            long[] jArr = this.f3918a;
            jArr[i] = m2353a(jArr[i]);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m2369i() {
        for (int i = 0; i < this.f3921d; i++) {
            long[] jArr = this.f3918a;
            jArr[i] = m2356b(jArr[i]);
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final String mo2123a() {
        return "DSTU7624";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final void mo2124a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (!(interfaceC1003i instanceof C1076ba)) {
            throw new IllegalArgumentException("Invalid parameter passed to DSTU7624Engine init");
        }
        this.f3924g = z;
        byte[] bArrM2603a = ((C1076ba) interfaceC1003i).m2603a();
        int length = bArrM2603a.length << 3;
        int i = this.f3921d << 6;
        if (length != 128 && length != 256 && length != 512) {
            throw new IllegalArgumentException("unsupported key length: only 128/256/512 are allowed");
        }
        if (length != i && length != i * 2) {
            throw new IllegalArgumentException("Unsupported key length");
        }
        switch (length) {
            case 128:
                this.f3923f = 10;
                break;
            case 256:
                this.f3923f = 14;
                break;
            case 512:
                this.f3923f = 18;
                break;
        }
        this.f3922e = length >>> 6;
        this.f3920c = new long[this.f3923f + 1][];
        for (int i2 = 0; i2 < this.f3920c.length; i2++) {
            this.f3920c[i2] = new long[this.f3921d];
        }
        this.f3919b = new long[this.f3922e];
        if (bArrM2603a.length != (length >>> 3)) {
            throw new IllegalArgumentException("Invalid key parameter passed to DSTU7624Engine init");
        }
        AbstractC1556g.m4149b(bArrM2603a, 0, this.f3919b);
        long[] jArr = new long[this.f3921d];
        m2355a(this.f3919b, jArr);
        m2359b(this.f3919b, jArr);
        m2364d();
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return this.f3921d << 3;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: c */
    public final void mo2126c() {
        C1535a.m4073a(this.f3918a);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.f3919b == null) {
            throw new IllegalStateException("DSTU7624Engine not initialised");
        }
        if ((this.f3921d << 3) + i > bArr.length) {
            throw new C1163o("Input buffer too short");
        }
        if ((this.f3921d << 3) + i2 > bArr2.length) {
            throw new C0803ac("Output buffer too short");
        }
        if (this.f3924g) {
            switch (this.f3921d) {
                case 2:
                    m2362c(bArr, i, bArr2, i2);
                    break;
                default:
                    AbstractC1556g.m4149b(bArr, i, this.f3918a);
                    m2354a(0);
                    int i3 = 0;
                    while (true) {
                        m2365e();
                        m2367g();
                        m2368h();
                        i3++;
                        if (i3 == this.f3923f) {
                            m2354a(this.f3923f);
                            AbstractC1556g.m4150b(this.f3918a, bArr2, i2);
                        } else {
                            m2361c(i3);
                        }
                        break;
                    }
                    break;
            }
        } else {
            switch (this.f3921d) {
                case 2:
                    m2358b(bArr, i, bArr2, i2);
                    break;
                default:
                    AbstractC1556g.m4149b(bArr, i, this.f3918a);
                    m2357b(this.f3923f);
                    int i4 = this.f3923f;
                    while (true) {
                        m2369i();
                        switch (this.f3921d) {
                            case 2:
                                long j = this.f3918a[0];
                                long j2 = this.f3918a[1];
                                long j3 = (j ^ j2) & (-4294967296L);
                                this.f3918a[0] = j ^ j3;
                                this.f3918a[1] = j2 ^ j3;
                                break;
                            case 4:
                                long j4 = this.f3918a[0];
                                long j5 = this.f3918a[1];
                                long j6 = this.f3918a[2];
                                long j7 = this.f3918a[3];
                                long j8 = (j4 ^ j5) & (-281470681808896L);
                                long j9 = j4 ^ j8;
                                long j10 = j5 ^ j8;
                                long j11 = (j6 ^ j7) & (-281470681808896L);
                                long j12 = j6 ^ j11;
                                long j13 = j7 ^ j11;
                                long j14 = (j9 ^ j12) & (-4294967296L);
                                long j15 = j9 ^ j14;
                                long j16 = j12 ^ j14;
                                long j17 = (j10 ^ j13) & 281474976645120L;
                                this.f3918a[0] = j15;
                                this.f3918a[1] = j10 ^ j17;
                                this.f3918a[2] = j16;
                                this.f3918a[3] = j13 ^ j17;
                                break;
                            case 8:
                                long j18 = this.f3918a[0];
                                long j19 = this.f3918a[1];
                                long j20 = this.f3918a[2];
                                long j21 = this.f3918a[3];
                                long j22 = this.f3918a[4];
                                long j23 = this.f3918a[5];
                                long j24 = this.f3918a[6];
                                long j25 = this.f3918a[7];
                                long j26 = (j18 ^ j19) & (-71777214294589696L);
                                long j27 = j18 ^ j26;
                                long j28 = j19 ^ j26;
                                long j29 = (j20 ^ j21) & (-71777214294589696L);
                                long j30 = j20 ^ j29;
                                long j31 = j21 ^ j29;
                                long j32 = (j22 ^ j23) & (-71777214294589696L);
                                long j33 = j22 ^ j32;
                                long j34 = j23 ^ j32;
                                long j35 = (j24 ^ j25) & (-71777214294589696L);
                                long j36 = j24 ^ j35;
                                long j37 = j25 ^ j35;
                                long j38 = (j27 ^ j30) & (-281470681808896L);
                                long j39 = j27 ^ j38;
                                long j40 = j30 ^ j38;
                                long j41 = (j28 ^ j31) & 72056494543077120L;
                                long j42 = j28 ^ j41;
                                long j43 = j31 ^ j41;
                                long j44 = (j33 ^ j36) & (-281470681808896L);
                                long j45 = j33 ^ j44;
                                long j46 = j36 ^ j44;
                                long j47 = (j34 ^ j37) & 72056494543077120L;
                                long j48 = j34 ^ j47;
                                long j49 = j37 ^ j47;
                                long j50 = (j39 ^ j45) & (-4294967296L);
                                long j51 = j39 ^ j50;
                                long j52 = j45 ^ j50;
                                long j53 = (j42 ^ j48) & 72057594021150720L;
                                long j54 = j42 ^ j53;
                                long j55 = j48 ^ j53;
                                long j56 = (j40 ^ j46) & 281474976645120L;
                                long j57 = j40 ^ j56;
                                long j58 = j46 ^ j56;
                                long j59 = (j43 ^ j49) & 1099511627520L;
                                this.f3918a[0] = j51;
                                this.f3918a[1] = j54;
                                this.f3918a[2] = j57;
                                this.f3918a[3] = j43 ^ j59;
                                this.f3918a[4] = j52;
                                this.f3918a[5] = j55;
                                this.f3918a[6] = j58;
                                this.f3918a[7] = j49 ^ j59;
                                break;
                            default:
                                throw new IllegalStateException("unsupported block length: only 128/256/512 are allowed");
                        }
                        m2366f();
                        i4--;
                        if (i4 == 0) {
                            m2357b(0);
                            AbstractC1556g.m4150b(this.f3918a, bArr2, i2);
                        } else {
                            m2361c(i4);
                        }
                        break;
                    }
                    break;
            }
        }
        return this.f3921d << 3;
    }

    /* JADX INFO: renamed from: d */
    private void m2364d() {
        for (int i = 1; i < this.f3923f; i += 2) {
            long[] jArr = this.f3920c[i - 1];
            long[] jArr2 = this.f3920c[i];
            switch (this.f3921d) {
                case 2:
                    long j = jArr[0];
                    long j2 = jArr[1];
                    jArr2[0] = (j >>> 56) | (j2 << 8);
                    jArr2[1] = (j << 8) | (j2 >>> 56);
                    break;
                case 4:
                    long j3 = jArr[0];
                    long j4 = jArr[1];
                    long j5 = jArr[2];
                    long j6 = jArr[3];
                    jArr2[0] = (j4 >>> 24) | (j5 << 40);
                    jArr2[1] = (j5 >>> 24) | (j6 << 40);
                    jArr2[2] = (j6 >>> 24) | (j3 << 40);
                    jArr2[3] = (j3 >>> 24) | (j4 << 40);
                    break;
                case 8:
                    long j7 = jArr[0];
                    long j8 = jArr[1];
                    long j9 = jArr[2];
                    long j10 = jArr[3];
                    long j11 = jArr[4];
                    long j12 = jArr[5];
                    long j13 = jArr[6];
                    long j14 = jArr[7];
                    jArr2[0] = (j9 >>> 24) | (j10 << 40);
                    jArr2[1] = (j10 >>> 24) | (j11 << 40);
                    jArr2[2] = (j11 >>> 24) | (j12 << 40);
                    jArr2[3] = (j12 >>> 24) | (j13 << 40);
                    jArr2[4] = (j13 >>> 24) | (j14 << 40);
                    jArr2[5] = (j14 >>> 24) | (j7 << 40);
                    jArr2[6] = (j7 >>> 24) | (j8 << 40);
                    jArr2[7] = (j8 >>> 24) | (j9 << 40);
                    break;
                default:
                    throw new IllegalStateException("unsupported block length: only 128/256/512 are allowed");
            }
        }
    }
}
