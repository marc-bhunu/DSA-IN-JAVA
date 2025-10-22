package leetcode.findmedianinstream;

import java.util.ArrayList;
import java.util.Collections;

class MedianFinder {
    ArrayList<Integer>  stream = new ArrayList<Integer>();

    public MedianFinder() {

    }

    public void addNum(int num) {
        stream.add(num);
    }

    public double findMedian() {
        Collections.sort(stream);
        int n = stream.size();
        if(n % 2 == 1){
            return stream.get(n/2);
        }else {
            return (stream.get( (n / 2) - 1) + stream.get(n / 2)) / 2.0;
        }
    }
}
