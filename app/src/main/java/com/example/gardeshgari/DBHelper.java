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

    public void readAttractions() {
        AttractionModel attractionModel = new AttractionModel.Builder()
                .withId("1")
                .withTitle("روستای زرین دشت")
                .withImageUrl("https://cdnw.elicdn.com/Blog/wp-content/uploads/2019/02/%D8%B1%D9%88%D8%B3%D8%AA%D8%A7%DB%8C-%D8%B2%D8%B1%DB%8C%D9%86-%D8%AF%D8%B4%D8%AA.jpg")
                .withAddress("۴۰ کیلومتری جنوب فیروزکوه و ۱۲۰ کیلومتری تهران")
                .withProvince("تهران")
                .withType("")
                .withDescription("تقریبا در ۴۰ کیلومتری جنوب فیروزکوه و ۱۲۰ کیلومتری تهران یکی از خوش آب و هواترین روستاهای تهران که جز جاذبه های تهران محسوب می شود روستای زرین دشت است. این روستا از لحاظ گردشگری بسیار جالب است و توریست های زیادی را به سمت خود جذب کرده است. یکی از زیبایی های این روستا رودخانه حبله رود است که جاذبه خاصی دارد و دیگر جاذبه ها چشمه های آب معدنی مانند خمده و دریابک است، که این آب ها خواص درمانی بسیار موثری نیز هم دارند. این روستا در فصل بهار و تابستان میوه های خوش آب و رنگی به وفور دیده می شود و هر گردشگری را بر سر شوق می آورد. ایامی را به دور از دغدغه های شهر در کوچه باغ های سبز آن قدم بزنید و از هوای پاک این روستا لذت ببرید.")
                .build();
        insertAttraction(attractionModel);
    }

    public void readProvinces() {
        ProvinceModel provinceModel = new ProvinceModel.Builder()
                .withName("آذربایجان شرقی")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Tabriz_City_Hall.jpg/225px-Tabriz_City_Hall.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("آذربایجان غربی")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Seh_gonbad.jpg/225px-Seh_gonbad.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("اردبیل")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/b/b6/Sheikh-safi.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("اصفهان")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/Naghsh-e-jahan_masjed-e-shah_esfahan.jpg/225px-Naghsh-e-jahan_masjed-e-shah_esfahan.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("البرز")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Karaj_taleghani.jpg/225px-Karaj_taleghani.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("ایلام")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/Felahati.jpg/225px-Felahati.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("بوشهر")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Busher1973.jpg/225px-Busher1973.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("تهران")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/fa/thumb/5/54/Tehran-Milad_Tower2.jpg/225px-Tehran-Milad_Tower2.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("چهارمحال و بختیاری")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Shahrekord_3693036.jpg/225px-Shahrekord_3693036.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("خراسان جنوبی")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Aerial_view_of_Birjand_City.jpg/225px-Aerial_view_of_Birjand_City.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("خراسان رضوی")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/fa/thumb/1/1a/ImamReza%28A%29.jpg/225px-ImamReza%28A%29.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("خراسان شمالی")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/Besghardash.jpg/225px-Besghardash.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("خوزستان")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f4/Ahvaz_Bridge.jpg/225px-Ahvaz_Bridge.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("زنجان")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/f/f9/Soltaniyeh_exterior.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("سمنان")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/Arg-semnan.jpg/225px-Arg-semnan.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("سیستان و بلوچستان")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ee/University_of_Sistan_and_Baluchestan.JPG/225px-University_of_Sistan_and_Baluchestan.JPG")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("فارس")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Hafzie6.JPG/225px-Hafzie6.JPG")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("قزوین")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6a/Qazvin_-_Chehel_Sotun.jpg/225px-Qazvin_-_Chehel_Sotun.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("قم")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/Qom_masjed-e-hazrat-masumeh.jpg/225px-Qom_masjed-e-hazrat-masumeh.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("کردستان")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/fa/thumb/2/2d/Abidar-sanandaj.jpg/225px-Abidar-sanandaj.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("کرمان")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Shazdeh_Garden_Mahan_Iran.jpg/225px-Shazdeh_Garden_Mahan_Iran.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("کرمانشاه")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Taghe_bprovince.jpg/225px-Taghe_bprovince.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("کهگیلویه و بویراحمد")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/3/33/Panoramo_de_Yasuj_%28Jasu%C4%9D%29.jpg/225px-Panoramo_de_Yasuj_%28Jasu%C4%9D%29.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("گلستان")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/6/62/Naharkhoran2.JPG/1200px-Naharkhoran2.JPG")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("گیلان")
                .withImageUrl("https://tripyar.com/uploads/picture/1969/3.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("مازندران")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/Sari%2C_Saat_sq_%28Night%29.jpg/225px-Sari%2C_Saat_sq_%28Night%29.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("مرکزی")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/National_Garden_Square_-_Arak_-_1963.jpg/225px-National_Garden_Square_-_Arak_-_1963.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("هرمزگان")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Bandarabbas-sahel-2.jpg/225px-Bandarabbas-sahel-2.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("همدان")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Mausol%C3%A9e_Baba_Taher_Hamedan.jpg/225px-Mausol%C3%A9e_Baba_Taher_Hamedan.jpg")
                .build();
        insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("یزد")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Amir_Chakmak_mosque.jpg/225px-Amir_Chakmak_mosque.jpg")
                .build();
        insertProvince(provinceModel);
    }

    public void readSouvenirs() {
        SouvenirModel souvenirModel = new SouvenirModel.Builder()
                .withName("کیک یزدی")
                .withImageUrl("https://setare.com/files/fa/news/1396/8/27/102566_537.jpg")
                .withProvince("یزد")
                .withDescription("کیک یزدی یکی از معروف\u200Cترین خوراکی\u200Cهای مختص استان است که البته امروزه در ویترین بیشتر شیرینی فروشی\u200Cهای کشور یافت می\u200Cشود، اما اگر می\u200Cخواهید نوع اصل آن را میل کنید حتماً باید به یزد سفر کنید. این کیک از ترکیب آرد، روغن مایع، شکر، گلاب ، پودر هل و تخم\u200Cمرغ تهیه می\u200Cشود.\n")
                .build();
        insertSouvenir(souvenirModel);
    }


    public void readPictures() {
        PictureModel pictureModel = new PictureModel.Builder()
                .withId("1")
                .withImageUrl("https://cdnw.elicdn.com/Blog/wp-content/uploads/2019/02/%D8%B1%D9%88%D8%B3%D8%AA%D8%A7%DB%8C-%D8%B2%D8%B1%DB%8C%D9%86-%D8%AF%D8%B4%D8%AA.jpg")
                .withAttractionId("1")
                .build();
        insertPicture(pictureModel);

        pictureModel = new PictureModel.Builder()
                .withId("2")
                .withImageUrl("https://cdn.yjc.ir/files/fa/news/1397/4/20/8302643_391.jpg")
                .withAttractionId("1")
                .build();
        insertPicture(pictureModel);

        pictureModel = new PictureModel.Builder()
                .withId("3")
                .withImageUrl("https://cdn.yjc.ir/files/fa/news/1397/4/20/8302642_742.jpg")
                .withAttractionId("1")
                .build();
        insertPicture(pictureModel);

        pictureModel = new PictureModel.Builder()
                .withId("4")
                .withImageUrl("https://cdn.yjc.ir/files/fa/news/1397/4/20/8302641_797.jpg")
                .withAttractionId("1")
                .build();
        insertPicture(pictureModel);
    }
}
