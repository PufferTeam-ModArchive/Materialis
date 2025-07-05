package net.pufferlab.materialis;

public class Utils {

    public static boolean containsExactMatch(String[] array, String targetString) {
        for (String element : array) {
            if (element.equals(targetString)) {
                return true;
            }
        }
        return false;
    }

    public static String getOreDictionaryName(String prefix, String suffix) {
        String[] suffixArray = suffix.split("");
        suffixArray[0] = suffixArray[0].toUpperCase();
        suffix = String.join("", suffixArray);

        return prefix + suffix;
    }
}
