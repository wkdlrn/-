package method;

//매개변수, 반환타입 없는 경우.
public class Method2 {

    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }
    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
        return;
    }

    public static void printFooter() {//반환 타입이 void인 경우 return생략해도 됨.
        System.out.println("= 프로그램을 종료합니다 =");
    }
}
