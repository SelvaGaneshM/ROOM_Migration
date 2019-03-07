package com.selvaganesh.roomsample.db.entry;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/*
 * Name                   : Selva Ganesh M
 * Date                     : 27/Sep/2018
 * High level Purpose : Country Model Room database
 */
@Entity(tableName = "CountryModel")
public class CountryModel {
//    @PrimaryKey(autoGenerate = true)
//    @ColumnInfo(name = "Key_id")
//    private int keyId;


    @PrimaryKey(autoGenerate = true)
    public int CountryKey;

    @ColumnInfo(name = "CountryId")
    private int CountryId;

    @ColumnInfo(name = "Description")
    private String Description;

    @ColumnInfo(name = "RegionCode")
    private String RegionCode;

    @ColumnInfo(name = "CountryName")
    private String CountryName;

    @ColumnInfo(name = "FlagUrl")
    private String FlagUrl;

    @ColumnInfo(name = "IsEUCountry")
    private boolean IsEUCountry;

    @ColumnInfo(name = "CallingCode")
    private String CallingCode;

    @ColumnInfo(name = "IsKycSupported")
    private boolean IsKycSupported;

    @ColumnInfo(name = "IsConnectbankSupported")
    private boolean IsConnectbankSupported;

    @ColumnInfo(name = "CurrencySymbol")
    private String CurrencySymbol;

    @ColumnInfo(name = "ICAOCode")
    private String ICAOCode;

    @ColumnInfo(name = "CurrencyName")
    private String CurrencyName;

    @ColumnInfo(name = "CurrencyCode")
    private String CurrencyCode;

    @ColumnInfo(name = "RegionName")
    private String RegionName;

    @ColumnInfo(name = "Region")
    private int Region;

    @ColumnInfo(name = "LanguageName")
    private String LanguageName;

    @ColumnInfo(name = "CountryCode")
    private String CountryCode;

    @ColumnInfo(name = "ISEEA")
    private boolean ISEEA;

    @ColumnInfo(name = "IsSignUpCountry")
    private boolean IsSignUpCountry;

    @ColumnInfo(name = "ISO3digitCode")
    private String ISO3digitCode;

    @ColumnInfo(name = "IsSupportBeneficiary")
    private boolean IsSupportBeneficiary;

    @ColumnInfo(name = "OCRProviderTypePassport")
    private int OCRProviderTypePassportValue;

    @ColumnInfo(name = "OCRProviderTypeLicense")
    private int OCRProviderTypeLicenseValue;

   /* @ColumnInfo(name="isValuesAdded")
    private boolean IsValuesAdded;*/

    public int getCountryId() {
        return CountryId;
    }

    public void setCountryId(int countryId) {
        CountryId = countryId;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getRegionCode() {
        return RegionCode;
    }

    public void setRegionCode(String regionCode) {
        RegionCode = regionCode;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public String getFlagUrl() {
        return FlagUrl;
    }

    public void setFlagUrl(String flagUrl) {
        FlagUrl = flagUrl;
    }

    public boolean getIsEUCountry() {
        return IsEUCountry;
    }

    public void setIsEUCountry(boolean IsEUCountry) {
        IsEUCountry = IsEUCountry;
    }

    public String getCallingCode() {
        return CallingCode;
    }

    public void setCallingCode(String callingCode) {
        CallingCode = callingCode;
    }

    public boolean getIsKycSupported() {
        return IsKycSupported;
    }

    public void setIsKycSupported(boolean IsKycSupported) {
        IsKycSupported = IsKycSupported;
    }

    public boolean getIsConnectbankSupported() {
        return IsConnectbankSupported;
    }

    public void setIsConnectbankSupported(boolean connectbankSupported) {
        IsConnectbankSupported = connectbankSupported;
    }

    public String getCurrencySymbol() {
        return CurrencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        CurrencySymbol = currencySymbol;
    }

    public String getICAOCode() {
        return ICAOCode;
    }

    public void setICAOCode(String ICAOCode) {
        this.ICAOCode = ICAOCode;
    }

    public String getCurrencyName() {
        return CurrencyName;
    }

    public void setCurrencyName(String currencyName) {
        CurrencyName = currencyName;
    }

    public String getCurrencyCode() {
        return CurrencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        CurrencyCode = currencyCode;
    }

    public String getRegionName() {
        return RegionName;
    }

    public void setRegionName(String regionName) {
        RegionName = regionName;
    }

    public int getRegion() {
        return Region;
    }

    public void setRegion(int region) {
        Region = region;
    }

    public String getLanguageName() {
        return LanguageName;
    }

    public void setLanguageName(String languageName) {
        LanguageName = languageName;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public boolean getISEEA() {
        return ISEEA;
    }

    public void setISEEA(boolean ISEEA) {
        this.ISEEA = ISEEA;
    }

    public boolean getIsSignUpCountry() {
        return IsSignUpCountry;
    }

    public void setIsSignUpCountry(boolean signUpCountry) {
        IsSignUpCountry = signUpCountry;
    }

    public String getISO3digitCode() {
        return ISO3digitCode;
    }

    public void setISO3digitCode(String ISO3digitCode) {
        this.ISO3digitCode = ISO3digitCode;
    }

    public boolean getIsSupportBeneficiary() {
        return IsSupportBeneficiary;
    }

    public void setIsSupportBeneficiary(boolean supportBeneficiary) {
        IsSupportBeneficiary = supportBeneficiary;
    }

    public int getOCRProviderTypePassportValue() {
        return OCRProviderTypePassportValue;
    }

    public void setOCRProviderTypePassportValue(int OCRProviderTypePassportValue) {
        this.OCRProviderTypePassportValue = OCRProviderTypePassportValue;
    }

    public int getOCRProviderTypeLicenseValue() {
        return OCRProviderTypeLicenseValue;
    }

    public void setOCRProviderTypeLicenseValue(int OCRProviderTypeLicenseValue) {
        this.OCRProviderTypeLicenseValue = OCRProviderTypeLicenseValue;
    }

    /*public boolean getIsValuesAdded() {
        return IsValuesAdded;
    }

    public void setIsValuesAdded(boolean valuesAdded) {
        IsValuesAdded = valuesAdded;
    }*/
}