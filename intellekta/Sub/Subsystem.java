package com.intellekta.Sub;

public interface Subsystem {
    String getName();
    int getVersion();
    void install();
    Subsystem[] getPrerequisites();
}
