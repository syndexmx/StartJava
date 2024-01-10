class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("Переменные: примитивные типы данных");

        System.out.println("\n 1. Вывод характеристик компьютера");

        short cpuModel = 3470;
        char cpuModifier = 'i';
        byte coreNumber = 4;
        double cpuFrequencyGhz = 3.2;
        int ramCapacityMb = 4096;
        float ramThoughputMbps = 10960f;
        long driveCapacityGb = 160;
        boolean ssd = true;

        System.out.println("Модель процессора : " + cpuModel);
        System.out.println("Модификация процессора : " + cpuModifier);
        System.out.println("Число ядер : " + coreNumber);
        System.out.println("Частота процессора : " + cpuFrequencyGhz + " ГГц");
        System.out.println("Объем оперативной памяти : " + ramCapacityMb + " Мб");
        System.out.println("Пропускная способность памяти : " + ramThoughputMbps + " Мб/c");
        System.out.println("Емкость накопителя : " + driveCapacityGb + " ГБ");
        System.out.println("Тип накопителя : " + ( ssd ? "SSD" : "HDD" ) );

        System.out.println("\n 2. Расчет стоимости товара ");

        int penPrice = 100;
        int bookPrice = 200;
        int jointDiscountRate = 11;

        int priceTotalFull = penPrice + bookPrice; 
        System.out.println("Полная стоимость без скидки : " + priceTotalFull + " руб.");
        int discountedSum = priceTotalFull * jointDiscountRate / 100;
        System.out.println("Сумма скидки : " + discountedSum + " руб.");
        int priceToPay = priceTotalFull - discountedSum;
        System.out.println("Сумма скидки : " + priceToPay + " руб.");

        System.out.println("\n 3. Вывод слова JAVA");
        
        System.out.println();
        System.out.println("    J    a  v     v  a   ");                                            
        System.out.println("    J   a a  v   v  a a  ");                                            
        System.out.println(" J  J  aaaaa  V V  aaaaa ");                                              
        System.out.println("  JJ  a     a  V  a     a");
        System.out.println();

        System.out.println("\n 4. Вывод min и max значений целых числовых типов \n");
        
        byte byteVariable = Byte.MAX_VALUE;
        System.out.println("\n Максимальное значение типа byte : " + byteVariable);
        byteVariable++;
        System.out.println("Значение после инкремента на 1 : " + byteVariable);
        byteVariable--;
        System.out.println("Значение после последующего декремента на 1 : " + byteVariable);

        short shortVariable = Short.MAX_VALUE;
        System.out.println("\n Максимальное значение типа short : " + shortVariable);
        shortVariable++;
        System.out.println("Значение после инкремента на 1 : " + shortVariable);
        shortVariable--;
        System.out.println("Значение после последующего декремента на 1 : " + shortVariable);  

        int intVariable = Integer.MAX_VALUE;
        System.out.println("\n Максимальное значение типа int : " + intVariable);
        intVariable++;
        System.out.println("Значение после инкремента на 1 : " + intVariable);
        intVariable--;
        System.out.println("Значение после последующего декремента на 1 : " + intVariable);

        long longVariable = Long.MAX_VALUE;
        System.out.println("\n Максимальное значение типа int : " + longVariable);
        longVariable++;
        System.out.println("Значение после инкремента на 1 : " + longVariable);
        longVariable--;
        System.out.println("Значение после последующего декремента на 1 : " + longVariable);

        System.out.println("\n 5. Перестановка значений переменных \n");

        int firstVariable = 2;
        int secondVariable = 5;
        // с помощью третьей переменной
        System.out.println("\n Обмен с помощью третьей переменной");
        System.out.println("Начальное значение первой : " + firstVariable + 
                ", значение второй : " + secondVariable);
        int swapVariable = firstVariable;
        firstVariable = secondVariable;
        secondVariable = swapVariable;
        System.out.println("Конечное значение первой : " + firstVariable + 
                ", значение второй : " + secondVariable);

        // с помощью арифметических операций
        System.out.println("\n Обмен с помощью арифметических операций");
        System.out.println("Начальное значение первой : " + firstVariable + 
                ", значение второй : " + secondVariable);
        firstVariable += secondVariable;
        secondVariable = firstVariable - secondVariable;
        firstVariable -= secondVariable;
        System.out.println("Конечное значение первой : " + firstVariable + 
                ", значение второй : " + secondVariable);

        // с помощью побитовой операции ^
        System.out.println("\n Обмен с помощью побитовой операции XOR");
        System.out.println("Начальное значение первой : " + firstVariable + 
                ", значение второй : " + secondVariable);
        firstVariable ^= secondVariable;
        secondVariable ^= firstVariable;
        firstVariable = firstVariable ^ secondVariable;
        System.out.println("Конечное значение первой : " + firstVariable + 
                ", значение второй : " + secondVariable);

        System.out.println("\n 6. Вывод символов и их кодов \n");
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

        System.out.println("\n 7. Вывод в консоль ASCII-арт Дюка \n");
        
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
                underScore + slash + backSlash +
                underScore + underScore + backSlash);

        System.out.println("\n 8. Вывод количества сотен, десятков и единиц числа \n");

        int partitionedNumber = 123;
        int ones = partitionedNumber % 10;
        int tens = partitionedNumber / 10 % 10;
        int hundreds = partitionedNumber / 100 % 10;
        System.out.println("Число " + partitionedNumber + " содержит :");
        System.out.println("сотен - " + hundreds);
        System.out.println("десятков - " + tens);
        System.out.println("единиц - " + ones);
        System.out.println("Сумма его цифр = " + (hundreds + tens + ones));
        System.out.println("Произведение его цифр = " + (hundreds * tens * ones));

        System.out.println("\n 9. Вывод времени \n");

        int numberSeconds = 86399;
        int seconds = numberSeconds % 60;
        int numberMinutes = numberSeconds / 60;
        int minutes = numberMinutes % 60;
        int hours = numberMinutes / 60;
        String stringHH = "" + hours;
        String stringMM = "" + minutes / 10 + minutes % 10;
        String stringSS = "" + seconds / 10 + seconds % 10;
        System.out.println(numberSeconds + " секунд равно " + stringHH + ":" +
                stringMM + ":" + stringSS + "\n");
    }
}