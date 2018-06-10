package com.ngo.ducquang.test.base;

import com.ngo.ducquang.test.callAPI.StatusModel;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by ducqu on 5/28/2018.
 */

public interface ApiService
{
    @POST("customer/Index")
    @FormUrlEncoded
    Call<StatusModel> getProject(@Field("Token") String token,
                                 @Field("Term") String term);

    class Factory
    {
        private static ApiService service;
        public static Retrofit retrofit;
        public static ApiService getInstance()
        {
            final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .connectTimeout(60, TimeUnit.SECONDS)
                    .writeTimeout(60, TimeUnit.SECONDS)
                    .readTimeout(60, TimeUnit.SECONDS)/*.cookieJar(new CookieJar() {
                        @Override
                        public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
                            for(Cookie cookie : cookies)
                            {
                                HttpClientInstance.cookieStore.add(cookie);
                            }
                        }

                        @Override
                        public List<Cookie> loadForRequest(HttpUrl url) {
                            return HttpClientInstance.cookieStore != null ? HttpClientInstance.cookieStore : new ArrayList<Cookie>();
                        }
                    })*/
                    .build();

            retrofit = new Retrofit.Builder()
                    .baseUrl("http://api.docpro.vn/api/")
//                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create()).client(okHttpClient)
                    .build();

            service = retrofit.create(ApiService.class);

            return service;
        }
    }
}
