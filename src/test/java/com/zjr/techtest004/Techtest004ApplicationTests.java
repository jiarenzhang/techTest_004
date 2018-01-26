package com.zjr.techtest004;

import com.zjr.techtest004.util.time.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Techtest004ApplicationTests {

    @Test
    public void test01() {
        //获取某年某个月份有几天
        int monthLength = DateUtil.getMonthLength(2018, 1);
        System.out.println(monthLength);
    }

    @Test
    public void test02() {
        int monthLength = DateUtil.getMonthLength(2018, new Date().getMonth() + 1);
        System.out.println(monthLength);
    }

    @Test
    public void test03() {
        //获取当前真实的月份(需要加上1)
        System.out.println(new Date().getMonth() + 1);
    }

    @Test
    public void test04() {
        Calendar calendar = Calendar.getInstance();
        //获取当前真实的月份(需要加上1),可以用来代替上述过时的方法
        int month = calendar.get(Calendar.MONTH) + 1;
        System.out.println(month);
    }

    @Test
    public void test05() {
        //获取当前真实的年份(需要加上1900)
        System.out.println(new Date().getYear() + 1900);
    }

    @Test
    public void test06() {
        //获取当前真实的年份,替代上面过时的方法
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
    }

    @Test
    public void test07() {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        //在1月份，如果不设置为1，则月份默认是0
        date.setMonth(1);
        int monthLength = DateUtil.getMonthLength(date);
        System.out.println(monthLength);
    }

    @Test
    public void test08() {
        Date date = new Date();
        //在1月份，如果不设置为1，则月份默认是0
        date.setMonth(1);
        int monthLength = DateUtil.getMonthLength(date);
        System.out.println(monthLength);
    }
    @Test
    public void test09(){
        //是否闰年，true是，false不是
        boolean leapYear = DateUtil.isLeapYear(2018);
        System.out.println(leapYear);
    }
    @Test
    public void test10(){
        Date date = new Date();
        date.setYear(2008);
        //2008年是闰年
        boolean leapYear = DateUtil.isLeapYear(date);
        System.out.println(leapYear);
    }
    @Test
    public void test11(){
        Date date = new Date();
        //获取当前日期是一星期的第几天
        int dayOfWeek = DateUtil.getDayOfWeek(date);
        System.out.println(dayOfWeek);
    }
    @Test
    public void test12(){
        //加一天
        Date date = DateUtil.addDays(new Date(), 1);
        System.out.println(date.toLocaleString());
    }
    @Test
    public void test13(){
        //加两天
        Date date = DateUtil.addDays(new Date(), 2);
        System.out.println(date.toLocaleString());
    }
    @Test
    public void test14(){
        //获取一天的开始时间，即0时0分0秒
        Date date = DateUtil.beginOfDate(new Date());
        System.out.println(date.toLocaleString());
    }
    @Test
    public void test15(){
        Date date = new Date();
        date.setDate(20);
        //获取20号的开始时间，即0时0分0秒
        date = DateUtil.beginOfDate(date);
        System.out.println(date.toLocaleString());
    }
}
