public class Main {

    public static int getFuckingLowestValueIndex(int[] shit) {
        int dirtyIndex = 0;
        // nejvyssi cislo co jde nastavit do int aby se dal mohlo porovnavat jen <
        int dirtyVal = Integer.MAX_VALUE;

        // kdyz najde mensi cislo, ulozi index a hodnotu
        for (int i = 0; i < shit.length; i++) {
            if (shit[i] < dirtyVal) {
                dirtyIndex = i;
                dirtyVal = shit[i];
            }
        }
        return dirtyIndex;
    }

    public static void main(String[] args)
    {
        // init pole
        int[][] stuff = {
                {4534, 76, 98345, 988, 123},
                {272, 624, 843, 233, 4554},
                {125, 268, 3567, -100, 76}
        };

        /*
            tady se dela v podstate to same jako v te metode
            muzes si s tim pohrat, rozbit ji na mensi kousky a pouzit je tu
         */

        // index X
        int dirtyLowestSluttyValIndex = 0;
        // index Y
        int deepThroatOfColumnIndex = 0;
        // val
        int sluttyLowestVal = Integer.MAX_VALUE;

        for (int i = 0; i < stuff.length; i++)
        {
            int tmpWhoreIndex = getFuckingLowestValueIndex(stuff[i]);

            if(stuff[i][tmpWhoreIndex] < sluttyLowestVal)
            {
                dirtyLowestSluttyValIndex = tmpWhoreIndex;
                deepThroatOfColumnIndex = i;
                sluttyLowestVal = stuff[i][tmpWhoreIndex];
            }
        }

        // tadaaa
        System.out.println("Val: " + sluttyLowestVal + " Index pos X: "
                + dirtyLowestSluttyValIndex + " pos Y: " + deepThroatOfColumnIndex);
    }
}
