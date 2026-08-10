package project12;

import java.util.Objects;

public class Runner implements Comparable<Runner>{
    private double maxSpeed;
    private double time;

    public Runner(double maxSpeed, double time) {
        this.maxSpeed = maxSpeed;
        this.time = time;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Runner{" +
                "maxSpeed=" + maxSpeed +
                ", time=" + time +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Runner runner = (Runner) o;
        return Double.compare(maxSpeed, runner.maxSpeed) == 0 && Double.compare(time, runner.time) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSpeed, time);
    }

    //    @Override
//    public int compareTo(Runner o) {
//        return (int)(o.getMaxSpeed()-this.getMaxSpeed());
//    }

    @Override
    public int compareTo(Runner o) {
        return (int)(o.getTime()-this.getTime());
    }
}
