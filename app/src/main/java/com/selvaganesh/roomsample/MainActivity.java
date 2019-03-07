package com.selvaganesh.roomsample;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.selvaganesh.roomsample.db.AppDatabase;
import com.selvaganesh.roomsample.db.dbutils.RegistrationUtils;
import com.selvaganesh.roomsample.db.entry.CountryModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RegistrationUtils.CountryModelCallBack {

    private String TAG = MainActivity.class.getSimpleName();
    private AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = AppDatabase.getInstance(this);

        ArrayList<CountryModel> countryModels = new ArrayList<>();
        CountryModel countryModel = new CountryModel();
        countryModel.setCallingCode("96260");
        countryModels.add(countryModel);
        saveNote(countryModels);

        RegistrationUtils registrationUtils = new RegistrationUtils(this, this);
        registrationUtils.getlAllCurrency();

    }


    private void saveNote(final List<CountryModel> countryModels) {
        new AsyncTask<List<CountryModel>, Void, Void>() {
            @Override
            protected Void doInBackground(List<CountryModel>... lists) {
                db.getRegistrationSet().deleteCountry();
                db.getRegistrationSet().insertAllCountry(countryModels);
                Log.v(TAG, "Currency, Country and Language DB update Updated");
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                Log.v(TAG, "data inserted successfully");
            }
        }.execute();
    }


    @Override
    public void onCurrecyResponse(List<CountryModel> currencyIist) {
        Log.v(TAG, "currencyIist List Size : " + currencyIist.size());
    }
}
