package com.stackof.calljni;

public class JniLib {
    static {
        System.loadLibrary("JniLib");
    }

    public static native String callToCpp();
}
