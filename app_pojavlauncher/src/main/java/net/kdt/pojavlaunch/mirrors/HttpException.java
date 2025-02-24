package net.kdt.pojavlaunch.mirrors;

import java.io.IOException;

public class HttpException extends IOException {
    // Do not change. Android really hates when this value changes for some reason.
    private static final long serialVersionUID = -7372301619612640655L;

    public HttpException(String msg) {
        super(msg);
    }
}
