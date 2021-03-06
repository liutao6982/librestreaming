package me.lake.librestreaming.core;

/**
 * Created by lake on 16-4-5.
 */
@SuppressWarnings("all")
public class ColorHelper {

    static public native void NV21TOYUV420SP(byte[] src, byte[] dst, int YSize);

    static public native void NV21TOYUV420P(byte[] src, byte[] dst, int YSize);

    static public native void YUV420SPTOYUV420P(byte[] src, byte[] dst, int YSize);

    static public native void NV21TOARGB(byte[] src, int[] dst, int width,int height);

    //slow
    static public native void NV21Transform(byte[] src, byte[] dst, int srcwidth,int srcheight,int directionFlag);
}
