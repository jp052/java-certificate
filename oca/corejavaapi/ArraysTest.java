import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysTest {
	public static void main(String[] args) {
		ArraysTest arraysTest = new ArraysTest();
		arraysTest.arrayCreation();
		arraysTest.arrayListCreation();
		arraysTest.listToArrayConversion();
		arraysTest.arrayToArrayListConversion();
		arraysTest.arrayListCreationFixedAndDynamic();
		arraysTest.array2dInitialisationAndAccess();
		arraysTest.array2dIllegalInitialization();
		arraysTest.array2dLength();
		
		MatrixTestClass matrixTest = new MatrixTestClass();
		matrixTest.loadMatrix();
	}
	
	private void arrayCreation() {
		int[] numbers1 = new int[3];
		int[] numbers2 = new int[] {1,2,3}; //
		int[] numbers3 = {1,2,3}; //anonymes Array		
	}
	
	private void arrayListCreation() {
		//variante 1:
		List<String> list = new ArrayList<>();
		list.add("blubb");
		list.add("bla");
		
		//variante 2 (list2 ist keine ArrayList, sondern eine fixe Liste. Siehe: arrayListCreationFixedAndDynamic():
		List<String> list2 = Arrays.asList("one", "two");
	}
	
	private void listToArrayConversion() {
		System.out.println("\n listToArrayConversion:");
		
		List<String> list = Arrays.asList("one", "two");
		Object[] objectArray = list.toArray();
		System.out.println("objectArray length: " + objectArray.length); //output: 2
		
		String[] stringArray = list.toArray(new String[0]);
		System.out.println("stringArray length: " + stringArray.length); //output: 2
		
	}
	
	/**
	* Beim convertieren von array zu List, wird eine sogenannte "backed list" verwendet. <br>
	* D.h. Array uns Liste sind aneinander gekoppelt. Änderungen in einem der beiden spiegelt sich im anderen wieder.
	**/
	private void arrayToArrayListConversion() {	
		System.out.println("\n arrayToArrayListConversion: ");
		
		String[] stringArray = {"bla", "blubb"};
		List<String> stringFixedList = Arrays.asList(stringArray); //keine ArrayList, sondern eine Liste mit fixer länge.
		System.out.println("stringFixedList size: " + stringFixedList.size()); //output: 2
		System.out.println("stringArray before: " + Arrays.toString(stringArray));
		
		stringFixedList.set(1, "ElementBackedList"); //ok, da ein existierendes Feld geändert wird.
		stringArray[0] = "ElementBackedArray";
		
		System.out.println("stringArray after modification: " + Arrays.toString(stringArray)); //oder: for(String b : stringArray) System.out.print(b + " ");
		
		//try-catch, damit nachfolgende methoden noch aufgerufen werden.
		try {
			stringFixedList.remove(1); //UnsupportedOperationException, da die größe einer fixen Liste nicht geändert werden darf.
			
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}
		
		//ohne generics: todo
	}
	
	private void arrayListCreationFixedAndDynamic() {	
		System.out.println("\n arrayListCreationFixedAndDynamic: ");
		
		//Kurze variante, aber dafür mit einer fixen Liste:
		List<String> fixedList = Arrays.asList("one", "two");
		try {
			fixedList.remove(1); //UnsupportedOperationException, da die größe einer fixen Liste nicht geändert werden darf.
			
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}
		System.out.println("fixedList size: " + fixedList.size());
		
		//normale Variante mit ArrayList:
		List<String> normalList = new ArrayList<>();
		normalList.add("blubb");
		normalList.add("bla");
		normalList.remove(1);
		System.out.println("normalList size: " + normalList.size());
	}
	
	private void array2dInitialisationAndAccess() {
		System.out.println("\n array2D: ");
		
		//####Direkte Deklaration und Initialisierung mit Werten:####
		//längen des jeweiligen Array wird automatisch festgelgt, durch die Anzahl Elemente. Jede Spalte hat eine andere Länge
		//Ein einzelnes Element kann bei einem int array nicht mit null befüllt werden, nur eine ganze Spalte/Zeile, die dann ein Array Objekt ist.
		int array2dFastInit[][] = {{1,2}, {3,4, 5}, {6}, null}; 
		//jedes Array in einer {} ist eine Spalte.
		//Darstellung:
		//   0 | 1 | 2 | 3
		//0  1   3   6   null (ganze Spalte/Array)
		//1  2   4
		//2      5
		//3		
		
		//Zugriff auf Elemente und ganze Dimension/Array
		//Die erste Dimension bestimmt die x-Achse, die zweite die y-Achse.
		int element01value2 = array2dFastInit[0][1];
		System.out.println("element01value2: " + element01value2);
		
		int[] array0 = array2dFastInit[0]; //holte den der ersten spalte
		System.out.println("array0: " + Arrays.toString(array0));
		
		
		//####Ohne Initialisierung von Werten Variante 1:####
		//Anmerkung: So können nur array quadrate erstellt werden, jede Spalte hat also die selbe Länge. Hier immer 1 also:
		//   0 | 1 | 2 
		//0  1   3   null   (ganze Spalte/Array)
		//1  2   0   		
		int [][] array2dVariation1 = new int[4][2]; //[3] ist die Länge der x-Achse, [2] ist Länge der y-Achse.
		array2dVariation1[0][0] = 1;
		array2dVariation1[0][1] = 2;
		
		array2dVariation1[1][0] = 3;
		//array2dVariation1[1][1] = 0; //automatisch 0
		
		array2dVariation1[2] = null; //ganzes Array ist null
		
		//2d Array output:
		try {
			for(int[] inner : array2dVariation1) {
				for(int num: inner) { //null array an position [2] wirft nullpointer exception
					System.out.println(num  + " ");
				}
				System.out.println();
			}
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
				
		//####Ohne Initialisierung von Werten Variante 2:####
		
	}
	
	private void array2dIllegalInitialization() {		
		//int[1][2] sizeIllegal = new int[][]; //Size nicht links vom Zuweisungsoperator erlaubt.		
		//int[][] sizeNotOk1 = new int [][]; //Mindestens die ersten Dimension muss angegeben werden.
		//int[][] sizeNotOk = new int [][2]; //Nicht Erlaubt, Array größe bei Mehrdimensional muss von links nach rechts angegeben werden
		
		//folgende sind erlaubt:
		int[][] sizeOkDynamic = new int [2][]; //Erlaubt, die größe der 2. Dimension wird automatisch ermittelt 
		int[][] sizeOkFix = new int [2][3]; //legt göße fix fest.
	}
	
	private void array2dLength() {
		System.out.println("\n array2dLength:");
		int[][] twoD = { { 1, 2, 3} , { 4, 5, 6, 7}, { 8, 9, 10, 5, 6 } };
		
		System.out.println(twoD[1].length); //output: 4. für Array   { 4, 5, 6, 7},
		System.out.println(twoD.length); //output: 3. für die länge der x-achse bzw. 1. Dimension
		System.out.println(twoD[2].getClass().isArray());		
	}
	
	private void array3dUsage() {
		double daaa[][][] = new double[3][][];
		double d = 100.0;
		double[][] daa = new double[1][1];
		
		daaa[0] = daa; //funktioniert, da die erste dimension ein 2d array enthalten muss.
		daa = daaa[0]; //funktioniert, da die erste dimensin von daaa ein 2d array enthält.
		
	}
	
	
	
}

class MatrixTestClass {

    int[][] matrix = new int[2][3];
    
    int a[] = {1, 2, 3};
    int b[] = {4, 5, 6};
            
    public int compute(int x, int y){
        return a[x]*b[y];
    }
    
    public void loadMatrix(){
		System.out.println("\n MatrixTestClass.loadMatrix: ");
        for(int x=0; x<matrix.length; x++){
            for(int y=0; y<matrix[x].length; y++){
                matrix[x][y] = compute(x, y);
            }
        }
		
		System.out.println(Arrays.deepToString(matrix));
    }
}