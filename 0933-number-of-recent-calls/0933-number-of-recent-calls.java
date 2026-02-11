import java.util.Queue;
import java.util.LinkedList;

class RecentCounter {

    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        // Add current request
        queue.offer(t);

        // Remove requests older than t - 3000
        while (!queue.isEmpty() && queue.peek() < t - 3000) {
            queue.poll();
        }

        // Remaining requests are within [t-3000, t]
        return queue.size();
    }
}