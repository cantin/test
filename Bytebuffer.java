import java.nio.*;
public class Bytebuffer{
static  void f(){
      ByteBuffer bb = ByteBuffer.allocate(1024);
      bb.putChar('s');
      bb.putChar('w');
      bb.putChar('a');
      bb.rewind();
       bb.putInt(9);
      bb.rewind();
      System.out.println(bb.getInt());
      System.out.println(bb.getChar());
       System.out.println(bb.position());
         }
public static void main(String[] args){
             f();
}
}
          

