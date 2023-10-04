package seminar4;
/*
В классе MyQueue реализуйте очередь с помощью LinkedList со следующими методами:

enqueue() - помещает элемент в конец очереди
dequeue() - возвращает первый элемент из очереди и удаляет его
first() - возвращает первый элемент из очереди, не удаляя
getElements() - возвращает все элементы в очереди
queue.enqueue(1);
queue.enqueue(10);
queue.enqueue(15);
queue.enqueue(5);
System.out.println(queue.getElements());
// [1, 10, 15, 5]

queue.dequeue();
queue.dequeue();
System.out.println(queue.getElements());
// [15, 5]

System.out.println(queue.first());
// 15
 */
import java.util.LinkedList;

class MyQueue<T> {
    private LinkedList<T> queue;  //ссылка на объект класса LinkedList, private поле queue доступно только внутри класса и недоступно извне класса.
//T - это обобщенный тип (generic type). Обобщенные типы позволяют создавать классы и методы, которые могут работать с различными типами данных,
// без необходимости создания отдельных классов для каждого типа.
    public MyQueue() {
        queue = new LinkedList<>();   //конструктор класса MyQueue, который создает новый объект LinkedList и инициализирует поле queue пустым списком.
    }

    public void enqueue(T element) { //метод добавляет элемент в конец очереди
        queue.addLast(element); //в очереди элементы добавляются в конец и удаляются из начала.
    }

    public boolean isEmpty() { //проверяет, пуста ли очередь.
        return queue.isEmpty(); //метод isEmpty из LinkedList
    }

    public T dequeue() {  //метод удаляет и возвращает первый элемент из очереди. Если очередь пустая не может ничего удалить.
        if (isEmpty()) { // не имеет аргументов, так как знает, что нужно удалить первый элемент
            throw new IllegalStateException("Очередь пустая");
        }
        return queue.removeFirst();
    }


    public T first() { //метод просто показывает первый элемент очереди, но не удаляет его. Если очередь пуста, то сообщит.
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пустая"); //IllegalStateException несогласованное или неправильное состояние в программе
        }
        return queue.getFirst();
    }

    public LinkedList<T> getElements() { //метод дает список всех элементов, находящихся в очереди на данный момент.
        return new LinkedList<>(queue); //new все элементы в очереди в виде нового объекта LinkedList. Доступ к элементам очереди без изменения исходной очереди.
        // Новый список на основе queue, который содержит копии элементов из queue,
    }
}

//class MyQueue<T> {
//    private LinkedList<T> elements = new LinkedList<>();
//
//    public MyQueue() {
//    }
//
//    public MyQueue(LinkedList<T> elements) { //конструктор позволяет создать очередь, используя существующий LinkedList.
//    Если передать сюда список элементов, то он будет использован в качестве начального состояния очереди.
//        this.elements = elements;
//    }
//
//    public void enqueue(T element){
//        elements.add(element);
//    }
//
//    public T dequeue(){
//        T first = elements.getFirst();
//        elements.removeFirst();
//        return first;
//    }
//
//    public T first(){
//        return elements.getFirst();
//    }
//
//    public LinkedList<T> getElements() {
//        return elements;
//    }
//
//    public void setElements(LinkedList<T> elements) { //сеттер
//        this.elements = elements;   //принимает аргумент LinkedList<T> elements, который представляет собой новое значение для поля elements.
//    } //this.elements ссылается на поле класса, а elements (без this) ссылается на параметр метода. Это позволяет явно указать, с какой переменной мы работаем.
//} //используется для различения между полем класса elements и параметром метода elements, когда имена переменных совпадают.



// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task5 {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}
