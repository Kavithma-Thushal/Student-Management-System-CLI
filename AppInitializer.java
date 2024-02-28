import java.util.*;

class AppInitializer {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int j = 0;
        String[][] details = new String[100][2];
        int[][] marks = new int[100][2];
        int[] tot = new int[100];
        double[] avg = new double[100];
        int[] place = new int[100];

        while (true) {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("|                       WELCOME TO GDSE MARKS MANAGEMENT SYSTEM                          |");
            System.out.println("-----------------------------------------------------------------------------------------");

            System.out.println("[1]Add New Student                               [2]Add New Student With Marks");
            System.out.println("[3]Add Marks                                     [4]Update Student Details");
            System.out.println("[5]Update Marks                                  [6]Delete Student");
            System.out.println("[7]Print Student Details                         [8]Print Student Ranks");
            System.out.println("[9]Best in Programming Fundermentals             [10]Best in Database Management System");

            System.out.print("\nEnter an option to continue > ");
            String option = scan.next();
            clearConsole();

            switch (option) {
                case "1":                                                                                                                 //1
                    System.out.println("-----------------------------------------------------------------------------------------");
                    System.out.println("|                                    ADD NEW STUDENT                                     |");
                    System.out.println("-----------------------------------------------------------------------------------------");

                    f1:
                    for (int i = 0; i < 100; i++) {
                        System.out.print("Enter student ID   : ");                                                                             //100 loops
                        String stuid = scan.next();

                        f2:
                        for (int k = 0; k < 100; k++) {
                            if (stuid.equals(details[k][0])) {                                                                                      //checking
                                System.out.println("The student ID already exists");
                                continue f1;
                            }
                        }

                        details[j][0] = stuid;
                        System.out.print("Enter student name : ");                                                                         //adding new student
                        details[j][1] = scan.next();
                        j++;

                        System.out.print("Student has been added successfully. Do you want to add a new student? (y/n) : ");
                        String choice = scan.next();

                        if (choice.equals("y") || choice.equals("Y")) {
                            continue f1;
                        } else {
                            break;
                        }
                    }

                    clearConsole();
                    break;


                case "2":                                                                                                                   //2
                    System.out.println("-----------------------------------------------------------------------------------------");
                    System.out.println("|                                ADD NEW STUDENT WITH MARKS                              |");
                    System.out.println("-----------------------------------------------------------------------------------------");

                    f1:
                    for (int i = 0; i < 100; i++) {
                        System.out.print("Enter student ID   : ");                                                                             //100 loops
                        String stuid = scan.next();

                        f2:
                        for (int k = 0; k < 100; k++) {
                            if (stuid.equals(details[k][0])) {                                                                                      //checking
                                System.out.println("The student ID already exists");
                                continue f1;
                            }
                        }

                        details[j][0] = stuid;
                        System.out.print("Enter student name : ");                                                                         //adding new student
                        details[j][1] = scan.next();


                        f3:
                        for (int p = 0; p < 100; p++) {
                            System.out.print("Programming Fundermental Marks   : ");
                            int prf = scan.nextInt();
                            if (prf >= 0 && prf <= 100) {                                                                                            //PRF Marks
                                marks[j][0] = prf;
                                break;
                            } else {
                                System.out.println("Invalid marks. Please enter correct marks.");
                            }
                        }


                        f4:
                        for (int d = 0; d < 100; d++) {
                            System.out.print("Database Management System Marks : ");
                            int dbm = scan.nextInt();
                            if (dbm >= 0 && dbm <= 100) {                                                                                             //DBM Marks
                                marks[j][1] = dbm;
                                break;
                            } else {
                                System.out.println("Invalid marks. Please enter correct marks.");
                            }
                        }

                        j++;
                        System.out.print("Student has been added successfully. Do you want to add a new student? (y/n) : ");
                        String choice = scan.next();
                        if (choice.equals("y") || choice.equals("Y")) {
                            continue f1;
                        } else {
                            break;
                        }
                    }

                    clearConsole();
                    break;


                case "3":                                                                                                                     //3
                    System.out.println("-----------------------------------------------------------------------------------------");
                    System.out.println("|                                         ADD MARKS                                      |");
                    System.out.println("-----------------------------------------------------------------------------------------");

                    f1:
                    for (int i = 0; i < 100; i++) {
                        System.out.print("Enter student ID   : ");                                                                                //100 loops
                        String stuid = scan.next();

                        f2:
                        for (int k = 0; k < 100; k++) {
                            if (stuid.equals(details[k][0]) && marks[k][0] == 0 && marks[k][1] == 0) {                                                    //checking
                                System.out.println("Student name     : " + details[k][1]);


                                f3:
                                for (int p = 0; p < 100; p++) {
                                    System.out.print("Programming Fundermental Marks   : ");
                                    int prf = scan.nextInt();
                                    if (prf >= 0 && prf <= 100) {                                                                                             //PRF Marks
                                        marks[k][0] = prf;
                                        break;
                                    } else {
                                        System.out.println("Invalid marks. Please enter correct marks.");
                                    }
                                }


                                f4:
                                for (int d = 0; d < 100; d++) {
                                    System.out.print("Database Management System Marks : ");
                                    int dbm = scan.nextInt();
                                    if (dbm >= 0 && dbm <= 100) {                                                                                             //DBM Marks
                                        marks[k][1] = dbm;
                                        break;
                                    } else {
                                        System.out.println("Invalid marks. Please enter correct marks.");
                                    }
                                }
                            } else if (stuid.equals(details[k][0]) && marks[k][0] != 0 && marks[k][1] != 0) {
                                System.out.println("Marks already added. If you want to update marks, please use [5] to update marks ");
                                System.out.print("Do you want to add marks for another student? (y/n) : ");
                                String choice = scan.next();
                                if (choice.equals("y") || choice.equals("Y")) {
                                    continue f1;
                                } else {
                                    break f1;
                                }
                            } else if (details[k][0] == null) {
                                System.out.print("Invalid student ID. Do you want to search again? (y/n) : ");
                                String choice = scan.next();
                                if (choice.equals("y") || choice.equals("Y")) {
                                    continue f1;
                                } else {
                                    break f1;
                                }
                            } else {
                                continue f2;
                            }


                            System.out.print("Marks added successfully. Do you want to add marks for another student? (y/n) : ");
                            String choice = scan.next();
                            if (choice.equals("y") || choice.equals("Y")) {
                                continue f1;
                            } else {
                                break f1;
                            }
                        }
                    }
                    clearConsole();
                    break;


                case "4":                                                                                                                        //4

                    System.out.println("-----------------------------------------------------------------------------------------");
                    System.out.println("|                                 UPDATE STUDENT DETAILS                                 |");
                    System.out.println("-----------------------------------------------------------------------------------------");

                    f1:
                    for (int i = 0; i < 100; i++) {
                        System.out.print("Enter student ID   : ");                                                                                //100 loops
                        String stuid = scan.next();

                        f2:
                        for (int k = 0; k < 100; k++) {
                            if (stuid.equals(details[k][0])) {                                                                                          //checking
                                System.out.println("Student name     : " + details[k][1]);

                                System.out.print("Enter the new student name : ");
                                details[k][1] = scan.next();

                                System.out.println("Student details has been updated successfully");
                                System.out.print("Do you want to update another student detail? (y/n) : ");
                                String choice = scan.next();
                                if (choice.equals("y") || choice.equals("Y")) {
                                    continue f1;
                                } else {
                                    break f1;
                                }
                            } else if (details[k][0] == null) {
                                System.out.print("Invalid student ID. Do you want to search again? (y/n) : ");
                                String choice = scan.next();
                                if (choice.equals("y") || choice.equals("Y")) {
                                    continue f1;
                                } else {
                                    break f1;
                                }
                            }
                        }
                    }
                    clearConsole();
                    break;


                case "5":

                    System.out.println("-----------------------------------------------------------------------------------------");
                    System.out.println("|                                 UPDATE STUDENT MARKS                                   |");
                    System.out.println("-----------------------------------------------------------------------------------------");

                    f1:
                    for (int i = 0; i < 100; i++) {
                        System.out.print("Enter student ID   : ");                                                                                //100 loops
                        String stuid = scan.next();

                        f2:
                        for (int k = 0; k < 100; k++) {
                            if (stuid.equals(details[k][0]) && marks[k][0] != 0 && marks[k][1] != 0) {                                                                                          //checking
                                System.out.println("Student name     : " + details[k][1]);
                                System.out.println("Programming Fundermental Marks : " + marks[k][0]);
                                System.out.println("Database Management System Marks : " + marks[k][1]);


                                f3:
                                for (int p = 0; p < 100; p++) {
                                    System.out.print("Enter New Programming Fundermental Marks   : ");
                                    int prf = scan.nextInt();
                                    if (prf >= 0 && prf <= 100) {                                                                                             //PRF Marks
                                        marks[k][0] = prf;
                                        break;
                                    } else {
                                        System.out.println("Invalid marks. Please enter correct marks.");
                                    }
                                }


                                f4:
                                for (int d = 0; d < 100; d++) {
                                    System.out.print("Enter New Database Management System Marks : ");
                                    int dbm = scan.nextInt();
                                    if (dbm >= 0 && dbm <= 100) {                                                                                             //DBM Marks
                                        marks[k][1] = dbm;
                                        break;
                                    } else {
                                        System.out.println("Invalid marks. Please enter correct marks.");
                                    }
                                }


                                System.out.println("Marks have been updated successfully");
                                System.out.print("Do you want to update marks for another student detail? (y/n) : ");
                                String choice = scan.next();
                                if (choice.equals("y") || choice.equals("Y")) {
                                    continue f1;
                                } else {
                                    break f1;
                                }
                            } else if (details[k][0] == null) {
                                System.out.print("Invalid student ID. Do you want to search again? (y/n) : ");
                                String choice = scan.next();
                                if (choice.equals("y") || choice.equals("Y")) {
                                    continue f1;
                                } else {
                                    break f1;
                                }
                            } else if (stuid.equals(details[k][0]) && marks[k][0] == 0 && marks[k][1] == 0) {
                                System.out.print("Marks yet to be added. Do you want to update the marks of another student? (y/n) : ");
                                String choice = scan.next();
                                if (choice.equals("y") || choice.equals("Y")) {
                                    continue f1;
                                } else {
                                    break f1;
                                }
                            }


                        }
                    }
                    clearConsole();
                    break;

                case "6":
                    System.out.println("-----------------------------------------------------------------------------------------");
                    System.out.println("|                                    DELETE STUDENT                                      |");
                    System.out.println("-----------------------------------------------------------------------------------------");

                    f1:
                    for (int i = 0; i < 100; i++) {
                        System.out.print("Enter student ID   : ");                                                                                //100 loops
                        String stuid = scan.next();

                        f2:
                        for (int k = 0; k < 100; k++) {
                            if (stuid.equals(details[k][0])) {

                                details[k][0] = null;
                                details[k][1] = null;
                                marks[k][0] = 0;
                                marks[k][1] = 0;
                                System.out.println("Student has been deleted successfully.");
                                System.out.print("Do you want to delete another student? (y/n) : ");
                                String choice = scan.next();
                                if (choice.equals("y") || choice.equals("Y")) {
                                    continue f1;
                                } else {
                                    break f1;
                                }
                            } else if (details[k][0] == null) {
                                System.out.print("Invalid student ID. Do you want to search again? (y/n) : ");
                                String choice = scan.next();
                                if (choice.equals("y") || choice.equals("Y")) {
                                    continue f1;
                                } else {
                                    break f1;
                                }
                            }
                        }
                    }
                    clearConsole();
                    break;

                case "7":
                    System.out.println("-----------------------------------------------------------------------------------------");
                    System.out.println("|                                   PRINT STUDENT DETAILS                                |");
                    System.out.println("-----------------------------------------------------------------------------------------");

                    f1:
                    for (int i = 0; i < 100; i++) {
                        System.out.print("Enter student ID   : ");                                                                                //100 loops
                        String stuid = scan.next();


                        f2:
                        for (int k = 0; k < 100; k++) {
                            if (stuid.equals(details[k][0]) && marks[k][0] != 0 && marks[k][1] != 0) {                                                                                          //checking
                                System.out.println("Student name       : " + details[k][1]);

                                for (int f = 0; f < 100; f++) {
                                    tot[f] = marks[f][0] + marks[f][1];
                                    avg[f] = (double) tot[f] / 2;
                                }

                                System.out.println("Programming Fundermental Marks   : " + marks[k][0]);
                                System.out.println("Database Management System Marks : " + marks[k][1]);
                                System.out.println("Total Marks                      : " + tot[k]);
                                System.out.println("Average Marks                    : " + avg[k]);

                                int rank = 1;
                                for (int m = 0; m < 100; m++) {                  //rank
                                    if (tot[k] < tot[m]) {
                                        rank++;
                                    }
                                }

                                place[k] = rank;
                                System.out.println("Rank                             : " + place[k]);

                                System.out.print("Do you want to search another student detail? (y/n) : ");
                                String choice = scan.next();
                                if (choice.equals("y") || choice.equals("Y")) {
                                    continue f1;
                                } else {
                                    break f1;
                                }
                            } else if (details[k][0] == null) {
                                System.out.print("Invalid student ID. Do you want to search again? (y/n) : ");
                                String choice = scan.next();
                                if (choice.equals("y") || choice.equals("Y")) {
                                    continue f1;
                                } else {
                                    break f1;
                                }
                            } else if (stuid.equals(details[k][0]) && marks[k][0] == 0 && marks[k][1] == 0) {
                                System.out.println("Student name     : " + details[k][1]);
                                System.out.print("Marks yet to be added. Do you want to search another student details? (y/n) : ");
                                String choice = scan.next();
                                if (choice.equals("y") || choice.equals("Y")) {
                                    continue f1;
                                } else {
                                    break f1;
                                }
                            }

                        }
                    }
                    clearConsole();
                    break;


                case "8":
                    boolean b = true;
                    while (b) {
                        System.out.println("-----------------------------------------------------------------------------------------");
                        System.out.println("|                                    PRINT STUDENT RANKS                                 |");
                        System.out.println("-----------------------------------------------------------------------------------------");

                        for (int i = 0; i < 100; i++) {
                            int rank = 1;
                            if ((marks[i][0] != 0 && marks[i][1] != 0)) {
                                int mtotal = 0;
                                for (int m = 0; m < 100; m++) {
                                    mtotal = (marks[m][0] + marks[m][1]);
                                    tot[m] = mtotal;
                                    double average = mtotal / (double) 2;
                                    avg[m] = average;
                                }
                                for (int k = 0; k < 100; k++) {
                                    if ((marks[i][0] + marks[i][1]) < tot[k]) {
                                        ++rank;
                                    }
                                }
                                place[i] = rank;
                            }
                        }

                        for (int i = 0; i < j - 1; i++) {
                            for (int k = 0; k < j - 1; k++) {
                                if (place[k] > place[k + 1]) {
                                    int temp = place[k];
                                    String detail1 = details[k][0];
                                    String detail2 = details[k][1];
                                    int tempMarks1 = marks[k][0];
                                    int tempMarks2 = marks[k][1];
                                    int tempTotal = tot[k];
                                    double tempAvg = avg[k];

                                    place[k] = place[k + 1];
                                    details[k][0] = details[k + 1][0];
                                    details[k][1] = details[k + 1][1];
                                    marks[k][0] = marks[k + 1][0];
                                    marks[k][1] = marks[k + 1][1];
                                    tot[k] = tot[k + 1];
                                    avg[k] = avg[k + 1];

                                    place[k + 1] = temp;
                                    details[k + 1][0] = detail1;
                                    details[k + 1][1] = detail2;
                                    marks[k + 1][0] = tempMarks1;
                                    marks[k + 1][1] = tempMarks2;
                                    tot[k + 1] = tempTotal;
                                    avg[k + 1] = tempAvg;

                                }
                            }
                        }
                        System.out.println("\n\n-----------------------------------------------------------------");
                        System.out.printf("| %-1s | %-5s | %-18s | %-10s | %-10s |%n", "Rank ", "ID ", "Name ", "Total Marks", "Avg. Marks");
                        System.out.println("-----------------------------------------------------------------");
                        for (int i = 0; i < 100; i++) {
                            if ((marks[i][0] != 0 && marks[i][1] != 0)) {
                                System.out.printf("| %-5d | %-5s | %-18s | %-11d | %-10.2f |%n", place[i], details[i][0], details[i][1], tot[i], avg[i]);
                                System.out.println("-----------------------------------------------------------------");
                            }
                        }

                        char choice = '_';
                        while (choice != 'y' || choice != 'y' || choice != 'N' || choice != 'n') {
                            System.out.print("\nDo you want to go back to main menu? (y/n) : ");
                            choice = scan.next().charAt(0);
                            if (choice == 'Y' || choice == 'y') {
                                b = false;
                                break;
                            } else if (choice == 'N' || choice == 'n') {
                                b = true;
                                break;
                            } else {
                            }
                        }

                        clearConsole();
                    }
                    break;


                case "9":
                    boolean boo = true;
                    while (boo) {
                        System.out.println("-----------------------------------------------------------------------------------------");
                        System.out.println("|                             BEST IN PROGRAMMING FUNDERMENTALS                          |");
                        System.out.println("-----------------------------------------------------------------------------------------");

                        for (int i = 0; i < j - 1; i++) {
                            for (int k = 0; k < j - 1; k++) {
                                if (marks[k][0] < marks[k + 1][0]) {
                                    String tempId = details[k][0];
                                    String tempName = details[k][1];
                                    int tempMarks1 = marks[k][0];
                                    int tempMarks2 = marks[k][1];

                                    details[k][0] = details[k + 1][0];
                                    details[k][1] = details[k + 1][1];
                                    marks[k][0] = marks[k + 1][0];
                                    marks[k][1] = marks[k + 1][1];

                                    details[k + 1][0] = tempId;
                                    details[k + 1][1] = tempName;
                                    marks[k + 1][0] = tempMarks1;
                                    marks[k + 1][1] = tempMarks2;
                                }
                            }
                        }
                        System.out.println("\n\n-------------------------------------------------------");
                        System.out.printf("| %-5s | %-18s | %-10s | %-10s |%n", "ID ", "Name ", "PRF Marks", "DBMS Marks");
                        System.out.println("-------------------------------------------------------");

                        for (int i = 0; i < j; i++) {
                            if ((marks[i][0] != 0 && marks[i][1] != 0)) {
                                System.out.printf("| %-5s | %-18s | %-10s | %-10s |%n", details[i][0], details[i][1], marks[i][0], marks[i][1]);
                                System.out.println("-------------------------------------------------------");
                            }
                        }

                        char choice = '_';
                        while (choice != 'y' || choice != 'y' || choice != 'N' || choice != 'n') {
                            System.out.print("\nDo you want to go back to main menu? (y/n) : ");
                            choice = scan.next().charAt(0);
                            if (choice == 'Y' || choice == 'y') {
                                boo = false;
                                break;
                            } else if (choice == 'N' || choice == 'n') {
                                boo = true;
                                break;
                            } else {
                            }
                        }

                        clearConsole();
                    }
                    break;


                case "10":
                    boolean bool = true;
                    while (bool) {
                        System.out.println("-----------------------------------------------------------------------------------------");
                        System.out.println("|                           BEST IN DATABASE MANAGEMENT SYSTEMS                          |");
                        System.out.println("-----------------------------------------------------------------------------------------");

                        for (int i = 0; i < j - 1; i++) {
                            for (int k = 0; k < j - 1; k++) {
                                if (marks[k][1] < marks[k + 1][1]) {
                                    String tempId = details[k][1];
                                    String tempName = details[k][1];
                                    int tempMarks1 = marks[k][0];
                                    int tempMarks2 = marks[k][1];

                                    details[k][0] = details[k + 1][0];
                                    details[k][1] = details[k + 1][1];
                                    marks[k][0] = marks[k + 1][0];
                                    marks[k][1] = marks[k + 1][1];

                                    details[k + 1][0] = tempId;
                                    details[k + 1][1] = tempName;
                                    marks[k + 1][0] = tempMarks1;
                                    marks[k + 1][1] = tempMarks2;
                                }
                            }
                        }
                        System.out.println("\n\n-------------------------------------------------------");
                        System.out.printf("| %-5s | %-18s | %-10s | %-10s |%n", "ID ", "Name ", "PRF Marks", "DBMS Marks");
                        System.out.println("-------------------------------------------------------");

                        for (int i = 0; i < j; i++) {
                            if ((marks[i][0] != 0 && marks[i][1] != 0)) {
                                System.out.printf("| %-5s | %-18s | %-10s | %-10s |%n", details[i][0], details[i][1], marks[i][0], marks[i][1]);
                                System.out.println("-------------------------------------------------------");
                            }
                        }

                        char choice = '_';
                        while (choice != 'y' || choice != 'y' || choice != 'N' || choice != 'n') {
                            System.out.print("\nDo you want to go back to main menu? (y/n) : ");
                            choice = scan.next().charAt(0);
                            if (choice == 'Y' || choice == 'y') {
                                bool = false;
                                break;
                            } else if (choice == 'N' || choice == 'n') {
                                bool = true;
                                break;
                            } else {
                            }
                        }

                        clearConsole();
                    }
                    break;

                default:
                    System.out.println("Invalid Input");
            }                                                                                                                                     //end of switch
        }
    }

    public static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
}