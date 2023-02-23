import java.util.Arrays;
public class Main {
  public static double [][] copySquare(double [][] square){
    // FIXME: don't hard-code the size of the array.... get it from the input
    int size = 3;

    double[][] sameArray = new double[size][size];
    for(int r = 0; r < size; r ++){
      for(int c = 0; c < size; c++){
        sameArray[r][c] = square[r][c];
      }
    }
    return sameArray;
  }


  public static double [][] copyRectangle(double [][] rectangle){
    // FIXME: don't hard-code the size of the array.... get it from the input
    int length = 4;
    int hight = 3;
    double [][] sameArray = new double[hight][length];
    for(int r = 0; r < hight; r ++){
      for(int c = 0; c < length; c ++){
        sameArray[r][c] = rectangle[r][c];
      }
    }
    return sameArray;
  }

  // good
  public static double [][] copyRagged(double [][] ragged){
    double [][] sameArray = new double[ragged.length][];
    for(int r = 0; r < ragged.length; r ++){
      sameArray[r] = new double[ragged[r].length];
      for(int c = 0; c < ragged[r].length;c++){
        sameArray[r][c] = ragged[r][c];
      }
    }
    
    return sameArray;
    
  }

  // TODO: implement withWeightedAverage


  public static void main(String[] args) {
    double[][] orig = new double[][]{{1,2},{4,5,6,6},{7,8,9,9,8,9,9}};
    double[][] newArr = copyRagged(orig);
    System.out.println(Arrays.deepToString(newArr));
  }
}