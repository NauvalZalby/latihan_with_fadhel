import java.util.Scanner;


    class polindrome_Checker {

        public static void main(String[] args) {



                    Scanner input = new Scanner(System.in);

                    System.out.print("Masukkan kata atau frase: ");
                    String inputString = input.nextLine();

                    if (isPalindrome(inputString)) {
                        System.out.println("Ini adalah palindrome.");
                    } else {
                        System.out.println("Ini bukan palindrome.");
                    }
                }

                public static boolean isPalindrome(String str) {
                    // Hapus spasi dan ubah menjadi huruf kecil agar lebih fleksibel
                    str = str.replaceAll("\\s", "").toLowerCase();

                    int left = 0;
                    int right = str.length() - 1;

                    while (left < right) {
                        if (str.charAt(left) != str.charAt(right)) {
                            return false;
                        }
                        left++;
                        right--;
                    }
                    return true;
                }
            }