import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {

        String[] ans = new String[score.length];

        // Max heap: [score, index]
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[0] - a[0]
        );

        // Store score and original index
        for (int i = 0; i < score.length; i++) {
            pq.offer(new int[]{score[i], i});
        }

        // Gold Medal
        int[] curr = pq.poll();
        ans[curr[1]] = "Gold Medal";

        // Silver Medal
        if (!pq.isEmpty()) {
            curr = pq.poll();
            ans[curr[1]] = "Silver Medal";
        }

        // Bronze Medal
        if (!pq.isEmpty()) {
            curr = pq.poll();
            ans[curr[1]] = "Bronze Medal";
        }

        // Remaining positions
        int pos = 4;

        while (!pq.isEmpty()) {
            curr = pq.poll();

            ans[curr[1]] = String.valueOf(pos);
            pos++;
        }

        return ans;
    }
}