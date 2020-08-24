public class Problema1 {
    public static void  main(String[] params){
        NumInt num=new NumInt();
        num.setnum(2);
        System.out.println(num.numar);
        num.Text2();
        System.out.println(num.text);
        num.Conversie('5');
        System.out.println(num.nr);
        num.SumNum();
        System.out.println("Suma="+ num.sum);

        num.NumPare(15);
        System.out.println();

        num.Hello();

        num.NumImPare(15);
        System.out.println();

    }
}
