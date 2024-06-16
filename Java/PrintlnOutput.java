package Java;

public class PrintlnOutput {

// Explain the output of this code: 
public static void main(String args[]){
    // It goes from left to right, so 100 + 100 = 200 and it doesn't have to do anything fancy because they are the same datatype
    // Then it has to cast 200 as a string to contcatenate it to the string of 'text'
    // Therefore 200text is the output
    System.out.println(100 + 100 + "text");

    // On the other hand, the first 100 will have to concatenate to the string of 'text' first, making a new string of 'text100'
    // then it will go through the same process and cast the other 100 to the new string
    // Therefore text100100 is the output 
    System.out.println("text" + 100 + 100);
}
}
