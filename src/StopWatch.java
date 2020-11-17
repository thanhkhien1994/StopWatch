import java.util.Calendar;
import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;
    private final Calendar calendar;

    public StopWatch() {
        calendar = Calendar.getInstance();
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = calendar.getTime();
    }

    public void stop() {
        this.endTime = calendar.getTime();
    }

    public long getElapsedTime() {
        return calendar.getTimeInMillis();
    }

    public void selectionSort(int[] arr) {
        int indexMin, i, j;

        // lap qua tat ca cac phan tu
        for (i = 0; i < arr.length-1; i++) {
            // goi phan tu dau tien la min
            indexMin = i;

            for (j = (i + 1); j < arr.length; j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
            }

            if (indexMin != i) {
                int temp = arr[indexMin];
                arr[indexMin] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public void displayArray(int[] arr) {
        System.out.print("[");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println("]");
    }
}
