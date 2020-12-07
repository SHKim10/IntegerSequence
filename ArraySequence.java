import java.util.*;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int[] data;
  public ArraySequence(int[] other){
    data = new int[other.length];
    for (int i = 0; i < other.length; i++){
      data[i] = other[i];
    }
    currentIndex = 0;
  }

  public ArraySequence(IntegerSequence otherseq){
    otherseq.reset();
    data = new int[otherseq.length()];
    int i = 0;
    while (otherseq.hasNext()){
      data[i] = otherseq.next();
      i++;
    }
    otherseq.reset();
  }

  public void reset(){
    currentIndex = 0;
  }

  public int length(){
    return data.length;
  }
}
