package com.alibaba.fastjson2.util;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class UnsafeUtils {
    public static final Unsafe UNSAFE;
    static {
        Unsafe unsafe = null;
        try {
            Field theUnsafeField = Unsafe.class.getDeclaredField("theUnsafe");
            theUnsafeField.setAccessible(true);
            unsafe = (Unsafe) theUnsafeField.get(null);
        } catch (Throwable ignored) {
            // ignored
        }
        UNSAFE = unsafe;
    }

    public static Object getObject(Object o, long offset) {
        return UNSAFE.getObject(o, offset);
    }

    public static long getLong(Object o, long offset) {
        return UNSAFE.getLong(o, offset);
    }

    public static int getInt(Object o, long offset) {
        return UNSAFE.getInt(o, offset);
    }

    public static short getShort(Object o, long offset) {
        return UNSAFE.getShort(o, offset);
    }

    public static byte getByte(Object o, long offset) {
        return UNSAFE.getByte(o, offset);
    }

    public static float getFloat(Object o, long offset) {
        return UNSAFE.getFloat(o, offset);
    }

    public static double getDouble(Object o, long offset) {
        return UNSAFE.getDouble(o, offset);
    }

    public static boolean getBoolean(Object o, long offset) {
        return UNSAFE.getBoolean(o, offset);
    }

    public static char getChar(Object o, long offset) {
        return UNSAFE.getChar(o, offset);
    }

    public static void putObject(Object o, long offset, Object x) {
        UNSAFE.putObject(o, offset, x);
    }

    public static Object allocateInstance(Class<?> cls) throws InstantiationException {
        return UNSAFE.allocateInstance(cls);
    }

    public static long objectFieldOffset(Field field) {
        return UNSAFE.objectFieldOffset(field);
    }
}
