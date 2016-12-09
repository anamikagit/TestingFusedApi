package com.example.aarya.testingfusedapi.rest;

import com.example.aarya.testingfusedapi.model.GpsParameters;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("/sgm_android/WebService.asmx/insertfolochist")
    Call<List<GpsParameters>> sendGpsData
            (@Query("lat") String latitude,
             @Query("lon") String longitude,
             @Query("imei") String imei,
             @Query("battery") String battery,
             @Query("date_time") float dateTime,
             @Query("Accurate") String accurate,
             @Query("Panic") String panic,
             @Query("Speed") String speed,
             @Query("location") String location,
             @Query("Direction") String direction);
}
