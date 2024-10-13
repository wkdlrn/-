package method.ex;
public class MethodEx3Ref {
    public static void main(String[] args) {
        int balance = 10000;
// 입금 1000

        System.out.println(deposit(1000) + "원을 입금하였습니다. 현재 잔액: " + balance
                + "원");
// 출금 2000
        int withdrawAmount = 2000;
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " +
                    balance + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니
                    다.");
        }
        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int deposit(int balance, int depositAmount) {
        return balance += depositAmount;

    }

    public static int withdraw(int withdrawAmount) {
        return balance -= withdrawAmount;
    }
}