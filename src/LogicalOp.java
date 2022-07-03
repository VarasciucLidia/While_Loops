public class LogicalOp {

    //1. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice numrul primit,
    // si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru. Atentie la crearea tipului
    // metodei, deoarece metoda afiseaza, nu returneaza.

    public void exerciseOne(int x)
    {
        do {
            System.out.println(x);
            x++;
        } while (x <= 100);
    }

    //2. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice numrul primit, si sa afiseze
    //in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
    // deoarece metoda afiseaza, nu returneaza.

    public void exerciseTwo(int x)
    {
        do {
            System.out.println(x);
            x--;
        } while (x >= -100);
    }

    //3. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar. Metoda sa afiseze o numaratoare intre cele
    // doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea(ex: daca int x e primul parametru iar int y
    // este cel de-al doilea, numaratoarea sa se faca de la x, la y.

    public void exerciseThree(int x,int y)
    {
        int i=x;
        do {
            System.out.println(i);
            i++;
        } while (i <= y);
    }
    //4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar. Metoda trebuie sa verifice care dintre cele
    // doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.(ex: daca int x e primul
    // parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).

    // 5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

    public void exerciseFive()
    {
        int  i=1;
        do
            {
                if(i % 2 == 0){
                System.out.println(i);}
                i++;
            } while(i<=100);
    }

    //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

    public void exerciseSix()
    {
        int  i=1;
        do
        {
            if(i % 2 == 1){
                System.out.println(i);}
            i++;
        } while(i<=100);
    }

    //7. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899. Sa se afiseze suma totala, iar dupa aceea sa se
    // calculeze si afiseze media numerelor din acel interval. Introduceti o variabila int count in metoda, pentru a numara toate numerele
    // din interval. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public void exerciseSeven()
    {
        int start=111;
        int finish=8899;
        int sum=0;
        double count=0;

        while(start<=finish)
        {
            sum=sum+start;
            start++;
            count++;
        }
        System.out.println(start/count);
    }

    //8. Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor divizibile cu 7, din acel
    // interval. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

   public void exerciseEight(int lowerNumber, int upperNumber)
   {
       long   count = 0L;
       long   sum   = 0L;
       int i = lowerNumber;

       while ( i <= upperNumber) {
           i++;
           if (i % 7 != 0) {
               continue;
           }
           sum += i;
           count++;
       }

       System.out.printf ("The average is %.2f", ((double) sum / count));
       System.out.println();
   }

    //9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.

    public void exerciseNine()
    {
        int n0 = 1 , n1 = 1 , n2;
        System.out.print ( n0 + " " + n1 + " " ) ;
        int i=0;
        while(i<18)
        {
            n2 = n1 + n0;
            System.out.print ( n2 + " " ) ;
            n0 = n1;
            n1 = n2;
            i++;
        }
        System.out.println () ;
    }

    //10. Creati o metoda numita CozaLozaWoza.

    public void CozaLozaWoza()
    {
        int i = 1;

        while (i <= 110) {
            boolean test = false;
            if (i % 3 == 0) {
                System.out.print("coza");
                test = true;
            }
            if (i % 5 == 0) {
                System.out.print("loza");
                test = true;
            }
            if (i % 7 == 0) {
                System.out.print("woza");
                test = true;
            }
            if (!test) {
                System.out.print(i);
            }
            System.out.print(" ");
            if (i % 11 == 0) {
                System.out.println();
            }
            i++;
        }
    }

}
