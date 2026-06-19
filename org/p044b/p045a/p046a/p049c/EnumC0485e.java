package org.p044b.p045a.p046a.p049c;

/* JADX INFO: renamed from: org.b.a.a.c.e */
/* JADX INFO: compiled from: Status.java */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0485e implements InterfaceC0482b {
    SWITCH_PROTOCOL(101, "Switching Protocols"),
    OK(200, "OK"),
    CREATED(201, "Created"),
    ACCEPTED(202, "Accepted"),
    NO_CONTENT(204, "No Content"),
    PARTIAL_CONTENT(206, "Partial Content"),
    MULTI_STATUS(207, "Multi-Status"),
    REDIRECT(301, "Moved Permanently"),
    FOUND(302, "Found"),
    REDIRECT_SEE_OTHER(303, "See Other"),
    NOT_MODIFIED(304, "Not Modified"),
    TEMPORARY_REDIRECT(307, "Temporary Redirect"),
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
    NOT_ACCEPTABLE(406, "Not Acceptable"),
    REQUEST_TIMEOUT(408, "Request Timeout"),
    CONFLICT(409, "Conflict"),
    GONE(410, "Gone"),
    LENGTH_REQUIRED(411, "Length Required"),
    PRECONDITION_FAILED(412, "Precondition Failed"),
    PAYLOAD_TOO_LARGE(413, "Payload Too Large"),
    UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type"),
    RANGE_NOT_SATISFIABLE(416, "Requested Range Not Satisfiable"),
    EXPECTATION_FAILED(417, "Expectation Failed"),
    TOO_MANY_REQUESTS(429, "Too Many Requests"),
    INTERNAL_ERROR(500, "Internal Server Error"),
    NOT_IMPLEMENTED(501, "Not Implemented"),
    SERVICE_UNAVAILABLE(503, "Service Unavailable"),
    UNSUPPORTED_HTTP_VERSION(505, "HTTP Version Not Supported");


    /* JADX INFO: renamed from: G */
    private final int f1844G;

    /* JADX INFO: renamed from: H */
    private final String f1845H;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0485e[] valuesCustom() {
        EnumC0485e[] enumC0485eArrValuesCustom = values();
        int length = enumC0485eArrValuesCustom.length;
        EnumC0485e[] enumC0485eArr = new EnumC0485e[length];
        System.arraycopy(enumC0485eArrValuesCustom, 0, enumC0485eArr, 0, length);
        return enumC0485eArr;
    }

    EnumC0485e(int i, String str) {
        this.f1844G = i;
        this.f1845H = str;
    }

    @Override // org.p044b.p045a.p046a.p049c.InterfaceC0482b
    /* JADX INFO: renamed from: a */
    public final String mo1299a() {
        return this.f1844G + " " + this.f1845H;
    }
}
