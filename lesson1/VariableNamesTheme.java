import java.util.UUID;

class VariableNamesTheme {

    public static void main(String[] args) {
        System.out.println("Именование переменных \n");

        System.out.println("1. Разные переменные");
        //цифра
        byte digit = 7;
        System.out.println("цифра = " + digit);

        //сумма чисел
        int sum = 17 + 87;
        System.out.println("сумма чисел 17 и 87 = " + sum);

        // произведение цифр
        int product = 17 * 87;
        System.out.println("произведение чисел 17 и 87 = " + product); 

        // максимальное число
        int maxNumber = Integer.MAX_VALUE;
        System.out.println("максимально число, хранимое в int = " + maxNumber);

        // количество десятков
        int numberTens = 174 / 10 % 10;
        System.out.println("количество десятков в 174 = " + numberTens);

        // вес собаки
        double dogWeight = 13.42;
        System.out.println("вес собаки = " + dogWeight);

        // исходное число
        int originalNumber = 0;
        System.out.println("исходное числе = " + originalNumber);

        // процент по вкладу
        double interestRate = 12.7;
        System.out.println("процент по вкладу = " + interestRate + "%");

        // (переменная хранит символ) &
        char ampersand = '&';
        System.out.println("хранимый символ : " + ampersand);

        // код ошибки
        int errorCode = 404;
        System.out.println("код ошибки : " + errorCode);

        // тип сообщения
        enum MessageType { EMAIL, SMS, WHATSAPP, TELEGRAM }
        MessageType messageType = MessageType.SMS;
        System.out.println("выбор : " + messageType.toString());

        // число нулей
        int numberZeros = 6;
        System.out.println("число нулей = " + numberZeros);

        // уникальное число
        int uniqueNumber = 73;
        System.out.println("уникальное число = " + uniqueNumber);

        // случайное число
        int randomNumber = (int) (Math.random() * 10000);
        System.out.println("уникальное  = " + randomNumber);

        // математическое выражение
        String mathExpression = "7 + (2 * 3 ^ 2 + sin(11 * 0.6))";
        System.out.println("пункт меню : " + mathExpression);

        // выбор (чего-либо)
        enum ExperienceOption { NOVICE, EXPERIENCED, ADVANCED, PROFESSIONAL }
        ExperienceOption selectedOption = ExperienceOption.NOVICE;
        System.out.println("выбор : " + selectedOption.toString());

        // счет (в игре)
        String score = "7:14";
        System.out.println("текущий счет : " + score);

        // максимальная длина (строки)
        int maxLenght = Math.max("qwerty".length(), "Hello, world!".length());
        System.out.println("максимальная длина (строки) = " + maxLenght);

        // пункт меню
        String menuItem = "Помощь";
        System.out.println("пункт меню : " + menuItem);

        // стоимость кофе на вынос
        int priceOfTakeOutCoffee = 120;
        System.out.println("цена кофе на вынос : " + priceOfTakeOutCoffee + " рублей");

        // дата начала (чего-либо)
        String startDate = "2024.01.01";
        System.out.println("дата начала : " + startDate);

        // окончание диапазона
        int endRandge = 366;
        System.out.println("окончание диапазона : " + endRandge);

        // полное имя работника месяца
        String employeeOfMonthFullName = "Сергей Сергеевич Александров";
        System.out.println("имя работника месяца : " + employeeOfMonthFullName);

        // заголовок электронной книги
        String ebookTitle = "Wind in the Willows";
        System.out.println("путь к файлу : " + ebookTitle);

        // размер
        int size = 120;
        System.out.println("размер = " + size);

        // вместимость (чего-либо)
        double capacity = 1.6;
        System.out.println("вместимость: " + capacity);

        // счетчик
        int counter = 0;
        System.out.println("состояние счетчика: " + counter);

        // путь до файла
        String filePath = "//home/mine/1.java";
        System.out.println("путь к файлу : " + filePath);

        // количество чисел в каждой строке
        int numbersPerLine = 12;
        System.out.println("количество чисел в каждой строке: " + numbersPerLine);

        System.out.println("\n 2. boolean-переменные");
        
        // сотни равны?
        int a = 685;
        int b = 347;
        boolean isHundredsEqual = (a / 100 % 10) == (b / 100 % 10);
        System.out.println("сотни равны? " + isHundredsEqual);

        // компьютер включен?
        boolean isComputerOn = true;
        System.out.println("компьютер включен? " + isComputerOn);

        // есть равные цифры?
        boolean hasSameDigits = false;
        System.out.println("есть равные цифры? " + hasSameDigits);

        // (что-либо) создано?
        boolean isCreated = false;
        System.out.println("(что-либо) создано? " + isCreated);

        // (что-либо) пустое?
        boolean isEmpty = true;
        System.out.println("(что-либо) пустое? " + isEmpty);

        // (что-либо) активное?
        boolean isActive = true;
        System.out.println("(что-либо) активное? " + isActive);

        // новый?
        boolean isNew = true;
        System.out.println("новый? " + isNew);

        // электронная почта действительная?
        boolean isValidEmail = true;
        System.out.println("электронная почта действительная? " + isValidEmail);

        // имеются уникальные строки?
        boolean containsUniqueLines = true;
        System.out.println("имеются уникальные строки? " + containsUniqueLines);

        System.out.println();

        System.out.println("3. Аббревиатуры");

        //старый universally unique identifier
        UUID oldUuid = UUID.randomUUID();
        System.out.println("старый universally unique identifier: " + oldUuid);

        // производитель оперативной памяти
        String ramProducer = "Hynix";
        System.out.println("ипроизводитель оперативной памяти: " + ramProducer);

        // емкость жесткого диска
        int hddCapacity = 2000;
        System.out.println("емкость жесткого диска, ГБ: " + hddCapacity);

        // протокол передачи гипертекста
        String http = "HTTP";
        System.out.println("протокол передачи гипертекста: " + http);

        // сокращенный uniform resource locator
        String shortUrl = "http://goo.com/rgnjodsrnj";
        System.out.println("сокращенный uniform resource locator: " + shortUrl);

        // новый идентификатор клиента
        long newClientsId = 589395489483294L;
        System.out.println("новый идентификатор клиента: " + newClientsId);

        // кодировка american standard code for information interchange
        String ascii = "ASCII";
        System.out.println("кодировка american standard code for information interchange: " 
                + ascii + "\n");
    }
}