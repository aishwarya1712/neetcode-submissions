class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Integer> positionToSpeed = new HashMap<>();
        for(int i = 0; i < position.length; i++){
            positionToSpeed.put(position[i], speed[i]);
        }

        Map<Integer, Integer> sortedMap = new TreeMap<>(Collections.reverseOrder());
        sortedMap.putAll(positionToSpeed);

        Stack<Double> times = new Stack<>();

        for(Integer p: sortedMap.keySet()){
            Integer s = sortedMap.get(p);

            double hypotheticalTime = (double) (target - p) / s;

            if(times.isEmpty() || hypotheticalTime > times.peek()){
                times.add(hypotheticalTime);
            }
        }

        return times.size();

    }
}
