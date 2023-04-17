package com.litchi.try_;

/**
 * @author 林志贤
 * @version 1.0
 */
public class TryCatchException01 {
    public static void main(String[] args) {
        System.out.println(method());//final不管怎么样都会执行，所以返回 4
    }

    public static int method() {
        try {
            String[] name = new String[3];
            if (name[1].equals("tom")) {
                System.out.println(name[1]);
            } else {
                name[3] = "jack";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return 3;
        } finally {
            return 4;
        }

    }
}
