package healker.exceptintest;


import org.junit.Test;


public class ExecutionSequenceTest {


     private ExceptionTest et = new ExceptionTest();

    @Test
    public void throwExceptionTest() {
        try {
            String s = et.throwExceptionTest();
            System.out.println("throwExceptionTest Res : ---->> " + s);
        } catch (Exception e) {
            System.out.println("throwExceptionTest Exception : ---->> " + e);
        }
    }

    @Test
    public void catchExceptionTest() {
        try {
            String s = et.catchExceptionTest();
            System.out.println("catchExceptionTest Res : ---->> " + s);
        } catch (Exception e) {
            System.out.println("catchExceptionTest Res : ---->> " + e);
        }
    }

    @Test
    public void catchAndReturnExceptionTest() {
        try {
            String s = et.catchAndReturnExceptionTest();
            System.out.println("catchAndReturnExceptionTest Res : ---->> " + s);
        } catch (Exception e) {
            System.out.println("catchAndReturnExceptionTest Res : ---->> " + e);
        }
    }


}