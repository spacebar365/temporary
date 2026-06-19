package com.p033al.dlnaserver.servers;

import java.io.FileDescriptor;
import java.io.FileInputStream;

/* JADX INFO: renamed from: com.al.dlnaserver.servers.l */
/* JADX INFO: compiled from: HttpFileServer.java */
/* JADX INFO: loaded from: classes.dex */
final class C0417l extends FileInputStream {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0415j f1539a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ long f1540b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0417l(C0415j c0415j, FileDescriptor fileDescriptor, long j) {
        super(fileDescriptor);
        this.f1539a = c0415j;
        this.f1540b = j;
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int available() {
        return (int) this.f1540b;
    }
}
