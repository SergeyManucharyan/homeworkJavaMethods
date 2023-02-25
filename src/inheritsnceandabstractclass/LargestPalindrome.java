package inheritsnceandabstractclass;

public class LargestPalindrome {
        public static void main(String[] args) {
            StringBuilder sb = new StringBuilder();
            StringBuilder result = new StringBuilder();
            String str = "asdfghjkxxyxxlzxcvbnmm";
            int end = str.length();
            for (int i = 0; i < str.length(); i++) {
                for (int j = str.length() - 1; j >= i; j--) {
                    sb.setLength(0);
                    if (isPalindrome(sb.append(str, i, j + 1))) {
                        if (sb.length() > result.length()) {
                            result.setLength(0);
                            result.append(sb);
                            sb.setLength(0);
                            break;
                        }
                    } else {
                        end--;
                        sb.setLength(0);
                    }
                }
            }
            System.out.println(result);
        }

        public static boolean isPalindrome(StringBuilder sb) {
            return sb.toString().equals(String.valueOf(sb.reverse()));
        }

    }
