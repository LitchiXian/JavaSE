package com.litchi.interface_;

public class InterfacePolyArr {
    public static void main(String[] args) {
        Usb_[] arr = new Usb_[2];
        arr[0] = new Phone_();
        arr[1] = new Camera_();

        for (Usb_ usb : arr) {
            if (usb instanceof Phone_){
                Phone_ p = (Phone_) usb;
                p.call();
            }
            usb.work();
        }
    }
}

interface Usb_ {
    void work();
}

class Phone_ implements Usb_ {
    public void call() {
        System.out.println("手机可以打电话....");
    }

    @Override
    public void work() {
        System.out.println("手机工作啦");
    }
}

class Camera_ implements Usb_ {
    @Override
    public void work() {
        System.out.println("相机工作啦....");
    }
}
