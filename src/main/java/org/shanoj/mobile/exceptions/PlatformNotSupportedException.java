package org.shanoj.mobile.exceptions;

public class PlatformNotSupportedException extends Exception{
    public PlatformNotSupportedException(String reason) {
        super(reason);
    }
}
