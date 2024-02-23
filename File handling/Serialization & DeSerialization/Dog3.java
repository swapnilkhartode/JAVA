import java.io.*;

class Dog3 implements Serializable
{
    private static final long serialVersionUID = 1L;
    int i = 10;
    int j = 20;
    
}

/* 
 C:\Users\Swapnil\Desktop\Java Full Stack Tech Hub\BackEnd\Java\File IO\Serialization & DeSerialization>javac Dog3.java

C:\Users\Swapnil\Desktop\Java Full Stack Tech Hub\BackEnd\Java\File IO\Serialization & DeSerialization>javac Sender1.java

C:\Users\Swapnil\Desktop\Java Full Stack Tech Hub\BackEnd\Java\File IO\Serialization & DeSerialization>javac Receiver1.java

C:\Users\Swapnil\Desktop\Java Full Stack Tech Hub\BackEnd\Java\File IO\Serialization & DeSerialization>java Sender1

C:\Users\Swapnil\Desktop\Java Full Stack Tech Hub\BackEnd\Java\File IO\Serialization & DeSerialization>javac Dog3.java

C:\Users\Swapnil\Desktop\Java Full Stack Tech Hub\BackEnd\Java\File IO\Serialization & DeSerialization>java Receiver1 */