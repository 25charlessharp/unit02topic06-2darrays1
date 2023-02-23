import java.util.Arrays;
public class Main {
  public static double [][] copySquare(double [][] square){
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

  public static void printTranspose(double [][] reverse){
    int origRows = reverse.length;
    int origColls = reverse[0].length;
    double [][] reverseArray = new double [origColls][origRows];
    for(int c = 0; c < origColls; c ++){
      for(int r = 0; r < origRows; r ++){
        reverseArray[c][r] = reverse[r][c];
      }
    }
    for(int r = 0; r < origColls; r ++){
      for(int c = 0; c < origRows; c ++ ){
        System.out.print(reverse[c][r] + " ");
      }
      System.out.println();
    }
    
  }



  public static void main(String[] args) {
    double[][] orig = new double[][]{
    {99, 85, 98},
    {98, 57, 79},
    {92, 77, 74},
    {94, 62, 81},
    {99, 94, 92},
    {80, 76.5, 67},
    {76, 58.5, 90.5},
    {92, 66, 91},
    {77, 70.5, 66.5},
    {89, 89.5, 81}
    };
    
    double[][] newArr = (orig);
    System.out.println(Arrays.deepToString(newArr));
    printTranspose(orig);
  }
}