package Project;

import java.util.ArrayList;
import java.util.Scanner;

/*
    ToDo List App is a kind of app that generally used to maintain our day-to-day tasks or list
    everything that we have to do, with the most important tasks at the top of the list, and the
    least important tasks at the bottom. It is helpful in planning our daily schedules.

 */

public class ToDoApp {
    public static void main(String[] args) {

        System.out.println("\nWelcome to your To Do Application!\n");
        System.out.println("Please Enter your Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(" Hello " + name);

        int choice = 0;
        int n =0;
        String a = "n";
        ArrayList<String> list = new ArrayList<>();

        do {
            //Display the Menu
            System.out.println("Please choose an option");
            System.out.println("1. Enter a task ");
            System.out.println("2. Remove a task ");
            System.out.println("3. List all tasks");
            System.out.println("4. Exit");

            choice = sc.nextInt();

            switch(choice) {

                // to add list of task

                case 1: System.out.println("Enter number of tasks: ");
                    n = sc.nextInt();
                    System.out.println("Enter task : \n");
                    for(int i=0;i<n;i++){
                        list.add(sc.next());
                    }
                    System.out.println("Want to continue 'y' for YES 'n' for NO : ");
                    a = sc.next();
                    break;

                    // to remove task, if get completed for any other case

                case 2: for(int i=0;i<n;i++){
                    System.out.println(i+1 + ". \t" + list.get(i));
                }
                    System.out.println("Enter the task you want to delete: ");
                    int delete = sc.nextInt();
                    int m = 0;
                    for(int i=0;i<n;i++){
                        if(i+1 == delete){
                            list.remove(i);
                            break;
                        }
                        else
                            continue;
                    }
                    n--;
                    System.out.println("Task has been removed\n");
                    System.out.println("Want to continue 'y' for YES 'n' for NO : ");
                    a = sc.next();
                    break;

                   // to display the task

                case 3: for(int i=0;i<n;i++){
                    System.out.println(i+1 + ". \t" + list.get(i));
                }
                    System.out.println("Want to continue 'y' for YES 'n' for NO : ");
                    a = sc.next();
                    break;
                default :
                    System.out.println("Your choice is incorrect");
            }
        } while (a.compareTo("y") == 0);
    }
}


