package top.pxyz.simple.s933;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ijiran
 */
public class RecentCounter {

    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
//        System.out.println(recentCounter.ping(1));
//        System.out.println(recentCounter.ping(100));
//        System.out.println(recentCounter.ping(3001));
//        System.out.println(recentCounter.ping(3002));
        //
        //[642],[1849],[4921],[5936],[5957]]
        System.out.println(recentCounter.ping1(642));
        System.out.println(recentCounter.ping1(1849));
        System.out.println(recentCounter.ping1(4921));
        System.out.println(recentCounter.ping1(5936));
        System.out.println(recentCounter.ping1(5957));
    }

    List<Integer> list;

    public RecentCounter() {
        list = new ArrayList<>();
    }

    public int ping1(int t) {
        list.add(t);
        int mint = t - 3000;
        int l = 0, r = list.size();
        while (l < r){
            int n = (r + l) / 2;
            Integer tb = list.get(n);
            if (tb >= mint) {
                r = n;
            }else{
                l = n + 1;
            }
        }
        return list.size() - l;
    }

    public int ping(int t) {
        list.add(t);
        int a = 0;
        int mint = t - 3000;
        for (Integer tb : list) {
            if (tb >= mint && tb <= t) {
                a += 1;
            }
        }
        return a;
    }

}
