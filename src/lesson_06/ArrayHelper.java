package lesson_06;

public class ArrayHelper {

    public int findMinNumber(int[] arr){
        return -1;
    }

    public int findMaxNumber(int[] arr){
        return -1;
    }

    public int[] sort(int[] arr){
        sortAsc(arr);
        return arr;
    }
    //sap xep
    /**
    *@param sortType asc, desc
     *
    * */
    public int[] sort(int[] arr, String sortType){
        if (sortType.equals("asc")){
            sortAsc(arr);
        }else if (sortType.equals("desc")){

        }
        return arr;
    }
    //trung lap se tao ra 1 method rieng

    private void sortAsc(int[] arr){

    }
}
