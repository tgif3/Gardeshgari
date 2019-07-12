package com.example.gardeshgari;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.gardeshgari.Model.AttractionModel;
import com.example.gardeshgari.Model.ProvinceModel;
import com.example.gardeshgari.Model.PictureModel;
import com.example.gardeshgari.Model.SouvenirModel;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {
    private Context context;

    public DBHelper(Context context, String name) {
        super(context, name, null, 1);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS Attractions");
        db.execSQL("DROP TABLE IF EXISTS Provinces");
        db.execSQL("DROP TABLE IF EXISTS Souvenirs");

        db.execSQL("CREATE TABLE IF NOT EXISTS Attractions" +
                "(id INT NOT NULL PRIMARY KEY," +
                " title VARCHAR(63) NOT NULL," +
                " imageUrl TEXT NOT NULL," +
                " address VARCHAR(127) NOT NULL," +
                " type VARCHAR(127) NOT NULL," +
                " province VARCHAR(127) NOT NULL," +
                " description TEXT NOT NULL);");

        db.execSQL("CREATE TABLE IF NOT EXISTS Provinces" +
                "(name VARCHAR(127) NOT NULL PRIMARY KEY," +
                " imageUrl TEXT NOT NULL)");

        db.execSQL("CREATE TABLE IF NOT EXISTS Souvenirs" +
                "(name VARCHAR(127) NOT NULL PRIMARY KEY," +
                " imageUrl TEXT NOT NULL," +
                " province VARCHAR(127) NOT NULL," +
                " description TEXT NOT NULL)");

        db.execSQL("CREATE TABLE IF NOT EXISTS Pictures" +
                "(id INT NOT NULL PRIMARY KEY," +
                " imageUrl TEXT NOT NULL," +
                " attractionId INT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Attractions");
        db.execSQL("DROP TABLE IF EXISTS Provinces");
        db.execSQL("DROP TABLE IF EXISTS Souvenirs");
        db.execSQL("DROP TABLE IF EXISTS Pictures");
        onCreate(db);
    }

    public void insertAttraction(AttractionModel attractionModel) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", attractionModel.getId());
        contentValues.put("title", attractionModel.getTitle());
        contentValues.put("imageUrl", attractionModel.getImageUrl());
        contentValues.put("address", attractionModel.getAddress());
        contentValues.put("type", attractionModel.getType());
        contentValues.put("province", attractionModel.getProvince());
        contentValues.put("description", attractionModel.getDescription());
        db.insert("Attractions", null, contentValues);
    }

    public void insertProvince(ProvinceModel provinceModel) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", provinceModel.getName());
        contentValues.put("imageUrl", provinceModel.getImageUrl());
        db.insert("Provinces", null, contentValues);
    }

    public void insertSouvenir(SouvenirModel souvenirModel) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", souvenirModel.getName());
        contentValues.put("imageUrl", souvenirModel.getImageUrl());
        contentValues.put("province", souvenirModel.getProvince());
        contentValues.put("description", souvenirModel.getDescription());
        db.insert("Souvenirs", null, contentValues);
    }

    public void insertPicture(PictureModel pictureModel) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", pictureModel.getId());
        contentValues.put("imageUrl", pictureModel.getImageUrl());
        contentValues.put("attractionId", pictureModel.getAttractionId());
        db.insert("Pictures", null, contentValues);
    }

    public ArrayList<AttractionModel> getAllAttractions() {
        ArrayList<AttractionModel> arrayList = new ArrayList<>();

        SQLiteDatabase db = this.getReadableDatabase();
        @SuppressLint("Recycle") Cursor res = db.rawQuery("select * from Attractions;", null);
        res.moveToFirst();

        while (!res.isAfterLast()) {
            AttractionModel attractionModel = new AttractionModel.Builder()
                    .withId(res.getString(res.getColumnIndex("id")))
                    .withTitle(res.getString(res.getColumnIndex("title")))
                    .withImageUrl(res.getString(res.getColumnIndex("imageUrl")))
                    .withAddress(res.getString(res.getColumnIndex("address")))
                    .withProvince(res.getString(res.getColumnIndex("province")))
                    .withType(res.getString(res.getColumnIndex("type")))
                    .withDescription(res.getString(res.getColumnIndex("description")))
                    .build();
            arrayList.add(attractionModel);
            res.moveToNext();
        }

        return arrayList;
    }

    public ArrayList<AttractionModel> getAttractionsByProvince(String province) {
        ArrayList<AttractionModel> arrayList = new ArrayList<>();

        SQLiteDatabase db = this.getReadableDatabase();
        @SuppressLint("Recycle") Cursor res = db.rawQuery("select * from Attractions where province = \'" + province + "\';", null);
        res.moveToFirst();

        while (!res.isAfterLast()) {
            AttractionModel attractionModel = new AttractionModel.Builder()
                    .withId(res.getString(res.getColumnIndex("id")))
                    .withTitle(res.getString(res.getColumnIndex("title")))
                    .withImageUrl(res.getString(res.getColumnIndex("imageUrl")))
                    .withAddress(res.getString(res.getColumnIndex("address")))
                    .withProvince(res.getString(res.getColumnIndex("province")))
                    .withType(res.getString(res.getColumnIndex("type")))
                    .withDescription(res.getString(res.getColumnIndex("description")))
                    .build();
            arrayList.add(attractionModel);
            res.moveToNext();
        }

        return arrayList;
    }

    public ArrayList<AttractionModel> getAttractionsByType(String type) {
        ArrayList<AttractionModel> arrayList = new ArrayList<>();

        SQLiteDatabase db = this.getReadableDatabase();
        @SuppressLint("Recycle") Cursor res = db.rawQuery("select * from Attractions where type = \'" + type + "\' LIMIT 10;", null);
        res.moveToFirst();

        while (!res.isAfterLast()) {
            AttractionModel attractionModel = new AttractionModel.Builder()
                    .withId(res.getString(res.getColumnIndex("id")))
                    .withTitle(res.getString(res.getColumnIndex("title")))
                    .withImageUrl(res.getString(res.getColumnIndex("imageUrl")))
                    .withAddress(res.getString(res.getColumnIndex("address")))
                    .withProvince(res.getString(res.getColumnIndex("province")))
                    .withType(res.getString(res.getColumnIndex("type")))
                    .withDescription(res.getString(res.getColumnIndex("description")))
                    .build();
            arrayList.add(attractionModel);
            res.moveToNext();
        }

        return arrayList;
    }

    public ArrayList<SouvenirModel> getSouvenirByProvince(String province) {
        ArrayList<SouvenirModel> arrayList = new ArrayList<>();

        SQLiteDatabase db = this.getReadableDatabase();
        @SuppressLint("Recycle") Cursor res = db.rawQuery("select * from Souvenirs where province = \'" + province + "\';", null);
        res.moveToFirst();

        while (!res.isAfterLast()) {
            SouvenirModel souvenirModel = new SouvenirModel.Builder()
                    .withName(res.getString(res.getColumnIndex("name")))
                    .withImageUrl(res.getString(res.getColumnIndex("imageUrl")))
                    .withProvince(res.getString(res.getColumnIndex("province")))
                    .withDescription(res.getString(res.getColumnIndex("description")))
                    .build();
            arrayList.add(souvenirModel);
            res.moveToNext();
        }

        return arrayList;
    }

    public ArrayList<ProvinceModel> getAllProvinces() {
        ArrayList<ProvinceModel> arrayList = new ArrayList<>();

        SQLiteDatabase db = this.getReadableDatabase();
        @SuppressLint("Recycle") Cursor res = db.rawQuery("select * from Provinces;", null);
        res.moveToFirst();

        while (!res.isAfterLast()) {
            ProvinceModel provinceModel = new ProvinceModel.Builder()
                    .withName(res.getString(res.getColumnIndex("name")))
                    .withImageUrl(res.getString(res.getColumnIndex("imageUrl")))
                    .build();
            arrayList.add(provinceModel);
            res.moveToNext();
        }

        return arrayList;
    }

    public ArrayList<PictureModel> getAllPicturesByAttractionId(String attractionId) {
        ArrayList<PictureModel> arrayList = new ArrayList<>();

        SQLiteDatabase db = this.getReadableDatabase();
        @SuppressLint("Recycle") Cursor res = db.rawQuery("select * from Pictures where attractionId = \'" + attractionId + "\';", null);
        res.moveToFirst();

        while (!res.isAfterLast()) {
            PictureModel pictureModel = new PictureModel.Builder()
                    .withId(res.getString(res.getColumnIndex("id")))
                    .withImageUrl(res.getString(res.getColumnIndex("imageUrl")))
                    .withAttractionId(res.getString(res.getColumnIndex("attractionId")))
                    .build();
            arrayList.add(pictureModel);
            res.moveToNext();
        }

        return arrayList;
    }
}
