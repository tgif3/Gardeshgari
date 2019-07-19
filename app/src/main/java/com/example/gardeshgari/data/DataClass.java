package com.example.gardeshgari.data;

import com.example.gardeshgari.model.AttractionModel;
import com.example.gardeshgari.model.AttractionType;
import com.example.gardeshgari.model.PictureModel;
import com.example.gardeshgari.model.ProvinceModel;
import com.example.gardeshgari.model.SouvenirModel;

public class DataClass {
    
    private DBHelper dbHelper;
    private AttractionModel attractionModel;
    private SouvenirModel souvenirModel;
    private ProvinceModel provinceModel;

    private static DataClass INSTANCE = null;

    public static DataClass getInstance(DBHelper dbHelper) {
        if(INSTANCE == null) {
            INSTANCE = new DataClass(dbHelper);
        }
        return INSTANCE;
    }

    public static DataClass getInstance() {
        return INSTANCE;
    }
    
    private DataClass(DBHelper dbHelper) {
        this.dbHelper = dbHelper;
    }

    public DBHelper getDbHelper() {
        return dbHelper;
    }

    public void initialize() {
        insertNaturalAttractions();
        insertCoastAttractions();
        insertPictures();
        insertProvinces();
        insertSouvenirs();
        insertHealthAttraction();
        insertHistoricalAttraction();
        insertMuseumAttraction();
        insertShoppingAttraction();
        insertAmusementPark();
    }

