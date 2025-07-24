public class Triangle {
/*
* 
* *
* * *
* * * *
* * * * *
 */
    public static void rightAngleTri() {
        int n = 5; 
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
/*                  rows    spaces      stars
        *           1       4(5-1)      1    
      * *           2       3(5-2)      2
    * * *           3       2(5-3)      3
  * * * *           4       1(5-4)      4
* * * * *           5       0(5-5)      5
 */
    public static void mirrorRightAngleTri() {
        int n = 5; 
        for(int i = 1; i <= 5; i++) {
            for(int k = 1; k <= n-i; k++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
/*
      * 
    * * *
  * * * * *
* * * * * * *
 */
    public static void equilateralTri() {
        int n = 4; 
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //rightAngleTri();
        //mirrorRightAngleTri();
        //equilateralTri();
    }
}
