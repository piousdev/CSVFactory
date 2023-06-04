package csv.factory;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

/**
 * Class for selecting random elements from an array
 */
public class RandomSelector {
    /**
     * Constants for RandomSelector
     */
    private static final Random RANDOM = new Random();

    /**
     * Selects a random element from the given array
     * @param array
     * @return a random element from the given array
     */
    public static String selectRandom(String @NotNull [] array) {
        int index = RANDOM.nextInt(array.length);
        return array[index];
    }
}

