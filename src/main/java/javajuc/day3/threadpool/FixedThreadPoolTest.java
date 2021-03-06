package javajuc.day3.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author:Hardy
 * @QQ:2937270766
 * @官网：http://www.yuandengta.com
 */
public class FixedThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        ExecutorService singleThreadPool = Executors.newCachedThreadPool();
        for(int i = 0;i < 10;i++){
            final int index = i;
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try{
                        System.out.println(index);
                        Thread.sleep(2000);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
