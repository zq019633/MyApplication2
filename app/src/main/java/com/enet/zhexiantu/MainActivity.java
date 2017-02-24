package com.enet.zhexiantu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.app.Activity;


import com.enet.zhexiantu.newChat.ChartData;
import com.enet.zhexiantu.newChat.FancyChart;

public class MainActivity extends Activity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            FancyChart chart = (FancyChart) findViewById(R.id.chart);

            // First data set
            ChartData data = new ChartData(ChartData.LINE_COLOR_BLUE);
            //int[] yValues = new int[]{100, 200, 90, 120, 123,200, 90, 120,200, 90, 120,200, 90};

            int[] yValues = new int[]{0, 8, 9, 18, 35, 30, 33, 32, 46, 53, 50, 42};
            for(int i = 1; i <= 12; i++) {
                data.addPoint(i, yValues[i-1]);
                data.addPoint(i);
                data.addXValue(i, i + "月");

            }
            chart.addData(data);

            // Second data set
            ChartData data2 = new ChartData(ChartData.LINE_COLOR_RED);
            int[] yValues2 = new int[]{0, 5, 9, 23, 15, 35, 45, 50, 41, 45, 32, 24};
            for(int i = 1; i <= 12; i++) {
                data.addPoint(i, yValues[i-1]);
                data.addPoint(i);
                data.addXValue(i, i + "月");
            }
            chart.addData(data2);

        }

//            LineChart lineChart = (LineChart) findViewById(R.id.lineChart);
//
//            CharInfo charInfo = new CharInfo();
//            charInfo.setTitle("最近24小时空气质量指数");
//            charInfo.setxScaleNum(6);
//            charInfo.setyScaleNum(6);
//            String[] yScaleLeftLable = new String[6];
//            yScaleLeftLable[0] = "50";
//            yScaleLeftLable[1] = "100";
//            yScaleLeftLable[2] = "150";
//            yScaleLeftLable[3] = "200";
//            yScaleLeftLable[4] = "300";
//            yScaleLeftLable[5] = "500";
//            charInfo.setyScaleLeftLable(yScaleLeftLable);
//            String[] yScaleRightLable = new String[6];
//            yScaleRightLable[0] = "优";
//            yScaleRightLable[1] = "良";
//            yScaleRightLable[2] = "轻度污染";
//            yScaleRightLable[3] = "中度污染";
//            yScaleRightLable[4] = "重度污染";
//            yScaleRightLable[5] = "严重污染";
//            charInfo.setyScaleRightLable(yScaleRightLable);
//            String[] xScaleDownLable = new String[7];
//            xScaleDownLable[0] = "21:00";
//            xScaleDownLable[1] = "01:00";
//            xScaleDownLable[2] = "05:00";
//            xScaleDownLable[3] = "09:00";
//            xScaleDownLable[4] = "13:00";
//            xScaleDownLable[5] = "17:00";
//            xScaleDownLable[6] = "21:00";
//            charInfo.setxScaleDownLable(xScaleDownLable);
//
//            lineChart.setCharInfo(charInfo);
//
//            List<LineInfo> lineInfos = new ArrayList<LineInfo>();
//
//            LineInfo lineInfo1 = new LineInfo();
//            lineInfo1.setPointColor(0xFFE5B814);
//            lineInfo1.setLineColor(0xFFC8A724);
//            lineInfo1.setName("美国领事馆");
//            lineInfo1.setPoints(new int[]{570,450,350,250,130,
//                    170,190});
//            lineInfos.add(lineInfo1);
//
//            LineInfo lineInfo2 = new LineInfo();
//            lineInfo2.setPointColor(0xFF06D606);
//            lineInfo2.setLineColor(0xFF99CC00);
//            lineInfo2.setName("静安监测站");
//            lineInfo2.setPoints(new int[]{170,150,250,300,170,
//                    120,130});
//            lineInfos.add(lineInfo2);
//
//            lineChart.setLineInfos(lineInfos);
//
//
//
//        }




//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        LineChart lineChart = (LineChart) findViewById(R.id.lineChart);
//
//        CharInfo charInfo = new CharInfo();
//        charInfo.setTitle("最近24小时空气质量指数");
//        charInfo.setxScaleNum(4);
//        charInfo.setyScaleNum(4);
//        String[] yScaleLeftLable = new String[4];
//        yScaleLeftLable[0] = "100";
//        yScaleLeftLable[1] = "200";
//        yScaleLeftLable[2] = "300";
//        yScaleLeftLable[3] = "400";
//
//        charInfo.setyScaleLeftLable(yScaleLeftLable);
//        String[] yScaleRightLable = new String[6];
//        yScaleRightLable[0] = "";
//        yScaleRightLable[1] = "";
//        yScaleRightLable[2] = "";
//        yScaleRightLable[3] = "";
//        yScaleRightLable[4] = "";
//        yScaleRightLable[5] = "";
//        charInfo.setyScaleRightLable(yScaleRightLable);
////        String[] xScaleDownLable = new String[12];
////        xScaleDownLable[0] = "1月";
////        xScaleDownLable[1] = "2月";
////        xScaleDownLable[2] = "3月";
////        xScaleDownLable[3] = "4月";
////        xScaleDownLable[4] = "5月";
////        xScaleDownLable[5] = "6月";
////        xScaleDownLable[6] = "7月";
////        xScaleDownLable[7] = "8月";
////        xScaleDownLable[8] = "9月";
////        xScaleDownLable[9] = "10月";
////        xScaleDownLable[10] = "11月";
////        xScaleDownLable[11] = "12月";
////        charInfo.setxScaleDownLable(xScaleDownLable);
//
//        String[] xScaleDownLable = new String[7];
//        xScaleDownLable[0] = "21:00";
//        xScaleDownLable[1] = "01:00";
//        xScaleDownLable[2] = "05:00";
//        xScaleDownLable[3] = "09:00";
//        xScaleDownLable[4] = "13:00";
//        xScaleDownLable[5] = "17:00";
//        xScaleDownLable[6] = "21:00";
//        charInfo.setxScaleDownLable(xScaleDownLable);
//
//        lineChart.setCharInfo(charInfo);
//
//        List<LineInfo> lineInfos = new ArrayList<LineInfo>();
//
//        LineInfo lineInfo1 = new LineInfo();
//        lineInfo1.setPointColor(0xFFE5B814);
//        lineInfo1.setLineColor(0xFFC8A724);
//        lineInfo1.setName("2016年");
//        lineInfo1.setPoints(new int[]{200,180,220,311,400,221,110,180,310,290,180,350});
//        lineInfos.add(lineInfo1);
//
//        LineInfo lineInfo2 = new LineInfo();
//        lineInfo2.setPointColor(0xFF06D606);
//        lineInfo2.setLineColor(0xFF99CC00);
//        lineInfo2.setName("2017年");
//        lineInfo2.setPoints(new int[]{170,270,300,210,190,200,180,220,311,400,221,400});
//        lineInfos.add(lineInfo2);
//
//        lineChart.setLineInfos(lineInfos);
//
//
//
//    }


}