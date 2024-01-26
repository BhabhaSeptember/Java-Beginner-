package ex07_1_exercise;

//1. Use the indexOf method to get the index for the space character (" ")
//     within custName.  Assign it to spaceIdx.
//2. Use the substring method and the spaceIdx to get the first name
//     portion of custName.  Assign it to firstName.  Print firstName.

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;

        // Get the index of the space character (" ") in custName. 
        spaceIdx = custName.indexOf(" ");
        System.out.println("Index of space = " + spaceIdx);

        // Use the substring method parse out the first name and print it.
        //NOTE: substring(int beginIndex, int endIndex)
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);
        
    }
}
