public class array_basic {
    public static void main(String[] args) {
        // Creating a string and a integer array
        String [] EmpNames = {"Hrithik","Jeet","Duggu","Jerry"};      

        // Now displaying the names one by one from the array

        // To know thw address where the array is stored we can use this
        System.out.println("The array location is: "+EmpNames);

        // WE will use the concept of foreach loop to iterate through the array
        for (String string : EmpNames) {
            System.out.println(string);
        }

        // Now creating a integer array.....
        int [] EmpNumber = {12,14,15,16,55};

        // This is the location of the integer array
        System.out.print("The array locaion is: "+EmpNumber);

        // Displaying the array elements
        for (int i : EmpNumber) {
            System.out.println(i);
        }
        
        
    }
}

