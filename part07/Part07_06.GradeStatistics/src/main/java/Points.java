import java.util.ArrayList;

public class Points {
    public ArrayList<Integer> pointList;
    public int sumAll;
    public int sumPass;
    public int passCount;
//    public  int participants;

    public Points() {
        this.pointList = new ArrayList<>();
        this.sumAll = 0;
        this.sumPass = 0;
        this.passCount = 0;
//        this.participants=0;
    }

    public void add(int point) {
        this.pointList.add(point);
        this.sumAll = this.sumAll + point;
        if (point >= 50) {
            this.sumPass = this.sumPass + point;
            this.passCount++;
        }
//        this.participants++;
    }

    public void getAverageAll() {
        System.out.println("Point average (all): " + (this.sumAll * 1.0) / this.pointList.size());
    }

    public void getAveragePass() {
        if (this.sumPass != 0) {
            System.out.println("Point average (passing): " + (this.sumPass * 1.0) / this.passCount);

        } else {
            System.out.println("Point average (passing): -");
        }
    }

    public void getPassPercentage() {
        System.out.println("Pass percentage: " + (100.0 * this.passCount / this.pointList.size()));
    }

    public ArrayList<Integer> getPointList() {
        return pointList;
    }

    public void setPointList(ArrayList<Integer> pointList) {
        this.pointList = pointList;
    }
}
