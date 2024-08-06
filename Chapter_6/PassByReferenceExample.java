public class PassByReferenceExample { 
    public static void main(String[] args) { 
        // Creating an instance of MyObject 
        MyObject obj = new MyObject(); 

        // Setting the initial value of the object's field 
        obj.value = 10; 

        // Printing the value before invoking the method 
        System.out.println("Object value before invoking the method: " + obj.value); 

        // Calling the method to modify the object's value 
        modifyObject(obj); 

        // Printing the value after the method call 
        System.out.println("After method call, obj.value: " + obj.value); // obj.value is now 20 
    } 

    // Method to modify the object's value 
    static void modifyObject(MyObject obj) { 
        obj.value = 20; 
    } 
} 

// Definition of the MyObject class 
class MyObject { 
    int value; 
} 
