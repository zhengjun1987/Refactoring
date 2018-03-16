package utils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/14 14:20
 */
public class ExecutionDurationTimer {
    public long execute(int times, utils.ExecutionTimerInterface pTimerInterface){
        long start = System.nanoTime();
        for (int i = 0; i < times; i++) {
            pTimerInterface.execute();
        }
        long end = System.nanoTime();
        return end - start;
    }
}

