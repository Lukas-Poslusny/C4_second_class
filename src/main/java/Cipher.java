public class Cipher {

    public static void main(String[] args) {

        String baseLine = "AZhAoqjl,Z ybgakbqi";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < baseLine.length(); i++) {
            if(i%2 == 0) {
                sb.append(baseLine.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
