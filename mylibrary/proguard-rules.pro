# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
# Keep all AspectJ classes
-keep class org.aspectj.** { *; }

# Keep the AspectJ annotations
-keep class org.aspectj.lang.annotation.* { *; }

# Keep AspectJ join points
-keep class org.aspectj.lang.ProceedingJoinPoint { *; }

# Keep AspectJ signatures (for methods)
-keep class org.aspectj.lang.Signature { *; }

# Keep the AspectJ aspect methods
-keep class com.yourpackage.* { *; }  # Keep your Aspect classes, adjust the package name as needed