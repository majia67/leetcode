package medium;

public class Prob011_Container_With_Most_Water {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int maxArea = 0;
        int area = 0;
        while (i < j) {
            if (height[i] > height[j]) {
                area = height[j] * (j - i);
                j--;
            }
            else {
                area = height[i] * (j - i);
                i++;
            }
            if (area > maxArea)
                maxArea = area;
        }
        return maxArea;
    }
}
