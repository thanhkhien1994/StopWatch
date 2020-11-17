public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] myArrays = {36509, 66642, 94149, 7009, 58043, 39980, 88707, 93753, 82550, 92608, 76978, 56076, 9157, 85546, 63717, 51370, 67081, 52342, 70529, 13922, 59269, 3793};
        System.out.println("Time in milliseconds: " + stopWatch.getElapsedTime());
        System.out.println("Mang dau vao");
        stopWatch.displayArray(myArrays);
        stopWatch.start();
        System.out.println("Star: " + stopWatch.getStartTime());
        stopWatch.selectionSort(myArrays);
        stopWatch.stop();
        System.out.println("Stop: " + stopWatch.getEndTime());
        System.out.println("Elapsed Time: " + stopWatch.getElapsedTime());
        System.out.println("Mang sau khi sap xep");
        stopWatch.displayArray(myArrays);
    }
}
