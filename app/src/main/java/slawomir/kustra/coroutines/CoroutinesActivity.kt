package slawomir.kustra.coroutines

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import slawomir.kustra.coroutines.utils.logger.LoggerIml

class CoroutinesActivity : AppCompatActivity() {

    private val logger = LoggerIml()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeTextViewOnMainThread()
    }
    
    /*
     Launches setTextAfterDelay method at main thread
     */
    private fun changeTextViewOnMainThread() {
        GlobalScope.launch(Dispatchers.Main) {
            setTextAfterDelay()
        }
    }

    private suspend fun setTextAfterDelay() {
        logger.log("setTextAfterDelay before delay" + getCurrentThread())
        delay(2000L)
        setHelloMessageOnUiThread()
    }

    private fun setHelloMessageOnUiThread() {
        logger.log("setTextAfterDelay after delay" + getCurrentThread())
        helloMessageTextView.text = getString(R.string.hello_message)
    }

    private fun getCurrentThread() = Thread.currentThread().toString()

}