    private void insertNaturalAttractions() {
        AttractionModel attractionModel;

        attractionModel = new AttractionModel.Builder()
                .withId("1")
                .withTitle("دشت لوت")
                .withImageUrl("https://cdnw.elicdn.com/Blog/wp-content/uploads/2018/09/lout.jpg")
                .withAddress("جنوب شرق کشور")
                .withProvince("")
                .withType(AttractionType.natural.toString())
                .withDescription("کویر لوت یا دشت لوت از زیباترین مناطق طبیعی ایران است که در جنوب شرق کشور قرار دارد. تنها جاذبه ی طبیعی میراث جهانی یونسکو در ایران دشت لوت می باشد. جالب است بدانید که این منطقه یکی از گرم ترین نقطه های زمین محسوب می گردد. بیابان لوت بیش از ۴۰ هزار کیلومتر مربع مساحت دارد و در میان استان های کرمان، سیستان و بلوچستان و خراسان جنوبی واقع است.")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("2")
                .withTitle("کویر ورزنه")
                .withImageUrl("https://cdnw.elicdn.com/Blog/wp-content/uploads/2018/09/varzane.jpg")
                .withAddress("١١٠ کیلومترى اصفهان")
                .withProvince("اصفهان")
                .withType(AttractionType.natural.toString())
                .withDescription("کویر ورزنه یا کویر خارا مکانی بکر و زیبا در فاصله ى ١١٠ کیلومترى اصفهان است. ورزنه از شهرهای مرکزی ایران و از توابع بن رود اصفهان می باشد. با قدم گذاشتن در این کویر بی انتها و تماشای عظمت آن می توانید پی ببرید که چرا کویر ورزنه یکی از زیباترین مناطق طبیعی ایران محسوب می شود. این کویر منطقه ای عالی برای تماشای ستارگان درخشان و لذت از هوای پاکیزه است.")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("3")
                .withTitle("دریاچه ارومیه")
                .withImageUrl("https://cdnw.elicdn.com/Blog/wp-content/uploads/2018/09/orumiye-lake.jpg")
                .withAddress("شمال غرب کشور")
                .withProvince("")
                .withType(AttractionType.natural.toString())
                .withDescription("بزرگترین دریاچه ی آب شور خاورمیانه در شمال غرب کشور عزیزمان ایران، بین استان های آذربایجان غربی و آذربایجان شرقی قرار گرفته است. این دریاچه همان دریاچه ی معروف ارومیه است که یکی از زیباترین جاذبه های طبیعی ایران و بزرگترین دریاچه ی ایران بشمار می رود.\n" +
                        "متاسفانه به علت گرم شدن کره ی زمین، کمبود بارش برف و باران، احداث بزرگراه روی دریاچه، استفاده ی بیش از اندازه از منابع آبی منطقه و عواملی از این قبیل، آب دریاچه ارومیه خشک شده است.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("4")
                .withTitle("آبشار مارگون سپیدان فارس")
                .withImageUrl("https://cdnw.elicdn.com/Blog/wp-content/uploads/2018/09/margoon-waterfall-sepidan.jpg")
                .withAddress("استان فارس")
                .withProvince("فارس")
                .withType(AttractionType.natural.toString())
                .withDescription("در استان فارس، شهرستان سپیدان، آبشاری به نام مارگون وجود دارد که یکی از بی نظیرترین جاذبه های طبیعی ایران محسوب می شود. چیزی که این آبشار را از سایر جاذبه های طبیعی ایران جدا ساخته، این است که آب آبشار مارگون از رودخانه جاری نمی شود. جالب است بدانید که داخل دیوار کوه چندین چشمه وجود دارد و آب این چشمه ها از منافذ صخره ای به بیرون جاری شده و آبشار زیبای مارگون را ایجاد کرده اند.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("5")
                .withTitle("تنگ دم اسب")
                .withImageUrl("https://cdnw.elicdn.com/Blog/wp-content/uploads/2018/09/tange-dom-asb.jpg")
                .withAddress("جنوب شیراز")
                .withProvince("فارس")
                .withType(AttractionType.natural.toString())
                .withDescription("در استان فارس، جنوب شیراز می توانید یکی دیگر از جاذبه های طبیعی ایران که کم تر شناخته شده است را بیابید. جاذبه ی طبیعی و زیبای تنگ دم اسب در منطقه کوهمره سرخی قرار دارد. وجود رودخانه، درختان بلوط و گیاهان سرسبز به همراه کوه ها، زیبایی این منطقه را دو چندان کرده است. برای رسیدن به این آبشار باید در دریاچه شنا کنید و یا اینکه از قایق های بادی استفاده نمایید.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("6")
                .withTitle("جاده ی خلخال و اسالم")
                .withImageUrl("https://cdnw.elicdn.com/Blog/wp-content/uploads/2018/09/khalkhal-asalem.jpg")
                .withAddress("استان گیلان و اردبیل")
                .withProvince("")
                .withType(AttractionType.natural.toString())
                .withDescription("جاده ای که استان گیلان و اردبیل را به هم مرتبط می سازد، جاده ی اسالم به خلخال است. این جاده ی پر پیچ و خم با درختان و مناظر سرسبز که اغلب پوشیده از مه هستند، همانند مسیری رویایی به سمت بهشت می باشد. اسالم بخشی از تالش محسوب می گردد و هوا در این منطقه معمولا خنک است. اگر مسیرتان به این سمت افتاد پیشنهاد می کنیم که حتما از این جاذبه های طبیعی ایران بازدید کنید و نهایت لذت را ببرید.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("7")
                .withTitle("روستای دیزان")
                .withImageUrl("https://cdnw.elicdn.com/Blog/wp-content/uploads/2018/09/TaleqanDizan.jpg")
                .withAddress("توابع شهرستان طالقان")
                .withProvince("البرز")
                .withType(AttractionType.natural.toString())
                .withDescription("روستای دیزان در دهستان جوستان، از زیباترین جاذبه های طبیعی ایران می باشد که کم تر شناخته شده است. این روستا در دامنه ی رشته مرکزی البرز واقع گردیده و از توابع شهرستان طالقان محسوب می گردد. زیبایی های طبیعی این منطقه به همراه آب و هوایی دلپذیر، دیزان را به محلی عالی برای سپری کردن لحظاتی آرامش بخش بدل ساخته است.")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("8")
                .withTitle("دریاچه شط تمی")
                .withImageUrl("https://cdnw.elicdn.com/Blog/wp-content/uploads/2018/09/tami-lake-khuzestan.jpg")
                .withAddress("شمال خوزستان")
                .withProvince("خوزستان")
                .withType(AttractionType.natural.toString())
                .withDescription("یکی از بزرگترین دریاچه های ایران که مقر آن در منطقه ای کوهستانی در شمال خوزستان است، دریاچه ی شط تمی نام دارد. این دریاچه از زیباترین جاذبه های طبیعی ایران بشمار می رود و محلی عالی برای عکاسی و طبیعت\u200Cگردی می باشد. کوه های سر به فلک کشیده در اطراف شط تمی، چمن زارها و پوشش های گیاهی منحصر به فردی که دارد بر زیبایی بکر این منطقه افزوده است.")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("9")
                .withTitle("چشمه‌های باداب سورت")
                .withImageUrl("https://cdnw.elicdn.com/Blog/wp-content/uploads/2018/09/badab-surt.jpg")
                .withAddress("چهاردانگه")
                .withProvince("مازندران")
                .withType(AttractionType.natural.toString())
                .withDescription("چشمه های باداب سورت دومین اثر ملی طبیعی ایران، در شهرستان ساری، بخش چهاردانگه قرار دارد. چشمه های پلکانی آب شور باداب سورت به رنگ های مختلف از قبیل قرمز، نارنجی، زرد و آبی هستند. یکی از نکته های جالب در مورد باداب سورت این است که به خاطر دارا بودن ساختار زمین شناسی پیچیده هیچ وقت دچار خشکسالی نمی شوند.\n" +
                        "استخرهای رنگی پلکانی باعث منحصر به فرد شدن و تبدیل این مکان به جاذبه ی گردشگری شده است. در سال های اخیر گردشگران زیادی برای بازدید از باداب سورت به این منطقه سفر کرده اند. ارتفاعات اطراف این چشمه ها پوشیده از گیاهان و درختان متنوع از جمله درختانی با برگ های سوزنی و درختچه های زرشک وحشی است. همچنین می توانید در باداب سورت که از زیباترین مناطق طبیعی ایران است، عکس هایی خاص بیندازید.")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("10")
                .withTitle("دشت کالپوش")
                .withImageUrl("https://cdnw.elicdn.com/Blog/wp-content/uploads/2018/09/Dashte-Kalpoosh.jpg")
                .withAddress("شاهرود")
                .withProvince("سمنان")
                .withType(AttractionType.natural.toString())
                .withDescription("در سفر به استان سمنان، شهرستان شاهرود، می توانید به یکی دیگر از جاذبه های طبیعی ایران سر بزنید. از معروف ترین دیدنی های کالپوش دشت شقایق های سرخ است. این دشت تقریبا در فاصله ی ۱۴۰ کیلومتری شمال شهر میامی قرار دارد. دشت شقایق ها در نزدیکی پناهگاه حیات وحش و پارک ملی گلستان قرار دارد، به همین دلیل امکانات گردشگری مناسبی در آنجا فراهم می باشد.\n" +
                        "بهترین زمان بازدید از شقایق های سرخ کالپوش در فصل بهار، اواسط اردیبهشت تا اواسط خرداد ماه است. از دیگر جاذبه های طبیعی کالپوش می توان به آبشارها، چشمه ها و مناطق جنگلی آن اشاره کرد.")
                .build();
        dbHelper.insertAttraction(attractionModel);
    }

    private void insertCoastAttractions() {
        AttractionModel attractionModel;
        attractionModel = new AttractionModel.Builder()
                .withId("11")
                .withTitle("دهکده ساحلی رامسر")
                .withImageUrl("https://images.kojaro.com/2019/2/bfcae36d-ecda-4319-b66f-db13132eea59.JPG")
                .withAddress("رامسر")
                .withProvince("مازندران")
                .withType(AttractionType.coast.toString())
                .withDescription("دهکده ساحلی رامسر که در استان مازندران قرار دارد، به\u200Cعنوان دهکده صنایع دستی کشور نیز شناخته می\u200Cشود.این ساحل علاوه بر داشتن رستوران و فروشگاه\u200Cهای صنایع دستی مختلف، دارای موزه مردم شناسی نیز است.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("12")
                .withTitle("ساحل گیسوم")
                .withImageUrl("https://images.kojaro.com/2019/3/0c790118-2724-4f7d-a5f3-06a5e8ac45f2.jpg")
                .withAddress("گیلان")
                .withProvince("گیلان")
                .withType(AttractionType.coast.toString())
                .withDescription("ساحل گیسوم که در استان گیلان قرار دارد، از جمله سواحل منحصربه\u200Cفرد ایران است که در امتداد جنگل\u200Cهای انبوه این استان قرار دارد. بدون شک، گذر از جاده\u200Cای جنگلی و دستیابی به ساحل، تجربه\u200Cای فراموش\u200Cنشدنی برای گردشگران خواهد بود. ساحل گیسوم علاوه بر امکان رانندگی در جاده\u200Cای رویایی، امکانات دیگری مانند پیاده روی و دوچرخه سواری، تفریحات آبی و ساحلی (شنا، جت اسکی، شاتل، پاراگلایدر، قایق سواری، پاراسل، موتور چهار چرخ) آفرود، ترامبولین و پارک بادی نیز دارد.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("13")
                .withTitle("اسکله ساحلی بندر انزلی")
                .withImageUrl("https://images.kojaro.com/2019/3/73bcb5e8-0ecc-4b59-b033-a76768ef1642.jpg")
                .withAddress("بندر انزلی")
                .withProvince("گیلان")
                .withType(AttractionType.coast.toString())
                .withDescription("اسکله ساحلی بندر انزلی که در استان گیلان قرار دارد، اولین پارک ساحلی به سبک اروپایی در ایران است که با داشتن چشم\u200Cاندازی به تاسیسات بندری، دریای خزر و ورودی تالاب بین\u200Cالمللی انزلی، گردشگران بسیاری را به خود جذب می\u200Cکند.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("14")
                .withTitle("ساحل صدف آستارا")
                .withImageUrl("https://images.kojaro.com/2019/3/55b254a4-6ed4-40c3-8559-506b388f7b25.JPG")
                .withAddress("هفت کیلومتری جنوب آستارا")
                .withProvince("گیلان")
                .withType(AttractionType.coast.toString())
                .withDescription("ساحل آستارا که در هفت کیلومتری جنوب آستارا و در مسیر راه آستارا - تالش در استان گیلان قرار دارد، از جمله بهترین مناطق گردشگری شمال کشور است که آلاچیق، استراحتگاه سنتی، بوفه، فروشگاه و دوش آب شیرین جهت استحمام شناگران دارد.")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("15")
                .withTitle("ساحل چمخاله")
                .withImageUrl("https://www.alaedin.travel//Files/Jazebe/chamkhaleh/chamkhaleh-seaside/Alaedin-Travel-Agency-Attraction-Seaside-Chamkhaleh-6.jpg")
                .withAddress("گیلان")
                .withProvince("گیلان")
                .withType(AttractionType.coast.toString())
                .withDescription("ساحل چمخاله که جایزه بهترین ساحل استان گیلان را به خود اختصاص داده است، بعد از ساحل انزلی، دومین ساحل پر طرفدار این استان محسوب می\u200Cشود. این ساحل ماسه\u200Cای با شیب ملایم، دارای پلاژ، سوارکاری، قایق\u200Cسواری و آلاچیق است.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("16")
                .withTitle("ساحل مرجان کیش")
                .withImageUrl("https://images.kojaro.com/2019/3/4dc0dc52-1448-4091-abdf-16f5244c4fb2.jpg")
                .withAddress("جزیره کیش")
                .withProvince("")
                .withType(AttractionType.coast.toString())
                .withDescription("ساحل مرجان یا پارک ساحلی مرجان، یکی از محبوب\u200Cترین سواحل در جزیره کیش است که فضای سبز وسیع، آلاچیق، باربیکیو و تفریحاتی مانند پیست دوچرخه سواری، غواصی، قایق\u200C سواری، کایت سواری، جت اسکی، بنانا سواری، پاراسل، فلای\u200Cبرد و شاتل از جمله امکانات آن محسوب می\u200Cشوند. این ساحل همچنین دارای اسکله\u200Cای کوچک اما دیدنی و زیبا است. از جمله امکانات و تفریحات دریایی ساحل مرجان می\u200Cتوان به کلوپ تفریحی دریایی اسکوبا اشاره کرد.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("17")
                .withTitle("ساحل کشتی یونانی کیش")
                .withImageUrl("https://images.kojaro.com/2019/3/d00cfa0d-f722-407a-b4e4-a9b594bad754.jpg")
                .withAddress("جزیره کیش")
                .withProvince("")
                .withType(AttractionType.coast.toString())
                .withDescription("کشتی یونانی که یکی از مهم\u200Cترین جاهای دیدنی کیش و نماد این جزیره محسوب می\u200Cشود، در غرب جزیره قرار دارد و در تابستان سال ۱۳۴۵ به گل نشسته است. هرچند این کشتی تاکنون بسیار تخریب شده و بخش انتهایی آن در آب فرو رفته است؛ اما گردشگران بسیاری به عکس گرفتن در کنار این جاذبه و بازدید از آن در هنگام غروب آفتاب علاقه دارند. در کنار این جاذبه امکاناتی چون آمفی تئاتر، کافه تریا، غرفه\u200Cهای فروش تنقلات، رستوران ایرانی و لبنانی، ایستگاه کرایه اسکیت، دوچرخه و فروش محصولات ورزشی نیز قرار دارد")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("18")
                .withTitle("پارک ساحلی نیلوفر کیش")
                .withImageUrl("https://images.kojaro.com/2019/3/f9dfbb9e-ee79-4212-b3ad-313e8c96ae33.jpg")
                .withAddress("جزیره کیش")
                .withProvince("")
                .withType(AttractionType.coast.toString())
                .withDescription("آکواریوم و باغ پرندگان کیش که در نزدیکی پارک ساحلی نیلوفر قرار دارد، دارای بیش از ۵۷ گونه پرنده است که از اقصی نقاط جهان از جمله آمریکای جنوبی، استرالیا، شرق آسیا و آفریقا جمع\u200Cآوری شده\u200Cاند. آکواریوم این مجموعه نیز دارای بیش از ۷۰ نوع ماهی کمیاب و نایاب تزئینی است. در این پارک علاوه بر این، مجموعه تفریحی پارک دلفین نیز قرار دارد. حیوانات این مجموعه شامل شیر دریایی شمالی، شیر دریایی جنوبی، گربه دریایی شمالی، گراز دریایی، پنگوئن و دلفین است که توسط مربیان ایرانی هنرنمایی می\u200Cکنند.")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("19")
                .withTitle("بوستان ساحلی زیتون قشم")
                .withImageUrl("https://images.kojaro.com/2019/3/99421439-f681-4465-ba34-33635c508b09.jpg")
                .withAddress("جزیره‌ی قشم")
                .withProvince("")
                .withType(AttractionType.coast.toString())
                .withDescription("بوستان ساحلی زیتون قشم که یکی از جاهای دیدنی قشم به\u200Cشمار می\u200Cرود دارای آلاچیق، امکانات تفریحی، فرهنگی و ورزشی، سینمای چهار بعدی،\u200C زمین اسکیت، مسیرهای دوچرخه سواری، زمین فوتبال، قهوه\u200Cخانه و کافی شاپ است. از جمله کمپ\u200Cهای تفریحی این ساحل می\u200Cتوان به کمپ تفریحات دریایی ایران زمین اشاره کرد.")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("20")
                .withTitle("پلاژ\u200C ساحلی لیپار")
                .withImageUrl("https://images.kojaro.com/2019/3/840e2cfa-a589-49f8-9627-b06bc82bb694.jpg")
                .withAddress("چابهار")
                .withProvince("سیستان و بلوچستان")
                .withType(AttractionType.coast.toString())
                .withDescription("پلاژ ساحلی لیپار، یکی از سواحل لوکس و شیک چابهار است که در کنار هتل لیپار و دریای مکران قرار دارد. این پلاژ دارای ساحلی سنگی و پلکانی، کافی شاپ و سفره\u200Cخانه\u200Cهایی برای رفاه گردشگران است.")
                .build();
        dbHelper.insertAttraction(attractionModel);
    }

    private void insertHealthAttraction() {
        AttractionModel attractionModel;
        attractionModel = new AttractionModel.Builder()
                .withId("21")
                .withTitle("آب گرم فردوس")
                .withImageUrl("https://khorshidjahan.ir/wp-content/uploads/2017/10/%D8%AE%D8%B1%D8%A7%D8%B3%D8%A7%D9%86.jpg")
                .withAddress("۲۰ کیلومتری شمال شهر فردوس")
                .withProvince("خراسان جنوبی")
                .withType(AttractionType.health.toString())
                .withDescription("پیشینه استفاده از این آب گرم به ۲۰۰ سال پیش بازمی\u00ADگردد. آب این چشمه معدنی از نوع کلروره و بی\u00ADکربناته و دارای آهن است. آب این چشمه در درمان بیماری\u00ADهای روماتیسمی، دردهای عصبی و مفصلی و اتصاع عروق مفید است. بناهای متعددی در این دوره برای استفاده از آب گرم ساخته شده است. در حال حاضر این آبگرم معدنی دارای تاسیسات و امکاناتی از قبیل حمام\u00ADهای جداگانه مردانه و زنانه با وان\u00ADهای خصوصی، سوئیت\u00ADهای اقامتی، رستوران، زمین بازی کودکان و پارکینگ است. بدلیل موقعیت این آبگرم در جاده ترانزیتی، علاقمندان زیادی به این مکان مراجعه می\u00ADکنند و از مناطق توریستی استان به شمار می\u00ADرود.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("22")
                .withTitle("چشمه \u00ADهای آبگرم دهلران")
                .withImageUrl("https://khorshidjahan.ir/wp-content/uploads/2017/10/%D8%A7%DB%8C%D9%84%D8%A7%D9%85.jpg")
                .withAddress("سه کیلومتری شهر دهلران")
                .withProvince("ایلام")
                .withType(AttractionType.health.toString())
                .withDescription("دمای آب آن در حدود ۵۰ درجه سانتی\u00ADگراد و در گروه آب\u00ADهای خیلی گرم قرار دارد. از نظر شیمیایی این آبگرم از نوع گوگردی و دارای خواص درمانی برای امراض پوستی و دردهای مفاصل و عضلانی است. تاسیسات آبدرمانی محدود بوده اما استخرهای لجن درمانی در کنار آن وجود دارند. آب چشمه\u00ADها پس از سرد شدن در پایین دست در زمین\u00ADهای کشاورزی مورد استفاده قرار می\u00ADگیرد. از دیگر جاذبه\u00ADهای نزدیک به آن چشمه\u00ADهای قیر دهلران است. از این چشمه\u200Cها قیر به صورت روان همراه با آب از زمین می\u200Cجوشد و اطراف این چشمه\u200Cها انباشته از قیر است. غار خفاش نیز در نزدیکی آبگرم دهلران قرار دارد.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("23")
                .withTitle("آبگرم معدنی لاویج")
                .withImageUrl("https://khorshidjahan.ir/wp-content/uploads/2017/10/%DB%B3-768x549.jpg")
                .withAddress("کیلومتر 3 چمستان")
                .withProvince("مازندران")
                .withType(AttractionType.health.toString())
                .withDescription("در این منطقه ۵ آبگرم در روستاهای این محدوده قرار داشته که با گرمای طبیعی، مقدار زیاد املاح گوناگون شامل فسفر، پتاسیم، کلسیم و منیزیم را داراست و به دلیل خواص بالای درمانی برای دردهای استخوان، مفاصل، رماتیسم و بیماریهای پوستی بسیار مفید است. مهمترین خواص این آبگرم تاثیر آنها در بیماری یرقان است که آنرا از این حیث در ایران بینظیر کرده است. از ویژگی\u00ADهای خاص این منطقه، جنگل\u00ADهای زیبای شمال ایران است که به همین دلیل علاقمندان بسیاری را به خود جلب کرده است. در این روستا تاسیسات و امکانات برای آبدرمانی شامل سوئیت\u00ADهای اقامتی، استخرهای مجزای زنانه و مردانه و دوش\u00ADهای آبگرم وجود دارند.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("24")
                .withTitle("آبگرم گنو")
                .withImageUrl("https://khorshidjahan.ir/wp-content/uploads/2017/10/4-5-279x300.jpg")
                .withAddress("۳۴ کیلومتری شمال شرقی شهر بندرعباس")
                .withProvince("هرمزگان")
                .withType(AttractionType.health.toString())
                .withDescription("آب این چشمه از آب\u00ADهای خیلی گرم گوگردی با دمای ۴۵ درجه سانتی\u00ADگراد است. با احداث تاسیسات لازم شرایط مناسبی برای بهره بردن از خواص درمانی چشمه آب گرم و گذران اوقات فراغت فراهم آمده است. این مجموعه شامل دو استخر بزرگ زنانه و مردانه و جکوزی است. یک مجموعه اقامتی ۲۳ اتاقه نیز در کنار آن در برای اقامت مسافران در ساخته شده است. امکانات تفریحی مانند سازی آلاچیق، رستوران سنتی و پارک شادی برای گذران بهتر اوقات فراغت دیده شده است. محوطهٔ اطراف چشمه پر از درختان نخل زیبا و سبز است.")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("25")
                .withTitle("آبگرم محلات")
                .withImageUrl("https://khorshidjahan.ir/wp-content/uploads/2017/10/5-4.jpg")
                .withAddress(" کیلومتری شمال شرق شهر محلات")
                .withProvince("مرکزی")
                .withType(AttractionType.health.toString())
                .withDescription("این چشمه \u00ADها دارای درجه حرارت حداقل ۵۰ درجه سانتی\u00ADگراد بوده و در دسته آب\u00ADهای خیلی گرم قرار می\u00ADگیرند. از نظر شیمیایی آب این چشمه\u00AD ها از ترکیب آب\u200Cهای سولفاته کلسیک است و در درمان بیماری\u200Cهای نقرس و هم\u200Cچنین بیماری\u200Cهای کبدی،صفراوی، کلیوی و دستگاه گوارش مؤثر است. این منطقه دارای تاسیسات آب درمانی بوده و بعد از سرعین از این نظر از اهمیت بالایی برخوردار است. مجتمع آب درمانی دارای استخر، وان\u00ADهای شستشو، رستوران، کافی شاپ و اقامتگاه برای گردشگران می\u00ADباشد.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("26")
                .withTitle("آبگرم میراحمد")
                .withImageUrl("https://khorshidjahan.ir/wp-content/uploads/2017/10/6-5.jpg")
                .withAddress("در نزدیکی بندر بوشهر")
                .withProvince("بوشهر")
                .withType(AttractionType.health.toString())
                .withDescription("این چشمه\u00AD ها دارای درجه حرارت حداقل ۵۰ درجه سانتی\u00ADگراد بوده و در دسته آب\u00ADهای خیلی گرم قرار می\u00ADگیرند. از نظر شیمیایی آب این چشمه \u00ADها از ترکیب آب\u200Cهای سولفاته کلسیک است و در درمان بیماری\u200Cهای نقرس و هم\u200Cچنین بیماری\u200Cهای کبدی،صفراوی، کلیوی و دستگاه گوارش مؤثر است. این منطقه دارای تاسیسات آب درمانی بوده و بعد از سرعین از این نظر از اهمیت بالایی برخوردار است. مجتمع آب درمانی دارای استخر، وان\u00ADهای شستشو، رستوران، کافی شاپ و اقامتگاه برای گردشگران می\u00ADباشد.")
                .build();
        dbHelper.insertAttraction(attractionModel);
    }

    private void insertHistoricalAttraction() {
        AttractionModel attractionModel;
        attractionModel = new AttractionModel.Builder()
                .withId("27")
                .withTitle("مسجد امام")
                .withImageUrl("https://cdnw.elicdn.com/Blog/wp-content/uploads/2018/09/imam-mosque-isfahan.jpg")
                .withAddress("اصفهان")
                .withProvince("اصفهان")
                .withType(AttractionType.historical.toString())
                .withDescription("یکی از آثار تاریخی ایران که از معماری خاص و منحصر به فردی برخوردار است مسجد امام اصفهان نام دارد. نمای این مسجد با ظرافت خاصی پوشیده از موزاییک های آبی و زرد رنگ زیبا می باشد که جلوه ای خیره انگیز به آن داده است. این مسجد به قدری زیباست که هنگام بازدید می توانید ساعت ها در حیاط و اطراف مسجد پیاده گردی کنید، با دقت غرق در جزئیات معماری شوید و به رازهای کشف نشده ی این آثار تاریخی ارزشمند ایرانی پی ببرید.\n" +
                        "یکی از تجربیات بی نظیری که نباید در هنگام بازدید از مسجد امام اصفهان از دست دهید این است که در زیر مرکز گنبد اصلی، بر روی مربع کوچکی که سنگ آن جنس متفاوتی دارد بایستید. وقتی در این قسمت ایستادید صحبت کنید، انعکاسی که توسط صدای شما ایجاد می شود غیر قابل وصف است! این تجربه به تنهایی ارزش بازدید از مسجد را دارد.")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("28")
                .withTitle("کاخ عالی قاپو")
                .withImageUrl("https://cdnw.elicdn.com/Blog/wp-content/uploads/2018/09/aali-ghapoo-isfahan.jpg")
                .withAddress("اصفهان")
                .withProvince("اصفهان")
                .withType(AttractionType.historical.toString())
                .withDescription("یکی دیگر از آثار تاریخی ایران که دارای معماری خاص و بی نظیر است، کاخ عالی قاپو در اصفهان می باشد. کاخ عالی قاپو به معنای واقعی تداعی گر دوره های تاریخی مختلفی است که گذر زمان را می توانید در آن احساس کنید. ساختمان کاخ عالی قاپو اصفهان در مراحل مختلف احداث شده است. ساخت ورودی آن با استفاده از مکعب های فشرده آغاز شده، سپس به سالن بالا گسترش پیدا کرده و دو طبقه ی دیگر در بالای ورودی به آن اضافه کرده اند.\n" +
                        "از آنجایی که در دوره ی سلسله ی صفویان، شاه عباس عالی قاپو را به عنوان محلی برای سرگرمی مهمانان استفاده می کرد، یک سالن مختص موسیقی هم در بالای کاخ وجود دارد. همچنین هر یک از اتاق های کاخ عالی قاپو اصفهان از تزئینات و دکوراسیون ظریف و زیبا برخوردارند.")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("29")
                .withTitle("مسجد نصیر الملک")
                .withImageUrl("https://cdnw.elicdn.com/Blog/wp-content/uploads/2018/09/Nasir-ol-Molk-Mosque.jpg")
                .withAddress("شیراز")
                .withProvince("فارس")
                .withType(AttractionType.historical.toString())
                .withDescription("یکی از جاذبه های ایران که شهرتی جهانی دارد، مسجد نصیر الملک شیراز است. نصیر الملک شیراز با نام مسجد صورتی نیز خوانده می شود. به جرات می توان گفت که امکان ندارد گردشگری وارد این بنای ارزشمند تاریخی ایرانی شده باشد و مسحور زیبایی های بی نظیر معماری آن نشود!\n" +
                        "مسجد نصیر الملک شیراز از برترین آثار تاریخی ایرانی با معماری منحصر به فرد است. پس اگر به شیراز سفر کردید توصیه می کنیم صبح سحر به بازدید از مسجد صورتی بروید. هنگام طلوع خورشید می توانید از فضای ساکت و آرامش بخش مسجد لذت ببرید. زمانی که خورشید طلوع می کند بازتاب نور از شیشه های رنگی نصیر الملک حال و هوایی عرفانی و فراموش نشدنی را برایتان رقم می زند.\n" +
                        "بهتر است بدانید که در دیگر ساعات روز مسجد پر از گردشگرانی است که از سراسر دنیا برای بازدید از معماری بی نظیر آن آمده اند.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("30")
                .withTitle("خانه قوام")
                .withImageUrl("https://cdnw.elicdn.com/Blog/wp-content/uploads/2018/09/qavam-house-shiraz.jpg")
                .withAddress("شیراز")
                .withProvince("فارس")
                .withType(AttractionType.historical.toString())
                .withDescription("شیراز مملو از آثار تاریخی ایرانی منحصر به فرد است که هر یک از ویژگی های معماری بی بدیلی برخوردارند. زمانی که مسجد نصیر الملک پر ازدحام می شود، می توانید با کمی پیاده روی به خانه ی قوام شیراز برسید. این خانه ی تاریخی در حدود سال های ۱۸۷۹ تا ۱۸۸۶ احداث گردید و نمای ساختمان نمایشی خاص از انعکاس آینه ها و موزاییک ها را برای بازدیدکنندگان به ارمغان می آورد. معماری داخلی و خارجی خانه قوام بسیار زیبا و حیرت انگیز است.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("31")
                .withTitle("نقش رستم")
                .withImageUrl("https://cdnw.elicdn.com/Blog/wp-content/uploads/2018/09/Naqsh-e-Rustam.jpg")
                .withAddress("۱۲ کیلومتری شمال غرب پرسپولیس")
                .withProvince("فارس")
                .withType(AttractionType.historical.toString())
                .withDescription("در حدود ۱۲ کیلومتری شمال غرب پرسپولیس، آثار تاریخی جالبی قابل مشاهده است که نقش رستم نام دارد. نقش رستم بر روی کوهی حکاکی شده که محل نهایی استراحت پادشاهان هخامنشی بوده است. متاسفانه مقبره های موجود در این مکان توسط اسکندر مقدونی مورد تجاوز قرار گرفته بود، اما تاثیری بر روی ظاهر شگفت انگیز بیرونی آن ها نداشته است.")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("32")
                .withTitle("پرسپولیس")
                .withImageUrl("https://cdnw.elicdn.com/Blog/wp-content/uploads/2018/09/perspolis-iran_icon.jpgn.jpg")
                .withAddress("۶۰ کیلومتری شمال شرق شیراز")
                .withProvince("فارس")
                .withType(AttractionType.historical.toString())
                .withDescription("آثار تاریخی ایرانی معروف، پرسپولیس یا شهر ایرانیان، که در دوران امپراطوری هخامنشیان پایتخت جشن های ایرانی بود، در فاصله ی ۶۰ کیلومتری شمال شرق شیراز قرار دارد. البته امروزه چیزی به جز خرابه ای از پرسپولیس تاریخی باشکوه باقی نمانده است. خرابه های باستان شناسی در مجموع ۱٫۶ کیلومتر از مساحت را پوشش می دهند.\n" +
                        "این شهر باستانی با شکوه از ستون های با عظمت متعدد، دو قصر سلطنتی و باغ هایی برخوردار است. دروازه ی ورودی بین المللی پرسپولیس دربردارنده ی نام کاوشگرانی است که هزاران سال قبل نامشان را روی دیوارها حکاکی کرده بودند. امروزه این دیوار را برای محافظت بیشتر با مانعی شیشه ای پوشانده اند.\n" +
                        "به جز تعداد گردشگران زیادی که برای بازدید از این محوطه ی تاریخی به شیراز سفر می کنند، تاریخچه ی دیرینه و غنی پرسپولیس موجب قدرت بخشیدن به آن شده است.")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("33")
                .withTitle("شهر تاریخی یزد")
                .withImageUrl("https://cdnw.elicdn.com/Blog/wp-content/uploads/2018/09/yazd.jpg")
                .withAddress("یزد")
                .withProvince("یزد")
                .withType(AttractionType.historical.toString())
                .withDescription("یزد مملو از ساختمان های یک طبقه ی خشتی تاریخی است که در میان کوچه های باریک شهر پنهان شده اند. معماری آثار تاریخی یزد برای علاقه مندان به بازدید از جاذبه های تاریخی بسیار جالب و دیدنی است. جالب است بدانید که یزد با عنوان بزرگترین شهر خشتی در دنیا شهرت دارد. اغلب خانه های یزد دارای حیاط به همراه حوضی کوچک در وسط آن هستند.\n" +
                        "یزد در منطقه ای خشک و گرم و کویری قرار دارد، به همین دلیل در گذشته به منظور خنک سازی داخل خانه ها و افزایش گردش هوا، از بادگیر استفاده می کردند. معماری و ساختار بادگیرهای ایرانی به قدری پیچیده و جالب است که موجب حیرت همه می شود. با رفتن به بالای پشت بام، دنیای دیگری پیش رویتان خواهد آمد.\n" +
                        "چشم اندازهای زیبا از گنبدهای کاهگلی به همراه بادگیرهای با شکوه، حال و هوایی خاص را برایتان ایجاد می کنند. تماشای معماری کهن شهر کاهگلی یزد از نمای بالا واقعا حیرت انگیز است.")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("34")
                .withTitle("کاخ گلستان")
                .withImageUrl("https://cdnw.elicdn.com/Blog/wp-content/uploads/2018/09/golestan-palace.jpg")
                .withAddress("تهران")
                .withProvince("تهران")
                .withType(AttractionType.historical.toString())
                .withDescription("مجموعه ی تاریخی کاخ گلستان تهران با ۱۷ سازه ی مختلف در باغی ایرانی، از دیگر آثار تاریخی ایرانی است که دارای معماری با شکوه و بی نظیر می باشد. تقریبا تمام سازه های معماری کاخ گلستان در دوره ی سلسله ی قاجار و حدودا بین سال های ۱۷۹۷ تا ۱۸۳۴ ساخته شده اند.\n" +
                        "متاسفانه در گذشته تعداد زیادی از ساختمان های مجموعه تاریخی کاخ گلستان تهران تخریب شدند. کاخ گلستان از جمله آثار تاریخی ایران است که در فهرست جهانی یونسکو به ثبت رسیده است.\n").build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("35")
                .withTitle("باغ شازده ماهان")
                .withImageUrl("https://www.bultannews.com/files/fa/news/1390/2/7/46811_337.jpg")
                .withAddress("۲ کیلومتری شهر ماهان و حوالی شهر کرمان")
                .withProvince("کرمان")
                .withType(AttractionType.historical.toString())
                .withDescription("باغ شاهزاده یا باغ شازده زیباترین باغ تاریخی ایران محسوب می\u200Cشود. این باغ در حدود ۲ کیلومتری شهر ماهان و حوالی شهر کرمان و در دامنه کوه\u200Cهای تیگران واقع شده و مربوط به اواخر دوره قاجاریه می\u200Cباشد.  باغ شاهزاده به گونه\u200Cای استقرار یافته که حداکثر استفاده از مناظر بدیع داخلی را به صورت زیر امکان پذیر می\u200Cسازد: در بدو ورود، به ویژه در طبقه فوقانی سردر خانه به غیر از دیدها و مناظر بیرونی باغ، منظره چهارباغ و در جهت عکس آن منظره کوه را امکان پذیر می\u200Cسازد. این مناظر عمده یعنی رؤیت حرکت آب، حوض ها و آبشارها هرکدام به نوبه خود تأکیدی بر محورهای عمود بر محور اصلی دارند و توأم با نظام گیاهی مناظر بدیع داخلی را ارائه می\u200Cدهند.\n" +
                        "این باغ ابتدا به دستور محمد حسن خان سردار ایروانی حاکم وقت کرمان ساخته شد و بنای درون آن بعداً توسط عبدالحمید میرزا ناصرالدوله حاکم کرمان طی یازده سال حکمرانی وی (۱۲۹۸ ه . ق تا ۱۳۰۹ ه. ق) ساخته شد و با مرگ وی نیز بنای آن نیمه تمام رها شد. گفته می\u200Cشود وقتی خبر پپ ناگهانی حاکم را به ماهان می\u200Cبرند، بنّایی که مشغول تکمیل سردر ساختمان بود تغار گچی را که در دست داشته محکم به دیوار کوبیده و کار را رها کرده و فرار نموده است. به همین علت جاهای خالی کاشی\u200Cها را بر سردر ورودی می\u200Cتوان دید. تاریخ بنای باغ ۱۲۷۶خورشیدی است.\n" +
                        "هر ساله گردشگران از این باغ زیبای ایرانی بازدید می\u200Cکنند و از زیبایی و طراوت آن لذت می\u200Cبرند. باغ شاهزاده در تاریخ سی ام تیرماه ۱۳۹۰ به ثبت جهانی یونسکو رسیده است.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("36")
                .withTitle("غار شاپور اول ساسانی")
                .withImageUrl("https://img.tebyan.net/big/1393/07/20141018140435442_62.gif")
                .withAddress("12 کیلومتر از شهر کازرون به سوی شیراز")
                .withProvince("شیراز")
                .withType(AttractionType.historical.toString())
                .withDescription("به فاصله 12 کیلومتر از شهر کازرون به سوی شیراز در استان فارس، شهر باستانی بیشاپور قرار دارد. در مقابل بیشاپور دره زیبایی است که به آن تنگ چوگان گفته می\u200Bشود. جاده آسفالته به طول 6 کیلومتر دره را به روستای تنگ چوگان متصل می\u200Bکند، از این روستا با 5/1 ساعت کوه\u200Bپیمایی می\u200Bتوانیم به دهانه غار برسیم.\n" +
                        "غار شاپور بر روی دیواره کوهی که دشت تنگ چوگان را به شکل نیم دایره در بر گرفته، زایش یافته است. دیواره\u200Bهای ورودی تنگه پوشیده از نقش برجسته\u200Bهایی تراشیده شده بر روی سنگ هستند که هر یک بخشی از تاریخ دوره ساسانیان را به نمایش گذاشته\u200Bاند. در سمت راست ورودی تنگه آثار قلعه\u200Bای، که گویا محل نگهبانی از شهر بیشابور بوده است، به چشم می\u200Bخورد. کف دره بستر رود شاپور است که آب آن از طریق کانال\u200Bهایی متعدد به داخل شهر منتقل می\u200Bشده است.\n" +
                        "غار شاپور از غارهای تاریخی بسیار پراهمیت ایران است. به نظر می\u200Bرسد غار قبل از دوران ساسانیان از مکان\u200Bهای مذهبی و آیینی ساکنان آن منطقه بوده و به مانند غار باباجابر و نیاسر مراسمی در آن جا انجام می\u200Bشده است. از آن جا که اردشیر و شاپور اول روش وحدت مذهبی را میان مردم اجرا می\u200Bکردند، از این رو اردشیر برای محو اعتقادات گذشته مردم منطقه نیاسر، آتشکده\u200Bای بزرگ هم جوار غار نیاسر می\u200Bسازد و شاپور هم دستور ساختن مجسمه اش را درون این غار می\u200Bدهد. پژوهش باستان شناسی بیش\u200Bتر در هر دو غار، مسئله را روشن خواهد ساخت.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("37")
                .withTitle("معبد آناهیتا")
                .withImageUrl("http://seeiran.ir/wp-content/uploads/2013/11/%D9%85%D8%B9%D8%A8%D8%AF-2.jpg")
                .withAddress("کازرون")
                .withProvince("فارس")
                .withType(AttractionType.historical.toString())
                .withDescription("معبد آناهیتا از بناهای مشهور شهر باستانی بیشاپور در شهرستان کازرون است.\n" +
                        "این بنا به صورت مکعبی است که هر یک از اضلاع آن نزدیک ۱۴ متر است و از سنگ\u200Cهای تراشیده شده با ابعاد مختلف و بدون ملات به صورت دو جداره ساخته شده است. این بنا با الهام از سبک معماری دوره هخامنشی ساخته شده است که به وسیله بست\u200Cهای آهنی به یکدیگر قفل و بند شده\u200Cاند. معبد آناهیتا فاقد سقف مسطح بوده است. این معبد را در عمق ۶ متری از زمین\u200Cهای اطراف خود ساخته\u200Cاند تا آب رودخانه شاپور به درون آن سرازیر شود. معبد بیشاپور سمبل یک پرستشگاه آب است و می\u200Cتوان آن را جایگاه نوازش با آب دانست. یعنی تنها عنصری از عناصر چهارگانه که به الهه ناهید منسوب است. نماد جانوری این ایزدبانو به شکل گاو می\u200Cباشد که در اطراف معبد، به صورت قرینه یکدیگر قرار گرفته است. این معبد نه تنها از نظر معماری، بلکه از نظر رعایت دستگاه\u200Cهای تنظیم و تقسیم و کنترل آب نیز فوق\u200Cالعاده است.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);
    }

    private void insertMuseumAttraction() {
        AttractionModel attractionModel;
        attractionModel = new AttractionModel.Builder()
                .withId("38")
                .withTitle("موزه ایران باستان")
                .withImageUrl("https://ghasedak24.com/uploads/wysiwyg/images/National-Museum1.jpg")
                .withAddress("ابتدای خیابان ۳۰ تیر تهران")
                .withProvince("تهران")
                .withType(AttractionType.museum.toString())
                .withDescription("موزه ایران باستان یا موزه ملی ایران که مهم ترین موزه کشور در میان مراکز نگهداری، نمایش و پژوهش مجموعه های باستان شناسی به شمار می رود، در سال 1360 افتتاح شده است. جالب است بدانید که نما و سر در ورودی موزه نیز متأثر از آثار درون آن بوده و به سبک نمای ایوان کسری ساخته شده است.\nموزه دوران پیش از تاریخ، موزه دوران تاریخی و موزه دوران اسلامی از مجموعه های این موزه به شمار می روند. در بخش پیش از تاریخ این موزه قدیمی ترین اثر یافت شده از حضور انسان در فلات ایران در حدود 800 هزار سال پیش به نمایش درآمده است. در بخش دوران تاریخی این موزه نیز آثاری چون پلکان تخت جمشید، تندیس مصری داریوش بزرگ و سردار اشکانی قرار گرفته اند.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("39")
                .withTitle("موزه هنرهای معاصر")
                .withImageUrl("https://ghasedak24.com/uploads/wysiwyg/images/contemporary-art-museum.jpg")
                .withAddress("ضلع شمالی بلوار کشاورز و غرب پارک لاله تهران")
                .withProvince("تهران")
                .withType(AttractionType.museum.toString())
                .withDescription("موزه هنرهای معاصر تهران یکی از ارزشمندترین گنجینه های هنری ایران و جهان به شمار می رود. این موزه که در سال 1356 تأسیس شده است، اثار هنرمندان بزرگی چون پیکاسو، گوگن، ماگریت، ارنست، پولاک و جاکومتی را در خود جای داده است. موزه هنرهای معاصر که معماری بی نظیر آن با الهام از بادگیرهای کویری ایران طراحی شده، در گوشه ای از پارک لاله تهران قرار گرفته است.\nاین موزه از 9 گالری تشکیل شده که 3 گالری آن شامل آثار هنرمندان و نقاشان بین المللی است. در گنجینه دائمی موزه نیز بیش از 3 هزار اثر ارزشمند از هنرهای تجسمی ایران و جهان به نمایش درآمده است. نکته جالب در مورد موزه هنرهای معاصر این است که این موزه یکی از کامل ترین مجموعه های هنر اکسپریونیسم انتزاعی جهان را داراست. در گنجینه عکس های موزه نیز عکس هایی از عکاسان مشهور جهان به نمایش درآمده است. عکاسان نامداری چون هنری فاکس، تالیوت، جولیا مارگارت کامرون، مارگارت برک وایت و واکر ایوانز.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("40")
                .withTitle("موزه سینما")
                .withImageUrl("https://ghasedak24.com/uploads/wysiwyg/images/cinema-museum.jpg")
                .withAddress("خیابان ولیعصر تهران")
                .withProvince("تهران")
                .withType(AttractionType.museum.toString())
                .withDescription("این موزه جدید که در سال 1381 شروع به فعالیت کرد، در خیابان ولیعصر و در دل عمارت باغ فردوس قرار گرفته است. موزه سینما در حقیقت گنجینه ای از عکس ها، اسناد، وسایل و تجهیزات قدیمی سینما است که دو سالن سینما به ظرفیت 205 و 121 نفر نیز دارد. نمایشگاه های موزه سینما شامل تالار آبی، تالار معاصران و تالار بین الملل و نیز نمایشگاه کودک، نمایشگاه علی حاتمی، نمایشگاه نام آوران، نمایشگاه دوبله و صدا، نمایشگاه ارامنه، نمایشگاه دفاع مقدس و همچنین خانه فرهاد، زیر گذر تاریخ و تماشاخانه می شود.\nبرای مثال در خانه فرهاد یادگارهایی از جمله وسایل شخصی، کتاب ها و سازهای فرهاد مهراد، خواننده ایرانی به نمایش در آمده است. در بخش زیرگذر تاریخ نیز شما شاهد آثاری از نخستین تلاش های بشر برای ثبت حرکت مانند اولین تصویر سازی ایرانیان برای روایت شاهنامه فردوسی خواهید بود. دیدن جوایز جهانی سینمای ایران مثل نخل طلای کن، خرس برلین و شیر ونیز در این مجموعه زیبا در باغ فرودس لحظات خاطره انگیزی را برای شما ترسیم خواهد کرد.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("41")
                .withTitle("موزه آستان قدس رضوی")
                .withImageUrl("https://ghasedak24.com/uploads/wysiwyg/images/astane-ghods-museum.jpg")
                .withAddress("حرم مطهر امام رضا")
                .withProvince("خراسان رضوی")
                .withType(AttractionType.museum.toString())
                .withDescription("آستان قدس رضوی یکی از بزرگ ترین مجموعه های موزه ایران را زیر نظر خود دارد. سنگ بنای ساخت این موزه در سال 1316 خورشیدی بنا نهاده شد تا 8 سال بعد و در سال 1324 افتتاح شود. این موزه در ابتدا شامل دو تالار در یک طبقه بود که به مرور زمان توسعه پیدا کرده و پس از انقلاب نیز 14 گنجینه تخصصی به آن افزوده شد.\n" +
                        "موزه آستان قدس رضوی شامل چهار ساختمان می باشد. ساختمان موزه مرکزی که خود از چند مجموعه با نام گنجینه نشکیل شده است. گنجینه حرم رضوی، گنجینه تمبر و اسکناس، گنجینه نجوم و ساعت، گنجینه سلاح های سرد و گرم، گنجینه ظروف و گنجینه هنرهای تجسمی از این دست هستند. ساختمان دوم که ساختمان موزه فرش نام دارد در سه طبقه به نمایش قالی های نفیس می پردازد.\nساختمان موزه قرآن و نفایس هم از گنجینه قرآن و نفایس، گنجینه آثار اهدایی آیت الله خامنه ای، آثار اهدایی استاد فرشچیان و تالار مرقعات و ابزار کتابت تشکیل شده است. بالاخره در حمام مهدی قلی بیگ موزه مردم شناسی تأسیس شده است که در آن پوشاک سنتی اقوام مختلف، منسوجات حمام، ظروف فلزی و تصاویری از مشاغل سنتی و نقاشی های رنگ روغن به سبک قهوه خانه ای نمایش داده شده است.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("42")
                .withTitle("موزه ملی ملک")
                .withImageUrl("https://ghasedak24.com/uploads/wysiwyg/images/malek-museum.jpg")
                .withAddress("خیابان سپه تهران")
                .withProvince("تهران")
                .withType(AttractionType.museum.toString())
                .withDescription("کتابخانه و موزه ملی ملک که در سال 1316 خورشیدی توسط حسین آقا ملک ( یکی از خیرین و وقف کنندگان بزرگ مشهد) تأسیس شد، در خیابان سپه تهران واقع شده است. موزه ملک در حقیقت یک مجموعه فرهنگی متشکل از کتابخانه و موزه می باشد که جزو موقوفات آستان قدس رضوی به حساب می آید.\nموزه های این مجموعه شامل موزه سکه، موزه فرش، موزه تابلوهای نقاشی، موزه هنری لاکی، موزه تمبر، موزه بانو ملک و موزه آثار خوشنویسی می شود. در این موزها انواع سکه های یونانی، سلوکی، بیزانسی و خلفای اسلامی؛ قالی ها و قالیچه های نفیس؛ آثار هنرمندانی چون کمال الملک، تجویدی و صورتگر؛ قلمدان، قاب آیینه و سرچسبدان تاریخی؛ مجموعه ای از تمبرهای معتبر داخلی و خارجی؛ نسخ خطی و تابلوهای نقاتشی دوران قاجاری و آثار خوشنویسانی چون میرعماد، یاقوت مستعصمی و علیرضا عباسی نگه داری می شود.\n" +
                        "در مورد کتابخانه ملک هم باید گفت که این مکان با بیش از 19 هزار جلد نسخه خطی نفیس یکی از گنجینه های کشور به شمار می آید. برای نمونه در حدود 70 هزار کتاب چاپی، 3400 کتاب چاپ سنگی و 548 نشریه ادواری در این کتابخانه وجود دارد. ضمن اینکه در بخشی از این کتابخانه به مرمت نسخه های خطی، صحافی، عکاسی و تهیه میکروفیلم نیز انجام می شود.")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("43")
                .withTitle("موزه تخت جمشید")
                .withImageUrl("https://ghasedak24.com/uploads/wysiwyg/images/The_museum_of_Persepolis.jpg")
                .withAddress("شهرستان مرودشت")
                .withProvince("فارس")
                .withType(AttractionType.museum.toString())
                .withDescription("موزه تخت جمشید یکی از قدیمی ترین بناهای ایران به شمار می رود که به موزه تبدیل شده است. بنایی که زمانی کاخ حرمسرای خشایارشا بوده و 2500 سال قدمت داد. موزه تخت جمشید شامل یک ایوان، دو گالری و یک تالار می باشد. بر اساس شواهد این بنا در سال 1311 توسط پروفسور هرتسفلد، رئیس وقت هیئت علمی تخت جمشید مورد بازسازی قرار گرفته و به محلی برای نگهداری اشیا تبدیل شد.\nتالارهای اصلی موزه در تالار پیش از تاریخ، هخامنشی و اسلامی خلاصه می شوند. در تالار پیش از تاریخ انواع ظروف و مجسمه های سفالی و ابزار سنگی به نمایش درآمده که از تل های تیموران، باکون، شقاء و نخودی پاسارگاد جمع آوری شده اند. تالار هخامنشی این موزه هم اشیا و ابزاری را در خود جای داده که در حین خاکبرداری از صفه تل تخت جمشید به دست آمده اند.\n" +
                        "همانطور که از نام تالار اسلامی بر می آید، آثار مربوط به دوره پس از اسلام در آن نگهداری می شود. برای نمونه می توان به ظروف سفالی لعاب دار مزین به خط کوفی، کوزه های سفالی بدون لعاب، انواع ظروف فلزی و دو لنگه در چوبی با خط کوفی و نیز ظروف شیشه ای و عطردان های ساخته شده از شیشه های رنگی اشاره کرد.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("44")
                .withTitle("موزه تاریخ طبیعی همدان")
                .withImageUrl("https://ghasedak24.com/uploads/wysiwyg/images/natural-museum-hamedan.jpg")
                .withAddress("انتهای چهارباغ آزادگان در شهر همدان")
                .withProvince("همدان")
                .withType(AttractionType.museum.toString())
                .withDescription("موزه تاریخ طبیعی همدان در سال 1351 و به همت استاد جعفر محمد علیزاده در دانشکده کشاورزی دانشگاه بوعلی همدان تأسیس شده است. این موزه مجموعه ای کم نظیر از انواع گونه های حیوانی، گیاهی و طبیعی از ایران و سایر نقاط جهان را در خود جای داده است. آنچه در مورد تاریخچه این موزه می دانیم این است که در سالن کوچک و محدود در گوشه ای از دبیرستان پهلوی وقت کار خود را آغاز کرده است و در طول زمان توسعه یافته است.\nموزه تاریخ طبیعی همدان از 5 سالن اصلی تشکیل شده است. سالن اول که سالن خلیج فارس نام دارد به حلزون ها، سخت پوستان، مرجان ها و اسفنج های خلیج فارس تعلق دارد. در سالن دوم نیز انواع حشرات و پروانه های دنیا و ایران به نمایش درآمده اند. مجموعه ای از پستانداران و پرندگان در سالن سوم و آبزیان و دوزیستان نیز در سالن چهارم نمایش داده شده اند. آخرین سالن این موزه یعنی سالن پنجم هم به سنگ ها، کانی ها و فسیل ها اختصاص دارد.")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("45")
                .withTitle("کاخ موزه سعدآباد")
                .withImageUrl("https://ghasedak24.com/uploads/wysiwyg/images/saadabad-museum.jpg")
                .withAddress("دربند")
                .withProvince("تهران")
                .withType(AttractionType.museum.toString())
                .withDescription("کاخ سعدآباد که امروزه مجموعه ای از موزه ها را نیز در خود جای داده، در شمالی ترین نقطه تهران، دربند بنا شده است. این مجموعه علاوه بر کاخ های متعدد شامل چندین هکتار جنگل طبیعی، چشمه، قنات، باغستان و رودخانه نیز می شود. بنای کاخ سعد آباد به دوره قاجار بر می گردد که سکونتگاه ییلاقی شاهان در آن دوره بوده است.\n" +
                        "همان طور که گفته شد مجموعه سعدآباد شامل کاخ های متعدد می شود. از جمله آنها می توان به کاخ احمدشاهی، کاخ ملکه مادر، کاخ رضا شاه پهلوی و چندین کاخ دیگر اشاره کرد که پس از انقلاب به شکل موزه درآمده اند. موزه برادران امیدوار، موزه ظروف سلطنتی، کاخ موزه سفید، موزه فرشچیان، موزه نظامی، موزه نگارستان، موزه هنر ملل و موزه چهره های ماندگار از جمله دیگر موزه های این مجموعه به شمار می آیند.\nبرای نمونه در موزه برادران امیدوار که از 3 نگارخانه تشکیل شده است، آثار اهدایی این دو برادر شامل عکس های آنها، اشیای جمع آوری شده در طول سفر به آفریقا، آمریکا و استرالیا و نیز فیلم ها و اسلایدهای سفر به نمایش گذاشته شده است. یا موزه استاد فرشچیان که شامل 5 سالن و بیش از 70 اثر از این استاد نقاش می باشد.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("46")
                .withTitle("موزه ارتباطات")
                .withImageUrl("https://ghasedak24.com/uploads/wysiwyg/images/post-museum.jpg")
                .withAddress("خیابان سپه تهران")
                .withProvince("تهران")
                .withType(AttractionType.museum.toString())
                .withDescription("موزه پست و مخابرات که به نام موزه ارتباطات در سال 1369 آغاز به کار کرد در یکی از قدیمی ترین ساختمان های دولتی تأسیس شده است. در حقیقت ساخت این بنای شکیل به سال 1307 و وزارت صوراسرافیل و نظام الدین حکمت باز می گردد. بر طبق مستندات طراحی این بنا بر عهده مهندسان و طراحان گرجی، ارمنی و ایرانی بوده است.\nدر موزه پست که در خیابان سپه تهران واقع شده، مجموعه ای از قدیمی ترین ابزارهای ارتباطی از جمله نوشت افزارهای کهن، ابزارهای فرستادن بسته های پستی و چاپاری، تلفن های اولیه، تلگرام های مورس، تمبر و دیگر وسایل ارتباطی از جمله کبوتر نامه بر و حتی ماهواره نیز به نمایش گذاشته شده است.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);
    }

    private void insertShoppingAttraction() {

        AttractionModel attractionModel;
        attractionModel = new AttractionModel.Builder()
                .withId("47")
                .withTitle("مرکز خرید ارگ")
                .withImageUrl("https://www.eneshat.com/images/2016/06/arg-mall-2.jpg")
                .withAddress("تجریش تهران")
                .withProvince("تهران")
                .withType(AttractionType.shopping.toString())
                .withDescription("مرکز خرید ارگ، مرکزی است 5 طبقه (دو طبقه همکف و سه طبقه دیگر) که به صورت اختصاصی به فعالیت تجاری می\u200Cپردازد. ارگ یکی از جدیدترین مراکز خرید تهران است که در منطقه تجریش واقع شده است. وجود فروشگاه\u200Cهای متنوع با متراژهای مختلف و هزار واحد پارکینگ در 5 طبقه، شهر بازی و فودکورت این مرکز خرید را تبدیل به یکی از مراکز خرید مجلل تهران کرده است.")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("48")
                .withTitle("مرکز تجاری سام")
                .withImageUrl("https://homing.ir/mag/wp-content/uploads/2018/12/195.jpg")
                .withAddress("خیابان فرشته تهران")
                .withProvince("تهران")
                .withType(AttractionType.shopping.toString())
                .withDescription("مجتمع تجاری سام سنتر در خیابان فرشته تهران واقع شده و باداشتن زمینی به مساحت هزار و 750 متر مربع، در 9 طبقه،شامل، 26 فروشگاه تجاری در ابعاد 35 تا 200 متری در دو طبقه همکف و اول، 200 پارکینگ در طبقات دوم تا هفتم، یک طبقه آشپزخانه و هزار و 200 متر فضای رستورانی در طبقه نهم با چشم\u200Cاندازی کوهستانی در بهترین نقطه شهر تهران به مرکز خریدکم\u200Cنظیری مبدل شده است.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("49")
                .withTitle("مرکز خرید پالادیوم")
                .withImageUrl("https://iransuite.com/wp-content/uploads/2018/05/3-300x300.jpg")
                .withAddress("زعفرانیه تهران")
                .withProvince("تهران")
                .withType(AttractionType.shopping.toString())
                .withDescription("پالادیوم در منطقه زعفرانیه تهران واقع شده و با برخورداری از زمینی به مساحت ده هزار متر مربع با مساحت زیربنای صد هزار متر مربع، 13 طبقه در ضلع جنوبی، 11 طبقه در ضلع شمالی و 6 طبقه زیر همکف، مجموعه\u200C\u200Cای\u200C متنوع و کامل از امکانات و خدمات را در دل خود جای داده است. این مرکز خرید دارای 150 واحد تجاری، سوپرمارکتی با مساحت 2500 مترمربع، تعداد 150 واحد اداری و 60 هزار متر مربع مشاعات شامل هزار واحد پارکینگ در 6 طبقه و یک باشگاه ورزشی بی\u200Cنظیر است.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("50")
                .withTitle("مجتمع تجاری مدرن الهیه")
                .withImageUrl("https://www.portal.luxury/MediaServer/znjGT0mzhkNLVdlC0fHzC4/9895_0_2016_7_600_0_0_jpg_0_0/%d9%85%d8%b1%da%a9%d8%b2-%d8%ae%d8%b1%db%8c%d8%af-%d9%85%d8%af%d8%b1%d9%86-%d8%a7%d9%84%d9%87%db%8c%d9%87.jpg")
                .withAddress("منطقه الهیه تهران")
                .withProvince("تهران")
                .withType(AttractionType.shopping.toString())
                .withDescription("مجتمع تجاری مدرن الهیه، همان\u200Cطور که از نامش برمی\u200Cآید، در منطقه الهیه تهران واقع شده است. این مجتمع که طراحی فوق\u200Cالعاده مجللی دارد، ﺩﺭ ﺯﻣﻴﻨﻰ ﺑﻪ ﻣﺴﺎﺣﺖ 1915 ﻣﺘﺮ ﻣﺮﺑﻊ، در 11 طبقه ساخته شده است. بخش تجاری مجتمع شامل دو طبقه و دارای 30 واحد است که عمدتا به عرضه پوشاک اختصاص دارد. البته تعداد واحدهای عرضه ساعت و عطر و ادکلن و… نیز قابل توجه است.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("51")
                .withTitle("مجتمع چندمنظوره کورش")
                .withImageUrl("https://bartarinha.com/Files/Pictures/94.11.3/%DA%A9%D9%88%D8%B1%D9%88%D8%B4/1.jpg")
                .withAddress("اتوبان ستاری تهران")
                .withProvince("تهران")
                .withType(AttractionType.shopping.toString())
                .withDescription("مجتمعی بی\u200Cنظیر در پایتخت در اتوبان ستاری که با داشتن بیش از 500 واحد تجاری این روزها تبدیل به یکی از شلوغ\u200Cترین مراکز خرید تهران شده است. مجتمع تجاری کورش علاوه بر تجاری بودن، عنوان مجتمع فرهنگی را نیز یدک می\u200Cکشد، چرا\u200Cکه بزرگ\u200Cترین پردیس سینمایی کشور در این مجتمع تجاری فرهنگی تاسیس شده است. یکی از مدرن\u200Cترین مراکز تفریحی- سرگرمی کشور نیز در این مجتمع تجاری با عنوان ژوپیتر فعالیت می\u200Cکند. حضور فعال ده\u200Cها رستوران، فود کورت و البته کافی\u200Cشاپ\u200Cهای متعدد در مجتمع تجاری فرهنگی کورش نیز قابل توجه است.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("52")
                .withTitle("اصفهان سیتی سنتر بزرگ")
                .withImageUrl("https://www.isfahancitycenter.com/images/about/aboutcontent1.jpg")
                .withAddress("جنوب شهر اصفهان")
                .withProvince("اصفهان")
                .withType(AttractionType.shopping.toString())
                .withDescription("اصفهان سیتی سنتر بزرگ\u200Cترین مرکز خرید ایران و خاورمیانه است. مساحت زیربنایی بخش اداری و تجاری این مرکز 465 هزار متر مربع است و مساحت زیربنایی کل این مجموعه 600 هزار متر مربع است. ساختمان این مجموعه 7 طبقه است و بیش از 750 فروشگاه، یک هایپرمارکت، مغازه\u200Cها، غرفه\u200Cها، رستوران\u200Cها و آژانس\u200Cهای هواپیمایی به انضمام یک هتل 7 ستاره، 7 سالن سینما، یک مرکز مالی، یک مرکز تجاری و یک محوطه تفریحی اجزای تشکیل دهنده این مرکز هستند. همچنین بزرگ\u200Cترین شهربازی سرپوشیده با مساحت 345 هزار متر مربع در خاورمیانه در این مرکز خرید قرار دارد.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("53")
                .withTitle("مجتمع خلیج فارس")
                .withImageUrl("https://images.kojaro.com/2018/6/fd56e810-818a-42a5-894f-d14496a76415.jpg")
                .withAddress("بزرگراه دکتر حسابی شیراز")
                .withProvince("فارس")
                .withType(AttractionType.shopping.toString())
                .withDescription("پنجمین مرکز تجاری- تفریحی و توریستی بزرگِ جهان با نام زیبا و غرورآفرین خلیج\u200C فارس در ابتدای ورودی شهر جدید صدرا با مساحت 500 هزار مترمربع زیربنا واقع شده است. مجموعه خلیج فارس شیراز یک پروژه فاخر و عظیم است که دارای بیش از 2500 واحد تجاری، هایپرمارکت، شهربازی، شش سالن\u200C سینما، رستوران و کافی\u200Cشاپ\u200Cهای متعدد، پارکینگ سرپوشیده با ظرفیت 5500 خودرو، مرکز معاملات و بورس، سکوى فرود هلیکوپتر، مرکز بازی\u200Cهای رایانه\u200Cای و هتل بین\u200Cالمللی پنج ستاره است.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("54")
                .withTitle("مجتمع آرمان")
                .withImageUrl("https://www.epersianhotel.com/images/arman-video.jpg")
                .withAddress("خیابان نواب صفوی مشهد")
                .withProvince("خراسان رضوی")
                .withType(AttractionType.shopping.toString())
                .withDescription("مجتمع تجاری، اقامتی و مسکونی آرمان دارای مساحت عرصه 10535 متر مربع و زیربنایی حدود 90 هزار متر مربع است. پروژه آرمان با داشتن 95 متر از بر خیابان نواب صفوی و فقط حدود 500 متر فاصله با حرم امام رضا (ع) در موقعیتی استثنایی قرار گرفته و می\u200Cتواند پاسخگوی نیاز زائران حرم باشد. پروژه آرمان در 13 طبقه ساخته شده است و دارای 401 واحد تجاری، 291 واحد اقامتی، 119 واحد مسکونی و 431 واحد پارکینگ است. در ساخت این پروژه از جدیدترین تکنولوژی صنعت ساختمان شده است و در طراحی یکی از نمونه منحصربه\u200Cفرد شهر مشهد به حساب می\u200Cآید. وجود تفرجگاه مرکزی با طراحی فوق\u200Cالعاده خاص و منحصربه\u200Cفردش این مجتمع را در نوع خود بی\u200Cنظیر کرده است. از ویژگی\u200Cهای اصلی این پروژه می\u200Cتوان به سیستم مدیریت هوشمند ساختمان، معماری نوآورانه و خاص، تنوع متراژ در واحدها، طراحی داخلی مدرن و زیبا و دسترسی آسان به نقاط مختلف شهر مشهد اشاره کرد.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("55")
                .withTitle("مرکز خرید سارینا یک")
                .withImageUrl("https://images.kojaro.com/2018/7/1c1efb8e-27df-470d-8426-19c7e45fa389.jpg")
                .withAddress("بلوار خیام کیش")
                .withProvince("")
                .withType(AttractionType.shopping.toString())
                .withDescription("بازار تجاری، اداری سارینا یک در زمینی به مساحت 5292 متر مربع در 10 طبقه شامل یک طبقه پارکینگ، دو طبقه تجاری و 7طبقه اداری بنا شده است. این بازار در اراضی شرقی جزیره زیبای کیش، بلوار خیام، روبه\u200Cروی هتل ارم واقع شده است. نزدیکی و مجاورت این مجتمع به مراکز خرید جزیره (مرکز تجاری کیش و پردیس 1 و 2) و هتل ها (ارم و داریوش) رستوران\u200Cها و چشم\u200Cانداز رو به دریا از محاسن بزرگ این مجتمع به شمار می\u200Cآید که آن را از دیگر پروژه\u200Cها متمایز می\u200Cسازد. / جوان آنلاین\n")
                .build();
        dbHelper.insertAttraction(attractionModel);
    }

    private void insertAmusementPark() {
        AttractionModel attractionModel;
        attractionModel = new AttractionModel.Builder()
                .withId("56")
                .withTitle("پارك ارم تهران")
                .withImageUrl("https://www.alaedin.travel//Files/Jazebe/tehran/eram-amusement-park-in-tehran/Alaedin-Travel-Agency-Attraction-Eram-Amusement-Park-Tehran-5.jpg")
                .withAddress("كیلومتر 4 جاده تهران به كرج")
                .withProvince("تهران")
                .withType(AttractionType.amusementPark.toString())
                .withDescription("این پارك كه مجموعه ای بزرگ و كم نظیر در ایران است، با امكانات بسیار بالا و تجهیزات بروز خود توانسته است حرفی برای گفتن در میان دیگر مجموعه های بازی و سرگرمی در كشور داشته باشد. این پارك و شهربازی در كیلومتر 4 جاده تهران به كرج بعد از پل ستاری واقع شده است. این پارك بزرگ در سال 1350 تاسیس گردید و به نام \"پارك خرم\" معروف شد. موسس این مجموعه زیبا \"رحیم علی خرم\" از سرمایه داران و كارآفرینان تهران بود. پس از انقلاب شكوهمند اسلامی، این پارك به نام \"پارك ارم\" تغییر نام داد.\n\"پارك ارم\" با بیش از 72 هكتار وسعت از بزرگترین پارك های ایران به شمار می آید. این پارك زیبا به چند قسمت مختلف تقسیم شده است. در شهر بازی شماره یك آن انواع بازی های رایانه ای، اتومبیلرانی، سینمای 4 بعدی، رالی ، تونل وحشت و بسیاری از بازی های ویژه كودكان و بزرگسالان دائر شده است. در شهر بازی شماره دو نیز انواع بازی های سرگرم كننده ای از جمله: سورتمه، چرخ فلك، قطار های شادی و دیگر بازی های مهیج به چشم می خورد.\nدر دیگر قسمت های این پارك می توان از باغ وحش، دریاچه قایقرانی، تالار ها و توقفگاه های زیبای آن استفاده كرد. از نقاط قوت این مجموعه بی نظیر فاصله اندك آن با برخی از بزرگترین هتل های ایران می باشد.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("57")
                .withTitle("شهربازی پارك ملت مشهد")
                .withImageUrl("https://mashhadfori.com/bundles/data/images/5cb5932b061fe_5cb5932b06201.jpg")
                .withAddress("حاشیه بزرگراه وكیل آباد مشهد")
                .withProvince("خراسان رضوی")
                .withType(AttractionType.amusementPark.toString())
                .withDescription("بوستان و شهر بازی ملت مشهد، از قدیمی ترین بوستان های كشور می باشد. این شهر بازی در حاشیه بزرگراه وكیل آباد مشهد قرار گرفته است. به جز وسعت زیاد این شهربازی، ویژگی خاصی كه این شهربازی را در بین دیگر شهربازی های ایران و حتی خاورمیانه منحصر به فرد كرده است، ارتفاع 80 متری چرخ فلك آن میباشد.\nاین چرخ فلك 250 تنی قادر است 450 نفر را تا ارتفاع 80 متری از سطح زمین بالا ببرد. از دیگر نقاط قوت این مجموعه، داشتن اولین استاندارد تجهیزات و وسائل بازی در بین شهربازی های ایران است. این شهربازی بزرگ و زیبا با وسائل بازی ویژه و تجهیزات كامل خود می تواند لحظات شادی را برای مسافران و زائران فراهم كند.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("58")
                .withTitle("شهر رویاهای اصفهان")
                .withImageUrl("http://cdn-tehran.wisgoon.com/dlir-s3/10531428392684278536.JPG")
                .withAddress("بزرگراه کمربندی شرق اصفهان")
                .withProvince("اصفهان")
                .withType(AttractionType.amusementPark.toString())
                .withDescription("سفر به استان زیبای اصفهان همیشه خاطره انگیز و جذاب بوده است. با افتتاح و راه اندازی یكی از بزرگترین و مجهز ترین شهربازی های كشور در این شهر تاریخی، سفر به این دیار كهن و پر جاذبه برای مسافران خاطره انگیز تر از قبل شده است. این شهربازی مدرن كه از مجهزترین شهربازی های خاورمیانه می باشد، در فضایی به وسعت 170000 متر مربع احداث شده است. همكاری متخصصان داخلی با یكی از بزرگترین شركت های چینی در ساخت این مجموعه توانسته است انتظار مردم این شهر و گردشگران را به خوبی پاسخ دهد. این شهربازی در شرق شهر اصفهان واقع شده است. \"ترن هوایی\" و \"ترن معلق\" از وسائل بازی منحصر به فرد این مجموعه می باشد كه توانسته ترس و اضطراب را در كنار هیجان و شور به هم پیوند بزند. معماری متفاوت و ساختمان ها و مجسمه های مختلف این شهربازی از دیگر نقاط مورد توجه مسافران و بازدید كنندگان این مجموعه می باشد.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("59")
                .withTitle("قصر بازی رشت")
                .withImageUrl("https://seeiran.ir/wp-content/uploads/2017/12/%D9%BE%D8%A7%D8%B1%DA%A9-%D9%82%D8%B5%D8%B1%D8%A8%D8%A7%D8%B2%DB%8C-%D8%B1%D8%B4%D8%AA-3.jpg")
                .withAddress("جاده رشت به انزلی")
                .withProvince("گیلان")
                .withType(AttractionType.amusementPark.toString())
                .withDescription("قصر بازی رشت بزرگترین پارك بازی سرپوشیده شمال ایران است. این پارك دیدنی و مهیج در جاده رشت به انزلی واقع شده است. این مجموعه بزرگ و در كنار دستگاه های مدرن و بازی های رایانه ای بروز خود از فضاهای تفریحی ویژه ای برخوردار است. انواع سالن های بولینگ و بیلیارد در كنار رستوران هایی به دور از هیاهو، كافی شاپ هایی در فضای باز و در كنار بركه، سالن های آمفی تاتر و مجموعه هایی برای برگزاری جشن های تولد باعث شد است كه نیاز های همه مسافران و مردم این شهر را به خوبی برآورده كند.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("60")
                .withTitle("شهربازی باغلار باغی تبریز")
                .withImageUrl("https://www.iranhotelonline.com/images/EditorUpload/shiraz.jpg")
                .withAddress("در مجاورت بلوار استاد شهریار")
                .withProvince("آذربایجان شرقی")
                .withType(AttractionType.amusementPark.toString())
                .withDescription("شهر تبریز و خطه آذربایجان همیشه از لحاظ تاریخی و طبیعی از زیباترین مناطق كشور بوده است. در كنار پارك های سرسبز و طبیعی كه در این شهر با اصالت وجود دارد، پارك و شهربازی \"باغلار باغی\" از قدیمی ترین و بزرگترین شهربازی های این شهر به حساب می آید. شهر بازی \"باغلار باغی\" در كنار رستوران ها و مناطق سرسبز اطراف خود از بهترین و آرام ترین شهربازی های شمال غرب كشور می باشد كه هر ساله مسافران و محلی های بسیاری را به سمت خود می كشد. امكانات تفریحی بسیاری از جمله كشتی صبا، قطار، آبشار و دیگر بازی های بروز و مهیج در این شهر بازی در این منطقه كم نظیر می باشد. این مجموعه مهیج در مجاورت بلوار استاد شهریار در شهر تبریز واقع شده است.\n")
                .build();
        dbHelper.insertAttraction(attractionModel);
    }

    private void insertProvinces() {
        ProvinceModel provinceModel = new ProvinceModel.Builder()
                .withName("آذربایجان شرقی")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Tabriz_City_Hall.jpg/225px-Tabriz_City_Hall.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("آذربایجان غربی")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Seh_gonbad.jpg/225px-Seh_gonbad.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("اردبیل")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/b/b6/Sheikh-safi.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("اصفهان")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/Naghsh-e-jahan_masjed-e-shah_esfahan.jpg/225px-Naghsh-e-jahan_masjed-e-shah_esfahan.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("البرز")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Karaj_taleghani.jpg/225px-Karaj_taleghani.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("ایلام")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/Felahati.jpg/225px-Felahati.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("بوشهر")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Busher1973.jpg/225px-Busher1973.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("تهران")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/fa/thumb/5/54/Tehran-Milad_Tower2.jpg/225px-Tehran-Milad_Tower2.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("چهارمحال و بختیاری")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Shahrekord_3693036.jpg/225px-Shahrekord_3693036.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("خراسان جنوبی")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Aerial_view_of_Birjand_City.jpg/225px-Aerial_view_of_Birjand_City.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("خراسان رضوی")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/fa/thumb/1/1a/ImamReza%28A%29.jpg/225px-ImamReza%28A%29.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("خراسان شمالی")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/Besghardash.jpg/225px-Besghardash.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("خوزستان")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f4/Ahvaz_Bridge.jpg/225px-Ahvaz_Bridge.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("زنجان")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/f/f9/Soltaniyeh_exterior.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("سمنان")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/Arg-semnan.jpg/225px-Arg-semnan.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("سیستان و بلوچستان")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ee/University_of_Sistan_and_Baluchestan.JPG/225px-University_of_Sistan_and_Baluchestan.JPG")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("فارس")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Hafzie6.JPG/225px-Hafzie6.JPG")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("قزوین")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6a/Qazvin_-_Chehel_Sotun.jpg/225px-Qazvin_-_Chehel_Sotun.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("قم")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/Qom_masjed-e-hazrat-masumeh.jpg/225px-Qom_masjed-e-hazrat-masumeh.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("کردستان")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/fa/thumb/2/2d/Abidar-sanandaj.jpg/225px-Abidar-sanandaj.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("کرمان")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Shazdeh_Garden_Mahan_Iran.jpg/225px-Shazdeh_Garden_Mahan_Iran.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("کرمانشاه")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/c/ce/Taghe_bostan.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("کهگیلویه و بویراحمد")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/3/33/Panoramo_de_Yasuj_%28Jasu%C4%9D%29.jpg/225px-Panoramo_de_Yasuj_%28Jasu%C4%9D%29.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("گلستان")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/6/62/Naharkhoran2.JPG/1200px-Naharkhoran2.JPG")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("گیلان")
                .withImageUrl("https://tripyar.com/uploads/picture/1969/3.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("مازندران")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/Sari%2C_Saat_sq_%28Night%29.jpg/225px-Sari%2C_Saat_sq_%28Night%29.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("مرکزی")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/National_Garden_Square_-_Arak_-_1963.jpg/225px-National_Garden_Square_-_Arak_-_1963.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("هرمزگان")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Bandarabbas-sahel-2.jpg/225px-Bandarabbas-sahel-2.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("همدان")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Mausol%C3%A9e_Baba_Taher_Hamedan.jpg/225px-Mausol%C3%A9e_Baba_Taher_Hamedan.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);

        provinceModel = new ProvinceModel.Builder()
                .withName("یزد")
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Amir_Chakmak_mosque.jpg/225px-Amir_Chakmak_mosque.jpg")
                .build();
        dbHelper.insertProvince(provinceModel);
    }

    private void insertSouvenirs() {

        SouvenirModel souvenirModel;
        souvenirModel = new SouvenirModel.Builder()
                .withName("قرابیه")
                .withImageUrl("https://images.kojaro.com/2016/9/8997f2b2-5f3b-4179-a33d-78fb5230988b.jpg")
                .withProvince("آذربایجان شرقی")
                .withDescription("شیرینی سنتی تبریز است که طرفداران بی\u200Cشمارش، قنادهای سایر شهرها را نیز به پخت آن ترغیب کرده است. این شیرینی مجلسی و گران\u200Cقیمت مانند شیرینی نارگیلی مشهور، بدون آرد و با استفاده از مغزهای آسیاب شده پخته می\u200Cشود و غیر از مغز مورد نظر، شکر و سفیده\u200Cی تخم\u200Cمرغ مواد اصلی تهیه\u200Cی آن هستند. مغز مرسوم در تهیه\u200Cی قرابیه، بادام است اما قرابیه\u200Cهای پسته\u200Cای و گردویی نیز تولید می\u200Cشود.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("نوقا")
                .withImageUrl("https://images.kojaro.com/2016/9/3516a937-e5ef-4ce8-95f5-c4f597740139.jpg")
                .withProvince("آذربایجان شرقی")
                .withDescription("این شیرینی که در گویش محلی با نام «لوکا» هم شناخته می\u200Cشود، شیرینی بین\u200Cالمللی است که در کشورهای مختلفی همچون ایتالیا و فرانسه هم تولید می\u200Cشود و شباهت زیادی به گز دارد. نوقا انواع مختلفی دارد که وانیلی و کاکائویی آن از همه معروف\u200Cترهستند. این شیرینی مکعبی\u200Cشکل با سفیده\u200Cی زده شده\u200Cی تخم\u200Cمرغ و عسل تهیه می\u200Cشود و از مغز پسته یا گردو داخل آن استفاده می\u200Cشود.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("ریس")
                .withImageUrl("https://images.kojaro.com/2016/9/844f3df1-5532-4fff-87b3-29a52c50edb6.jpg")
                .withProvince("آذربایجان شرقی")
                .withDescription("از شیرینی\u200Cهای قدیمی تبریز است که در گویش محلی به آن «سوت شیرینی سی» گفته می\u200Cشود. اصلی\u200Cترین مواد تشکیل\u200Cدهنده\u200Cی ریس، شیر، شکر و پسته است. این شیرینی خوش\u200Cطعم در انواع مختلفی تولید می\u200Cشود که تسبیحی و کاکائویی آن طرفداران بیشتری دارند.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("باقلوا")
                .withImageUrl("https://images.kojaro.com/2016/9/fad67ec7-49da-4e53-915a-109df419bee0.jpg")
                .withProvince("آذربایجان شرقی")
                .withDescription("شیرینی سنتی اقوام ترک\u200Cزبان آسیای میانه به ویژه ترکمن\u200Cها بوده است که امروزه در بسیاری از کشورها مانند ترکیه، یونان، روسیه و... پخته می\u200Cشود و در ایران هم سوغاتی برخی از شهرها است. نوع تبریزی آن که به دلیل شیوه\u200Cی پختش به باقلوای استانبولی مشهور است، به همان روشی پخته می\u200Cشود که در ترکیه مرسوم است. این شیرینی به این دلیل که بعد از پخت به نوعی شربت آغشته می\u200Cشود، بسیار شیرین است و طرفداران خاص خود را دارد. باقلوا ترکیبی از هل، گلاب، خاک قند، شیر، آرد، روغن و زرده\u200Cی تخم\u200Cمرغ است. این شیرینی در شکل\u200Cهای لوزی، مربعی و لوله\u200Cای و با طعم\u200Cهای مختلفی مانند پسته\u200Cای، بادامی و نارگیلی تولید می\u200Cشود.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("راحت الحلقوم")
                .withImageUrl("https://images.kojaro.com/2016/9/768571b8-eb8c-456a-8983-38008fab2d47.jpg")
                .withProvince("آذربایجان شرقی")
                .withDescription("استفاده از این نوع شیرینی که خاستگاه آن کشور ترکیه است، در اعیاد و شب یلدا کنار آجیل بسیار مرسوم است. ماده\u200Cی اصلی در پخت آن نشاسته است و دو نوع ساده و مغزدار دارد. این شیرینی برای این\u200Cکه مورد توجه تمامی سلیقه\u200Cها قرار بگیرد، در رنگ\u200Cها و طعم\u200Cهای مختلف تولید می\u200Cشود.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("نقل")
                .withImageUrl("https://images.kojaro.com/2016/11/2aafecd0-56a2-4688-a168-f9e931cf28de.jpg")
                .withProvince("آذربایجان غربی")
                .withDescription("معروف\u200Cترین سوغات استان، به ویژه شهر ارومیه، نقل است که تولید آن در استان، سابقه\u200Cای دیرینه دارد. نقل نوعی شیرینی مغزدار است که روکش بیرونی آن از شیره\u200Cی شکر که با جوشاندن شکر در آب به دست می\u200Cآید، تهیه می\u200Cشود. نقل\u200Cها بر اساس مغز به کار رفته در آنها و همچنین طعم\u200Cدهنده\u200Cی روکش بیرونی، انواع گوناگونی دارند. مشهورترین نقل ارومیه، نقل بیدمشکی یا ابریشمی است. در این نوع نقل، مغز داخلی خلال\u200Cهای بادامی است که با گل\u200Cهای بیدمشک معطر شده است و طعم\u200Cدهنده\u200Cی روکش آن نیز عرق بیدمشک است. یکی دیگر از نقل\u200Cهای مشهور ارومیه، نقل زعفرانی است که مغز داخلی آن، گردوی خردشده است. امروزه مراکز تولید و عرضه\u200Cی نقل در ارومیه برای تامین سلیقه\u200Cی مشتریان، نقل\u200Cهای بسیار متنوعی تولید می\u200Cکنند. در این نقل\u200Cها از طعم\u200Cدهنده\u200Cهای طبیعی متفاوتی مانند دارچین، هل، گل محمدی، بذرهای گیاهی مانند زیره و تخم گشنیز و مغزهای گوناگون مانند پسته، بادام زمینی و فندق استفاده می\u200Cشود.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("حلوای هویج و گردو")
                .withImageUrl("https://images.kojaro.com/2016/11/47a390a6-7296-425f-99e8-75252785b5a1.jpg")
                .withProvince("آذربایجان غربی")
                .withDescription("این حلوا از قدیمی\u200Cترین حلواهای محلی استان است که تهیه\u200Cی آن برای مراسم شب یلدا، بسیار رواج دارد و علاوه بر پخت آن در منازل در کارگاه\u200Cهای حلواپزی نیز به صورت عمده تولید می\u200Cشود. این نوع حلوا بدون استفاده از آرد و با هویج و گردو پخته شده و با شیره\u200Cی انگور شیرین می\u200Cشود و طعم\u200Cدهنده\u200Cی آن، پودر هل و گلاب است.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("تخمه")
                .withImageUrl("https://images.kojaro.com/2016/11/f9e3056d-1180-4908-990b-dc70448b77c2.jpg")
                .withProvince("آذربایجان غربی")
                .withDescription("شهرستان خوی، بزرگ\u200Cترین تولیدکننده و صادرکننده\u200Cی تخمه\u200Cهای آفتابگردان و کدو در کشور است و ۷۰ درصد اراضی آبی این شهرستان، به کشت این محصولات اختصاص دارد. بازار تخمه و خشکبار خوی یکی از معروف\u200Cترین بازارهای اقتصادی ایران است و به عنوان بزرگ\u200Cترین بازار این محصولات در خاورمیانه، شناخته می\u200Cشود. مشاغل مرتبط با تولید و فروش تخمه\u200Cهای آجیلی، منبع درآمد تعداد زیادی از اهالی شهرستان خوی است. در این شهرستان، انواع تخمه آفتابگردان مانند شمشیری و دورسفید و انواع تخمه کدو مانند قلمی و گوشتی تولید می\u200Cشود.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("منبت\u200Cکاری")
                .withImageUrl("https://images.kojaro.com/2016/11/c95d4218-3e14-48cf-b2a2-778fbd4b205f.jpg")
                .withProvince("آذربایجان غربی")
                .withDescription("منبت\u200Cکاری چوب، یکی از صنایع دستی قدیمی استان و به ویژه شهر ارومیه است که با توجه به آثار به\u200Cجامانده، قدمتی بیش از یک قرن دارد. منبت\u200Cکاران استان، اغلب از چوب گردو برای تولیدات خود استفاده می\u200Cکنند. از آنجایی که چوب سنندج، رنگ مطلوب و جنس مرغوبی دارد، هنرمندان استان، چوب\u200Cهای مورد نیاز خود را در زمان برش درختان (پاییز و زمستان) از سنندج خریداری می\u200Cکنند. از طرح\u200Cهای مشهور منبت ارومیه، می\u200Cتوان به گل و بوته، گل و مرغ و ختایی اشاره کرد. حاصل تلاش این هنرمندان، انواع تابلوهای تزیینی، جعبه\u200Cها و ظروف چوبی است که مورد استقبال مسافران قرار می\u200Cگیرد. البته در سال\u200Cهای اخیر، برخی دیگر از هنرهای چوبی مانند معرق\u200Cکاری، قلم\u200Cزنی و پیکرتراشی نیز در ارومیه رونق گرفته است.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("حلوای سیاه (قره حلوا)")
                .withImageUrl("https://images.kojaro.com/2016/9/e62ab7b2-f8f5-4acb-80fc-7c7ed5ce31ce.jpg")
                .withProvince("اردبیل")
                .withDescription(" یکی از خوشمزه\u200Cترین شیرینی\u200Cهای سنتی استان اردبیل حلوای سیاه است که بسیار معروف است و تاریخچه\u200Cای حدود یک قرن دارد. مردم این شهر حلوا سیاه را هنگام سرما با چای نوش جان می\u200Cکنند.\nدر تهیه\u200Cی حلوا سیاه از شیره\u200Cی عسل، جوانه\u200Cی گندم، گردو، کره\u200Cی حیوانی، آرد سبوس\u200Cدار، پودر پسته و نارگیل استفاده می\u200Cشود. به گفته کارشناسان خوردن حلوا سیاه برای درد کمر و نیز افزایش وزن بسیار تاثیرگذار است. افرادی که به اردبیل سفر می\u200Cکنند از این شیرینی برای دوستان و اقوامشان سوغات می\u200Cبرند.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("حلوای زنجبیل")
                .withImageUrl("https://images.kojaro.com/2016/9/a7c2d559-8ba5-4a23-8343-dd10fabda4ef.jpg")
                .withProvince("اردبیل")
                .withDescription(" حلوا زنجبیل اردبیل یکی از شیرینی\u200Cهای لذیذ استان اردبیل است که مقوی است و از ارزش غذایی خوبی برخوردار است. این شیرینی لذیذ در برخی از مناطق دیگر کشور ایران چون استان گلستان و آذربایجان هم طبخ و توزیع می\u200Cشود و مردم از خوردن آن لذت می\u200Cبرند.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("قچکورگی")
                .withImageUrl("https://images.kojaro.com/2016/9/b0e2b47c-54d6-41de-9586-3532c1d1aeaa.jpg")
                .withProvince("اردبیل")
                .withDescription(" با فرارسیدن سال نو زنان هنرمندان اردبیلی با ذوق و سلیقه\u200Cی خود شیرینی\u200Cهای خوشمزه\u200Cای را طبخ می\u200Cکنند. قچکورگی یکی از این خوراکی\u200Cها است که عطر و طعم بی\u200Cنظیری دارد.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("گز")
                .withImageUrl("https://images.kojaro.com/2017/11/0f7d4b94-aa6d-4987-b6d1-77273967a2de.jpg")
                .withProvince("اصفهان")
                .withDescription("گز اصفهان، قدمتی طولانی و چند صد ساله دارد. قرن\u200Cها پیش، پادشاهان ایرانی، گز را به دیگر پادشاهان دنیا پیشکش می\u200Cکردند. در واقع قدمت گز به ۴۵۰ سال پیش و به زمان سلطنت صفویان برمی\u200Cگردد و مهم\u200Cترین سوغات اصفهان است. این شیرینی لذیذ، از ماده\u200Cای به نام گز انگبین تهیه می\u200Cشود.\nگز انگبین ریشه\u200Cی گیاهی به نام بته یا درخت گز است. ارتفاع این درخت کوهستانی حداکثر به دو متر می\u200Cرسد و بیشتر در مناطق خوش آب و هوای بختیاری و خوانسار در دامنه\u200Cی کوه\u200Cها به عمل می\u200Cآید. \n" +
                        "برای تهیه گز مرغوب نیمی از مواد مصرفی، دانه\u200Cهای گز گیاهی و نیمی دیگر شکر و مغز پسته و یا بادام و مواد دیگر استفاده می\u200Cشود. گاهی هم بنا به سفارش عده\u200Cای، ماده\u200Cای به نام شیر خشت به گز اضافه می\u200Cکردند و حتی به جای آب خالص در آن آب هندوانه می\u200Cریختند. این نوع گز سفارشی و مخصوص بوده که برای پادشاهان و رؤسای ممالک دیگر به عنوان سوغات فرستاده می\u200Cشده و در بازار یافت نمی\u200Cشد. اما گز بسیار مرغوب به علت کمبود و گرانی ماده اولیه، کمتر تهیه می\u200Cشود.\n" +
                        "قیمت این ماده بسیار بالا است و به همین دلیل چون قیمت محصول نهایی افزایش می\u200Cیابد امروزه از گلوکز، گلاب، شکر، سفیده تخم مرغ، انواع مغزها مثل  بادام، فندق، خلال و بیدمشک برای تهیه\u200Cی گز استفاده می\u200Cکنند و به جای انگبین، از ترنجبین، شیرخشت، عسل یا انگبین علفی استفاده می\u200Cشود.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("پولکی")
                .withImageUrl("https://images.kojaro.com/2017/11/031e4190-d387-430c-8290-8f4d8944564f.jpg")
                .withProvince("اصفهان")
                .withDescription("بعد از گز، یکی از معروف\u200Cترین شیرینی\u200Cها و سوغاتی های خوراکی اصفهان، پولکی است. این محصول نه فقط بین گردشگران، بلکه بین اهالی شهر هم بسیار محبوب است. پولکی از خانواده  آب\u200Cنبات است و چون ظاهری نازک و شفاف شبیه پولک دارد، به آن پولکی می\u200Cگویند.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("نبات")
                .withImageUrl("https://images.kojaro.com/2017/11/e0c313c7-3421-4ad1-a219-6582e33bbab5.jpg")
                .withProvince("اصفهان")
                .withDescription("نبات یکی دیگر از سوغاتی\u200Cهای اصفهان است که البته فقط مختص اصفهان نیست نبات را می\u200Cتوانید به شکل نبات شاخه یا نبات چوبی خریداری کنید. برای اینکه به نبات\u200Cها عطر و طعم متفاوتی بدهند و در آن تنوع ایجاد کنند از مواد مختلفی استفاده می\u200Cکنند. انواع نبات دارچینی، نعنایی، زعفرانی، زیره، لیمویی، آویشن و... در فروشگاه\u200Cهای اصفهان به فروش می\u200Cرسد.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("گوجه سبز کرج")
                .withImageUrl("https://www.eneshat.com/images/2018/12/karaj-02.jpg")
                .withProvince("البرز")
                .withDescription("گوجه سبز یکی از میوه های فصلی و بسیاااااار خوشمزه استان البرز است که می توانید آن را در فصل بهار به سوغات ببرید. گوجه سبز علاوه بر خوشمزگی خاصی که دارد، خواص و فواید زیادی را شامل می شود. گوجه سبز برای پاکسازی کبد بسیار عالیست، در ایجاد تعادل برای اسید معده نقش بسزایی دارد و بعلاوه سرشار از ویتامین C می باشد. گوجه سبز در اصل در شهرستان شهریار عمده ترین کاشت را دارد و پس از برداشت به استان های اطراف فرستاده می شود. گوجه سبز دارای فیبر است که به سیستم گوارشی کمک می کند.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("لبنیات طالقان")
                .withImageUrl("https://www.eneshat.com/images/2018/12/karaj-03.jpg")
                .withProvince("البرز")
                .withDescription("لبنیات طالقان یکی دیگر از سوغاتی های معروف کرج است که شهرت فراوانی دارد تا حدی که استان های اطراف کرج تمام محصولات لبی خود را از طالقان تهیه می کنند. روغن حیوانی طالقانی عطر و طعم دلپذیری دارد، برای صبحانه و وعده های غذایی از آن استفاده می کنند. دوغ محلی طالقان و ماست گوسفندی طالقان از واجبات سفره های استان البرز است.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("عناب کرج")
                .withImageUrl("https://www.eneshat.com/images/2018/12/karaj-01.jpg")
                .withProvince("البرز")
                .withDescription("عناب یکی دیگر از محصولات خوشمزه استان البرز است که به صورت تازه و خشک عرضه می گردد. عناب فواید زیادی برای بدن دارد و نکته حائز اهمیت این است که به علت ماندگاری بالای عناب خشک شما می توانید آن را به عنوان سوغاتی به همراه خود ببرید. از خواص عناب می توان به خاصیت آنتی اکسیدان آن برای ضدپیری، شفافیت پوست و رشد مو اشاره کرد. عناب دارای مقدار زیادی ویتامین بی، A و سی است.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("بژی برساق")
                .withImageUrl("https://images.kojaro.com/2018/11/6a690e9e-35db-422b-890c-953620d8c9ad.jpg")
                .withProvince("ایلام")
                .withDescription("بژی برساق نام یکی از شیرینی های سنتی و خوش آب و رنگ ایلام است که در قدیم به مناسبت های گوناگون از جمله جشن عروسی و نوروز درست می شد.\n" +
                        "امروزه بژی برساق یکی از مهم ترین سوغاتی های ایلام به شمار می آید که سفر به این استان بدون خرید این شیرینی کامل نمی شود.\n" +
                        "تردیدی نیست که آرد، شکر و روغن اساس همۀ شیرینی ها است اما آنچه که بژی را از دیگر شیرینی ها متمایز می کند، استفاده از آرد مرغوب و به دست آمده از گندمزارهای زیبای ایلام و روغن حیوانی اصیل است.\n" +
                        "شیر، رازیانه، زیره، زردچوبه و گاهی زعفران نیز از دیگر موادی هستند که بژی برساق را به ثمر می رسانند.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("کله کنجی")
                .withImageUrl("https://images.kojaro.com/2018/11/57086822-8fe1-461c-b67e-ff878215d6fd.jpg")
                .withProvince("ایلام")
                .withDescription("کله کنجی حلوایی بسیار مقوی، شیرین و خوش طعم است که از کنجد سفید و خرمای خشک تهیه می\u200Cشود. این حلوا در اکثر مناطق ایلام طبخ می\u200Cشود. کنجد تف داده شده را با خرمای بدون هسته مخلوط می\u200Cکنند و در هاون با دسته هاون چوبی که به آن (میه کت) می\u200Cگویند، آنقدری می\u200Cکوبند که لایه\u200Cای از روغن کنجد بالای حلوا پدیدار شود. پس از آن حلوا را به اشکال گوناگون تزیین کرده و مانند شیرینی سرو می\u200Cکنند.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("حلوای بگل")
                .withImageUrl("https://images.kojaro.com/2018/11/375affd8-ac8c-4e14-9245-4e187887e024.jpg")
                .withProvince("ایلام")
                .withDescription("حلوای بگل از مخلوط کنجد سفید، کشک پودر شده (بگل)، خرمای مرغوب و روغن محلی (دان) تهیه می\u200Cشود و یکی از شیرینی\u200Cهای سنتی و محلی محبوب این منطقه است.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("خرمای بوشهر")
                .withImageUrl("https://images.kojaro.com/2017/12/bb802eb9-f845-4cd3-942d-c612bd898125.jpg")
                .withProvince("بوشهر")
                .withDescription("کشت خرما در بوشهر به عصر هخامنشیان برمی\u200Cگردد، تولید خرما و فروش آن امروز به\u200Cعنوان یکی از مشاغل اصلی استان بوشهر به\u200Cحساب می\u200Cآید. از خرمای بوشهر فرآورده\u200Cهای بسیاری به دست می\u200Cآید که ازجمله آن\u200Cها می\u200Cتوان به شیره خرما، پنیر نخل، لواشک خرما، شهد خرما، سرکه خرما و بسیاری از فرآورده\u200Cهای دیگر اشاره کرد. خرما و فرآورده\u200Cهای آن تنها محصول درخت\u200Cهای خرما نیست، از درخت\u200Cهای خرما صنایع\u200Cدستی نظیر حصیر، زنبیل و کلاه هم تهیه می\u200Cشود.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("پنیر نخل")
                .withImageUrl("https://images.kojaro.com/2017/12/1ba01ebf-b363-4f1d-8fda-36c54ae28afa.jpg")
                .withProvince("بوشهر")
                .withDescription("پنیر نخل ماده\u200Cای ترد و سفیدرنگ است که درواقع بخش میانی درخت خرما است. پنیر خرما بسیار شیرین و خوشمزه است و علاوه بر بوشهر در جهرم، و هرمزگان تولید می\u200Cشود، در بوشهر به پنیر خرما «غاپ» هم می\u200Cگویند. برای به دست آوردن پنیر خرما یا همان غاپ ابتدا سردرخت را می\u200Cاندازند و برگ\u200Cها و لیف\u200Cهای دور برگ\u200Cها را تا رسیدن به میانه و پنیر درخت جدا می\u200Cکنند. این سوغاتی خوشمزه بسیار گران\u200Cقیمت است و سرشار از خاصیت! این سوغاتی لذیذ سرشار از قند، مواد معدنی، ویتامین و آهن است.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("گبه و گلیم")
                .withImageUrl("https://images.kojaro.com/2017/12/1a558177-b2f5-4f8e-bf33-cceb26327f1e.jpg")
                .withProvince("بوشهر")
                .withDescription("مشهورترین سوغات و محصول صنایع\u200Cدستی استان بوشهر گبه و گلیم صادراتی است که در بسیاری از روستاها بافت آن رواج دارد. گبه و گلیم بوشهر آوازه\u200Cای جهانی دارد و به بسیاری از کشورهای خارجی صادر می\u200Cشود. مراکز زیادی در استان بوشهر وجود دارد که گبه\u200Cبافی در آن رایج است ازجمله برترین مراکز گبه\u200Cبافی می\u200Cتوان به روستاهای شول، کمالى، بهمنیارى، محمد صالحی، عباسى، فخر آوری، کلر و چهار روستایى از توابع شهرستان گناوه اشاره کرد.\n" +
                        "و گلیم\u200Cبافی، این هنر در بیشتر روستاهای بوشهر جریان دارد، فصل بافت گلیم زمستان است و خانواده\u200Cهای روستایی در کنار کشاورزی و دام\u200Cپروری، اوایل پاییز شروع به چیدن فصل گوسفندها می\u200Cکنند و در فصل زمستان مشغول بافتن گلیم می\u200Cشوند.\n" +
                        "تار گلیم\u200Cهای روستایی اغلب از موی بز است که دارای استحکام بیشتری است ولی پود از پشم است.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("سفال")
                .withImageUrl("https://setare.com/files/fa/news/1396/9/1/103378_253.jpg")
                .withProvince("تهران")
                .withDescription("سفالگری از آن دسته از صنایع\u200Cدستی است که در بیشتر شهرهای ایران انجام می\u200Cشده است. تهران نیز به خاطر داشتن خاک رس بسیار مرغوب به یکی از بهترین تولید کنندگان سفال با کیفیت در ایران تبدیل شده است. اگر تمایل به این نوع کالاها دارید می\u200Cتوانید ظروف سفالی تهران را به عنوان سوغات با خود به خانه ببرید.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("چاپ باتیک")
                .withImageUrl("https://setare.com/files/fa/news/1396/9/1/103376_215.jpg")
                .withProvince("تهران")
                .withDescription("چاپ باتیک نوعی هنر چاپ روی پارچه است که بیشتر در شهرهای تبریز، اسکو و تهران رواج داشته است. در این نوع چاپ با استفاده از قالب\u200Cها، طرح\u200Cهای متفاوتی را روی پارچه چاپ می\u200Cکنند. برای این کار از رنگ\u200Cهای طبیعی چون زردچوبه، انار، روناک و اسپرک استفاده می\u200Cکنند. البته با توجه به وضعیت صنایع\u200Cدستی تهران، احتمال پیدا کردن این سوغاتی در تهران بسیار کم است!")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("ورنی بافی")
                .withImageUrl("https://setare.com/files/fa/news/1396/9/1/103374_794.jpg")
                .withProvince("تهران")
                .withDescription("ورنی نوعی زیرانداز خاص است که گویی با تلفیقی از فرش و گلیم پدید آمده است. اهر، مهم\u200Cترین شهر ایران در ورنی دوزی است اما با توجه به اینکه هنر را بیشتر عشایر انجام می\u200Cداده\u200Cاند، احتمالاً با کوچ خود به سمت تهران، ورنی بافی را به تهران نیز آورده\u200Cاند به\u200Cطوری که این هنر دستی جزئی از صنایع\u200Cدستی اصیل تهران تلقی می\u200Cشود.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("بادام")
                .withImageUrl("https://images.kojaro.com/2016/11/33ef5c42-6107-4825-a13e-b07ed8217387.jpg")
                .withProvince("چهارمحال و بختیاری")
                .withDescription("این استان یکی از مساعدترین مناطق برای کشت بادام است و با تولید بیش از ۱۵ درصد بادام کشور در میان استان\u200Cهای تولیدکننده\u200Cی بادام، پیشگام است. بیشترین تولید در استان مربوط به شهرستان سامان است که در حاشیه\u200Cی رودخانه\u200Cی زاینده\u200Cرود قرار دارد. در این استان انواع مختلفی از بادام کشت می\u200Cشود؛ مامایی، ربیعی، شاهرودی، سنگی، محبی و سفید. در میان انواع بادام استان، بادام مامایی که از انواع صادراتی بادام است بیشترین سطح زیر کشت را دارد. این نوع بادام، به کشورهای حوزه\u200Cی خلیج فارس، هند و... صادر می\u200Cشود.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("قارا (قره\u200Cقوروت)")
                .withImageUrl("https://media.isna.ir/content/1452324023371_17410t.png/3")
                .withProvince("چهارمحال و بختیاری")
                .withDescription("فرآورده\u200Cای لبنی و ترش است که از دوغ یا ماست تهیه می\u200Cشود و معمولا سیاه یا قهوه\u200Cای است. استان چهارمحال و بختیاری به ویژه شهرکرد، از مراکز مهم و اصلی تولید قره\u200Cقوروت در کشور است. مردان عشایر در این استان، به شکل سنتی دامپروری می\u200Cکنند و زنان عشایر با روش\u200Cهای بومی، لبنیات محلی تولید می\u200Cکنند. در بین این محصولات لبنی، قره\u200Cقوروت، بیشترین فروش را دارد و همواره مورد استقبال مسافران قرار می\u200Cگیرد.\n" +
                        "نوع دیگری از قره\u200Cقوروت نیز در این استان تولید می\u200Cشود که برخلاف نوع رایج، شیرین است. این نوع قره\u200Cقوروت، که به قارابشکن شهرت دارد، از آب\u200Cپنیر تهیه می\u200Cشود و رنگ روشنی دارد.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("نمدمالی")
                .withImageUrl("https://kaloot.org/wp-content/uploads/2016/12/namadmali-kaloot.jpg")
                .withProvince("چهارمحال و بختیاری")
                .withDescription("این استان قطب تولید نمد در کشور است و نمدمالی در آن سابقه\u200Cای دیرینه دارد و قدیمی\u200Cترین صنایع دستی استان است. شهرستان\u200Cهای شهرکرد و بروجن، بیشترین نمد را تولید می\u200Cکنند و برخی از محصولات نمدی تولید شده در این شهرستان\u200Cها به خارج از کشور صادر می\u200Cشود. در سال\u200Cهای اخیر، استقبال از محصولات نمدی باعث شده تا علاوه بر تولید نمد به شیوه\u200Cی سنتی (نمدمالی) تولید کارگاهی و صنعتی نمد نیز در استان رواج پیدا کند.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("زرشک")
                .withImageUrl("http://www.fardanews.com/files/fa/news/1395/8/17/432608_794.jpg")
                .withProvince("خراسان جنوبی")
                .withDescription("کشور ایران بزرگ\u200Cترین تولیدکننده\u200Cی زرشک در دنیا است و شهرستان قائنات استان خراسان جنوبی با دارا بودن ۹۷ درصد از اراضی زیرکشت این محصول، ۹۵ درصد زرشک کشور را تولید می\u200Cکند. برداشت زرشک از مهر آغاز می\u200Cشود. به دلیل تیغ\u200Cدار بودن درختچه\u200Cی زرشک، برداشت آن کار بسیار دشواری است به همین جهت، تمامی اعضای خانواده\u200Cی کشاورزان در آن شرکت دارند. زرشک بی\u200Cدانه\u200Cی قائنات از سوغاتی\u200Cهای پرطرفدار استان خراسان جنوبی است.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("زعفران")
                .withImageUrl("http://www.fardanews.com/files/fa/news/1395/8/17/432609_278.jpg")
                .withProvince("خراسان جنوبی")
                .withDescription("این گیاه خوش\u200Cرنگ، از گیاهان بومی ایران است و به دلیل محدودیت در کشت و تولید، جزو مواد غذایی گران\u200Cقیمت به شمار می\u200Cرود. از آنجایی که زعفران در مناطق کویری به عمل می\u200Cآید به «طلای سرخ کویر» شهرت دارد. ایران مقام اول تولید زعفران را در جهان دارد و بیش از ۹۰ درصد از مجموع تولید جهانی را به خود اختصاص داده است. استان خراسان جنوبی بعد از استان خراسان رضوی، دومین تولیدکننده\u200Cی زعفران در ایران است و کشت زعفران در این استان، بیش از ۷۰۰ سال قدمت دارد. زعفران این استان از نظر کیفیت (عطر و رنگ\u200Cدهی) نسبت به زعفران استان خراسان رضوی، مرغوب\u200Cتر است و شهرستان قائنات این استان به عنوان پایتخت زعفران جهان، شناخته می\u200Cشود.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("برک\u200Cبافی")
                .withImageUrl("http://www.asrefarsh.com/d/2018/12/23/3/4291.jpg")
                .withProvince("خراسان جنوبی")
                .withDescription("برک نوعی پارچه\u200C است که از پشم شتر یا موی بز بافته می\u200Cشود و در گویش محلی به آن، کرکی یا کورگی می\u200Cگویند. این پارچه\u200Cی نرم و ضخیم که با دستگاه\u200Cهای نساجی سنتی بافته می\u200Cشود از لطافت و استحکام بسیار مطلوبی برخوردار است. برک، معمولا برای دوخت لباس زمستانی به ویژه کت مردانه استفاده می\u200Cشود. در گذشته، خیاطان از نوع اعلای آن که به شمشیرک معروف بوده است، برای حاکمان، جامه\u200Cهایی فاخر می\u200Cدوختند. برک، رنگرزی نمی\u200Cشود و به اصطلاح، خودرنگ است. این پارچه در رنگ\u200Cهای قهوه\u200Cای، سیاه، سفید، شیری و خاکستری بافته می\u200Cشود. برک\u200Cبافی از قدیمی\u200Cترین صنایع دستی استان خراسان جنوبی است که قدمت آن به قبل از دوره\u200Cی سلجوقی برمی\u200Cگردد و توصیف آن در سفرنامه\u200Cهای سیاحان خارجی آمده است. این نساجی سنتی، که در برخی از شهرستان\u200Cهای استان مانند بشرویه بسیار رواج داشته است، امروزه نیز در گوشه و کنار استان دیده می\u200Cشود. در سال\u200Cهای اخیر، با همکاری بافندگان و نهادهای مرتبط، اقدامات خوبی برای رونق برک\u200Cبافی صورت گرفته است.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("انگشترسازی و فیروزه\u200Cتراشی\n")
                .withImageUrl("https://images.kojaro.com/2016/11/d8f0b7fc-4209-49de-948b-ba9e4b94aa1c.jpg")
                .withProvince("خراسان رضوی")
                .withDescription("انگشتر به دست کردن از زمان\u200Cهای قدیم بین مسلمانان رواج داشته است. به خصوص که امامان معصوم ما در احادیث و روایات، به پسندیده بودن این سنت و خواص سنگ\u200Cهای گوناگون اشاره کرده\u200Cاند.  \n" +
                        "بسیاری از زائران امام رضا (ع) برای خود و نزدیکانشان این انگشترهای ارزشمند را به عنوان سوغات تهیه می\u200Cکنند و این هنر اصیل و سنتی مورد استقبال مسافران قرار دارد. فن و هنر انگشترسازی در واقع، آمیخته\u200Cای از فنون و هنرهای متعدد از جمله طراحی سنتی، گوهرشناسی، میناکاری، فلزکاری، مرصع\u200Cکاری و هنر ارزنده\u200Cی قلم\u200Cزنی است.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("سجاده، جانماز، مهر و تسبیح")
                .withImageUrl("https://images.kojaro.com/2016/11/531d2d64-5dbe-46b7-a563-68fd3b27b4cc.jpg")
                .withProvince("خراسان رضوی")
                .withDescription("از آن جایی که بیشتر مسافران این استان، زوار امام رضا (ع) هستند و مرکز این استان یعنی شهر مشهد یک شهر مذهبی است، در فروشگاه\u200Cهای اطراف حرم و به ویژه بازار رضا، انواع سجاده، جانماز، مهر و تسبیح به فروش می\u200Cرسد. سجاده\u200Cها بیشتر از جنس ترمه و مخمل گلدوزی شده هستند. تسبیح\u200Cها نیز با جنس\u200Cهای مختلف و انواع گوناگون از جمله عقیق، شاه\u200Cمقصود، دلربا، فیروزه، ام\u200Cالبنین و کهربا عرضه می\u200Cشوند.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("عطر")
                .withImageUrl("https://images.kojaro.com/2016/11/550c253e-27ac-4953-801e-71900a54f3a2.jpg")
                .withProvince("خراسان رضوی")
                .withDescription("یکی از محصولاتی که در این استان به عنوان سوغات ارائه می\u200Cشود، انواع عطر است. به خصوص در شهر مشهد و خیابان\u200Cها و بازارهای اطراف حرم، تعداد زیادی از مغازه\u200Cهای عطرفروشی را خواهید دید که انواع مختلف عطر با رایحه\u200Cهای گوناگون از جمله گل سنجد، کبری، گل مریم، گل نرگس، بهارنارنج، الهام\u200Cبخش، زعفران، گل یخ، یاس سفید و... را به مسافران عرضه می\u200Cکنند.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("آب\u200Cنبات")
                .withImageUrl("https://images.kojaro.com/2016/11/a5bb5fd5-9f76-4042-bca1-4869113554c2.jpg")
                .withProvince("خراسان شمالی")
                .withDescription("معروف\u200Cترین سوغات خراسان شمالی به ویژه بجنورد، انواع آب\u200Cنبات است که قدمت تولید آنها به روش سنتی در کارگاه\u200Cهای محلی استان به بیش از یک قرن می\u200Cرسد و مصرفشان به جای قند کنار چای بین اهالی بسیار رواج دارد. قدیمی\u200Cترین نوع آب\u200Cنبات تولیدشده در این استان، آب\u200Cنبات قیچی است که به دلیل برش با قیچی\u200Cهای بزرگ سنتی، به این نام مشهور است. مشهورترین آب\u200Cنبات استان، شکرپنیر است. ماده\u200Cی اصلی تشکیل\u200Cدهنده\u200Cی آب\u200Cنبات، ماده\u200Cای سفیدرنگ شبیه به خمیر است که از جوشاندن شکر با آب، تهیه می\u200Cشود. آب و شکر را می\u200Cجوشانند تا به غلظت مورد نظر برسد سپس این ماده\u200Cی قرمزرنگ را با کشیدن و ورز دادن به خمیری سفیدرنگ تبدیل می\u200Cکنند. البته در برخی از انواع آب\u200Cنبات مانند شکرپنیر از مقدار کمی آرد برنج یا گندم و در بعضی دیگر از سفیده\u200Cی تخم\u200Cمرغ نیز در تهیه\u200Cی خمیر استفاده می\u200Cشود. مشهورترین طعم\u200Cهای آب\u200Cنبات خراسان شمالی که از قدیم رواج داشته\u200Cاند، هل\u200Cدار، دارچینی و زنجبیلی هستند اما امروزه آب\u200Cنبات\u200Cهای این استان در طعم\u200Cهای دیگر مانند نارگیلی، پسته\u200Cای و کاکائویی نیز تولید می\u200Cشوند.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("انگور")
                .withImageUrl("https://images.kojaro.com/2016/11/e53f9f70-583e-47cb-ad8c-1a1649800daf.jpg")
                .withProvince("خراسان شمالی")
                .withDescription("استان خراسان شمالی، ششمین تولیدکننده\u200Cی انگور کشور است و از نظر سطح زیر کشت این محصول، رتبه\u200Cی پنجم کشور را دارد. از این تاکستان\u200Cها، که نیمی از باغ\u200Cهای استان را تشکیل می\u200Cدهند، ۱۰ درصد از انگور کشور برداشت می\u200Cشود. این استان از نظر تنوع محصول نیز جزو استان\u200Cهای برتر کشور است و انواع بسیاری در آن کشت می\u200Cشود. مهم\u200Cترین انواع انگور استان عبارت\u200Cاند از کلاهداری، بی\u200Cدانه\u200Cی سلطانی، شصت عروس، لعل، خلیلی، صاحبی، عسگری، سفید، صابونی و یاقوتی.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("فرش دورو")
                .withImageUrl("https://images.kojaro.com/2016/11/641106bb-8c03-43fd-8d2d-4822489d55db.jpg")
                .withProvince("خراسان شمالی")
                .withDescription("بافت این نوع فرش، مختص به ترکمن\u200Cهای استان خراسان شمالی است و این نوع فرش در سایر اقوام ترکمن و مناطق دیگر کشور، بافته نمی\u200Cشود. روستای دویدوخ علیا، از توابع شهرستان رازوجرگلان، خاستگاه اصلی فرش دوروی ترکمنی است. این نوع فرش با نخی ابریشمی بافته می\u200Cشود که با رنگ\u200Cهای طبیعی، رنگرزی شده است. بخشی از نخ\u200Cهای مورد نیاز بافندگان توسط نوغان\u200Cداران روستا تولید می\u200Cشود و بخشی دیگر به صورت خام (رنگ نشده) از مناطق دیگر تامین می\u200Cشود و رنگرزی تمام آنها در روستا انجام می\u200Cشود. برای بافت فرش دورو که هر طرف آن، نقشه\u200Cی متفاوتی دارد، دو بافنده پشت دار می\u200Cنشینند و به صورت هم\u200Cزمان، فرش را می\u200Cبافند. عمده تفاوت این فرش با فرش یک\u200Cرو در روش بافت، مربوط به چله\u200Cکشی است. از طرح\u200Cهای مشهور فرش دورو، یموت، چهارفصل، قرقچاق، قاپ\u200Cقاپی و ترنج است. البته فرش دورو به دلیل دشواری و طولانی بودن زمان بافت، در اندازه\u200Cهای بزرگ بافته نمی\u200Cشود و معمولا در ابعاد قالیچه تولید می\u200Cشود. حاصل دسترنج زنان ترکمن این خطه از کشور، قالیچه\u200Cهایی نفیس و مرغوب است که طرفداران زیادی در کشورهای جنوب شرق آسیا و کشورهای اروپایی دارد و پای گردشگران خارجی را به این منطقه، باز کرده است.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("مرکبات دزفول")
                .withImageUrl("https://img9.irna.ir/old/Image/1396/13961005/82776288/N82776288-72075932.jpg")
                .withProvince("خوزستان")
                .withDescription("دزفول در زمینه\u200Cی کشاورزی، جزو مناطق برتر کشور است. بخش غیرکوهستانی دزفول، پرآب\u200Cترین منطقه\u200Cی کشاورزی در استان خوزستان است. خاک حاصلخیز و آب فراوان، شرایط مناسبی را برای کشت انواع مرکبات، صیفی\u200Cجات و گل فراهم کرده است. علاوه بر تنوع بی\u200Cنظیر محصولات کشاورزی در دزفول (بیش از ۶۰ نوع محصول) این منطقه در زمینه\u200Cی تولید و صادرات گل\u200Cهای رز و مریم، رتبه\u200Cی اول کشور را دارد. بیش از ۱۲ نوع مرکبات در دزفول تولید می\u200Cشوند که مشهورترین آنها پرتقال بومی یا محلی است. این نوع پرتقال، سالم\u200Cترین و مرغوب\u200Cترین پرتقال کشور است و به دلیل طعم شیرین و بوی خوش، طرفداران زیادی در سراسر کشور دارد. پرتقال بومی دزفول، پرتقالی آب\u200Cدار با اندازه\u200Cی متوسط است که هسته\u200Cهای زیادی دارد. برداشت پرتقال بومی دزفول، از آذر شروع می\u200Cشود و تا اواسط اسفند ادامه دارد. هم\u200Cزمان با فصل برداشت، در تمامی بازارهای محلی استان، پرتقال دزفولی عرضه می\u200Cشود.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("کپوبافی")
                .withImageUrl("https://images.kojaro.com/2016/10/66a46757-afd4-4154-8430-c43a000d44e3.jpg")
                .withProvince("خوزستان")
                .withDescription("از صنایع دستی مرسوم در جنوب ایران است که در استان خوزستان به ویژه شهرستان دزفول، رواج دارد. کپوبافی در واقع نوعی حصیربافی است که در آن از کاموای رنگی برای تزیین بافته\u200Cهای حصیری استفاده می\u200Cکنند. البته شیوه\u200Cی بافت نیز در کپوبافی با حصیربافی رایج متفاوت است. در این روش بافت که به بافت فتیله\u200Cای شهرت دارد و استحکام بیشتر و قابلیت شکل\u200Cدهی بهتر از ویژگی\u200Cهای آن است، الیاف تهیه شده از برگ خرما را به دور نوعی نی مردابی به نام «کرتک» می\u200Cپیچند. تزیین با کاموا در کپوبافی به دو صورت انجام می\u200Cشود؛ زمینه\u200Cی حصیری با نقوش هندسی روی آن و تزیین تمام سطح به نحوی که حصیر دیده نمی\u200Cشود. عمده\u200Cی محصولات کپوبافی شده، ظروف درب\u200Cدار کروی به عنوان سبد و ظروف مسطح تزیینی است. سبدهای کپوبافی شده که برای زیبایی و سهولت در باز کردن درب آنها، منگوله\u200Cای کاموایی به درب\u200Cشان متصل می\u200Cکنند، کاربردهای مختلفی دارند؛ جای نان، جای لوازم خیاطی و...\n" +
                        "در سال\u200Cهای اخیر، با توجه به استقبال فراوان مسافران و گردشگران، کپوبافان استان، که اغلب زنان روستایی هستند و از این طریق به اقتصاد خانواده کمک می\u200Cکنند، بر تنوع محصولات خود افزوده\u200Cاند.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("گلیم افشار خوزستان")
                .withImageUrl("https://images.kojaro.com/2016/10/35f26571-ddc5-4e16-9a74-be59da13a143.jpg")
                .withProvince("خوزستان")
                .withDescription("هنر دست عشایر عرب و بختیاری استان است که معمولا روی دارهای افقی و در برخی مناطق روی دارهای عمودی بافته می\u200Cشود. این نوع گلیم پودهای پشمی زبر و تارهای پنبه\u200Cای دارد و از نظر تنوع رنگ، رنگ\u200Cهای محدودی در آن به کار می\u200Cرود که بیشتر آنها تیره هستند. گلیم افشار خوزستان، معمولا به روش بافت چاک\u200Cدار بافته می\u200Cشود اما برخی از هنرمندان استان آن را به روش بافت متصل جفت\u200Cقلاب می\u200Cبافند. کناره\u200Cپیچی یا شیرازه\u200Cدوزی این گلیم به روش شیرازه لول انجام می\u200Cشود و بافت ریشه\u200Cهایش از نوع گیس\u200Cبافت ضخیم است. در این گلیم که حاشیه\u200Cای باریک دارد، طرح\u200Cهای هندسی (عمدتا لوزی) در قالب نقشه\u200Cای ساده، روی زمینه\u200Cای یک\u200Cدست قرار گرفته\u200Cاند.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("نان اردک")
                .withImageUrl("https://images.kojaro.com/2018/1/b183f32f-f9db-4420-a3f6-7eead362ede4.jpg")
                .withProvince("زنجان")
                .withDescription("نان اردک زنجان نوعی نان سنتی است که در ابتدا توسط زنان پخت می\u200Cشد، اکنون در قنادی\u200Cها و کارگاه\u200Cهای شیرینی\u200Cپزی شهر زنجان درست می\u200Cشوند. آرد نان بربری، تخم\u200Cمرغ، شیر، شکر، بکینگ پودر و روغن موادی هستند که در تهیه\u200Cی نان اردک استفاده می\u200Cشوند. گاهی متناسب باسلیقه\u200Cی آشپز در تهیه آن آب\u200Cپنیر هم بکار برده می\u200Cشود. بعدازاینکه با مواد گفته\u200Cشده خمیر درست شد آن را در داخل روغن سرخ می\u200Cکنند و پس\u200Cازآن نان آماده خوردن می\u200Cشود. البته آنچه درگذشته پخت می\u200Cشد بدون تخم\u200Cمرغ و بکینگ پودر بوده و درروش تهیه امروزی آن این مواد استفاده می\u200Cشود")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("سقز")
                .withImageUrl("https://images.kojaro.com/2018/1/a0f2cfc2-06c5-407f-b2d6-ea66fe604508.jpg")
                .withProvince("زنجان")
                .withDescription("سقز، صمغ یا شیره غلیظ درختی به نام بنه یا درخت پسته وحشی است که در فصل پاییز به\u200Cطور طبیعی یا با دادن شکاف از آن خارج می\u200Cشود. این ماده علاوه بر اینکه مانند آدامس مورداستفاده قرار می\u200Cگیرد دارای خواصی همچون کمک به هضم غذا، رفع بوی بددهان و جلوگیری از پوسیدگی دندان\u200Cها نیز است. همچنین از آن به\u200Cعنوان ضماد (مرهم زخم) نیز استفاده می\u200Cکنند.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("چاقو")
                .withImageUrl("https://images.kojaro.com/2018/1/1d5b50c9-13d4-4d04-aaa4-4684165b53ab.jpg")
                .withProvince("زنجان")
                .withDescription("از معروف\u200Cترین صنایع\u200Cدستی زنجان ساخت چاقو است که در سطح کشور شهرت بسیاری دارد. این هنر به مدت\u200Cها پیش بازمی\u200Cگردد که نسل به نسل، به هنرمندان معاصر انتقال\u200Cیافته است. باوجود وارد شدن ابزارهایی برای ساخت چاقو از زحمت هنرمندان این عرصه کاسته شده است و همچنان کیفیت بالایی دارد. چون در ساخت چاقو قدرت بدنی زیادی بکار گرفته می\u200Cشود، معمولاً جوانان مشغول این کار هستند و استادکاران قدیمی به آموزش می\u200Cپردازند. چاقوها معمولاً از فولاد استیل محکم و ضدزنگ درست می\u200Cشوند که بعد از اجرای عملیاتی همچون چکش\u200Cکاری و حرارت دادن به فلز سختی تبدیل می\u200Cشوند و بر برش و تیز بودن چاقو مؤثر است. تناسب، ظرافت، قدرت دربرش و نحوه\u200Cی آبکاری فلز ازجمله مشخصات برجسته چاقوی زنجان است.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("منبت چوب")
                .withImageUrl("https://images.kojaro.com/2016/10/ca2cc047-44cd-4c1f-b165-a7226cf370d2.jpg")
                .withProvince("سمنان")
                .withDescription("منبت، ایجاد نقش\u200Cهای برجسته روی چوب از طریق کنده\u200Cکاری است. با توجه به آثار به\u200Cجای\u200Cمانده در برخی از اماکن مذهبی، منبت\u200Cکاری در استان سمنان، قدمتی بیش از ۲۰۰ سال دارد. امروزه نیز دسترسی به چوب\u200Cهای جنگلی به دلیل وجود راه\u200Cهای ارتباطی فراوان در استان با شمال کشور، موجب توسعه و رواج این صنعت در استان شده است به نحوی که شغل بیشتر اهالی در برخی از روستاها، منبت\u200Cکاری است.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("چاپ قلمکار")
                .withImageUrl("https://images.kojaro.com/2016/10/a2f39f91-b55b-4677-9bc5-d057864df323.jpg")
                .withProvince("سمنان")
                .withDescription("نوعی چاپ سنتی با استفاده از قالب\u200Cهای چوبی دارای نقوش برجسته است. شهرستان دامغان از مراکز صاحب امتیاز این صنعت به شمار می\u200Cرود و تولیدات آن از نظر کمی و کیفی قابل توجه هستند. رومیزی\u200C، پرده، سفره و سایر اقلام تزیین شده با چاپ قلمکار در دامغان، به خارج از کشور صادر می\u200Cشود.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("پسته")
                .withImageUrl("https://images.kojaro.com/2016/10/31e22682-c5e8-44c9-aa3f-5773592b2570.jpg")
                .withProvince("سمنان")
                .withDescription("تولید پسته در دامغان، قدمتی بیش از ۷۰۰ سال دارد. هم\u200Cزمان با فصل برداشت پسته یعنی از اوایل مرداد تا اواخر مهر، علاوه بر داخل شهر، در مسیرهای منتهی به شهر دامغان نیز، این محصول صادراتی به صورت تازه و در مابقی ایام سال به صورت خشک به مسافران عرضه می\u200Cشود.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("شیرینی لندو")
                .withImageUrl("https://images.kojaro.com/2016/11/305718ce-9ce2-4a8c-8bf2-a026d5167971.jpg")
                .withProvince("سیستان و بلوچستان")
                .withDescription("تهیه\u200Cی این شیرینی سنتی و بومی، برای پذیرایی از مهمانان در مناطق مختلف استان رواج دارد. لندو، از ترکیب خرما، گندم و کنجد تهیه می\u200Cشود به این صورت که پس از مخلوط کردن خرمای هسته گرفته شده، گندم داغ (برشته) و کنجد، مواد را زیر بار سنگین می\u200Cگذارند تا سفت شوند و حالت چسبندگی پیدا کنند. این مرحله از تهیه\u200Cی لندو به زمان زیادی نیاز دارد و مواد باید حداقل نصف روز، زیر بار بمانند. پس از اینکه مواد زیر بار به یکدیگر چسبیدند، از زیر بار برداشته می\u200Cشوند و به اشکال مختلف (عمدتا توپی شکل) آماده می\u200Cشوند.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("سوزن\u200Cدوزی")
                .withImageUrl("https://images.kojaro.com/2016/11/8eb41071-f4d6-4ca3-895c-74dcf59f0b4c.jpg")
                .withProvince("سیستان و بلوچستان")
                .withDescription("از رودوزی\u200Cهای سنتی ایران است که در بین زنان بلوچ رواج دارد و دارای شهرت جهانی است. سوزن\u200Cدوزی یکی از قدیمی\u200Cترین روش\u200Cهای تزیین جامه و بسیاری از منسوجات دیگر است. هنرمندان در این هنر سنتی، با استفاده از انواع نخ\u200Cهای رنگی و به کمک سوزن و قلاب، با دوختن بخیه\u200Cهای ظریف روی پارچه، طرح\u200Cهای تزیینی گوناگونی را ترسیم می\u200Cکنند. سوزن\u200Cدوزی، با توجه به جنس پارچه و طرح مورد نظر، به روش\u200Cهای مختلفی انجام می\u200Cشود. البته تمام پارچه\u200Cهای به کار رفته در سوزن\u200Cدوزی، یک ویژگی مشترک دارند و آن هم تار و پود مشخص و راست آن\u200Cها است. سوزن\u200Cدوزی روی پارچه\u200Cهای کج\u200Cراه، انجام نمی\u200Cشود. سوزن\u200Cدوزی در استان سیستان و بلوچستان که به سوزن\u200Cدوزی بلوچی معروف است به دو دسته تقسیم می\u200Cشود: سوزن\u200Cدوزی مناطق شمالی استان که وجود رنگ\u200Cهای روشن و طرح\u200Cهای ساده ویژگی آن است و سوزن\u200Cدوزی مناطق جنوبی استان که در آن از رنگ\u200Cهای تیره\u200Cتر استفاده می\u200Cشود و طرح\u200Cهایی پیچیده با نقوش ریز و فراوان دارد.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("سفالگری")
                .withImageUrl("https://images.kojaro.com/2016/11/48d3015c-b48d-4156-b022-e4a82247fbe8.jpg")
                .withProvince("سیستان و بلوچستان")
                .withDescription("ساخت ظروف با گل، از نخستین صنایع دستی بشر بوده\u200C است و سفالینه\u200Cها از قدیمی\u200Cترین ظروف انسان هستند. سفالگری در ایران از سابقه\u200Cی درخشان و دیرینه\u200Cای برخوردار است. این صنعت در ایران بیش از ۱۰ هزار سال قدمت دارد و قدیمی\u200Cترین ظروف سفالی منقوش، قدیمی\u200Cترین چرخ سفالگری و قدیمی\u200Cترین کوره\u200Cی پخت سفال در جهان، مربوط به ایران است.\n" +
                        "روستای کلپورگان از توابع شهرستان سراوان استان سیستان و بلوچستان، از مناطقی است که به صنعت سفالگری مشهور است. از دلایل شهرت سفالگری در این روستا یکی این است که زنان بلوچ، عهده\u200Cدار ساخت سفالینه\u200Cها هستند و دیگر آن که سفالگری در این روستا به سنتی\u200Cترین روش و بدون استفاده از چرخ انجام می\u200Cشود. مردان روستا کار برداشت و حمل خاک و آماده کردن گل را بر عهده دارند و سایر مراحل سفالگری را زنان روستا انجام می\u200Cدهند. حاصل دسترنج زنان بلوچ روستای کلپورگان، انواع ظروف سفالی کاربردی و تزیینی است که مورد توجه مسافران قرار می\u200Cگیرد.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("مسقطی")
                .withImageUrl("https://images.kojaro.com/2017/11/04f69fcd-be34-450e-a603-e53cf3952280.jpg")
                .withProvince("فارس")
                .withDescription("یکی از مشهورترین سوغاتی\u200Cهای خوراکی شیراز، مسقطی است. مسقطی در واقع نوعی حلوا است که با نشاسته و مغز پسته تهیه می\u200Cشود. مسقطی انواع و طعم\u200Cهای مختلفی دارد مثلا زعفرانی، پسته\u200Cای، گل محمدی، زرشکی و...\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("کلوچه شیرازی")
                .withImageUrl("http://www.10320.ir/uploads/posts/1471273752_cook-2304.jpg")
                .withProvince("فارس")
                .withDescription("کلوچه\u200Cی شیرازی معمولا در کنار مسقطی به فروش می\u200Cرسد و نوعی شیرینی لذیذ شبیه به شیرینی برنجی است که به آن کلوچه می\u200Cگویند. بسته بندی\u200Cهای کلوچه مسقطی با هم به فروش می\u200Cرسد و معمولا این دو سوغاتی لذیذ را در کنار هم سرو می\u200Cکنند. این شیرینی بسیار لطیف و خوشمزه است و غالبا با تخم خرفه تزیین می\u200Cشود.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("خاتم کاری")
                .withImageUrl("https://images.kojaro.com/2017/11/49d9346d-f5e1-400b-b02b-a21af71dfb02.jpg")
                .withProvince("فارس")
                .withDescription("خاتم\u200Cکاری یکی از ظریف\u200Cترین و زیباترین هنرهای دستی ایرانی است. این هنر ارزشمند از کنار هم قرار دادن تکه\u200Cهای چوبی منظم و ظریف در رنگ ها و جنس\u200Cهای مختلف درست می\u200Cشود. برای ساخت آثار خاتم از متریال\u200Cهای مختلفی مثل عاج، استخوان، انواع چوب و طلا درست می\u200Cشود. این هنر بسیار زیبا البته پرزحمت است و به دقت و صبرفراوانی احتیاج دارد. این هنر سابقه\u200Cای طولانی دارد و دوران اوج و شکوفایی آن مربوط به عصر صفویه است.این هنر بیشتر در آباده رواج و شهرت دارد.\n" +
                        "انواع قلمدان، جعبه\u200Cهای تزیینی، گلدان، جای قاشق و چنگال، جعبه\u200Cهای دستمال کاغذی و سایر اشیای خاتم\u200Cکاری شده را می\u200Cتوانید از بازارها و مراکز خرید شیراز خریداری کنید.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("نان چایی")
                .withImageUrl("https://images.kojaro.com/2018/10/66469e06-09f0-4abf-b71d-38fd4c007de7.jpg")
                .withProvince("قزوین")
                .withDescription(" نان چایی قزوین شیرینی خشک و سنتی است که بانوان هنرمند قزوین آن را برای عید نوروز و دیگر مراسم خود درست می\u200Cکنند، روی نان را با کنجد یا مغز پسته می پوشانند.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("نان نازک قزوین")
                .withImageUrl("https://images.kojaro.com/2018/10/ec0d53b9-524f-4fa6-ad5a-ef709503c212.jpg")
                .withProvince("قزوین")
                .withDescription("این نان نیز همچنین در بین مردم قزوین طرفداران زیادی دارد.\n" +
                        "نان نازک بسیار ترد است و با توجه به مغزهایی که داخل آن ریخته می شود به شیرینی نازک پسته\u200Cای، نازک گردوئی و نازک بادامی تقسیم می\u200C\u200Cشود و شما با توجه به علاقه خود آن را انتخاب کنید.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("نان چرخی قزوین")
                .withImageUrl("https://images.kojaro.com/2018/10/3baf2728-3d00-44fc-a64e-6f240ddc01d0.jpg")
                .withProvince("قزوین")
                .withDescription("نان چرخی قزوین شباهت بسیاری به نان چایی دارد همانطور که از نامش مشخص است با چرخ دستی مخصوص، چرخ می\u200Cکنند روی نان چرخی با تخم خرفه یا پسته پوشانده می\u200Cشود.\n" +
                        "این شیرینی بسیار خوشمزه است.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("سوهان")
                .withImageUrl("https://images.kojaro.com/2017/12/2ea47d7c-53b0-4c07-a0c1-d9293bd611a8.jpg")
                .withProvince("قم")
                .withDescription("سوهان گونه\u200Cای شیرینی ایرانی و به سخن دیگر، نوعی حلوا است که از جوانه گندم تهیه می\u200Cشود.تاریخچه دقیق اولین سوهان در شهر قم به دوره قاجار نسبت داده می\u200Cشود؛ حلوایی که در سال\u200Cهای ۱۲۸۹ تا ۱۲۹۰ هجری خورشیدی هنگامی\u200Cکه قرار بود صحن عقیق بارگاه حضرت معصومه در شهر مقدس قم افتتاح شود.\n" +
                        "بزرگان قم اقدام به برگزاری مراسم باشکوهی جهت افتتاح به عمل آوردند و قرار بود ناصرالدین\u200Cشاه خود برای افتتاح حاضر شود، ولی براساس مقتضیات زمان به\u200Cخصوص مسائل امنیتی آن زمان، ناصرالدین\u200Cشاه جانشینی (رئیس ایل قاجار) را به\u200Cجای خود جهت مراسم افتتاح به قم فرستاد.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("حلوا")
                .withImageUrl("https://images.kojaro.com/2017/12/23d421b7-c11b-4cf6-b330-546e7a2a47c1.jpg")
                .withProvince("قم")
                .withDescription("حلوا یکی از خوراکی\u200Cهای سنتی ما ایرانی\u200Cها است و تقریبا در هر شهری می\u200Cتوان یک نوع حلوای محلی مخصوص به همان شهر را پیدا کرد. شهر قم هم حلوای سنتی مخصوص به خود را دارد. پخت بسیاری از حلواهای استان مرکزی در قم هم رایج است. حلواهای مختلفی در قم پخته می\u200Cشود که از آن جمله می\u200Cتوان به حلوای کنجدی، شاه دانه و ارده اشاره کرد.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("نان کسمه")
                .withImageUrl("https://images.kojaro.com/2017/12/67f6afb5-838c-429f-b9a7-e1e9dcfd67f4.jpg")
                .withProvince("قم")
                .withDescription("کسمه از جمله شیرینی\u200Cهایی است که در استان قم تهیه می\u200Cشود. شیرینی لذیذ که معمولا مادربزرگ\u200Cها درون تنورهای خانگی طبخ می\u200Cکردند. امروزه نیز شیرینی\u200Cپزان برخی از مناطق این استان، کسمه را درون تنور تهیه می\u200Cکنند که بسیار لذیذ است. آن\u200Cها برای پخت آن از آرد، شیره یا شکر، زعفران، تخم\u200Cمرغ و زردچوبه استفاده می\u200Cکنند.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("قالی دستباف")
                .withImageUrl("https://images.kojaro.com/2016/9/7990e101-f9aa-4f78-9d20-f631ac907546.jpg")
                .withProvince("کردستان")
                .withDescription("نام کردستان با قالی دستباف گره خورده است. قالی بافی در کردستان بسیار رایج است و مردم سختکوش این منطقه با ذوق و سلیقه\u200Cی خود این هنر ارزنده را زنده نگه داشته\u200Cاند و حاصل تلاش آن\u200Cها قالی\u200Cهای دستبافی است که زینت\u200Cبخش منازل است.\n" +
                        "قالی افشار، سنندج، بیجار و بوکان امروزه شهرت جهانی دارند و یکی از ارزشمندترین فرش\u200Cهای ایران محسوب می\u200Cشوند. البته فرش کردستان این روزها رونق گذشته را ندارد اما هنوز هم رایج است. بیشتر طرح\u200Cهای بافته شده در کردستان طرح\u200Cهای شکسته هستند و به ندرت از طرح\u200Cهای دیگر استفاده می\u200Cکنند. از میان طرح\u200Cهای بافته شده در کردستان طرح\u200Cهای ماهی درهم (هراتی)، ریزماهی نقش بته\u200Cای، گل وکیلی، گل میرزاعلی، گل مینا و شاخ گوزن و میناخانی را می\u200Cتوان نام برد.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("گلیم سنه، گلیم مشهور کردستان")
                .withImageUrl("https://images.kojaro.com/2016/9/88df38aa-d7eb-4cf5-b5df-3b3c79daeffd.jpg")
                .withProvince("کردستان")
                .withDescription("یکی از هنرهای دستی زیبای اهالی کردستان، گلیم دستبافت است. البته این هنر با گذشت زمان رونق سابق خود را از دست داده اما همچنان گلیم سنه جایگاه خود را در میان صنایع دستی ایران حفظ کرده است.\n" +
                        "در بافت گلیم سنه از روش بافت چاک\u200Cدار استفاده می\u200Cشود. در روش بافت چاک\u200Cدار گلیم\u200Cها دو رو بافته شده و می\u200Cتوان از هر دو روی گلیم استفاده کرد و هر دو رو دارای نقوش واضح و رسایی است که نشان دهنده\u200Cی توانایی و هنر زنان و مردانی است که در گذشته\u200Cهای دور با فعالیت در این عرصه نه تنها نیازهای خود را تامین می\u200Cکردند بلکه این هنر محلی به عنوان منبع درآمد آنها بوده است.\n" +
                        "گلیم که در کردی به آن (به ر) یا (به ره) می\u200Cگویند یکی از انواع صنایع دستی زیراندازی و پوششی است که از ابریشم، موی بز، پشم گوسفند و یا دیگر چهارپایان اهلی بافته می\u200Cشود. مرکز اصلی گلیم سنه شهر سنندج است.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("نازک کاری چوب")
                .withImageUrl("https://images.kojaro.com/2016/9/71dc072b-0a84-4cb6-a92a-4714c9b86f16.jpg")
                .withProvince("کردستان")
                .withDescription("ساخت محصولات چوبی و نازک کاری در شهر سنندج سابقه\u200Cای طولانی دارد. از قدیم\u200Cالایام محصولات چوبی ساخته شده در این شهر طرفداران خاص خود را داشته است. خیابان شهدای سنندج امروزه به یکی از مراکز اصلی عرضه\u200Cی صنایع دستی به خصوص نازک کاری روی چوب تبدیل شده است.\n" +
                        "کردستان مهم\u200Cترین استان کشور از لحاظ تولید محصولات نازک\u200C کاری است. هنر نازک کاری ترکیب قطعات بسیار کوچک از انواع چوب\u200Cهای پرداخت شده\u200Cی طبیعی است که با ظرافت خاص در کنار هم قرار می\u200Cگیرد و موجب به وجود آمدن آثار بسیار ظریف چوبی می\u200Cشود.\n" +
                        "از مهم\u200Cترین محصولاتی که با نازک کاری ساخته می\u200Cشود می\u200Cتوان به تخته نرد، قلمدان، تخته شطرنج، قوطی سیگار، شیرینی خوری، کیف زنانه، جعبه\u200Cی لوازم آرایش، سینی و بشقاب اشاره کرد.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("کلمپه")
                .withImageUrl("https://images.kojaro.com/2016/10/65a40758-a360-4141-bd62-dece5f8b1915.jpg")
                .withProvince("کرمان")
                .withDescription("این شیرینی سنتی، در واقع نوعی کلوچه است که پخت آن در برخی از مناطق استان مانند شهرستان بم رواج دارد. تفاوت اصلی این کلوچه در موادی است که درون آن قرار می\u200Cدهند.مخلوطی از خرما و گردوی چرخ شده، لایه\u200Cی میانی این کلوچه را تشکیل می\u200Cدهند که با هل، گلاب یا دارچین معطر شده است. در تزیین کلمپه از پودر پسته یا کنجد استفاده می\u200Cکنند و نوع مخصوصی دارد که در آن زعفران و روغن حیوانی به کار می\u200Cرود.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("کماچ سهن")
                .withImageUrl("https://images.kojaro.com/2017/12/7fc2464b-641c-49c3-b5b2-8fe9b7697651.jpg")
                .withProvince("کرمان")
                .withDescription(" در تهیه\u200Cی خمیر این شیرینی سنتی از جوانه\u200Cی گندم استفاده می\u200Cشود، ویژگی دیگر کماچ، ادویه\u200Cی مخصوص آن است که علاوه بر ادویه مشهوری مانند دارچین و زیره، برخی از گیاهان دارویی نیز در آن وجود دارند. این ادویه هم به خمیر کماچ و هم به مواد میانی آن اضافه می\u200Cشود. این شیرینی پرکالری را با این که هیچ افزودنی نگه\u200Cدارنده\u200Cای ندارد، می\u200Cتوان مدت طولانی بیرون از یخچال نگهداری کرد و به همین دلیل، طرفداران زیادی دارد.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("قطاب")
                .withImageUrl("https://images.kojaro.com/2016/10/e36b0fc8-c13a-47e2-b0e5-dcf93b266aaf.jpg")
                .withProvince("کرمان")
                .withDescription("این شیرینی سنتی و مشهور از اصیل\u200Cترین شیرینی\u200Cهای ایرانی است و پخت آن قدمت زیادی دارد. لایه\u200Cی خارجی این شیرینی، نانی است که در خمیر آن از شیر یا ماست استفاده می\u200Cشود و به روش سرخ کردن، پخته می\u200Cشود. برای تهیه\u200Cی محتوای داخل قطاب، مغز پسته یا مغز گردو را به همراه شکر آسیاب می\u200Cکنند و برای تزیین آن از پودر قند استفاده می\u200Cکنند.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("نان برنجی")
                .withImageUrl("https://images.kojaro.com/2016/10/bf25dd3e-47a2-44cf-b8d4-e3d6f5fe57c5.jpg")
                .withProvince("کرمانشاه")
                .withDescription("هیچ کسی نیست که تعریف شیرینی نان برنجی کرمانشاه را نشنیده باشد و آن را امتحان نکرده باشد. البته این شیرینی در گوشه و کنار ایران تهیه می\u200Cشود اما نان برنجی کرمانشاه، عطر و طعم دیگری دارد و در میان گردشگران کاملا شناخته\u200Cشده و محبوب است. نان برنجی را در انواع ساده و زعفرانی می\u200Cپزند.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("کاک")
                .withImageUrl("https://images.kojaro.com/2016/10/9c1a39b1-62a9-4eee-b89e-7f98fd52169b.jpg")
                .withProvince("کرمانشاه")
                .withDescription("یوخه یا کاک، نوعی شیرینی سنتی ایران است که علاوه بر کرمانشاه در مناطق دیگری مانند شیراز نیز تهیه می\u200Cشود. این شیرینی از ورقه\u200Cهای بسیار نازک خمیر تهیه می\u200Cشود و بسیار سبک، خوشمزه و پرانرژی است. در تهیه\u200Cی آن از آرد گندم، شکر یا پودر قند، تخم\u200Cمرغ، دارچین، روغن، هل و آب استفاده می\u200Cکنند و برای تزیین، روی آن پودر پسته، پودر نارگیل یا خلال بادام می\u200Cریزند.\n" +
                        "پرونده\u200Cی طرز تهیه\u200Cی شیرینی محلی «کاک» کرمانشاهی در جریان برگزاری هفتمین اجلاس سراسری شورای سیاستگذاری ثبت آثار معنوی کشور به فهرست میراث معنوی ایرانیان افزوده شد.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("نان خرمایی")
                .withImageUrl("https://images.kojaro.com/2016/10/77785f30-d6f4-4303-88fc-d777fd0cc158.jpg")
                .withProvince("کرمانشاه")
                .withDescription("یکی از سوغاتی\u200Cهای لذیذ کرمانشاه، نان خرمایی است. نان خرمایی، در زبان محلی کرمانشاه به نان خانقی معروف است و آن را می\u200Cتوانید از کارگاه\u200Cها و مغازه\u200Cهای نان برنجی تهیه کنید.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("گردو")
                .withImageUrl("https://images.kojaro.com/2016/11/ee980030-db83-4ee0-9467-6acd239ead55.jpg")
                .withProvince("کهگیلویه و بویراحمد")
                .withDescription("این استان یکی از استان\u200Cهای برتر در زمینه\u200Cی تولید گردو در کشور است و بیش از ۷ هزار هکتار باغ بارور گردو دارد. شرایط جغرافیایی باعث شده تا گردوی این استان به عنوان یکی از مرغوب\u200Cترین گردوهای کشور شناخته شود و مشتریان زیادی در بازار گردوی کشور داشته باشد. بیشترین تولید گردوی استان، مربوط به شهرستان\u200Cهای بویراحمد، دنا و چرام است. برداشت گردو در استان از نیمه\u200Cی اول شهریور شروع می\u200Cشود و تا اوایل نیمه\u200Cی دوم مهر، ادامه دارد.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("عسل")
                .withImageUrl("https://images.kojaro.com/2016/11/6afb7e08-253e-4134-8cce-1b153cbb4e92.jpg")
                .withProvince("کهگیلویه و بویراحمد")
                .withDescription("این استان با تولید ۱۰۰۰ تن عسل در سال، یکی از قطب\u200Cهای تولید این محصول در کشور است. عسل تولیدشده در استان، از کیفیت بالایی برخوردار است و جایگاه ویژه\u200Cای در صادرات عسل به کشورهای حاشیه\u200Cی خلیج فارس دارد. عمده دلیل مرغوبیت این عسل، تغذیه\u200Cی طبیعی زنبورها در بیشتر ایام سال به دلیل بهره\u200Cمندی استان از پوشش گیاهی غنی در مراتع کوهستانی و جنگل\u200Cهای طبیعی است. کندوداران استان از اواخر خرداد، برداشت عسل از کندوها را شروع می\u200Cکنند و این فعالیت تا پایان مرداد ادامه دارد.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("ماهی قزل\u200Cآلا")
                .withImageUrl("https://images.kojaro.com/2016/11/20633b4f-a7dc-4b37-8dc8-243ed1a2358e.jpg")
                .withProvince("کهگیلویه و بویراحمد")
                .withDescription("وجود منابع آبی بسیار در استان، شرایط مناسبی را برای پرورش آبزیان مهیا کرده است. ماهی قزل\u200Cآلا یکی از آبزیان سردآبی است که بیشتر حجم تولید استان در این حوزه را به خود اختصاص داده است. این استان با تامین ۱۰ درصد از نیاز بازار داخلی، رتبه\u200Cی چهارم کشور را در زمینه\u200Cی تولید، پرورش و تکثیر ماهی قزل\u200Cآلا دارد. ماهی قزل\u200Cآلای منطقه\u200Cی گردشگری موگرمون، در شهرستان لنده، از نظر کیفیت در سراسر کشور شهرت دارد.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("حلوای آماج")
                .withImageUrl("https://images.kojaro.com/2016/10/055d9ec0-9e0b-4e52-baf6-be6d312a5a02.jpg")
                .withProvince("گلستان")
                .withDescription("نوعی حلوای محلی است که پخت آن برای ایام نوروز مرسوم است و روش پخت دشواری دارد. در پخت این حلوا از شیره\u200Cی انگور یا عسل و در تزیین آن از خلال پسته یا بادام استفاده می\u200Cشود. از ویژگی\u200Cهای ظاهری حلوای آماج این است که بعد از سرد شدن آن را به اشکال مختلف (بیشتر لوزی) برش می\u200Cزنند. امروزه این حلوای محلی در شیرینی\u200Cفروشی\u200Cهای استان نیز عرضه می\u200Cشود.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("سرغربیلی")
                .withImageUrl("https://images.kojaro.com/2016/10/22a9b69f-2d5d-4fe1-b0f0-db7fbc86a726.jpg")
                .withProvince("گلستان")
                .withDescription("این شیرینی از پرطرفدارترین شیرینی\u200Cهای سنتی در بین اهالی گرگان است. در تهیه\u200Cی خمیر این شیرینی از شیر یا ماست استفاده می\u200Cشود. بعد از اینکه خمیر شیرینی ورآمد، گلوله\u200Cهایی کوچک از آن برمی\u200Cدارند و در روغن داغ سرخ می\u200Cکنند. سپس روغن شیرینی\u200Cهای سرخ شده را می\u200Cگیرند و آن\u200Cها را با خاک قند تزیین می\u200Cکنند.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("نان پادرازی")
                .withImageUrl("https://images.kojaro.com/2016/10/78800b0b-47a9-49f1-931b-b4d15dd62602.jpg")
                .withProvince("گلستان")
                .withDescription("این شیرینی ساده\u200Cی استرآبادی که نامش در فهرست آثار ملی کشور به عنوان میراث فرهنگی ثبت شده است، شیرینی کمی دارد و پخت آن در آستانه\u200Cی سال نو مرسوم است. نان پادرازی در دو نوع خشک و روغنی پخته می\u200Cشود. نوع خشک آن در عزاداری\u200Cها و مراسم مذهبی در کنار حلوا و خرما استفاده می\u200Cشود و نوع روغنی آن جهت پذیرایی از مهمانان در کنار چای مصرف می\u200Cشود.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("رشته\u200C خشکار")
                .withImageUrl("https://images.kojaro.com/2016/10/476a86bf-cb83-4a54-915f-b1c71c691b62.jpg")
                .withProvince("گیلان")
                .withDescription("این شیرینی سنتی گیلانی، که تهیه\u200Cی آن برای افطار در ماه مبارک رمضان مرسوم است، سابقه\u200Cی زیادی دارد و در برخی مناطق، رشته\u200Cریزی (اصطلاح محلی برای پخت این شیرینی) شغل خانوادگی است. مواد اصلی تشکیل\u200Cدهنده\u200Cی این شیرینی، شیر، آرد برنج، مغز گردو، هل، دارچین و شکر است. برای تهیه\u200Cی رشته\u200Cهای این شیرینی، ابزار مخصوصی وجود دارد که به شانه\u200Cی رشته\u200Cریزی معروف است. شانه\u200Cی رشته\u200Cریزی، قیفی از جنس برنج است که ۶ لوله\u200Cی باریک و منظم دارد. برای سرخ کردن رشته\u200Cها نیز از سینی مسی استفاده می\u200Cشود و هرچه خلوص بالاتری داشته باشد، در کیفیت شیرینی هم مؤثر است. پخت رشته\u200C خشکار چندین مرحله دارد؛ آماده کردن رشته\u200Cها، قرار دادن خشکار (محتویات داخلی شامل هل و گردوی خرد شده) لای رشته\u200Cها، سرخ کردن و قرار دادن در شربت تهیه شده از آب و شکر به همراه دارچین.\n" +
                        "این شیرینی چرب و بسیار شیرین که معمولا در کنار چای مصرف می\u200Cشود، در محل\u200Cهای عرضه به دو صورت، قابل خریداری است؛ داغ و آماده\u200Cی مصرف و به شکل خام یعنی رشته\u200Cهایی که درونشان را پر کرده\u200Cاند. اگر رشته\u200C خشکار را خام خریداری کنید، باید مراحل سرخ کردن و شربت دادن را در منزل انجام دهید.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("باقلوای یاس")
                .withImageUrl("https://images.kojaro.com/2016/10/6ad06b3d-17e3-4ec0-bf5b-0e4e591459b0.jpg")
                .withProvince("گیلان")
                .withDescription("باقلوا نوعی شیرینی است که در تهیه\u200Cی خمیر آن از شیر و زرده\u200Cی تخم\u200Cمرغ استفاده می\u200Cشود و لایه\u200Cای میانی دارد که از خردشده\u200Cی برخی مغزها مانند گردو، بادام و پسته، طعم\u200Cدهنده\u200Cهای طبیعی و پودر قند تشکیل شده است. این نوع شیرینی را پس از پختن به شربت مخصوصی آغشته می\u200Cکنند. در استان گیلان، با توجه به فراوانی گل یاس برخلاف باقلوای رایج که مغز به کاررفته در آن، با هل معطر می\u200Cشود، بادام مورد استفاده در باقلوا را با گل یاس معطر می\u200Cکنند. بادام پوست گرفته را پس از این که به خوبی خشک شد، در ظرفی درب\u200Cدار می\u200Cریزند و مقداری گل یاس روی آن قرار می\u200Cدهند. روز بعد، یاس\u200Cهای پلاسیده را با گل\u200Cهای تازه تعویض می\u200Cکنند. این کار تا زمانی که بادام، عطر یاس بگیرد، ادامه دارد. بادام معطر به همراه پودر قند چرخ شده، در باقلوا استفاده می\u200Cشود.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("حلوای به")
                .withImageUrl("https://titilay.com/wp-content/uploads/2013/10/images-1-3.jpg")
                .withProvince("گیلان")
                .withDescription("حلوای محلی استان گیلان است که مورد توجه مسافران قرار دارد. نوع مرغوب این حلوا که زنان روستایی در دیگ\u200Cهای مسی سفید کرده می\u200Cپزند، بسیار خوش\u200Cرنگ است. برای تهیه\u200Cی این حلوا ابتدا مقداری «به» پوست\u200Cگرفته و خردشده را به همراه آب و مقداری شکر می\u200Cپزند تا آب آن کاملا جمع شود. سپس به\u200Cهای پخته را می\u200Cکوبند و به همراه شکر و روغن حیوانی تفت می\u200Cدهند. در انتهای تفت دادن، خلال بادام و هل کوبیده را نیز مخلوط می\u200Cکنند. زمانی که حلوا به شکل توده\u200Cای منسجم درآمد و از ظرف جدا شد، آن را پهن کرده، با پودر پسته تزیین می\u200Cکنند و به شکل لوزی برش می\u200Cزنند.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("ورشوسازی")
                .withImageUrl("https://images.kojaro.com/2016/10/9a8a79d9-5068-4a90-9c59-dca0ce696631.jpg")
                .withProvince("لرستان")
                .withDescription("ورشوسازی شاخص\u200Cترین صنایع دستی بروجرد است که با بیش از دو قرن رونق، نام این شهرستان را در داخل و خارج کشور مطرح کرده است.\n" +
                        "ورشو فلزی است سفیدرنگ و نقره مانند که آلیاژ آن ۲۰ درصد نیکل، ۳۵ درصد روی و ۴۵ درصد مس است و به\u200Cخوبی ذوب و به\u200Cآسانی قالب\u200Cگیری می\u200Cشود. هنرمندان بروجردی با استفاده از فن چکش\u200Cکاری و خم\u200Cکاری که با دستگاه\u200Cهای ساده و نیروی بازوی هنرمند انجام می\u200Cشود، آثاری فلزی از ورق\u200Cهای ورشو خلق می\u200Cکنند و ظروف بسیاری نظیر سینی، دیس، بشقاب، قاشق و چنگال، سماور ذغالی، قوری، زیر سماوری، چای\u200Cدان، قندان، استکان، گلاب\u200Cپاش، آفتابه لگن، سرمه\u200Cدان و ... می\u200Cسازند.\n" +
                        "هنر ورشوسازی امروزه رونق چندانی ندارد و تنها شاید بتوان سماورهایی که با ورشو ساخته شده\u200Cاند را دید.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("جاجیم")
                .withImageUrl("https://images.kojaro.com/2016/10/46b5735f-3385-4c0d-977e-37a611e882e4.jpg")
                .withProvince("لرستان")
                .withDescription("جاجیم\u200Cبافی هنری حاصل کار زنان هنرمند عشایر است که در فصل تابستان و پاییز مشغول بافت آن می\u200Cشوند. تمام مراحل این کار به جز چره یا همان قیچی کردن پشم گوسفندان، بر عهده\u200Cی زنان است. زنان نخ\u200Cهای پشمی را با استفاده از رنگ\u200Cهای طبیعی، رنگ\u200Cآمیزی می\u200Cکنند. روش بافت جاجیم به این شکل است که نوارهای باریک را می\u200Cبافند و سپس آنها را در کنار هم می\u200Cدوزند تا یک سطح مربعی\u200Cشکل یا مستطیلی حاصل شود. برای بافت جاجیم، دار روی زمین قرار می\u200Cگیرد و چله\u200Cکشی نیز روی زمین انجام می\u200Cشود. نقش\u200Cهای استفاده شده در جاجیم این منطقه شونه، دنو موشی، شیروز، گلی و هچه است.\n" +
                        "گرچه امروزه دستبافته\u200Cهای سنتی جایگاه سابق را در منازل ایرانی ندارند اما هنوز هم افرادی پیدا می\u200Cشوند که با تکه\u200Cهای کوچک جاجیم و گلیم خانه\u200Cهای خود را می\u200Cآرایند و رنگ و بویی از گذشته را به خانه می\u200Cآورند.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("حصیر")
                .withImageUrl("https://images.kojaro.com/2016/10/b66b5ea4-56ff-487e-b05f-210c5b53181d.jpg")
                .withProvince("لرستان")
                .withDescription("حصیربافی یکی از قدیمی\u200Cترین صنایع دستی بشر است. این صنعت در استان لرستان نیز رواج دارد. برای بافت این حصیرها که به آن\u200Cها بوریا هم می\u200Cگویند، حصیر را مرطوب می\u200Cکنند تا نرم شود و سپس به صورت تار و پود آن\u200Cها را به هم متصل می\u200Cکنند تا به صورت یک سطح یکپارچه تبدیل شود. از این حصیرها معمولا به عنوان زیرانداز استفاده می\u200Cکنند. برای تهیه\u200Cی انواع سبدها و ظروف نیز از حصیر استفاده می\u200Cشود.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("رشته به رشته")
                .withImageUrl("https://images.kojaro.com/2016/9/590ce123-f892-4f33-8d87-b30006348b09.jpg")
                .withProvince("مازندران")
                .withDescription("رشته به رشته نوعی دیگر از  شیرینی\u200Cهای سنتی و پرطرفدار استان مازندران است که طعمی فوق\u200Cالعاده دارد.  بانوان هنرمند مازندرانی این شرینی را از ترکیب موادی چون گردو، رشته (تهیه شده از آرد برنج) خاک قند، هل و روغن درست می\u200Cکنند.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("آغوزنون")
                .withImageUrl("http://www.finds.ir/img/2018070215093046.jpg")
                .withProvince("مازندران")
                .withDescription("از دیگر شیرینی\u200Cهای سنتی و خوش\u200Cطعم استان سرسبز مازندران می\u200Cتوان به آغوزنون اشاره کرد که در جشن\u200Cها و مراسمات استفاده می\u200Cشود. زنان خانه\u200Cدار مازندرانی هر ساله برای جشن شب یلدا، شیرینی آغوزنون را طبخ می\u200Cکنند و کنار خانواده به همراه دیگر تنقلات، میل می\u200Cکنند.\n" +
                        "آغوزنون در استان مازندران به دو صورت طبخ می شود که یک نوع آن کنجی یا آغوزنون نام دارد و دیگری به شکل خام است که به پیس گنده معروف است. این شیرینی خوشمزه سرشار از مواد معدنی و مغذی(فسفر، کلسیم، آهن، ویتامین D) است و در ترکیبات آن کنجد و گردو بکار می\u200Cبرند.\n" +
                        "افرادی که به این استان سفر می\u200Cکنند از این شیرینی برای دوستان و اقوامشان به عنوان سوغات خریداری می\u200Cکنند.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("پشت زیک")
                .withImageUrl("https://images.kojaro.com/2016/9/a9d0c715-5103-4c9b-a3c6-75c7aac4223b.jpg")
                .withProvince("مازندران")
                .withDescription("یکی از شیرینی\u200Cهای سنتی استان مازندان، پشت زیک است. این خوراکی لذیذ و خوش عطر به سوهان کنجدی  شهرت دارد و اسم آن برگرفته از پرنده\u200Cای به اسم زیک است. در طبخ این شیرینی از کنجد، شکر، گردو، عسل، کره، هل و زعفران استفاده می\u200Cشود. خوردن شیرینی زیک به همراه چای داغ در زمستان بسیار دلچسب است.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("نان فطیر اراک")
                .withImageUrl("https://images.kojaro.com/2016/9/47b016b4-7c6e-4bc2-803e-eaf09e738633.jpg")
                .withProvince("مرکزی")
                .withDescription("نان فطیر در شهرهای مختلف با دستورها و طعم\u200Cهای مختلف و شکل و شمایل و اندازه\u200Cهای متفاوتی تهیه می\u200Cشود. فطیر اراک نیز در ایران شناخته شده است. نان شیرینی فطیر از آرد، شکر، تخم مرغ و مواد دیگر تشکیل شده است و مانند نان آن را در تنور می\u200Cپزند. فطیر انواع مختلفی از جمله کسمه و شیرمال دارد.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("ترخینه")
                .withImageUrl("https://images.kojaro.com/2016/9/0ee13ef2-e42b-4fd2-9da4-b1cb23f49dde.jpg")
                .withProvince("مرکزی")
                .withDescription("ترخینه\u200Cی جامد یکی از سوغاتی\u200Cهای استان مرکزی است که در شهرهای مختلف آن یافت می\u200Cشود. در واقع ترخینه\u200Cی جامد، بلغور گندم یا جو است که در دوغ ترش خیسانده شده است. سپس قطعاتی از این مخلوط خمیر مانند را گلوله کرده و گاهی با افزودن اندکی گیاه خشک پونه زیر نور آفتاب خشک می\u200Cکنند. تکه\u200Cهای خشک ترخینه را با افزودن حبوبات و سبزی خشک به\u200C عنوان آش آماده می\u200Cکنند. در واقع ترخینه یک غذای نیمه آماده محسوب می\u200Cشود.\n" +
                        "ترخینه\u200Cی جامد بعد از خیس خوردن در آب جوش کم کم به صورت یک سوپ در می\u200Cآید. تقریبا نحوه\u200Cی درست کردن آن شبیه به سوپ\u200Cهای آماده\u200Cی امروزی است.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("انار ساوه")
                .withImageUrl("https://images.kojaro.com/2016/9/eeeb65aa-2c13-41ad-95ca-68b04bf20b9d.jpg")
                .withProvince("مرکزی")
                .withDescription("انار از مهم\u200Cترین محصولات باغی ساوه است که در زبان محلی به آن «نار» نیز گفته می\u200Cشود.\n" +
                        "انار ساوه از مرغوب\u200Cترین و شناخته\u200Cشده\u200Cترین انارهای کشور به شمار می\u200Cرود که ملس ترش، ملس تبریزی، یوسف\u200Cخانی، رباب نی\u200Cریز، ملس یزدی و ارجستانی ارقام انار ساوه را شامل می\u200Cشوند. فصل برداشت انار ساوه از اوایل پاییز تا اواخر آن است. در ساوه همه ساله جشنواره\u200Cی انار نیز برگزار می\u200Cشود. رب انار که یکی از مشتقات این میوه\u200Cی بهشتی است با کیفیت بی\u200Cنظیر و به وفور در ساوه به فروش می\u200Cرسد.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("ماهی و میگو")
                .withImageUrl("https://images.kojaro.com/2016/9/80791a86-051d-41ae-82de-989a05168b18.jpg")
                .withProvince("هرمزگان")
                .withDescription("از آن\u200Cجایی که بندرعباس و دیگر بنادر استان هرمزگان در کنار خلیج فارس که منبع غنی انواع مختلف ماهی، میگو و آبزیان است واقع شده\u200Cاند، یکی از شغل\u200Cهای کهن مردم این مناطق ماهیگیری است که به شکل سنتی و یا مدرن انجام می\u200Cشود و می\u200Cتوان گفت ماهی و میگو سوغات معروف این استان است. ماهی تن، سنگسر، ساردین، هامور، سرخو، میش ماهی و مقوا، ماهی\u200Cهایی هستند که در این استان صید می\u200Cشوند و در شهرهای مختلف به راحتی می\u200Cتوانید به آنها دسترسی داشته باشید.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("صنایع دستی حصیری")
                .withImageUrl("https://images.kojaro.com/2016/9/660920e2-6224-417d-94db-c07d14bc81dd.jpg")
                .withProvince("هرمزگان")
                .withDescription("صنایع دستی حصیری نیز در این استان ساخته می\u200Cشوند و رواج دارند. از میان آن\u200Cها می\u200Cتوان به نوعی زیرانداز به نام «تک»، درپوش کوزه، نوعی سینی گرد و بزرگ به نام «سپ»، «دمکش»، گلدان حصیری، ظرف میوه، ظرف نگهداری نان «کفه» اشاره کرد. از حصیر بافی باید به عنوان رایج\u200Cترین و معمول\u200Cترین صنعت دستی استان هرمزگان نام برد، چرا که ماده\u200Cی اولیه\u200Cی مورد نیاز حصیر بافی، برگ درخت خرما است اما در بعضی از مناطق استان از نی هم حصیر می\u200Cبافند. این مواد اولیه به وفور در اختیار هنرمندان قرار دارد و تولید انواع فرآورده\u200Cهای حصیری که کاملا جنبه\u200Cی مصرفی دارند در استان شایع است. روستاهای میناب، بشاگرد، بندر لنگه و اطراف آن از مناطق مهم بافت حصیر در استان هستند که معمولا زنان و دختران منطقه به ساخت این اشیاء مشغول\u200Cاند.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("صنایع دستی دریایی")
                .withImageUrl("https://images.kojaro.com/2016/9/a30c8a1a-3b55-44e7-8627-38ff280e179d.jpg")
                .withProvince("هرمزگان")
                .withDescription("به هنگام جزر و مد دریا، مقدار زیادی از انوع صدف\u200Cها، حلزون\u200Cها و بقایای آبزیان خلیج فارس در سواحل جزایر متعدد این خلیج (کیش، ابوموسی، لارک، قشم هرمز و...) می\u200Cریزد. اهالی بومی و خوش\u200Cذوق منطقه آن\u200Cها را جمع\u200Cآوری می\u200Cکنند و از آن\u200Cها انواع تابلو نقش برجسته، آویز، پرده، زیورآلات مجسمه\u200Cها و اشیاء گوناگونی می\u200Cسازند. مواد اولیه\u200Cی مصرفی شامل پوسته\u200Cی حلزون\u200Cها، صدف\u200Cها، استخوان ماهی، گوش ماهی و مرجان است و برای اتصال قطعات انتخاب شده از چسب بی\u200Cرنگ استفاده می\u200Cکنند.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("کماج")
                .withImageUrl("https://images.kojaro.com/2018/7/019d4c09-57b3-4950-828c-1501346585da.JPG")
                .withProvince("همدان")
                .withDescription("نان کماج یکی از سوغاتی\u200Cهای مشهور همدان است که می\u200Cتوان آن را از تمام شیرینی فروشی\u200Cهای سطح شهر تهیه کرد. پخت کماج از گذشته دور در همدان رایج بوده است. از مواد اولیه این شیرینی محبوب می\u200Cتوان به آرد، شکر، کره، پودر دارچین، تخم\u200Cمرغ، کنجد، گردو، شیر و نمک اشاره کرد.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("حلوا زرده")
                .withImageUrl("https://images.kojaro.com/2018/7/4af106dd-3b2b-495f-841e-18d940ab0f30.jpg")
                .withProvince("همدان")
                .withDescription("حلوا زده یکی دیگر از سوغاتی\u200Cهای مخصوص شهر همدان است. این حلوا نوعی دسر با ظاهری شبیه به فرنی (کمی سفت\u200Cتر) است و در تهیه آن از زرده تخم\u200Cمرغ، شکر، گلاب، نشاسته و زعفران استفاده می\u200Cشود. حلوا زرده به دلیل داشتن زرده تخم\u200Cمرغ منبع غنی پروتئین است و استفاده از آن برای بدن بسیار مفید بوده.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("انگشت\u200Cپیچ")
                .withImageUrl("https://images.kojaro.com/2018/7/417acd4a-0170-48b2-b1fa-2891ceeec3b4.JPG")
                .withProvince("همدان")
                .withDescription("انگشت\u200Cپیچ نوعی دسر همدانی است که معمولاً در کنار حلوا زرده خریداری می\u200Cشود و شکلی شبیه به حلوا زرده دارد، تنها تفاوت اصلی این دسر با حلوا زرده رنگ آن است که رنگ انگشت\u200Cپیچ سفید بوده. دلیل نام\u200Cگذاری این دسر، نحوه خوردن آن در قدیم بوده، مردم برای خوردن آن انگشتشان را داخل دسر می\u200Cکردند و سپس انگشت\u200Cپیچ را دور انگشت خود می\u200Cپیچاندند. در تهیه این دسر از سفیده تخم\u200Cمرغ، گلاب، شکر، جوهر لیمو و هل استفاده می\u200Cشود. استفاده از انگشت\u200Cپیچ در کنار خرما در ماه مبارک رمضان بسیار توصیه می\u200Cشود. برای تهیه این دسر مخصوص همدانی کافی است که سری به شیرینی فروشی\u200Cها بزنید.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("حلوا ارده اردکان")
                .withImageUrl("https://images.kojaro.com/2016/10/392e0f4d-6a69-4f16-add1-32e27ecfe5b5.jpg")
                .withProvince("یزد")
                .withDescription("حلوا ارده غذایی بسیار مقوی است که بیشتر در وعده\u200Cی صبحانه مورد استفاده قرار می\u200Cگیرد. مواد اصلی تشکیل\u200Cدهنده\u200Cی حلوا ارده عبارت\u200Cاند از کنجد، ارده، شکر، گلوکزمایع، شیرین\u200Cکننده\u200Cهای مجاز خوراکی، اسید سیتریک، پودر سفیده\u200Cی تخم\u200Cمرغ و آب چوبک، ارده، کنجد بدون پوست، بوداده و آسیاب شده\u200Cای است که روغن\u200Cگیری نشده باشد.\n" +
                        "حلوا ارده\u200Cای که در استان یزد به خصوص در شهرستان اردکان تولید می\u200Cشود به دلیل اینکه فاقد هر گونه افزودنی شیمیایی است و هنوز به روش سنتی و تا حدودی دستی تولید می\u200Cشود، طعم و مزه\u200Cای طبیعی دارد و نسبت به حلوا ارده\u200Cای که به روش صنعتی تولید می\u200Cشود طرفداران بیشتری دارد.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("کیک یزدی")
                .withImageUrl("https://images.kojaro.com/2016/10/cd2982fd-3df0-41ba-ac7a-e11fc0b2fbf5.jpg")
                .withProvince("یزد")
                .withDescription("کیک یزدی یکی از شیرینی\u200Cهای اصیل یزدی است که در این استان معمولا برای پذیرایی در مراسم مذهبی از آن استفاده می\u200Cشود. مواد لازم برای تهیه\u200Cی این کیک لذیذ تخم\u200Cمرغ، شکر، روغن جامد یا کره، آرد سفید، نمک میوه، جوش شیرین، بیکینگ پودر، ماست یا شیر، هل و در صورت دلخواه مقداری کشمش و خلال پسته است.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);

        souvenirModel = new SouvenirModel.Builder()
                .withName("قطاب یزدی")
                .withImageUrl("https://images.kojaro.com/2016/10/40fa6726-7f9b-434f-ae4b-80261a7cc1f0.jpg")
                .withProvince("یزد")
                .withDescription("یکی از معروف\u200Cترین و لذیذترین شیرینی\u200Cهای سنتی یزد، قطاب است. قطاب یزدی از دو بخش تشکیل شده یکی لایه\u200Cی خارجی و دیگری مغز داخلی. لایه\u200Cی خارجی این شیرینی نوعی نان شیرین سرخ شده در روغن است که خمیر آن از ترکیب آرد گندم، شیر یا ماست و زرده\u200Cی تخم\u200Cمرغ تهیه شده و در روغن سرخ می\u200Cشود و در نهایت در پودر قند غلطانده می\u200Cشود. مغز داخلی این شیرینی ترکیبی از پودر بادام، پودر قند و هل است.\n" +
                        "این شیرینی به دلیل وجود هل و پودر بادام ارزش غذایی بالایی دارد و طعم بی\u200Cنظیر آن، قطاب را از سایر شیرینی\u200Cهای سنتی ایران متمایز می\u200Cکند.")
                .build();
        dbHelper.insertSouvenir(souvenirModel);
    }

    private void insertPictures() {
        PictureModel pictureModel = new PictureModel.Builder()
                .withId("1")
                .withImageUrl("https://cdnw.elicdn.com/Blog/wp-content/uploads/2019/02/%D8%B1%D9%88%D8%B3%D8%AA%D8%A7%DB%8C-%D8%B2%D8%B1%DB%8C%D9%86-%D8%AF%D8%B4%D8%AA.jpg")
                .withAttractionId("1")
                .build();
        dbHelper.insertPicture(pictureModel);

        pictureModel = new PictureModel.Builder()
                .withId("2")
                .withImageUrl("https://cdn.yjc.ir/files/fa/news/1397/4/20/8302643_391.jpg")
                .withAttractionId("1")
                .build();
        dbHelper.insertPicture(pictureModel);

        pictureModel = new PictureModel.Builder()
                .withId("3")
                .withImageUrl("https://cdn.yjc.ir/files/fa/news/1397/4/20/8302642_742.jpg")
                .withAttractionId("1")
                .build();
        dbHelper.insertPicture(pictureModel);

        pictureModel = new PictureModel.Builder()
                .withId("4")
                .withImageUrl("https://cdn.yjc.ir/files/fa/news/1397/4/20/8302641_797.jpg")
                .withAttractionId("1")
                .build();
        dbHelper.insertPicture(pictureModel);
    }

    public AttractionModel getAttractionModel() {
        return attractionModel;
    }

    public void setAttractionModel(AttractionModel attractionModel) {
        this.attractionModel = attractionModel;
    }

    public SouvenirModel getSouvenirModel() {
        return souvenirModel;
    }

    public void setSouvenirModel(SouvenirModel souvenirModel) {
        this.souvenirModel = souvenirModel;
    }

    public ProvinceModel getProvinceModel() {
        return provinceModel;
    }

    public void setProvinceModel(ProvinceModel provinceModel) {
        this.provinceModel = provinceModel;
    }
}
