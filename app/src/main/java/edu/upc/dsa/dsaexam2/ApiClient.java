package edu.upc.dsa.dsaexam2;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static Retrofit getRetrofit() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY); /*añade un token*/

        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build(); /*Reutilizacion */

        Retrofit retrofit = new Retrofit.Builder() /*Sabemos que nos espera un Json por eso usamos unb Gson, ponemos donde se gara las peticiones*/
                .baseUrl("https://developer.github.com/v3/")
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

    
}
