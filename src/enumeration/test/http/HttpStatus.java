package enumeration.test.http;

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "NOT_FOUND"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return code >= 200 && code < 300;
    }

    public static HttpStatus findByCode(int code) {
        HttpStatus[] values = values();
        for (HttpStatus httpStatus : values) {
            if (httpStatus.getCode() == code) {
                return httpStatus;
            }
        }
        return null;
    }
}
