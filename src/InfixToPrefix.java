//import java.util.Scanner;
//public class InfixToPrefix {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        StringStack StringStack = new StringStack(10000);
//        String line = in.nextLine();
//        String postfix = "";
//        String[] chars = line.split(" ");
//
//        for (String ch : chars) {
//            if (Character.isDigit(ch.charAt(0))) {
//                postfix += ch + " ";
//            } else if (ch.equals("(")) {
//                StringStack.push(ch);
//            } else if (ch.equals(")")) {
//                while (!StringStack.isEmpty()) {
//                    String op = StringStack.pop();
//                    if (!op.equals("(")) {
//                        postfix += op + " ";
//                    } else {
//                        break;
//                    }
//                }
//            } else {
//                while (!StringStack.isEmpty()) {
//                    String op = StringStack.pop();
//                    if (op.equals("(")) {
//                        StringStack.push(op);
//                        break;
//                    }
//                    if (getPriority(ch) > getPriority(op)) {
//                        StringStack.push(op);
//                        break;
//                    } else {
//                        postfix += op + " ";
//                    }
//                }
//                StringStack.push(ch);
//            }
//        }
//        while (!StringStack.isEmpty()) {
//            postfix += StringStack.pop() + " ";
//        }
//        System.out.println(postfix);
//
//    }
//
//    public static int getPriority(String ch) {
//        if (ch.equals("+") || ch.equals("-")) {
//            return 1;
//        } else {
//            return 2;
//        }
//    }
//}
//
//class StringStack {
//    int end;
//    String[] array;
//
//    public StringStack(int size) {
//        array = new String[size];
//        end = 0;
//    }
//
//    public void push(String elem) {
//        array[end++] = elem;
//    }
//
//    public String pop() {
//        return array[--end];
//    }
//
//    public boolean isEmpty() {
//        return end == 0;
//    }
//
//    public String peek() {
//        return array[end - 1];
//    }
//}