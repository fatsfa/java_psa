class Test{
    public static void main(String[] args){
        /*int[] arr = {1,2,3};
        for(int a : arr){
            System.out.println(a);
            System.out.println("Hy");
        }*/
        int i = 1;
        while(i<=10){
            if(i++ == 5)
            continue;
            System.out.println(i);
        }
        
    }
}