package com.fx2.shaderdemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by chenshuo on 2018/4/18.
 */

public class RadialGradientView extends View {

    private Paint paint;

   int []  colors =  new int[]{Color.RED,Color.GREEN,Color.BLUE,Color.YELLOW};
    private Bitmap mBitMap;



    private int mHeight;
    private int mWidth;

    /**
     * TileMode.CLAMP 拉伸最后一个像素去铺满剩下的地方
     * TileMode.MIRROR 通过镜像翻转铺满剩下的地方。
     * TileMode.REPEAT 重复图片平铺整个画面（电脑设置壁纸）
     */

    public RadialGradientView(Context context) {
        this(context,null);
        paint = new Paint();

        mBitMap = ((BitmapDrawable) getResources().getDrawable(R.drawable.xyjy2)).getBitmap();

        mHeight = mBitMap.getHeight();
        mWidth = mBitMap.getWidth();

    }

    public RadialGradientView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public RadialGradientView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);

       /* RadialGradient radialGradient  = new RadialGradient(300,300,50,new int[]{Color.RED,Color.GREEN,Color.BLUE,Color.YELLOW}, null, Shader.TileMode.REPEAT);
        paint.setShader(radialGradient);
        canvas.drawCircle(50,50,200,paint);*/

     /*   LinearGradient linearGradient = new LinearGradient(0,0,50,50,colors,null, Shader.TileMode.MIRROR);
        paint.setShader(linearGradient);
        canvas.drawRect(0,0,800,800,paint);*/


     /*   SweepGradient sweepGradient = new SweepGradient(300,300,colors,null);
        paint.setShader(sweepGradient);
        canvas.drawCircle(300,300,500,paint);*/


      /*  BitmapShader bitMapShader = new BitmapShader(mBitMap, Shader.TileMode.MIRROR,
                Shader.TileMode.MIRROR);

        LinearGradient linearGradient = new LinearGradient(0,0,300,300,colors,null, Shader.TileMode.MIRROR);

         ComposeShader mComposeShader = new ComposeShader(linearGradient, bitMapShader, PorterDuff.Mode.SRC_OVER);
        paint.setShader(mComposeShader);
        canvas.drawRect(0, 0, 500, 500, paint);*/




/*
         BitmapShader bitMapShader = new BitmapShader(mBitMap, Shader.TileMode.MIRROR,
                Shader.TileMode.MIRROR);
        paint.setShader(bitMapShader);
        paint.setAntiAlias(true);
        //设置像素矩阵，来调整大小，为了解决宽高不一致的问题。
        float scale = Math.max(mWidth,mHeight) / Math.min(mWidth,mHeight);

        Matrix matrix = new Matrix();
        matrix.setScale(scale,scale);
        bitMapShader.setLocalMatrix(matrix);


        // 画圆形图片
        canvas.drawCircle(600,600, mHeight / 2 ,paint);*/

        // 画椭圆形装
     //  canvas.drawOval(new RectF(0 , 0, mWidth, mHeight),paint);
//       画矩形
     //   canvas.drawRect(new Rect(0,0 , 1000, 1600),paint);

        //通过shapeDrawable也可以实现
      /*  ShapeDrawable shapeDrawble = new ShapeDrawable(new OvalShape());
        shapeDrawble.getPaint().setShader(bitMapShader);
        shapeDrawble.setBounds(0,0,mWidth,mWidth);
        shapeDrawble.draw(canvas);*/



       /* //  矩形的渐变效果

        BitmapShader bitmapShader = new BitmapShader(mBitMap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        //创建LinearGradient，用以产生从左上角到右下角的颜色渐变效果
        LinearGradient linearGradient = new LinearGradient(0, 0, mWidth, mHeight, Color.GREEN, Color.BLUE, Shader.TileMode.CLAMP);
        //bitmapShader对应目标像素，linearGradient对应源像素，像素颜色混合采用MULTIPLY模式
        ComposeShader composeShader = new ComposeShader(bitmapShader, linearGradient, PorterDuff.Mode.MULTIPLY);
        //将组合的composeShader作为画笔paint绘图所使用的shader
        paint.setShader(composeShader);
        //用composeShader绘制矩形区域
        canvas.drawRect(0, 0, mWidth, mHeight, paint);*/


    }
}
