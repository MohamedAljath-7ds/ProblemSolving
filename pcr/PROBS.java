class Sm {
    public String reverse(String s) {
        char[] c = new char[s.length()];
        int temp = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            c[temp] = s.charAt(i);
            temp++;
        }
        String rev = " ";
        for (int i = 0; i < s.length(); i++) {
            rev = rev + c[i];
        }
        return rev;
    }
}

class PROBS {
    public static void main(String[] args) {
        Sm m = new Sm();
        String ver = m.reverse("aljath");
        System.out.println(ver);
    }
}