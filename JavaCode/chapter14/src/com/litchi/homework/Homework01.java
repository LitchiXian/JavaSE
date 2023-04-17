package com.litchi.homework;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 林志贤
 * @version 1.0
 */
@SuppressWarnings("all")
public class Homework01 {
    public static void main(String[] args) {
        News news1 = new News("新冠确诊病例超千万，数百万印度教信徒赴恒河“圣浴”引民众担忧");
        News news2 = new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生");

        ArrayList list = new ArrayList();
        list.add(news1);
        list.add(news2);

//        Collections.reverse(list);
//        for (Object o : list) {
//            News news = (News) o;
//            if (news.getTitle().length() > 15) {
//                String title = news.getTitle();
//                String substring = title.substring(0, 15);
//                substring += "...";
//                news.setTitle(substring);
//            }
//            System.out.println(news);
//        }

        for (int i = list.size() - 1; i >= 0; i--) {
//            System.out.println(list.get(i));
            News news = (News) list.get(i);
            System.out.println(processTitle(news.getTitle()));

        }
    }

    //专门写一个方法，处理新闻标题
    public static String processTitle(String title) {
        if (title == null)
            return "";
        if (title.length() > 15) {
            return title.substring(0, 15) + "...";
        } else return title;
    }
}

class News {
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "title=" + title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}