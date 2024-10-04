package operator;

public class Operator4 {
    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3;
        int sum4 = (2 * 2) + (3 *3);
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
        //둘의 연산결과는 같지만, 연산자의 우선순위가 애매하거나 조금이라도 복잡하다면 언제나 괄호를 고려하자 !
    }
}
