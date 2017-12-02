# 前言：

转眼间来到12月份了，又差不多过去一年了！时光匆匆，我依然埋头苦干着，失去了很多和朋友互动的时间，哎，心想还是等有钱了再多聚聚吧！现在开始从零学习Android吧，虽然技术迭代很快，但能从中找到快乐的话，即使累点也是值得的。Android项目开发中估计少不了TextView，今天就总结一些常用的方法，方便查找、复习...

# 一、相关属性设置：

1.TextView设置中划线：
   textview.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);

2.TextView设置下划线：
   textview.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);

3.TextView设置取消划线：
   textview.getPaint().setFlags(0);

上面介绍的三种TextView加划线的方法是很常用的，但如果像上面那样设置的话 文本会出现不清晰，看起来就不正常了，你们可以试试看；这时就要用到加清晰设置
textview.getPaint().setFlags(Paint.ANTI_ALIAS_FLAG); 

4.和设置划线的方法一起使用：如
下划线加清晰：
textview.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG | Paint.ANTI_ALIAS_FLAG);

5.抗锯齿
textview.getPaint().setAntiAlias(true);

6.在代码中设置中文加粗
textview.getPaint().setFakeBoldText(true);

7.设置文本可被选中
textview.setTextIsSelectable(true);//xml中 android:textIsSelectable="true"

8.设置TextView在获取焦点后选中全部内容
textview.setSelectAllOnFocus(true);//xml中 android:selectAllOnFocus="true"

9.设置文本被选中内容的高亮背景色
textview.setHighlightColor(getResources().getColor(R.color.Green));
//xml中 android:textColorHighlight="@color/Green"

10.TextView链接相关（如网址、拨打电话等，设置后，点击会打开系统默认程序）

android:autoLink有6个属性值分别为：None、web、email、phone、map、all。

None：默认的，不匹配任何连接。
web：网址。
email：邮箱。
phone：电话号码。
map：匹配映射网址。
all：匹配所有连接。



# 二、效果图如下：
![image](C:\Users\Administrator\Desktop\textview.gif)