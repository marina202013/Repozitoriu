public class NumInt {
    int numar;
    int nr;
    int sum;
    String text="Textul";
    int setnum(int n1){
        numar = n1;
        return numar;
    }

    void Text1(String t1, String t2) {

    }

    String Text2(){
        return text;
    }

    int Conversie(char ch){
         nr=Character.getNumericValue(ch);
        return nr;
    }

    int SumNum(){
        for(int i=0; i<5; i++){
            sum=sum+i;
        }
        return sum;
    }
    void NumPare(int n){
        System.out.print("Numere pare: ");
        int j=0;
        do {
           if (j%2==0) {
                System.out.print(j+", ");
            }
            j++;
        }
        while (j<n);
    }

    void Hello(){
        for(int i=0; i<10; i++){
            System.out.println("Hello");
        }
    }

    void NumImPare(int n){
        System.out.print("Numere impare: ");
        int j=0;
        do {
            if (j%2!=0) {
                System.out.print(j+", ");
            }
            j++;
        }
        while (j<n);
    }
}
