package slawomir.kustra.coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import slawomir.kustra.coroutines.utils.logger.Logger
import slawomir.kustra.coroutines.utils.logger.LoggerIml

class CoroutinesActivity : AppCompatActivity() {

    private val tag = "COROUTINES"
    private val logger = LoggerIml()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    private fun getCurrentThread() = Thread.currentThread()

}
