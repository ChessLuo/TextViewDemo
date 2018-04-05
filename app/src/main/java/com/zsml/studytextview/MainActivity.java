package com.zsml.studytextview;

import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.text.util.Linkify;
import android.widget.TextView;

/**
 *
 * @描述 总结Textview
 * @author luoweichao
 * @wechat 1329869063
 * @date 2017/12/2/002 19:11
 *
 */
public class MainActivity extends AppCompatActivity {

    private TextView mTvCenterLine;
    private TextView mTvBottomLine;
    private TextView mTvCancelLine;
    private TextView mTvClearLine;
    private TextView mTvAntiAliasing;
    private TextView mTvTwoStyle;
    private TextView mBold1;
    private TextView mTvSelectable;
    private TextView mTvSelectAllOnFocus;
    private TextView mTvColorhighlight;
    private TextView mTvLink;
    private TextView mTvMarquee;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initSetting();
    }

    private void initView() {
        mTvCenterLine = (TextView) findViewById(R.id.tv_center_line);
        mTvBottomLine = (TextView) findViewById(R.id.tv_bottom_line);
        mTvCancelLine = (TextView) findViewById(R.id.tv_cancel_line);
        mTvClearLine = (TextView) findViewById(R.id.tv_clear_line);
        mTvAntiAliasing = (TextView) findViewById(R.id.tv_anti_aliasing);
        mTvTwoStyle = (TextView) findViewById(R.id.tv_two_style);
        mBold1 = (TextView) findViewById(R.id.bold1);
        mTvSelectable = (TextView) findViewById(R.id.tv_selectable);
        mTvSelectAllOnFocus = (TextView) findViewById(R.id.tv_selectAllOnFocus);
        mTvColorhighlight = (TextView) findViewById(R.id.tv_colorhighlight);
        mTvLink = (TextView) findViewById(R.id.tv_link);
        mTvMarquee = (TextView) findViewById(R.id.tv_marquee);

    }

    private void initSetting() {
        /**中划线*/
        mTvCenterLine.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        /**下划线*/
        mTvBottomLine.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        /**取消划线*/
        mTvCancelLine.getPaint().setFlags(0);
        /**下划线加清晰*/
        mTvClearLine.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG | Paint.ANTI_ALIAS_FLAG);
        /**抗锯齿*/
        mTvAntiAliasing.getPaint().setAntiAlias(true);
        /**一段文本，多种样式*/
        String txt = "我是一个Textview显示的一段文本，要显示多种样式";
        Spannable textSpan = new SpannableStringBuilder(txt);
        //textSpan.setSpan(TextAppearanceSpan样式，开始位置，结束位置，Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        textSpan.setSpan(new TextAppearanceSpan(this,R.style.textStyle1)
                , 0, 4, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        textSpan.setSpan(new TextAppearanceSpan(this,R.style.textStyle2)
                , 4, 12, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        textSpan.setSpan(new TextAppearanceSpan(this,R.style.textStyle3)
                , 12, 20, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        textSpan.setSpan(new TextAppearanceSpan(this,R.style.textStyle4)
                , 20, txt.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        mTvTwoStyle.setText(textSpan);
        /**在代码中设置中文加粗*/
        mBold1.getPaint().setFakeBoldText(true);
        /**设置文本是否可被选中*/
        mTvSelectable.setTextIsSelectable(true);//xml中 android:textIsSelectable="true"
        /**设置TextView在获取焦点后是否选中全部内容*/
        mTvSelectAllOnFocus.setSelectAllOnFocus(true);//xml中 android:selectAllOnFocus="true"
        /**设置文本被选中内容的高亮背景色*/
        mTvColorhighlight.setHighlightColor(getResources().getColor(R.color.Green));//xml中 android:textColorHighlight="@color/Green"
        /**
         * TextView链接相关
         * android:autoLink属性的介绍：
         None：默认的，不匹配任何连接。
         web：网址。
         email：邮箱。
         phone：电话号码。
         map：匹配映射网址。
         all：匹配所有连接。
         * */
        //自动识别对应的连接，点击出发对应的Android程序
        mTvLink.setAutoLinkMask(Linkify.ALL);//xml中 android:autoLink="all"
        String string = "My-web：http://blog.csdn.net/qq_29269233\n\n"
                +"My-email:zsml2016@163.com\n\n"
                +"My-phone:+86 0755-888888";
        mTvLink.setText(string);


        /**18设置textview跑马灯*/
        setTextMarquee();
    }

    private void setTextMarquee() {
        /**
         android:ellipsize="marquee"
         android:focusable="true"
         android:focusableInTouchMode="true"
         android:clickable="true"
         android:marqueeRepeatLimit="marquee_forever"
         android:singleLine="true"
         */
//        mTvMarquee.setEllipsize(TextUtils.TruncateAt.MARQUEE);
//        mTvMarquee.setFocusable(true);
//        mTvMarquee.setFocusableInTouchMode(true);

    }


}
