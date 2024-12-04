public class nested
{
    public static void main(String[] args)
    {
        int a=20;
        int b=23;
        int c=40;
        if(a<b){
            if(a<c){
                System.out.println(" a is smaller");
            }
            else{
                System.out.println("b is smaller");
            }
        }
        else{
            System.out.println("c is smaller");
        }
    }
}