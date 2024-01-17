package com.startjava.lesson_1.base;

class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("Переменные: примитивные типы данных");

        System.out.println("\n1. Вывод характеристик компьютера");

        short cpuModel = 3470;
        char cpuModifier = 'i';
        byte numberCores = 4;
        double cpuFrequencyGhz = 3.2;
        int ramCapacityMb = 4096;
        float ramThoughputMbps = 10960f;
        long driveCapacityGb = 160;
        boolean isSsd = true;

        System.out.println("Модель процессора : " + cpuModel);
        System.out.println("Модификация процессора : " + cpuModifier);
        System.out.println("Число ядер : " + numberCores);
        System.out.println("Частота процессора : " + cpuFrequencyGhz + " ГГц");
        System.out.println("Объем оперативной памяти : " + ramCapacityMb + " Мб");
        System.out.println("Пропускная способность памяти : " + ramThoughputMbps + " Мб/c");
        System.out.println("Емкость накопителя : " + driveCapacityGb + " ГБ");
        System.out.println("Тип накопителя : " + ( isSsd ? "SSD" : "HDD" ) );

        System.out.println("\n2. Расчет стоимости товара");

        int penPrice = 100;
        int bookPrice = 200;
        int sizeDiscount = 11;

        int priceTotalFull = penPrice + bookPrice;
        int discountedSum = priceTotalFull * sizeDiscount / 100;
        int discountPrice = priceTotalFull - discountedSum;
        System.out.println("Полная стоимость без скидки : " + priceTotalFull + " руб.");
        System.out.println("Сумма скидки : " + discountedSum + " руб.");
        System.out.println("Сумма скидки : " + discountPrice + " руб.");

        System.out.println("\n3. Вывод слова JAVA");
        
        System.out.println("\n    J    a  v     v  a   ");
        System.out.println("    J   a a  v   v  a a  ");                                            
        System.out.println(" J  J  aaaaa  V V  aaaaa ");                                              
        System.out.println("  JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Максимальное значение типа byte : " + maxByte);
        maxByte++;
        System.out.println("Значение после инкремента на 1 : " + maxByte);
        maxByte--;
        System.out.println("Значение после последующего декремента на 1 : " + maxByte);

        short maxShort = Short.MAX_VALUE;
        System.out.println("\nМаксимальное значение типа short : " + maxShort);
        maxShort++;
        System.out.println("Значение после инкремента на 1 : " + maxShort);
        maxShort--;
        System.out.println("Значение после последующего декремента на 1 : " + maxShort);

        int maxInt = Integer.MAX_VALUE;
        System.out.println("\nМаксимальное значение типа int : " + maxInt);
        maxInt++;
        System.out.println("Значение после инкремента на 1 : " + maxInt);
        maxInt--;
        System.out.println("Значение после последующего декремента на 1 : " + maxInt);

        long maxLong = Long.MAX_VALUE;
        System.out.println("\nМаксимальное значение типа int : " + maxLong);
        maxLong++;
        System.out.println("Значение после инкремента на 1 : " + maxLong);
        maxLong--;
        System.out.println("Значение после последующего декремента на 1 : " + maxLong);

        System.out.println("\n5. Перестановка значений переменных");

        int first = 2;
        int second = 5;
        // с помощью третьей переменной
        System.out.println("Обмен с помощью третьей переменной");
        System.out.println("Начальное значение первой : " + first +
                ", значение второй : " + second);
        int swap = first;
        first = second;
        second = swap;
        System.out.println("Конечное значение первой : " + first +
                ", значение второй : " + second);

        // с помощью арифметических операций
        System.out.println("\nОбмен с помощью арифметических операций");
        System.out.println("Начальное значение первой : " + first +
                ", значение второй : " + second);
        first += second;
        second = first - second;
        first -= second;
        System.out.println("Конечное значение первой : " + first +
                ", значение второй : " + second);

        // с помощью побитовой операции ^
        System.out.println("\nОбмен с помощью побитовой операции XOR");
        System.out.println("Начальное значение первой : " + first +
                ", значение второй : " + second);
        first ^= second;
        second ^= first;
        first = first ^ second;
        System.out.println("Конечное значение первой : " + first +
                ", значение второй : " + second);

        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char horizontalBar = '|';
        char tilda = '~';
        System.out.println("Код " + (int) dollar  + " : " + dollar);
        System.out.println("Код " + (int) asterisk  + " : " + asterisk);
        System.out.println("Код " + (int) atSign  + " : " + atSign);
        System.out.println("Код " + (int) horizontalBar  + " : " + horizontalBar);
        System.out.println("Код " + (int) tilda  + " : " + tilda);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        
        char slash = '/';
        char backSlash = '\\';
        char underScore = '_';
        char openBracket = '(';
        char closeBracket = ')';
        System.out.println("    " + slash + backSlash);
        System.out.println("   " + slash + "  " + backSlash); 
        System.out.println("  " + slash  + underScore + openBracket + " " + 
                closeBracket + backSlash); 
        System.out.println(" " + slash  + "      " + backSlash); 
        System.out.println("" + slash + underScore + underScore + underScore +
                underScore + slash + backSlash + underScore + underScore + backSlash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");

        int originalNumber = 123;
        int ones = originalNumber % 10;
        int tens = originalNumber / 10 % 10;
        int hundreds = originalNumber / 100;
        System.out.println("Число " + originalNumber + " содержит :");
        System.out.println("сотен - " + hundreds);
        System.out.println("десятков - " + tens);
        System.out.println("единиц - " + ones);
        System.out.println("Сумма его цифр = " + (hundreds + tens + ones));
        System.out.println("Произведение его цифр = " + (hundreds * tens * ones));

        System.out.println("\n9. Вывод времени");

        int numberSeconds = 86399;
        int ss = numberSeconds % 60;
        int mm = numberSeconds / 60 % 60;
        int hh = numberSeconds / 3600;
        String stringMM = "" + mm / 10 + mm % 10;
        String stringSS = "" + ss / 10 + ss % 10;
        System.out.println(numberSeconds + " секунд равно " + hh + ":" + stringMM + ":" + stringSS);
    }
}