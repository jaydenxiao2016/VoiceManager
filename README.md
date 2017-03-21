VoiceManager
============
1.实现了录音，播放；<br/>
2.暂停录音开始录音，合并为同一个；<br/>
3.显示录音时间，录了多少秒，时分秒；<br/>
4.代码总布局已经写好，可以自己修改；<br/>

用法：  
        
      VoiceManage mVoiceManage = new VoiceManage(mActivity, path);//初始化  

      mVoiceManage.sessionRecord(true);// 开始录音  
      
      mVoiceManage.sessionPlay(true, mFilePath);// 播放录音  
      

第一个参数为： Activity上下文，<br/>
第二个参数为：保存录音文件的路径，一般都是包名+自定义文件名<br/>

<img src="https://raw.githubusercontent.com/youmu178/VoiceManager/master/layout-2015-06-16-164124.png" width=480 />

<img src="https://raw.githubusercontent.com/youmu178/VoiceManager/master/layout-2015-06-16-164223.png" width=480 />

License
=======

    The MIT License (MIT)

	Copyright (c) 2015 youzehong

	Permission is hereby granted, free of charge, to any person obtaining a copy
	of this software and associated documentation files (the "Software"), to deal
	in the Software without restriction, including without limitation the rights
	to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
	copies of the Software, and to permit persons to whom the Software is
	furnished to do so, subject to the following conditions:

	The above copyright notice and this permission notice shall be included in all
	copies or substantial portions of the Software.

	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
	IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
	AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
	OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
	SOFTWARE.
