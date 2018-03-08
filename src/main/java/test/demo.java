package test;

/**
 * Created by Administrator on 2018/3/4 0004.
 */
public class demo {

    public static void main(String[] args){


        String s = null ;
        try{
            System.out.println(s.toString());

        }catch (Exception e){
            System.out.println("OK");
            return;
        }
        finally {
            System.out.println("OK1");
            //return;
        }

        System.out.println("OK2");

       /* for(int i=1;i<1;i++){
            System.out.println("OK");
        }
*/

    }

}
