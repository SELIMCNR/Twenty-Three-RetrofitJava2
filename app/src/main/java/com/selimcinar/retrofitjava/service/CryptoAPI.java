package com.selimcinar.retrofitjava.service;



import com.selimcinar.retrofitjava.model.CryptoModel;

import java.util.List;

import retrofit2.http.GET;
import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    //GET , POST, UPDATE , DELETE
    //Url base -> www.website.com  //https://raw.githubusercontent.com/
    // Get -> price?keyxxx
    @GET("atilsamancioglu/K21-JSONDataSet/blob/master/crypto.json")
    Observable<List<CryptoModel>> getData();
    //Call<List<CryptoModel>> getData();




}
