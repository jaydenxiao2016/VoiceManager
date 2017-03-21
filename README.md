VoiceManager
============
1.实现录音功能，提供暂停、继续切换，并且监听音量大小以波浪线呈现出现

2.实现播放功能，播放实现帧动画

用法：  

      1.录音  
      
      VoiceManage mVoiceManage  =VoiceManager.getInstance(mContext);
      
      mVoiceManage.pauseOrStartVoiceRecord();//暂停或继续
     
      mVoiceManage.stopVoiceRecord();//完成录音
      
      mVoiceManage.setVoiceRecordListener(new VoiceManager.VoiceRecordCallBack() {
            @Override
            public void recDoing(long time, String strTime) {
                mRecordHintTv.setText(strTime);
            }

            @Override
            public void recVoiceGrade(int grade) {
                voicLine.setVolume(grade);
            }

            @Override
            public void recStart(boolean init) {
                mIvPauseContinue.setImageResource(R.drawable.icon_pause);
                voicLine.setContinue();
            }

            @Override
            public void recPause(String str) {
                mIvPauseContinue.setImageResource(R.drawable.icon_continue);
                voicLine.setPause();
            }


            @Override
            public void recFinish(long length, String strLength, String path) {
                if (enRecordVoiceListener != null) {
                    enRecordVoiceListener.onFinishRecord(length, strLength, path);
                }
            }
        });
	
	2.播放
	VoiceManage mVoiceManage  =VoiceManager.getInstance(mContext);
	mVoiceManage.setVoicePlayListener(new VoiceManager.VoicePlayCallBack() {
                        @Override
                        public void voiceTotalLength(long time, String strTime) {

                        }

                        @Override
                        public void playDoing(long time, String strTime) {


                        }

                        @Override
                        public void playPause() {

                        }

                        @Override
                        public void playStart() {

                        }

                        @Override
                        public void playFinish() {
                            if (voiceAnimation != null) {
                                voiceAnimation.stop();
                                voiceAnimation.selectDrawable(0);
                            }
                        }
                    });
        mVoiceManage.startPlay(voice.getFilePath());
      
<img src="https://github.com/jaydenxiao2016/VoiceManager/blob/master/art/Screenshot_2017-03-21-17-28-01.png" width=480 />


<img src="https://github.com/jaydenxiao2016/VoiceManager/blob/master/art/Screenshot_2017-03-21-17-28-05.png" width=480 />


<img src="https://github.com/jaydenxiao2016/VoiceManager/blob/master/art/Screenshot_2017-03-21-17-28-26.png" width=480 />

License
=======

    The MIT License (MIT)

	Copyright (c) 2017 jaydenxiao2016

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
