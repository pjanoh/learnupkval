public class Main {

    public static void main(String[] args) {
        int[] salaries = { 15_000, 5_000, 25_000, 17_000 };
        Statistics st = new Statistics(salaries);
        System.out.println(st.max());
    }
}
