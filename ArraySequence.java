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
}
