package com.example.gardeshgari;

import com.example.gardeshgari.Model.AttractionModel;
import com.example.gardeshgari.Model.AttractionType;
import com.example.gardeshgari.Model.PictureModel;
import com.example.gardeshgari.Model.ProvinceModel;
import com.example.gardeshgari.Model.SouvenirModel;

public class InitialClass {
    
    DBHelper dbHelper;
    
    public InitialClass(DBHelper dbHelper) {
        this.dbHelper = dbHelper;
        readNaturalAttractions();
        readCoastAttractions();
        readPictures();
        readProvinces();
        readSouvenirs();
        readHealthAttraction();
        readHistoricalAttraction();
        readMuseumAttraction();
        readShoppingAttraction();
    }

    public void readNaturalAttractions() {
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

    public void readCoastAttractions() {
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

    public void readHealthAttraction() {
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

    public void readHistoricalAttraction() {
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
                .withImageUrl("https://cdnw.elicdn.com/Blog/wp-content/uploads/2018/09/perspolis-iran.jpg")
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

    public void readMuseumAttraction() {
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

    public void readShoppingAttraction() {

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

    /*

        attractionModel = new AttractionModel.Builder()
                .withId("56")
                .withTitle("")
                .withImageUrl("")
                .withAddress("")
                .withProvince("")
                .withType(AttractionType.natural.toString())
                .withDescription("")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("")
                .withTitle("")
                .withImageUrl("")
                .withAddress("")
                .withProvince("")
                .withType(AttractionType.natural.toString())
                .withDescription("")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("")
                .withTitle("")
                .withImageUrl("")
                .withAddress("")
                .withProvince("")
                .withType(AttractionType.natural.toString())
                .withDescription("")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("")
                .withTitle("")
                .withImageUrl("")
                .withAddress("")
                .withProvince("")
                .withType(AttractionType.natural.toString())
                .withDescription("")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("")
                .withTitle("")
                .withImageUrl("")
                .withAddress("")
                .withProvince("")
                .withType(AttractionType.natural.toString())
                .withDescription("")
                .build();
        dbHelper.insertAttraction(attractionModel);

        attractionModel = new AttractionModel.Builder()
                .withId("")
                .withTitle("")
                .withImageUrl("")
                .withAddress("")
                .withProvince("")
                .withType(AttractionType.natural.toString())
                .withDescription("")
                .build();
        dbHelper.insertAttraction(attractionModel);
        */

    public void readProvinces() {
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
                .withImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Taghe_bprovince.jpg/225px-Taghe_bprovince.jpg")
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

    public void readSouvenirs() {
        SouvenirModel souvenirModel = new SouvenirModel.Builder()
                .withName("کیک یزدی")
                .withImageUrl("https://setare.com/files/fa/news/1396/8/27/102566_537.jpg")
                .withProvince("یزد")
                .withDescription("کیک یزدی یکی از معروف\u200Cترین خوراکی\u200Cهای مختص استان است که البته امروزه در ویترین بیشتر شیرینی فروشی\u200Cهای کشور یافت می\u200Cشود، اما اگر می\u200Cخواهید نوع اصل آن را میل کنید حتماً باید به یزد سفر کنید. این کیک از ترکیب آرد، روغن مایع، شکر، گلاب ، پودر هل و تخم\u200Cمرغ تهیه می\u200Cشود.\n")
                .build();
        dbHelper.insertSouvenir(souvenirModel);
    }

    public void readPictures() {
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
}
