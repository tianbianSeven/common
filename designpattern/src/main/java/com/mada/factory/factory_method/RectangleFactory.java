package com.mada.factory.factory_method;

/**
 * Created by madali on 2018/5/2.
 */
public class RectangleFactory implements ShapeFactory {

    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}