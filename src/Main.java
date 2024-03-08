public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа №3");
        System.out.println();
        int I=1894627;
        byte B=56;
        short S=11771;
        long L=89762465678L;
        float F=1384.8467f;
        double D=768.53748672;
        System.out.println("Значение переменной I с типом int = "+ I);
        System.out.println("Значение переменной B с типом byte = "+ B);
        System.out.println("Значение переменной S с типом short = "+ S);
        System.out.println("Значение переменной L с типом long = "+ L);
        System.out.println("Значение переменной F с типом float = "+ F);
        System.out.println("Значение переменной D с типом double = "+ D);

        System.out.println();
        float one=27.12f;
        long two=987678965549L;
        double three=2.786;
        short four=569;
        short five=-159;
        int six=27897;
        byte seven=67;
        System.out.println("float one="+one);
        System.out.println("long two="+two);
        System.out.println("double three="+three);
        System.out.println("short four="+four);
        System.out.println("short five="+five);
        System.out.println("int six="+six);
        System.out.println("byte seven="+seven);

        System.out.println();
        int aClass=23;
        int bClass=27;
        int cClass=30;
        int paper=480;
        System.out.println("На каждого ученика рассчитано "+paper/(aClass+bClass+cClass)+" листов бумаги");

        System.out.println();
        int productivity=16/2;
        System.out.println("Для удобства расчётов узнаем, что машина производит "+productivity+" штук бутылок в минуту; из этого следует, что...");
        System.out.println("За 20 минут машина произведёт "+productivity*20+" штук бутылок");
        System.out.println("За сутки машина произведёт "+productivity*60*24+" штук бутылок");
        System.out.println("За 3 дня минут машина произведёт "+productivity*60*24*3+" штук бутылок");
        System.out.println("За 1 месяц машина произведёт "+productivity*60*24*30+" штук бутылок");
        //По-моему самый простой вариант решения

        System.out.println();
        int paint=120;
        //Всего банок краски; теперь надо узнать сколько классов в школе, зная, что на каждый класс всего по шесть банок (2 белой + 4 коричневой)
        int classes=paint/(2+4);
        int whitePaint=2*classes;
        int brownPaint=4*classes;
        System.out.println("В школе, где "+classes+" классов, нужно "+whitePaint+" банок белой краски и "+brownPaint+" банок коричневой краски");

        System.out.println();
        int weightBananas=80*5;
        int weightMilk=105*2;
        int weightIceCream=100*2;
        int weightEggs=70*4;
        int totalWeightGr=weightBananas+weightMilk+weightIceCream+weightEggs;
        System.out.println("Общий вес завтрака "+totalWeightGr+" грамм");
        float totalWeightKg=totalWeightGr/1000f;
        System.out.println("Или "+totalWeightKg+" кг");

        System.out.println();
        int loseWeight=7;
        float maxDays=loseWeight/(250/1000f);
        float minDays=loseWeight/(500/1000f);
        float meanDays=(maxDays+minDays)/2;
        System.out.println("Если терять в весе по 250 грамм в день, то понадобится "+maxDays+" чтобы сбросить 7 кг");
        System.out.println("Если терять в весе по 500 грамм в день, то понадобится "+minDays+" чтобы сбросить 7 кг");
        System.out.println("В среднем может понадобится "+meanDays+" чтобы сбросить 7 кг");

        System.out.println();
        int masha=67760;
        int denis=83690;
        int kristina=76230;
        float salaryIncrease=1.1f;
        int mSalOnYear=masha*12;
        int dSalOnYear=denis*12;
        int kSalOnYear=kristina*12;
        masha=(int)(masha*salaryIncrease);
        int mDiffSalOnYear=masha*12-mSalOnYear;
        System.out.println("Маша теперь получает "+masha+" рублей. Годовой доход вырос на "+mDiffSalOnYear+" рублей");
        denis=(int)(denis*salaryIncrease);
        int dDiffSalOnYear=denis*12-dSalOnYear;
        System.out.println("Денис теперь получает "+denis+" рублей. Годовой доход вырос на "+dDiffSalOnYear+" рублей");
        kristina=(int)(kristina*salaryIncrease);
        int kDiffSalOnYear=kristina*12-kSalOnYear;
        System.out.println("Кристина теперь получает "+kristina+" рублей. Годовой доход вырос на "+kDiffSalOnYear+" рублей");
    }
}