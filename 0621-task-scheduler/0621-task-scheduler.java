class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];

        // Count frequency of each task
        for (char task : tasks) {
            freq[task - 'A']++;
        }

        int maxFreq = 0;
        int maxCount = 0;

        // Find maximum frequency
        for (int f : freq) {
            maxFreq = Math.max(maxFreq, f);
        }

        // Count how many tasks have max frequency
        for (int f : freq) {
            if (f == maxFreq) {
                maxCount++;
            }
        }

        // Apply formula
        int intervals = (maxFreq - 1) * (n + 1) + maxCount;

        return Math.max(tasks.length, intervals);
    }
}
