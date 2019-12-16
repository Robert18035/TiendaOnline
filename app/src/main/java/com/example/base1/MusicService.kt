/*package com.example.base1

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder



class MusicService : Service() {

    private var player: MediaPlayer? = null
    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun onCreate() {
        /*player = LocalPlayback(this, mMusicProvider)
        player!!.setState(PlaybackState.STATE_NONE)
        player!!.setCallback(this)
        player!!.start()*/
    }

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
        player = MediaPlayer.create(this, R.raw.wii)
        player!!.isLooping = true
        player!!.start()
        player!!.setVolume(0.7f, 0.7f)
        return START_NOT_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        player!!.stop()
    }

}*/
