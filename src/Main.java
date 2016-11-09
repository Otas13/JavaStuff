public class Main {

    // jakejkoliv sortici algoritmus, bubble je nejjednodussi, ale taky nejmene efektivni
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    // kdyby jsi chtěl vypsat pole na debug
    public static void printStuff(int[] stuff){
        for(int i = 0; i < stuff.length; i++) System.out.print(stuff[i] + ", ");
    }

    public static void main(String[] args)
    {
        // init pole
        int[][] stuff = {
                {4534, 76, 98345, 988, 123},
                {272, 624, 843, 233, 4554},
                {125, 268, 3567, 100, 76}
        };

        // pole kde budou nejnizsi indexy kazdeho radku multipole
        int[] lowestIndexes = new int[stuff.length];

        // pro kazdy radek v poli
        for (int i = 0; i < stuff.length; i++)
        {
            // kazdy radek sesorti od nejmensiho, radek = 2D pole
            bubbleSort(stuff[i]);
            // do pole s minIndexy pridej prvni prvek radku
            lowestIndexes[i] = stuff[i][0];
        }

        // sesorti od nejmensiho vsechny nejmensi indexy kazdeho radku
        bubbleSort(lowestIndexes);
        // happy end
        System.out.println(lowestIndexes[0]);
    }
}
