import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {

    private List<Todo> myList;

    public ArrayListDemo() {
        myList = new ArrayList<>();
    }

    public static void main(String[] args) {
        ArrayListDemo demo = new ArrayListDemo();
        Scanner sc = new Scanner(System.in);
        int choice;
        int aux;
        boolean exit = false;
        
        Todo myFirstTodo = new Todo();
        myFirstTodo.desc = "Study Java";
        myFirstTodo.completed = true;

        demo.addTodo(myFirstTodo);
        demo.viewTodos();
        
        while(exit==false){
            System.out.println("What do you want to do?");
            System.out.println("1. See my To do list");
            System.out.println("2. Add a new task");
            System.out.println("3. Remove a task");
            System.out.println("4. Mark a task as completed");
            System.out.println("5. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            if(choice == 5){
                exit = true;
            }
            else{
                switch(choice){
                    case 1:
                        demo.viewTodos();
                        break;
                    case 2:
                        System.out.println("Write a description for the task: ");
                        Todo temp = new Todo();
                        temp.desc = sc.nextLine();
                        temp.completed = false;
                        demo.addTodo(temp);
                        System.out.println("Task added!");
                        break;
                    case 3:
                        demo.viewTodos();
                        System.out.println("Write the number of the task to be removed");
                        aux = sc.nextInt();
                        sc.nextLine();
                        demo.myList.remove((aux-1));
                        System.out.println("Task removed!");
                        break;
                    case 4:
                        demo.viewTodos();
                        System.out.println("Write the number of the completed task");
                        aux = sc.nextInt();
                        sc.nextLine();
                        Todo td = demo.myList.get((aux-1));
                        td.completed = true;
                        System.out.println("Task completed, congratulations!");
                        break;
                    default:
                        System.out.println("Choose a valid option");
                        break;
                }
            }
            System.out.println("\n");
        }
        sc.close();
        

        
    }
    
    public void addTodo(Todo myTodo) {
        myList.add(myTodo);
    }

    public void viewTodos() {
        int i = 0;
        String s = new String();
        for (Todo todo : myList) {
            i++;
            s = String.valueOf(i);
            System.out.println(s + ".- " + todo);
        }
    }
}

class Todo {
    String desc;
    boolean completed;

    @Override
    public String toString() {
        return "desc: " + desc + " status: " + completed;
    }
}