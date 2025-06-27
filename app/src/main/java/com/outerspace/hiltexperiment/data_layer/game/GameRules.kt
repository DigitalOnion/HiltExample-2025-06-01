package com.outerspace.hiltexperiment.data_layer.game

import android.util.Log
import com.outerspace.hiltexperiment.data_layer.data.DictionaryApiService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject

const val allChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

// GameRules
class GameRules @Inject constructor(
    val dictionaryService: DictionaryApiService
) {
    lateinit var scope: CoroutineScope

    val faces = allChars.toList().shuffled()
    fun keyFace(n: Int): String {
        return faces[n % allChars.length ].toString()
    }

    private val buffer = StringBuilder()
    fun appendKey(key: String) {
        buffer.append(key)
    }

    fun content(): String {
        return buffer.toString()
    }

    fun clear() {
        buffer.clear()
    }

    fun evaluateContent() {
        val content = buffer.toString()
        Log.d("GAME CELL", content)
        scope.launch {
            try {
                val entryList = dictionaryService.getDictionaryEntry(content)
                val entry = entryList[0].meanings!![0]?.definitions!![0]?.definition
                Log.d("ENTRY", "Entry : $entry")
            } catch (e: retrofit2.HttpException) {
                Log.d("ENTRY", "Entry : Non existing word.")
            }
        }
    }
}


