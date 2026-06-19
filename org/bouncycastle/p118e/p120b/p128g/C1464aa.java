package org.bouncycastle.p118e.p120b.p128g;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: org.bouncycastle.e.b.g.aa */
/* JADX INFO: loaded from: classes.dex */
public final class C1464aa {

    /* JADX INFO: renamed from: org.bouncycastle.e.b.g.aa$a */
    private static class a extends ObjectInputStream {

        /* JADX INFO: renamed from: a */
        private static final Set f5299a;

        /* JADX INFO: renamed from: b */
        private final Class f5300b;

        /* JADX INFO: renamed from: c */
        private boolean f5301c;

        static {
            HashSet hashSet = new HashSet();
            f5299a = hashSet;
            hashSet.add("java.util.TreeMap");
            f5299a.add("java.lang.Integer");
            f5299a.add("java.lang.Number");
            f5299a.add("org.bouncycastle.pqc.crypto.xmss.BDS");
            f5299a.add("java.util.ArrayList");
            f5299a.add("org.bouncycastle.pqc.crypto.xmss.XMSSNode");
            f5299a.add("[B");
            f5299a.add("java.util.LinkedList");
            f5299a.add("java.util.Stack");
            f5299a.add("java.util.Vector");
            f5299a.add("[Ljava.lang.Object;");
            f5299a.add("org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
        }

        a(Class cls, InputStream inputStream) {
            super(inputStream);
            this.f5301c = false;
            this.f5300b = cls;
        }

        @Override // java.io.ObjectInputStream
        protected final Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws InvalidClassException {
            if (this.f5301c) {
                if (!f5299a.contains(objectStreamClass.getName())) {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
            } else {
                if (!objectStreamClass.getName().equals(this.f5300b.getName())) {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
                this.f5301c = true;
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m3833a(int i) {
        int i2 = 0;
        while (true) {
            i >>= 1;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m3834a(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (((i >> i3) & 1) == 0) {
                return i3;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public static long m3835a(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("in == null");
        }
        long j = 0;
        for (int i2 = 0; i2 < i + 0; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }

    /* JADX INFO: renamed from: a */
    public static Object m3836a(byte[] bArr, Class cls) throws ClassNotFoundException, IOException {
        a aVar = new a(cls, new ByteArrayInputStream(bArr));
        Object object = aVar.readObject();
        if (aVar.available() != 0) {
            throw new IOException("unexpected data found at end of ObjectInputStream");
        }
        if (cls.isInstance(object)) {
            return object;
        }
        throw new IOException("unexpected class found in ObjectInputStream");
    }

    /* JADX INFO: renamed from: a */
    public static void m3837a(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2 == null) {
            throw new NullPointerException("src == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        if (bArr2.length + i > bArr.length) {
            throw new IllegalArgumentException("src length + offset must not be greater than size of destination");
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr[i + i2] = bArr2[i2];
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3838a(int i, long j) {
        if (j < 0) {
            throw new IllegalStateException("index must not be negative");
        }
        return j < (1 << i);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m3839a(long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            bArr[i2] = (byte) j;
            j >>>= 8;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m3840a(Object obj) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m3841a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("in == null");
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m3842a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("src == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("length hast to be >= 0");
        }
        if (i + i2 > bArr.length) {
            throw new IllegalArgumentException("offset + length must not be greater then size of source array");
        }
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < bArr2.length; i3++) {
            bArr2[i3] = bArr[i + i3];
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: a */
    public static byte[][] m3843a(byte[][] bArr) {
        if (m3845b(bArr)) {
            throw new NullPointerException("in has null pointers");
        }
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = new byte[bArr[i].length];
            System.arraycopy(bArr[i], 0, bArr2[i], 0, bArr[i].length);
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: b */
    public static int m3844b(long j, int i) {
        return (int) (((1 << i) - 1) & j);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3845b(byte[][] bArr) {
        if (bArr == null) {
            return true;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                return true;
            }
        }
        return false;
    }
}
