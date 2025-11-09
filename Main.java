public class Main {
    public static void main(String[] args) {
        
        Cache<String> items = new Cache<>(5);

        items.add("Apple");
        System.out.println(items.toString());
        items.add("Orange");
        System.out.println(items.toString());
        items.add("Pineapple");
        System.out.println(items.toString());
        items.add("Lemon");
        System.out.println(items.toString());
        items.add("Strawberry");
        System.out.println(items.toString());
        items.add("Lime");        
        System.out.println(items.toString());
        System.out.println(items.getFirst() + " " + items.getLast());
        System.out.println(items.getItemByIndex(2));
    }
}