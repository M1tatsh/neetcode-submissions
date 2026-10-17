class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        int[] mostFrequent = new int[k];

        for (int num : nums)
            counts.put(num, counts.getOrDefault(num, 0) + 1);

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(counts.entrySet());
        entries.sort((a,b) -> Integer.compare(b.getValue(), a.getValue()));

        for (int i = 0; i < k; i++)
            mostFrequent[i] = entries.get(i).getKey();

        return mostFrequent;

    }
}
