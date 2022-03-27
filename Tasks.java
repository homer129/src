import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

class Tasks {
    public static void main(String[] args) {
       
        test(1,7);
    }

    public static void test(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }
    public static void t2() {
        // BEGIN (write your solution here)
        // You know nothing, Jon Snow!
        // END
    }
    public static void t3() {
        // BEGIN (write your solution here)
        System.out.println("Robert");
        System.out.println("Stannis");
        System.out.println("Renly");
        // END
    }
    public static void t4() {
        // BEGIN (write your solution here)
        System.out.println(420262531);
        // END
    }
    public static void t5() {
        // BEGIN (write your solution here)
        System.out.println("What Is Dead May Never Die");
        // END
    }
    public static void t6() {
        // BEGIN (write your solution here)
        System.out.println(81 / 9);
        // END
    }
    public static void t7() {
        // BEGIN (write your solution here)
        System.out.println(6 - -81);
        // END
    }
    public static void t8() {
        // BEGIN (write your solution here)
        System.out.println(3 * 5);
        System.out.println(-8 / -4);
        // END
    }
    public static void t9() {
        // BEGIN (write your solution here)
        System.out.println(8 / 2 + 5 - -3 / 2);
        // END
    }
    public static void t10() {
        // BEGIN (write your solution here)
        System.out.println(70 * (3 + 4) / (8 + 2));
        // END
    }
    public static void t11() {
        // BEGIN (write your solution here)
        System.out.println(0.39 * 0.22);
        // END
    }
    public static void t12() {
        // BEGIN (write your solution here)
        System.out.println((5 + 2) - (3 * 7));
        // END
    }
    public static void t13() {
        // BEGIN (write your solution here)
        System.out.println("\"Khal Drogo's favorite word is \"athjahakar\"\"");
        // END
    }
    public static void t14() {
        // BEGIN (write your solution here)
        System.out.println("- Did Joffrey agree?\n- He did. He also said \"I love using \\n\".");
        // END
    }
    public static void t15() {
        // BEGIN (write your solution here)
        System.out.println("Winter " + "came " + "for " + "the " + "House " + "of" + " Frey.");
        // END
    }
    public static void t16() {
        // BEGIN (write your solution here)
        var motto = "What Is Dead May Never Die!";
        System.out.println(motto);
        // END
    }
    public static void t17() {
        var name = "Brienna";

        // BEGIN (write your solution here)
        name = "anneirB";
        // END

        System.out.println(name);
    }
    public static void t18() {
        // BEGIN (write your solution here)
        double firstNumber = 1.10;
        int secondNumber = -100;
        System.out.println(firstNumber * secondNumber);
        // END
    }
    public static void t19() {
        var family = "Targaryen";

        // BEGIN (write your solution here)
        var pet = "Dragon";
        // END

        System.out.print(family);
        System.out.print(" and ");
        System.out.print(pet);
    }
    public static void t20() {
        var eurosCount = 100;

        // BEGIN (write your solution here)
        var dollarsCount = eurosCount * 1.25;
        System.out.println(dollarsCount);
        var rublesCount = dollarsCount * 60;
        System.out.println(rublesCount);
        // END
    }
    public static void t21() {
        var info = "We couldn't verify you mother's maiden name.";
        var intro = "Here is important information about your account security.";

        var firstName = "Joffrey";
        var greeting = "Hello";

        // BEGIN (write your solution here)
        System.out.println(greeting + ", " + firstName + "!");
        System.out.println(intro + "\n" + info);
        // END
    }
    public static void t22() {
        // BEGIN (write your solution here)
        var firstNumber = 11;
        var secondNumber = -100;
        System.out.println(firstNumber * secondNumber);
        // END
    }
    public static void t23() {
        var king = "King Balon the 6th";

        // BEGIN (write your solution here)
        var castles = 6;
        var roomsInCastle = 17;

        System.out.println(king + " has " + (castles * roomsInCastle) + " rooms.");
        // END
    }
    public static void t24() {
        // BEGIN
        final var DRAGONS_BORN_COUNT = 3;
        // END
    }
    public static void t25() {
        // BEGIN (write your solution here)
        System.out.println(3 / 2);
        // END
    }
    public static void t26() {
        // BEGIN (write your solution here)
        String x = "One more time";
        System.out.println(x);
        // END
    }
    public static void t27() {
        // BEGIN (write your solution here)
        System.out.println("hexlet" + "-" + 7);
        // END
    }
    public static void t28() {
        // BEGIN (write your solution here)
        String greeting;
        // END

        greeting = "Hello Hexlet!";
        System.out.println(greeting);
    }
    public static void t29() {
        // BEGIN (write your solution here)
        System.out.println(((int) 2.9) + " times");
        // END
    }
    public static void t30() {
        var company1 = "Apple";
        var company2 = "Samsung";

        // BEGIN (write your solution here)
        var result = company1.length() + company2.length();
        System.out.println(result);
        // END
    }
    public static void t31() {
        var one = "Naharis";
        var two = "Mormont";
        var three = "Sand";

        // BEGIN (write your solution here)
        System.out.println(one.charAt(2) + " " + two.charAt(1) + " " + three.charAt(3) + " " + two.substring(4, 5) + " " + two.substring(2, 3));
        // END
    }
    public static void t32() {
        var text = "Never forget what you are, for surely the world will not";

        // BEGIN (write your solution here)
        var lastIndex = text.length() - 1;
        System.out.println("First: " + text.charAt(0));
        System.out.println("Last: " + text.charAt(lastIndex));
        // END
    }
    public static void t33() {
        var email = " SupporT@hexlet.io\n";

        // BEGIN (write your solution here)
        var processedEmail = email.trim();
        processedEmail = processedEmail.toLowerCase();
        System.out.println(processedEmail);
        // END
    }
    public static void t34() {
        var name = "hexlet";

        // BEGIN (write your solution here)
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println(name);
        // END
    }
    public static void t35() {
        // BEGIN (write your solution here)
        System.out.println((int) (Math.random() * 10));
        // END
    }
    public static void t36() {
        // BEGIN (write your solution here)
        LocalDate dateFrom = LocalDate.of(2017, Month.MAY, 24);
        LocalDate dateTo = LocalDate.of(2017, Month.JULY, 29);
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
        System.out.println(noOfDaysBetween);
        // END
    }
    public static void t37() {
        var emoji = "-(";
        // BEGIN (write your solution here)
        System.out.println(":" + emoji.replace('(', ')'));
        // END
    }
    // BEGIN (write your solution here)
    public static void printMotto() {
         System.out.println("Winter is coming");
    }
    // END
    // BEGIN (write your solution here)
    public static int getCurrentYear(){
        var date = LocalDate.now();
        return Integer.parseInt(date.toString().substring(0, 4));    
    }
    // END
    // BEGIN (write your solution here)
    public static String truncate(String text, int number){
        return text.substring(0, number) + "...";
    }
    // END
    // BEGIN (write your solution here)
    public static String getHiddenCard(String numberCard, int length){
        return "*".repeat(length) + numberCard.substring(12);
    }
    public static String getHiddenCard(String numberCard){
        return getHiddenCard(numberCard, 4);
    }
    // END
    // BEGIN (write your solution here)
    public static boolean isPensioner(int age){
        return age >= 60;
    }
    // END
    // BEGIN (write your solution here)
    // public static boolean isPalindrome(String word){
    //     var normalWord = word.toLowerCase();
    //     var reverseWord = StringUtils.reverse(normalWord);  // тут ошибка потому что у нас не хватает StringUtils класса
    //     return normalWord.equals(reverseWord);              //Ничего страшного 
    // }
    // END 
    // BEGIN (write your solution here)
    public static boolean isInternationalPhone (String phone){
        var firstNumber = phone.charAt(0);
        return firstNumber == '+';
    }
    // END
    // BEGIN (write your solution here)
    public static boolean isLeapYear(int year){
        return year % 400 == 0 || year % 4 == 0 && year % 100 !=0;
    }
    // END
    // BEGIN (write your solution here)
    public static boolean notToday(String date){
        var todayDate = LocalDate.now();
        return !date.equals(todayDate.toString());
    }
    // END
    // BEGIN (write your solution here)
    public static String getSentenceTone (String sentence){
        var sentenceScream = sentence.toUpperCase();
        if (sentence.equals(sentenceScream)){
            return "scream";
        }
        return "normal";
    }
    // END
    // BEGIN (write your solution here)
    public static String normalizeUrl(String adress){
        if(adress.startsWith("https://")){
            return adress;
        }
        return "https://" + adress;
    }
    // END
    // BEGIN (write your solution here)
    public static String whoIsThisHouseToStarks(String sername){
        if ("Karstark".equals(sername) || "Tally".equals(sername)){
            return "friend";
        } else if ("Lannister".equals(sername) || "Frey".equals(sername)){
            return "enemy";
        } 
        return "neutral";
    }
    // END
    // BEGIN (write your solution here)
    // public static String convertString (String str){
    //     if ("".equals(str)){
    //         return "";
    //     }
    //     return Character.isUpperCase(str.charAt(0)) ? str : StringUtils.reverse(str); //тут тоже самое
    // }
    // END
    // BEGIN (write your solution here)
    public static String getNumberExplanation (int number){
        switch (number) {
            case 666:
            return "devil number";
            case 42:
            return "answer for everything";
            case 7:
            return "prime number";
            default:
            return null;
        }
    }
    // END
    public static void printNumbers(int firstNumber) {
        // BEGIN
        var i = firstNumber;
        while (i >= 1) {
            System.out.println(i);
            i = i - 1;
        }
        System.out.println("finished!");
        // END
    }
    public static int multiplyNumbersFromRange(int start, int finish) {
        // BEGIN (write your solution here)
        var i = start;
        var sum = 1;

        while (i <= finish) {
            sum = sum * i;
            i = i + 1;
        }
        return sum;
        // END
    }
    public static String joinNumbersFromRange(int start, int finish) {
        // BEGIN (write your solution here)
        var i = start;
        var sum = "";

        while (i <= finish) {
            sum = sum + i;
            i = i + 1;
        }
        return sum;
        // END
    }
    public static void printReversedNameBySymbol(String name) {
        // BEGIN (write your solution here)
        var i = name.length() - 1;

        while (i >= 0) {
            System.out.println(name.charAt(i));
            i = i - 1;
        }

        // END
    }
    public static int countChars(String str, char ch) {
        // BEGIN (write your solution here)
        var i = 0;
        var count = 0;

        while (i < str.length()) {
            if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(ch)) {
                count = count + 1;
            }
            i = i + 1;
        }
        return count;
        // END
    }
    public static String reverse(String str) {
        // BEGIN (write your solution here)
        var i = str.length() - 1;
        var result = "";
        while (i >= 0) {
            result = result + str.charAt(i);
            i = i - 1;
        }
        return result;
        // END
    }
    public static String filterString(String str, char ch) {
        // BEGIN (write your solution here)
        var i = 0;
        var result = "";
        while (i < str.length()) {
            if (str.charAt(i) != ch) {
                result = result + str.charAt(i);
            } i += 1;
        } return result;
        // END
    }
    public static String makeItFunny(String str, int n) {
        // BEGIN (write your solution here)
        var i = 0;
        var result = "";
        while (i < str.length()) {
            if ((i + 1) % n == 0) {
                result = result + Character.toUpperCase(str.charAt(i));
            } else {
                result = result + str.charAt(i);
            }
            i++;
        }
        return result;    
        // END
    }
    public static boolean hasChar(String str, char ch) {
        // BEGIN (write your solution here)
        var i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == ch) {
                return true;
            }
            i++;
        }
        return false;
        // END
    }
    public static String encrypt(String str) {
        // BEGIN (write your solution here)
        var result = "";
        for (var i = 0; i < str.length(); i += 2) {
            var next = (i + 2 > str.length() ? "" : str.substring(i + 1, i + 2));
            result = result + next + str.charAt(i);
        }
        return result;
        // END
    }
}    
