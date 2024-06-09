# Retrofit
-keep class retrofit2.** { *; }
-keepattributes Signature
-keepattributes RuntimeVisibleAnnotations
-keepattributes AnnotationDefault
-dontwarn okhttp3.**
-keep class okhttp3.** { *; }
-keep interface okhttp3.** { *; }

# Dagger Hilt
-keep class dagger.hilt.** { *; }
-keep class javax.inject.** { *; }
-dontwarn javax.annotation.**
-dontwarn dagger.hilt.internal.GeneratedComponentManagerHolder
-keep @dagger.hilt.InstallIn class * { *; }
-keep @dagger.Module class * { *; }
-keep @dagger.hilt.android.internal.managers.ApplicationComponentManager class * { *; }
-keep @dagger.hilt.components.SingletonComponent class * { *; }

# Preserve generic type information
-keepattributes Signature
-keepattributes *Annotation*

# Keep MVVM architecture classes
-keep class com.yourpackage.viewmodel.** { *; }
-keep class com.yourpackage.repository.** { *; }
-keep class com.yourpackage.network.** { *; }
-keep class com.yourpackage.utils.** { *; }

# Keep Gson
-keep class com.google.gson.** { *; }
-keep class com.google.gson.reflect.TypeToken { *; }
-keepattributes Signature
-keepattributes *Annotation*

# Debugging
-whyareyoukeeping class * { *; }
-printusage usage.txt
-dontobfuscate


