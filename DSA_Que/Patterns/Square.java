public class Square {
/*
* * * * * 
* * * * *
* * * * *
* * * * *
* * * * *
 */
    public static void starSquare() {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
/*
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5
 */
    public static void numberSquare() {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
/*
1 2 3 4 5 
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
 */
    public static void numbersSquare() {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
/*
* * * * * 
*       *
*       *
*       *
* * * * *
 */
    public static void hollowSquare() {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(i == 0 || i == 4 || j == 0 || j == 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
/*
    01 02 03 04 05 
    06 07 08 09 10
    11 12 13 14 15
    16 17 18 19 20
    21 22 23 24 25
*/
    public static void increasingNumberSquare1() {
        int n = 5;
        int count = 1; 
        for(int i = 0; i < n; i++) {        
            for(int j = 0; j < n; j++) {
                if(count < 10) {
                    System.out.print("0");
                }
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }
/*
01 02 03 04 05 
02 04 06 08 10
03 06 09 12 15
04 08 12 16 20
05 10 15 20 25
 */
    public static void increasingNumberSquare2() {
        int n = 5;
        for(int i = 1; i <= n; i++) {        
            for(int j = 1; j <= n; j++) {
                if(i*j < 10) {
                    System.out.print("0");
                }
                System.out.print(i*j +" ");
            }
            System.out.println();
        }
    }
/*
1 2 3 4 5 
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
 */
    public static void increasingNumberSquare3() {
        int n = 5; 
        for(int i = 0; i < n; i++) {
            int count = i+1;
            for(int j = 0; j < n; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //starSquare();
        //numberSquare();
        //numbersSquare();
        //hollowSquare();
        //increasingNumberSquare1();
        //increasingNumberSquare2();
        increasingNumberSquare3();

    }
}
