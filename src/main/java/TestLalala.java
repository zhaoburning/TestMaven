/**
 * Created by lianxiang on 2017/5/7
 */

import org.junit.Before;
import org.junit.Test;

import java.util.Queue;
import java.util.concurrent.*;

public class TestLalala {
    //public static void main(String[] args) {
    //    BlockingQueue<String> queue = new LinkedBlockingQueue<String>();
    //    //ConcurrentLinkedQueue
    //}
    @Test
    public void dd() {
        byte[] bytes = new byte[1024 * 1024 * 62];
        System.out.println("ok");
    }

    @Test
    public void zz() throws Exception {
        int a = 1;
        int b = 2;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a" + a + ",b" + b);
    }

    @Before
    public void setUp() throws Exception {


    }
}
