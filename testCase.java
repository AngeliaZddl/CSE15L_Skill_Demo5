public class testCase {
    boolean FakeName(String name) {
        int n = name.length();
        String nameLow = name.toLowerCase();
        String[] vow = {"a", "e", "i", "o", "u"};
        if (n < 3) {return true;}
        else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < vow.length; j++) {
                    if (nameLow.substring(i,i+1).equals(vow[j])) {return false;}
                    else {continue;}
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        testCase ex = new testCase();
        System.out.println("This is a fake name: " + ex.FakeName("str"));
        System.out.println("This is a fake name: " + ex.FakeName("Amy"));
        System.out.println("This is a fake name: " + ex.FakeName("Amyline"));
    }
}