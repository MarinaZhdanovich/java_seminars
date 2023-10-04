package seminar4;
/*
Реализовать стэк с помощью массива.
Нужно реализовать методы:
size(), empty(), push(), peek(), pop().
 */
import java.util.ArrayList;
import java.util.Stack;

public class GBStack {  //Стек - это структура данных, работающая по принципу "последним пришел, первым ушел" (Last-In, First-Out, LIFO).
    private int[] arr; //отложенная инициализация
    private int top; //индекс последнего добавленного элемента.
    private int capacity; //текущая ёмкость (максимальная длина) стека

    public GBStack() {  //конструктор класса, который инициализирует стек с начальной ёмкостью 3 элемента.
        int size = 3;
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    private void addCapacity() { //когда стек заполняется, его ёмкость увеличивается в два раза, создание нового массива, который вмещает больше элементов, и копирования элементов из старого массива в новый.
        int[] copy = new int[arr.length + arr.length / 2];
        System.arraycopy(arr, 0, copy, 0, arr.length);
        arr = copy; //переменная arr теперь ссылается на новый массив copy
        capacity = arr.length; //обновляется значение переменной capacity
    }

    public int size() { //возвращает текущий размер стека, то есть количество элементов в стеке
        return top + 1; //если стек пуст, то top равен -1.
        //добавляя 1 к top, мы получаем количество элементов в стеке, так как индексация массивов начинается с 0.
    }
    public boolean empty(){
        return top == -1;
    } //если стек пуст, то top равен -1)
    public GBStack push(int d){  // добавления элемента в стек
        if(isFull()){
            addCapacity();
        }
        arr[++top] = d;  //++ top увеличивает значение переменной top на 1 перед использованием его в выражении.
        return this;  //для обеспечения возможности цепочки методов при работе с объектом класса GBStack без необходимости создавать новую ссылку на него.
    } // stack.push(1).push(2).push(3)

    //Если бы push возвращал void, то код не был бы способен на цепочку методов, и каждый вызов push требовал бы отдельной строки
    // кода для каждой операции добавления элемента в стек.

    public int peek(){  //возвращает элемент, находящийся на вершине стека, но не удаляет его
        if(!empty()){
            return arr[top];
        }else {
            throw new RuntimeException("Stack is Empty");
        }
    }
    private boolean isFull(){
        return capacity == size();
    }

    public int pop(){ //для удаления и возврата элемента с вершины стека
        if(empty()){
            throw new RuntimeException("Stack is Empty");
        }
        peek(); //метод peek(), получаем значение верхнего элемента перед удалением.
        return arr[top--]; //top-- постфиксный декремент сначала текущее значение переменной top используется, а затем уменьшается на 1.
    }

    @Override //переопределям метод toString(), который унаследован от суперкласса Object.
    public String toString() {
        ArrayList<Integer> elements = new ArrayList<>();
        for (int i = 0; i < size(); i++) {
            elements.add(arr[i]);

        }
        return elements.toString(); //предоставляет строковое представление стека в удобном виде
    }
}

