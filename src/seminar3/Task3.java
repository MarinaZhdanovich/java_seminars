package seminar3;
/*
Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
    public class Task3 {
        static List<String> planets = new ArrayList<>();

        public static void main(String[] args) {
            fillPlanets();
            System.out.println(print(planets));
            deleteElement(planets);
        }

        public static void fillPlanets() {
            planets.add("Нептун");
            planets.add("Сатурн");
            planets.add("Венера");
            planets.add("Марс");
            planets.add("Сатурн");
            planets.add("Сатурн");

        }

        public static List<String> print(List<String> arg) {
            List<String> result = new ArrayList<>();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < arg.size(); i++) { //size для коллекций
                if (!result.contains(arg.get(i))) {
                    result.add(arg.get(i));
                    int count = 0;
                    for (int j = 0; j < arg.size(); j++) {
                        if (arg.get(i).contains(arg.get(j))) {
                            count++;
                        }

                    }
                    stringBuilder.append(arg.get(i))
                            .append(" : ")
                            .append(count)
                            .append(",");
                }


            }
            return List.of(stringBuilder.toString().split(","));
        }


        public static void deleteElement(List<String> arg) {
            arg.sort(String::compareTo);
            for (int i = 1; i < arg.size(); i++) {
                if(arg.get(i).equals(arg.get(i - 1))){
                    arg.remove(arg.get(i));
                    i --;
                }
            }
            System.out.println(arg);
        }



        public static void deleteElements(List<String> arg) { // второй вариант
            arg.sort(String::compareTo);
            Iterator<String> iterator = arg.iterator();
            String previous = iterator.next();
            while (iterator.hasNext()) {
                String current = iterator.next();
                if (current.equals(previous)) {
                    iterator.remove();
                } else {
                    previous = current;
                }
            }
            System.out.println(arg);
        }
    }
