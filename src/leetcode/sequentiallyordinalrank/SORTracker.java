package leetcode.sequentiallyordinalrank;

import java.util.PriorityQueue;

class SORTracker {

    PriorityQueue<Location> heap;

    class Location{
        protected String name;
        protected int score;

        public Location(String name, int score){
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return "Location{" +
                    "name='" + name + '\'' +
                    ", score=" + score +
                    '}';
        }
    }

    public SORTracker() {
        heap = new PriorityQueue<>((a, b) -> {
            if (a.score != b.score) {
                return b.score - a.score;
            } else {
                return a.name.compareTo(b.name);
            }
        });
    }

    public void add(String name, int score) {
        heap.offer(new Location(name, score));
    }

    public String get() {
        return heap.peek().name;
    }
}

/**
 * Your SORTracker object will be instantiated and called as such:
 * SORTracker obj = new SORTracker();
 * obj.add(name,score);
 * String param_2 = obj.get();
 */