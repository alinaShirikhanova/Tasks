import java.util.*;

public class BracketsTask {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String openBrackets = "({[";
        String closedBrackets = "]})";

        StringStack stack = new StringStack(100000);
        boolean isGood = true;
        int num = 0;
        for (int i = 0; i < line.length(); i++) {
            String bracket = String.valueOf(line.charAt(i));
            if (openBrackets.contains(bracket)) {
                stack.push(bracket);
            } else if (closedBrackets.contains(bracket)) {
                if (stack.isEmpty()) {
                    isGood = false;
                    break;
                }
                String openBracket = stack.pop();
                if (openBracket.equals("(") && bracket.equals(")")) {
                    continue;
                }
                if (openBracket.equals("{") && bracket.equals("}")) {
                    continue;
                }
                if (openBracket.equals("[") && bracket.equals("]")) {
                    continue;
                }
                isGood = false;
                break;
            }

        }
        if (isGood && stack.isEmpty()){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
}

