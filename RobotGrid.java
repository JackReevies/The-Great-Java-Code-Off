import java.util.ArrayList;
import java.util.List;

public class RobotGrid {
    public boolean isSafe(int x, int y) {
        return isMined(x, y);
    }

    public boolean isMined(int x, int y) {
        int total = getSquareValue(x) + getSquareValue(y);

        return total > 23;
    }

    public int getSquareValue(int coordinate) {
        int total = 0;
        coordinate = Math.abs(coordinate);

        while (coordinate > 0) {
            total += coordinate % 10;
            coordinate = coordinate / 10;
        }

        return total;
    }

    public String getCoordAsString(int x, int y) {
        return String.format("%s,%s", x, y);
    }

    public ArrayList<Tuple<x,y>> getValidNextCell(int x, int y) {
        return List.of()
    }

    public boolean jankBacktrack(int x, int y) {
        ArrayList<String> path = new ArrayList<>();

        if (x > 700 || y > 700) {
            return false;
        }

        for (int a = 0; a <= x; a++) {
            for (int b = 0; b <= y; b++) {
                String strCoord = getCoordAsString(a,b);

                if (path.stream().anyMatch(o -> o.equals(strCoord))) {
                    // We've been here before
                    continue;
                }

                if (!isMined(a, b)) {
                    path.add(strCoord);
                }
            }
            path.remove(path.size() - 1);
        }

        String goalCoordStr = getCoordAsString(x,y);

        return path.stream().anyMatch(o -> o.equals(goalCoordStr));
    }

    public int totalSafeSquares() {
        int totalSafeSquares = 0;

        for (int a = 0; a < 699; a++) {
            for (int b = 0; b < 699; b++) {
                if (jankBacktrack(a, b)) {
                    totalSafeSquares += 4;
                }
            }
        }

        return totalSafeSquares;
    }

    public int shortestSafeJourney(int a, int b, int x, int y) {
        // TODO: Add implementation logic here
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
