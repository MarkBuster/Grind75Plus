import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MergeStringsAlternately obj = new MergeStringsAlternately();
        System.out.println(obj.mergeAlternately("abc", "pqr"));
        System.out.println(obj.mergeAlternately("abc", "pqrstu"));

        //please pick ensure 2 numbers add to the target number.
        TwoSum tSum = new TwoSum(1, 11, 16, 4, 7, 9, 23);
        //idk why its printing null. it should print [16,7]
        System.out.println(Arrays.toString(tSum.twoSum(tSum.array, tSum.targetNum)));
    
        ValidParetheses vp = new ValidParetheses();
        String testBracketString = "({[]})"; //true
        String testBracketString2 = "({[}])("; //false
        System.out.println(vp.isValid(testBracketString2));
    }
}
