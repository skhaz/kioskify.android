-ignorewarnings

-keep class * {
    public private *;
}

-keepattributes Signature
-keepattributes *Annotation*
-keepattributes SourceFile,LineNumberTable

-keepclassmembers class io.skhaz.kioskify.model.** {*;}

-keep class com.google.android.exoplayer.** {*;}

-keep class com.google.android.gms.**
-dontwarn com.google.android.gms.**