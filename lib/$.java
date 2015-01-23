public class $ {
    public static void main(String[] args) {
        System.out.println(reverse("abcde"));
    }

    public static String reverse(String string) {
        return new StringBuilder(string)
            .reverse()
            .toString();
    }
}
