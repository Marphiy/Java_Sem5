import java.util.*;

//Реализуйте структуру телефонной книги, учитывая, что 1 чел 
//может иметь несколько телефонных номеров

public class task_1 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Map<String, LinkedList<String>> notebook = new HashMap<>();
      while(true){     
         System.out.println("Введите фамилию и имя контакта или 'end' для выхода: ");
         String cont = scanner.nextLine();
         if(cont.equals("end")) break;
         System.out.println("Введите номер/а телефонов абонента через запятую, в формате (+00000000): ");
         String[] fn = scanner.nextLine().split(",");
         LinkedList<String> phone_nums = new LinkedList<>();
         for(int i = 0; i < fn.length; i++){
            phone_nums.add(fn[i]);
         }
         if(notebook.containsKey(cont)) {
            System.out.println("Контатк с таким именем уже существет! Создайте новый контакт!");
         }
         else notebook.put(cont, phone_nums);
      }
      notebook.entrySet().forEach(System.out::println);
      scanner.close();
   } 
}
