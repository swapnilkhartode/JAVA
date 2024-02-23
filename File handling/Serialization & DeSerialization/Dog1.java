import java.io.*;

class Dog2 implements Serializable
{
    private static final long serialVersionUID = 1L;
    int i = 10;
    int j = 20;
    int k = 30;
    int m = 40;
    int z = 20;
    String s="swapnil";
    
}


/*       First ase Karne

C:\Users\Swapnil\Desktop\Java Full Stack Tech Hub\BackEnd\Java\File IO\Serialization & DeSerialization>javac Dog1.java

C:\Users\Swapnil\Desktop\Java Full Stack Tech Hub\BackEnd\Java\File IO\Serialization & DeSerialization>javac Sender.java

C:\Users\Swapnil\Desktop\Java Full Stack Tech Hub\BackEnd\Java\File IO\Serialization & DeSerialization>javac Receiver.java

C:\Users\Swapnil\Desktop\Java Full Stack Tech Hub\BackEnd\Java\File IO\Serialization & DeSerialization>java Sender

C:\Users\Swapnil\Desktop\Java Full Stack Tech Hub\BackEnd\Java\File IO\Serialization & DeSerialization>java Receiver
10.........20 */

/*     

C:\Users\Swapnil\Desktop\Java Full Stack Tech Hub\BackEnd\Java\File IO\Serialization & DeSerialization>javac Dog1.java

C:\Users\Swapnil\Desktop\Java Full Stack Tech Hub\BackEnd\Java\File IO\Serialization & DeSerialization>javac Sender.java

C:\Users\Swapnil\Desktop\Java Full Stack Tech Hub\BackEnd\Java\File IO\Serialization & DeSerialization>javac Receiver.java

C:\Users\Swapnil\Desktop\Java Full Stack Tech Hub\BackEnd\Java\File IO\Serialization & DeSerialization>java Sender

C:\Users\Swapnil\Desktop\Java Full Stack Tech Hub\BackEnd\Java\File IO\Serialization & DeSerialization>javac Dog1.java   // after serialization .class file changes

C:\Users\Swapnil\Desktop\Java Full Stack Tech Hub\BackEnd\Java\File IO\Serialization & DeSerialization>java Receiver */