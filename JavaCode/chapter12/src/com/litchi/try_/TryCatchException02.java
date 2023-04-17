package com.litchi.try_;

/**
 * @author 林志贤
 * @version 1.0
 */
public class TryCatchException02 {
    public static void main(String[] args) {
        System.out.println(method());
    }

    public static int method() {
        int i = 1;
        try {
            ++i;
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
            return ++i;
        } finally {
            return ++i;
        }

    }
}
