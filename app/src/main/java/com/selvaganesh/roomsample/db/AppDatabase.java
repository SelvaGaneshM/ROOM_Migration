package com.selvaganesh.roomsample.db;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.migration.Migration;
import android.content.Context;
import android.util.Log;

import com.selvaganesh.roomsample.db.dao.RegistrationDao;
import com.selvaganesh.roomsample.db.entry.CountryModel;

@Database(entities = {CountryModel.class,}, version = 2, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    public static final String DB_NAME = "app_sample";
    private static final Object sLock = new Object();
    private static AppDatabase INSTANCE;

    public static AppDatabase getInstance(Context context) {
        synchronized (sLock) {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                        AppDatabase.class, DB_NAME)
                        .addMigrations(MIGRATION_1_2)
                        .build();
            }
            return INSTANCE;
        }
    }

    static final Migration MIGRATION_1_2 = new Migration(1, 2) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            // Create the new table
            database.execSQL(
                    "CREATE TABLE CountryModel_new (CountryKey INTEGER NOT NULL,CountryId INTEGER, Description TEXT,RegionCode TEXT,CountryName TEXT,\n" +
                            "FlagUrl TEXT,IsEUCountry BOOLEAN,CallingCode TEXT,IsKycSupported BOOLEAN,IsConnectbankSupported BOOLEAN,CurrencySymbol TEXT,ICAOCode TEXT,\n" +
                            "CurrencyName TEXT,CurrencyCode TEXT,RegionName TEXT,Region INTEGER,LanguageName TEXT,CountryCode TEXT,\n" +
                            "ISEEA BOOLEAN,IsSignUpCountry BOOLEAN,ISO3digitCode TEXT,IsSupportBeneficiary BOOLEAN,OCRProviderTypePassport INTEGER NOT NULL DEFAULT  0,\n" +
                            "OCRProviderTypeLicense INTEGER NOT NULL DEFAULT  0,PRIMARY KEY(CountryKey))");
            Log.v("Registration DB", "TABLE CREATED");
            // Copy the data
            database.execSQL(
                    "INSERT INTO CountryModel_new (CountryId, Description,RegionCode,CountryName,FlagUrl,IsEUCountry,CallingCode,IsKycSupported,IsConnectbankSupported,CurrencySymbol,ICAOCode,CurrencyName,CurrencyCode,RegionName,Region,LanguageName,CountryCode,\n" +
                            "ISEEA,IsSignUpCountry,ISO3digitCode,IsSupportBeneficiary)\n" +
                            "SELECT CountryId, Description,RegionCode,CountryName,FlagUrl,IsEUCountry,CallingCode,IsKycSupported,IsConnectbankSupported,CurrencySymbol,ICAOCode,CurrencyName,CurrencyCode,RegionName,Region,LanguageName,CountryCode,\n" +
                            "ISEEA,IsSignUpCountry,ISO3digitCode,IsSupportBeneficiary  FROM CountryModel");
            Log.v("Registration DB", "Table merged");
            // Remove the old table
            database.execSQL("DROP TABLE CountryModel");
            Log.v("Registration DB", "TABLE FROPED");
            // Change the table name to the correct one
            database.execSQL("ALTER TABLE CountryModel_new RENAME TO CountryModel");
            Log.v("Registration DB", "TABLE RENAMED");
        }
    };

    static final Migration MIGRATION_2_3 = new Migration(2, 3) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            database.execSQL("ALTER TABLE CountryModel ADD COLUMN  isValuesAdded BOOLEAN ");
        }
    };

    public abstract RegistrationDao getRegistrationSet();

}
