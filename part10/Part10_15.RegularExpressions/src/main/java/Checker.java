

public class Checker {

    //    String regex = "/\\b(?:Tue(?:sday)?|Wed(?:nesday)?|Thu(?:rsday)?|Sat(?:urday)?|(Mon|Fri|Sun)(?:day)?)/gi";
    String regex = "(?i)((sun|mon|tue|wed|thu|fri|sat))";
    String vowel = "^[aeyiuo]+$";

    String time = "\\b(0[0-9]|1[0-9]|2[0-3])(\\:)(0[0-9]|1[0-9]|2[0-9]|3[0-9]|4[0-9]|5[0-9])(\\:)(0[0-9]|1[0-9]|2[0-9]|3[0-9]|4[0-9]|5[0-9])\\b";

    public boolean isDayOfWeek(String string) {
        if (string.matches(regex)) {
            return true;
        }
        return false;
    }

    public boolean allVowels(String string) {
        if (string.matches(vowel)) {
            return true;
        }
        return false;
    }

    public boolean timeOfDay(String string) {
        if (string.matches(time)) {
            return true;
        }
        return false;
    }

}
