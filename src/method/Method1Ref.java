package method;

public class Method1Ref {

    public static void main(String[] args) {

        int sum1 = add(5, 10);
        System.out.println("결과1 출력: " + sum1);

        int sum2 = add(15, 20);
        System.out.println("결과2 출력: " + sum2);

    }

    //메서드를 정의한다고 표현.
    public static int add(int a ,int b) {//메서드 선언부 | 메서드 이름, 반환 타입, 매개변수(파라미터) 목록을 포함.
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }
    //메서드를 호출할 때 넘기는 값 : Argument(아규먼트), 한글로 인수 또는 인자.
    //인수(들어가는 값), 즉 메서드 내부로 들어가는 값을 의미.
    //메서드를 정의할 때 선언한 변수 : 매개변수 ,파라미터.
    //메서드를 호출할 때 인수를 넘기면, 그 인수가 매개변수에 대입된다.
    //매개변수 : 중간에서 전달하는 변수. 메서드 호출부와 메서드 내부 사이에서 값을 전달하는 역할을 하는 변수.

}
