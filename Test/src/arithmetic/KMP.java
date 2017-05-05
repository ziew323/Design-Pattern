package arithmetic;

public class KMP {
    public static void main(String[] args) {
        KMP kmp = new KMP();
        String target = "abcabaabcaabac";
        String pattern = "abaa";
        int index = kmp.indexOf(target, pattern);
        System.out.println(target.indexOf(pattern, 1));
    }

    public int indexOf(String target, String pattern) {
        target.indexOf("1");
        return -1;
    }
}
