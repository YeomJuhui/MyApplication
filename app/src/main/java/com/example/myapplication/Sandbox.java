package com.example.myapplication;

import android.graphics.drawable.shapes.RectShape;

import java.util.ArrayList;
import java.util.List;

public class Sandbox extends RectShape {

    private List<String> mGreetings = new ArrayList<>();

    public Sandbox () {

    }

    public List<String> getmGreetings() {
        return mGreetings;
    }

    public void setmGreetings(List<String> mGreetings) {
        this.mGreetings = mGreetings;
    }

    //오버로딩: 같은 이름의 여러 함수를 선언, argument의 수, type 등에서 차이가 있다. 즉, 이름만 같게 선언
    //오버라이딩: superclass의 member를 무시(이름+argument 수, type 등 일치)

    @Override
    public String toString() {
        return "Sandbox{" +
                "mGreetings=" + mGreetings +
                '}';
    }
}
