/**
 * 1071. Greatest Common Divisor of Strings
 * Easy
 *
 * For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
 *
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 *
 *
 *
 * Example 1:
 *
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 *
 * Example 2:
 *
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 *
 * Example 3:
 *
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 *
 *
 *
 * Constraints:
 *
 *     1 <= str1.length, str2.length <= 1000
 *     str1 and str2 consist of English uppercase letters.
 */
public class GreatestCommonDivisorOfStrings {

    // if the two strings are divisible by a common substring then they could be diff lens but would have to have the same pattern. Therefore, if we concatenated them, it should be the same exact string. Then if I find the greatest common denominator betweeen the two lengths, return a substring of that length.
    // https://leetcode.com/problems/greatest-common-divisor-of-strings/solution/
    public String gcdOfStrings(String str1, String str2) {
        String gcd = "";

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }





        return gcd;
    }
}
