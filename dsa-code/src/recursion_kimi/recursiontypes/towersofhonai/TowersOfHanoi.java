package recursion_kimi.recursiontypes.towersofhonai;

public class TowersOfHanoi {

    //source, middle, destination
    static void solve(int disk, char A, char B, char C) {
        if (disk == 1) {
            System.out.println("Move " + disk + " from " + A + " to " + C);
            return;
        }

        // MOVE TWO DISKS FROM A TO B USING C
        // The source is where you are coming from
        // The using is the middle
        // The destination is where you are going
        solve(disk - 1, A, C, B);
        System.out.println("Move " + disk + " from " + A + " to " + C);
        //MOVE TWO DISKS FROM B TO C USING A
        solve(disk - 1, B, A, C);
    }


    static void solveTwo(int disk, char source, char middle, char destination) {
        if (disk == 0) {
            System.out.println("Disk " + disk + " from " + source + " to " + destination);
            return;
        }
        // move two disks from a - source to b-destination using c-middle
        solveTwo(disk - 1, source, destination, middle);
        System.out.println("Disk " + disk + " from " + source + " to " + destination);
        //move the two disks from b - source to c - destination using a - middle
        solveTwo(disk - 1, middle, source, destination);
    }


    static void solveThree(int disk, char source, char middle, char destination){
        if (disk == 0) {
            System.out.println("Moving disk " + disk + " from " + source + " destination " + destination);
            return;
        }
        //move 2 disks from A - source to B - destination using C - middle
        solveThree(disk - 1, source,destination, middle);
        System.out.println("Moving disk " + disk + " from " + source + " destination " + destination);
        // move two disks from b - source to c - destination using a - middle
        solveThree(disk  - 1, middle, source, destination);
    }

    //the smallest disk is 1, mid is 2, the largest is 3
    static void main() {
        //solve(3, 'A', 'B', 'C');
        solveThree(899, 'A', 'B', 'C');
    }
}
