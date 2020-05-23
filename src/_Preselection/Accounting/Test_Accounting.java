package _Preselection.Accounting;

class Test_Accounting {

    public static void main(String[] args) {
        Accounting accounting = new Accounting();
        Double result = accounting.pay(1.5, 10.0);

        System.out.println(result);
    }
}