package com.example.mylibrary;

import android.util.Log;

import java.lang.reflect.Method;

public class AnnotationExecutor {
    private static final String TAG = "ExecutionTimeLogger";

    public static void executeAnnotatedMethods(Object target) {
        Method[] methods = target.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(MeasureExecutionTime.class)) {
                try {
                    method.setAccessible(true);

                    long startTime = System.currentTimeMillis();
                    method.invoke(target);
                    long endTime = System.currentTimeMillis();

                    Log.d(TAG, "Execution time of " + method.getName() + ": " + (endTime - startTime) + "ms");
                } catch (Exception e) {
                    Log.e(TAG, "Error executing annotated method: " + method.getName(), e);
                }
            }
        }
    }
}
