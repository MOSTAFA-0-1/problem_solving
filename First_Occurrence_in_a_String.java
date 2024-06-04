
public class First_Occurrence_in_a_String {

    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";
        System.out.println(haystack.contains(needle));
        // haystack = haystack.replaceFirst(needle, "0");
        // haystack.indexOf("0");
        System.out.println(haystack);
        System.out.println(haystack.indexOf("sad"));

    }
}

class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}