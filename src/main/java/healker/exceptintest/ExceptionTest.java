package healker.exceptintest;

public class ExceptionTest {


    /**
     * 在catch中 throw 抛出异常
     * @return
     */
    String throwExceptionTest() {
        String res = "";
        try {
            res = "------------>>> try";
            System.out.println("1. " + res);
            //数组越界异常
            int[] arr = new int[3];
            for (int i = 0; i < 4; i++) {
                arr[i] = i;
            }

        } catch (Exception e) {
            res = "------------>>> catch";
            System.out.println("2. " + res);
            throw new CustomizeException(e);
        }

        System.out.println("3. ------------>>> try catch 方法结束" + res);
        return res;
    }

    /**
     * 在catch中捕获异常不抛出，并在catch中return结果
     * @return
     */
    String catchAndReturnExceptionTest() {
        String res = "";
        try {
            res = "------------>>> try";
            System.out.println("1. " + res);
            //数组越界异常
            int[] arr = new int[3];
            for (int i = 0; i < 4; i++) {
                arr[i] = i;
            }

        } catch (Exception e) {
            res = "------------>>> catch , 处理异常, 不抛出, 返回结果";
            System.out.println("2. " + res);
            return res;
        }

        System.out.println("3. ------------>>> try catch 方法结束" + res);
        return res;
    }

    /**
     * 在catch中捕获异常不抛出，不在catch中return结果
     * @return
     */
    String catchExceptionTest() {
        String res = "";
        try {
            res = "------------>>> try";
            System.out.println("1. " + res);
            //数组越界异常
            int[] arr = new int[3];
            for (int i = 0; i < 4; i++) {
                arr[i] = i;
            }
        } catch (Exception e) {
            res = "------------>>> catch , 处理异常, 不抛出, catch中无return";
            System.out.println("2. " + res);
        }
        System.out.println("3. ------------>>> try{}catch(Exception e){} 方法结束" + res);
        return res;
    }
}
