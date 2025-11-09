public class Main {
    public static void main(String[] args) {

        //Создание объекта
        Cache<String> items = new Cache<>(5); 
// ==================================================================================     
        //Проверка метода add()
        items.add("Apple");     
        System.out.println(items.toString());

        items.add("Orange");
        System.out.println(items.toString());

        items.add("Pineapple");
        System.out.println(items.toString());

        items.add("Lemon");
        System.out.println(items.toString());

        items.add("Strawberry");
        System.out.println(items.toString() + "\n");
// ==================================================================================        
        //Проверка метода remove()
        items.remove("Lemon");      
        System.out.println(items.toString() + "\n");
// ==================================================================================
        //Проверка метода exist()
        System.out.println("Наличие объекта Apple: " + items.exist("Apple"));
        System.out.println("Наличие оъекта Lemon: " + items.exist("Lemon") + "\n");
// ==================================================================================
       //Проверка переполнения очереди
        items.add("Lime");        
        System.out.println(items.toString());

        items.add("Banana");
        System.out.println(items.toString() + "\n");
// ==================================================================================
        //Проверка методов getFirst() и getLast()
        System.out.println(items.getFirst() + " " + items.getLast() + "\n");
// ==================================================================================
        //Проверка метода getItemByIndex()     
        System.out.println(items.getItemByIndex(2));
    }
}