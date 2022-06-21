
#include "com_stackof_calljni_JniLib.h"

extern "C"
JNIEXPORT jstring JNICALL
Java_com_stackof_calljni_JniLib_callToCpp(JNIEnv *env, jclass clazz) {
    return (*env).NewStringUTF("从cpp返回的文本。");
}