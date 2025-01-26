public class BetterArray{
 public int[] array=new int[0];
 int length=0;
 int size=0;




    public BetterArray(int size){
        int[] newArray = new int[size];
        array=newArray;
        length=size;

    }


    public BetterArray(){
        int[] newArray = new int[0];
        array=newArray;
    }




    public int size(){
        int count=0;
        for(int i : array){
            if(i!=0){
                count++;
            }
        }
        return count;
    }


    public boolean add(int item){
        if (size == array.length) {
            int newSize;
            if (array.length == 0) {
                newSize = 1;
            } else {
                newSize = array.length * 2; 
            }
            int[] newArray = new int[newSize];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = item;
        size++;
        return true;
    }


    public void add(int index, int item){
         if (size == array.length) {
            int[] newArray = new int[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = item;
        size++;
       
    }


    public int get(int index){
        return array[index];
    }
   
    public int set(int index, int item){
        int num=array[index];
        array[index]=item;
        return num;
       
    }


    public int remove(int index){
        int num = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        array[size] = 0;
        return num;
    }
}
