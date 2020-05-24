package pl.sda;


import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        char[][] p = new char[3][3];
        int count = 0;
        String name1 = "";
        String name2 = "";

        System.out.println();
        System.out.println("podaj imie 1 gracza: ");
        name1 = scanner.nextLine();
        int x1 = 0;
        System.out.println("podaj imie 2 gracza: ");
        name2 = scanner.nextLine();
        int x2 = 0;
        System.out.println();
        int exit = 1;
        System.out.println("ROZGRYWAKA\n");

        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                System.out.print(p[i][j] = ' ');
                if (j != 2) {
                    System.out.print(" | ");
                }
            }

            count++;
            System.out.println();
            if (count != 3) {
                System.out.println("--+---+--");
            }
        }
        System.out.println();

        while (true) {
            // player 1
            count = 0;
            System.out.println("Twój ruch: " + name1 + "\n0 - exit\nWybierz pole 1-9: ");
            x1 = scanner.nextInt();

            if (x1 == 0) {
                break;
            }

            switch (x1) {
                case 1:
                    p[0][0] = 'x';
                    break;
                case 2:
                    p[0][1] = 'x';
                    break;
                case 3:
                    p[0][2] = 'x';
                    break;
                case 4:
                    p[1][0] = 'x';
                    break;
                case 5:
                    p[1][1] = 'x';
                    break;
                case 6:
                    p[1][2] = 'x';
                    break;
                case 7:
                    p[2][0] = 'x';
                    break;
                case 8:
                    p[2][1] = 'x';
                    break;
                case 9:
                    p[2][2] = 'x';
                    break;
            }

            for (int i = 0; i < p.length; i++) {
                for (int j = 0; j < p.length; j++) {
                    System.out.print(p[i][j]);
                    if (j != 2) {
                        System.out.print(" | ");
                    }
                }
                count++;
                System.out.println();
                if (count != 3) {
                    System.out.println("--+---+--");
                }
            }
            System.out.println();

            boolean win1 = false;
            for (int i = 0; i < p.length; i++) {
                if (p[i][0] == 'x' && p[i][1] == 'x' && p[i][2] == 'x') {
                    System.out.println("\nWYGRAŁ/A: " + name1 + "!!!\n");
                    win1 = true;
                    break;
                } else if (p[0][i] == 'x' && p[1][i] == 'x' && p[2][i] == 'x') {
                    System.out.println("\nWYGRAŁ/A: " + name1 + "\n");
                    win1 = true;
                    break;
                } else if (p[0][0] == 'x' && p[1][1] == 'x' && p[2][2] == 'x') {
                    System.out.println("\nWYGRAŁ/A: " + name1 + "\n");
                    win1 = true;
                    break;
                } else if (p[0][2] == 'x' && p[1][1] == 'x' && p[2][0] == 'x') {
                    System.out.println("\nWYGRAŁ/A: " + name1 + "\n");
                    win1 = true;
                    break;
                }
            }

            if (win1) {
                break;
            }

            boolean remis = false;
            for (int i = 0; i < p.length; i++) {
                if (p[i][0] != ' ' && p[i][1] != ' ' && p[i][2] != ' ' && p[0][i] != ' ' && p[1][i] != ' ' && p[2][i] != ' ') {
                    remis = true;
                }
                for (int j = 0; j < p.length; j++) {
                    if (p[i][j] == ' ') {
                        remis = false;
                    }
                }
            }

            if (remis) {
                System.out.println("REMIS");
                break;
            }

            // player 2
            count = 0;
            System.out.println("Twój ruch: " + name2 + "\n0 - exit\nWybierz pole 1-9: ");
            x2 = scanner.nextInt();

            if (x2 == 0) {
                break;
            }

            switch (x2) {
                case 1:
                    p[0][0] = 'o';
                    break;
                case 2:
                    p[0][1] = 'o';
                    break;
                case 3:
                    p[0][2] = 'o';
                    break;
                case 4:
                    p[1][0] = 'o';
                    break;
                case 5:
                    p[1][1] = 'o';
                    break;
                case 6:
                    p[1][2] = 'o';
                    break;
                case 7:
                    p[2][0] = 'o';
                    break;
                case 8:
                    p[2][1] = 'o';
                    break;
                case 9:
                    p[2][2] = 'o';
                    break;
            }

            for (int i = 0; i < p.length; i++) {
                for (int j = 0; j < p.length; j++) {
                    System.out.print(p[i][j]);
                    if (j != 2) {
                        System.out.print(" | ");
                    }
                }

                count++;
                System.out.println();
                if (count != 3) {
                    System.out.println("--+---+--");
                }
            }

            boolean win2 = false;
            for (int i = 0; i < p.length; i++) {
                if (p[i][0] == 'o' && p[i][1] == 'o' && p[i][2] == 'o') {
                    System.out.println("\nWYGRAŁ/A: " + name2 + "!!!\n");
                    win2 = true;
                    break;
                } else if (p[0][i] == 'o' && p[1][i] == 'o' && p[2][i] == 'o') {
                    System.out.println("\nWYGRAŁ/A: " + name2 + "\n");
                    win2 = true;
                    break;
                } else if (p[0][0] == 'o' && p[1][1] == 'o' && p[2][2] == 'o') {
                    System.out.println("\nWYGRAŁ/A: " + name2 + "\n");
                    win2 = true;
                    break;
                } else if (p[0][2] == 'o' && p[1][1] == 'o' && p[2][0] == 'o') {
                    System.out.println("\nWYGRAŁ/A: " + name2 + "\n");
                    win2 = true;
                    break;
                }
            }

            if (win2) {
                break;
            }

            remis = false;
            for (int i = 0; i < p.length; i++) {
                if (p[i][0] != ' ' && p[i][1] != ' ' && p[i][2] != ' ' && p[0][i] != ' ' && p[1][i] != ' ' && p[2][i] != ' ') {
                    remis = true;
                }

                for (int j = 0; j < p.length; j++) {
                    if (p[i][j] == ' ') {
                        remis = false;
                    }
                }
            }

            if (remis) {
                System.out.println("REMIS");
                break;
            }
        }
    }
}
