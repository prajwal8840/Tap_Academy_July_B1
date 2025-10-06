package AgregationAndCompostion;

//Heart class (Composition)
class Heart {
 private int weight;
 private int bpm;

 public Heart(int weight, int bpm) {
     this.weight = weight;
     this.bpm = bpm;
 }

 public int getWeight() {
     return weight;
 }

 public int getBpm() {
     return bpm;
 }
}

//Brain class (Composition)
class Brain {
 private int weight;
 private String colour;

 public Brain(int weight, String colour) {
     this.weight = weight;
     this.colour = colour;
 }

 public int getWeight() {
     return weight;
 }

 public String getColour() {
     return colour;
 }
}

//Bike class (Aggregation)
class Bike {
 private String brand;
 private int mileage;

 public Bike(String brand, int mileage) {
     this.brand = brand;
     this.mileage = mileage;
 }

 public String getBrand() {
     return brand;
 }

 public int getMileage() {
     return mileage;
 }
}

class Book {
 private String name;
 private String author;

 public Book(String name, String author) {
     this.name = name;
     this.author = author;
 }

 public String getName() {
     return name;
 }

 public String getAuthor() {
     return author;
 }
}

//Student class
class Student {
 // Composition: tightly bound objects
 private Heart heart;
 private Brain brain;

 public Student() {
     heart = new Heart(289, 72);
     brain = new Brain(1400, "grey");
 }

 public Heart getHeart() {
     return heart;
 }

 public Brain getBrain() {
     return brain;
 }

 // Aggregation: interact with Book and Bike using methods
 public void showBikeDetails(Bike bike) {
     System.out.println(bike.getBrand());
     System.out.println(bike.getMileage());
 }

 public void showBookDetails(Book book) {
     System.out.println(book.getName());
     System.out.println(book.getAuthor());
 }
}

//LinkedList class
public class Main {
 public static void main(String[] args) {
     Student student = new Student();

     Bike bike = new Bike("Duke", 35);
     Book book = new Book("Java", "JG");

     System.out.println(student.getHeart().getWeight());
     System.out.println(student.getHeart().getBpm());

     // Print Brain details
     System.out.println(student.getBrain().getWeight());
     System.out.println(student.getBrain().getColour());

     // Print Bike details
     student.showBikeDetails(bike);

     // Print Book details
     student.showBookDetails(book);
 }
}
