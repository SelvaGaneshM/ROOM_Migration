package com.selvaganesh.roomsample.db.dbutils;

import android.annotation.SuppressLint;
import android.arch.persistence.room.Room;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.selvaganesh.roomsample.db.AppDatabase;
import com.selvaganesh.roomsample.db.entry.CountryModel;

import java.util.List;

public class RegistrationUtils {

    private AppDatabase db;
    private Context context;
    private CountryModelCallBack countryModelCallBack;

    public RegistrationUtils(Context mcontext, CountryModelCallBack mCountryModelInterface) {
        this.context = mcontext;
        this.countryModelCallBack = mCountryModelInterface;
        initDB();
    }

    private void initDB() {
        db = Room.databaseBuilder(context, AppDatabase.class, AppDatabase.DB_NAME).fallbackToDestructiveMigration().build();
        Log.v("Registration DB", "DB Created" + db);
    }

    @SuppressLint("StaticFieldLeak")
    public void getlAllCurrency() {
        new AsyncTask<Void, Void, List<CountryModel>>() {
            @Override
            protected List<CountryModel> doInBackground(Void... params) {
                return db.getRegistrationSet().getAllCountry();
            }

            @Override
            protected void onPostExecute(List<CountryModel> allCurrency) {
                countryModelCallBack.onCurrecyResponse(allCurrency);
            }
        }.execute();
    }

    public interface CountryModelCallBack {
        void onCurrecyResponse(List<CountryModel> currencyIist);
    }
}
