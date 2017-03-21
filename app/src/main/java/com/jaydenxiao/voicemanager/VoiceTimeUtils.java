package com.jaydenxiao.voicemanager;

import android.annotation.SuppressLint;
import android.text.TextUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class VoiceTimeUtils {
    /**
     * 指定的某个时间，以毫秒为单位
     */
    public long mOldTime = 0;

    /**
     * 当前时间，以毫秒为单位
     */
    public long mNowTime = 0;

    /**
     * 指定的某个时间和当前时间之间的时间间隔，以秒为单位
     */
    public long mDiffSecond = 0;

    /**
     * 时间间隔的天数
     */
    public long mSpanDay = 0;

    /**
     * 时间间隔的小时数
     */
    public long mSpanHour = 0;

    /**
     * 时间间隔的分钟数
     */
    public long mSpanMinute = 0;

    /**
     * 时间间隔的秒数
     */
    public long mSpanSecond = 0;

    /**
     * 时间间隔的天数，以多少天的文字形式输出
     */
    public String mSpanDayText = "";

    /**
     * 时间间隔的小时数，以多少小时的文字形式输出
     */
    public String mSpanHourText = "";

    /**
     * 时间间隔的分钟数，以多少分钟的文字形式输出
     */
    public String mSpanMinuteText = "";

    /**
     * 构造函数
     */
    private VoiceTimeUtils() {
    }

    /**
     * 某个时间段长度
     *
     * @param second 指定的某个时间段，以秒为单位
     */
    public static VoiceTimeUtils timeSpanSecond(long second) {
        VoiceTimeUtils ts = new VoiceTimeUtils();
        long remain;

        try {
            ts.mDiffSecond = second; // 秒

            // 过期天数
            ts.mSpanDay = ts.mDiffSecond / (24 * 3600);
            remain = ts.mDiffSecond % (24 * 3600);

            // 过期小时数
            if (remain > 0) {
                ts.mSpanHour = remain / 3600;
                remain = remain % 3600;
            }

            // 过期分钟数
            if (remain > 0) {
                ts.mSpanMinute = remain / 60;
            }

            // 过期秒数
            ts.mSpanSecond = remain % 60;

            if (ts.mSpanDay > 0) {
                ts.mSpanDayText = ts.mSpanDay + "天";
            }

            if (ts.mSpanHour > 0) {
                ts.mSpanHourText = ts.mSpanHour + "小时";
            }

            if (ts.mSpanMinute > 0) {
                ts.mSpanMinuteText = ts.mSpanMinute + "分钟";
            }
        } catch (Exception e) {
        }

        return ts;
    }

    /**
     * 指定某个时间到当前时间的时间段
     *
     * @param time 指定的某个时间，格式为yyyy-MM-dd HH:mm:ss
     */
    public static VoiceTimeUtils timeSpanToNow(String time) {
        VoiceTimeUtils ts = new VoiceTimeUtils();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        long remain;

        try {
            if (TextUtils.isEmpty(time))
                return ts;

            ts.mOldTime = sdf.parse(time).getTime();
            ts.mNowTime = System.currentTimeMillis();
            ts.mDiffSecond = Math.abs((ts.mNowTime - ts.mOldTime) / 1000); // 秒

            // 过期天数
            ts.mSpanDay = ts.mDiffSecond / (24 * 3600);
            remain = ts.mDiffSecond % (24 * 3600);

            // 过期小时数
            if (remain > 0) {
                ts.mSpanHour = remain / 3600;
                remain = remain % 3600;
            }

            // 过期分钟数
            if (remain > 0) {
                ts.mSpanMinute = remain / 60;
            }

            // 过期秒数
            ts.mSpanSecond = remain % 60;

            if (ts.mSpanDay > 0) {
                ts.mSpanDayText = ts.mSpanDay + "天";
            }

            if (ts.mSpanHour > 0) {
                ts.mSpanHourText = ts.mSpanHour + "小时";
            }

            if (ts.mSpanMinute > 0) {
                ts.mSpanMinuteText = ts.mSpanMinute + "分钟";
            }
        } catch (ParseException e1) {
        } catch (Exception e2) {
        }

        return ts;
    }

    /**
     * 将以毫秒为单位的时间转换成字符串格式的时间
     *
     * @param time 时间，以毫秒为单位
     */
    public static String getTimeStrFromMillis(long time) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        String result = sdf.format(new Date(time));
        return result;
    }

    /**
     * 当前时间格式
     */
    @SuppressLint("SimpleDateFormat")
    public static String getTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd-HHmmss");
        Date curDate = new Date(System.currentTimeMillis());
        String time = formatter.format(curDate);
        return time;
    }
}
