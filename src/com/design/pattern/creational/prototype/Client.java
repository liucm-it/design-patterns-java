package design.pattern.creational.prototype;

import java.io.IOException;
import java.util.Date;

public class Client {
    public static void main(String[] args) {
        WeeklyLog prototypeWeekly = new WeeklyLog();
        WeeklyLog deepCloneWeekly = null;
        Attachment attachment = new Attachment();
        prototypeWeekly.setAttachment(attachment);
        prototypeWeekly.setDate(new Date());
        prototypeWeekly.setName("今日周报");

        WeeklyLog cloneWeekly = null;
        try {
            cloneWeekly = (WeeklyLog)prototypeWeekly.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        try {
            deepCloneWeekly = prototypeWeekly.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("周报是否相同？ " + (cloneWeekly == prototypeWeekly));
        System.out.println("附件是否相同？ " + (cloneWeekly.getAttachment() == prototypeWeekly.getAttachment()));
        System.out.println("日期是否相同？ " + (cloneWeekly.getDate() == prototypeWeekly.getDate()));
        System.out.println("名字是否相同？ " + (cloneWeekly.getName() == prototypeWeekly.getName()));

        System.out.println("周报是否相同？ " + (deepCloneWeekly == prototypeWeekly));
        System.out.println("附件是否相同？ " + (deepCloneWeekly.getAttachment() == prototypeWeekly.getAttachment()));
        System.out.println("日期是否相同？ " + (deepCloneWeekly.getDate() == prototypeWeekly.getDate()));
        System.out.println("名字是否相同？ " + (deepCloneWeekly.getName() == prototypeWeekly.getName()));
    }
}
