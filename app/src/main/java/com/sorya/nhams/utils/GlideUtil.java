package com.sorya.nhams.utils;

//import android.content.Context;
//
//import androidx.annotation.NonNull;
//
//import com.bumptech.glide.Glide;
//import com.bumptech.glide.Registry;
//import com.bumptech.glide.annotation.GlideModule;
//import com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader;
//import com.bumptech.glide.load.model.GlideUrl;
//
//import java.io.InputStream;
//
//import okhttp3.OkHttpClient;
//
//@GlideModule
//public class GlideUtil {
//    @Override
//    public void registerComponents(@NonNull Context context, @NonNull Glide glide, @NonNull Registry registry) {
//
//        //To Attach Self Signed Ssl Certificate
//        /*OkHttpClient okHttpClient = new OkHttpClient.Builder()
//                .sslSocketFactory(sslSocketFactory, X509TrustManager)
//                .build();*/
//
//        //Unsafe Okhttp client
//        OkHttpClient okHttpClient= UnsafeOkHttpClient.getUnsafeOkHttpClient();
//
//        registry.replace(GlideUrl.class, InputStream.class, new OkHttpUrlLoader.Factory(okHttpClient));
//    }
//}
