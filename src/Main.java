public class Main {





    public static void main(String[] args){
        String [] arr = {"Hello", "Hey", "Cool", "Dog", "Rat", "Test", "Boy", "SJ"};

        String [] temp;
        Filter f = (x)-> {

                if (x.length() > 3){
                    return false;
                }
                else{
                    return true;
                }

        };
        

        temp = filter(arr, f);


        for(int i =0; i<temp.length; i++){
            System.out.println(temp[i]);
        }
    }

    public static String[] filter(String[] a, Filter f){

        int count = 0;
        String[] temp = new String[a.length];
        for(int i =0 ;i<a.length;i++){
            if(f.accept(a[i])){
                temp[i] = a[i];
                count++;
            }
        }

        a = new String[count];
        int countTwo = 0;
        for(int i=0;i<temp.length;i++){
            if(temp[i] != null){
                a[countTwo] = temp[i];
                countTwo++;
            }

        }
        return a;

    }



}
