//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RandomWalkers {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]); // Default number of trials

        // Variable to accumulate the total steps across all trials
        long totalSteps = 0;

        for (int t = 0; t < trials; t++) {
            int x = 0; // Current x-coordinate of the walker, starts at center
            int y = 0; // Current y-coordinate of the walker, starts at center
            int steps = 0; // Steps taken in the current walk

            // Simulate a single random walk until the boundary is hit
            while (Math.abs(x) < n && Math.abs(y) < n) {
                // Generate a random number to decide direction (0: North, 1: South, 2: East, 3: West)
                int direction = (int) (Math.random() * 4); // Generates 0, 1, 2, or 3

                if (direction == 0) { // North
                    y++;
                } else if (direction == 1) { // South
                    y--;
                } else if (direction == 2) { // East
                    x++;
                } else if (direction == 3) { // West
                    x--;
                }
                steps++; // Increment step count for the current walk
            }
            totalSteps += steps; // Add steps from this trial to the total
        }

        // Calculate and print the average steps
        double averageSteps = (double) totalSteps / trials;
        System.out.println(" average number of steps = " + averageSteps);
    }
}