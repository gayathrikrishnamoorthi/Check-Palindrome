package gayathri;

public class Palindrome {
	public static int isPalindrome(String A) {
		if (A.length()<=1) {
			return 1;
		}
		if (A.charAt(0) != A.charAt(A.length() - 1)) {
            return 0;
        }
        return isPalindrome(A.substring(1, A.length() - 1));
    }

    public static void main(String[] args) {
        String A = "naman";
        int output = isPalindrome(A);
        System.out.println(output); 
        A = "strings";
        output = isPalindrome(A);
        System.out.println(output); 
    }
}



