import java.util.Scanner;

public class PatternProgram {

    public static void main(String[] args) {
        showPatternMenu(); 
    }

    static void showPatternMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n******PATTERN PROGRAM******");
            System.out.println("\nChoose a Pattern:");
            System.out.println("1. Hollow Square Pattern ");
            System.out.println("2. Z shaped Pattern ");
            System.out.println("3. Half Triangle Pattern ");
            System.out.println("4. Hollow half triangle Pattern ");
            System.out.println("5. square parallel pattern ");
            System.out.println("6. Plus sign Pattern ");
            System.out.println("7. Cross Pattern ");
            System.out.println("8. Butterfly pattern ");
            System.out.println("9. Number Triangle Pattern ");
            System.out.println("10. Diamond pattern ");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    pattern1();
                    break;
                case 2:
                    pattern2();
                    break;
                case 3:
                    pattern3();
                    break;
                case 4:
                    pattern4();
                    break;
                case 5:
                    pattern5();
                    break;
                case 6:
                    pattern6();
                    break;
                case 7:
                    pattern7();
                    break;
                case 8:
                    pattern8();
                    break;
                case 9:
                    pattern9();
                    break;
                case 10:
                    pattern10();
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 10.");
            }

            System.out.print("\nPress 1 to continue or any other number to exit): ");
            int repeat = sc.nextInt();

            if (repeat != 1) {
                System.out.println("\nThank you! Program ended.");
                break;
            }
        }
    }

    static void pattern1() {
     System.out.println("\nHollow Square Pattern 1:");
        // Add your pattern logic here
       int i,j;
       for( i=1; i<=5; i++){
        for (j=1; j<=5; j++){
            if(i==1 || j==1|| i==5 || j==5){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
       }
}
    static void pattern2() {
        System.out.println("\nZ shaped Pattern 2:");
        // Add your pattern logic here
        int i,j,n=7;
        for(i=1; i<=n; i++){
            for( j=1; j<=n; j++){
                if( i==1 || i+j==n+1 || i==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
     }

    static void pattern3() {
        System.out.println("\nHalf Triangle Pattern 3:");
        // Add your pattern logic here
        int i;
        int j;
        for(i=1; i<=6; i++){
            for(j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4() {
         System.out.println("\nHollow half triangle Pattern 4:");
        // Add your pattern logic here
        int i,j;
       for( i=1; i<=6; i++){
        for (j=1; j<=i; j++){
            if( i==6 || j==1 || i==j){
            System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
            
       }
       System.out.println();
         }
    }
     static void pattern5() {
        System.out.println("\nsquare parallel pattern 5:");
        // Add your pattern logic here
         int i,j;
        for(i=1; i<=5; i++){
            for(j=1; j<=5; j++){
                if( j==1 || j==5)
                System.out.print("*");
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }

    }

    static void pattern6() {
        System.out.println("\nPlus sign patter 6:");
        // Add your pattern logic here
        int i, j, n=5;

        for( i=1; i<=n; i++){
            for( j=1; j<=n; j++){
                if(i==n/2+1 || j==n/2+3){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    static void pattern7() {
        System.out.println("\n Cross Pattern 7:");
        // Add your pattern logic here
         int i, j, n=5;
        for( i=1; i<=n; i++){
            for( j=1; j<=n; j++){
                if( i==j || i+j==n+1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
        System.out.println();
}
    }

    static void pattern8() {
         System.out.println("\nButterfly pattern 8:");
        // Add your pattern logic here
        {
        int i,j,N=5;
        for(i=1;i<=N+N-1;i++){
            for(j=1;j<=N+N-1;j++){
            System.out.print((i<=N)?(j<=i || j>=(N+N-i))?"*":" ":(j<=(N-(i-N)) || j>=(N+(i-N)))?"*":" ");
            }
            System.out.println();
        }
    }
        
    }

    static void pattern9() {
       System.out.println("\nNumber Triangle Pattern 9:");
    int i;
    int j;

    for( i=1; i<=5; i++){
        for( j=1;j<=5-i; j++){
            System.out.print(" ");
        }
        for( j=1; j<=i; j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    }
    static void pattern10() {
        System.out.println("\nDiamond pattern 10:");
        // Add your pattern logic here
        int i,j,n=5;
        for (i=1; i<=n; i++){
            for(j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=n-1; i>=1; i--){
            for (j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



