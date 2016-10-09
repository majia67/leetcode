package easy;

public class prob253 {
    public int minMeetingRooms(Interval[] intervals) {
        if (intervals == null || intervals.length == 0)
            return 0;
        int n = intervals.length;
        int[] count = new int[n];
            
        Arrays.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });
        
        int maxCount = count[0];
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n && intervals[j].start < intervals[i].end; j++)
                count[j]++;
            maxCount = Math.max(maxCount, count[i+1]);
        }
            
        return maxCount + 1;
    }
}
