import java.util.*;
import java.util.Map.*;

//Дан список сотрудниуов
//написать программу, кот. выведет повторяющиеся имена с количеством повторений
//и отсортирует их по убыванию популярности

public class task_2 {
    public static void main(String[] args) {
        LinkedList<String> namesList = new LinkedList<>();
        namesList.add("Bob");
        namesList.add("Vik");
        namesList.add("Beckie");
        namesList.add("Bob");
        namesList.add("James");
        namesList.add("David");
        namesList.add("Bob");
        namesList.add("David");
        namesList.add("Vik");
        namesList.add("Hellen");
        namesList.add("Beckie");
        namesList.add("Roy");
        namesList.add("Bob");
        namesList.add("Vik");
        System.out.println(namesList);
    
        Map<String, Integer> persons = new LinkedHashMap<>();
        for(String name : namesList){
            int count = 1;
            if(persons.containsKey(name)) {
                count = persons.get(name) + 1;     
            }
            persons.put(name, count);
        }
      
        // persons.entrySet().forEach(System.out::println);
        for(int j = persons.size(); j > 0; j--){
            if(persons.containsValue(j)){ 
                System.out.printf("%s = %s\n", getKeysByValue(persons, j), j);
            }
        }
    }
    //Находим ключи по значению
    public static <T, E> Set<T> getKeysByValue(Map<T, E> map, E value) {
        Set<T> keys = new HashSet<T>();
        for (Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }

   
}
