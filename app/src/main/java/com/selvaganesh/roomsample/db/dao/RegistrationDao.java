package com.selvaganesh.roomsample.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.selvaganesh.roomsample.db.entry.CountryModel;

import java.util.List;

@Dao
public interface RegistrationDao {

    @Query("SELECT * FROM CountryModel")
    List<CountryModel> getAllCountry();

    @Query("DELETE FROM CountryModel")
    void deleteCountry();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAllCountry(List<CountryModel> countryModels);

    @Delete
    void delete(CountryModel delCountry);
}
